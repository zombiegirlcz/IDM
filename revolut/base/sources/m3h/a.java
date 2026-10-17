package m3h;

import bfl.g;
import com.revolut.data.model.Data;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lph.h;
import n2h.e;
import n2h.f;
import vkm.j2;
import x2h.b;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends n2h.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f202566l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kdh.b f202567m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o2h.a f202568n;
    public final d4h.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vki.a f202569p;

    public a(e input, kdh.b instrumentActionsInteractor, o2h.a navigationExtension, d4h.b actionsToActionPanelStateMapper) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(instrumentActionsInteractor, "instrumentActionsInteractor");
        Intrinsics.checkNotNullParameter(navigationExtension, "navigationExtension");
        Intrinsics.checkNotNullParameter(actionsToActionPanelStateMapper, "actionsToActionPanelStateMapper");
        this.f202566l = input;
        this.f202567m = instrumentActionsInteractor;
        this.f202568n = navigationExtension;
        this.o = actionsToActionPanelStateMapper;
        this.f202569p = pyd.c.a(this, new f(new Data(null, null, false, 7, null)));
    }

    @Override // yji.n
    public final void H2() {
        e eVar = this.f202566l;
        if (!eVar.f211544b) {
            X2(this.f202569p, new m30.c(19));
        } else {
            n.l2(this, kdh.b.b0(this.f202567m, eVar.f211543a, 6), null, new h(this, null, 19), 3);
        }
    }

    @Override // n2h.a
    public final void Z2(g tradeSide, hdh.e actionsState) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(actionsState, "actionsState");
        this.f202568n.b(tradeSide, actionsState);
    }

    @Override // n2h.a
    public final void b3() {
        g gVar;
        hdh.e eVar = (hdh.e) ((f) ((j2) this.f202569p.f22677a).getValue()).f211545a.getContent();
        if (eVar == null) {
            return;
        }
        x2h.b bVarA = this.o.a(eVar);
        if (bVarA instanceof x2h.a) {
            x2h.a aVar = (x2h.a) bVarA;
            if (aVar.f302570a) {
                gVar = g.BUY;
            } else {
                if (!aVar.f302571b) {
                    r6.b.D("If new BuySellActions parameter has been added it should be handled properly");
                    return;
                }
                gVar = g.SELL;
            }
        } else {
            if (!bVarA.equals(b.a.f302572a)) {
                if (!bVarA.equals(b.C1676b.f302573a)) {
                    throw new NoWhenBranchMatchedException();
                }
                r6.b.D("If no actions are available button clicks shouldn't be handled");
                return;
            }
            gVar = g.BUY;
        }
        this.f202568n.b(gVar, eVar);
    }

    @Override // n2h.a
    public final void c3() {
        hdh.e eVar = (hdh.e) ((f) ((j2) this.f202569p.f22677a).getValue()).f211545a.getContent();
        if (eVar == null) {
            return;
        }
        x2h.b bVarA = this.o.a(eVar);
        if (!(bVarA instanceof x2h.a)) {
            r6.b.D("Other ActionsPanelState states should be handled accordingly");
        } else if (((x2h.a) bVarA).f302571b) {
            Z2(g.SELL, eVar);
        } else {
            r6.b.D("If no trade action is available button clicks shouldn't be handled");
        }
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f202569p;
    }
}
