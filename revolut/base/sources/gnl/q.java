package gnl;

import com.revolut.sso.impl.domain.models.Identifier;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;

/* JADX INFO: loaded from: classes12.dex */
public final class q extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Identifier.Email f145047w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, Identifier.Email email, Continuation continuation) {
        super(2, continuation);
        this.v = sVar;
        this.f145047w = email;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.v, this.f145047w, continuation);
        qVar.u = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (n1Var instanceof l1) {
            this.v.v2(new k(this.f145047w));
        } else if (!(n1Var instanceof j1) && !(n1Var instanceof k1) && !(n1Var instanceof m1)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}
