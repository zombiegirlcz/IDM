package ku1;

import android.os.Parcelable;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.kompot.common.StackDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class d0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ e0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ServerError f189598w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, ServerError serverError, Continuation continuation) {
        super(2, continuation);
        this.v = e0Var;
        this.f189598w = serverError;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d0 d0Var = new d0(this.v, this.f189598w, continuation);
        d0Var.u = obj2;
        return d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean z = n1Var instanceof j1;
        e0 e0Var = this.v;
        if (z || (n1Var instanceof k1) || (n1Var instanceof m1)) {
            if (e0.f189599y.contains(Integer.valueOf(this.f189598w.f51362a))) {
                e0Var.v2(new k(((h) e0Var.t2()).f));
            }
        } else {
            if (!(n1Var instanceof l1)) {
                throw new NoWhenBranchMatchedException();
            }
            FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
            Parcelable parcelableA = ((l1) n1Var).f216190a.a();
            StackDestination stackDestination = parcelableA instanceof StackDestination ? (StackDestination) parcelableA : null;
            e0Var.C1(u0.b(com.revolut.retail.core.navigation.a.c(finishCommand, stackDestination != null ? u0.f(stackDestination) : null)));
        }
        return Unit.f186387a;
    }
}
