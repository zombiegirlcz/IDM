package lr1;

import com.revolut.feature.apm.bills.postal_check.api.domain.PostalCheckQrScanResult;
import com.revolut.feature.apm.bills.postal_check.impl.ui.PostalCheckFlowContract$Step;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.j1;
import nii.l1;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.apm.bills.postal_check.impl.ui.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PostalCheckQrScanResult.TermsRequired f199375w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.apm.bills.postal_check.impl.ui.b bVar, PostalCheckQrScanResult.TermsRequired termsRequired, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f199375w = termsRequired;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, this.f199375w, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.apm.bills.postal_check.impl.ui.b bVar = this.v;
        yki.i iVar = bVar.u;
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        boolean z = n1Var instanceof l1;
        PostalCheckQrScanResult.TermsRequired termsRequired = this.f199375w;
        if (z) {
            bVar.l2(new h(bVar, termsRequired, null), new yi5.b(26));
        } else if (n1Var instanceof j1) {
            PostalCheckFlowContract$Step.TermsAndConditions termsAndConditions = new PostalCheckFlowContract$Step.TermsAndConditions(termsRequired.f61506a, termsRequired.f61507b);
            PostalCheckFlowContract$Step postalCheckFlowContract$Step = (PostalCheckFlowContract$Step) iVar.d();
            oki.h.t2(bVar, iVar, termsAndConditions, ((postalCheckFlowContract$Step instanceof PostalCheckFlowContract$Step.TermsAndConditions) || (postalCheckFlowContract$Step instanceof PostalCheckFlowContract$Step.QrScanner)) ? false : true, null, false, 12);
        } else {
            oki.h.D2(iVar);
        }
        return Unit.f186387a;
    }
}
