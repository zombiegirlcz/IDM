package a31;

import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.os.Parcelable;
import android.util.Base64OutputStream;
import androidx.room.util.DBUtil;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.ui.camera.rx.DocumentCaptureDelayTransformer;
import com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostViewModel;
import com.onfido.android.sdk.capture.ui.welcome.WelcomePresenter;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.android.model.country.CountryInfo;
import com.revolut.core.currency.impl.services.CurrenciesConfigService;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentDao;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentEntity;
import com.revolut.data.database.models.recurringpayments.mapper.RecurringPaymentEntityMapperKt;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.card_order_new.api.CardOrderNewFeatureConfig;
import com.revolut.feature.cards_core.api.stories.CardRemoteStoriesKey;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.remote_stories.models.navigation.RemoteStoriesFeatureConfig;
import com.revolut.feature.retail.salary_account.api.domain.SalaryAccountDestination$IncomeInsuranceClaim;
import com.revolut.feature.retail.salary_account.api.domain.SalaryAccountDestination$MoveSalary;
import com.revolut.feature.revolut_x_common.api.articles.RevolutXProductArticleKey;
import com.revolut.feature.shared.beneficiary.api.common.QrScanResult;
import com.revolut.feature.shared.beneficiary.api.domain.PaymentCodeType;
import com.revolut.feature.shared.beneficiary.api.navigation.BeneficiaryCreationKompotFinishMode;
import com.revolut.feature.us_send_checks.api.SendChecksApi$Toggles;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.beneficiary.api.domain.PaymentCode;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationDestination;
import com.revolut.retail.feature.beneficiary.api.navigation.BeneficiaryCreationKompotInputData;
import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentification;
import dwi.o0;
import dwi.r0;
import efm.d0;
import grl.k9;
import java.io.ByteArrayOutputStream;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx0.nc;
import org.json.JSONArray;
import org.json.JSONObject;
import org.reactivestreams.Publisher;
import qfm.j1;
import zh9.u0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class l implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f978b;

    public /* synthetic */ l(e3j.f fVar, PaymentCode paymentCode) {
        this.f977a = 16;
        this.f978b = paymentCode;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        Map mapG;
        ihm.f fVar;
        efm.r rVarFilter;
        int i = 7;
        int i2 = 12;
        f5j.r rVar = null;
        int i3 = 0;
        switch (this.f977a) {
            case 0:
                List<RecurringPaymentEntity> allSync = ((RecurringPaymentDao) ((Lazy) ((x) this.f978b).d.f276163c).getValue()).getAllSync();
                ArrayList arrayList = new ArrayList(zhm.w.t(allSync, 10));
                Iterator<T> it8 = allSync.iterator();
                while (it8.hasNext()) {
                    arrayList.add(RecurringPaymentEntityMapperKt.toDomain((RecurringPaymentEntity) it8.next()));
                }
                return arrayList;
            case 1:
                af.e eVar = (af.e) this.f978b;
                synchronized (eVar) {
                    try {
                        af.j jVar = (af.j) eVar.f3811a.get();
                        ArrayList arrayListC = jVar.c();
                        jVar.b();
                        JSONArray jSONArray = new JSONArray();
                        while (i3 < arrayListC.size()) {
                            af.a aVar = (af.a) arrayListC.get(i3);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.f3802a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.f3803b));
                            jSONArray.put(jSONObject);
                            i3++;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
                return string;
            case 2:
                o8b.c cVar = (o8b.c) ((am2.a) this.f978b).f6285a;
                ArrayList<r8b.a> arrayListC2 = cVar.c(cVar.a(), true);
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayListC2, 10));
                for (r8b.a aVar2 : arrayListC2) {
                    Intrinsics.checkNotNullParameter(aVar2, "<this>");
                    arrayList2.add(new CountryInfo(aVar2.f252402a, aVar2.f252403b, aVar2.f252404c));
                }
                return arrayList2;
            case 3:
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, ((au9.b) this.f978b).f9677a, "KEY_TRANSFERS_CONTACT_DISCLAIMER", Boolean.TRUE);
                return Unit.f186387a;
            case 4:
                ((b3d.c) this.f978b).f12022a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 2))));
                return Boolean.TRUE;
            case 5:
                return ((be0.e) this.f978b).b();
            case 6:
                zq.a aVar3 = (zq.a) this.f978b;
                d0<wd0.b> currenciesConfigDetails = ((CurrenciesConfigService) aVar3.f324335b).getCurrenciesConfigDetails("/config/currencies/details");
                bce.e eVar2 = new bce.e(new ax9.d(1, (ae0.b) aVar3.f324336c, ae0.b.class, "configDtoToConfig", "configDtoToConfig(Lcom/revolut/core/currency/impl/dto/CurrenciesConfigDto;)Lcom/revolut/core/currency/api/CurrenciesConfig;", 0, 16), 18);
                currenciesConfigDetails.getClass();
                return new ufm.i(currenciesConfigDetails, eVar2, 1).w();
            case 7:
                ((bk2.j) this.f978b).f16237b.getClass();
                return Boolean.TRUE;
            case 8:
                return ((c49.d) this.f978b).g();
            case 9:
                return AnnouncementService.isAccessibilityEnabledSingle$lambda$7((AnnouncementService) this.f978b);
            case 10:
                return DocumentCaptureDelayTransformer.passportDelayTimerFinishedObservable$lambda$1((DocumentType) this.f978b);
            case 11:
                return DocumentSelectionHostViewModel.cacheAllDocuments$lambda$0((DocumentSelectionHostViewModel) this.f978b);
            case 12:
                return WelcomePresenter.stateStream$lambda$1((WelcomePresenter) this.f978b);
            case 13:
                r0 r0Var = (r0) this.f978b;
                efm.i iVarA = w39.b.a(r0Var.f120457c, 10000L, 2);
                dv5.n nVar = new dv5.n(new o0(r0Var, 3), 19);
                dfm.c cVar2 = mfm.f.d;
                en.a aVar4 = mfm.f.f205043c;
                iVarA.getClass();
                return new j01.b(new qfm.c(new Publisher[]{efm.i.i(new Data(r0Var.e, null, true, 2, null)), new j1(new qfm.x(iVarA, nVar, cVar2, aVar4, aVar4), new dv5.n(new dwi.f(i2), 16), i3)}, i3), i);
            case 14:
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, ((e31.j) this.f978b).f122180a, "ADD_MONEY_RESTRICTIONS_BOTTOM_SHEET_SHOWN_KEY", Boolean.TRUE);
                return Unit.f186387a;
            case 15:
                QrScanResult qrScanResult = (QrScanResult) this.f978b;
                return com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), u0.f(new BeneficiaryCreationDestination(new BeneficiaryCreationKompotFinishMode.NavigateToTransfer.QrResult(qrScanResult), new BeneficiaryCreationKompotInputData.CreationConfiguration.QrScan(qrScanResult.f86035a, h0.f322473a))));
            case 16:
                PaymentCode paymentCode = (PaymentCode) this.f978b;
                PaymentCodeType[] elements = {PaymentCodeType.EUROPEAN, PaymentCodeType.SWISS};
                Intrinsics.checkNotNullParameter(elements, "elements");
                if (kotlin.collections.d.y0(elements).contains(paymentCode.f99590a)) {
                    rVar = f5j.r.IBAN;
                    Pair pair = new Pair("IBAN", paymentCode.getF99604c().f99612a);
                    String strConcat = paymentCode.getF99604c().f99613b;
                    if (strConcat.length() == 8) {
                        strConcat = strConcat.concat("XXX");
                    }
                    Map mapK = zhm.r0.k(pair, new Pair("BIC", strConcat));
                    mapG = new LinkedHashMap();
                    for (Map.Entry entry : mapK.entrySet()) {
                        if (!kotlin.text.d0.W((CharSequence) entry.getValue())) {
                            mapG.put(entry.getKey(), entry.getValue());
                        }
                    }
                } else {
                    mapG = zhm.r0.g();
                }
                Map map = mapG;
                f5j.r rVar2 = rVar;
                Address address = new Address(paymentCode.getF99603b().f99616c, paymentCode.getF99603b().d, null, paymentCode.getF99603b().f, paymentCode.getF99603b().e, paymentCode.getF99603b().f99617g, null, null, null, null, null, null, null, null, null, 32708, null);
                xi0.a aVar5 = xi0.b.Companion;
                String e = paymentCode.getE();
                aVar5.getClass();
                return new QrScanResult(new f5j.a("SCANNED_BENEFICIARY_ID", "SCANNED_BENEFICIARY_ID", (String) null, paymentCode.getF99603b().f99614a, (String) null, (String) null, (String) null, paymentCode.getF99603b().f99614a, (String) null, (String) null, (String) null, rVar2, address, paymentCode.getE(), paymentCode.getF99603b().f99617g, (String) null, (f5j.t) null, paymentCode.getF99603b().f99617g, (Boolean) null, (f5j.e) null, map, new f5j.b(paymentCode.getF99603b().f99614a, null, paymentCode.getD(), null, address), (List) null, false, 0, 0L, (String) null, (BeneficiaryIdentification) null, (Instant) null, (String) null, 2144175940), new dj0.d(rim.d.d(Math.pow(10.0d, r8.c()) * paymentCode.getF()), xi0.a.a(e)), paymentCode.getD(), f0.f322471a, null, paymentCode.f99590a);
            case 17:
                er9.x xVar = (er9.x) this.f978b;
                yq9.h hVar = xVar.f128596a;
                List list = (List) DBUtil.performBlocking(hVar.f316005a, true, false, new ypd.i(hVar, i));
                yq9.l lVar = xVar.f128597b;
                return z92.f.B(list, (List) DBUtil.performBlocking(lVar.f316016a, true, false, new ypd.i(lVar, 9)));
            case 18:
                return yoj.b.E((cr9.v) this.f978b);
            case 19:
                ArrayList arrayList3 = ((es0.j) this.f978b).f128833c;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                Iterator it9 = arrayList3.iterator();
                while (it9.hasNext()) {
                    arrayList4.add(((nc) it9.next()).f209864b);
                }
                return efm.r.merge(arrayList4);
            case 20:
                es0.q qVar = (es0.q) this.f978b;
                es0.m mVar = qVar.f128845c;
                return (mVar == null || (fVar = mVar.e) == null || (rVarFilter = fVar.filter(new er9.k(27, new eq4.g(qVar, i2)))) == null) ? efm.r.empty() : rVarFilter;
            case 21:
                return IsoDep.get((Tag) this.f978b);
            case 22:
                ihm.k kVar = (ihm.k) this.f978b;
                p93.b.Companion.getClass();
                kVar.onNext(new FeatureCommand(new RemoteStoriesFeatureConfig.Key(CardRemoteStoriesKey.BIG_TILE, null, null, null, new FeatureCommand(new CardOrderNewFeatureConfig(null, null, null, null, null, false, null, null, null, null, null, null, 16383)), null, 0, 8158)));
                return Unit.f186387a;
            case 23:
                return (wi0.b) ((eki.e) this.f978b).invoke();
            case 24:
                ((fgb.a) this.f978b).f135023a.c(vhi.c.c(SalaryAccountDestination$IncomeInsuranceClaim.f82949a, yhi.b.SOLID, null, false, 12));
                return Boolean.TRUE;
            case 25:
                ((fgb.b) this.f978b).f135024a.c(vhi.c.c(SalaryAccountDestination$MoveSalary.f82950a, yhi.b.SOLID, null, false, 12));
                return Boolean.TRUE;
            case 26:
                fp1.d dVar = (fp1.d) ((fp1.f) this.f978b).f137042a;
                dVar.getClass();
                return Boolean.valueOf(dVar.c(cf9.a.f23652c));
            case 27:
                g5c.f fVar2 = (g5c.f) this.f978b;
                qka.c cVar3 = fVar2.f140748h;
                ProductArticleParams productArticleParams = new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(RevolutXProductArticleKey.REVOLUT_X_CROSS_SELL_PROMO));
                SkipShownArticleBehaviour.AlwaysShow alwaysShow = SkipShownArticleBehaviour.AlwaysShow.f81285a;
                k9 k9Var = k9.Crypto;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                fVar2.f140745b.c(new FeatureCommand(cka.b.a(cVar3, productArticleParams, alwaysShow, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, 116)));
                return Unit.f186387a;
            case 28:
                g9i.n nVar2 = ((com.revolut.feature_pdf_view.ui.b) this.f978b).f97467c;
                if (!((g9i.u) nVar2).x0().isInitialized()) {
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                od0.h hVar2 = od0.i.Companion;
                Object obj2 = ((g9i.u) nVar2).x0().get();
                hVar2.getClass();
                return od0.h.a(obj2);
            default:
                return new h3a.r(((jte.d) ((h3a.t) this.f978b).f149072g).c(SendChecksApi$Toggles.SendUSChecks.f94582c));
        }
    }

    public /* synthetic */ l(Object obj2, int i) {
        this.f977a = i;
        this.f978b = obj2;
    }
}
