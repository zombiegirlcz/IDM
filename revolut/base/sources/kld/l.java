package kld;

import ble.c1;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import kkf.r6;
import kkk.u;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import twb.b0;
import vkm.q;
import vkm.t0;
import vkm.v1;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends nkd.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final nkd.b f185429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final skd.i f185430m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final twg.c f185431n;
    public final n o;

    public l(nkd.b view, skd.i slotManagerInteractor, twg.c slotManagerEventHandlerManager, n mapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(slotManagerEventHandlerManager, "slotManagerEventHandlerManager");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f185429l = view;
        this.f185430m = slotManagerInteractor;
        this.f185431n = slotManagerEventHandlerManager;
        this.o = mapper;
    }

    @Override // yji.n
    public final void H2() {
        nkd.b bVar = this.f185429l;
        vkm.d dVarB = rd0.e.b(bVar.X1());
        Intrinsics.checkNotNullParameter(dVarB, "<this>");
        int i = 2;
        Continuation continuation = null;
        t0 t0VarB = q.B(new tk9.i(i, 7, continuation), dVarB);
        int i2 = 1;
        u keySelector = new u(i2);
        Intrinsics.checkNotNullParameter(t0VarB, "<this>");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        yji.n.l2(this, q.J(new r6(new r6(new c1(new v1(new b0(t0VarB, keySelector, continuation, 21)), 19), 6), 5), new r6(new r6(new kge.b(rd0.e.b(bVar.q0()), 10), 3), 4), new r6(new r6(new kge.b(rd0.e.b(bVar.w1()), 9), i2), i)), null, new kb7.c(this, null, 18), 3);
    }

    @Override // nkd.a
    public final y Z2(SlotContext slotContext) {
        Intrinsics.checkNotNullParameter(slotContext, "slotContext");
        skd.i iVar = this.f185430m;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(slotContext, "slotContext");
        return rd0.e.e(nim.a.v(nim.a.v(iVar.f263835a.c(slotContext, true), new sk2.f(6)), new k79.b(this, slotContext, 23)), h0.f322473a, new k(3, null));
    }
}
