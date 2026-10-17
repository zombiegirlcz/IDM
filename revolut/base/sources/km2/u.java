package km2;

import aw0.s8;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.wallet.WalletConstants;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.youTransactor.uCube.rpc.Constants;
import em2.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import up0.y;
import up0.z;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public final class u {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f185709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f185710b;

    public static final class a {
        private a() {
        }
    }

    public u() {
        final int i = 0;
        this.f185709a = yhm.j.b(new Function0(this) { // from class: km2.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f185708b;

            {
                this.f185708b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 10;
                switch (i) {
                    case 0:
                        em2.b bVar = em2.b.PARTICLES;
                        List<Pair> listK = zhm.v.k(new Pair("bg552", y.BG552), new Pair("bg553", y.BG553), new Pair("bg554", y.BG554), new Pair("bg555", y.BG555), new Pair("bg556", y.BG556), new Pair("bg557", y.BG557), new Pair("bg558", y.BG558), new Pair("bg559", y.BG559), new Pair("bg560", y.BG560), new Pair("bg561", y.BG561), new Pair("bg562", y.BG562));
                        ArrayList arrayList = new ArrayList(zhm.w.t(listK, 10));
                        for (Pair pair : listK) {
                            String str = (String) pair.f186385a;
                            y yVar = (y) pair.f186386b;
                            List list = z.f281800a;
                            NavBarWithContainerBackground.ImageBackground imageBackgroundA = z.a(yVar, uc0.b.a("mobile/media_library/v5/wallpaper_animations/animations", "particles_theme_glow"));
                            Image e = imageBackgroundA.getE();
                            Intrinsics.i(e, "null cannot be cast to non-null type com.revolut.core.ui_kit_core.displayers.image.models.LottieImage");
                            LottieImage lottieImage = (LottieImage) e;
                            UrlImage urlImage = new UrlImage(p.a.p("https://assets.revolut.com/mobile/media_library/v5/wallpaper_animations/thumbnail/", str, "@3x.png"), p.a.p("https://assets.revolut.com/mobile/media_library/v5/wallpaper_animations/thumbnail_dark/", str, "@3x.png"), null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524284);
                            Color d = imageBackgroundA.getD();
                            if (d == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            arrayList.add(new em2.c(str, lottieImage, urlImage, d, imageBackgroundA.getD()));
                        }
                        Pair pairD = nim.a.D(bVar, arrayList);
                        em2.b bVar2 = em2.b.SAVINGS_CHALLENGE;
                        ArrayList arrayList2 = new ArrayList(12);
                        int i3 = 539;
                        while (true) {
                            u uVar = this.f185708b;
                            if (i3 < 551) {
                                arrayList2.add(u.b(uVar, i3, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                i3++;
                            } else {
                                Unit unit = Unit.f186387a;
                                Pair pairD2 = nim.a.D(bVar2, arrayList2);
                                em2.b bVar3 = em2.b.ABSTRACT;
                                t tVar = t.DARK;
                                Pair pairD3 = nim.a.D(bVar3, zhm.v.k(u.b(uVar, 1, true, tVar, null, 72), u.b(uVar, LDSFile.EF_DG15_TAG, true, tVar, null, 104), u.b(uVar, 31, true, tVar, null, 104), u.b(uVar, 16, true, tVar, null, 104), u.b(uVar, 90, true, tVar, null, 104), u.b(uVar, 46, true, tVar, null, 104), u.b(uVar, 112, true, tVar, null, 104), u.b(uVar, 11, true, tVar, null, 104), u.b(uVar, 113, true, tVar, null, 104), u.b(uVar, 87, true, tVar, null, 104), u.b(uVar, 91, true, tVar, null, 104), u.b(uVar, 20, true, tVar, null, 104), u.b(uVar, 89, true, tVar, null, 104), u.b(uVar, 114, true, tVar, null, 104), u.b(uVar, 86, true, tVar, null, 104), u.b(uVar, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG, true, tVar, null, 104), u.b(uVar, 88, true, tVar, null, 72), u.b(uVar, 5, true, tVar, null, 104), u.a(uVar, 83, tVar, null, 28)));
                                Pair pairD4 = nim.a.D(em2.b.ABSTRACT_LITE, zhm.v.k(u.b(uVar, LDSFile.EF_DG15_TAG, true, tVar, null, 104), u.b(uVar, 112, true, tVar, null, 104), u.b(uVar, 113, true, tVar, null, 104), u.b(uVar, 114, true, tVar, null, 104), u.b(uVar, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG, true, tVar, null, 104)));
                                em2.b bVar4 = em2.b.GLOW;
                                String strC = u.c(5);
                                String strC2 = u.c(6);
                                Pair pairD5 = nim.a.D(bVar4, zhm.v.k(new em2.f(a0.d.r(strC2, "/wallpaper_videos/full_video_tall/bg190.mp4"), a0.d.r(strC, "/wallpaper_videos/full_video_tall/bg190_h264.mp4"), a0.d.r(strC2, "/wallpaper_videos/thumbnail/bg190@2x.png"), a0.d.r(strC, "/wallpaper_videos/thumbnail/bg190@2x.png")), u.b(uVar, 191, true, tVar, null, 72), u.b(uVar, 192, true, tVar, null, 72), u.b(uVar, Constants.TAG_ATMEL_SERIAL, true, tVar, null, 72), u.b(uVar, 194, true, tVar, null, 72), u.b(uVar, 195, true, tVar, null, 72), u.b(uVar, 196, true, tVar, null, 72), u.b(uVar, Constants.TAG_BATTERY_STATE, true, tVar, null, 72), u.b(uVar, Constants.TAG_POWER_OFF_TIMEOUT, true, tVar, null, 72), u.b(uVar, 199, true, tVar, null, 72), u.b(uVar, 200, true, tVar, null, 72)));
                                em2.b bVar5 = em2.b.CYBERPUNK_2;
                                ArrayList arrayList3 = new ArrayList(11);
                                int i5 = Constants.TAG_OS_VERSION;
                                char c2 = 236;
                                while (true) {
                                    int i6 = Constants.TAG_BLE_FIRMWARE_VERSION;
                                    if (i5 < 247) {
                                        arrayList3.add(u.b(uVar, i5, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                        i5++;
                                        c2 = c2;
                                        i2 = i2;
                                    } else {
                                        int i21 = i2;
                                        Unit unit2 = Unit.f186387a;
                                        Pair pairD6 = nim.a.D(bVar5, arrayList3);
                                        em2.b bVar6 = em2.b.PREMIUM;
                                        char c3 = 433;
                                        ArrayList arrayList4 = new ArrayList(11);
                                        int i22 = 433;
                                        while (true) {
                                            int i32 = OnfidoActivity.RESULT_EXIT_BACKGROUND_STOP;
                                            if (i22 < 444) {
                                                ArrayList arrayList5 = arrayList4;
                                                arrayList5.add(u.b(uVar, i22, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                i22++;
                                                arrayList4 = arrayList5;
                                                i6 = i6;
                                                c3 = 433;
                                            } else {
                                                int i33 = i6;
                                                Unit unit3 = Unit.f186387a;
                                                Pair pairD7 = nim.a.D(bVar6, arrayList4);
                                                em2.b bVar7 = em2.b.ULTRA;
                                                ArrayList arrayList6 = new ArrayList(11);
                                                while (i32 < 455) {
                                                    ArrayList arrayList7 = arrayList6;
                                                    int i43 = i32;
                                                    arrayList7.add(u.b(uVar, i43, true, t.DARK, null, 72));
                                                    i32 = i43 + 1;
                                                    arrayList6 = arrayList7;
                                                }
                                                ArrayList arrayList8 = arrayList6;
                                                Unit unit4 = Unit.f186387a;
                                                Pair pairD8 = nim.a.D(bVar7, arrayList8);
                                                em2.b bVar8 = em2.b.PRIVATE;
                                                ArrayList arrayList9 = new ArrayList(1);
                                                arrayList9.add(u.b(uVar, 466, true, t.LIGHT_DARK, null, SyslogConstants.LOG_CLOCK));
                                                Pair pairD9 = nim.a.D(bVar8, arrayList9);
                                                em2.b bVar9 = em2.b.METAL;
                                                ArrayList arrayList10 = new ArrayList(11);
                                                int i59 = 455;
                                                while (i59 < 466) {
                                                    ArrayList arrayList11 = arrayList10;
                                                    int i66 = i59;
                                                    arrayList11.add(u.b(uVar, i66, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                    i59 = i66 + 1;
                                                    arrayList10 = arrayList11;
                                                    pairD9 = pairD9;
                                                }
                                                Pair pair2 = pairD9;
                                                ArrayList arrayList12 = arrayList10;
                                                Unit unit5 = Unit.f186387a;
                                                Pair pairD10 = nim.a.D(bVar9, arrayList12);
                                                em2.b bVar10 = em2.b.ZODIAC;
                                                int i74 = 258;
                                                ArrayList arrayList13 = new ArrayList(12);
                                                int i92 = 258;
                                                while (true) {
                                                    int i96 = 270;
                                                    if (i92 < 270) {
                                                        ArrayList arrayList14 = arrayList13;
                                                        arrayList14.add(u.b(uVar, i92, true, t.NONE, null, 72));
                                                        i92++;
                                                        arrayList13 = arrayList14;
                                                        i74 = i74;
                                                        pairD = pairD;
                                                        pairD10 = pairD10;
                                                    } else {
                                                        Pair pair3 = pairD10;
                                                        Pair pair4 = pairD;
                                                        Unit unit6 = Unit.f186387a;
                                                        Pair pairD11 = nim.a.D(bVar10, arrayList13);
                                                        em2.b bVar11 = em2.b.LIGHTS;
                                                        ArrayList arrayList15 = new ArrayList(11);
                                                        int i99 = i33;
                                                        for (int i100 = i74; i99 < i100; i100 = 258) {
                                                            ArrayList arrayList16 = arrayList15;
                                                            int i101 = i99;
                                                            arrayList16.add(u.b(uVar, i101, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                            i99 = i101 + 1;
                                                            arrayList15 = arrayList16;
                                                            i96 = i96;
                                                        }
                                                        ArrayList arrayList17 = arrayList15;
                                                        Unit unit7 = Unit.f186387a;
                                                        Pair pairD12 = nim.a.D(bVar11, arrayList17);
                                                        em2.b bVar12 = em2.b.SNAKE;
                                                        ArrayList arrayList18 = new ArrayList(12);
                                                        while (i96 < 281) {
                                                            ArrayList arrayList19 = arrayList18;
                                                            int i102 = i96;
                                                            arrayList19.add(u.b(uVar, i102, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                            i96 = i102 + 1;
                                                            arrayList18 = arrayList19;
                                                            pairD11 = pairD11;
                                                        }
                                                        Pair pair5 = pairD11;
                                                        ArrayList arrayList20 = arrayList18;
                                                        Unit unit8 = Unit.f186387a;
                                                        Pair pairD13 = nim.a.D(bVar12, arrayList20);
                                                        em2.b bVar13 = em2.b.APEX;
                                                        ArrayList arrayList21 = new ArrayList(11);
                                                        t tVar2 = t.NONE;
                                                        arrayList21.add(u.b(uVar, 350, true, tVar2, null, SyslogConstants.LOG_CLOCK));
                                                        arrayList21.add(u.b(uVar, 351, true, tVar2, null, SyslogConstants.LOG_CLOCK));
                                                        int i103 = 307;
                                                        while (true) {
                                                            int i104 = 316;
                                                            if (i103 < 316) {
                                                                arrayList21.add(u.b(uVar, i103, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                                i103++;
                                                            } else {
                                                                Unit unit9 = Unit.f186387a;
                                                                Pair pairD14 = nim.a.D(bVar13, arrayList21);
                                                                em2.b bVar14 = em2.b.HORIZON;
                                                                int i105 = 327;
                                                                ArrayList arrayList22 = new ArrayList(11);
                                                                int i106 = 327;
                                                                while (true) {
                                                                    int i107 = 338;
                                                                    if (i106 < 338) {
                                                                        ArrayList arrayList23 = arrayList22;
                                                                        arrayList23.add(u.b(uVar, i106, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                                        i106++;
                                                                        arrayList22 = arrayList23;
                                                                        i105 = i105;
                                                                        pairD14 = pairD14;
                                                                        pairD3 = pairD3;
                                                                        i104 = i104;
                                                                    } else {
                                                                        Pair pair6 = pairD14;
                                                                        Pair pair7 = pairD3;
                                                                        Unit unit10 = Unit.f186387a;
                                                                        Pair pairD15 = nim.a.D(bVar14, arrayList22);
                                                                        em2.b bVar15 = em2.b.EXPLORE;
                                                                        ArrayList arrayList24 = new ArrayList(11);
                                                                        int i108 = i104;
                                                                        for (int i109 = i105; i108 < i109; i109 = 327) {
                                                                            ArrayList arrayList25 = arrayList24;
                                                                            int i110 = i108;
                                                                            arrayList25.add(u.b(uVar, i110, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                                            i108 = i110 + 1;
                                                                            arrayList24 = arrayList25;
                                                                            i107 = i107;
                                                                        }
                                                                        ArrayList arrayList26 = arrayList24;
                                                                        Unit unit11 = Unit.f186387a;
                                                                        Pair pairD16 = nim.a.D(bVar15, arrayList26);
                                                                        em2.b bVar16 = em2.b.CRYPTO;
                                                                        ArrayList arrayList27 = new ArrayList(12);
                                                                        while (i107 < 350) {
                                                                            ArrayList arrayList28 = arrayList27;
                                                                            int i111 = i107;
                                                                            arrayList28.add(u.b(uVar, i111, true, t.LIGHT, null, SyslogConstants.LOG_CLOCK));
                                                                            i107 = i111 + 1;
                                                                            arrayList27 = arrayList28;
                                                                            pairD15 = pairD15;
                                                                        }
                                                                        Pair pair8 = pairD15;
                                                                        ArrayList arrayList29 = arrayList27;
                                                                        Unit unit12 = Unit.f186387a;
                                                                        Pair pairD17 = nim.a.D(bVar16, arrayList29);
                                                                        em2.b bVar17 = em2.b.LINES;
                                                                        t tVar3 = t.NONE;
                                                                        em2.f fVarB = u.b(uVar, Constants.EMVTag.TAG_9C_TRANSACTION_TYPE, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB2 = u.b(uVar, 157, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB3 = u.b(uVar, ISO781611.SMT_DO_DS, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB4 = u.b(uVar, 159, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB5 = u.b(uVar, 160, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB6 = u.b(uVar, 161, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB7 = u.b(uVar, 162, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB8 = u.b(uVar, Constants.TAG_ACE_LAYER_VERSION, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB9 = u.b(uVar, Constants.TAG_GPI_VERSION, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB10 = u.b(uVar, Constants.TAG_EMVL3_VERSION, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB11 = u.b(uVar, Constants.TAG_PAYMENT_APP_CLESS_VERSION, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB12 = u.b(uVar, 167, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB13 = u.b(uVar, 168, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB14 = u.b(uVar, 169, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB15 = u.b(uVar, 170, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB16 = u.b(uVar, 171, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB17 = u.b(uVar, 172, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB18 = u.b(uVar, 173, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB19 = u.b(uVar, 174, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB20 = u.b(uVar, 175, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.e[] eVarArr = new em2.e[20];
                                                                        eVarArr[0] = fVarB;
                                                                        eVarArr[1] = fVarB2;
                                                                        eVarArr[2] = fVarB3;
                                                                        eVarArr[3] = fVarB4;
                                                                        eVarArr[4] = fVarB5;
                                                                        eVarArr[5] = fVarB6;
                                                                        eVarArr[6] = fVarB7;
                                                                        eVarArr[7] = fVarB8;
                                                                        eVarArr[8] = fVarB9;
                                                                        eVarArr[9] = fVarB10;
                                                                        eVarArr[i21] = fVarB11;
                                                                        eVarArr[11] = fVarB12;
                                                                        eVarArr[12] = fVarB13;
                                                                        eVarArr[13] = fVarB14;
                                                                        eVarArr[14] = fVarB15;
                                                                        eVarArr[15] = fVarB16;
                                                                        eVarArr[16] = fVarB17;
                                                                        eVarArr[17] = fVarB18;
                                                                        eVarArr[18] = fVarB19;
                                                                        eVarArr[19] = fVarB20;
                                                                        Pair pairD18 = nim.a.D(bVar17, zhm.v.k(eVarArr));
                                                                        em2.b bVar18 = em2.b.GLASS;
                                                                        t tVar4 = t.DARK;
                                                                        em2.f fVarB21 = u.b(uVar, 3, true, tVar4, null, 104);
                                                                        em2.f fVarB22 = u.b(uVar, 137, true, tVar4, null, 104);
                                                                        em2.f fVarB23 = u.b(uVar, 17, true, tVar4, null, 104);
                                                                        em2.f fVarB24 = u.b(uVar, ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA, true, tVar4, null, 104);
                                                                        em2.f fVarB25 = u.b(uVar, 133, true, tVar4, null, 104);
                                                                        em2.f fVarB26 = u.b(uVar, 9, true, tVar4, null, 104);
                                                                        em2.f fVarB27 = u.b(uVar, 18, true, tVar4, null, 104);
                                                                        em2.f fVarB28 = u.b(uVar, 15, true, tVar4, null, 104);
                                                                        em2.f fVarB29 = u.b(uVar, 135, true, tVar4, null, 104);
                                                                        em2.f fVarB30 = u.b(uVar, 138, true, tVar4, null, 104);
                                                                        em2.f fVarB31 = u.b(uVar, 4, true, tVar4, null, 104);
                                                                        em2.f fVarB32 = u.b(uVar, 136, true, tVar4, null, 104);
                                                                        em2.f fVarB33 = u.b(uVar, 132, true, tVar4, null, 104);
                                                                        em2.d dVarA = u.a(uVar, 28, tVar3, null, 28);
                                                                        em2.d dVarA2 = u.a(uVar, 40, tVar3, null, 28);
                                                                        em2.f fVarB34 = u.b(uVar, 59, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB35 = u.b(uVar, 60, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.d dVarA3 = u.a(uVar, 6, tVar3, null, 28);
                                                                        em2.d dVarA4 = u.a(uVar, 39, tVar3, null, 28);
                                                                        em2.d dVarA5 = u.a(uVar, 35, tVar3, null, 28);
                                                                        em2.d dVarA6 = u.a(uVar, 43, tVar3, null, 28);
                                                                        em2.d dVarA7 = u.a(uVar, 37, tVar3, null, 28);
                                                                        em2.d dVarA8 = u.a(uVar, 38, tVar3, null, 28);
                                                                        em2.d dVarA9 = u.a(uVar, 12, tVar3, null, 28);
                                                                        em2.e[] eVarArr2 = new em2.e[24];
                                                                        eVarArr2[0] = fVarB21;
                                                                        eVarArr2[1] = fVarB22;
                                                                        eVarArr2[2] = fVarB23;
                                                                        eVarArr2[3] = fVarB24;
                                                                        eVarArr2[4] = fVarB25;
                                                                        eVarArr2[5] = fVarB26;
                                                                        eVarArr2[6] = fVarB27;
                                                                        eVarArr2[7] = fVarB28;
                                                                        eVarArr2[8] = fVarB29;
                                                                        eVarArr2[9] = fVarB30;
                                                                        eVarArr2[i21] = fVarB31;
                                                                        eVarArr2[11] = fVarB32;
                                                                        eVarArr2[12] = fVarB33;
                                                                        eVarArr2[13] = dVarA;
                                                                        eVarArr2[14] = dVarA2;
                                                                        eVarArr2[15] = fVarB34;
                                                                        eVarArr2[16] = fVarB35;
                                                                        eVarArr2[17] = dVarA3;
                                                                        eVarArr2[18] = dVarA4;
                                                                        eVarArr2[19] = dVarA5;
                                                                        eVarArr2[20] = dVarA6;
                                                                        eVarArr2[21] = dVarA7;
                                                                        eVarArr2[22] = dVarA8;
                                                                        eVarArr2[23] = dVarA9;
                                                                        Pair pairD19 = nim.a.D(bVar18, zhm.v.k(eVarArr2));
                                                                        em2.b bVar19 = em2.b.CYBERPUNK;
                                                                        em2.d dVarA10 = u.a(uVar, 92, tVar3, null, 28);
                                                                        em2.d dVarA11 = u.a(uVar, 93, tVar3, null, 28);
                                                                        em2.d dVarA12 = u.a(uVar, 94, tVar3, null, 28);
                                                                        em2.d dVarA13 = u.a(uVar, 95, tVar3, null, 28);
                                                                        em2.d dVarA14 = u.a(uVar, 97, tVar3, null, 28);
                                                                        em2.d dVarA15 = u.a(uVar, 98, tVar3, null, 28);
                                                                        em2.d dVarA16 = u.a(uVar, 96, tVar3, null, 28);
                                                                        em2.d dVarA17 = u.a(uVar, 100, tVar3, null, 28);
                                                                        em2.d dVarA18 = u.a(uVar, 101, tVar3, null, 28);
                                                                        em2.d dVarA19 = u.a(uVar, 102, tVar3, null, 28);
                                                                        em2.d dVarA20 = u.a(uVar, 103, tVar3, null, 28);
                                                                        em2.d dVarA21 = u.a(uVar, 104, tVar3, null, 28);
                                                                        em2.d dVarA22 = u.a(uVar, 105, tVar3, null, 28);
                                                                        em2.d dVarA23 = u.a(uVar, 107, tVar3, null, 28);
                                                                        em2.f fVarB36 = u.b(uVar, 99, true, tVar3, null, 72);
                                                                        em2.f fVarB37 = u.b(uVar, 106, true, tVar3, null, 72);
                                                                        em2.f fVarB38 = u.b(uVar, LDSFile.EF_DG12_TAG, true, tVar3, null, 72);
                                                                        em2.f fVarB39 = u.b(uVar, LDSFile.EF_DG13_TAG, true, tVar3, null, 72);
                                                                        em2.f fVarB40 = u.b(uVar, LDSFile.EF_DG14_TAG, true, tVar3, null, 72);
                                                                        em2.e[] eVarArr3 = new em2.e[19];
                                                                        eVarArr3[0] = dVarA10;
                                                                        eVarArr3[1] = dVarA11;
                                                                        eVarArr3[2] = dVarA12;
                                                                        eVarArr3[3] = dVarA13;
                                                                        eVarArr3[4] = dVarA14;
                                                                        eVarArr3[5] = dVarA15;
                                                                        eVarArr3[6] = dVarA16;
                                                                        eVarArr3[7] = dVarA17;
                                                                        eVarArr3[8] = dVarA18;
                                                                        eVarArr3[9] = dVarA19;
                                                                        eVarArr3[i21] = dVarA20;
                                                                        eVarArr3[11] = dVarA21;
                                                                        eVarArr3[12] = dVarA22;
                                                                        eVarArr3[13] = dVarA23;
                                                                        eVarArr3[14] = fVarB36;
                                                                        eVarArr3[15] = fVarB37;
                                                                        eVarArr3[16] = fVarB38;
                                                                        eVarArr3[17] = fVarB39;
                                                                        eVarArr3[18] = fVarB40;
                                                                        Pair pairD20 = nim.a.D(bVar19, zhm.v.k(eVarArr3));
                                                                        em2.b bVar20 = em2.b.NATURE;
                                                                        em2.d dVarA24 = u.a(uVar, 47, tVar3, null, 28);
                                                                        em2.d dVarA25 = u.a(uVar, 48, tVar3, null, 28);
                                                                        em2.d dVarA26 = u.a(uVar, 49, tVar3, null, 28);
                                                                        em2.d dVarA27 = u.a(uVar, 53, tVar3, null, 28);
                                                                        em2.d dVarA28 = u.a(uVar, 56, tVar3, null, 28);
                                                                        em2.d dVarA29 = u.a(uVar, 54, tVar3, null, 28);
                                                                        em2.d dVarA30 = u.a(uVar, 55, tVar3, null, 28);
                                                                        em2.d dVarA31 = u.a(uVar, 44, tVar3, null, 28);
                                                                        em2.d dVarA32 = u.a(uVar, 45, tVar3, null, 28);
                                                                        em2.d dVarA33 = u.a(uVar, 50, tVar3, null, 28);
                                                                        em2.d dVarA34 = u.a(uVar, 51, tVar3, null, 28);
                                                                        em2.d dVarA35 = u.a(uVar, 52, tVar3, null, 28);
                                                                        em2.d dVarA36 = u.a(uVar, 57, tVar3, null, 28);
                                                                        em2.d dVarA37 = u.a(uVar, 58, tVar3, null, 28);
                                                                        em2.e[] eVarArr4 = new em2.e[14];
                                                                        eVarArr4[0] = dVarA24;
                                                                        eVarArr4[1] = dVarA25;
                                                                        eVarArr4[2] = dVarA26;
                                                                        eVarArr4[3] = dVarA27;
                                                                        eVarArr4[4] = dVarA28;
                                                                        eVarArr4[5] = dVarA29;
                                                                        eVarArr4[6] = dVarA30;
                                                                        eVarArr4[7] = dVarA31;
                                                                        eVarArr4[8] = dVarA32;
                                                                        eVarArr4[9] = dVarA33;
                                                                        eVarArr4[i21] = dVarA34;
                                                                        eVarArr4[11] = dVarA35;
                                                                        eVarArr4[12] = dVarA36;
                                                                        eVarArr4[13] = dVarA37;
                                                                        Pair pairD21 = nim.a.D(bVar20, zhm.v.k(eVarArr4));
                                                                        em2.b bVar21 = em2.b.COLOURS;
                                                                        em2.d dVarA38 = u.a(uVar, 84, tVar4, null, 28);
                                                                        em2.d dVarA39 = u.a(uVar, 67, tVar4, null, 28);
                                                                        em2.d dVarA40 = u.a(uVar, 85, tVar4, null, 28);
                                                                        em2.d dVarA41 = u.a(uVar, 63, tVar4, null, 28);
                                                                        em2.d dVarA42 = u.a(uVar, 65, tVar4, null, 28);
                                                                        em2.d dVarA43 = u.a(uVar, 68, tVar4, null, 28);
                                                                        em2.d dVarA44 = u.a(uVar, 74, tVar4, null, 28);
                                                                        em2.d dVarA45 = u.a(uVar, 69, tVar4, null, 28);
                                                                        em2.d dVarA46 = u.a(uVar, 73, tVar4, null, 28);
                                                                        em2.d dVarA47 = u.a(uVar, 66, tVar4, null, 28);
                                                                        em2.d dVarA48 = u.a(uVar, 72, tVar4, null, 28);
                                                                        em2.d dVarA49 = u.a(uVar, 70, tVar4, null, 28);
                                                                        em2.d dVarA50 = u.a(uVar, 71, tVar4, null, 28);
                                                                        em2.d dVarA51 = u.a(uVar, 64, tVar4, null, 28);
                                                                        em2.e[] eVarArr5 = new em2.e[14];
                                                                        eVarArr5[0] = dVarA38;
                                                                        eVarArr5[1] = dVarA39;
                                                                        eVarArr5[2] = dVarA40;
                                                                        eVarArr5[3] = dVarA41;
                                                                        eVarArr5[4] = dVarA42;
                                                                        eVarArr5[5] = dVarA43;
                                                                        eVarArr5[6] = dVarA44;
                                                                        eVarArr5[7] = dVarA45;
                                                                        eVarArr5[8] = dVarA46;
                                                                        eVarArr5[9] = dVarA47;
                                                                        eVarArr5[i21] = dVarA48;
                                                                        eVarArr5[11] = dVarA49;
                                                                        eVarArr5[12] = dVarA50;
                                                                        eVarArr5[13] = dVarA51;
                                                                        Pair pairD22 = nim.a.D(bVar21, zhm.v.k(eVarArr5));
                                                                        em2.b bVar22 = em2.b.GRADIENTS;
                                                                        em2.d dVarA52 = u.a(uVar, 26, tVar3, null, 28);
                                                                        em2.d dVarA53 = u.a(uVar, 14, tVar3, null, 28);
                                                                        em2.d dVarA54 = u.a(uVar, 23, tVar3, null, 28);
                                                                        em2.d dVarA55 = u.a(uVar, 25, tVar3, null, 28);
                                                                        em2.d dVarA56 = u.a(uVar, 77, tVar3, null, 28);
                                                                        em2.d dVarA57 = u.a(uVar, 24, tVar3, null, 28);
                                                                        em2.d dVarA58 = u.a(uVar, 82, tVar3, null, 28);
                                                                        em2.d dVarA59 = u.a(uVar, 75, tVar3, null, 28);
                                                                        em2.d dVarA60 = u.a(uVar, 76, tVar3, null, 28);
                                                                        em2.d dVarA61 = u.a(uVar, 78, tVar3, null, 28);
                                                                        em2.d dVarA62 = u.a(uVar, 80, tVar3, null, 28);
                                                                        em2.e[] eVarArr6 = new em2.e[11];
                                                                        eVarArr6[0] = dVarA52;
                                                                        eVarArr6[1] = dVarA53;
                                                                        eVarArr6[2] = dVarA54;
                                                                        eVarArr6[3] = dVarA55;
                                                                        eVarArr6[4] = dVarA56;
                                                                        eVarArr6[5] = dVarA57;
                                                                        eVarArr6[6] = dVarA58;
                                                                        eVarArr6[7] = dVarA59;
                                                                        eVarArr6[8] = dVarA60;
                                                                        eVarArr6[9] = dVarA61;
                                                                        eVarArr6[i21] = dVarA62;
                                                                        Pair pairD23 = nim.a.D(bVar22, zhm.v.k(eVarArr6));
                                                                        em2.b bVar23 = em2.b.HALLOWEEN;
                                                                        em2.f fVarB41 = u.b(uVar, 116, true, tVar3, null, 104);
                                                                        em2.d dVarA63 = u.a(uVar, LDSFile.EF_DG2_TAG, tVar3, null, 28);
                                                                        em2.d dVarA64 = u.a(uVar, LDSFile.EF_DG4_TAG, tVar3, null, 28);
                                                                        em2.f fVarB42 = u.b(uVar, LDSFile.EF_SOD_TAG, true, tVar3, null, 104);
                                                                        em2.d dVarA65 = u.a(uVar, SyslogConstants.LOG_CLOCK, tVar3, null, 28);
                                                                        em2.d dVarA66 = u.a(uVar, 121, tVar3, null, 28);
                                                                        em2.d dVarA67 = u.a(uVar, 122, tVar3, null, 28);
                                                                        em2.f fVarB43 = u.b(uVar, 123, true, tVar3, null, 104);
                                                                        em2.f fVarB44 = u.b(uVar, 124, true, tVar3, null, 104);
                                                                        em2.f fVarB45 = u.b(uVar, ISO781611.SMT_TAG, true, tVar3, null, 104);
                                                                        em2.f fVarB46 = u.b(uVar, 126, true, tVar3, null, 104);
                                                                        em2.f fVarB47 = u.b(uVar, CertificateBody.profileType, true, tVar3, null, 104);
                                                                        em2.f fVarB48 = u.b(uVar, 128, true, tVar3, null, 104);
                                                                        em2.f fVarB49 = u.b(uVar, 129, true, tVar3, null, 104);
                                                                        em2.f fVarB50 = u.b(uVar, 130, true, tVar3, null, 104);
                                                                        em2.f fVarB51 = u.b(uVar, ISO781611.CREATION_DATE_AND_TIME_TAG, true, tVar3, null, 104);
                                                                        em2.e[] eVarArr7 = new em2.e[16];
                                                                        eVarArr7[0] = fVarB41;
                                                                        eVarArr7[1] = dVarA63;
                                                                        eVarArr7[2] = dVarA64;
                                                                        eVarArr7[3] = fVarB42;
                                                                        eVarArr7[4] = dVarA65;
                                                                        eVarArr7[5] = dVarA66;
                                                                        eVarArr7[6] = dVarA67;
                                                                        eVarArr7[7] = fVarB43;
                                                                        eVarArr7[8] = fVarB44;
                                                                        eVarArr7[9] = fVarB45;
                                                                        eVarArr7[i21] = fVarB46;
                                                                        eVarArr7[11] = fVarB47;
                                                                        eVarArr7[12] = fVarB48;
                                                                        eVarArr7[13] = fVarB49;
                                                                        eVarArr7[14] = fVarB50;
                                                                        eVarArr7[15] = fVarB51;
                                                                        Pair pairD24 = nim.a.D(bVar23, zhm.v.k(eVarArr7));
                                                                        Pair pairD25 = nim.a.D(em2.b.HALLOWEEN_LITE, zhm.v.k(u.b(uVar, 123, true, tVar3, null, 104), u.b(uVar, 124, true, tVar3, null, 104), u.b(uVar, ISO781611.SMT_TAG, true, tVar3, null, 104), u.b(uVar, 126, true, tVar3, null, 104)));
                                                                        em2.b bVar24 = em2.b.CHRISTMAS;
                                                                        em2.f fVarB52 = u.b(uVar, 139, true, tVar3, null, 72);
                                                                        em2.f fVarB53 = u.b(uVar, 140, true, tVar3, null, 72);
                                                                        em2.f fVarB54 = u.b(uVar, ModuleDescriptor.MODULE_VERSION, true, tVar3, null, 72);
                                                                        em2.f fVarB55 = u.b(uVar, 142, true, tVar3, null, 72);
                                                                        em2.f fVarB56 = u.b(uVar, 143, true, tVar3, null, 72);
                                                                        em2.f fVarB57 = u.b(uVar, SyslogConstants.LOG_LOCAL2, true, tVar3, null, 72);
                                                                        em2.f fVarB58 = u.b(uVar, 145, true, tVar3, null, 72);
                                                                        em2.f fVarB59 = u.b(uVar, 146, true, tVar3, null, 72);
                                                                        em2.f fVarB60 = u.b(uVar, 147, true, tVar3, null, 72);
                                                                        em2.f fVarB61 = u.b(uVar, 148, true, tVar3, null, 72);
                                                                        em2.f fVarB62 = u.b(uVar, 149, true, tVar3, null, 72);
                                                                        em2.f fVarB63 = u.b(uVar, 150, true, tVar3, null, 72);
                                                                        em2.f fVarB64 = u.b(uVar, ISO7816.TAG_SM_EXPECTED_LENGTH, true, tVar3, null, 72);
                                                                        em2.f fVarB65 = u.b(uVar, SyslogConstants.LOG_LOCAL3, true, tVar3, null, 72);
                                                                        em2.f fVarB66 = u.b(uVar, 153, true, tVar3, null, 72);
                                                                        em2.f fVarB67 = u.b(uVar, Constants.EMVTag.TAG_9A_TRANSACTION_DATE, true, tVar3, null, 72);
                                                                        em2.f fVarB68 = u.b(uVar, 155, true, tVar3, null, 72);
                                                                        em2.e[] eVarArr8 = new em2.e[17];
                                                                        eVarArr8[0] = fVarB52;
                                                                        eVarArr8[1] = fVarB53;
                                                                        eVarArr8[2] = fVarB54;
                                                                        eVarArr8[3] = fVarB55;
                                                                        eVarArr8[4] = fVarB56;
                                                                        eVarArr8[5] = fVarB57;
                                                                        eVarArr8[6] = fVarB58;
                                                                        eVarArr8[7] = fVarB59;
                                                                        eVarArr8[8] = fVarB60;
                                                                        eVarArr8[9] = fVarB61;
                                                                        eVarArr8[i21] = fVarB62;
                                                                        eVarArr8[11] = fVarB63;
                                                                        eVarArr8[12] = fVarB64;
                                                                        eVarArr8[13] = fVarB65;
                                                                        eVarArr8[14] = fVarB66;
                                                                        eVarArr8[15] = fVarB67;
                                                                        eVarArr8[16] = fVarB68;
                                                                        Pair pairD26 = nim.a.D(bVar24, zhm.v.k(eVarArr8));
                                                                        em2.b bVar25 = em2.b.UPBEAT;
                                                                        em2.f fVarB69 = u.b(uVar, 177, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB70 = u.b(uVar, 178, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB71 = u.b(uVar, 179, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB72 = u.b(uVar, 180, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB73 = u.b(uVar, 181, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB74 = u.b(uVar, 182, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB75 = u.b(uVar, 183, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB76 = u.b(uVar, SyslogConstants.LOG_LOCAL7, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB77 = u.b(uVar, 185, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB78 = u.b(uVar, 186, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB79 = u.b(uVar, 187, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB80 = u.b(uVar, 188, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.e[] eVarArr9 = new em2.e[12];
                                                                        eVarArr9[0] = fVarB69;
                                                                        eVarArr9[1] = fVarB70;
                                                                        eVarArr9[2] = fVarB71;
                                                                        eVarArr9[3] = fVarB72;
                                                                        eVarArr9[4] = fVarB73;
                                                                        eVarArr9[5] = fVarB74;
                                                                        eVarArr9[6] = fVarB75;
                                                                        eVarArr9[7] = fVarB76;
                                                                        eVarArr9[8] = fVarB77;
                                                                        eVarArr9[9] = fVarB78;
                                                                        eVarArr9[i21] = fVarB79;
                                                                        eVarArr9[11] = fVarB80;
                                                                        Pair pairD27 = nim.a.D(bVar25, zhm.v.k(eVarArr9));
                                                                        Pair pairD28 = nim.a.D(em2.b.INVEST, zhm.u.c(u.a(uVar, 189, tVar3, null, 28)));
                                                                        em2.b bVar26 = em2.b.MINIMAL;
                                                                        e.a aVar = e.a.f127582a;
                                                                        Pair pairD29 = nim.a.D(bVar26, zhm.u.c(aVar));
                                                                        em2.b bVar27 = em2.b.PRIDE;
                                                                        ArrayList arrayList30 = new ArrayList(28);
                                                                        int i112 = 208;
                                                                        while (i112 < 236) {
                                                                            arrayList30.add(u.a(uVar, i112, t.DARK, s8.INTRICATE, 24));
                                                                            i112++;
                                                                            pairD27 = pairD27;
                                                                            pairD24 = pairD24;
                                                                        }
                                                                        Pair pair9 = pairD27;
                                                                        Pair pair10 = pairD24;
                                                                        Unit unit13 = Unit.f186387a;
                                                                        Pair pairD30 = nim.a.D(bVar27, arrayList30);
                                                                        Pair pairD31 = nim.a.D(em2.b.BUSINESS, zhm.u.c(aVar));
                                                                        em2.b bVar28 = em2.b.BUSINESS_BLUE;
                                                                        t tVar5 = t.LIGHT;
                                                                        Pair pairD32 = nim.a.D(bVar28, zhm.u.c(u.b(uVar, 301, true, tVar5, null, SyslogConstants.LOG_CLOCK)));
                                                                        Pair pairD33 = nim.a.D(em2.b.BUSINESS_GREEN, zhm.u.c(u.b(uVar, 302, true, tVar5, null, SyslogConstants.LOG_CLOCK)));
                                                                        Pair pairD34 = nim.a.D(em2.b.BUSINESS_ORANGE, zhm.u.c(u.b(uVar, 303, true, tVar5, null, SyslogConstants.LOG_CLOCK)));
                                                                        Pair pairD35 = nim.a.D(em2.b.BUSINESS_TEAL, zhm.u.c(u.b(uVar, 304, true, tVar5, null, SyslogConstants.LOG_CLOCK)));
                                                                        Pair pairD36 = nim.a.D(em2.b.BUSINESS_PURPLE, zhm.u.c(u.b(uVar, 305, true, tVar5, null, SyslogConstants.LOG_CLOCK)));
                                                                        em2.b bVar29 = em2.b.BUSINESS_MIDNIGHT_BLUE;
                                                                        t tVar6 = t.LIGHT_DARK;
                                                                        Pair pairD37 = nim.a.D(bVar29, zhm.u.c(u.b(uVar, 533, true, tVar6, null, SyslogConstants.LOG_CLOCK)));
                                                                        Pair pairD38 = nim.a.D(em2.b.BUSINESS_INDIGO, zhm.u.c(u.b(uVar, 534, true, tVar6, null, SyslogConstants.LOG_CLOCK)));
                                                                        Pair pairD39 = nim.a.D(em2.b.BUSINESS_OLIVE, zhm.u.c(u.b(uVar, 535, true, tVar6, null, SyslogConstants.LOG_CLOCK)));
                                                                        Pair pairD40 = nim.a.D(em2.b.BUSINESS_TEAL_2, zhm.u.c(u.b(uVar, 536, true, tVar6, null, SyslogConstants.LOG_CLOCK)));
                                                                        Pair pairD41 = nim.a.D(em2.b.BUSINESS_WARM, zhm.u.c(u.b(uVar, 538, true, tVar6, null, SyslogConstants.LOG_CLOCK)));
                                                                        Pair pairD42 = nim.a.D(em2.b.BUSINESS_TITAN, zhm.u.c(u.b(uVar, 537, true, tVar6, null, SyslogConstants.LOG_CLOCK)));
                                                                        Pair pairD43 = nim.a.D(em2.b.REVOLUT_X, zhm.u.c(u.b(uVar, 306, true, t.NONE, s8.INTRICATE, 112)));
                                                                        em2.b bVar30 = em2.b.LAVA;
                                                                        ArrayList arrayList31 = new ArrayList(11);
                                                                        int i113 = 352;
                                                                        while (true) {
                                                                            int i114 = 363;
                                                                            if (i113 < 363) {
                                                                                em2.b bVar31 = bVar30;
                                                                                int i115 = i113;
                                                                                ArrayList arrayList32 = arrayList31;
                                                                                arrayList32.add(u.b(uVar, i115, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                                                i113 = i115 + 1;
                                                                                bVar30 = bVar31;
                                                                                arrayList31 = arrayList32;
                                                                                pairD31 = pairD31;
                                                                                pairD43 = pairD43;
                                                                            } else {
                                                                                Pair pair11 = pairD43;
                                                                                Pair pair12 = pairD31;
                                                                                Unit unit14 = Unit.f186387a;
                                                                                Pair pairD44 = nim.a.D(bVar30, arrayList31);
                                                                                em2.b bVar32 = em2.b.ALEX_K;
                                                                                ArrayList arrayList33 = new ArrayList(11);
                                                                                while (true) {
                                                                                    int i116 = 374;
                                                                                    if (i114 < 374) {
                                                                                        arrayList33.add(u.a(uVar, i114, t.NONE, null, 28));
                                                                                        i114++;
                                                                                    } else {
                                                                                        Unit unit15 = Unit.f186387a;
                                                                                        Pair pairD45 = nim.a.D(bVar32, arrayList33);
                                                                                        em2.b bVar33 = em2.b.GEOMETRIC;
                                                                                        ArrayList arrayList34 = new ArrayList(11);
                                                                                        while (true) {
                                                                                            int i117 = 385;
                                                                                            if (i116 < 385) {
                                                                                                ArrayList arrayList35 = arrayList34;
                                                                                                em2.b bVar34 = bVar33;
                                                                                                int i118 = i116;
                                                                                                arrayList35.add(u.b(uVar, i118, true, t.NONE, s8.INTRICATE, 112));
                                                                                                i116 = i118 + 1;
                                                                                                bVar33 = bVar34;
                                                                                                arrayList34 = arrayList35;
                                                                                                pairD45 = pairD45;
                                                                                                pairD44 = pairD44;
                                                                                            } else {
                                                                                                Pair pair13 = pairD44;
                                                                                                Pair pair14 = pairD45;
                                                                                                Unit unit16 = Unit.f186387a;
                                                                                                Pair pairD46 = nim.a.D(bVar33, arrayList34);
                                                                                                em2.b bVar35 = em2.b.DOGS;
                                                                                                ArrayList arrayList36 = new ArrayList(11);
                                                                                                while (true) {
                                                                                                    int i119 = 396;
                                                                                                    if (i117 < 396) {
                                                                                                        ArrayList arrayList37 = arrayList36;
                                                                                                        int i120 = i117;
                                                                                                        arrayList37.add(u.b(uVar, i120, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                                                                        i117 = i120 + 1;
                                                                                                        arrayList36 = arrayList37;
                                                                                                        pairD46 = pairD46;
                                                                                                    } else {
                                                                                                        Pair pair15 = pairD46;
                                                                                                        ArrayList arrayList38 = arrayList36;
                                                                                                        Unit unit17 = Unit.f186387a;
                                                                                                        Pair pairD47 = nim.a.D(bVar35, arrayList38);
                                                                                                        em2.b bVar36 = em2.b.PSYCHEDELIC;
                                                                                                        ArrayList arrayList39 = new ArrayList(15);
                                                                                                        while (true) {
                                                                                                            int i121 = WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE;
                                                                                                            if (i119 < 411) {
                                                                                                                ArrayList arrayList40 = arrayList39;
                                                                                                                int i122 = i119;
                                                                                                                arrayList40.add(u.b(uVar, i122, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                                                                                i119 = i122 + 1;
                                                                                                                arrayList39 = arrayList40;
                                                                                                                pairD47 = pairD47;
                                                                                                            } else {
                                                                                                                Pair pair16 = pairD47;
                                                                                                                ArrayList arrayList41 = arrayList39;
                                                                                                                Unit unit18 = Unit.f186387a;
                                                                                                                Pair pairD48 = nim.a.D(bVar36, arrayList41);
                                                                                                                em2.b bVar37 = em2.b.VELVET;
                                                                                                                ArrayList arrayList42 = new ArrayList(11);
                                                                                                                while (true) {
                                                                                                                    int i123 = 422;
                                                                                                                    if (i121 >= 422) {
                                                                                                                        Pair pair17 = pairD48;
                                                                                                                        ArrayList arrayList43 = arrayList42;
                                                                                                                        Unit unit19 = Unit.f186387a;
                                                                                                                        Pair pairD49 = nim.a.D(bVar37, arrayList43);
                                                                                                                        em2.b bVar38 = em2.b.FLOWERS;
                                                                                                                        ArrayList arrayList44 = new ArrayList(11);
                                                                                                                        int i124 = OnfidoActivity.ONFIDO_RECREATE;
                                                                                                                        while (i123 < i124) {
                                                                                                                            ArrayList arrayList45 = arrayList44;
                                                                                                                            int i125 = i123;
                                                                                                                            arrayList45.add(u.b(uVar, i125, true, t.DARK, null, SyslogConstants.LOG_CLOCK));
                                                                                                                            i123 = i125 + 1;
                                                                                                                            arrayList44 = arrayList45;
                                                                                                                            i124 = i124;
                                                                                                                            pairD49 = pairD49;
                                                                                                                        }
                                                                                                                        Pair pair18 = pairD49;
                                                                                                                        ArrayList arrayList46 = arrayList44;
                                                                                                                        Unit unit20 = Unit.f186387a;
                                                                                                                        Pair pairD50 = nim.a.D(bVar38, arrayList46);
                                                                                                                        em2.b bVar39 = em2.b.JUNIOR_GLOW;
                                                                                                                        ArrayList arrayList47 = new ArrayList(i21);
                                                                                                                        int i126 = 467;
                                                                                                                        while (i126 < 477) {
                                                                                                                            ArrayList arrayList48 = arrayList47;
                                                                                                                            int i127 = i126;
                                                                                                                            arrayList48.add(u.b(uVar, i127, true, t.DARK, null, SyslogConstants.LOG_CLOCK));
                                                                                                                            i126 = i127 + 1;
                                                                                                                            arrayList47 = arrayList48;
                                                                                                                            pairD50 = pairD50;
                                                                                                                        }
                                                                                                                        Pair pair19 = pairD50;
                                                                                                                        ArrayList arrayList49 = arrayList47;
                                                                                                                        Unit unit21 = Unit.f186387a;
                                                                                                                        Pair pairD51 = nim.a.D(bVar39, arrayList49);
                                                                                                                        em2.b bVar40 = em2.b.TRAVERTINE;
                                                                                                                        ArrayList arrayList50 = new ArrayList(11);
                                                                                                                        int i128 = 281;
                                                                                                                        while (i128 < 292) {
                                                                                                                            ArrayList arrayList51 = arrayList50;
                                                                                                                            int i129 = i128;
                                                                                                                            arrayList51.add(u.b(uVar, i129, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                                                                                            i128 = i129 + 1;
                                                                                                                            arrayList50 = arrayList51;
                                                                                                                            pairD51 = pairD51;
                                                                                                                        }
                                                                                                                        Pair pair20 = pairD51;
                                                                                                                        ArrayList arrayList52 = arrayList50;
                                                                                                                        Unit unit22 = Unit.f186387a;
                                                                                                                        Pair pairD52 = nim.a.D(bVar40, arrayList52);
                                                                                                                        em2.b bVar41 = em2.b.UK_LANDSCAPES;
                                                                                                                        ArrayList arrayList53 = new ArrayList(11);
                                                                                                                        int i130 = 521;
                                                                                                                        while (i130 < 532) {
                                                                                                                            ArrayList arrayList54 = arrayList53;
                                                                                                                            int i131 = i130;
                                                                                                                            arrayList54.add(u.b(uVar, i131, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                                                                                            i130 = i131 + 1;
                                                                                                                            arrayList53 = arrayList54;
                                                                                                                            pairD52 = pairD52;
                                                                                                                        }
                                                                                                                        Unit unit23 = Unit.f186387a;
                                                                                                                        return r0.k(pair4, pairD2, pair7, pairD4, pairD5, pairD6, pairD7, pairD8, pair2, pair3, pair5, pairD12, pairD13, pair6, pair8, pairD16, pairD17, pairD18, pairD19, pairD20, pairD21, pairD22, pairD23, pair10, pairD25, pairD26, pair9, pairD28, pairD29, pairD30, pair12, pairD32, pairD33, pairD34, pairD35, pairD36, pairD37, pairD38, pairD39, pairD40, pairD41, pairD42, pair11, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pairD52, nim.a.D(bVar41, arrayList53));
                                                                                                                    }
                                                                                                                    ArrayList arrayList55 = arrayList42;
                                                                                                                    int i132 = i121;
                                                                                                                    arrayList55.add(u.b(uVar, i132, true, t.DARK, null, SyslogConstants.LOG_CLOCK));
                                                                                                                    i121 = i132 + 1;
                                                                                                                    arrayList42 = arrayList55;
                                                                                                                    pairD48 = pairD48;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        ArrayList arrayListU = zhm.w.u(((Map) this.f185708b.f185709a.getValue()).values());
                        int iB = q0.b(zhm.w.t(arrayListU, 10));
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
                        for (Object obj2 : arrayListU) {
                            linkedHashMap.put(((em2.e) obj2).a(), obj2);
                        }
                        return linkedHashMap;
                }
            }
        });
        final int i2 = 1;
        this.f185710b = yhm.j.b(new Function0(this) { // from class: km2.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f185708b;

            {
                this.f185708b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = 10;
                switch (i2) {
                    case 0:
                        em2.b bVar = em2.b.PARTICLES;
                        List<Pair> listK = zhm.v.k(new Pair("bg552", y.BG552), new Pair("bg553", y.BG553), new Pair("bg554", y.BG554), new Pair("bg555", y.BG555), new Pair("bg556", y.BG556), new Pair("bg557", y.BG557), new Pair("bg558", y.BG558), new Pair("bg559", y.BG559), new Pair("bg560", y.BG560), new Pair("bg561", y.BG561), new Pair("bg562", y.BG562));
                        ArrayList arrayList = new ArrayList(zhm.w.t(listK, 10));
                        for (Pair pair : listK) {
                            String str = (String) pair.f186385a;
                            y yVar = (y) pair.f186386b;
                            List list = z.f281800a;
                            NavBarWithContainerBackground.ImageBackground imageBackgroundA = z.a(yVar, uc0.b.a("mobile/media_library/v5/wallpaper_animations/animations", "particles_theme_glow"));
                            Image e = imageBackgroundA.getE();
                            Intrinsics.i(e, "null cannot be cast to non-null type com.revolut.core.ui_kit_core.displayers.image.models.LottieImage");
                            LottieImage lottieImage = (LottieImage) e;
                            UrlImage urlImage = new UrlImage(p.a.p("https://assets.revolut.com/mobile/media_library/v5/wallpaper_animations/thumbnail/", str, "@3x.png"), p.a.p("https://assets.revolut.com/mobile/media_library/v5/wallpaper_animations/thumbnail_dark/", str, "@3x.png"), null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524284);
                            Color d = imageBackgroundA.getD();
                            if (d == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            arrayList.add(new em2.c(str, lottieImage, urlImage, d, imageBackgroundA.getD()));
                        }
                        Pair pairD = nim.a.D(bVar, arrayList);
                        em2.b bVar2 = em2.b.SAVINGS_CHALLENGE;
                        ArrayList arrayList2 = new ArrayList(12);
                        int i3 = 539;
                        while (true) {
                            u uVar = this.f185708b;
                            if (i3 < 551) {
                                arrayList2.add(u.b(uVar, i3, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                i3++;
                            } else {
                                Unit unit = Unit.f186387a;
                                Pair pairD2 = nim.a.D(bVar2, arrayList2);
                                em2.b bVar3 = em2.b.ABSTRACT;
                                t tVar = t.DARK;
                                Pair pairD3 = nim.a.D(bVar3, zhm.v.k(u.b(uVar, 1, true, tVar, null, 72), u.b(uVar, LDSFile.EF_DG15_TAG, true, tVar, null, 104), u.b(uVar, 31, true, tVar, null, 104), u.b(uVar, 16, true, tVar, null, 104), u.b(uVar, 90, true, tVar, null, 104), u.b(uVar, 46, true, tVar, null, 104), u.b(uVar, 112, true, tVar, null, 104), u.b(uVar, 11, true, tVar, null, 104), u.b(uVar, 113, true, tVar, null, 104), u.b(uVar, 87, true, tVar, null, 104), u.b(uVar, 91, true, tVar, null, 104), u.b(uVar, 20, true, tVar, null, 104), u.b(uVar, 89, true, tVar, null, 104), u.b(uVar, 114, true, tVar, null, 104), u.b(uVar, 86, true, tVar, null, 104), u.b(uVar, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG, true, tVar, null, 104), u.b(uVar, 88, true, tVar, null, 72), u.b(uVar, 5, true, tVar, null, 104), u.a(uVar, 83, tVar, null, 28)));
                                Pair pairD4 = nim.a.D(em2.b.ABSTRACT_LITE, zhm.v.k(u.b(uVar, LDSFile.EF_DG15_TAG, true, tVar, null, 104), u.b(uVar, 112, true, tVar, null, 104), u.b(uVar, 113, true, tVar, null, 104), u.b(uVar, 114, true, tVar, null, 104), u.b(uVar, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG, true, tVar, null, 104)));
                                em2.b bVar4 = em2.b.GLOW;
                                String strC = u.c(5);
                                String strC2 = u.c(6);
                                Pair pairD5 = nim.a.D(bVar4, zhm.v.k(new em2.f(a0.d.r(strC2, "/wallpaper_videos/full_video_tall/bg190.mp4"), a0.d.r(strC, "/wallpaper_videos/full_video_tall/bg190_h264.mp4"), a0.d.r(strC2, "/wallpaper_videos/thumbnail/bg190@2x.png"), a0.d.r(strC, "/wallpaper_videos/thumbnail/bg190@2x.png")), u.b(uVar, 191, true, tVar, null, 72), u.b(uVar, 192, true, tVar, null, 72), u.b(uVar, Constants.TAG_ATMEL_SERIAL, true, tVar, null, 72), u.b(uVar, 194, true, tVar, null, 72), u.b(uVar, 195, true, tVar, null, 72), u.b(uVar, 196, true, tVar, null, 72), u.b(uVar, Constants.TAG_BATTERY_STATE, true, tVar, null, 72), u.b(uVar, Constants.TAG_POWER_OFF_TIMEOUT, true, tVar, null, 72), u.b(uVar, 199, true, tVar, null, 72), u.b(uVar, 200, true, tVar, null, 72)));
                                em2.b bVar5 = em2.b.CYBERPUNK_2;
                                ArrayList arrayList3 = new ArrayList(11);
                                int i5 = Constants.TAG_OS_VERSION;
                                char c2 = 236;
                                while (true) {
                                    int i6 = Constants.TAG_BLE_FIRMWARE_VERSION;
                                    if (i5 < 247) {
                                        arrayList3.add(u.b(uVar, i5, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                        i5++;
                                        c2 = c2;
                                        i22 = i22;
                                    } else {
                                        int i21 = i22;
                                        Unit unit2 = Unit.f186387a;
                                        Pair pairD6 = nim.a.D(bVar5, arrayList3);
                                        em2.b bVar6 = em2.b.PREMIUM;
                                        char c3 = 433;
                                        ArrayList arrayList4 = new ArrayList(11);
                                        int i222 = 433;
                                        while (true) {
                                            int i32 = OnfidoActivity.RESULT_EXIT_BACKGROUND_STOP;
                                            if (i222 < 444) {
                                                ArrayList arrayList5 = arrayList4;
                                                arrayList5.add(u.b(uVar, i222, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                i222++;
                                                arrayList4 = arrayList5;
                                                i6 = i6;
                                                c3 = 433;
                                            } else {
                                                int i33 = i6;
                                                Unit unit3 = Unit.f186387a;
                                                Pair pairD7 = nim.a.D(bVar6, arrayList4);
                                                em2.b bVar7 = em2.b.ULTRA;
                                                ArrayList arrayList6 = new ArrayList(11);
                                                while (i32 < 455) {
                                                    ArrayList arrayList7 = arrayList6;
                                                    int i43 = i32;
                                                    arrayList7.add(u.b(uVar, i43, true, t.DARK, null, 72));
                                                    i32 = i43 + 1;
                                                    arrayList6 = arrayList7;
                                                }
                                                ArrayList arrayList8 = arrayList6;
                                                Unit unit4 = Unit.f186387a;
                                                Pair pairD8 = nim.a.D(bVar7, arrayList8);
                                                em2.b bVar8 = em2.b.PRIVATE;
                                                ArrayList arrayList9 = new ArrayList(1);
                                                arrayList9.add(u.b(uVar, 466, true, t.LIGHT_DARK, null, SyslogConstants.LOG_CLOCK));
                                                Pair pairD9 = nim.a.D(bVar8, arrayList9);
                                                em2.b bVar9 = em2.b.METAL;
                                                ArrayList arrayList10 = new ArrayList(11);
                                                int i59 = 455;
                                                while (i59 < 466) {
                                                    ArrayList arrayList11 = arrayList10;
                                                    int i66 = i59;
                                                    arrayList11.add(u.b(uVar, i66, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                    i59 = i66 + 1;
                                                    arrayList10 = arrayList11;
                                                    pairD9 = pairD9;
                                                }
                                                Pair pair2 = pairD9;
                                                ArrayList arrayList12 = arrayList10;
                                                Unit unit5 = Unit.f186387a;
                                                Pair pairD10 = nim.a.D(bVar9, arrayList12);
                                                em2.b bVar10 = em2.b.ZODIAC;
                                                int i74 = 258;
                                                ArrayList arrayList13 = new ArrayList(12);
                                                int i92 = 258;
                                                while (true) {
                                                    int i96 = 270;
                                                    if (i92 < 270) {
                                                        ArrayList arrayList14 = arrayList13;
                                                        arrayList14.add(u.b(uVar, i92, true, t.NONE, null, 72));
                                                        i92++;
                                                        arrayList13 = arrayList14;
                                                        i74 = i74;
                                                        pairD = pairD;
                                                        pairD10 = pairD10;
                                                    } else {
                                                        Pair pair3 = pairD10;
                                                        Pair pair4 = pairD;
                                                        Unit unit6 = Unit.f186387a;
                                                        Pair pairD11 = nim.a.D(bVar10, arrayList13);
                                                        em2.b bVar11 = em2.b.LIGHTS;
                                                        ArrayList arrayList15 = new ArrayList(11);
                                                        int i99 = i33;
                                                        for (int i100 = i74; i99 < i100; i100 = 258) {
                                                            ArrayList arrayList16 = arrayList15;
                                                            int i101 = i99;
                                                            arrayList16.add(u.b(uVar, i101, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                            i99 = i101 + 1;
                                                            arrayList15 = arrayList16;
                                                            i96 = i96;
                                                        }
                                                        ArrayList arrayList17 = arrayList15;
                                                        Unit unit7 = Unit.f186387a;
                                                        Pair pairD12 = nim.a.D(bVar11, arrayList17);
                                                        em2.b bVar12 = em2.b.SNAKE;
                                                        ArrayList arrayList18 = new ArrayList(12);
                                                        while (i96 < 281) {
                                                            ArrayList arrayList19 = arrayList18;
                                                            int i102 = i96;
                                                            arrayList19.add(u.b(uVar, i102, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                            i96 = i102 + 1;
                                                            arrayList18 = arrayList19;
                                                            pairD11 = pairD11;
                                                        }
                                                        Pair pair5 = pairD11;
                                                        ArrayList arrayList20 = arrayList18;
                                                        Unit unit8 = Unit.f186387a;
                                                        Pair pairD13 = nim.a.D(bVar12, arrayList20);
                                                        em2.b bVar13 = em2.b.APEX;
                                                        ArrayList arrayList21 = new ArrayList(11);
                                                        t tVar2 = t.NONE;
                                                        arrayList21.add(u.b(uVar, 350, true, tVar2, null, SyslogConstants.LOG_CLOCK));
                                                        arrayList21.add(u.b(uVar, 351, true, tVar2, null, SyslogConstants.LOG_CLOCK));
                                                        int i103 = 307;
                                                        while (true) {
                                                            int i104 = 316;
                                                            if (i103 < 316) {
                                                                arrayList21.add(u.b(uVar, i103, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                                i103++;
                                                            } else {
                                                                Unit unit9 = Unit.f186387a;
                                                                Pair pairD14 = nim.a.D(bVar13, arrayList21);
                                                                em2.b bVar14 = em2.b.HORIZON;
                                                                int i105 = 327;
                                                                ArrayList arrayList22 = new ArrayList(11);
                                                                int i106 = 327;
                                                                while (true) {
                                                                    int i107 = 338;
                                                                    if (i106 < 338) {
                                                                        ArrayList arrayList23 = arrayList22;
                                                                        arrayList23.add(u.b(uVar, i106, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                                        i106++;
                                                                        arrayList22 = arrayList23;
                                                                        i105 = i105;
                                                                        pairD14 = pairD14;
                                                                        pairD3 = pairD3;
                                                                        i104 = i104;
                                                                    } else {
                                                                        Pair pair6 = pairD14;
                                                                        Pair pair7 = pairD3;
                                                                        Unit unit10 = Unit.f186387a;
                                                                        Pair pairD15 = nim.a.D(bVar14, arrayList22);
                                                                        em2.b bVar15 = em2.b.EXPLORE;
                                                                        ArrayList arrayList24 = new ArrayList(11);
                                                                        int i108 = i104;
                                                                        for (int i109 = i105; i108 < i109; i109 = 327) {
                                                                            ArrayList arrayList25 = arrayList24;
                                                                            int i110 = i108;
                                                                            arrayList25.add(u.b(uVar, i110, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                                            i108 = i110 + 1;
                                                                            arrayList24 = arrayList25;
                                                                            i107 = i107;
                                                                        }
                                                                        ArrayList arrayList26 = arrayList24;
                                                                        Unit unit11 = Unit.f186387a;
                                                                        Pair pairD16 = nim.a.D(bVar15, arrayList26);
                                                                        em2.b bVar16 = em2.b.CRYPTO;
                                                                        ArrayList arrayList27 = new ArrayList(12);
                                                                        while (i107 < 350) {
                                                                            ArrayList arrayList28 = arrayList27;
                                                                            int i111 = i107;
                                                                            arrayList28.add(u.b(uVar, i111, true, t.LIGHT, null, SyslogConstants.LOG_CLOCK));
                                                                            i107 = i111 + 1;
                                                                            arrayList27 = arrayList28;
                                                                            pairD15 = pairD15;
                                                                        }
                                                                        Pair pair8 = pairD15;
                                                                        ArrayList arrayList29 = arrayList27;
                                                                        Unit unit12 = Unit.f186387a;
                                                                        Pair pairD17 = nim.a.D(bVar16, arrayList29);
                                                                        em2.b bVar17 = em2.b.LINES;
                                                                        t tVar3 = t.NONE;
                                                                        em2.f fVarB = u.b(uVar, Constants.EMVTag.TAG_9C_TRANSACTION_TYPE, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB2 = u.b(uVar, 157, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB3 = u.b(uVar, ISO781611.SMT_DO_DS, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB4 = u.b(uVar, 159, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB5 = u.b(uVar, 160, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB6 = u.b(uVar, 161, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB7 = u.b(uVar, 162, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB8 = u.b(uVar, Constants.TAG_ACE_LAYER_VERSION, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB9 = u.b(uVar, Constants.TAG_GPI_VERSION, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB10 = u.b(uVar, Constants.TAG_EMVL3_VERSION, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB11 = u.b(uVar, Constants.TAG_PAYMENT_APP_CLESS_VERSION, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB12 = u.b(uVar, 167, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB13 = u.b(uVar, 168, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB14 = u.b(uVar, 169, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB15 = u.b(uVar, 170, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB16 = u.b(uVar, 171, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB17 = u.b(uVar, 172, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB18 = u.b(uVar, 173, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB19 = u.b(uVar, 174, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB20 = u.b(uVar, 175, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.e[] eVarArr = new em2.e[20];
                                                                        eVarArr[0] = fVarB;
                                                                        eVarArr[1] = fVarB2;
                                                                        eVarArr[2] = fVarB3;
                                                                        eVarArr[3] = fVarB4;
                                                                        eVarArr[4] = fVarB5;
                                                                        eVarArr[5] = fVarB6;
                                                                        eVarArr[6] = fVarB7;
                                                                        eVarArr[7] = fVarB8;
                                                                        eVarArr[8] = fVarB9;
                                                                        eVarArr[9] = fVarB10;
                                                                        eVarArr[i21] = fVarB11;
                                                                        eVarArr[11] = fVarB12;
                                                                        eVarArr[12] = fVarB13;
                                                                        eVarArr[13] = fVarB14;
                                                                        eVarArr[14] = fVarB15;
                                                                        eVarArr[15] = fVarB16;
                                                                        eVarArr[16] = fVarB17;
                                                                        eVarArr[17] = fVarB18;
                                                                        eVarArr[18] = fVarB19;
                                                                        eVarArr[19] = fVarB20;
                                                                        Pair pairD18 = nim.a.D(bVar17, zhm.v.k(eVarArr));
                                                                        em2.b bVar18 = em2.b.GLASS;
                                                                        t tVar4 = t.DARK;
                                                                        em2.f fVarB21 = u.b(uVar, 3, true, tVar4, null, 104);
                                                                        em2.f fVarB22 = u.b(uVar, 137, true, tVar4, null, 104);
                                                                        em2.f fVarB23 = u.b(uVar, 17, true, tVar4, null, 104);
                                                                        em2.f fVarB24 = u.b(uVar, ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA, true, tVar4, null, 104);
                                                                        em2.f fVarB25 = u.b(uVar, 133, true, tVar4, null, 104);
                                                                        em2.f fVarB26 = u.b(uVar, 9, true, tVar4, null, 104);
                                                                        em2.f fVarB27 = u.b(uVar, 18, true, tVar4, null, 104);
                                                                        em2.f fVarB28 = u.b(uVar, 15, true, tVar4, null, 104);
                                                                        em2.f fVarB29 = u.b(uVar, 135, true, tVar4, null, 104);
                                                                        em2.f fVarB30 = u.b(uVar, 138, true, tVar4, null, 104);
                                                                        em2.f fVarB31 = u.b(uVar, 4, true, tVar4, null, 104);
                                                                        em2.f fVarB32 = u.b(uVar, 136, true, tVar4, null, 104);
                                                                        em2.f fVarB33 = u.b(uVar, 132, true, tVar4, null, 104);
                                                                        em2.d dVarA = u.a(uVar, 28, tVar3, null, 28);
                                                                        em2.d dVarA2 = u.a(uVar, 40, tVar3, null, 28);
                                                                        em2.f fVarB34 = u.b(uVar, 59, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB35 = u.b(uVar, 60, true, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.d dVarA3 = u.a(uVar, 6, tVar3, null, 28);
                                                                        em2.d dVarA4 = u.a(uVar, 39, tVar3, null, 28);
                                                                        em2.d dVarA5 = u.a(uVar, 35, tVar3, null, 28);
                                                                        em2.d dVarA6 = u.a(uVar, 43, tVar3, null, 28);
                                                                        em2.d dVarA7 = u.a(uVar, 37, tVar3, null, 28);
                                                                        em2.d dVarA8 = u.a(uVar, 38, tVar3, null, 28);
                                                                        em2.d dVarA9 = u.a(uVar, 12, tVar3, null, 28);
                                                                        em2.e[] eVarArr2 = new em2.e[24];
                                                                        eVarArr2[0] = fVarB21;
                                                                        eVarArr2[1] = fVarB22;
                                                                        eVarArr2[2] = fVarB23;
                                                                        eVarArr2[3] = fVarB24;
                                                                        eVarArr2[4] = fVarB25;
                                                                        eVarArr2[5] = fVarB26;
                                                                        eVarArr2[6] = fVarB27;
                                                                        eVarArr2[7] = fVarB28;
                                                                        eVarArr2[8] = fVarB29;
                                                                        eVarArr2[9] = fVarB30;
                                                                        eVarArr2[i21] = fVarB31;
                                                                        eVarArr2[11] = fVarB32;
                                                                        eVarArr2[12] = fVarB33;
                                                                        eVarArr2[13] = dVarA;
                                                                        eVarArr2[14] = dVarA2;
                                                                        eVarArr2[15] = fVarB34;
                                                                        eVarArr2[16] = fVarB35;
                                                                        eVarArr2[17] = dVarA3;
                                                                        eVarArr2[18] = dVarA4;
                                                                        eVarArr2[19] = dVarA5;
                                                                        eVarArr2[20] = dVarA6;
                                                                        eVarArr2[21] = dVarA7;
                                                                        eVarArr2[22] = dVarA8;
                                                                        eVarArr2[23] = dVarA9;
                                                                        Pair pairD19 = nim.a.D(bVar18, zhm.v.k(eVarArr2));
                                                                        em2.b bVar19 = em2.b.CYBERPUNK;
                                                                        em2.d dVarA10 = u.a(uVar, 92, tVar3, null, 28);
                                                                        em2.d dVarA11 = u.a(uVar, 93, tVar3, null, 28);
                                                                        em2.d dVarA12 = u.a(uVar, 94, tVar3, null, 28);
                                                                        em2.d dVarA13 = u.a(uVar, 95, tVar3, null, 28);
                                                                        em2.d dVarA14 = u.a(uVar, 97, tVar3, null, 28);
                                                                        em2.d dVarA15 = u.a(uVar, 98, tVar3, null, 28);
                                                                        em2.d dVarA16 = u.a(uVar, 96, tVar3, null, 28);
                                                                        em2.d dVarA17 = u.a(uVar, 100, tVar3, null, 28);
                                                                        em2.d dVarA18 = u.a(uVar, 101, tVar3, null, 28);
                                                                        em2.d dVarA19 = u.a(uVar, 102, tVar3, null, 28);
                                                                        em2.d dVarA20 = u.a(uVar, 103, tVar3, null, 28);
                                                                        em2.d dVarA21 = u.a(uVar, 104, tVar3, null, 28);
                                                                        em2.d dVarA22 = u.a(uVar, 105, tVar3, null, 28);
                                                                        em2.d dVarA23 = u.a(uVar, 107, tVar3, null, 28);
                                                                        em2.f fVarB36 = u.b(uVar, 99, true, tVar3, null, 72);
                                                                        em2.f fVarB37 = u.b(uVar, 106, true, tVar3, null, 72);
                                                                        em2.f fVarB38 = u.b(uVar, LDSFile.EF_DG12_TAG, true, tVar3, null, 72);
                                                                        em2.f fVarB39 = u.b(uVar, LDSFile.EF_DG13_TAG, true, tVar3, null, 72);
                                                                        em2.f fVarB40 = u.b(uVar, LDSFile.EF_DG14_TAG, true, tVar3, null, 72);
                                                                        em2.e[] eVarArr3 = new em2.e[19];
                                                                        eVarArr3[0] = dVarA10;
                                                                        eVarArr3[1] = dVarA11;
                                                                        eVarArr3[2] = dVarA12;
                                                                        eVarArr3[3] = dVarA13;
                                                                        eVarArr3[4] = dVarA14;
                                                                        eVarArr3[5] = dVarA15;
                                                                        eVarArr3[6] = dVarA16;
                                                                        eVarArr3[7] = dVarA17;
                                                                        eVarArr3[8] = dVarA18;
                                                                        eVarArr3[9] = dVarA19;
                                                                        eVarArr3[i21] = dVarA20;
                                                                        eVarArr3[11] = dVarA21;
                                                                        eVarArr3[12] = dVarA22;
                                                                        eVarArr3[13] = dVarA23;
                                                                        eVarArr3[14] = fVarB36;
                                                                        eVarArr3[15] = fVarB37;
                                                                        eVarArr3[16] = fVarB38;
                                                                        eVarArr3[17] = fVarB39;
                                                                        eVarArr3[18] = fVarB40;
                                                                        Pair pairD20 = nim.a.D(bVar19, zhm.v.k(eVarArr3));
                                                                        em2.b bVar20 = em2.b.NATURE;
                                                                        em2.d dVarA24 = u.a(uVar, 47, tVar3, null, 28);
                                                                        em2.d dVarA25 = u.a(uVar, 48, tVar3, null, 28);
                                                                        em2.d dVarA26 = u.a(uVar, 49, tVar3, null, 28);
                                                                        em2.d dVarA27 = u.a(uVar, 53, tVar3, null, 28);
                                                                        em2.d dVarA28 = u.a(uVar, 56, tVar3, null, 28);
                                                                        em2.d dVarA29 = u.a(uVar, 54, tVar3, null, 28);
                                                                        em2.d dVarA30 = u.a(uVar, 55, tVar3, null, 28);
                                                                        em2.d dVarA31 = u.a(uVar, 44, tVar3, null, 28);
                                                                        em2.d dVarA32 = u.a(uVar, 45, tVar3, null, 28);
                                                                        em2.d dVarA33 = u.a(uVar, 50, tVar3, null, 28);
                                                                        em2.d dVarA34 = u.a(uVar, 51, tVar3, null, 28);
                                                                        em2.d dVarA35 = u.a(uVar, 52, tVar3, null, 28);
                                                                        em2.d dVarA36 = u.a(uVar, 57, tVar3, null, 28);
                                                                        em2.d dVarA37 = u.a(uVar, 58, tVar3, null, 28);
                                                                        em2.e[] eVarArr4 = new em2.e[14];
                                                                        eVarArr4[0] = dVarA24;
                                                                        eVarArr4[1] = dVarA25;
                                                                        eVarArr4[2] = dVarA26;
                                                                        eVarArr4[3] = dVarA27;
                                                                        eVarArr4[4] = dVarA28;
                                                                        eVarArr4[5] = dVarA29;
                                                                        eVarArr4[6] = dVarA30;
                                                                        eVarArr4[7] = dVarA31;
                                                                        eVarArr4[8] = dVarA32;
                                                                        eVarArr4[9] = dVarA33;
                                                                        eVarArr4[i21] = dVarA34;
                                                                        eVarArr4[11] = dVarA35;
                                                                        eVarArr4[12] = dVarA36;
                                                                        eVarArr4[13] = dVarA37;
                                                                        Pair pairD21 = nim.a.D(bVar20, zhm.v.k(eVarArr4));
                                                                        em2.b bVar21 = em2.b.COLOURS;
                                                                        em2.d dVarA38 = u.a(uVar, 84, tVar4, null, 28);
                                                                        em2.d dVarA39 = u.a(uVar, 67, tVar4, null, 28);
                                                                        em2.d dVarA40 = u.a(uVar, 85, tVar4, null, 28);
                                                                        em2.d dVarA41 = u.a(uVar, 63, tVar4, null, 28);
                                                                        em2.d dVarA42 = u.a(uVar, 65, tVar4, null, 28);
                                                                        em2.d dVarA43 = u.a(uVar, 68, tVar4, null, 28);
                                                                        em2.d dVarA44 = u.a(uVar, 74, tVar4, null, 28);
                                                                        em2.d dVarA45 = u.a(uVar, 69, tVar4, null, 28);
                                                                        em2.d dVarA46 = u.a(uVar, 73, tVar4, null, 28);
                                                                        em2.d dVarA47 = u.a(uVar, 66, tVar4, null, 28);
                                                                        em2.d dVarA48 = u.a(uVar, 72, tVar4, null, 28);
                                                                        em2.d dVarA49 = u.a(uVar, 70, tVar4, null, 28);
                                                                        em2.d dVarA50 = u.a(uVar, 71, tVar4, null, 28);
                                                                        em2.d dVarA51 = u.a(uVar, 64, tVar4, null, 28);
                                                                        em2.e[] eVarArr5 = new em2.e[14];
                                                                        eVarArr5[0] = dVarA38;
                                                                        eVarArr5[1] = dVarA39;
                                                                        eVarArr5[2] = dVarA40;
                                                                        eVarArr5[3] = dVarA41;
                                                                        eVarArr5[4] = dVarA42;
                                                                        eVarArr5[5] = dVarA43;
                                                                        eVarArr5[6] = dVarA44;
                                                                        eVarArr5[7] = dVarA45;
                                                                        eVarArr5[8] = dVarA46;
                                                                        eVarArr5[9] = dVarA47;
                                                                        eVarArr5[i21] = dVarA48;
                                                                        eVarArr5[11] = dVarA49;
                                                                        eVarArr5[12] = dVarA50;
                                                                        eVarArr5[13] = dVarA51;
                                                                        Pair pairD22 = nim.a.D(bVar21, zhm.v.k(eVarArr5));
                                                                        em2.b bVar22 = em2.b.GRADIENTS;
                                                                        em2.d dVarA52 = u.a(uVar, 26, tVar3, null, 28);
                                                                        em2.d dVarA53 = u.a(uVar, 14, tVar3, null, 28);
                                                                        em2.d dVarA54 = u.a(uVar, 23, tVar3, null, 28);
                                                                        em2.d dVarA55 = u.a(uVar, 25, tVar3, null, 28);
                                                                        em2.d dVarA56 = u.a(uVar, 77, tVar3, null, 28);
                                                                        em2.d dVarA57 = u.a(uVar, 24, tVar3, null, 28);
                                                                        em2.d dVarA58 = u.a(uVar, 82, tVar3, null, 28);
                                                                        em2.d dVarA59 = u.a(uVar, 75, tVar3, null, 28);
                                                                        em2.d dVarA60 = u.a(uVar, 76, tVar3, null, 28);
                                                                        em2.d dVarA61 = u.a(uVar, 78, tVar3, null, 28);
                                                                        em2.d dVarA62 = u.a(uVar, 80, tVar3, null, 28);
                                                                        em2.e[] eVarArr6 = new em2.e[11];
                                                                        eVarArr6[0] = dVarA52;
                                                                        eVarArr6[1] = dVarA53;
                                                                        eVarArr6[2] = dVarA54;
                                                                        eVarArr6[3] = dVarA55;
                                                                        eVarArr6[4] = dVarA56;
                                                                        eVarArr6[5] = dVarA57;
                                                                        eVarArr6[6] = dVarA58;
                                                                        eVarArr6[7] = dVarA59;
                                                                        eVarArr6[8] = dVarA60;
                                                                        eVarArr6[9] = dVarA61;
                                                                        eVarArr6[i21] = dVarA62;
                                                                        Pair pairD23 = nim.a.D(bVar22, zhm.v.k(eVarArr6));
                                                                        em2.b bVar23 = em2.b.HALLOWEEN;
                                                                        em2.f fVarB41 = u.b(uVar, 116, true, tVar3, null, 104);
                                                                        em2.d dVarA63 = u.a(uVar, LDSFile.EF_DG2_TAG, tVar3, null, 28);
                                                                        em2.d dVarA64 = u.a(uVar, LDSFile.EF_DG4_TAG, tVar3, null, 28);
                                                                        em2.f fVarB42 = u.b(uVar, LDSFile.EF_SOD_TAG, true, tVar3, null, 104);
                                                                        em2.d dVarA65 = u.a(uVar, SyslogConstants.LOG_CLOCK, tVar3, null, 28);
                                                                        em2.d dVarA66 = u.a(uVar, 121, tVar3, null, 28);
                                                                        em2.d dVarA67 = u.a(uVar, 122, tVar3, null, 28);
                                                                        em2.f fVarB43 = u.b(uVar, 123, true, tVar3, null, 104);
                                                                        em2.f fVarB44 = u.b(uVar, 124, true, tVar3, null, 104);
                                                                        em2.f fVarB45 = u.b(uVar, ISO781611.SMT_TAG, true, tVar3, null, 104);
                                                                        em2.f fVarB46 = u.b(uVar, 126, true, tVar3, null, 104);
                                                                        em2.f fVarB47 = u.b(uVar, CertificateBody.profileType, true, tVar3, null, 104);
                                                                        em2.f fVarB48 = u.b(uVar, 128, true, tVar3, null, 104);
                                                                        em2.f fVarB49 = u.b(uVar, 129, true, tVar3, null, 104);
                                                                        em2.f fVarB50 = u.b(uVar, 130, true, tVar3, null, 104);
                                                                        em2.f fVarB51 = u.b(uVar, ISO781611.CREATION_DATE_AND_TIME_TAG, true, tVar3, null, 104);
                                                                        em2.e[] eVarArr7 = new em2.e[16];
                                                                        eVarArr7[0] = fVarB41;
                                                                        eVarArr7[1] = dVarA63;
                                                                        eVarArr7[2] = dVarA64;
                                                                        eVarArr7[3] = fVarB42;
                                                                        eVarArr7[4] = dVarA65;
                                                                        eVarArr7[5] = dVarA66;
                                                                        eVarArr7[6] = dVarA67;
                                                                        eVarArr7[7] = fVarB43;
                                                                        eVarArr7[8] = fVarB44;
                                                                        eVarArr7[9] = fVarB45;
                                                                        eVarArr7[i21] = fVarB46;
                                                                        eVarArr7[11] = fVarB47;
                                                                        eVarArr7[12] = fVarB48;
                                                                        eVarArr7[13] = fVarB49;
                                                                        eVarArr7[14] = fVarB50;
                                                                        eVarArr7[15] = fVarB51;
                                                                        Pair pairD24 = nim.a.D(bVar23, zhm.v.k(eVarArr7));
                                                                        Pair pairD25 = nim.a.D(em2.b.HALLOWEEN_LITE, zhm.v.k(u.b(uVar, 123, true, tVar3, null, 104), u.b(uVar, 124, true, tVar3, null, 104), u.b(uVar, ISO781611.SMT_TAG, true, tVar3, null, 104), u.b(uVar, 126, true, tVar3, null, 104)));
                                                                        em2.b bVar24 = em2.b.CHRISTMAS;
                                                                        em2.f fVarB52 = u.b(uVar, 139, true, tVar3, null, 72);
                                                                        em2.f fVarB53 = u.b(uVar, 140, true, tVar3, null, 72);
                                                                        em2.f fVarB54 = u.b(uVar, ModuleDescriptor.MODULE_VERSION, true, tVar3, null, 72);
                                                                        em2.f fVarB55 = u.b(uVar, 142, true, tVar3, null, 72);
                                                                        em2.f fVarB56 = u.b(uVar, 143, true, tVar3, null, 72);
                                                                        em2.f fVarB57 = u.b(uVar, SyslogConstants.LOG_LOCAL2, true, tVar3, null, 72);
                                                                        em2.f fVarB58 = u.b(uVar, 145, true, tVar3, null, 72);
                                                                        em2.f fVarB59 = u.b(uVar, 146, true, tVar3, null, 72);
                                                                        em2.f fVarB60 = u.b(uVar, 147, true, tVar3, null, 72);
                                                                        em2.f fVarB61 = u.b(uVar, 148, true, tVar3, null, 72);
                                                                        em2.f fVarB62 = u.b(uVar, 149, true, tVar3, null, 72);
                                                                        em2.f fVarB63 = u.b(uVar, 150, true, tVar3, null, 72);
                                                                        em2.f fVarB64 = u.b(uVar, ISO7816.TAG_SM_EXPECTED_LENGTH, true, tVar3, null, 72);
                                                                        em2.f fVarB65 = u.b(uVar, SyslogConstants.LOG_LOCAL3, true, tVar3, null, 72);
                                                                        em2.f fVarB66 = u.b(uVar, 153, true, tVar3, null, 72);
                                                                        em2.f fVarB67 = u.b(uVar, Constants.EMVTag.TAG_9A_TRANSACTION_DATE, true, tVar3, null, 72);
                                                                        em2.f fVarB68 = u.b(uVar, 155, true, tVar3, null, 72);
                                                                        em2.e[] eVarArr8 = new em2.e[17];
                                                                        eVarArr8[0] = fVarB52;
                                                                        eVarArr8[1] = fVarB53;
                                                                        eVarArr8[2] = fVarB54;
                                                                        eVarArr8[3] = fVarB55;
                                                                        eVarArr8[4] = fVarB56;
                                                                        eVarArr8[5] = fVarB57;
                                                                        eVarArr8[6] = fVarB58;
                                                                        eVarArr8[7] = fVarB59;
                                                                        eVarArr8[8] = fVarB60;
                                                                        eVarArr8[9] = fVarB61;
                                                                        eVarArr8[i21] = fVarB62;
                                                                        eVarArr8[11] = fVarB63;
                                                                        eVarArr8[12] = fVarB64;
                                                                        eVarArr8[13] = fVarB65;
                                                                        eVarArr8[14] = fVarB66;
                                                                        eVarArr8[15] = fVarB67;
                                                                        eVarArr8[16] = fVarB68;
                                                                        Pair pairD26 = nim.a.D(bVar24, zhm.v.k(eVarArr8));
                                                                        em2.b bVar25 = em2.b.UPBEAT;
                                                                        em2.f fVarB69 = u.b(uVar, 177, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB70 = u.b(uVar, 178, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB71 = u.b(uVar, 179, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB72 = u.b(uVar, 180, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB73 = u.b(uVar, 181, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB74 = u.b(uVar, 182, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB75 = u.b(uVar, 183, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB76 = u.b(uVar, SyslogConstants.LOG_LOCAL7, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB77 = u.b(uVar, 185, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB78 = u.b(uVar, 186, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB79 = u.b(uVar, 187, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.f fVarB80 = u.b(uVar, 188, false, tVar3, null, SyslogConstants.LOG_CLOCK);
                                                                        em2.e[] eVarArr9 = new em2.e[12];
                                                                        eVarArr9[0] = fVarB69;
                                                                        eVarArr9[1] = fVarB70;
                                                                        eVarArr9[2] = fVarB71;
                                                                        eVarArr9[3] = fVarB72;
                                                                        eVarArr9[4] = fVarB73;
                                                                        eVarArr9[5] = fVarB74;
                                                                        eVarArr9[6] = fVarB75;
                                                                        eVarArr9[7] = fVarB76;
                                                                        eVarArr9[8] = fVarB77;
                                                                        eVarArr9[9] = fVarB78;
                                                                        eVarArr9[i21] = fVarB79;
                                                                        eVarArr9[11] = fVarB80;
                                                                        Pair pairD27 = nim.a.D(bVar25, zhm.v.k(eVarArr9));
                                                                        Pair pairD28 = nim.a.D(em2.b.INVEST, zhm.u.c(u.a(uVar, 189, tVar3, null, 28)));
                                                                        em2.b bVar26 = em2.b.MINIMAL;
                                                                        e.a aVar = e.a.f127582a;
                                                                        Pair pairD29 = nim.a.D(bVar26, zhm.u.c(aVar));
                                                                        em2.b bVar27 = em2.b.PRIDE;
                                                                        ArrayList arrayList30 = new ArrayList(28);
                                                                        int i112 = 208;
                                                                        while (i112 < 236) {
                                                                            arrayList30.add(u.a(uVar, i112, t.DARK, s8.INTRICATE, 24));
                                                                            i112++;
                                                                            pairD27 = pairD27;
                                                                            pairD24 = pairD24;
                                                                        }
                                                                        Pair pair9 = pairD27;
                                                                        Pair pair10 = pairD24;
                                                                        Unit unit13 = Unit.f186387a;
                                                                        Pair pairD30 = nim.a.D(bVar27, arrayList30);
                                                                        Pair pairD31 = nim.a.D(em2.b.BUSINESS, zhm.u.c(aVar));
                                                                        em2.b bVar28 = em2.b.BUSINESS_BLUE;
                                                                        t tVar5 = t.LIGHT;
                                                                        Pair pairD32 = nim.a.D(bVar28, zhm.u.c(u.b(uVar, 301, true, tVar5, null, SyslogConstants.LOG_CLOCK)));
                                                                        Pair pairD33 = nim.a.D(em2.b.BUSINESS_GREEN, zhm.u.c(u.b(uVar, 302, true, tVar5, null, SyslogConstants.LOG_CLOCK)));
                                                                        Pair pairD34 = nim.a.D(em2.b.BUSINESS_ORANGE, zhm.u.c(u.b(uVar, 303, true, tVar5, null, SyslogConstants.LOG_CLOCK)));
                                                                        Pair pairD35 = nim.a.D(em2.b.BUSINESS_TEAL, zhm.u.c(u.b(uVar, 304, true, tVar5, null, SyslogConstants.LOG_CLOCK)));
                                                                        Pair pairD36 = nim.a.D(em2.b.BUSINESS_PURPLE, zhm.u.c(u.b(uVar, 305, true, tVar5, null, SyslogConstants.LOG_CLOCK)));
                                                                        em2.b bVar29 = em2.b.BUSINESS_MIDNIGHT_BLUE;
                                                                        t tVar6 = t.LIGHT_DARK;
                                                                        Pair pairD37 = nim.a.D(bVar29, zhm.u.c(u.b(uVar, 533, true, tVar6, null, SyslogConstants.LOG_CLOCK)));
                                                                        Pair pairD38 = nim.a.D(em2.b.BUSINESS_INDIGO, zhm.u.c(u.b(uVar, 534, true, tVar6, null, SyslogConstants.LOG_CLOCK)));
                                                                        Pair pairD39 = nim.a.D(em2.b.BUSINESS_OLIVE, zhm.u.c(u.b(uVar, 535, true, tVar6, null, SyslogConstants.LOG_CLOCK)));
                                                                        Pair pairD40 = nim.a.D(em2.b.BUSINESS_TEAL_2, zhm.u.c(u.b(uVar, 536, true, tVar6, null, SyslogConstants.LOG_CLOCK)));
                                                                        Pair pairD41 = nim.a.D(em2.b.BUSINESS_WARM, zhm.u.c(u.b(uVar, 538, true, tVar6, null, SyslogConstants.LOG_CLOCK)));
                                                                        Pair pairD42 = nim.a.D(em2.b.BUSINESS_TITAN, zhm.u.c(u.b(uVar, 537, true, tVar6, null, SyslogConstants.LOG_CLOCK)));
                                                                        Pair pairD43 = nim.a.D(em2.b.REVOLUT_X, zhm.u.c(u.b(uVar, 306, true, t.NONE, s8.INTRICATE, 112)));
                                                                        em2.b bVar30 = em2.b.LAVA;
                                                                        ArrayList arrayList31 = new ArrayList(11);
                                                                        int i113 = 352;
                                                                        while (true) {
                                                                            int i114 = 363;
                                                                            if (i113 < 363) {
                                                                                em2.b bVar31 = bVar30;
                                                                                int i115 = i113;
                                                                                ArrayList arrayList32 = arrayList31;
                                                                                arrayList32.add(u.b(uVar, i115, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                                                i113 = i115 + 1;
                                                                                bVar30 = bVar31;
                                                                                arrayList31 = arrayList32;
                                                                                pairD31 = pairD31;
                                                                                pairD43 = pairD43;
                                                                            } else {
                                                                                Pair pair11 = pairD43;
                                                                                Pair pair12 = pairD31;
                                                                                Unit unit14 = Unit.f186387a;
                                                                                Pair pairD44 = nim.a.D(bVar30, arrayList31);
                                                                                em2.b bVar32 = em2.b.ALEX_K;
                                                                                ArrayList arrayList33 = new ArrayList(11);
                                                                                while (true) {
                                                                                    int i116 = 374;
                                                                                    if (i114 < 374) {
                                                                                        arrayList33.add(u.a(uVar, i114, t.NONE, null, 28));
                                                                                        i114++;
                                                                                    } else {
                                                                                        Unit unit15 = Unit.f186387a;
                                                                                        Pair pairD45 = nim.a.D(bVar32, arrayList33);
                                                                                        em2.b bVar33 = em2.b.GEOMETRIC;
                                                                                        ArrayList arrayList34 = new ArrayList(11);
                                                                                        while (true) {
                                                                                            int i117 = 385;
                                                                                            if (i116 < 385) {
                                                                                                ArrayList arrayList35 = arrayList34;
                                                                                                em2.b bVar34 = bVar33;
                                                                                                int i118 = i116;
                                                                                                arrayList35.add(u.b(uVar, i118, true, t.NONE, s8.INTRICATE, 112));
                                                                                                i116 = i118 + 1;
                                                                                                bVar33 = bVar34;
                                                                                                arrayList34 = arrayList35;
                                                                                                pairD45 = pairD45;
                                                                                                pairD44 = pairD44;
                                                                                            } else {
                                                                                                Pair pair13 = pairD44;
                                                                                                Pair pair14 = pairD45;
                                                                                                Unit unit16 = Unit.f186387a;
                                                                                                Pair pairD46 = nim.a.D(bVar33, arrayList34);
                                                                                                em2.b bVar35 = em2.b.DOGS;
                                                                                                ArrayList arrayList36 = new ArrayList(11);
                                                                                                while (true) {
                                                                                                    int i119 = 396;
                                                                                                    if (i117 < 396) {
                                                                                                        ArrayList arrayList37 = arrayList36;
                                                                                                        int i120 = i117;
                                                                                                        arrayList37.add(u.b(uVar, i120, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                                                                        i117 = i120 + 1;
                                                                                                        arrayList36 = arrayList37;
                                                                                                        pairD46 = pairD46;
                                                                                                    } else {
                                                                                                        Pair pair15 = pairD46;
                                                                                                        ArrayList arrayList38 = arrayList36;
                                                                                                        Unit unit17 = Unit.f186387a;
                                                                                                        Pair pairD47 = nim.a.D(bVar35, arrayList38);
                                                                                                        em2.b bVar36 = em2.b.PSYCHEDELIC;
                                                                                                        ArrayList arrayList39 = new ArrayList(15);
                                                                                                        while (true) {
                                                                                                            int i121 = WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE;
                                                                                                            if (i119 < 411) {
                                                                                                                ArrayList arrayList40 = arrayList39;
                                                                                                                int i122 = i119;
                                                                                                                arrayList40.add(u.b(uVar, i122, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                                                                                i119 = i122 + 1;
                                                                                                                arrayList39 = arrayList40;
                                                                                                                pairD47 = pairD47;
                                                                                                            } else {
                                                                                                                Pair pair16 = pairD47;
                                                                                                                ArrayList arrayList41 = arrayList39;
                                                                                                                Unit unit18 = Unit.f186387a;
                                                                                                                Pair pairD48 = nim.a.D(bVar36, arrayList41);
                                                                                                                em2.b bVar37 = em2.b.VELVET;
                                                                                                                ArrayList arrayList42 = new ArrayList(11);
                                                                                                                while (true) {
                                                                                                                    int i123 = 422;
                                                                                                                    if (i121 >= 422) {
                                                                                                                        Pair pair17 = pairD48;
                                                                                                                        ArrayList arrayList43 = arrayList42;
                                                                                                                        Unit unit19 = Unit.f186387a;
                                                                                                                        Pair pairD49 = nim.a.D(bVar37, arrayList43);
                                                                                                                        em2.b bVar38 = em2.b.FLOWERS;
                                                                                                                        ArrayList arrayList44 = new ArrayList(11);
                                                                                                                        int i124 = OnfidoActivity.ONFIDO_RECREATE;
                                                                                                                        while (i123 < i124) {
                                                                                                                            ArrayList arrayList45 = arrayList44;
                                                                                                                            int i125 = i123;
                                                                                                                            arrayList45.add(u.b(uVar, i125, true, t.DARK, null, SyslogConstants.LOG_CLOCK));
                                                                                                                            i123 = i125 + 1;
                                                                                                                            arrayList44 = arrayList45;
                                                                                                                            i124 = i124;
                                                                                                                            pairD49 = pairD49;
                                                                                                                        }
                                                                                                                        Pair pair18 = pairD49;
                                                                                                                        ArrayList arrayList46 = arrayList44;
                                                                                                                        Unit unit20 = Unit.f186387a;
                                                                                                                        Pair pairD50 = nim.a.D(bVar38, arrayList46);
                                                                                                                        em2.b bVar39 = em2.b.JUNIOR_GLOW;
                                                                                                                        ArrayList arrayList47 = new ArrayList(i21);
                                                                                                                        int i126 = 467;
                                                                                                                        while (i126 < 477) {
                                                                                                                            ArrayList arrayList48 = arrayList47;
                                                                                                                            int i127 = i126;
                                                                                                                            arrayList48.add(u.b(uVar, i127, true, t.DARK, null, SyslogConstants.LOG_CLOCK));
                                                                                                                            i126 = i127 + 1;
                                                                                                                            arrayList47 = arrayList48;
                                                                                                                            pairD50 = pairD50;
                                                                                                                        }
                                                                                                                        Pair pair19 = pairD50;
                                                                                                                        ArrayList arrayList49 = arrayList47;
                                                                                                                        Unit unit21 = Unit.f186387a;
                                                                                                                        Pair pairD51 = nim.a.D(bVar39, arrayList49);
                                                                                                                        em2.b bVar40 = em2.b.TRAVERTINE;
                                                                                                                        ArrayList arrayList50 = new ArrayList(11);
                                                                                                                        int i128 = 281;
                                                                                                                        while (i128 < 292) {
                                                                                                                            ArrayList arrayList51 = arrayList50;
                                                                                                                            int i129 = i128;
                                                                                                                            arrayList51.add(u.b(uVar, i129, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                                                                                            i128 = i129 + 1;
                                                                                                                            arrayList50 = arrayList51;
                                                                                                                            pairD51 = pairD51;
                                                                                                                        }
                                                                                                                        Pair pair20 = pairD51;
                                                                                                                        ArrayList arrayList52 = arrayList50;
                                                                                                                        Unit unit22 = Unit.f186387a;
                                                                                                                        Pair pairD52 = nim.a.D(bVar40, arrayList52);
                                                                                                                        em2.b bVar41 = em2.b.UK_LANDSCAPES;
                                                                                                                        ArrayList arrayList53 = new ArrayList(11);
                                                                                                                        int i130 = 521;
                                                                                                                        while (i130 < 532) {
                                                                                                                            ArrayList arrayList54 = arrayList53;
                                                                                                                            int i131 = i130;
                                                                                                                            arrayList54.add(u.b(uVar, i131, true, t.NONE, null, SyslogConstants.LOG_CLOCK));
                                                                                                                            i130 = i131 + 1;
                                                                                                                            arrayList53 = arrayList54;
                                                                                                                            pairD52 = pairD52;
                                                                                                                        }
                                                                                                                        Unit unit23 = Unit.f186387a;
                                                                                                                        return r0.k(pair4, pairD2, pair7, pairD4, pairD5, pairD6, pairD7, pairD8, pair2, pair3, pair5, pairD12, pairD13, pair6, pair8, pairD16, pairD17, pairD18, pairD19, pairD20, pairD21, pairD22, pairD23, pair10, pairD25, pairD26, pair9, pairD28, pairD29, pairD30, pair12, pairD32, pairD33, pairD34, pairD35, pairD36, pairD37, pairD38, pairD39, pairD40, pairD41, pairD42, pair11, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pairD52, nim.a.D(bVar41, arrayList53));
                                                                                                                    }
                                                                                                                    ArrayList arrayList55 = arrayList42;
                                                                                                                    int i132 = i121;
                                                                                                                    arrayList55.add(u.b(uVar, i132, true, t.DARK, null, SyslogConstants.LOG_CLOCK));
                                                                                                                    i121 = i132 + 1;
                                                                                                                    arrayList42 = arrayList55;
                                                                                                                    pairD48 = pairD48;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        ArrayList arrayListU = zhm.w.u(((Map) this.f185708b.f185709a.getValue()).values());
                        int iB = q0.b(zhm.w.t(arrayListU, 10));
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
                        for (Object obj2 : arrayListU) {
                            linkedHashMap.put(((em2.e) obj2).a(), obj2);
                        }
                        return linkedHashMap;
                }
            }
        });
    }

    public static em2.d a(u uVar, int i, t tVar, s8 s8Var, int i2) {
        if ((i2 & 4) != 0) {
            s8Var = s8.DEFAULT;
        }
        s8 s8Var2 = s8Var;
        String strB0 = d0.b0(String.valueOf(i), 3, '0');
        String strC = c(5);
        String strC2 = c(5);
        StringBuilder sbT = p.a.t(strC, "/wallpaper_images/full_size_tall", tVar.b(), "/bg", strB0);
        sbT.append("@2x.png");
        String string = sbT.toString();
        StringBuilder sbT2 = p.a.t(strC, "/wallpaper_images/full_size_tall", tVar.a(), "/bg", strB0);
        sbT2.append("@2x.png");
        String string2 = sbT2.toString();
        StringBuilder sbT3 = p.a.t(strC2, "/wallpaper_images/thumbnail", tVar.b(), "/bg", strB0);
        sbT3.append("@2x.png");
        String string3 = sbT3.toString();
        StringBuilder sbT4 = p.a.t(strC2, "/wallpaper_images/thumbnail", tVar.a(), "/bg", strB0);
        sbT4.append("@2x.png");
        return new em2.d(j6.a.q("bg", strB0), string, string2, string3, sbT4.toString(), false, false, s8Var2);
    }

    public static em2.f b(u uVar, int i, boolean z, t tVar, s8 s8Var, int i2) {
        if ((i2 & 8) != 0) {
            s8Var = s8.DEFAULT;
        }
        s8 s8Var2 = s8Var;
        int i3 = (i2 & 16) != 0 ? 5 : 6;
        int i5 = (i2 & 32) != 0 ? 5 : 6;
        String strB0 = d0.b0(String.valueOf(i), 3, '0');
        String strC = c(i3);
        String strC2 = c(i5);
        String strI = v0.a.i(p.a.t(strC, "/wallpaper_videos/full_video_tall", tVar.b(), "/bg", strB0), "", ".mp4");
        String strI2 = v0.a.i(p.a.t(strC, "/wallpaper_videos/full_video_tall", tVar.a(), "/bg", strB0), "", ".mp4");
        StringBuilder sbT = p.a.t(strC2, "/wallpaper_videos/thumbnail", tVar.b(), "/bg", strB0);
        sbT.append("@2x.png");
        String string = sbT.toString();
        StringBuilder sbT2 = p.a.t(strC2, "/wallpaper_videos/thumbnail", tVar.a(), "/bg", strB0);
        sbT2.append("@2x.png");
        return new em2.f(j6.a.q("bg", strB0), strI, strI2, string, sbT2.toString(), z, s8Var2);
    }

    public static String c(int i) {
        return a0.d.n("https://assets.revolut.com/mobile/media_library/v", i);
    }
}
