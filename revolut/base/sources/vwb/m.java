package vwb;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ n u;
    public final /* synthetic */ VoucherSmallTileDelegate.Model v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, VoucherSmallTileDelegate.Model model, Continuation continuation) {
        super(1, continuation);
        this.u = nVar;
        this.v = model;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = this.v.f53623w;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.rev_points.giftcards.api.model.VoucherProductGroup");
        this.u.C2(new g((VoucherProductGroup) obj3));
        return Unit.f186387a;
    }
}
