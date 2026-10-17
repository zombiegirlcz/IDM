package lb0;

import com.revolut.feature.backend_flow.domain.models.BackendFlowFile;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.m1;
import nii.n1;

/* JADX INFO: loaded from: classes19.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.backend_flow.impl.ui.form_screen.a f193528w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f193529x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ BackendFlowFile f193530y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(com.revolut.core.backend_flow.impl.ui.form_screen.a aVar, String str, BackendFlowFile backendFlowFile, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f193528w = aVar;
        this.f193529x = str;
        this.f193530y = backendFlowFile;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c0 c0Var = new c0(this.f193528w, this.f193529x, this.f193530y, continuation, 0);
                c0Var.v = obj2;
                return c0Var;
            default:
                c0 c0Var2 = new c0(this.f193528w, this.f193529x, this.f193530y, continuation, 1);
                c0Var2.v = obj2;
                return c0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n1 n1Var = (n1) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c0) create(n1Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                n1 n1Var = (n1) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    com.revolut.core.backend_flow.impl.ui.form_screen.a aVar2 = this.f193528w;
                    aVar2.l2(new b0(aVar2, this.f193530y, this.f193529x, (Continuation) null, 0), new yi5.b(26));
                }
                break;
            default:
                n1 n1Var2 = (n1) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                boolean z = n1Var2 instanceof l1;
                BackendFlowFile backendFlowFile = this.f193530y;
                String str = this.f193529x;
                com.revolut.core.backend_flow.impl.ui.form_screen.a aVar4 = this.f193528w;
                if (z) {
                    aVar4.T2(str, zhm.u.c(backendFlowFile.f63281g));
                } else if (n1Var2 instanceof m1) {
                    aVar4.l2(new b0(aVar4, backendFlowFile, str, (Continuation) null, 0), new yi5.b(26));
                } else {
                    Unit unit = Unit.f186387a;
                }
                break;
        }
        return Unit.f186387a;
    }
}
