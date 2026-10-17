package oh4;

import com.revolut.feature.credit.application.plugins.impl.ui.rejected.RejectedControllerContract$InputData;
import hs3.k1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.j1;
import nii.l1;
import nii.m1;
import nii.n1;
import rp0.z;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f225295w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f225295w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(this.f225295w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            default:
                k kVar2 = new k(this.f225295w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((z) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        l lVar = this.f225295w;
        Continuation continuation = null;
        int i2 = 0;
        switch (i) {
            case 0:
                z zVar = (z) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                lVar.n2(new i(zVar.f256227a, lVar, continuation, i2), new whi.b(6));
                break;
            default:
                RejectedControllerContract$InputData rejectedControllerContract$InputData = lVar.f225298r;
                n1 n1Var = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (n1Var instanceof l1) {
                    lVar.L2(rejectedControllerContract$InputData.f68299a.f154913c.f154904b);
                } else if (n1Var instanceof m1) {
                    k1 k1Var = rejectedControllerContract$InputData.f68299a.d;
                    if (k1Var != null) {
                        lVar.L2(k1Var.f154904b);
                    }
                } else if (n1Var instanceof j1) {
                    lVar.n2(new i(((j1) n1Var).f216180b.f275445a, lVar, continuation, i2), new whi.b(6));
                } else {
                    lVar.n2(new j(lVar, continuation, i2), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
