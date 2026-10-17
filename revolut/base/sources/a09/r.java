package a09;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.nfc.tech.IsoDep;
import androidx.room.util.DBUtil;
import be0.b;
import com.airbnb.lottie.LottieAnimationView;
import com.github.devnied.emvnfccard.model.EmvCard;
import com.github.devnied.emvnfccard.parser.EmvTemplate;
import com.github.devnied.emvnfccard.utils.AtrUtils;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.InhouseAnalyticsRepository;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.AnalyticsEvent;
import com.onfido.android.sdk.capture.internal.performance.repository.PerformanceAnalyticsRepository;
import com.onfido.android.sdk.capture.internal.ui.countryselection.CountrySelectionPresenter;
import com.onfido.android.sdk.capture.internal.util.logging.LoggerRepository;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.data.model.Data;
import com.revolut.feature.card.verification.api.navigation.CardPennyTopUpDestination;
import com.revolut.feature.check_topup.api.data.SDKScanResult;
import com.revolut.feature.kyc.impl.choosedocument.model.SelectedKycDocs;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.revolutpay.api.declaration.RevolutPayApi$Toggles;
import com.revolut.feature.revolutpay.api.shared.deeplink.RevolutPayOrderParameters;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import cu8.j1;
import cu8.n1;
import fr.devnied.bitlib.BytesUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.ZipInputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import okhttp3.MultipartBody$Part;
import okhttp3.RequestBody;
import skm.p0;
import tof.q6;
import ulm.a1;
import ulm.b1;
import ulm.e1;
import ulm.k1;
import ulm.p1;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f282c;

    public /* synthetic */ r(Object obj2, Object obj3, int i) {
        this.f280a = i;
        this.f281b = obj2;
        this.f282c = obj3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        u09.p pVar;
        efm.k kVarB;
        File fileD;
        File fileD2;
        byte[] historicalBytes;
        int i = this.f280a;
        int i2 = 28;
        int i3 = 22;
        int i5 = 5;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object obj2 = this.f282c;
        Object obj3 = this.f281b;
        switch (i) {
            case 0:
                String str = (String) obj2;
                hz8.k kVar = ((w) obj3).f289b;
                jz8.n nVar = (jz8.n) DBUtil.performBlocking(kVar.f157078a, true, false, new hul.v(kVar, str, 17));
                if (nVar != null) {
                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                    pVar = new u09.p(nVar.f179641a, nVar.f179642b, nVar.f179643c, nVar.d, nVar.e);
                } else {
                    pVar = null;
                }
                return new Data(pVar, pVar == null ? new Exception(p.a.p("glossary item with id=", str, " is absent")) : null, false, 4, null);
            case 1:
                ((a6b.g) obj3).f1594a.c(new FeatureCommand((FeatureConfig) obj2));
                return Unit.f186387a;
            case 2:
                return ((a80.h) obj3).k((String) obj2);
            case 3:
                bbm.a transformer = (bbm.a) obj3;
                abm.e this$0 = (abm.e) obj2;
                Intrinsics.checkNotNullParameter(transformer, "$transformer");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return transformer.invoke(this$0.f2993a.get());
            case 4:
                ((ar3.c) obj3).getClass();
                return new Data(ar3.c.a((List) obj2), null, false, 6, null);
            case 5:
                be0.b bVar = (be0.b) obj3;
                be0.e eVar = (be0.e) obj2;
                yd0.b bVar2 = eVar.f14650c;
                if (bVar instanceof be0.c) {
                    Boolean bool = (Boolean) bVar2.f312635a.T2("KEY_CURRENCIES_CACHED", Boolean.TYPE);
                    if (!(bool != null ? bool.booleanValue() : false)) {
                        throw new IllegalStateException("Data not cached via network!", ((be0.c) bVar).f14646a);
                    }
                }
                xd0.a aVar = bVar2.f312636b;
                if (aVar == null) {
                    aVar = (xd0.a) bVar2.f312635a.T2("KEY_CURRENCIES_INFO", xd0.a.class);
                    bVar2.f312636b = aVar;
                }
                if (aVar != null) {
                    return eVar.f14649b.c(aVar);
                }
                return null;
            case 6:
                be0.e eVar2 = (be0.e) obj3;
                ae0.b bVar3 = eVar2.f14649b;
                sd0.f fVar = (sd0.f) obj2;
                sd0.f fVar2 = sd0.f.CACHE;
                rfm.h maybe = rfm.h.f253943a;
                if (fVar != fVar2) {
                    mm0.o oVarD = ((cn0.g) eVar2.e).d();
                    if (!(oVarD instanceof mm0.n) && !(oVarD instanceof mm0.p)) {
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "CurrencyInfoRepositoryImpl", "Currency " + fVar + " skipped — no authorized session", null, h0Var);
                        return maybe;
                    }
                }
                sd0.f[] elements = {sd0.f.FORCE_RELOAD, sd0.f.LAZY_RELOAD};
                Intrinsics.checkNotNullParameter(elements, "elements");
                boolean zContains = kotlin.collections.d.y0(elements).contains(fVar);
                int i6 = be0.d.f14647a[fVar.ordinal()];
                if (i6 != 1) {
                    b.a aVar2 = b.a.f14645a;
                    if (i6 == 2) {
                        rfm.o oVar = new rfm.o(new r(aVar2, eVar2, i5));
                        Intrinsics.checkNotNullExpressionValue(oVar, "fromCallable(...)");
                        kVarB = oVar;
                    } else {
                        if (i6 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        rfm.o oVar2 = new rfm.o(new r(aVar2, eVar2, i5));
                        Intrinsics.checkNotNullExpressionValue(oVar2, "fromCallable(...)");
                        kVarB = oVar2.m(new rfm.d(new a31.l(eVar2, i5), iPow));
                        Intrinsics.checkNotNullExpressionValue(kVarB, "switchIfEmpty(...)");
                    }
                } else {
                    kVarB = eVar2.b();
                }
                rfm.w wVarH0 = te0.w.h0(kVarB);
                if (zContains) {
                    return wVarH0;
                }
                rfm.d dVar = new rfm.d(new a0.b(eVar2.d, i2), objArr7 == true ? 1 : 0);
                Intrinsics.checkNotNullExpressionValue(dVar, "create(...)");
                int i21 = 0;
                int i22 = 1;
                rfm.m mVar = new rfm.m(te0.w.h0(dVar), new bce.e(new ax9.d(i22, bVar3, ae0.b.class, "configToEntity", "configToEntity(Lcom/revolut/core/currency/api/CurrenciesConfig;)Lcom/revolut/core/currency/impl/entity/CurrenciesConfigEntity;", i21, 10), 12), iPow);
                bce.e eVar3 = new bce.e(new ax9.d(1, eVar2.f14650c, yd0.b.class, "putCurrenciesInfo", "putCurrenciesInfo(Lcom/revolut/core/currency/impl/entity/CurrenciesConfigEntity;)V", 0, 11), 13);
                dfm.c cVar = mfm.f.d;
                rfm.m mVar2 = new rfm.m(new rfm.y(mVar, cVar, eVar3, cVar, mfm.f.f205043c), new bce.e(new ax9.d(i22, bVar3, ae0.b.class, "currenciesInfoEntityToDomain", "currenciesInfoEntityToDomain(Lcom/revolut/core/currency/impl/entity/CurrenciesConfigEntity;)Ljava/util/Map;", i21, 12), 14), iPow);
                Intrinsics.checkNotNullExpressionValue(mVar2, "map(...)");
                Intrinsics.checkNotNullExpressionValue(maybe, "empty(...)");
                zhm.h0 customKeys = zhm.h0.f322473a;
                Intrinsics.checkNotNullParameter(wVarH0, "<this>");
                Intrinsics.checkNotNullParameter(customKeys, "customKeys");
                Intrinsics.checkNotNullParameter(maybe, "maybe");
                rfm.m mVar3 = new rfm.m(ue0.e.s(wVarH0, customKeys), new mfm.d(maybe), 2);
                Intrinsics.checkNotNullExpressionValue(mVar3, "onErrorResumeNext(...)");
                rfm.z zVarM = mVar3.m(mVar2);
                Intrinsics.checkNotNullExpressionValue(zVarM, "switchIfEmpty(...)");
                return zVarM;
            case 7:
                SDKScanResult sDKScanResult = (SDKScanResult) obj2;
                f80.a aVar3 = ((bg3.a) obj3).f15092a;
                String str2 = sDKScanResult.f65764a;
                String str3 = sDKScanResult.f65765b;
                f80.b bVar4 = (f80.b) aVar3;
                Uri uriF = bVar4.f(str2);
                if (uriF != null && (fileD = bVar4.d(uriF)) != null) {
                    if (!fileD.exists()) {
                        fileD = null;
                    }
                    if (fileD != null) {
                        Uri uriF2 = bVar4.f(str3);
                        if (uriF2 != null && (fileD2 = bVar4.d(uriF2)) != null) {
                            File file = fileD2.exists() ? fileD2 : null;
                            if (file != null) {
                                e1 e1Var = MultipartBody$Part.Companion;
                                String name = fileD.getName();
                                p1 p1Var = RequestBody.Companion;
                                b1.Companion.getClass();
                                b1 b1VarA = a1.a("image/png");
                                p1Var.getClass();
                                k1 k1VarA = p1.a(fileD, b1VarA);
                                e1Var.getClass();
                                return new Pair(e1.c("frontImage", name, k1VarA), e1.c("backImage", file.getName(), p1.a(file, a1.a("image/png"))));
                            }
                        }
                        throw new IllegalArgumentException("File doesn't exist: ".concat(str3));
                    }
                }
                throw new IllegalArgumentException(j6.a.q("File doesn't exist: ", sDKScanResult.f65764a));
            case 8:
                o97.y yVar = (o97.y) obj3;
                blh.i iVar = (blh.i) obj2;
                Object obj4 = yVar.f223136b;
                Object obj5 = yVar.e;
                boolean z = obj5 instanceof vh;
                o97.e eVar4 = o97.e.f223096a;
                if (z) {
                    o5d.a aVar4 = iVar.f16660g;
                    if (aVar4 == null) {
                        return eVar4;
                    }
                    aVar4.b3((vh) obj5);
                    return eVar4;
                }
                if (!(obj4 instanceof clh.v)) {
                    return eVar4;
                }
                clh.v vVar = (clh.v) obj4;
                if (vVar instanceof clh.s) {
                    return new o97.d(new AssetDetailsDestination(((clh.s) obj4).f25009a.f214596b, null, false, "GlobalSearch", null, null, 54));
                }
                if (vVar instanceof clh.u) {
                    iVar.f.onNext(Boolean.valueOf(((clh.u) obj4).f25012b));
                    return eVar4;
                }
                if ((vVar instanceof clh.t) || (vVar instanceof clh.r)) {
                    return eVar4;
                }
                throw new NoWhenBranchMatchedException();
            case 9:
                ((bwi.d) obj3).f19358a.c((NaviCommand) obj2);
                return Unit.f186387a;
            case 10:
                LocationDomain location = (LocationDomain) obj2;
                b49.c cVar2 = ((c49.d) obj3).d;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(location, "location");
                if (!Geocoder.isPresent()) {
                    return null;
                }
                try {
                    List<Address> fromLocation = cVar2.f12205a.getFromLocation(location.f78066a, location.f78067b, 1);
                    if (fromLocation != null) {
                        return (Address) zhm.d0.d0(fromLocation);
                    }
                    return null;
                } catch (IOException e) {
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var2);
                    return null;
                }
            case 11:
                return ((c49.d) obj3).d.a((String) obj2);
            case 12:
                jf0.c cVar3 = (jf0.c) obj3;
                cmc.h hVar = (cmc.h) obj2;
                boolean zF = Intrinsics.f(cVar3.d.get("presentation_type"), "inline");
                String strE = cVar3.e(2);
                int i32 = 23;
                int i33 = 27;
                switch (strE.hashCode()) {
                    case -2078336025:
                        if (strE.equals("pending-onboarding-topup-declined")) {
                            efm.d0 d0VarC = hVar.c();
                            int i43 = 26;
                            ch6.d dVar2 = new ch6.d(new cjj.j(hVar, i43), i43);
                            d0VarC.getClass();
                            ufm.i iVar2 = new ufm.i(d0VarC, dVar2, 0);
                            Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                            return iVar2;
                        }
                        break;
                    case -679758134:
                        if (strE.equals("periodic-review")) {
                            ufm.i iVar3 = new ufm.i(te0.w.o0(kotlin.coroutines.g.f186406a, new af3.f((Object) hVar, zF, (Continuation) (objArr == true ? 1 : 0), 6)), new ch6.d(new cjj.j(i32), 20), 1);
                            Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                            return iVar3;
                        }
                        break;
                    case -671237202:
                        if (strE.equals("recurring-deposit")) {
                            ufm.i iVar4 = new ufm.i(te0.w.o0(kotlin.coroutines.g.f186406a, new cmc.e(hVar, objArr2 == true ? 1 : 0, objArr8 == true ? 1 : 0)), new ch6.d(new cjj.j(i3), 19), 1);
                            Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                            return iVar4;
                        }
                        break;
                    case -127352622:
                        if (strE.equals("onboardingapplicationfailed")) {
                            efm.d0 d0VarC2 = hVar.c();
                            int i59 = 25;
                            ch6.d dVar3 = new ch6.d(new cjj.j(hVar, i59), i59);
                            d0VarC2.getClass();
                            ufm.i iVar5 = new ufm.i(d0VarC2, dVar3, 0);
                            Intrinsics.checkNotNullExpressionValue(iVar5, "flatMap(...)");
                            return iVar5;
                        }
                        break;
                    case 0:
                        if (strE.equals("")) {
                            efm.d0 d0VarC3 = hVar.c();
                            ch6.d dVar4 = new ch6.d(new cmc.b(hVar, objArr9 == true ? 1 : 0), i3);
                            d0VarC3.getClass();
                            ufm.i iVar6 = new ufm.i(d0VarC3, dVar4, 0);
                            Intrinsics.checkNotNullExpressionValue(iVar6, "flatMap(...)");
                            return iVar6;
                        }
                        break;
                    case 21116443:
                        if (strE.equals("onboarding")) {
                            com.revolut.feature.robo.impl.navigation.c cVar4 = (com.revolut.feature.robo.impl.navigation.c) hVar.f25204b;
                            cVar4.getClass();
                            ufm.i iVar7 = new ufm.i(ue0.e.t(te0.w.o0(kotlin.coroutines.g.f186406a, new fmc.e(cVar4, true, zF, null)), zhm.h0.f322473a), new ch6.d(new cmc.c(4), i32), 1);
                            Intrinsics.checkNotNullExpressionValue(iVar7, "map(...)");
                            return iVar7;
                        }
                        break;
                    case 473219998:
                        if (strE.equals("investor-update")) {
                            ufm.i iVar8 = new ufm.i(te0.w.o0(p0.f264003c, new cmc.f(hVar, cVar3, objArr3 == true ? 1 : 0, objArr10 == true ? 1 : 0)), new ch6.d(new cjj.j(24), 21), 1);
                            Intrinsics.checkNotNullExpressionValue(iVar8, "map(...)");
                            return iVar8;
                        }
                        break;
                    case 642710374:
                        if (strE.equals("spare-change")) {
                            ufm.i iVar9 = new ufm.i(te0.w.o0(kotlin.coroutines.g.f186406a, new c84.y(hVar, objArr4 == true ? 1 : 0, i33)), new cmc.d(new cmc.c(i5), i5), 1);
                            Intrinsics.checkNotNullExpressionValue(iVar9, "map(...)");
                            return iVar9;
                        }
                        break;
                    case 881912826:
                        if (strE.equals("portfoliodetails")) {
                            ufm.i iVar10 = new ufm.i(te0.w.o0(kotlin.coroutines.g.f186406a, new cmc.e(hVar, objArr5 == true ? 1 : 0, iPow)), new ch6.d(new cjj.j(i2), i2), 1);
                            Intrinsics.checkNotNullExpressionValue(iVar10, "map(...)");
                            return iVar10;
                        }
                        break;
                    case 1434631203:
                        if (strE.equals("settings")) {
                            ufm.i iVar11 = new ufm.i(te0.w.o0(kotlin.coroutines.g.f186406a, new cmc.f(hVar, cVar3, objArr6 == true ? 1 : 0, iPow)), new ch6.d(new cjj.j(i33), i33), 1);
                            Intrinsics.checkNotNullExpressionValue(iVar11, "map(...)");
                            return iVar11;
                        }
                        break;
                }
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "RoboDeeplinkActionPerformerImpl", p.a.p("Unexpected deeplink ", cVar3.f173629c, ", opening Robo Home"), null, null, 16);
                return efm.d0.m(cmc.j.f25211a);
            case 13:
                return InhouseAnalyticsRepository.track$lambda$0((InhouseAnalyticsRepository) obj3, (AnalyticsEvent) obj2);
            case 14:
                return PerformanceAnalyticsRepository.track$lambda$0((PerformanceAnalyticsRepository) obj3, (AnalyticsEvent) obj2);
            case 15:
                return CountrySelectionPresenter.getCountryAvailabilities$lambda$1((List) obj3, (CountrySelectionPresenter) obj2);
            case 16:
                return LoggerRepository.sendLogs$lambda$3((LoggerRepository) obj3, (List) obj2);
            case 17:
                String path = (String) obj2;
                int i66 = ((cpa.a) obj3).f107911a;
                Intrinsics.checkNotNullParameter(path, "path");
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(path, options);
                iPow = (options.outHeight > i66 || options.outWidth > i66) ? (int) Math.pow(2.0d, Math.round(Math.log(((double) i66) / ((double) Math.max(r3, options.outWidth))) / Math.log(0.5d))) : 1;
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                options2.inSampleSize = iPow;
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(path, options2);
                if (bitmapDecodeFile != null) {
                    return do3.q.A(do3.q.g(bitmapDecodeFile, path));
                }
                throw new IllegalStateException("unable to decode profile image file");
            case 18:
                j1 j1Var = ((com.revolut.feature.kyc.impl.b) obj3).e;
                ((n1) j1Var).H0().set(com.revolut.feature.kyc.impl.choosedocument.model.a.d((SelectedKycDocs) ((n1) j1Var).H0().get(), (List) obj2));
                return Unit.f186387a;
            case 19:
                return LottieAnimationView.a((LottieAnimationView) obj3, (String) obj2);
            case 20:
                return d7.n.e(u1.r((InputStream) obj3), (String) obj2);
            case 21:
                return d7.n.i(null, (ZipInputStream) obj3, (String) obj2);
            case 22:
                d8c.c cVar5 = (d8c.c) obj3;
                xq2.a aVar5 = (xq2.a) obj2;
                if (!((jte.d) cVar5.d).c(RevolutPayApi$Toggles.InAppQrRevolutPay.f84294c)) {
                    throw new IllegalArgumentException() { // from class: com.revolut.feature.revolutpay.impl.qr.RevolutPayQrHandlerImpl$NotSupportedException
                    };
                }
                String str4 = aVar5.f308049a;
                if (str4 == null) {
                    throw new IllegalStateException() { // from class: com.revolut.feature.revolutpay.impl.qr.RevolutPayQrHandlerImpl$NullBarcode
                    };
                }
                jf0.c cVarD = ((s06.c) cVar5.f112209a).d(str4);
                if (cVarD == null) {
                    throw new IllegalArgumentException() { // from class: com.revolut.feature.revolutpay.impl.qr.RevolutPayQrHandlerImpl$NotSupportedException
                    };
                }
                if (!Intrinsics.f(cVarD.e(1), "revolut-pay") || cVarD.e(2).length() > 0) {
                    throw new IllegalArgumentException() { // from class: com.revolut.feature.revolutpay.impl.qr.RevolutPayQrHandlerImpl$NotSupportedException
                    };
                }
                RevolutPayOrderParameters revolutPayOrderParametersA = cVar5.f112210b.a(cVarD.d);
                if (revolutPayOrderParametersA == null || !revolutPayOrderParametersA.a()) {
                    throw new IllegalArgumentException() { // from class: com.revolut.feature.revolutpay.impl.qr.RevolutPayQrHandlerImpl$NotSupportedException
                    };
                }
                return new d8c.a(cVarD);
            case 23:
                ((cid.a) obj3).f24445b.c((FeatureCommand) obj2);
                return Boolean.TRUE;
            case 24:
                sri.m mVar4 = ((dv2.a) obj3).f118022a;
                CardPennyTopUpDestination cardPennyTopUpDestinationB = dv2.a.b((jf0.c) obj2);
                mVar4.c(cardPennyTopUpDestinationB != null ? u0.f(cardPennyTopUpDestinationB) : DummyCommand.f98635a);
                return Boolean.TRUE;
            case 25:
                ((dx7.b) obj3).f120912a.c((FeatureCommand) obj2);
                return Unit.f186387a;
            case 26:
                e31.j jVar = (e31.j) obj3;
                String str5 = (String) obj2;
                ue0.c cVar6 = jVar.f122180a;
                Set setKeys = cVar6.keys();
                ArrayList<String> arrayList = new ArrayList();
                for (Object obj6 : setKeys) {
                    if (kotlin.text.d0.J((String) obj6, "TOPUP_CARD_ID_KEY", false)) {
                        arrayList.add(obj6);
                    }
                }
                while (true) {
                    Object[] objArr11 = false;
                    for (String str6 : arrayList) {
                        if (Intrinsics.f((String) j6.a.k(String.class, cVar6, str6), str5)) {
                            if (cVar6.I0(str6) || objArr11 != false) {
                                objArr11 = true;
                            }
                        }
                    }
                    if (objArr11 != false) {
                        ihm.j jVar2 = jVar.e;
                        od0.i.Companion.getClass();
                        jVar2.onNext(od0.i.f224256b);
                    }
                    return Unit.f186387a;
                }
                break;
            case 27:
                ((fqj.h) ((eqj.g) obj3).f128481c).a(zhm.p.c((q6[]) obj2));
                return Unit.f186387a;
            case 28:
                yq9.l lVar = ((er9.e) obj3).f128566c;
                return zi0.c.S((List) DBUtil.performBlocking(lVar.f316016a, true, false, new y9d.c(i3, (String) obj2, lVar)));
            default:
                IsoDep isoDep = (IsoDep) obj3;
                f63.d dVar5 = (f63.d) obj2;
                if (isoDep == null) {
                    return null;
                }
                try {
                    isoDep.connect();
                    if (isoDep.isConnected()) {
                        historicalBytes = isoDep.getHistoricalBytes();
                        if (historicalBytes == null) {
                            historicalBytes = isoDep.getHiLayerResponse();
                        }
                    } else {
                        historicalBytes = null;
                    }
                    dVar5.f132402b = historicalBytes;
                    dVar5.f132403c.f132400a = isoDep;
                    EmvCard emvCard = ((EmvTemplate) dVar5.e.getValue()).readEmvCard();
                    if (emvCard == null) {
                        return null;
                    }
                    emvCard.setAtrDescription(AtrUtils.getDescriptionFromAts(BytesUtils.bytesToString(dVar5.f132402b)));
                    return emvCard;
                } catch (IOException e2) {
                    zhm.h0 h0Var3 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, j6.a.q("Can't read nfc card: ", e2.getMessage()), e2, h0Var3);
                    throw zfm.h.d(e2);
                }
        }
    }
}
