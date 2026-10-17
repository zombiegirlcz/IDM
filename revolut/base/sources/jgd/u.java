package jgd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends gim.i implements Function1 {
    public final /* synthetic */ RowDelegate.Model u;
    public final /* synthetic */ x v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(RowDelegate.Model model, x xVar, Continuation continuation) {
        super(1, continuation);
        this.u = model;
        this.v = xVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new u(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((u) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(this.u.f53228a, "LIST_ID_ITEM_ADD_TO_CONVERTER")) {
            this.v.z2();
        }
        return Unit.f186387a;
    }
}
