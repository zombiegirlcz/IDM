package xya;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.b f309683w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f309683w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f309683w, continuation, 0);
            case 1:
                return new g(this.f309683w, continuation, 1);
            default:
                return new g(this.f309683w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.b bVar = this.f309683w;
                    jya.d dVar = bVar.f81926r;
                    pwa.n nVar = bVar.o.f81920a;
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.b bVar2 = this.f309683w;
                    jya.d dVar2 = bVar2.f81926r;
                    pwa.n nVar2 = bVar2.o.f81920a;
                    this.v = 1;
                    if (dVar2.h(nVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.b bVar3 = this.f309683w;
                    jya.d dVar3 = bVar3.f81926r;
                    pwa.n nVar3 = bVar3.o.f81920a;
                    this.v = 1;
                    if (dVar3.m(nVar3, this) == aVar3) {
                        return aVar3;
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
