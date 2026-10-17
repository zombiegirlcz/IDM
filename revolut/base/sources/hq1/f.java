package hq1;

import android.content.Context;
import com.revolut.biometric_verification.api.models.BiometricVerificationAcceptedDocument;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentPage;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentPreparationStep$DocumentActiveLiveness;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentPreparationStep$Intro;
import com.revolut.biometric_verification.api.models.BiometricVerificationStep;
import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$InputData;
import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$Step;
import com.revolut.biometric_verification.impl.ui.step.nfc.reader.v2.NfcReadingController;
import com.revolut.biometric_verification.impl.ui.step.nfc.reader.v2.NfcReadyToScanController;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.feature.credit.application.close.ui.screen.CreditApplicationCloseScreen;
import com.revolut.feature.credit.core.ui.progress.CreditProgressActivity;
import com.revolut.feature.credit.core.ui.progress.CreditProgressContract$Configuration;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderPayment;
import com.revolut.feature.globalsearch.api.GlobalSearchApi$Toggles$SmartTileExchangeResolveFromCode;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.details.PolicyDetailsScreen;
import com.revolut.feature.insurance_pet.impl.ui.common.document.TextDocumentActivity;
import com.revolut.feature.insurance_pet.impl.ui.common.document.TextDocumentContract$Configuration;
import com.revolut.feature.insurance_pet.impl.ui.profile.dochistory.PetDocumentHistoryActivity;
import com.revolut.feature.junior_card.api.JuniorCardRequestApi$Toggles;
import com.revolut.feature.learn.shared.impl.ui.course.overview.CourseOverviewScreen;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.PaymentsGroupsBillsEditFlow;
import com.revolut.feature.pdfsave.ui.fullscreen.PdfFullscreenActivity;
import com.revolut.feature.pdfsave.ui.fullscreen.PdfFullscreenContract$Configuration;
import com.revolut.feature.subscriptions.impl.subscriptionlist.SubscriptionListActivity;
import com.revolut.feature.transfer.core.models.DeFiBalanceSource;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.limits_explanation.LimitsExplanationScreen;
import com.revolut.ui_kit.card_3d_scene_proxy.errors.CardSceneUnavailable;
import csh.k;
import gvc.m;
import hwi.c1;
import i09.l;
import i83.p;
import i9g.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.KTypeProjection;
import org.bouncycastle.asn1.BERTags;
import ql7.b1;
import rfm.u;
import te0.s;
import u80.q;
import z4l.j;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.v;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f154586b;

    public /* synthetic */ f(Object obj2, int i) {
        this.f154585a = i;
        this.f154586b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v114, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f154585a;
        p5l.c cVarA = null;
        Object[] objArr = 0;
        int i2 = 3;
        final int i3 = 2;
        boolean z = true;
        final int i5 = 0;
        Object obj2 = this.f154586b;
        switch (i) {
            case 0:
                g gVar = (g) obj2;
                gVar.l2(new m(gVar, objArr == true ? 1 : 0, 24), new yi5.b(26));
                return Unit.f186387a;
            case 1:
                return ((iq3.c) ((CreditApplicationCloseScreen) obj2).O.getValue()).a();
            case 2:
                KProperty[] kPropertyArr = PolicyDetailsScreen.f0;
                return (hq7.h) ((b1) ((PolicyDetailsScreen) obj2).Y.getValue()).i.get();
            case 3:
                ej0.b bVar = ((DeFiBalanceSource) obj2).f92238h;
                return q.a(bVar.f126703a, bVar.f126704b);
            case 4:
                return ((k) obj2).d();
            case 5:
                com.revolut.biometric_verification.impl.ui.step.document.flow.a aVar = ((com.revolut.biometric_verification.impl.ui.step.document.flow.e) obj2).f50591t;
                BiometricVerificationDocumentStepFlowContract$InputData biometricVerificationDocumentStepFlowContract$InputData = aVar.f50582a;
                BiometricVerificationStep.Document document = biometricVerificationDocumentStepFlowContract$InputData.f50542a;
                boolean z3 = biometricVerificationDocumentStepFlowContract$InputData.f50543b;
                ArrayList arrayList = document.f50404c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    a0.x(((BiometricVerificationAcceptedDocument) it8.next()).f50373b, arrayList2);
                }
                List countryCodes = d0.U(arrayList2);
                if (countryCodes.size() != 1) {
                    lr.g gVar2 = aVar.f50583b;
                    Intrinsics.checkNotNullParameter(countryCodes, "countryCodes");
                    gVar2.f199343a.f("BIOMETRIC_VERIFICATION_DOCUMENT_COUNTRIES_MEMORY_CACHE_KEY", countryCodes);
                    return new BiometricVerificationDocumentStepFlowContract$Step.DocumentCountryPicker(z3, true);
                }
                ArrayList<BiometricVerificationAcceptedDocument> arrayList3 = document.f50404c;
                ArrayList arrayList4 = document.d;
                ArrayList arrayList5 = new ArrayList(w.t(arrayList3, 10));
                for (BiometricVerificationAcceptedDocument biometricVerificationAcceptedDocument : arrayList3) {
                    arrayList5.add(new BiometricVerificationDocument(biometricVerificationAcceptedDocument.f50372a, (wi0.b) d0.b0(biometricVerificationAcceptedDocument.f50373b), biometricVerificationAcceptedDocument.f50374c, biometricVerificationAcceptedDocument.d));
                }
                i = arrayList3.size() != 1 ? 0 : 1;
                boolean zContains = arrayList4.contains(BiometricVerificationDocumentPreparationStep$Intro.f50383a);
                boolean zContains2 = arrayList4.contains(BiometricVerificationDocumentPreparationStep$DocumentActiveLiveness.f50382a);
                if (i != 0 && zContains2) {
                    return new BiometricVerificationDocumentStepFlowContract$Step.DocumentLivenessIntro((BiometricVerificationDocument) d0.b0(arrayList5), z3);
                }
                if (i != 0 && zContains) {
                    return new BiometricVerificationDocumentStepFlowContract$Step.Intro((BiometricVerificationDocument) d0.b0(arrayList5), z3);
                }
                if (i == 0) {
                    return aVar.a(arrayList5, z3);
                }
                BiometricVerificationDocument biometricVerificationDocument = (BiometricVerificationDocument) d0.b0(arrayList5);
                ArrayList arrayListF1 = d0.f1(biometricVerificationDocument.f50377c);
                return new BiometricVerificationDocumentStepFlowContract$Step.Camera(biometricVerificationDocument, (BiometricVerificationDocumentPage) arrayListF1.remove(0), arrayListF1, z3);
            case 6:
                return (ht9.a) ((kr9.h) ((PaymentsGroupsBillsEditFlow) obj2).P.getValue()).f188746c.get();
            case 7:
                NfcReadingController nfcReadingController = (NfcReadingController) obj2;
                return n14.e.a(nfcReadingController, nfcReadingController.R);
            case 8:
                NfcReadyToScanController nfcReadyToScanController = (NfcReadyToScanController) obj2;
                return n14.e.a(nfcReadyToScanController, nfcReadyToScanController.R);
            case 9:
                ArrayList arrayList6 = ((nr6.w) obj2).f218585a;
                if (arrayList6.isEmpty()) {
                    z = false;
                } else {
                    Iterator it9 = arrayList6.iterator();
                    while (it9.hasNext()) {
                        if (((AcquiringOrderPayment) it9.next()).f == lr6.a.AUTHORISED) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                final c1 c1Var = (c1) obj2;
                return new w4l.f(new Function2() { // from class: hwi.z0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        switch (i5) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj3;
                                Unit it10 = (Unit) obj4;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(it10, "it");
                                c1 c1Var2 = c1Var;
                                ufm.i iVar = new ufm.i(te0.w.n0(c1Var2.f156200a.getSavedLounges(), c1Var2.d), new hw3.d(18, new hwf.b(17)), 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                break;
                            case 1:
                                List value = (List) obj4;
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                Intrinsics.checkNotNullParameter(value, "value");
                                c1Var.f156202c.f("CACHE_KEY_SAVED_LOUNGES", value);
                                break;
                            default:
                                List value2 = (List) obj4;
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                Intrinsics.checkNotNullParameter(value2, "value");
                                c1Var.f156201b.G(ksj.b.f(value2), "CACHE_KEY_SAVED_LOUNGES", kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                break;
                        }
                        return Unit.f186387a;
                    }
                }, new Function1() { // from class: hwi.a1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        Unit it10 = (Unit) obj3;
                        switch (i5) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it10, "it");
                                return (List) c1Var.f156202c.get("CACHE_KEY_SAVED_LOUNGES");
                            default:
                                Intrinsics.checkNotNullParameter(it10, "it");
                                List list = (List) c1Var.f156201b.T2("CACHE_KEY_SAVED_LOUNGES", c1.f);
                                if (list != null) {
                                    return ksj.b.h(list);
                                }
                                return null;
                        }
                    }
                }, new Function2() { // from class: hwi.z0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        switch (i) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj3;
                                Unit it10 = (Unit) obj4;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(it10, "it");
                                c1 c1Var2 = c1Var;
                                ufm.i iVar = new ufm.i(te0.w.n0(c1Var2.f156200a.getSavedLounges(), c1Var2.d), new hw3.d(18, new hwf.b(17)), 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                break;
                            case 1:
                                List value = (List) obj4;
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                Intrinsics.checkNotNullParameter(value, "value");
                                c1Var.f156202c.f("CACHE_KEY_SAVED_LOUNGES", value);
                                break;
                            default:
                                List value2 = (List) obj4;
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                Intrinsics.checkNotNullParameter(value2, "value");
                                c1Var.f156201b.G(ksj.b.f(value2), "CACHE_KEY_SAVED_LOUNGES", kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                break;
                        }
                        return Unit.f186387a;
                    }
                }, new Function1() { // from class: hwi.a1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        Unit it10 = (Unit) obj3;
                        switch (i) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it10, "it");
                                return (List) c1Var.f156202c.get("CACHE_KEY_SAVED_LOUNGES");
                            default:
                                Intrinsics.checkNotNullParameter(it10, "it");
                                List list = (List) c1Var.f156201b.T2("CACHE_KEY_SAVED_LOUNGES", c1.f);
                                if (list != null) {
                                    return ksj.b.h(list);
                                }
                                return null;
                        }
                    }
                }, new Function2() { // from class: hwi.z0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        switch (i3) {
                            case 0:
                                w4l.f DataObservableDelegate = (w4l.f) obj3;
                                Unit it10 = (Unit) obj4;
                                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                                Intrinsics.checkNotNullParameter(it10, "it");
                                c1 c1Var2 = c1Var;
                                ufm.i iVar = new ufm.i(te0.w.n0(c1Var2.f156200a.getSavedLounges(), c1Var2.d), new hw3.d(18, new hwf.b(17)), 1);
                                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                                break;
                            case 1:
                                List value = (List) obj4;
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                Intrinsics.checkNotNullParameter(value, "value");
                                c1Var.f156202c.f("CACHE_KEY_SAVED_LOUNGES", value);
                                break;
                            default:
                                List value2 = (List) obj4;
                                Intrinsics.checkNotNullParameter((Unit) obj3, "<unused var>");
                                Intrinsics.checkNotNullParameter(value2, "value");
                                c1Var.f156201b.G(ksj.b.f(value2), "CACHE_KEY_SAVED_LOUNGES", kii.e.o(iwi.c.class, KTypeProjection.INSTANCE, List.class));
                                break;
                        }
                        return Unit.f186387a;
                    }
                }, null, null, null, BERTags.FLAGS);
            case 11:
                try {
                    exl.b bVar2 = ((hy2.h) obj2).f156709c;
                    a61.a aVar2 = bVar2.f130468b;
                    if (((oi0.b) ((xg0.a) aVar2.f1531b)).d((Context) aVar2.f1532c, y0.b("ui_kit_card_3d_scene_retail")).f305464a.isEmpty()) {
                        return bVar2.f130469c;
                    }
                    throw new CardSceneUnavailable(null);
                } catch (Throwable th10) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                    return null;
                }
            case 12:
                KProperty[] kPropertyArr2 = CreditProgressActivity.f69843v0;
                return ((CreditProgressContract$Configuration) ((CreditProgressActivity) obj2).G0()).getF();
            case 13:
                int i6 = TextDocumentActivity.f76259v0;
                return ((TextDocumentContract$Configuration) ((TextDocumentActivity) obj2).G0()).f76262a;
            case 14:
                int i21 = PetDocumentHistoryActivity.f76381w0;
                return new j(7, v.k((RowDelegate) ((PetDocumentHistoryActivity) obj2).u0.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate()), false);
            case 15:
                KProperty[] kPropertyArr3 = CourseOverviewScreen.f77977d0;
                return (l) ((f09.c) ((CourseOverviewScreen) obj2).X.getValue()).f131054n.get();
            case 16:
                ((rpi.b) ((com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.a) obj2).f96952r).N(true);
                return Unit.f186387a;
            case 17:
                lk0.g gVar3 = (lk0.g) ((i3g.c) obj2).f158206b.f();
                if (gVar3 != null) {
                    u uVarG = efm.k.g(gVar3);
                    Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                    return uVarG;
                }
                rfm.h hVar = rfm.h.f253943a;
                Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
                return hVar;
            case 18:
                return te0.w.g(((i4g.h) obj2).f.f());
            case 19:
                ((com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a) obj2).C2(i52.e.f158555a);
                return Unit.f186387a;
            case 20:
                int i22 = PdfFullscreenActivity.f80310s0;
                return ((PdfFullscreenContract$Configuration) ((PdfFullscreenActivity) obj2).G0()).f80312a;
            case 21:
                return Boolean.valueOf(((jte.d) ((p) obj2).f159430b).c(CardsCoreApi$Toggles.CardReactivationRedesign.f65561c));
            case 22:
                int i32 = LimitsExplanationScreen.T;
                return (i8k.a) ((q7k.d) ((LimitsExplanationScreen) obj2).Q.getValue()).f242880c.get();
            case 23:
                return Boolean.valueOf(((jte.d) ((i97.l) obj2).d).c(GlobalSearchApi$Toggles$SmartTileExchangeResolveFromCode.f74616c));
            case 24:
                return Boolean.valueOf(((jte.d) ((i98.e) obj2).f159612c).c(JuniorCardRequestApi$Toggles.CardsX3Migration.f76852c));
            case 25:
                v6l.d dVar = ((ia3.h) obj2).f159935a.f150401a;
                p5l.c cVar = (p5l.c) dVar.f286445b.get("cards_config");
                if (cVar == null) {
                    r5l.f fVar = (r5l.f) dVar.f286446c.T2("cards_config", r5l.f.class);
                    if (fVar != null) {
                        cVarA = n5l.a.a(fVar);
                    }
                } else {
                    cVarA = cVar;
                }
                return cVarA == null ? new p5l.c(new p5l.d(new p5l.a(f0.f322471a))) : cVarA;
            case 26:
                iak.b bVar3 = (iak.b) obj2;
                efm.k kVarFirstElement = ((iak.a) bVar3.f160044a).w0().c(s.f270018a).firstElement();
                i9g.f0 f0Var = new i9g.f0(15, new e0(13));
                kVarFirstElement.getClass();
                pfm.a aVar3 = new pfm.a(new rfm.m(kVarFirstElement, f0Var, i), new i9g.f0(16, new i4g.g(1, bVar3.f160045b, kak.a.class, "setBeneficiaryAsPda", "setBeneficiaryAsPda(Ljava/lang/String;)Lio/reactivex/Completable;", 0, 8)), i2);
                Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
                return aVar3;
            case 27:
                SubscriptionListActivity subscriptionListActivity = (SubscriptionListActivity) obj2;
                int i33 = SubscriptionListActivity.y0;
                return new j(6, v.k((RowDelegate) subscriptionListActivity.f89309t0.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (ErrorDelegate) subscriptionListActivity.u0.getValue(), (InputDisclosureDelegate) subscriptionListActivity.f89310v0.getValue()), false);
            case 28:
                com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a aVar4 = (com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a) obj2;
                return aVar4.f95609s.a(aVar4.o.f95602a);
            default:
                id5.j jVar = (id5.j) obj2;
                return mra.d.c(jVar, new id5.h(jVar.c3()), jVar.f160428m);
        }
    }
}
