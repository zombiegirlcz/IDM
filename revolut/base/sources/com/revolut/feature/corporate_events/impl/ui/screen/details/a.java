package com.revolut.feature.corporate_events.impl.ui.screen.details;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.core.navigation.BrowserCommand;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import gp3.n;
import gp3.p;
import gp3.r;
import h8b.c;
import hx7.e;
import iel.i;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.j2;
import vkm.q;
import vkm.t0;
import ybl.b;
import yhl.d;
import yji.l;
import zh9.u0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements gp3.a {
    public final CorporateEventDetailsContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f66124p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f66125q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fkg.a f66126r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f66127s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f80.a f66128t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(CorporateEventDetailsContract$InputData inputData, d corporateEventsInteractor, b instrumentTickerInteractor, fkg.a corporateEventsInstrumentTransformer, c infoMapperWrapper, f80.a uriHelper, r stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(corporateEventsInteractor, "corporateEventsInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(corporateEventsInstrumentTransformer, "corporateEventsInstrumentTransformer");
        Intrinsics.checkNotNullParameter(infoMapperWrapper, "infoMapperWrapper");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f66124p = corporateEventsInteractor;
        this.f66125q = instrumentTickerInteractor;
        this.f66126r = corporateEventsInstrumentTransformer;
        this.f66127s = infoMapperWrapper;
        this.f66128t = uriHelper;
        boolean z = inputData.f66122c;
        EnumEntries enumEntriesA = m8b.d.a();
        int iB = q0.b(w.t(enumEntriesA, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : enumEntriesA) {
            linkedHashMap.put(obj2, Boolean.FALSE);
        }
        this.u = mra.d.b(this, new gp3.b(null, null, z, linkedHashMap), stateMapper, null, false, 12);
        this.v = e.a(this, new n(this, 0));
    }

    public final void I2() {
        gp3.c cVar;
        kp3.b bVar;
        Data data = ((gp3.b) ((j2) this.u.f22677a).getValue()).f145226a;
        i iVarA = (data == null || (cVar = (gp3.c) data.getContent()) == null || (bVar = cVar.f145229a) == null) ? null : bVar.a();
        iel.a aVar = iVarA instanceof iel.a ? (iel.a) iVarA : null;
        if (aVar != null) {
            C1(new AssetDetailsDestination(aVar.i(), null, false, null, null, null, 62));
        }
    }

    public final void J2() {
        String strI;
        gp3.c cVar;
        kp3.b bVar;
        Data data = ((gp3.b) ((j2) this.u.f22677a).getValue()).f145226a;
        i iVarA = (data == null || (cVar = (gp3.c) data.getContent()) == null || (bVar = cVar.f145229a) == null) ? null : bVar.a();
        iel.h hVar = iVarA instanceof iel.h ? (iel.h) iVarA : null;
        if (hVar == null || (strI = oi0.d.i(hVar)) == null) {
            return;
        }
        C1(u0.b(new BrowserCommand(((f80.b) this.f66128t).f(strI))));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // yji.l
    public final void T1(long j2) {
        CorporateEventDetailsContract$InputData corporateEventDetailsContract$InputData = this.o;
        efm.r rVarCompose = rd0.e.c(nim.a.v(this.f66124p.d(corporateEventDetailsContract$InputData.f66120a, corporateEventDetailsContract$InputData.f66121b, w4l.h.f294642c), new gn.a(11)), g.f186406a).compose(this.f66126r);
        Intrinsics.checkNotNullExpressionValue(rVarCompose, "compose(...)");
        int i = 12;
        Continuation continuation = null;
        l.b1(this, nim.a.u(new g0a.e(i, continuation, this), nim.a.v(rd0.e.b(rVarCompose), new gn.a(i))), null, new p(this, null, 0), 3);
        l.b1(this, q.Q(new t0(this.u.B(new gn.a(13)), 1), new g6f.l(continuation, this, 11)), null, new p(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
