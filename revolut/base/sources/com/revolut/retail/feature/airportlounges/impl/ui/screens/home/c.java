package com.revolut.retail.feature.airportlounges.impl.ui.screens.home;

import ang.f;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.retail.feature.airportlounges.api.AirportLoungesApi$Toggles;
import cxe.u;
import dwi.b0;
import dwi.c0;
import dwi.s;
import ffk.t;
import gld.f0;
import hwi.x0;
import hx7.e;
import i7d.o;
import ip0.v7;
import jsl.t0;
import jxi.a0;
import jxi.d0;
import jxi.r;
import jxi.v;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import md6.p;
import md6.q;
import mkd.d;
import nyb.k;
import oki.h;
import org.jetbrains.annotations.NotNull;
import owi.g;
import w4l.i;
import wli.x;
import yji.l;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends h implements v {

    @NotNull
    public static final a0 Companion = new a0();
    public final x A;
    public final c0 B;
    public final gte.a C;
    public final vii.b D;
    public final vii.b E;
    public final vii.b F;
    public final y G;
    public final com.revolut.kompot.navigable.vc.modal.a H;
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f99093p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s f99094q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b0 f99095r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x0 f99096s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t f99097t;
    public final s70.a u;
    public final d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final qvi.d f99098w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i4b.f f99099x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g f99100y;
    public final o z;

    public c(n stateMapper, f userInteractor, k revPointsInteractor, s loungePassesInteractor, b0 loungesInteractor, x0 loungesUserCapabilitiesRepository, t pricingPlanInteractor, s70.a intentProvider, d slotManagerFeedExtension, qvi.d termsAndConditionsInteractor, i4b.f legalEntityContextProvider, g productArticleParamsProvider, o helpWidgetControllerModelExtension, x deeplinkHandler, c0 passActivityInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(loungePassesInteractor, "loungePassesInteractor");
        Intrinsics.checkNotNullParameter(loungesInteractor, "loungesInteractor");
        Intrinsics.checkNotNullParameter(loungesUserCapabilitiesRepository, "loungesUserCapabilitiesRepository");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(slotManagerFeedExtension, "slotManagerFeedExtension");
        Intrinsics.checkNotNullParameter(termsAndConditionsInteractor, "termsAndConditionsInteractor");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(productArticleParamsProvider, "productArticleParamsProvider");
        Intrinsics.checkNotNullParameter(helpWidgetControllerModelExtension, "helpWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(passActivityInteractor, "passActivityInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = userInteractor;
        this.f99093p = revPointsInteractor;
        this.f99094q = loungePassesInteractor;
        this.f99095r = loungesInteractor;
        this.f99096s = loungesUserCapabilitiesRepository;
        this.f99097t = pricingPlanInteractor;
        this.u = intentProvider;
        this.v = slotManagerFeedExtension;
        this.f99098w = termsAndConditionsInteractor;
        this.f99099x = legalEntityContextProvider;
        this.f99100y = productArticleParamsProvider;
        this.z = helpWidgetControllerModelExtension;
        this.A = deeplinkHandler;
        this.B = passActivityInteractor;
        this.C = featureToggleInteractor;
        i iVar = i.f294643c;
        this.D = new vii.b(iVar);
        this.E = new vii.b(iVar);
        this.F = new vii.b(iVar);
        this.G = mra.d.b(this, new r(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, false, 7, null), null, null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.H = e.a(this, new jnf.d(this, 22));
    }

    @Override // yji.l
    public final void I1() {
        mkd.a aVar = new mkd.a(new SlotContext(akd.s.AIRPORT_LOUNGES_HOME));
        f0 f0Var = (f0) this.v;
        f0Var.c3(aVar);
        u uVarY = nim.a.y(v7.y("AirportLoungesHomeScreenModel", "onCreated", f0Var.f144638l.h()), new jxb.g(17));
        Continuation continuation = null;
        l.a1(this, uVarY, null, null, new d0(1, this, continuation), 3);
        l.a1(this, this.o.j(w4l.h.f294642c), null, null, new d0(2, this, continuation), 3);
        l.a1(this, rd0.e.b(this.f99097t.q()), null, null, new d0(3, this, continuation), 3);
        x0 x0Var = this.f99096s;
        l.a1(this, x0.a(x0Var), null, null, new d0(4, this, continuation), 3);
        l.a1(this, this.f99099x.j(new q(p.LOUNGES, false)), null, null, new d0(5, this, continuation), 3);
        l2(new b(this, null), new yi5.b(26));
        l.a1(this, vkm.q.Q(vkm.q.q(new jij.d(x0.a(x0Var), 21)), new jxi.b0(0, this, continuation)), null, null, new d0(0, this, continuation), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.H;
    }

    @Override // yji.l
    public final void T1(long j2) {
        svi.e eVarS;
        iwi.f fVar = (iwi.f) ((hwi.a0) this.f99094q.f120458a).f156189b.T2("KEY_MEMBERSHIP", iwi.f.class);
        Continuation continuation = null;
        svi.k kVarD = fVar != null ? jwi.c.d(fVar) : null;
        int i = (kVarD == null || (eVarS = cp5.d.s(kVarD)) == null) ? 0 : eVarS.f265896a;
        l.b1(this, rd0.e.b(this.f99093p.c(true)), null, new d0(8, this, continuation), 3);
        jxi.b0 b0Var = new jxi.b0(1, this, continuation);
        vii.b bVar = this.D;
        l.b1(this, vkm.q.Q(bVar, b0Var), null, new t0(i, this, (Continuation) null), 3);
        l.b1(this, vkm.q.Q(bVar, new jxi.b0(2, this, continuation)), null, new d0(9, this, continuation), 3);
        l.a1(this, vkm.q.Q(bVar, new jxi.b0(3, this, continuation)), null, null, new d0(10, this, continuation), 3);
        l.b1(this, vkm.q.Q(bVar, new jxi.b0(4, this, continuation)), null, new d0(11, this, continuation), 3);
        l.b1(this, vkm.q.Q(this.E, new jxi.b0(5, this, continuation)), null, new d0(6, this, continuation), 3);
        if (((jte.d) this.C).c(AirportLoungesApi$Toggles.AirportLoungesPassActivity.f98910c)) {
            l.b1(this, prk.o.w("AirportLoungesHomeScreenModel", "passActivity", vkm.q.Q(this.F, new jxi.b0(6, this, continuation))), null, new d0(7, this, continuation), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.G;
    }
}
