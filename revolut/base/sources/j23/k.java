package j23;

import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabControllerContract$InputData;
import g23.k0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h23.d f170669c;
    public final k0 d;

    public k(h23.d debitCardsBlockProvider, k0 linkCardBlockProvider) {
        Intrinsics.checkNotNullParameter(debitCardsBlockProvider, "debitCardsBlockProvider");
        Intrinsics.checkNotNullParameter(linkCardBlockProvider, "linkCardBlockProvider");
        this.f170669c = debitCardsBlockProvider;
        this.d = linkCardBlockProvider;
    }

    @Override // j23.p
    public final Flow a() {
        h23.d dVar = this.f170669c;
        k23.b bVar = dVar.d;
        OrderNewCardTabControllerContract$InputData orderNewCardTabControllerContract$InputData = dVar.f148631a;
        wkm.l lVarB = bVar.b(new k23.a(null, null, orderNewCardTabControllerContract$InputData.f65114g, 3), orderNewCardTabControllerContract$InputData.f, orderNewCardTabControllerContract$InputData.f65115h);
        wkm.l lVarQ = vkm.q.Q(new y(new h23.b(rd0.e.b(dVar.e.X(com.revolut.feature.card_order_new.api.a.a(orderNewCardTabControllerContract$InputData.f65113c), w4l.h.f294642c)), 0), new g23.j(3, 20, null)), new g6f.l(null, dVar, 22));
        k23.f fVar = dVar.f148633c;
        return c(v.k(new o(new y(new g2d.c(2, 11, null), new y(ta6.a.e(fVar.a(), (Flow) fVar.f180318g.getValue(), (Flow) fVar.f180319h.getValue(), lVarB, lVarQ, new h23.c(dVar, (Continuation) null)), new g23.j(3, 22, null))), u.c(dVar.f148634g), null, "DebitCards", 4), this.d.Z2()));
    }
}
