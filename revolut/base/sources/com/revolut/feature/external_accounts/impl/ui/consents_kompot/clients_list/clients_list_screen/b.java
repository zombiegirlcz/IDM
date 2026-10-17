package com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.domain.models.openbanking.OpenBankingConsentsFilter;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.OpenBankingConsentsFlowContract$FlowType;
import g48.r0;
import he4.r;
import hl6.g;
import hl6.i;
import hl6.k;
import hl6.o;
import hx7.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oe6.m;
import oki.h;
import uw1.c;
import vkm.j2;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements k {
    public final m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f72763p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r0 f72764q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y21.c f72765r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gjl.b f72766s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ClientsListScreenContract$Input f72767t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public b(n stateMapper, m openBankingInteractor, c apmFeatureChecker, r0 jointAccountsInteractor, y21.c optOutRepository, gjl.b connectedAppsControllerModelExtension, ClientsListScreenContract$Input input) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(openBankingInteractor, "openBankingInteractor");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        Intrinsics.checkNotNullParameter(connectedAppsControllerModelExtension, "connectedAppsControllerModelExtension");
        Intrinsics.checkNotNullParameter(input, "input");
        this.o = openBankingInteractor;
        this.f72763p = apmFeatureChecker;
        this.f72764q = jointAccountsInteractor;
        this.f72765r = optOutRepository;
        this.f72766s = connectedAppsControllerModelExtension;
        this.f72767t = input;
        this.u = d.b(this, new g(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), i.UNAVAILABLE, hl6.h.UNAVAILABLE), stateMapper, null, false, 12);
        this.v = e.a(this, new hkb.e(4));
    }

    @Override // yji.l
    public final void I1() {
        vkm.d dVarB = rd0.e.b(((cpj.b) ((ty1.b) this.f72763p).f275453a).m(yoj.c.APM_IDEAL, yoj.d.DISABLED));
        int i = 1;
        Continuation continuation = null;
        l.a1(this, dVarB, null, null, new hl6.m(i, this, continuation), 3);
        l.a1(this, (j2) ((jpl.d) this.f72766s).f177326p.f22677a, null, null, new hl6.m(4, this, continuation), 3);
        boolean zF = Intrinsics.f(this.f72767t.f72760a, OpenBankingConsentsFlowContract$FlowType.Australia.f72741a);
        m mVar = this.o;
        if (!zF) {
            oe6.l lVar = m.Companion;
            l.a1(this, rd0.e.b(nim.a.w(((hf6.i) ((mg6.c) mVar).f205160a).f151763g.f(Unit.f186387a, true), new r(13))), null, null, new hl6.n(this, null), 3);
            return;
        }
        mg6.c cVar = (mg6.c) mVar;
        cVar.getClass();
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        mg6.d dVar = cVar.f205160a;
        OpenBankingConsentsFilter consentState = OpenBankingConsentsFilter.ALL;
        hf6.i iVar = (hf6.i) dVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(consentState, "consentState");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        akg.n nVarV = nim.a.v(iVar.f151764h.b(Unit.f186387a, loadingStrategy), new md0.c(23));
        int i2 = 0;
        l.a1(this, nVarV, null, null, new hl6.m(i2, this, continuation), 3);
        r0 r0Var = this.f72764q;
        l.a1(this, q.Q(k38.c.a(r0Var, null, null, 3), new o(i2, this, continuation)), null, null, new hl6.m(2, this, continuation), 3);
        l.a1(this, q.Q(k38.c.a(r0Var, null, null, 3), new o(i, this, continuation)), null, null, new hl6.m(3, this, continuation), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
