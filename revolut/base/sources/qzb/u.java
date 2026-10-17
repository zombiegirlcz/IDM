package qzb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.impl.ui.opt_in.screen.a f250514w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, com.revolut.feature.rev_points.impl.ui.opt_in.screen.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f250514w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u(0, this.f250514w, continuation);
            case 1:
                return new u(1, this.f250514w, continuation);
            default:
                return new u(2, this.f250514w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.rev_points.impl.ui.opt_in.screen.a aVar2 = this.f250514w;
                t tVar = new t(0, aVar2, null);
                this.v = 1;
                Object objB = pu7.a.B(aVar2.k, "NO_INTRO_TASK", tVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.rev_points.impl.ui.opt_in.screen.a aVar4 = this.f250514w;
                    t tVar2 = new t(1, aVar4, null);
                    this.v = 1;
                    if (u0.b0(aVar4.X(), "ACTION_FOOTER_BUTTON_TAG", tVar2, this) == aVar3) {
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
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.rev_points.impl.ui.opt_in.screen.a aVar6 = this.f250514w;
                t tVar3 = new t(3, aVar6, null);
                this.v = 1;
                Object objB2 = pu7.a.B(aVar6.k, "OPT_IN_TASK", tVar3, this);
                return objB2 == aVar5 ? aVar5 : objB2;
        }
    }
}
