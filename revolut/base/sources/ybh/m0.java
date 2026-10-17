package ybh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m0 extends gim.i implements Function1 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b f312320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dii.g f312321x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ dj0.d f312322y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b bVar, dii.g gVar, dj0.d dVar, Continuation continuation) {
        super(1, continuation);
        this.f312320w = bVar;
        this.f312321x = gVar;
        this.f312322y = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m0(this.f312321x, this.f312320w, this.f312322y, continuation);
            default:
                return new m0(this.f312320w, this.f312321x, this.f312322y, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    if (Intrinsics.f(this.f312321x, dii.e.f115068a)) {
                        this.v = 1;
                        if (com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b.I2(this.f312320w, this.f312322y, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    dj0.d dVar = this.f312322y;
                    dii.g gVar = this.f312321x;
                    com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b bVar = this.f312320w;
                    m0 m0Var = new m0(gVar, bVar, dVar, (Continuation) null);
                    this.v = 1;
                    if (bVar.p2(this, m0Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(dii.g gVar, com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b bVar, dj0.d dVar, Continuation continuation) {
        super(1, continuation);
        this.f312321x = gVar;
        this.f312320w = bVar;
        this.f312322y = dVar;
    }
}
