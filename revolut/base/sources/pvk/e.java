package pvk;

import com.revolut.feature.wealth.api.declaration.InstrumentsCollectionDestination;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionType;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.insights.InsightsScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends oki.h implements o {
    public final InsightsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qrk.c f240271p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.b f240272q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kdh.b f240273r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n2h.a f240274s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r10.w f240275t;
    public final b1h.a u;
    public final f61.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final cli.y f240276w;

    public e(j8f.o mapper, InsightsScreenContract$InputData inputData, qrk.c insightsInteractor, ybl.b tickerInteractor, kdh.b instrumentActionsInteractor, n2h.a actionsPanelControllerModelExtension, r10.w referenceIndexNameProvider, b1h.a collectionWidgetExtension, f61.a disclaimersProvider) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(insightsInteractor, "insightsInteractor");
        Intrinsics.checkNotNullParameter(tickerInteractor, "tickerInteractor");
        Intrinsics.checkNotNullParameter(instrumentActionsInteractor, "instrumentActionsInteractor");
        Intrinsics.checkNotNullParameter(actionsPanelControllerModelExtension, "actionsPanelControllerModelExtension");
        Intrinsics.checkNotNullParameter(referenceIndexNameProvider, "referenceIndexNameProvider");
        Intrinsics.checkNotNullParameter(collectionWidgetExtension, "collectionWidgetExtension");
        Intrinsics.checkNotNullParameter(disclaimersProvider, "disclaimersProvider");
        this.o = inputData;
        this.f240271p = insightsInteractor;
        this.f240272q = tickerInteractor;
        this.f240273r = instrumentActionsInteractor;
        this.f240274s = actionsPanelControllerModelExtension;
        this.f240275t = referenceIndexNameProvider;
        this.u = collectionWidgetExtension;
        this.v = disclaimersProvider;
        this.f240276w = mra.d.b(this, new p(0), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        InsightsScreenContract$InputData insightsScreenContract$InputData = this.o;
        String str = insightsScreenContract$InputData.f104019a;
        qrk.c cVar = this.f240271p;
        w4l.i iVar = w4l.i.f294643c;
        vkm.d dVarB = cVar.b(str, iVar);
        zhm.h0 h0Var = zhm.h0.f322473a;
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.n(dVarB, h0Var), null, null, new c(this, continuation, 4), 3);
        String str2 = insightsScreenContract$InputData.f104019a;
        yji.l.a1(this, rd0.e.n(cVar.a(str2, iVar), h0Var), null, null, new c(this, continuation, 5), 3);
        yji.l.a1(this, rd0.e.n(cVar.c(str2, iVar), h0Var), null, null, new c(this, continuation, 6), 3);
        yji.l.a1(this, rd0.e.n(vkm.q.Q(vkm.q.q(new olf.e(this.f240276w.B(new pui.a(14)), 19)), new pkf.x(continuation, this, 15)), h0Var), null, null, new c(this, continuation, 7), 3);
        yji.l.a1(this, this.v.G(iuk.a.INSIGHTS), null, null, new c(this, continuation, 8), 3);
    }

    public final void I2(x parcel) {
        String str;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (parcel instanceof w) {
            C2(new q(((w) parcel).f240307a));
            return;
        }
        if (!(parcel instanceof v)) {
            throw new NoWhenBranchMatchedException();
        }
        v vVar = (v) parcel;
        boolean zEquals = vVar.equals(r.f240303a);
        n2h.a aVar = this.f240274s;
        cli.y yVar = this.f240276w;
        if (zEquals) {
            hdh.e eVar = (hdh.e) ((p) ((j2) yVar.f22677a).getValue()).f.getContent();
            if (eVar == null) {
                return;
            }
            aVar.Z2(bfl.g.BUY, eVar);
            return;
        }
        if (vVar.equals(s.f240304a)) {
            mel.p pVar = (mel.p) ((p) ((j2) yVar.f22677a).getValue()).f240297a.getContent();
            if (pVar == null || (str = pVar.f204771c) == null) {
                return;
            }
            C1(new InstrumentsCollectionDestination(new InstrumentsCollectionType.Related.Index(str, nel.z.ETF)));
            return;
        }
        if (vVar.equals(t.f240305a)) {
            hdh.e eVar2 = (hdh.e) ((p) ((j2) yVar.f22677a).getValue()).f.getContent();
            if (eVar2 == null) {
                return;
            }
            aVar.Z2(bfl.g.BUY, eVar2);
            return;
        }
        if (!vVar.equals(u.f240306a)) {
            throw new NoWhenBranchMatchedException();
        }
        hdh.e eVar3 = (hdh.e) ((p) ((j2) yVar.f22677a).getValue()).f.getContent();
        if (eVar3 == null) {
            return;
        }
        aVar.Z2(bfl.g.SELL, eVar3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        InsightsScreenContract$InputData insightsScreenContract$InputData = this.o;
        boolean z = insightsScreenContract$InputData.f104020b;
        String str = insightsScreenContract$InputData.f104019a;
        Continuation continuation = null;
        if (z) {
            yji.l.b1(this, nim.a.v(u0.m(kdh.b.b0(this.f240273r, str, 6), this.f240271p.b(str, w4l.h.f294642c)), new pui.a(16)), null, new c(this, continuation, 3), 3);
        } else {
            H2(this.f240276w, new pui.a(15));
        }
        yji.l.b1(this, this.f240275t.s(str), null, new c(this, continuation, 2), 3);
        yji.l.b1(this, ((ael.k) this.f240272q).o(str, w4l.i.f294643c), null, new c(this, continuation, 0), 3);
        yji.l.b1(this, this.u.Z2(), null, new c(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f240276w;
    }
}
