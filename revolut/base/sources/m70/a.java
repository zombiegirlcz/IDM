package m70;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import android.util.Size;
import android.util.SizeF;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import com.revolut.feature.uipersonalisation.api.AbstractThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.AlexKDeclaration;
import com.revolut.feature.uipersonalisation.api.ApexThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.BusinessThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.ChristmasThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.ColoursThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.CryptoThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.Cyberpunk2ThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.CyberpunkThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.DogsDeclaration;
import com.revolut.feature.uipersonalisation.api.ExploreThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.FlowersDeclaration;
import com.revolut.feature.uipersonalisation.api.GeometricDeclaration;
import com.revolut.feature.uipersonalisation.api.GlassThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.GlowThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.HalloweenThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.HorizonThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.JuniorGlowThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.LavaThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.LegacyDefaultThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.LightsThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.LinesThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.MetalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.MinimalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.ParticlesThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.PremiumThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.PrideThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.PrivateThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.PsychedelicDeclaration;
import com.revolut.feature.uipersonalisation.api.RevolutXThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.SnakeThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.TravertineDeclaration;
import com.revolut.feature.uipersonalisation.api.UKLandscapesDeclaration;
import com.revolut.feature.uipersonalisation.api.UltraThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.UpbeatThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.VelvetDeclaration;
import com.revolut.feature.uipersonalisation.api.ZodiacThemeDeclaration;
import com.youTransactor.uCube.rpc.Constants;
import efm.c0;
import efm.r;
import efm.w;
import efm.y;
import java.io.EOFException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import jhi.c;
import kfm.o;
import kg.u;
import kg.v;
import km2.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import lfm.e;
import mfm.f;
import mg.n1;
import org.bouncycastle.asn1.BERTags;
import org.jmrtd.PassportService;
import org.jmrtd.cbeff.StandardBiometricHeader;
import pq0.d;
import tfm.q5;
import v25.g;
import zfm.h;
import zim.h2;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final void a(t0 t0Var) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
    }

    public static void b(Object obj2, String str) {
        if (obj2 == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void c(t0 t0Var) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
    }

    public static final void d(t0 t0Var) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
    }

    public static final r e(r rVar, Function2 nullContentHandler, Function2 consumeErrors) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(nullContentHandler, "nullContentHandler");
        Intrinsics.checkNotNullParameter(consumeErrors, "consumeErrors");
        return f(rVar, new c(), nullContentHandler, consumeErrors);
    }

    public static final r f(r rVar, Function3 contentMapper, Function2 nullContentHandler, Function2 consumeErrors) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(contentMapper, "contentMapper");
        Intrinsics.checkNotNullParameter(nullContentHandler, "nullContentHandler");
        Intrinsics.checkNotNullParameter(consumeErrors, "consumeErrors");
        r rVarLift = rVar.lift(new v4l.c(contentMapper, nullContentHandler, consumeErrors));
        Intrinsics.checkNotNullExpressionValue(rVarLift, "lift(...)");
        return rVarLift;
    }

    public static /* synthetic */ r g(r rVar, Function2 function2, Function2 function22, int i) {
        if ((i & 1) != 0) {
            function2 = v4l.a.f286137a;
        }
        if ((i & 2) != 0) {
            function22 = new d(9);
        }
        return e(rVar, function2, function22);
    }

    public static /* synthetic */ r h(r rVar, Function3 function3, Function2 function2, Function2 function22, int i) {
        if ((i & 2) != 0) {
            function2 = v4l.b.f286138a;
        }
        if ((i & 4) != 0) {
            function22 = new g(20);
        }
        return f(rVar, function3, function2, function22);
    }

    public static final Spanned i(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Spanned spannedFromHtml = Html.fromHtml(str, 0);
        Intrinsics.checkNotNullExpressionValue(spannedFromHtml, "fromHtml(...)");
        return spannedFromHtml;
    }

    public static final j j(GlobalThemeDeclaration globalThemeDeclaration) {
        Intrinsics.checkNotNullParameter(globalThemeDeclaration, "<this>");
        if (globalThemeDeclaration instanceof AbstractThemeDeclaration) {
            return j.DEFAULT;
        }
        if (globalThemeDeclaration instanceof LinesThemeDeclaration) {
            return j.LINES;
        }
        if (globalThemeDeclaration instanceof LegacyDefaultThemeDeclaration) {
            return j.DEFAULT;
        }
        if (globalThemeDeclaration instanceof CyberpunkThemeDeclaration) {
            return j.CYBERPUNK;
        }
        if (globalThemeDeclaration instanceof HalloweenThemeDeclaration) {
            return j.HALLOWEEN;
        }
        if (globalThemeDeclaration instanceof ChristmasThemeDeclaration) {
            return j.CHRISTMAS;
        }
        if (globalThemeDeclaration instanceof GlassThemeDeclaration) {
            return j.GLASS;
        }
        if (globalThemeDeclaration instanceof ColoursThemeDeclaration) {
            return j.COLOURS;
        }
        if (globalThemeDeclaration instanceof MinimalThemeDeclaration) {
            return j.MINIMAL;
        }
        if (globalThemeDeclaration instanceof ParticlesThemeDeclaration) {
            return j.PARTICLES;
        }
        if (globalThemeDeclaration instanceof RevolutXThemeDeclaration) {
            return j.REVOLUT_X;
        }
        if (globalThemeDeclaration instanceof GlowThemeDeclaration) {
            return j.GLOW;
        }
        if (globalThemeDeclaration instanceof PrideThemeDeclaration) {
            return j.PRIDE;
        }
        if (globalThemeDeclaration instanceof BusinessThemeDeclaration) {
            return j.BUSINESS;
        }
        if (globalThemeDeclaration instanceof Cyberpunk2ThemeDeclaration) {
            return j.CYBERPUNK2;
        }
        if (globalThemeDeclaration instanceof PremiumThemeDeclaration) {
            return j.PREMIUM;
        }
        if (globalThemeDeclaration instanceof UltraThemeDeclaration) {
            return j.ULTRA;
        }
        if (globalThemeDeclaration instanceof PrivateThemeDeclaration) {
            return j.PRIVATE;
        }
        if (globalThemeDeclaration instanceof MetalThemeDeclaration) {
            return j.METAL;
        }
        if (globalThemeDeclaration instanceof ZodiacThemeDeclaration) {
            return j.ZODIAC;
        }
        if (globalThemeDeclaration instanceof SnakeThemeDeclaration) {
            return j.SNAKE;
        }
        if (globalThemeDeclaration instanceof LightsThemeDeclaration) {
            return j.LIGHTS;
        }
        if (globalThemeDeclaration instanceof ApexThemeDeclaration) {
            return j.APEX;
        }
        if (globalThemeDeclaration instanceof HorizonThemeDeclaration) {
            return j.HORIZON;
        }
        if (globalThemeDeclaration instanceof ExploreThemeDeclaration) {
            return j.EXPLORE;
        }
        if (globalThemeDeclaration instanceof CryptoThemeDeclaration) {
            return j.CRYPTO;
        }
        if (globalThemeDeclaration instanceof LavaThemeDeclaration) {
            return j.LAVA;
        }
        if (globalThemeDeclaration instanceof UpbeatThemeDeclaration) {
            return j.UPBEAT;
        }
        if (globalThemeDeclaration instanceof AlexKDeclaration) {
            return j.ALEX_K;
        }
        if (globalThemeDeclaration instanceof GeometricDeclaration) {
            return j.GEOMETRIC;
        }
        if (globalThemeDeclaration instanceof DogsDeclaration) {
            return j.DOGS;
        }
        if (globalThemeDeclaration instanceof PsychedelicDeclaration) {
            return j.PSYCHEDELIC;
        }
        if (globalThemeDeclaration instanceof VelvetDeclaration) {
            return j.VELVET;
        }
        if (globalThemeDeclaration instanceof FlowersDeclaration) {
            return j.FLOWERS;
        }
        if (globalThemeDeclaration instanceof JuniorGlowThemeDeclaration) {
            return j.JUNIOR_GLOW;
        }
        if (globalThemeDeclaration instanceof TravertineDeclaration) {
            return j.TRAVERTINE;
        }
        if (globalThemeDeclaration instanceof UKLandscapesDeclaration) {
            return j.UK_LANDSCAPES;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static HashMap k() {
        HashMap map = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        arrayList.add("BB");
        arrayList.add("BM");
        arrayList.add("BS");
        arrayList.add("CA");
        arrayList.add("DM");
        arrayList.add("DO");
        arrayList.add("GD");
        arrayList.add("GU");
        arrayList.add("JM");
        arrayList.add("KN");
        arrayList.add("KY");
        arrayList.add("LC");
        arrayList.add("MP");
        arrayList.add("MS");
        arrayList.add("PR");
        arrayList.add("SX");
        arrayList.add("TC");
        arrayList.add("TT");
        arrayList.add("VC");
        arrayList.add("VG");
        arrayList.add("VI");
        map.put(1, arrayList);
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add("RU");
        arrayList2.add("KZ");
        ArrayList arrayListN = v0.a.n(36, map, v0.a.n(34, map, v0.a.n(33, map, v0.a.n(32, map, v0.a.n(31, map, v0.a.n(30, map, v0.a.n(27, map, v0.a.n(20, map, v0.a.n(7, map, arrayList2, 1, "EG"), 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"), 2, "IT");
        arrayListN.add("VA");
        map.put(39, arrayListN);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add("RO");
        ArrayList arrayListN2 = v0.a.n(43, map, v0.a.n(41, map, v0.a.n(40, map, arrayList3, 1, "CH"), 1, "AT"), 4, "GB");
        arrayListN2.add("GG");
        arrayListN2.add("IM");
        arrayListN2.add("JE");
        map.put(44, arrayListN2);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add("DK");
        ArrayList arrayListN3 = v0.a.n(46, map, v0.a.n(45, map, arrayList4, 1, "SE"), 2, "NO");
        arrayListN3.add("SJ");
        map.put(47, arrayListN3);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("PL");
        ArrayList arrayListN4 = v0.a.n(60, map, v0.a.n(58, map, v0.a.n(57, map, v0.a.n(56, map, v0.a.n(55, map, v0.a.n(54, map, v0.a.n(53, map, v0.a.n(52, map, v0.a.n(51, map, v0.a.n(49, map, v0.a.n(48, map, arrayList5, 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"), 3, "AU");
        arrayListN4.add("CC");
        arrayListN4.add("CX");
        map.put(61, arrayListN4);
        ArrayList arrayList6 = new ArrayList(1);
        arrayList6.add("ID");
        ArrayList arrayListN5 = v0.a.n(211, map, v0.a.n(98, map, v0.a.n(95, map, v0.a.n(94, map, v0.a.n(93, map, v0.a.n(92, map, v0.a.n(91, map, v0.a.n(90, map, v0.a.n(86, map, v0.a.n(84, map, v0.a.n(82, map, v0.a.n(81, map, v0.a.n(66, map, v0.a.n(65, map, v0.a.n(64, map, v0.a.n(63, map, v0.a.n(62, map, arrayList6, 1, "PH"), 1, "NZ"), 1, "SG"), 1, "TH"), 1, "JP"), 1, "KR"), 1, "VN"), 1, "CN"), 1, "TR"), 1, "IN"), 1, "PK"), 1, "AF"), 1, "LK"), 1, "MM"), 1, "IR"), 1, "SS"), 2, "MA");
        arrayListN5.add("EH");
        map.put(Integer.valueOf(Constants.TAG_PCI_PED_CHECKSUM), arrayListN5);
        ArrayList arrayList7 = new ArrayList(1);
        arrayList7.add("DZ");
        ArrayList arrayListN6 = v0.a.n(261, map, v0.a.n(260, map, v0.a.n(258, map, v0.a.n(StandardBiometricHeader.JTC1_SC37_FORMAT_OWNER_VALUE, map, v0.a.n(256, map, v0.a.n(255, map, v0.a.n(254, map, v0.a.n(Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION, map, v0.a.n(Constants.TAG_FC_SPEED_MODE, map, v0.a.n(Constants.TAG_FB_CHARGING_STATUS, map, v0.a.n(Constants.TAG_SUPPORTED_LOCALE_LIST, map, v0.a.n(Constants.TAG_RESOURCE_FILE_VERSION, map, v0.a.n(Constants.TAG_FULL_SVPP_IDENTIFICATION, map, v0.a.n(Constants.TAG_BLE_FIRMWARE_VERSION, map, v0.a.n(246, map, v0.a.n(Constants.TAG_F5, map, v0.a.n(Constants.TAG_F4, map, v0.a.n(Constants.TAG_F3_BUILD_CONFIGURATION, map, v0.a.n(242, map, v0.a.n(Constants.TAG_TRANSACTION_DATA, map, v0.a.n(240, map, v0.a.n(239, map, v0.a.n(Constants.TAG_EE_SUPPORTED_RPC_ID_LIST, map, v0.a.n(Constants.TAG_MPOS_MODULE_STATE, map, v0.a.n(Constants.TAG_OS_VERSION, map, v0.a.n(Constants.TAG_EMV_NFC_CONFIG_VERSION, map, v0.a.n(Constants.TAG_EMV_ICC_CONFIG_VERSION, map, v0.a.n(Constants.TAG_USB_CAPABILITY, map, v0.a.n(232, map, v0.a.n(Constants.TAG_E7_NFC_CARD_DETECT_CONFIGURATION, map, v0.a.n(230, map, v0.a.n(Constants.TAG_E5_FUNCTION_LOG_CONFIGURATION, map, v0.a.n(Constants.TAG_E4_CUSTOMER_DATA, map, v0.a.n(Constants.TAG_E3_BLUETOOTH_SPECIFIC_DATAS, map, v0.a.n(Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION, map, v0.a.n(Constants.TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE, map, v0.a.n(BERTags.FLAGS, map, v0.a.n(PassportService.DEFAULT_MAX_BLOCKSIZE, map, v0.a.n(222, map, v0.a.n(221, map, v0.a.n(220, map, v0.a.n(Constants.TAG_BOOT_LOADER_CHECKSUM, map, v0.a.n(Constants.TAG_EMV_L2_CHECKSUM, map, v0.a.n(Constants.TAG_EMV_L1_VERSION, map, arrayList7, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"), 2, "RE");
        arrayListN6.add("YT");
        map.put(262, arrayListN6);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("ZW");
        ArrayList arrayListN7 = v0.a.n(269, map, v0.a.n(268, map, v0.a.n(267, map, v0.a.n(266, map, v0.a.n(265, map, v0.a.n(264, map, v0.a.n(263, map, arrayList8, 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"), 2, "SH");
        arrayListN7.add("TA");
        map.put(290, arrayListN7);
        ArrayList arrayList9 = new ArrayList(1);
        arrayList9.add("ER");
        ArrayList arrayListN8 = v0.a.n(357, map, v0.a.n(356, map, v0.a.n(355, map, v0.a.n(354, map, v0.a.n(353, map, v0.a.n(352, map, v0.a.n(351, map, v0.a.n(350, map, v0.a.n(299, map, v0.a.n(298, map, v0.a.n(297, map, v0.a.n(291, map, arrayList9, 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"), 2, "FI");
        arrayListN8.add("AX");
        map.put(358, arrayListN8);
        ArrayList arrayList10 = new ArrayList(1);
        arrayList10.add("BG");
        ArrayList arrayListN9 = v0.a.n(509, map, v0.a.n(508, map, v0.a.n(507, map, v0.a.n(506, map, v0.a.n(505, map, v0.a.n(504, map, v0.a.n(503, map, v0.a.n(502, map, v0.a.n(501, map, v0.a.n(500, map, v0.a.n(423, map, v0.a.n(421, map, v0.a.n(420, map, v0.a.n(389, map, v0.a.n(387, map, v0.a.n(386, map, v0.a.n(385, map, v0.a.n(383, map, v0.a.n(382, map, v0.a.n(381, map, v0.a.n(380, map, v0.a.n(378, map, v0.a.n(377, map, v0.a.n(376, map, v0.a.n(375, map, v0.a.n(374, map, v0.a.n(373, map, v0.a.n(372, map, v0.a.n(371, map, v0.a.n(370, map, v0.a.n(359, map, arrayList10, 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"), 3, "GP");
        arrayListN9.add("BL");
        arrayListN9.add("MF");
        map.put(590, arrayListN9);
        ArrayList arrayList11 = new ArrayList(1);
        arrayList11.add("BO");
        ArrayList arrayListN10 = v0.a.n(598, map, v0.a.n(597, map, v0.a.n(596, map, v0.a.n(595, map, v0.a.n(594, map, v0.a.n(593, map, v0.a.n(592, map, v0.a.n(591, map, arrayList11, 1, "GY"), 1, "EC"), 1, "GF"), 1, "PY"), 1, "MQ"), 1, "SR"), 1, "UY"), 2, "CW");
        arrayListN10.add("BQ");
        map.put(599, arrayListN10);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add("TL");
        map.put(998, v0.a.n(996, map, v0.a.n(995, map, v0.a.n(994, map, v0.a.n(993, map, v0.a.n(992, map, v0.a.n(979, map, v0.a.n(977, map, v0.a.n(976, map, v0.a.n(975, map, v0.a.n(974, map, v0.a.n(973, map, v0.a.n(972, map, v0.a.n(971, map, v0.a.n(970, map, v0.a.n(968, map, v0.a.n(967, map, v0.a.n(966, map, v0.a.n(965, map, v0.a.n(964, map, v0.a.n(963, map, v0.a.n(962, map, v0.a.n(961, map, v0.a.n(960, map, v0.a.n(888, map, v0.a.n(886, map, v0.a.n(883, map, v0.a.n(882, map, v0.a.n(881, map, v0.a.n(880, map, v0.a.n(878, map, v0.a.n(870, map, v0.a.n(856, map, v0.a.n(855, map, v0.a.n(853, map, v0.a.n(852, map, v0.a.n(850, map, v0.a.n(808, map, v0.a.n(800, map, v0.a.n(692, map, v0.a.n(691, map, v0.a.n(690, map, v0.a.n(689, map, v0.a.n(688, map, v0.a.n(687, map, v0.a.n(686, map, v0.a.n(685, map, v0.a.n(683, map, v0.a.n(682, map, v0.a.n(681, map, v0.a.n(680, map, v0.a.n(679, map, v0.a.n(678, map, v0.a.n(677, map, v0.a.n(676, map, v0.a.n(675, map, v0.a.n(674, map, v0.a.n(673, map, v0.a.n(672, map, v0.a.n(670, map, arrayList12, 1, "NF"), 1, "BN"), 1, "NR"), 1, "PG"), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, "LB"), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, "KG"), 1, "UZ"));
        return map;
    }

    public static final String l(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() > 0) {
            return str;
        }
        return null;
    }

    public static c0 m(Callable callable) {
        try {
            c0 c0Var = (c0) callable.call();
            if (c0Var != null) {
                return c0Var;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th10) {
            throw h.d(th10);
        }
    }

    public static h2 n(CallableMemberDescriptor callableMemberDescriptor, Function0 function0) {
        if (function0 != null) {
            return new h2(callableMemberDescriptor, function0);
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
    }

    public static final String o(t0 t0Var) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        String strLineSeparator = System.lineSeparator();
        Intrinsics.checkNotNullExpressionValue(strLineSeparator, "lineSeparator(...)");
        return strLineSeparator;
    }

    public static void p(c0 c0Var) {
        if (c0Var == null) {
            throw new NullPointerException("scheduler == null");
        }
    }

    public static u q(qg.a aVar) {
        boolean z;
        try {
            try {
                aVar.A();
                z = false;
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                return (u) n1.B.c(aVar);
            } catch (EOFException e2) {
                e = e2;
                if (z) {
                    return v.f183890a;
                }
                throw new JsonSyntaxException(e);
            }
        } catch (MalformedJsonException e4) {
            throw new JsonSyntaxException(e4);
        } catch (IOException e5) {
            throw new JsonIOException(e5);
        } catch (NumberFormatException e6) {
            throw new JsonSyntaxException(e6);
        }
    }

    public static final void r(Bundle bundle, String key, Object obj2) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj2 == null) {
            bundle.putString(key, null);
            return;
        }
        if (obj2 instanceof Boolean) {
            bundle.putBoolean(key, ((Boolean) obj2).booleanValue());
            return;
        }
        if (obj2 instanceof Byte) {
            bundle.putByte(key, ((Number) obj2).byteValue());
            return;
        }
        if (obj2 instanceof Character) {
            bundle.putChar(key, ((Character) obj2).charValue());
            return;
        }
        if (obj2 instanceof Double) {
            bundle.putDouble(key, ((Number) obj2).doubleValue());
            return;
        }
        if (obj2 instanceof Float) {
            bundle.putFloat(key, ((Number) obj2).floatValue());
            return;
        }
        if (obj2 instanceof Integer) {
            bundle.putInt(key, ((Number) obj2).intValue());
            return;
        }
        if (obj2 instanceof Long) {
            bundle.putLong(key, ((Number) obj2).longValue());
            return;
        }
        if (obj2 instanceof Short) {
            bundle.putShort(key, ((Number) obj2).shortValue());
            return;
        }
        if (obj2 instanceof Bundle) {
            bundle.putBundle(key, (Bundle) obj2);
            return;
        }
        if (obj2 instanceof CharSequence) {
            bundle.putCharSequence(key, (CharSequence) obj2);
            return;
        }
        if (obj2 instanceof Parcelable) {
            bundle.putParcelable(key, (Parcelable) obj2);
            return;
        }
        if (obj2 instanceof boolean[]) {
            bundle.putBooleanArray(key, (boolean[]) obj2);
            return;
        }
        if (obj2 instanceof byte[]) {
            bundle.putByteArray(key, (byte[]) obj2);
            return;
        }
        if (obj2 instanceof char[]) {
            bundle.putCharArray(key, (char[]) obj2);
            return;
        }
        if (obj2 instanceof double[]) {
            bundle.putDoubleArray(key, (double[]) obj2);
            return;
        }
        if (obj2 instanceof float[]) {
            bundle.putFloatArray(key, (float[]) obj2);
            return;
        }
        if (obj2 instanceof int[]) {
            bundle.putIntArray(key, (int[]) obj2);
            return;
        }
        if (obj2 instanceof long[]) {
            bundle.putLongArray(key, (long[]) obj2);
            return;
        }
        if (obj2 instanceof short[]) {
            bundle.putShortArray(key, (short[]) obj2);
            return;
        }
        if (!(obj2 instanceof Object[])) {
            if (obj2 instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) obj2);
                return;
            }
            if (obj2 instanceof Binder) {
                bundle.putBinder(key, (IBinder) obj2);
                return;
            } else if (obj2 instanceof Size) {
                bundle.putSize(key, (Size) obj2);
                return;
            } else {
                if (!(obj2 instanceof SizeF)) {
                    throw new b(obj2.getClass().getCanonicalName(), key);
                }
                bundle.putSizeF(key, (SizeF) obj2);
                return;
            }
        }
        Class<?> componentType = obj2.getClass().getComponentType();
        if (componentType == null) {
            throw new IllegalArgumentException("Component type must be not null for an array");
        }
        if (Parcelable.class.isAssignableFrom(componentType)) {
            bundle.putParcelableArray(key, (Parcelable[]) obj2);
            return;
        }
        if (String.class.isAssignableFrom(componentType)) {
            bundle.putStringArray(key, (String[]) obj2);
        } else if (CharSequence.class.isAssignableFrom(componentType)) {
            bundle.putCharSequenceArray(key, (CharSequence[]) obj2);
        } else {
            if (!Serializable.class.isAssignableFrom(componentType)) {
                throw new b(componentType.getCanonicalName(), key);
            }
            bundle.putSerializable(key, (Serializable) obj2);
        }
    }

    public static long s(String str) {
        int i;
        int length = str.length();
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (length < 0) {
            throw new IllegalArgumentException(a0.d.g(length, 0, "endIndex < beginIndex: ", " < ").toString());
        }
        if (length > str.length()) {
            StringBuilder sbW = a0.d.w(length, "endIndex > string.length: ", " > ");
            sbW.append(str.length());
            throw new IllegalArgumentException(sbW.toString().toString());
        }
        long j2 = 0;
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                j2++;
            } else {
                if (cCharAt < 2048) {
                    i = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i = 3;
                } else {
                    int i3 = i2 + 1;
                    char cCharAt2 = i3 < length ? str.charAt(i3) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j2++;
                        i2 = i3;
                    } else {
                        j2 += (long) 4;
                        i2 += 2;
                    }
                }
                j2 += (long) i;
            }
            i2++;
        }
        return j2;
    }

    public static final void t(t0 t0Var) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
    }

    public static void u(Throwable th10) {
        if (th10 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th10);
        }
        if (th10 instanceof ThreadDeath) {
            throw ((ThreadDeath) th10);
        }
        if (th10 instanceof LinkageError) {
            throw ((LinkageError) th10);
        }
    }

    public static boolean v(w wVar, y yVar, o oVar) {
        if (!(wVar instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) wVar).call();
            if (objCall == null) {
                e.a(yVar);
                return true;
            }
            try {
                Object objApply = oVar.apply(objCall);
                f.b(objApply, "The mapper returned a null ObservableSource");
                w wVar2 = (w) objApply;
                if (!(wVar2 instanceof Callable)) {
                    wVar2.subscribe(yVar);
                    return true;
                }
                try {
                    Object objCall2 = ((Callable) wVar2).call();
                    if (objCall2 == null) {
                        e.a(yVar);
                        return true;
                    }
                    q5 q5Var = new q5(yVar, objCall2);
                    yVar.onSubscribe(q5Var);
                    q5Var.run();
                    return true;
                } catch (Throwable th10) {
                    u(th10);
                    e.d(th10, yVar);
                    return true;
                }
            } catch (Throwable th11) {
                u(th11);
                e.d(th11, yVar);
                return true;
            }
        } catch (Throwable th12) {
            u(th12);
            e.d(th12, yVar);
            return true;
        }
    }

    public static void w(u uVar, qg.c cVar) {
        n1.B.d(cVar, uVar);
    }
}
