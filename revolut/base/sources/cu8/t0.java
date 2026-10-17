package cu8;

import com.revolut.feature.kyc.api.navigation.document_collection.DocumentCollectionInputData;
import com.revolut.feature.kyc.impl.KycScreenContract$Step;
import com.revolut.feature.kyc.impl.flow.kyc.KycFlowDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wm.b;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.kyc.impl.f f108898b;

    public /* synthetic */ t0(com.revolut.feature.kyc.impl.f fVar, int i) {
        this.f108897a = i;
        this.f108898b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ufm.b bVarM;
        switch (this.f108897a) {
            case 0:
                Boolean handled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(handled, "handled");
                if (handled.booleanValue()) {
                    return pfm.m.f235744a;
                }
                com.revolut.feature.kyc.impl.f fVar = this.f108898b;
                if (((Boolean) ((n1) fVar.f77668b).x0().get()).booleanValue()) {
                    pfm.h hVar = new pfm.h(new s0(fVar, 2), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                    return hVar;
                }
                com.revolut.feature.kyc.impl.b bVar = (com.revolut.feature.kyc.impl.b) fVar.f77669c;
                bVar.getClass();
                pfm.h hVar2 = new pfm.h(new a08.d(bVar, 8), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                pfm.a aVarE = hVar2.e(new pfm.h(new s0(fVar, 1), 2));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
            case 1:
                com.revolut.feature.kyc.impl.f fVar2 = this.f108898b;
                g1 g1Var = fVar2.f77669c;
                KycScreenContract$Step step = (KycScreenContract$Step) obj2;
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof KycScreenContract$Step.RemoteDocs) {
                    efm.d0 d0VarFirstOrError = ((com.revolut.feature.kyc.impl.b) g1Var).v3().firstOrError();
                    n nVar = new n(25, new t0(fVar2, 3));
                    d0VarFirstOrError.getClass();
                    return new ufm.i(d0VarFirstOrError, nVar, 0);
                }
                if (step instanceof KycScreenContract$Step.USVisaDisclosure) {
                    return new pfm.z(((com.revolut.feature.kyc.impl.b) g1Var).C3(((KycScreenContract$Step.USVisaDisclosure) step).f77563b), 0, new a68.f(5), null);
                }
                if (step instanceof KycScreenContract$Step.IncodeDocumentProcessingConsent) {
                    return new pfm.z(((com.revolut.feature.kyc.impl.b) g1Var).C3(((KycScreenContract$Step.IncodeDocumentProcessingConsent) step).f77558b), 0, new a68.f(5), null);
                }
                if (step instanceof KycScreenContract$Step.Vision) {
                    return new pfm.z(((com.revolut.feature.kyc.impl.b) g1Var).C3(((KycScreenContract$Step.Vision) step).f77565b), 0, new a68.f(5), null);
                }
                return efm.d0.m(Boolean.FALSE);
            case 2:
                this.f108898b.k.onNext(com.revolut.retail.core.navigation.a.c(new FinishCommand(-1, null, null, 6), (NaviCommand) obj2));
                return Unit.f186387a;
            case 3:
                my8.r kycScope = (my8.r) obj2;
                Intrinsics.checkNotNullParameter(kycScope, "kycScope");
                int i = x0.f108910b[kycScope.ordinal()];
                com.revolut.feature.kyc.impl.f fVar3 = this.f108898b;
                switch (i) {
                    case 1:
                    case 2:
                    case 9:
                    case 11:
                    case 12:
                        return efm.d0.m(Boolean.FALSE);
                    case 3:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        return ((com.revolut.feature.kyc.impl.b) fVar3.f77669c).p3() ? efm.d0.m(Boolean.FALSE) : new pfm.h(new s0(fVar3, 3), 2).D(Boolean.TRUE);
                    case 4:
                    case 10:
                        return new pfm.h(new s0(fVar3, 4), 2).D(Boolean.TRUE);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 4:
                wi0.b suggestedCitizenship = (wi0.b) obj2;
                Intrinsics.checkNotNullParameter(suggestedCitizenship, "suggestedCitizenship");
                com.revolut.feature.kyc.impl.f fVar4 = this.f108898b;
                wi0.b residencyCountry = (wi0.b) ((n1) fVar4.f77668b).B0().get();
                o1 o1Var = (o1) fVar4.f77670g;
                o1Var.getClass();
                Intrinsics.checkNotNullParameter(suggestedCitizenship, "suggestedCitizenship");
                Intrinsics.checkNotNullParameter(residencyCountry, "residencyCountry");
                return o1Var.a(suggestedCitizenship, residencyCountry, null, false);
            case 5:
                wi0.b citizenship = (wi0.b) obj2;
                Intrinsics.checkNotNullParameter(citizenship, "citizenship");
                return new pfm.h(new a08.l(this.f108898b, citizenship, 16), 2);
            case 6:
                my8.l selectedDocument = (my8.l) obj2;
                Intrinsics.checkNotNullParameter(selectedDocument, "selectedDocument");
                return this.f108898b.j3(selectedDocument);
            case 7:
                KycScreenContract$Step currentStep = (KycScreenContract$Step) obj2;
                Intrinsics.checkNotNullParameter(currentStep, "currentStep");
                if (!(currentStep instanceof KycScreenContract$Step.IncodeDocumentProcessingConsent)) {
                    throw new IllegalStateException(h30.l.r("Invalid step for processing incode consent ", kotlin.jvm.internal.o0.f186429a.b(currentStep.getClass()).m()));
                }
                com.revolut.feature.kyc.impl.b bVar2 = (com.revolut.feature.kyc.impl.b) this.f108898b.f77669c;
                return bVar2.y3(my8.k.INCODE_DOCUMENT_PROCESSING).e((pfm.h) bVar2.f77569g.c0(d1.f108833a)).e(bVar2.C3(((KycScreenContract$Step.IncodeDocumentProcessingConsent) currentStep).f77558b));
            case 8:
                com.revolut.feature.kyc.impl.f fVar5 = this.f108898b;
                g1 g1Var2 = fVar5.f77669c;
                f1 f1Var = fVar5.f77670g;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                KycScreenContract$Step kycScreenContract$Step = (KycScreenContract$Step) pair.f186385a;
                KycScreenContract$Step kycScreenContract$Step2 = (KycScreenContract$Step) pair.f186386b;
                if (kycScreenContract$Step2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if ((kycScreenContract$Step2 instanceof KycScreenContract$Step.MoreDocs) || (kycScreenContract$Step2 instanceof KycScreenContract$Step.RemoteDocs)) {
                    efm.d0 d0VarFirstOrError2 = te0.w.F0(((com.revolut.feature.kyc.impl.b) g1Var2).t3(), ((com.revolut.feature.kyc.impl.b) g1Var2).v3()).firstOrError();
                    n nVar2 = new n(22, new c1g.o(fVar5, 22, kycScreenContract$Step2, kycScreenContract$Step));
                    d0VarFirstOrError2.getClass();
                    ufm.i iVar = new ufm.i(d0VarFirstOrError2, nVar2, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    return iVar;
                }
                if (kycScreenContract$Step2 instanceof KycScreenContract$Step.SubmitCitizenship) {
                    efm.d0 d0VarFirstOrError3 = ((n1) ((com.revolut.feature.kyc.impl.b) g1Var2).e).I0().c(te0.s.f270018a).firstOrError();
                    n nVar3 = new n(29, new t0(fVar5, 4));
                    d0VarFirstOrError3.getClass();
                    return new ufm.i(d0VarFirstOrError3, nVar3, 1);
                }
                if (kycScreenContract$Step2 instanceof KycScreenContract$Step.AdditionalVerification) {
                    yt8.e alert = ((KycScreenContract$Step.AdditionalVerification) kycScreenContract$Step2).f77555a;
                    o1 o1Var2 = (o1) f1Var;
                    o1Var2.getClass();
                    Intrinsics.checkNotNullParameter(alert, "alert");
                    bVarM = efm.d0.m(vhi.c.a(new KycFlowDestination.AdditionalVerification(alert, ((eu8.b) o1Var2.f108881a).f129532a), 4));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                } else if (kycScreenContract$Step2 instanceof KycScreenContract$Step.USVisaDisclosure) {
                    wi0.b country = ((KycScreenContract$Step.USVisaDisclosure) kycScreenContract$Step2).f77562a;
                    o1 o1Var3 = (o1) f1Var;
                    o1Var3.getClass();
                    Intrinsics.checkNotNullParameter(country, "country");
                    bVarM = efm.d0.m(vhi.c.a(new KycFlowDestination.USVisaDisclosure(country, ((eu8.b) o1Var3.f108881a).f129532a), 4));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                } else if (kycScreenContract$Step2 instanceof KycScreenContract$Step.IncodeDocumentProcessingConsent) {
                    wi0.b country2 = ((KycScreenContract$Step.IncodeDocumentProcessingConsent) kycScreenContract$Step2).f77557a;
                    o1 o1Var4 = (o1) f1Var;
                    o1Var4.getClass();
                    Intrinsics.checkNotNullParameter(country2, "country");
                    bVarM = efm.d0.m(vhi.c.a(new KycFlowDestination.IncodeDocumentConsentProcessing(country2, ((eu8.b) o1Var4.f108881a).f129532a), 4));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                } else if (kycScreenContract$Step2 instanceof KycScreenContract$Step.Vision) {
                    String verificationToken = ((KycScreenContract$Step.Vision) kycScreenContract$Step2).f77564a;
                    o1 o1Var5 = (o1) f1Var;
                    o1Var5.getClass();
                    Intrinsics.checkNotNullParameter(verificationToken, "verificationToken");
                    bVarM = efm.d0.m(vhi.c.a(new KycFlowDestination.RevolutVision(verificationToken, ((eu8.b) o1Var5.f108881a).f129532a), 4));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                } else {
                    if (!(kycScreenContract$Step2 instanceof KycScreenContract$Step.DocumentCollection)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    DocumentCollectionInputData documentCollectionInputData = ((KycScreenContract$Step.DocumentCollection) kycScreenContract$Step2).f77556a;
                    o1 o1Var6 = (o1) f1Var;
                    o1Var6.getClass();
                    Intrinsics.checkNotNullParameter(documentCollectionInputData, "documentCollectionInputData");
                    bVarM = efm.d0.m(vhi.c.a(new KycFlowDestination.DocumentCollection(documentCollectionInputData, ((eu8.b) o1Var6.f108881a).f129532a), 4));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                }
                return bVarM;
            case 9:
                my8.l selectedDocument2 = (my8.l) obj2;
                Intrinsics.checkNotNullParameter(selectedDocument2, "selectedDocument");
                com.revolut.feature.kyc.impl.f fVar6 = this.f108898b;
                return fVar6.e.c0(new b.a()).e(fVar6.j3(selectedDocument2));
            default:
                this.f108898b.k.onNext(com.revolut.retail.core.navigation.a.c(new FinishCommand(-1, null, null, 6), (NaviCommand) obj2));
                return Unit.f186387a;
        }
    }
}
