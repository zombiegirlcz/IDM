package com.revolut.feature.salary_switch.impl.ui.brazil.screen.status;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import br4.e;
import brc.g;
import brc.j;
import brc.k;
import brc.m;
import brc.r;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalLoadingV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.salary_switch.impl.R$string;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.SalaryStatusScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ihm.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import vc.s;
import zpc.i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/brazil/screen/status/SalaryStatusScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbrc/m;", "Ltki/c;", "Lbrc/r;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SalaryStatusScreen extends ViewController<m> implements c {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(SalaryStatusScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public SalaryStatusScreen(SalaryStatusScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: brc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalaryStatusScreen f17985b;

            {
                this.f17985b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = SalaryStatusScreen.S;
                        SalaryStatusScreen salaryStatusScreen = this.f17985b;
                        return tki.g.a(salaryStatusScreen, salaryStatusScreen.d(), zhm.v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), new ProgressStepVerticalLoadingV2Delegate(), (LabelButtonDelegate) salaryStatusScreen.P.getValue(), (PlainTextWarningDelegate) salaryStatusScreen.Q.getValue(), (ProgressStepVerticalV2Delegate) salaryStatusScreen.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = SalaryStatusScreen.S;
                        return (q) ((zpc.i) this.f17985b.M.getValue()).f324249b.get();
                }
            }
        });
        this.M = w.y0(new bc1.a(this, inputData, 24));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: brc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalaryStatusScreen f17985b;

            {
                this.f17985b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SalaryStatusScreen.S;
                        SalaryStatusScreen salaryStatusScreen = this.f17985b;
                        return tki.g.a(salaryStatusScreen, salaryStatusScreen.d(), zhm.v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new FullScreenStateDelegate(), new ProgressStepVerticalLoadingV2Delegate(), (LabelButtonDelegate) salaryStatusScreen.P.getValue(), (PlainTextWarningDelegate) salaryStatusScreen.Q.getValue(), (ProgressStepVerticalV2Delegate) salaryStatusScreen.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = SalaryStatusScreen.S;
                        return (q) ((zpc.i) this.f17985b.M.getValue()).f324249b.get();
                }
            }
        });
        this.O = s.t(this, g.f);
        this.P = w.y0(new e(6));
        this.Q = w.y0(new e(7));
        this.R = w.y0(new e(8));
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((r) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.salary_switch_br_status_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), new brc.h(this, continuation, 0), 3);
        ?? r62 = this.Q;
        ViewController.P2(this, rd0.e.b(((PlainTextWarningDelegate) r62.getValue()).d.f121375b), new brc.i(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b((f) ((PlainTextWarningDelegate) r62.getValue()).f.getValue()), new brc.i(this, continuation, 1), 3);
        ?? r64 = this.R;
        ViewController.P2(this, rd0.e.b(((ProgressStepVerticalV2Delegate) r64.getValue()).e), new brc.i(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(((ProgressStepVerticalV2Delegate) r64.getValue()).f53007h.f121375b), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(((LabelButtonDelegate) this.P.getValue()).d.f121375b), new k(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final brc.q d() {
        return (brc.q) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.L.getValue();
    }
}
