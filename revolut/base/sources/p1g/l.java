package p1g;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p1g.g;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ CellDetailsChevronDelegate.Model u;
    public final /* synthetic */ m v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(CellDetailsChevronDelegate.Model model, m mVar, Continuation continuation) {
        super(1, continuation);
        this.u = model;
        this.v = mVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (Intrinsics.f(this.u.f51822a, "PAST_AND_CANCELLED_ITEM_ID")) {
            this.v.C2(g.b.f231924a);
        }
        return Unit.f186387a;
    }
}
