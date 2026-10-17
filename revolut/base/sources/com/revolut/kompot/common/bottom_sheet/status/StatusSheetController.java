package com.revolut.kompot.common.bottom_sheet.status;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import cli.o;
import cli.q;
import cli.v;
import cli.w;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusView;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.bottom_sheet.status.StatusSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import fii.b;
import fii.c;
import fii.g;
import fii.h;
import i60.b;
import ix0.s1;
import java.util.Set;
import jb3.l;
import jh.d;
import js0.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import n14.e;
import nii.b0;
import nii.c0;
import nii.h0;
import nii.j0;
import nii.m0;
import nii.t;
import no.m;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0001\b¨\u0006\t"}, d2 = {"Lcom/revolut/kompot/common/bottom_sheet/status/StatusSheetController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfii/b;", "Lno/m;", "Lhki/a;", "Lcli/w;", "Lfii/c;", "Companion", "a", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StatusSheetController extends ViewController<b> implements m, hki.a, w {

    @NotNull
    private static final a Companion = new a();
    public final g K;
    public final ifm.b L;
    public final Object M;
    public final Object N;
    public final dii.m O;
    public final AnalyticsProduct P;
    public final dii.m Q;
    public final v R;
    public final xki.a S;
    public final int T;
    public final Object U;
    public final Object V;
    public m0 W;
    public Parcelable X;
    public boolean Y;
    public boolean Z;

    public static final class a {
        private a() {
        }
    }

    public StatusSheetController(g inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new ifm.b();
        final int i = 0;
        this.M = te0.w.y0(new Function0(this) { // from class: fii.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StatusSheetController f135428b;

            {
                this.f135428b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        i60.b.Companion.getClass();
                        return b.a.a(this.f135428b);
                    default:
                        return y0.b((h60.d) this.f135428b.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = te0.w.y0(new Function0(this) { // from class: fii.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StatusSheetController f135428b;

            {
                this.f135428b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        i60.b.Companion.getClass();
                        return b.a.a(this.f135428b);
                    default:
                        return y0.b((h60.d) this.f135428b.M.getValue());
                }
            }
        });
        dii.m mVar = new dii.m(inputData, new h());
        this.O = mVar;
        this.P = d3().P();
        this.Q = mVar;
        this.R = e.a(this, mVar);
        this.S = xki.a.f306815a;
        this.T = R$layout.screen_status_sheet;
        this.U = new Object();
        this.V = new Object();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        s1 nonCancelableActivator;
        s1 hideKnobActivator;
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        m0 m0Var = uiState.f135426a;
        if (Intrinsics.f(this.W, m0Var)) {
            return;
        }
        m0 m0Var2 = this.W;
        boolean zC = nii.s1.c(m0Var2, m0Var);
        if (m0Var.f() && zC && ((m0Var2 instanceof c0) || (m0Var2 instanceof b0) || (m0Var2 instanceof t))) {
            e3().l();
        }
        ifm.b bVar = this.L;
        bVar.d();
        nii.s1.a(e3(), m0Var, m0Var2, bVar);
        if (!Intrinsics.f(this.X, e3().getF53948g())) {
            Context context = e3().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            d.f(context).n0().d(e3(), new TextLocalisedClause(R$string.status_sheet_accessibility_label, null, null, 14), "status.sheet", e3().getAnalyticsProduct(), e3().getF53948g());
            this.X = e3().getF53948g();
            this.Y = true;
        }
        if (zC) {
            boolean z = m0Var instanceof j0;
            ?? r06 = this.M;
            if (z && ((j0) m0Var).k == h0.CONFETTI) {
                ((h60.d) r06.getValue()).R(h60.a.f149577a);
                this.Z = true;
            }
            if (!this.Z) {
                ((h60.d) r06.getValue()).Q();
                this.Z = true;
            }
            nii.s1.d(e3(), m0Var);
        }
        this.W = m0Var;
        com.revolut.core.ui_kit.views.o oVarL = l.l(f.Companion, D2());
        if (oVarL == null) {
            r6.b.r("Modal View not found");
            Unit unit = Unit.f186387a;
        }
        if (oVarL != null && (hideKnobActivator = oVarL.getHideKnobActivator()) != null) {
            hideKnobActivator.d(this.U);
        }
        if (oVarL == null || (nonCancelableActivator = oVarL.getNonCancelableActivator()) == null) {
            return;
        }
        s.x(nonCancelableActivator, this.V, !d3().e());
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        return !d3().e();
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getN() {
        return this.P;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return this.S;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return this.Q;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        StatusView.INSTANCE.getClass();
        view.setBackgroundColor(kli.a.s(StatusView.L, context));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        this.L.d();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        s1 nonCancelableActivator;
        s1 hideKnobActivator;
        com.revolut.core.ui_kit.views.o oVarL = l.l(f.Companion, D2());
        if (oVarL != null && (hideKnobActivator = oVarL.getHideKnobActivator()) != null) {
            hideKnobActivator.e(this.U);
        }
        if (oVarL == null || (nonCancelableActivator = oVarL.getNonCancelableActivator()) == null) {
            return;
        }
        nonCancelableActivator.e(this.V);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(e3().f59729x.o), new fii.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(e3().f59730y.o), new fii.e(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(e3().f59716c), new fii.f(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(e3().f59715b), new fii.f(this, null, 1), 3);
    }

    public final m0 d3() {
        m0 m0Var = this.W;
        return m0Var == null ? hb9.b.l(this.K) : m0Var;
    }

    public final StatusView e3() {
        View viewFindViewById = D2().findViewById(R$id.statusSheet_statusView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        return (StatusView) viewFindViewById;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void g1(boolean z) {
        super.g1(z);
        if (z || !this.Y) {
            return;
        }
        Context context = e3().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        d.f(context).n0().h(e3());
        this.X = null;
        this.Y = false;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.T;
    }

    @Override // oki.f
    public final pki.a k() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final Set o2() {
        return (Set) this.N.getValue();
    }
}
