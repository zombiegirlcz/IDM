package knl;

import com.revolut.kompot.common.ExternalDestination;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ Function1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f186195w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Function1 function1, h hVar, Continuation continuation) {
        super(2, continuation);
        this.v = function1;
        this.f186195w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, this.f186195w, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if ((n1Var instanceof j1) || (n1Var instanceof k1) || (n1Var instanceof m1)) {
            this.v.invoke(b.f186193a);
        } else {
            if (!(n1Var instanceof l1)) {
                throw new NoWhenBranchMatchedException();
            }
            h hVar = this.f186195w;
            hVar.A2(new ExternalDestination.ByIntent(((s70.b) hVar.f186196l).b(), null));
        }
        return Unit.f186387a;
    }
}
