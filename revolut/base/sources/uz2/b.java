package uz2;

import efm.d0;
import ffk.t;
import ha3.x;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import pfm.z;
import te0.w;
import ue0.e;
import ufm.i;
import uyd.y;
import uyh.s;
import w4l.h;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f284572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hy2.f f284573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f284574c;

    public b(f cardsInteractor, hy2.f cardDesignInteractor, t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f284572a = cardsInteractor;
        this.f284573b = cardDesignInteractor;
        this.f284574c = pricingPlanInteractor;
    }

    public final z a(String cardId, boolean z) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        ufm.b bVarN = ((x) this.f284572a).n(cardId);
        d0 d0VarFirstOrError = m70.a.g(this.f284574c.v(h.f294642c), null, new s(7), 1).firstOrError();
        a aVar = a.f;
        y yVar = new y(1);
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, yVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        i iVar2 = new i(w.H0(bVarN, iVar), new uyd.z(17, new pud.b(this, z, cardId, 21)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        od0.i.Companion.getClass();
        return e.F(iVar2, od0.i.f224256b);
    }
}
