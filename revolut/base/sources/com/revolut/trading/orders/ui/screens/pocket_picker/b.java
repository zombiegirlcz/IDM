package com.revolut.trading.orders.ui.screens.pocket_picker;

import android.os.Parcelable;
import aw0.n6;
import boh.f;
import cie.l1;
import cnc.t;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.trading.orders.TradingOrdersApi$Toggles;
import cul.n2;
import cul.r1;
import cvl.g;
import cvl.j;
import cvl.p;
import cvl.v;
import fv6.n;
import fvl.e;
import fvl.k;
import fvl.l;
import fvl.m;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import odf.d;
import oki.h;
import te0.w;
import vii.c;
import vkm.q;
import vkm.t0;
import w4l.i;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends h implements p {
    public final v o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r10.a f107053p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f107054q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f107055r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f107056s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d1h.e f107057t;
    public final gte.a u;
    public final fvl.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k f107058w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f107059x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f107060y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public b(cvl.l initialState, v statesMapper, j saveStateDelegate, r10.a sourcePocketSectionsProvider, m wealthDisclaimersProvider, e currenciesProvider, l selectedSourcePocketResolver, d1h.e disclaimersModelExtension, gte.a featureToggleInteractor, fvl.h pocketDisclaimersProvider, k pocketSectionExplanationsProvider) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(statesMapper, "statesMapper");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(sourcePocketSectionsProvider, "sourcePocketSectionsProvider");
        Intrinsics.checkNotNullParameter(wealthDisclaimersProvider, "wealthDisclaimersProvider");
        Intrinsics.checkNotNullParameter(currenciesProvider, "currenciesProvider");
        Intrinsics.checkNotNullParameter(selectedSourcePocketResolver, "selectedSourcePocketResolver");
        Intrinsics.checkNotNullParameter(disclaimersModelExtension, "disclaimersModelExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(pocketDisclaimersProvider, "pocketDisclaimersProvider");
        Intrinsics.checkNotNullParameter(pocketSectionExplanationsProvider, "pocketSectionExplanationsProvider");
        this.o = statesMapper;
        this.f107053p = sourcePocketSectionsProvider;
        this.f107054q = wealthDisclaimersProvider;
        this.f107055r = currenciesProvider;
        this.f107056s = selectedSourcePocketResolver;
        this.f107057t = disclaimersModelExtension;
        this.u = featureToggleInteractor;
        this.v = pocketDisclaimersProvider;
        this.f107058w = pocketSectionExplanationsProvider;
        this.f107059x = new c();
        this.f107060y = w.y0(new a2.a(this, 4, initialState, saveStateDelegate));
        this.z = hx7.e.a(this, new t(this, 27));
    }

    public static ActionsBottomSheetController I2(Clause clause, Clause clause2) {
        lw0.a aVar = new lw0.a(clause, clause2, null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        int i = 1;
        int i2 = 2;
        yji.l.a1(this, q.Q(this.f107059x.a(Unit.f186387a, i.f294643c), new cvi.i(continuation, this, i)), null, null, new cvl.h(this, continuation, i2), 3);
        int i3 = 21;
        int i5 = 0;
        yji.l.a1(this, f.e(u0.m(getState().B(new n2(i3)), getState().B(new n2(22))), new g(this, i)), null, null, new cvl.h(this, continuation, i5), 3);
        m mVar = this.f107054q;
        d dVar = mVar.f138501a.f;
        yji.l.a1(this, dVar.equals(odf.e.f224461a) ? new go.g(null, 2) : nim.a.v(u0.m(rd0.e.b(((ael.k) mVar.f138502b).f(dVar.f224460a)), mVar.f138503c.f2828l.w0()), new n(i3)), null, null, new cvl.h(this, continuation, 5), 3);
        int i6 = 14;
        int i21 = 3;
        yji.l.a1(this, rd0.e.e(mo3.a.f(u0.m(getState().B(new n2(23)), getState().B(new n2(24))), new r1(8), new l1(i6), new r1(9)), h0.f322473a, new c9k.k(3, 9, null)), null, null, new cvl.h(this, continuation, 4), 3);
        rdh.b bVar = rdh.b.ORDER_REVIEW_CRYPTO_RISK_WARNING;
        if (!((jte.d) this.u).c(TradingOrdersApi$Toggles.TradingSourcePocketPickerCryptoDisclaimersUk.f106798c)) {
            bVar = null;
        }
        yji.l.a1(this, ((gah.e) this.f107057t).Z2(zhm.v.l(bVar)), null, null, new cvl.h(this, continuation, 6), 3);
        cli.g state = getState();
        fvl.h hVar = this.v;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        yji.l.a1(this, nim.a.v(u0.k(zhm.v.k(nim.a.v(u0.m(state.B(new n(12)), new t0(state.B(new n(13)), 1)), new fvl.f(hVar, i)), nim.a.v(state.B(new n(i6)), new fvl.f(hVar, i2)))), new n(10)), null, null, new cvl.h(this, continuation, i), 3);
        cli.g state2 = getState();
        k kVar = this.f107058w;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(state2, "state");
        yji.l.a1(this, nim.a.v(state2.B(new n(18)), new fvl.i(kVar, i5)), null, null, new cvl.h(this, continuation, i21), 3);
        l2(new cvl.i(this, continuation, i5), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.z
    public final cli.g getState() {
        return (cli.g) this.f107060y.getValue();
    }
}
