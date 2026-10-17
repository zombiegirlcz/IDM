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
public final class r extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Identifier.Phone f145048w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, Identifier.Phone phone, Continuation continuation) {
        super(2, continuation);
        this.v = sVar;
        this.f145048w = phone;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r rVar = new r(this.v, this.f145048w, continuation);
        rVar.u = obj2;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (n1Var instanceof l1) {
            s sVar = this.v;
            sVar.getClass();
            sVar.v2(new k(this.f145048w));
        } else if (!(n1Var instanceof j1) && !(n1Var instanceof k1) && !(n1Var instanceof m1)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}
