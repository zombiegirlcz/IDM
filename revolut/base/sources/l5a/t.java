package l5a;

import aw0.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e f192218w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f192218w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.f192218w, continuation, 0);
            case 1:
                return new t(this.f192218w, continuation, 1);
            case 2:
                return new t(this.f192218w, continuation, 2);
            case 3:
                return new t(this.f192218w, continuation, 3);
            default:
                return new t(this.f192218w, continuation, 4);
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
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e eVar = this.f192218w;
                s sVar = new s(eVar, null);
                this.v = 1;
                Object objB = pu7.a.B(eVar.k, "handleScheduledTransfersClicked", sVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e eVar2 = this.f192218w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    eVar2.f80196q.getClass();
                    ufm.b bVarA = h3a.n.a();
                    this.v = 1;
                    obj2 = nim.a.b(bVarA, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                eVar2.H2(eVar2.J, new l0c.s((k9) obj2, 13));
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e eVar3 = this.f192218w;
                x xVar = new x(eVar3, null);
                this.v = 1;
                Object objB2 = pu7.a.B(eVar3.k, "onNavBarTitleClicked", xVar, this);
                return objB2 == aVar3 ? aVar3 : objB2;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.e eVar4 = this.f192218w;
                com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.c cVar = new com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.c(eVar4, null);
                this.v = 1;
                Object objB3 = pu7.a.B(eVar4.k, "onSearchClicked", cVar, this);
                return objB3 == aVar4 ? aVar4 : objB3;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    efm.b bVarIgnoreElements = ((sl3.k) ((wl3.h) this.f192218w.f80202y).f298380a).f264121n.ignoreElements();
                    Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                    this.v = 1;
                    if (nim.a.a(bVarIgnoreElements, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
