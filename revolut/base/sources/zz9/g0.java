package zz9;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class g0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d f326610w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i, com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar, Continuation continuation) {
        super(1, continuation);
        this.u = i;
        this.f326610w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g0(0, this.f326610w, continuation);
            default:
                return new g0(1, this.f326610w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar = this.f326610w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    e0a.e eVar = dVar.v;
                    String str = ((q) ((j2) dVar.I.f22677a).getValue()).d;
                    this.v = 1;
                    obj2 = ((e0a.i) eVar).c3(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                e0a.f0 f0Var = (e0a.f0) obj2;
                if (!Intrinsics.f(f0Var, e0a.d0.f121488a)) {
                    if (!(f0Var instanceof e0a.e0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar.C2(new u(((e0a.e0) f0Var).f121489a));
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar2 = this.f326610w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    e0a.e eVar2 = dVar2.v;
                    this.v = 1;
                    obj2 = ((e0a.i) eVar2).c3(null, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                e0a.f0 f0Var2 = (e0a.f0) obj2;
                if (!(f0Var2 instanceof e0a.d0)) {
                    if (!(f0Var2 instanceof e0a.e0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar2.C2(new u(((e0a.e0) f0Var2).f121489a));
                }
                return Unit.f186387a;
        }
    }
}
