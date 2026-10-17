package rya;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.a f258285w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f258285w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.f258285w, continuation, 0);
            case 1:
                return new t(this.f258285w, continuation, 1);
            default:
                return new t(this.f258285w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.a aVar2 = this.f258285w;
                    jya.d dVar = aVar2.f81897q;
                    pwa.n nVar = aVar2.o.f81888b;
                    this.v = 1;
                    if (dVar.h(nVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.a aVar4 = this.f258285w;
                    jya.d dVar2 = aVar4.f81897q;
                    pwa.n nVar2 = aVar4.o.f81888b;
                    this.v = 1;
                    if (dVar2.h(nVar2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.a aVar6 = this.f258285w;
                    jya.d dVar3 = aVar6.f81897q;
                    pwa.n nVar3 = aVar6.o.f81888b;
                    this.v = 1;
                    if (dVar3.m(nVar3, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
