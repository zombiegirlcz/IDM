package ks9;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ n0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(n0 n0Var, Continuation continuation) {
        super(2, continuation);
        this.v = n0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i0 i0Var = new i0(this.v, continuation);
        i0Var.u = obj2;
        return i0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i0) create((rp0.z) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        rp0.z zVar = (rp0.z) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(zVar.f256227a, "LEARN_MORE_SMART_SETTLE_ID")) {
            n0 n0Var = this.v;
            n0Var.u.getClass();
            yji.n.P2(n0Var, new ActionsBottomSheetController(wr9.e.a()), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a0.d.r(zVar.f256227a, " is not supported"));
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        }
        return Unit.f186387a;
    }
}
