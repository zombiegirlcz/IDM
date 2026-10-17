package cu8;

import com.revolut.feature.kyc.impl.KycScreenContract$Step;
import com.revolut.feature.kyc.impl.choosedocument.model.SelectedKycDocs;
import com.revolut.feature.kyc.shared.exception.KycException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.kyc.impl.b f108844b;

    public /* synthetic */ i(com.revolut.feature.kyc.impl.b bVar, int i) {
        this.f108843a = i;
        this.f108844b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List listC;
        int i = this.f108843a;
        int i2 = 15;
        com.revolut.feature.kyc.impl.b bVar = this.f108844b;
        switch (i) {
            case 0:
                efm.r error = (efm.r) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                return error.switchMap(new csl.b(12, new i(bVar, 3)));
            case 1:
                KycScreenContract$Step step = (KycScreenContract$Step) obj2;
                Intrinsics.checkNotNullParameter(step, "step");
                if ((step instanceof KycScreenContract$Step.AdditionalVerification) || (step instanceof KycScreenContract$Step.USVisaDisclosure) || (step instanceof KycScreenContract$Step.Vision) || (step instanceof KycScreenContract$Step.IncodeDocumentProcessingConsent) || (step instanceof KycScreenContract$Step.SubmitCitizenship) || (step instanceof KycScreenContract$Step.DocumentCollection)) {
                    return te0.w.h(Boolean.FALSE);
                }
                if ((step instanceof KycScreenContract$Step.RemoteDocs) || (step instanceof KycScreenContract$Step.MoreDocs)) {
                    return bVar.t3().map(new csl.b(11, new cs.a(i2)));
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                KycScreenContract$Step step2 = (KycScreenContract$Step) obj2;
                Intrinsics.checkNotNullParameter(step2, "step");
                if ((step2 instanceof KycScreenContract$Step.AdditionalVerification) || (step2 instanceof KycScreenContract$Step.USVisaDisclosure) || (step2 instanceof KycScreenContract$Step.Vision) || (step2 instanceof KycScreenContract$Step.IncodeDocumentProcessingConsent) || (step2 instanceof KycScreenContract$Step.SubmitCitizenship) || (step2 instanceof KycScreenContract$Step.DocumentCollection)) {
                    return te0.w.h(Boolean.FALSE);
                }
                if ((step2 instanceof KycScreenContract$Step.MoreDocs) || (step2 instanceof KycScreenContract$Step.RemoteDocs)) {
                    return bVar.t3().map(new csl.b(i2, new cs.a(18)));
                }
                throw new NoWhenBranchMatchedException();
            case 3:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return bVar.f77571j;
            case 4:
                Boolean isSingleChoiceAvailable = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isSingleChoiceAvailable, "isSingleChoiceAvailable");
                KycScreenContract$Step kycScreenContract$Step = (KycScreenContract$Step) ((n1) bVar.e).A0().get();
                if (isSingleChoiceAvailable.booleanValue() && te0.w.O(((n1) bVar.e).E0()) != my8.r.ADDRESS) {
                    return "SingleDocumentChoiceBehaviour";
                }
                if (kycScreenContract$Step instanceof KycScreenContract$Step.RemoteDocs) {
                    return "ChooseDocumentRadioButtonBehavuior";
                }
                if (kycScreenContract$Step instanceof KycScreenContract$Step.MoreDocs) {
                    return "ChooseAdditionalDocumentRadioButtonBehaviour";
                }
                throw new IllegalStateException(h30.l.r("Can't find document chooser behavior for step ", kotlin.jvm.internal.o0.f186429a.b(kycScreenContract$Step.getClass()).m()));
            case 5:
                KycScreenContract$Step.DocumentCollection it8 = (KycScreenContract$Step.DocumentCollection) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ((n1) bVar.e).A0().set(it8);
                return Unit.f186387a;
            case 6:
                SelectedKycDocs selectedDocs = (SelectedKycDocs) obj2;
                Intrinsics.checkNotNullParameter(selectedDocs, "selectedDocs");
                Intrinsics.checkNotNullParameter(selectedDocs, "<this>");
                if (selectedDocs.f77600c != null) {
                    return pfm.m.f235744a;
                }
                efm.d0 d0VarFirstOrError = m70.a.h(g1.W(bVar), new cie.l1(10), null, null, 6).flatMap(new csl.b(20, new cma.b(bVar, selectedDocs, 23))).firstOrError();
                d0VarFirstOrError.getClass();
                return new pfm.h(d0VarFirstOrError, 4);
            case 7:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                KycScreenContract$Step kycScreenContract$Step2 = (KycScreenContract$Step) pair.f186385a;
                SelectedKycDocs selectedKycDocs = (SelectedKycDocs) pair.f186386b;
                if (kycScreenContract$Step2 instanceof KycScreenContract$Step.MoreDocs) {
                    listC = ((KycScreenContract$Step.MoreDocs) kycScreenContract$Step2).f77559a;
                } else {
                    if (!(kycScreenContract$Step2 instanceof KycScreenContract$Step.RemoteDocs)) {
                        if (Intrinsics.f(kycScreenContract$Step2, KycScreenContract$Step.SubmitCitizenship.f77561a)) {
                            throw new IllegalStateException("Can't receive additional docs on nationality chooser");
                        }
                        if ((kycScreenContract$Step2 instanceof KycScreenContract$Step.AdditionalVerification) || (kycScreenContract$Step2 instanceof KycScreenContract$Step.USVisaDisclosure) || (kycScreenContract$Step2 instanceof KycScreenContract$Step.Vision) || (kycScreenContract$Step2 instanceof KycScreenContract$Step.IncodeDocumentProcessingConsent) || (kycScreenContract$Step2 instanceof KycScreenContract$Step.DocumentCollection)) {
                            throw new IllegalStateException(h30.l.r("Can't receive additional docs on ", kotlin.jvm.internal.o0.f186429a.b(kycScreenContract$Step2.getClass()).m()));
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    my8.l lVarA = com.revolut.feature.kyc.impl.choosedocument.model.a.a(selectedKycDocs);
                    if (lVarA == null || (listC = zhm.u.c(lVarA)) == null) {
                        throw new IllegalStateException("Selected doc must be set for remote docs");
                    }
                }
                bVar.getClass();
                return nim.a.w(g1.W(bVar), new bke.t(listC, 16));
            case 8:
                wi0.b bVar2 = (wi0.b) obj2;
                n1 n1Var = (n1) bVar.e;
                if (!n1Var.G0().isInitialized()) {
                    te0.e eVarG0 = n1Var.G0();
                    Intrinsics.h(bVar2);
                    eVarG0.set(bVar2);
                    n1Var.B0().set(bVar2);
                }
                te0.e eVarY0 = n1Var.y0();
                Intrinsics.h(bVar2);
                eVarY0.set(bVar2);
                bVar.n3(false);
                return Unit.f186387a;
            default:
                Throwable th10 = (Throwable) obj2;
                KycException kycException = new KycException("Failed to get acceptable documents", th10);
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, kycException, h0Var);
                bVar.k.onNext(th10);
                return Unit.f186387a;
        }
    }
}
