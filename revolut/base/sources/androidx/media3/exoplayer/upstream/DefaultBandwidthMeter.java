package androidx.media3.exoplayer.upstream;

import android.content.Context;
import android.os.Handler;
import androidx.media3.common.util.BackgroundExecutor;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.nearby.messages.NearbyMessagesStatusCodes;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.SignedBytes;
import com.youTransactor.uCube.rpc.Constants;
import grl.b4;
import java.util.HashMap;
import java.util.Map;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.jmrtd.PassportService;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.CVCAFile;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultBandwidthMeter implements BandwidthMeter, TransferListener {
    private static DefaultBandwidthMeter singletonInstance;
    private long bitrateEstimate;
    private final Clock clock;
    private final Context context;
    private String countryCode;
    private final BandwidthMeter.EventListener.EventDispatcher eventDispatcher;
    private final ImmutableMap<Integer, Long> initialBitrateEstimates;
    private long lastReportedBitrateEstimate;
    private int networkType;
    private int networkTypeOverride;
    private boolean networkTypeOverrideSet;
    private final boolean resetOnNetworkTypeChange;
    private long sampleBytesTransferred;
    private long sampleStartTimeMs;
    private final SlidingPercentile slidingPercentile;
    private int streamCount;
    private long totalBytesTransferred;
    private long totalElapsedTimeMs;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI = ImmutableList.of(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_2G = ImmutableList.of(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_3G = ImmutableList.of(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_4G = ImmutableList.of(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA = ImmutableList.of(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA = ImmutableList.of(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    public static final class Builder {
        private Clock clock;
        private final Context context;
        private final Map<Integer, Long> initialBitrateEstimates;
        private boolean resetOnNetworkTypeChange;
        private int slidingWindowMaxWeight;

        public Builder(Context context) {
            this.context = context == null ? null : context.getApplicationContext();
            this.slidingWindowMaxWeight = b4.EXPIRED_OR_INVALID_KEY_VALUE;
            this.clock = Clock.DEFAULT;
            this.resetOnNetworkTypeChange = true;
            HashMap map = new HashMap(8);
            this.initialBitrateEstimates = map;
            map.put(0, 1000000L);
            map.put(2, -9223372036854775807L);
            map.put(3, -9223372036854775807L);
            map.put(4, -9223372036854775807L);
            map.put(5, -9223372036854775807L);
            map.put(10, -9223372036854775807L);
            map.put(9, -9223372036854775807L);
            map.put(7, -9223372036854775807L);
        }

        public DefaultBandwidthMeter build() {
            return new DefaultBandwidthMeter(this.context, this.initialBitrateEstimates, this.slidingWindowMaxWeight, this.clock, this.resetOnNetworkTypeChange);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int[] getInitialBitrateCountryGroupAssignment(String str) {
        str.getClass();
        byte b4 = -1;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    b4 = 0;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    b4 = 1;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    b4 = 2;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    b4 = 3;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    b4 = 4;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    b4 = 5;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    b4 = 6;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    b4 = 7;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    b4 = 8;
                }
                break;
            case 2097:
                if (str.equals("AR")) {
                    b4 = 9;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    b4 = 10;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    b4 = 11;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    b4 = 12;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    b4 = 13;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    b4 = 14;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    b4 = 15;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    b4 = 16;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    b4 = 17;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    b4 = 18;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    b4 = 19;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    b4 = Ascii.DC4;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    b4 = Ascii.NAK;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    b4 = Ascii.SYN;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    b4 = Ascii.ETB;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    b4 = Ascii.CAN;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    b4 = Ascii.EM;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    b4 = Ascii.SUB;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    b4 = Ascii.ESC;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    b4 = 28;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    b4 = 29;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    b4 = 30;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    b4 = Ascii.US;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    b4 = 32;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    b4 = Constants.NFC_READER;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    b4 = ISO7816.INS_MSE;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    b4 = 35;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    b4 = ISO7816.INS_CHANGE_CHV;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    b4 = 37;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    b4 = 38;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    b4 = 39;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    b4 = 40;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    b4 = 41;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    b4 = ISO7816.INS_PSO;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    b4 = 43;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    b4 = ISO7816.INS_UNBLOCK_CHV;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    b4 = 45;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    b4 = 46;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    b4 = 47;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    b4 = ISO7816.INS_DECREASE;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    b4 = Constants.INQUIRY;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    b4 = ISO7816.INS_INCREASE;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    b4 = 51;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    b4 = ISO7816.INS_DECREASE_STAMPED;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    b4 = 53;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    b4 = 54;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    b4 = 55;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    b4 = 56;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    b4 = 57;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    b4 = 58;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    b4 = 59;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    b4 = 60;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    b4 = 61;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    b4 = 62;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    b4 = 63;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    b4 = SignedBytes.MAX_POWER_OF_TWO;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    b4 = 65;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    b4 = CVCAFile.CAR_TAG;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    b4 = 67;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    b4 = ISO7816.INS_REHABILITATE_CHV;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    b4 = 69;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    b4 = 70;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    b4 = 71;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    b4 = 72;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    b4 = 73;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    b4 = 74;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    b4 = 75;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    b4 = 76;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    b4 = 77;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    b4 = 78;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    b4 = 79;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    b4 = 80;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    b4 = 81;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    b4 = 82;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    b4 = 83;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    b4 = 84;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    b4 = 85;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    b4 = 86;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    b4 = 87;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    b4 = 88;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    b4 = 89;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    b4 = 90;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    b4 = 91;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    b4 = 92;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    b4 = 93;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    b4 = 94;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    b4 = 95;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    b4 = 96;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    b4 = 97;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    b4 = ISOFileInfo.FCP_BYTE;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    b4 = 99;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    b4 = ISOFileInfo.FMD_BYTE;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    b4 = 101;
                }
                break;
            case 2346:
                if (str.equals("IS")) {
                    b4 = 102;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    b4 = 103;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    b4 = 104;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    b4 = 105;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    b4 = 106;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    b4 = 107;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    b4 = 108;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    b4 = 109;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    b4 = 110;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    b4 = ISOFileInfo.FCI_BYTE;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    b4 = ISO7816.INS_MANAGE_CHANNEL;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    b4 = 113;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    b4 = 114;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    b4 = 115;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    b4 = 116;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    b4 = 117;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    b4 = 118;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    b4 = 119;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    b4 = 120;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    b4 = 121;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    b4 = 122;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    b4 = 123;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    b4 = 124;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    b4 = 125;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    b4 = 126;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    b4 = Ascii.DEL;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    b4 = 128;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    b4 = ISOFileInfo.DATA_BYTES2;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    b4 = 130;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    b4 = ISOFileInfo.FILE_IDENTIFIER;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    b4 = 132;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    b4 = ISOFileInfo.PROP_INFO;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    b4 = 134;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    b4 = ISOFileInfo.FCI_EXT;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    b4 = 136;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    b4 = 137;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    b4 = ISOFileInfo.LCS_BYTE;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    b4 = ISOFileInfo.SECURITY_ATTR_EXP;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    b4 = ISOFileInfo.SECURITY_ATTR_COMPACT;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    b4 = ISOFileInfo.ENV_TEMP_EF;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    b4 = ISOFileInfo.CHANNEL_SECURITY;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    b4 = 143;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    b4 = 144;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    b4 = 145;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    b4 = 146;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    b4 = 147;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    b4 = 148;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    b4 = 149;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    b4 = 150;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    b4 = 151;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    b4 = 152;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    b4 = 153;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    b4 = 154;
                }
                break;
            case 2488:
                if (str.equals("NF")) {
                    b4 = 155;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    b4 = 156;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    b4 = 157;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    b4 = 158;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    b4 = 159;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    b4 = ISOFileInfo.A0;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    b4 = ISOFileInfo.A1;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    b4 = 162;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    b4 = 163;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    b4 = 164;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    b4 = ISOFileInfo.A5;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    b4 = 166;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    b4 = 167;
                }
                break;
            case 2551:
                if (str.equals("PG")) {
                    b4 = 168;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    b4 = 169;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    b4 = 170;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    b4 = ISOFileInfo.AB;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    b4 = 172;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    b4 = 173;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    b4 = 174;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    b4 = 175;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    b4 = ISO7816.INS_READ_BINARY;
                }
                break;
            case 2569:
                if (str.equals("PY")) {
                    b4 = ISO7816.INS_READ_BINARY2;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    b4 = 178;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    b4 = ISO7816.INS_READ_RECORD2;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    b4 = ISO7816.INS_READ_BINARY_STAMPED;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    b4 = 181;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    b4 = ISO7816.INS_READ_RECORD_STAMPED;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    b4 = 183;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    b4 = 184;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    b4 = 185;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    b4 = 186;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    b4 = 187;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    b4 = PSSSigner.TRAILER_IMPLICIT;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    b4 = 189;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    b4 = 190;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    b4 = 191;
                }
                break;
            case 2647:
                if (str.equals("SJ")) {
                    b4 = ISO7816.INS_GET_RESPONSE;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    b4 = 193;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    b4 = ISO7816.INS_ENVELOPE;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    b4 = 195;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    b4 = 196;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    b4 = 197;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    b4 = 198;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    b4 = 199;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    b4 = 200;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    b4 = 201;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    b4 = ISO7816.INS_GET_DATA;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    b4 = 203;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    b4 = 204;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    b4 = 205;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    b4 = 206;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    b4 = 207;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    b4 = ISO7816.INS_WRITE_BINARY;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    b4 = 209;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    b4 = ISO7816.INS_WRITE_RECORD;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    b4 = 211;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    b4 = 212;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    b4 = 213;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    b4 = ISO7816.INS_UPDATE_BINARY;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    b4 = 215;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    b4 = ISO7816.INS_LOAD_KEY_FILE;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    b4 = 217;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    b4 = ISO7816.INS_PUT_DATA;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    b4 = 219;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    b4 = ISO7816.INS_UPDATE_RECORD;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    b4 = 221;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    b4 = 222;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    b4 = 223;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    b4 = ISO7816.INS_CREATE_FILE;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    b4 = 225;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    b4 = ISO7816.INS_APPEND_RECORD;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    b4 = 227;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    b4 = ISO7816.INS_DELETE_FILE;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    b4 = 229;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    b4 = 230;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    b4 = 231;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    b4 = 232;
                }
                break;
            case NearbyMessagesStatusCodes.DISALLOWED_CALLING_CONTEXT /* 2803 */:
                if (str.equals("XK")) {
                    b4 = 233;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    b4 = 234;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    b4 = 235;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    b4 = 236;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    b4 = 237;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    b4 = 238;
                }
                break;
        }
        switch (b4) {
            case 0:
            case 4:
            case 17:
            case 29:
            case 50:
            case 57:
            case 113:
            case 116:
            case 202:
            case Constants.TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE /* 225 */:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 2, 3, 4, 1};
            case 2:
            case Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2 /* 204 */:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 3:
            case 41:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 5:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 6:
            case Constants.TAG_EMVL3_VERSION /* 165 */:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{3, 4, 4, 3, 2, 2};
            case 8:
            case 63:
            case 162:
            case 186:
            case 190:
                return new int[]{4, 2, 2, 2, 2, 2};
            case 9:
                return new int[]{2, 2, 2, 2, 1, 2};
            case 10:
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
            case 61:
            case 93:
            case 102:
            case CertificateBody.profileType /* 127 */:
            case 145:
            case 188:
                return new int[]{0, 0, 0, 0, 0, 2};
            case 12:
                return new int[]{0, 3, 1, 1, 3, 0};
            case 13:
                return new int[]{2, 2, 3, 4, 2, 2};
            case 14:
            case 51:
            case 121:
            case SyslogConstants.LOG_LOCAL2 /* 144 */:
            case 172:
            case 195:
            case BERTags.FLAGS /* 224 */:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case 55:
            case 128:
            case 194:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 16:
            case 106:
            case Constants.TAG_EMV_L1_CHECKSUM /* 214 */:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 2, 4, 2};
            case 19:
                return new int[]{0, 0, 1, 0, 1, 2};
            case 20:
            case 187:
            case Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_1 /* 203 */:
            case 206:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 21:
            case 175:
            case 191:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 3, 1, 3, 4, 2};
            case 23:
            case 84:
            case 92:
            case Constants.EMVTag.TAG_9A_TRANSACTION_DATE /* 154 */:
            case Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION /* 226 */:
            case Constants.TAG_EMV_ICC_CONFIG_VERSION /* 234 */:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 2, 3, 2, 2};
            case 25:
            case ModuleDescriptor.MODULE_VERSION /* 141 */:
            case 177:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 26:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 27:
                return new int[]{3, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 4, 4, 2, 2};
            case 30:
                return new int[]{1, 1, 1, 1, 2, 4};
            case 31:
                return new int[]{3, 2, 1, 1, 2, 2};
            case 32:
                return new int[]{3, 1, 2, 2, 3, 2};
            case 33:
                return new int[]{3, 2, 1, 0, 2, 2};
            case 34:
                return new int[]{1, 2, 3, 3, 2, 2};
            case 35:
            case 42:
                return new int[]{2, 2, 2, 1, 2, 2};
            case 36:
            case Constants.TAG_KSL_ID /* 219 */:
                return new int[]{0, 2, 1, 2, 3, 3};
            case 37:
            case 137:
                return new int[]{3, 3, 2, 2, 2, 2};
            case 38:
                return new int[]{4, 2, 4, 2, 2, 2};
            case 39:
            case 62:
            case ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA /* 134 */:
                return new int[]{3, 4, 3, 3, 2, 2};
            case 40:
                return new int[]{0, 1, 0, 0, 0, 2};
            case 43:
            case 208:
                return new int[]{0, 1, 2, 2, 2, 2};
            case 44:
            case 143:
                return new int[]{4, 3, 3, 4, 2, 2};
            case 45:
                return new int[]{2, 0, 1, 1, 3, 1};
            case 46:
                return new int[]{2, 3, 3, 2, 2, 2};
            case 47:
            case 157:
                return new int[]{2, 4, 4, 4, 2, 2};
            case 48:
            case LDSFile.EF_DG15_TAG /* 111 */:
            case 161:
            case Constants.TAG_SVPP_CHECKSUM /* 210 */:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 49:
                return new int[]{2, 3, 0, 1, 2, 2};
            case 52:
                return new int[]{1, 0, 1, 0, 0, 2};
            case 53:
                return new int[]{0, 0, 2, 0, 1, 2};
            case 54:
                return new int[]{0, 1, 4, 2, 2, 1};
            case 56:
                return new int[]{0, 0, 2, 0, 0, 2};
            case 58:
            case 123:
                return new int[]{3, 4, 4, 4, 2, 2};
            case 59:
            case Constants.TAG_FIRMWARE_VERSION /* 209 */:
                return new int[]{3, 3, 4, 4, 2, 2};
            case 60:
                return new int[]{1, 3, 2, 1, 2, 2};
            case 64:
                return new int[]{0, 0, 0, 0, 1, 0};
            case 65:
                return new int[]{4, 3, 4, 4, 4, 2};
            case 66:
                return new int[]{0, 0, 0, 1, 0, 2};
            case 67:
                return new int[]{3, 2, 2, 3, 2, 2};
            case 68:
            case 155:
            case 192:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 69:
                return new int[]{4, 2, 4, 0, 2, 2};
            case 70:
                return new int[]{0, 2, 2, 0, 2, 2};
            case 71:
                return new int[]{1, 1, 1, 1, 0, 2};
            case 72:
                return new int[]{3, 4, 0, 0, 2, 2};
            case 73:
                return new int[]{1, 1, 3, 2, 2, 2};
            case 74:
                return new int[]{2, 2, 0, 0, 2, 2};
            case 75:
                return new int[]{1, 1, 0, 2, 2, 2};
            case 76:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 77:
                return new int[]{0, 2, 1, 1, 2, 2};
            case 78:
                return new int[]{3, 3, 3, 2, 2, 2};
            case 79:
            case 97:
            case 104:
                return new int[]{0, 2, 0, 1, 2, 2};
            case 80:
            case 130:
                return new int[]{1, 2, 2, 0, 2, 2};
            case 81:
            case 199:
                return new int[]{4, 3, 2, 4, 2, 2};
            case 82:
                return new int[]{3, 4, 4, 2, 2, 2};
            case 83:
                return new int[]{2, 1, 1, 3, 2, 2};
            case 85:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 86:
                return new int[]{2, 1, 2, 1, 2, 2};
            case 87:
                return new int[]{2, 2, 4, 3, 3, 2};
            case 88:
                return new int[]{4, 4, 1, 2, 2, 2};
            case 89:
                return new int[]{3, 1, 1, 3, 2, 2};
            case 90:
                return new int[]{0, 1, 0, 1, 1, 0};
            case 91:
            case ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG /* 115 */:
                return new int[]{1, 0, 0, 0, 0, 2};
            case 94:
                return new int[]{3, 1, 3, 3, 2, 4};
            case 95:
                return new int[]{1, 1, 1, 1, 1, 2};
            case 96:
                return new int[]{1, 2, 2, 3, 4, 2};
            case 98:
                return new int[]{1, 1, 3, 2, 2, 3};
            case 99:
                return new int[]{3, 2, 2, 0, 2, 2};
            case 100:
                return new int[]{3, 2, 3, 2, 2, 2};
            case 101:
                return new int[]{4, 2, 3, 3, 4, 3};
            case 103:
                return new int[]{0, 1, 1, 2, 1, 2};
            case 105:
                return new int[]{2, 4, 3, 1, 2, 2};
            case 107:
                return new int[]{0, 3, 2, 3, 4, 2};
            case LDSFile.EF_DG12_TAG /* 108 */:
                return new int[]{3, 2, 1, 1, 1, 2};
            case LDSFile.EF_DG13_TAG /* 109 */:
                return new int[]{2, 1, 1, 2, 2, 2};
            case LDSFile.EF_DG14_TAG /* 110 */:
                return new int[]{1, 0, 4, 2, 2, 2};
            case 112:
            case 230:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 114:
                return new int[]{0, 2, 2, 4, 4, 4};
            case LDSFile.EF_DG2_TAG /* 117 */:
                return new int[]{2, 1, 2, 2, 3, 2};
            case LDSFile.EF_DG4_TAG /* 118 */:
                return new int[]{1, 2, 1, 3, 2, 2};
            case LDSFile.EF_SOD_TAG /* 119 */:
                return new int[]{3, 1, 1, 2, 2, 2};
            case SyslogConstants.LOG_CLOCK /* 120 */:
                return new int[]{2, 2, 1, 1, 2, 2};
            case 122:
            case 138:
                return new int[]{3, 2, 3, 3, 4, 2};
            case 124:
            case 168:
                return new int[]{4, 3, 3, 3, 2, 2};
            case ISO781611.SMT_TAG /* 125 */:
                return new int[]{0, 1, 0, 1, 0, 2};
            case 126:
                return new int[]{4, 0, 3, 2, 1, 3};
            case 129:
                return new int[]{3, 3, 1, 1, 2, 2};
            case ISO781611.CREATION_DATE_AND_TIME_TAG /* 131 */:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 132:
                return new int[]{2, 0, 0, 1, 3, 2};
            case 133:
                return new int[]{1, 2, 2, 3, 2, 2};
            case 135:
            case 211:
            case Constants.TAG_EMV_L2_CHECKSUM /* 216 */:
            case Constants.TAG_E7_NFC_CARD_DETECT_CONFIGURATION /* 231 */:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 136:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 139:
                return new int[]{2, 0, 2, 2, 2, 2};
            case 140:
                return new int[]{0, 2, 4, 4, 3, 1};
            case 142:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 146:
                return new int[]{3, 1, 0, 2, 2, 2};
            case 147:
                return new int[]{3, 2, 1, 3, 4, 2};
            case 148:
                return new int[]{3, 2, 2, 1, 2, 2};
            case 149:
                return new int[]{2, 4, 4, 4, 3, 2};
            case 150:
                return new int[]{1, 0, 4, 1, 1, 0};
            case ISO7816.TAG_SM_EXPECTED_LENGTH /* 151 */:
            case 232:
                return new int[]{3, 1, 2, 2, 2, 2};
            case SyslogConstants.LOG_LOCAL3 /* 152 */:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 153:
            case Constants.TAG_EMV_NFC_CONFIG_VERSION /* 235 */:
                return new int[]{2, 3, 3, 4, 2, 2};
            case Constants.EMVTag.TAG_9C_TRANSACTION_TYPE /* 156 */:
                return new int[]{3, 4, 2, 1, 2, 2};
            case ISO781611.SMT_DO_DS /* 158 */:
                return new int[]{2, 1, 4, 3, 0, 4};
            case 159:
                return new int[]{0, 0, 3, 0, 0, 2};
            case 160:
                return new int[]{2, 2, 4, 3, 2, 2};
            case Constants.TAG_ACE_LAYER_VERSION /* 163 */:
                return new int[]{0, 0, 1, 2, 4, 2};
            case Constants.TAG_GPI_VERSION /* 164 */:
                return new int[]{2, 3, 1, 2, 4, 2};
            case Constants.TAG_PAYMENT_APP_CLESS_VERSION /* 166 */:
                return new int[]{1, 2, 4, 4, 3, 2};
            case 167:
                return new int[]{2, 2, 3, 1, 2, 2};
            case 169:
                return new int[]{2, 1, 2, 3, 2, 1};
            case 170:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 171:
                return new int[]{1, 0, 2, 2, 4, 4};
            case 173:
                return new int[]{2, 0, 2, 1, 2, 0};
            case 174:
                return new int[]{3, 4, 1, 3, 2, 2};
            case SyslogConstants.LOG_LOCAL6 /* 176 */:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 178:
                return new int[]{1, 4, 4, 4, 4, 2};
            case 179:
                return new int[]{0, 3, 2, 3, 1, 2};
            case 180:
                return new int[]{0, 0, 1, 1, 3, 2};
            case 181:
                return new int[]{1, 0, 0, 1, 2, 2};
            case 182:
                return new int[]{1, 0, 0, 1, 3, 3};
            case 183:
                return new int[]{3, 3, 2, 0, 2, 2};
            case SyslogConstants.LOG_LOCAL7 /* 184 */:
                return new int[]{3, 1, 1, 2, 2, 0};
            case 185:
            case Constants.TAG_EE_SUPPORTED_RPC_ID_LIST /* 238 */:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 189:
                return new int[]{2, 3, 3, 3, 1, 1};
            case Constants.TAG_ATMEL_SERIAL /* 193 */:
                return new int[]{0, 1, 1, 1, 2, 2};
            case 196:
                return new int[]{4, 4, 3, 2, 2, 2};
            case Constants.TAG_BATTERY_STATE /* 197 */:
                return new int[]{2, 2, 3, 4, 4, 2};
            case Constants.TAG_POWER_OFF_TIMEOUT /* 198 */:
                return new int[]{2, 4, 4, 1, 2, 2};
            case 200:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 201:
                return new int[]{2, 3, 2, 1, 2, 2};
            case Constants.TAG_KSN_FORMATS /* 205 */:
                return new int[]{3, 2, 1, 2, 2, 2};
            case Constants.TAG_CF_ENHANCED_SRED_CONFIGURATION /* 207 */:
                return new int[]{3, 4, 1, 0, 2, 2};
            case Constants.TAG_PCI_PED_CHECKSUM /* 212 */:
                return new int[]{3, 1, 1, 1, 2, 2};
            case Constants.TAG_EMV_L1_VERSION /* 213 */:
                return new int[]{3, 2, 4, 3, 2, 2};
            case Constants.TAG_EMV_L2_VERSION /* 215 */:
                return new int[]{2, 4, 1, 0, 2, 2};
            case Constants.TAG_BOOT_LOADER_VERSION /* 217 */:
                return new int[]{0, 0, 0, 0, 0, 0};
            case Constants.TAG_BOOT_LOADER_CHECKSUM /* 218 */:
                return new int[]{3, 4, 2, 1, 3, 2};
            case 220:
                return new int[]{3, 3, 2, 3, 4, 2};
            case 221:
                return new int[]{2, 2, 4, 1, 3, 1};
            case 222:
                return new int[]{2, 1, 1, 2, 1, 2};
            case PassportService.DEFAULT_MAX_BLOCKSIZE /* 223 */:
                return new int[]{1, 2, 3, 4, 3, 2};
            case Constants.TAG_E3_BLUETOOTH_SPECIFIC_DATAS /* 227 */:
                return new int[]{2, 2, 1, 1, 2, 4};
            case Constants.TAG_E4_CUSTOMER_DATA /* 228 */:
                return new int[]{0, 2, 1, 2, 2, 2};
            case Constants.TAG_E5_FUNCTION_LOG_CONFIGURATION /* 229 */:
                return new int[]{0, 0, 1, 2, 2, 2};
            case Constants.TAG_USB_CAPABILITY /* 233 */:
                return new int[]{1, 2, 1, 1, 2, 2};
            case Constants.TAG_OS_VERSION /* 236 */:
                return new int[]{2, 4, 2, 1, 1, 2};
            case Constants.TAG_MPOS_MODULE_STATE /* 237 */:
                return new int[]{4, 4, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    private long getInitialBitrateEstimateForNetworkType(int i) {
        Long lValueOf = this.initialBitrateEstimates.get(Integer.valueOf(i));
        if (lValueOf == null) {
            lValueOf = this.initialBitrateEstimates.get(0);
        } else if (lValueOf.longValue() == -9223372036854775807L) {
            lValueOf = Long.valueOf(getInitialBitrateEstimatesForCountry(this.countryCode, i));
        }
        if (lValueOf == null) {
            lValueOf = 1000000L;
        }
        return lValueOf.longValue();
    }

    private static long getInitialBitrateEstimatesForCountry(String str, int i) {
        int[] initialBitrateCountryGroupAssignment = getInitialBitrateCountryGroupAssignment(Strings.nullToEmpty(str));
        if (i != 2) {
            if (i == 3) {
                return DEFAULT_INITIAL_BITRATE_ESTIMATES_2G.get(initialBitrateCountryGroupAssignment[1]).longValue();
            }
            if (i == 4) {
                return DEFAULT_INITIAL_BITRATE_ESTIMATES_3G.get(initialBitrateCountryGroupAssignment[2]).longValue();
            }
            if (i == 5) {
                return DEFAULT_INITIAL_BITRATE_ESTIMATES_4G.get(initialBitrateCountryGroupAssignment[3]).longValue();
            }
            if (i != 7) {
                if (i == 9) {
                    return DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA.get(initialBitrateCountryGroupAssignment[5]).longValue();
                }
                if (i != 10) {
                    return 1000000L;
                }
                return DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA.get(initialBitrateCountryGroupAssignment[4]).longValue();
            }
        }
        return DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI.get(initialBitrateCountryGroupAssignment[0]).longValue();
    }

    public static synchronized DefaultBandwidthMeter getSingletonInstance(Context context) {
        try {
            if (singletonInstance == null) {
                singletonInstance = new Builder(context).build();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return singletonInstance;
    }

    private static boolean isTransferAtFullNetworkSpeed(DataSpec dataSpec, boolean z) {
        return z && !dataSpec.isFlagSet(8);
    }

    private void maybeNotifyBandwidthSample(int i, long j2, long j3) {
        if (i == 0 && j2 == 0 && j3 == this.lastReportedBitrateEstimate) {
            return;
        }
        this.lastReportedBitrateEstimate = j3;
        this.eventDispatcher.bandwidthSample(i, j2, j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onNetworkTypeChanged(int i) throws Throwable {
        Throwable th10;
        try {
            try {
                int i2 = this.networkType;
                if (i2 != 0) {
                    try {
                        if (!this.resetOnNetworkTypeChange) {
                            return;
                        }
                    } catch (Throwable th11) {
                        th10 = th11;
                    }
                }
                if (this.networkTypeOverrideSet) {
                    i = this.networkTypeOverride;
                }
                if (i2 != i || this.countryCode == null) {
                    this.networkType = i;
                    if (i == 1 || i == 0 || i == 8) {
                        return;
                    }
                    if (this.countryCode == null) {
                        this.countryCode = Util.getCountryCode(this.context);
                    }
                    this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(i);
                    long jElapsedRealtime = this.clock.elapsedRealtime();
                    maybeNotifyBandwidthSample(this.streamCount > 0 ? (int) (jElapsedRealtime - this.sampleStartTimeMs) : 0, this.sampleBytesTransferred, this.bitrateEstimate);
                    this.sampleStartTimeMs = jElapsedRealtime;
                    this.sampleBytesTransferred = 0L;
                    this.totalBytesTransferred = 0L;
                    this.totalElapsedTimeMs = 0L;
                    this.slidingPercentile.reset();
                    return;
                }
                return;
            } catch (Throwable th12) {
                th = th12;
            }
        } catch (Throwable th13) {
            th = th13;
        }
        th10 = th;
        throw th10;
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        Preconditions.checkNotNull(handler);
        Preconditions.checkNotNull(eventListener);
        this.eventDispatcher.addListener(handler, eventListener);
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public synchronized long getBitrateEstimate() {
        return this.bitrateEstimate;
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public TransferListener getTransferListener() {
        return this;
    }

    @Override // androidx.media3.datasource.TransferListener
    public synchronized void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z, int i) {
        if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
            this.sampleBytesTransferred += (long) i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[Catch: all -> 0x0072, TRY_ENTER, TryCatch #1 {all -> 0x0072, blocks: (B:3:0x0001, B:7:0x0009, B:11:0x0011, B:13:0x002e, B:23:0x0060, B:22:0x0055), top: B:38:0x0001 }] */
    @Override // androidx.media3.datasource.TransferListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void onTransferEnd(androidx.media3.datasource.DataSource r11, androidx.media3.datasource.DataSpec r12, boolean r13) throws java.lang.Throwable {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r11 = isTransferAtFullNetworkSpeed(r12, r13)     // Catch: java.lang.Throwable -> L72
            if (r11 != 0) goto L9
            monitor-exit(r10)
            return
        L9:
            int r11 = r10.streamCount     // Catch: java.lang.Throwable -> L72
            r12 = 1
            if (r11 <= 0) goto L10
            r11 = r12
            goto L11
        L10:
            r11 = 0
        L11:
            com.google.common.base.Preconditions.checkState(r11)     // Catch: java.lang.Throwable -> L72
            androidx.media3.common.util.Clock r11 = r10.clock     // Catch: java.lang.Throwable -> L72
            long r0 = r11.elapsedRealtime()     // Catch: java.lang.Throwable -> L72
            long r2 = r10.sampleStartTimeMs     // Catch: java.lang.Throwable -> L72
            long r2 = r0 - r2
            int r5 = (int) r2     // Catch: java.lang.Throwable -> L72
            long r2 = r10.totalElapsedTimeMs     // Catch: java.lang.Throwable -> L72
            long r6 = (long) r5     // Catch: java.lang.Throwable -> L72
            long r2 = r2 + r6
            r10.totalElapsedTimeMs = r2     // Catch: java.lang.Throwable -> L72
            long r2 = r10.totalBytesTransferred     // Catch: java.lang.Throwable -> L72
            long r6 = r10.sampleBytesTransferred     // Catch: java.lang.Throwable -> L72
            long r2 = r2 + r6
            r10.totalBytesTransferred = r2     // Catch: java.lang.Throwable -> L72
            if (r5 <= 0) goto L75
            float r11 = (float) r6     // Catch: java.lang.Throwable -> L72
            r13 = 1174011904(0x45fa0000, float:8000.0)
            float r11 = r11 * r13
            float r13 = (float) r5     // Catch: java.lang.Throwable -> L72
            float r11 = r11 / r13
            androidx.media3.exoplayer.upstream.SlidingPercentile r13 = r10.slidingPercentile     // Catch: java.lang.Throwable -> L72
            double r2 = (double) r6     // Catch: java.lang.Throwable -> L72
            double r2 = java.lang.Math.sqrt(r2)     // Catch: java.lang.Throwable -> L72
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L72
            r13.addSample(r2, r11)     // Catch: java.lang.Throwable -> L72
            long r2 = r10.totalElapsedTimeMs     // Catch: java.lang.Throwable -> L72
            r6 = 2000(0x7d0, double:9.88E-321)
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 >= 0) goto L55
            long r2 = r10.totalBytesTransferred     // Catch: java.lang.Throwable -> L51
            r6 = 524288(0x80000, double:2.590327E-318)
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 < 0) goto L60
            goto L55
        L51:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L7d
        L55:
            androidx.media3.exoplayer.upstream.SlidingPercentile r11 = r10.slidingPercentile     // Catch: java.lang.Throwable -> L72
            r13 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11.getPercentile(r13)     // Catch: java.lang.Throwable -> L72
            long r2 = (long) r11     // Catch: java.lang.Throwable -> L72
            r10.bitrateEstimate = r2     // Catch: java.lang.Throwable -> L72
        L60:
            long r6 = r10.sampleBytesTransferred     // Catch: java.lang.Throwable -> L72
            long r8 = r10.bitrateEstimate     // Catch: java.lang.Throwable -> L72
            r4 = r10
            r4.maybeNotifyBandwidthSample(r5, r6, r8)     // Catch: java.lang.Throwable -> L6f
            r4.sampleStartTimeMs = r0     // Catch: java.lang.Throwable -> L6f
            r0 = 0
            r4.sampleBytesTransferred = r0     // Catch: java.lang.Throwable -> L6f
            goto L76
        L6f:
            r0 = move-exception
        L70:
            r11 = r0
            goto L7d
        L72:
            r0 = move-exception
            r4 = r10
            goto L70
        L75:
            r4 = r10
        L76:
            int r11 = r4.streamCount     // Catch: java.lang.Throwable -> L6f
            int r11 = r11 - r12
            r4.streamCount = r11     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r10)
            return
        L7d:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6f
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.upstream.DefaultBandwidthMeter.onTransferEnd(androidx.media3.datasource.DataSource, androidx.media3.datasource.DataSpec, boolean):void");
    }

    @Override // androidx.media3.datasource.TransferListener
    public void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z) {
    }

    @Override // androidx.media3.datasource.TransferListener
    public synchronized void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z) {
        try {
            if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
                if (this.streamCount == 0) {
                    this.sampleStartTimeMs = this.clock.elapsedRealtime();
                }
                this.streamCount++;
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public void removeEventListener(BandwidthMeter.EventListener eventListener) {
        this.eventDispatcher.removeListener(eventListener);
    }

    private DefaultBandwidthMeter(Context context, Map<Integer, Long> map, int i, Clock clock, boolean z) {
        this.context = context == null ? null : context.getApplicationContext();
        this.initialBitrateEstimates = ImmutableMap.copyOf((Map) map);
        this.eventDispatcher = new BandwidthMeter.EventListener.EventDispatcher();
        this.slidingPercentile = new SlidingPercentile(i);
        this.clock = clock;
        this.resetOnNetworkTypeChange = z;
        if (context == null) {
            this.networkType = 0;
            this.bitrateEstimate = 1000000L;
            return;
        }
        NetworkTypeObserver networkTypeObserver = NetworkTypeObserver.getInstance(context);
        int networkType = networkTypeObserver.getNetworkType();
        this.networkType = networkType;
        this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(networkType);
        networkTypeObserver.register(new x4.a(this), BackgroundExecutor.get());
    }
}
