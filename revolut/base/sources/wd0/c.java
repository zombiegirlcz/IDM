package wd0;

import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.h;
import qlm.j1;
import qlm.n0;
import qlm.t0;
import qlm.v1;
import wal.f;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0081\b\u0018\u0000 <2\u00020\u0001:\u0002\u0005\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0004R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\b\u001a\u0004\b\u000b\u0010\u0004R \u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0012\u0010\b\u001a\u0004\b\n\u0010\u0011R \u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u0012\u0004\b\u0016\u0010\b\u001a\u0004\b\u0015\u0010\u0004R \u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\u0019\u0010\b\u001a\u0004\b\u0018\u0010\u0004R\"\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0006\u0012\u0004\b\u001d\u0010\b\u001a\u0004\b\u001c\u0010\u0004R\"\u0010#\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b\"\u0010\b\u001a\u0004\b\u000f\u0010!R\"\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u0006\u0012\u0004\b%\u0010\b\u001a\u0004\b\u0014\u0010\u0004R\"\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010\u0006\u0012\u0004\b(\u0010\b\u001a\u0004\b\u001b\u0010\u0004R.\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010+\u0012\u0004\b-\u0010\b\u001a\u0004\b$\u0010,R.\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010+\u0012\u0004\b/\u0010\b\u001a\u0004\b'\u0010,R\"\u00106\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u00102\u0012\u0004\b5\u0010\b\u001a\u0004\b3\u00104R\"\u0010;\u001a\u0004\u0018\u0001078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u00108\u0012\u0004\b:\u0010\b\u001a\u0004\b\u001f\u00109¨\u0006="}, d2 = {"Lwd0/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getCode$annotations", "()V", "code", "b", "e", "getGenericLocalizedName$annotations", "genericLocalizedName", "", "c", "I", "()I", "getDecimals$annotations", "decimals", "d", "l", "getType$annotations", "type", "j", "getSymbol$annotations", "symbol", "f", "k", "getTicker$annotations", "ticker", "g", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "getDisplayDecimals$annotations", "displayDecimals", "h", "getDisplayPattern$annotations", "displayPattern", "i", "getOverrideDisplayIconCurrencyCode$annotations", "overrideDisplayIconCurrencyCode", "", "Ljava/util/Map;", "()Ljava/util/Map;", "getSpecificLocalizedNames$annotations", "specificLocalizedNames", "getSpecificLocalizedSymbols$annotations", "specificLocalizedSymbols", "", "Ljava/lang/Boolean;", "m", "()Ljava/lang/Boolean;", "isStablecoin$annotations", "isStablecoin", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "getSettlementDate$annotations", "settlementDate", "Companion", "core_currency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Lazy[] f296439n;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("genericLocalizedName")
    @NotNull
    private final String genericLocalizedName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("decimals")
    private final int decimals;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("symbol")
    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("ticker")
    private final String ticker;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("displayDecimals")
    private final Integer displayDecimals;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("displayPattern")
    private final String displayPattern;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("overrideDisplayIconCurrencyCode")
    private final String overrideDisplayIconCurrencyCode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("specificLocalizedNames")
    private final Map<String, String> specificLocalizedNames;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("specificLocalizedSymbols")
    private final Map<String, String> specificLocalizedSymbols;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("isStablecoin")
    private final Boolean isStablecoin;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("settlementDate")
    private final Long settlementDate;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f296448a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f296448a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.core.currency.impl.dto.CurrencyConfigDto", aVar, 13);
            pluginGeneratedSerialDescriptor.j("code", false);
            pluginGeneratedSerialDescriptor.j("genericLocalizedName", false);
            pluginGeneratedSerialDescriptor.j("decimals", false);
            pluginGeneratedSerialDescriptor.j("type", false);
            pluginGeneratedSerialDescriptor.j("symbol", false);
            pluginGeneratedSerialDescriptor.j("ticker", false);
            pluginGeneratedSerialDescriptor.j("displayDecimals", false);
            pluginGeneratedSerialDescriptor.j("displayPattern", false);
            pluginGeneratedSerialDescriptor.j("overrideDisplayIconCurrencyCode", false);
            pluginGeneratedSerialDescriptor.j("specificLocalizedNames", false);
            pluginGeneratedSerialDescriptor.j("specificLocalizedSymbols", false);
            pluginGeneratedSerialDescriptor.j("isStablecoin", false);
            pluginGeneratedSerialDescriptor.j("settlementDate", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = c.f296439n;
            v1 v1Var = v1.f247718a;
            n0 n0Var = n0.f247680a;
            return new KSerializer[]{v1Var, v1Var, n0Var, v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(n0Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c((KSerializer) lazyArr[9].getValue()), nlm.a.c((KSerializer) lazyArr[10].getValue()), nlm.a.c(h.f247648a), nlm.a.c(t0.f247706a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            String str;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = c.f296439n;
            dVarBeginStructure.getClass();
            String str2 = null;
            Long l2 = null;
            Map map = null;
            Map map2 = null;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            Boolean bool = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String str3 = null;
            Integer num = null;
            String str4 = null;
            int i = 0;
            boolean z = true;
            int iDecodeIntElement = 0;
            while (z) {
                Lazy[] lazyArr2 = lazyArr;
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        str = strDecodeStringElement;
                        z = false;
                        lazyArr = lazyArr2;
                        strDecodeStringElement = str;
                        break;
                    case 0:
                        i |= 1;
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        lazyArr = lazyArr2;
                        break;
                    case 1:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        lazyArr = lazyArr2;
                        break;
                    case 2:
                        iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i |= 4;
                        lazyArr = lazyArr2;
                        break;
                    case 3:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        lazyArr = lazyArr2;
                        break;
                    case 4:
                        strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        lazyArr = lazyArr2;
                        break;
                    case 5:
                        str = strDecodeStringElement;
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str3);
                        i |= 32;
                        lazyArr = lazyArr2;
                        strDecodeStringElement = str;
                        break;
                    case 6:
                        str = strDecodeStringElement;
                        num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, n0.f247680a, num);
                        i |= 64;
                        lazyArr = lazyArr2;
                        strDecodeStringElement = str;
                        break;
                    case 7:
                        str = strDecodeStringElement;
                        str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str4);
                        i |= 128;
                        lazyArr = lazyArr2;
                        strDecodeStringElement = str;
                        break;
                    case 8:
                        str = strDecodeStringElement;
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, v1.f247718a, str2);
                        i |= 256;
                        lazyArr = lazyArr2;
                        strDecodeStringElement = str;
                        break;
                    case 9:
                        str = strDecodeStringElement;
                        map = (Map) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr2[9].getValue(), map);
                        i |= 512;
                        lazyArr = lazyArr2;
                        strDecodeStringElement = str;
                        break;
                    case 10:
                        str = strDecodeStringElement;
                        map2 = (Map) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, (mlm.b) lazyArr2[10].getValue(), map2);
                        i |= 1024;
                        lazyArr = lazyArr2;
                        strDecodeStringElement = str;
                        break;
                    case 11:
                        str = strDecodeStringElement;
                        bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, h.f247648a, bool);
                        i |= 2048;
                        lazyArr = lazyArr2;
                        strDecodeStringElement = str;
                        break;
                    case 12:
                        str = strDecodeStringElement;
                        l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, t0.f247706a, l2);
                        i |= 4096;
                        lazyArr = lazyArr2;
                        strDecodeStringElement = str;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            Boolean bool2 = bool;
            return new c(i, strDecodeStringElement, strDecodeStringElement2, iDecodeIntElement, strDecodeStringElement3, strDecodeStringElement4, str3, num, str4, str2, map, map2, bool2, l2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            c value = (c) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            c.n(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: wd0.c$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f296448a;
        }
    }

    static {
        k kVar = k.PUBLICATION;
        f296439n = new Lazy[]{null, null, null, null, null, null, null, null, null, j.c(kVar, new f(19)), j.c(kVar, new f(20)), null, null};
    }

    public /* synthetic */ c(int i, String str, String str2, int i2, String str3, String str4, String str5, Integer num, String str6, String str7, Map map, Map map2, Boolean bool, Long l2) {
        if (4095 != (i & 4095)) {
            j1.f(a.f296448a.getDescriptor(), i, 4095);
            throw null;
        }
        this.code = str;
        this.genericLocalizedName = str2;
        this.decimals = i2;
        this.type = str3;
        this.symbol = str4;
        this.ticker = str5;
        this.displayDecimals = num;
        this.displayPattern = str6;
        this.overrideDisplayIconCurrencyCode = str7;
        this.specificLocalizedNames = map;
        this.specificLocalizedSymbols = map2;
        this.isStablecoin = bool;
        if ((i & 4096) == 0) {
            this.settlementDate = null;
        } else {
            this.settlementDate = l2;
        }
    }

    public static final /* synthetic */ void n(c cVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, cVar.code);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, cVar.genericLocalizedName);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, cVar.decimals);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, cVar.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, cVar.symbol);
        v1 v1Var = v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, cVar.ticker);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, n0.f247680a, cVar.displayDecimals);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, cVar.displayPattern);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, v1Var, cVar.overrideDisplayIconCurrencyCode);
        Lazy[] lazyArr = f296439n;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), cVar.specificLocalizedNames);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, (mlm.h) lazyArr[10].getValue(), cVar.specificLocalizedSymbols);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, h.f247648a, cVar.isStablecoin);
        if (!compositeEncoder.d(serialDescriptor) && cVar.settlementDate == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, t0.f247706a, cVar.settlementDate);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDecimals() {
        return this.decimals;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getDisplayDecimals() {
        return this.displayDecimals;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDisplayPattern() {
        return this.displayPattern;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getGenericLocalizedName() {
        return this.genericLocalizedName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.code, cVar.code) && Intrinsics.f(this.genericLocalizedName, cVar.genericLocalizedName) && this.decimals == cVar.decimals && Intrinsics.f(this.type, cVar.type) && Intrinsics.f(this.symbol, cVar.symbol) && Intrinsics.f(this.ticker, cVar.ticker) && Intrinsics.f(this.displayDecimals, cVar.displayDecimals) && Intrinsics.f(this.displayPattern, cVar.displayPattern) && Intrinsics.f(this.overrideDisplayIconCurrencyCode, cVar.overrideDisplayIconCurrencyCode) && Intrinsics.f(this.specificLocalizedNames, cVar.specificLocalizedNames) && Intrinsics.f(this.specificLocalizedSymbols, cVar.specificLocalizedSymbols) && Intrinsics.f(this.isStablecoin, cVar.isStablecoin) && Intrinsics.f(this.settlementDate, cVar.settlementDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getOverrideDisplayIconCurrencyCode() {
        return this.overrideDisplayIconCurrencyCode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getSettlementDate() {
        return this.settlementDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Map getSpecificLocalizedNames() {
        return this.specificLocalizedNames;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(j6.a.b(this.decimals, p.a.c(this.code.hashCode() * 31, 31, this.genericLocalizedName), 31), 31, this.type), 31, this.symbol);
        String str = this.ticker;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.displayDecimals;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.displayPattern;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.overrideDisplayIconCurrencyCode;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.specificLocalizedNames;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.specificLocalizedSymbols;
        int iHashCode6 = (iHashCode5 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Boolean bool = this.isStablecoin;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.settlementDate;
        return iHashCode7 + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Map getSpecificLocalizedSymbols() {
        return this.specificLocalizedSymbols;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTicker() {
        return this.ticker;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Boolean getIsStablecoin() {
        return this.isStablecoin;
    }
}
