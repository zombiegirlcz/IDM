package a83;

import com.revolut.core.ui_kit.models.AppTipUIModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class g0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a f2049w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f2049w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g0(this.f2049w, continuation, 0);
            case 1:
                return new g0(this.f2049w, continuation, 1);
            case 2:
                return new g0(this.f2049w, continuation, 2);
            default:
                return new g0(this.f2049w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g0) create((AppTipUIModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a.I2(this.f2049w, this) == aVar) {
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
                com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a aVar3 = this.f2049w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    d73.u uVar = aVar3.f65472p;
                    this.v = 1;
                    if (((nyb.b) uVar.f111806g).f()) {
                        Object objA = uVar.f111804b.a(new tk0.b("HIDE_REV_POINTS_OPT_IN_BANNER"));
                        Boolean bool = Boolean.TRUE;
                        obj2 = Intrinsics.f(objA, bool) ? bool : uVar.a(this);
                    } else {
                        obj2 = Boolean.TRUE;
                    }
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar3.H2(aVar3.Q, new a2g.p(((Boolean) obj2).booleanValue(), 3));
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    d73.u uVar2 = this.f2049w.f65472p;
                    this.v = 1;
                    Object objE = uVar2.f111804b.e(new tk0.b("HIDE_REV_POINTS_OPT_IN_BANNER"), Boolean.TRUE, this);
                    if (objE != aVar4) {
                        objE = Unit.f186387a;
                    }
                    if (objE == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    d73.u uVar3 = this.f2049w.f65472p;
                    this.v = 1;
                    Object objE2 = uVar3.f111804b.e(new tk0.b("CARDS_REACTIVATION_TIP_SHOWN"), Boolean.TRUE, this);
                    if (objE2 != aVar5) {
                        objE2 = Unit.f186387a;
                    }
                    if (objE2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
