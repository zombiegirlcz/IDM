package qwe;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.checkout.flow.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dj0.d f249907w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar, dj0.d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f249907w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r rVar = new r(this.v, this.f249907w, continuation);
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
            this.v.C1(new InitTopUpDestination(TopUpConfig.Companion.a(TopUpConfig.INSTANCE, this.f249907w, null, pte.a.NESTED_TOP_UP, 22)));
        } else if (!(n1Var instanceof j1) && !(n1Var instanceof k1) && !(n1Var instanceof m1)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}
