package com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen;

import c4h.b;
import cli.g;
import cli.y;
import com.revolut.shared.feature.wealth.domain.api.interactors.InstrumentTickerInteractor$Companion;
import kotlin.jvm.internal.Intrinsics;
import n2h.f;
import o4h.d;
import o4h.e;
import o4h.n;
import oki.h;
import vkm.j2;
import vkm.q;
import ybl.k;
import ybl.l;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements d {
    public final InvestmentsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n2h.a f95420p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f95421q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f95422r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f95423s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f95424t;

    public a(InvestmentsControllerContract$InputData inputData, n2h.a actionsPanelControllerModelExtension, b investmentsInteractor, l tradingConfigInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(actionsPanelControllerModelExtension, "actionsPanelControllerModelExtension");
        Intrinsics.checkNotNullParameter(investmentsInteractor, "investmentsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f95420p = actionsPanelControllerModelExtension;
        this.f95421q = investmentsInteractor;
        this.f95422r = tradingConfigInteractor;
        this.f95423s = mra.d.b(this, new e(null, null, (f) ((j2) ((m3h.a) actionsPanelControllerModelExtension).f202569p.f22677a).getValue()), stateMapper, null, false, 12);
        this.f95424t = hx7.e.a(this, new nx2.f(this, 18));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f95424t;
    }

    @Override // yji.l
    public final void T1(long j2) {
        InvestmentsControllerContract$InputData investmentsControllerContract$InputData = this.o;
        String tradingAccountId = investmentsControllerContract$InputData.f95412a.toString();
        Intrinsics.checkNotNullExpressionValue(tradingAccountId, "toString(...)");
        String ref2 = investmentsControllerContract$InputData.f95413b;
        b bVar = this.f95421q;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        akg.n nVarD = k.d(bVar.f21298b, tradingAccountId);
        ybl.b bVar2 = bVar.f21299c;
        ybl.b.Companion.getClass();
        yji.l.b1(this, boh.f.e(u0.m(nVarD, q.q(((ael.k) bVar2).p(ref2, w4l.h.f294642c, InstrumentTickerInteractor$Companion.f105074b.a()))), new c4h.a(bVar, ref2, 0)), null, new o4h.l(this, null, 1), 3);
        yji.l.b1(this, l.d(this.f95422r), null, new o4h.l(this, null, 2), 3);
        yji.l.b1(this, (j2) ((m3h.a) this.f95420p).f202569p.f22677a, null, new o4h.l(this, null, 0), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f95423s;
    }
}
