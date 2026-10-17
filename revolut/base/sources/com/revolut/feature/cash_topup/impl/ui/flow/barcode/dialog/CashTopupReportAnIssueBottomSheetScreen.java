package com.revolut.feature.cash_topup.impl.ui.flow.barcode.dialog;

import a0l.k;
import ac3.c;
import ac3.d;
import ac3.e;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cash_topup.impl.R$string;
import com.revolut.feature.cash_topup.impl.ui.flow.barcode.dialog.CashTopupReportAnIssueBottomSheetScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import ljl.y;
import mb3.x;
import pki.b;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/dialog/CashTopupReportAnIssueBottomSheetScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lac3/c;", "Ldli/a;", "Lac3/e;", "<init>", "()V", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashTopupReportAnIssueBottomSheetScreen extends ViewController<c> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(CashTopupReportAnIssueBottomSheetScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_bottomsheet;
    public final h L = s.t(this, a.f);
    public final RowDelegate M = new RowDelegate(null, null, 7);
    public final Object N;
    public final Object O;
    public final Object P;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, n.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return n.a(p0);
        }
    }

    public CashTopupReportAnIssueBottomSheetScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ac3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashTopupReportAnIssueBottomSheetScreen f3021b;

            {
                this.f3021b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CashTopupReportAnIssueBottomSheetScreen cashTopupReportAnIssueBottomSheetScreen = this.f3021b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CashTopupReportAnIssueBottomSheetScreen.Q;
                        CashTopupReportAnIssueBottomSheetScreen cashTopupReportAnIssueBottomSheetScreen2 = this.f3021b;
                        d dVar = (d) cashTopupReportAnIssueBottomSheetScreen2.P.getValue();
                        List listC = u.c(cashTopupReportAnIssueBottomSheetScreen2.M);
                        ViewBinding value = cashTopupReportAnIssueBottomSheetScreen2.L.getValue(cashTopupReportAnIssueBottomSheetScreen2, CashTopupReportAnIssueBottomSheetScreen.Q[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(cashTopupReportAnIssueBottomSheetScreen2, dVar, listC, ((n) value).f174543c.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CashTopupReportAnIssueBottomSheetScreen.Q;
                        qji.b bVarU2 = cashTopupReportAnIssueBottomSheetScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.cash_topup.impl.ui.flow.barcode.dialog.di.CashTopupReportAnIssueBottomSheetScreenInjector");
                        }
                        x xVar = new x();
                        xVar.f204113a = e4m.b.b(new y(xVar, 1, 28));
                        xVar.f204114b = e4m.b.b(new y(xVar, 0, 28));
                        return xVar;
                    default:
                        KProperty[] kPropertyArr3 = CashTopupReportAnIssueBottomSheetScreen.Q;
                        return (d) ((x) cashTopupReportAnIssueBottomSheetScreen.O.getValue()).f204114b.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ac3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashTopupReportAnIssueBottomSheetScreen f3021b;

            {
                this.f3021b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CashTopupReportAnIssueBottomSheetScreen cashTopupReportAnIssueBottomSheetScreen = this.f3021b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CashTopupReportAnIssueBottomSheetScreen.Q;
                        CashTopupReportAnIssueBottomSheetScreen cashTopupReportAnIssueBottomSheetScreen2 = this.f3021b;
                        d dVar = (d) cashTopupReportAnIssueBottomSheetScreen2.P.getValue();
                        List listC = u.c(cashTopupReportAnIssueBottomSheetScreen2.M);
                        ViewBinding value = cashTopupReportAnIssueBottomSheetScreen2.L.getValue(cashTopupReportAnIssueBottomSheetScreen2, CashTopupReportAnIssueBottomSheetScreen.Q[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(cashTopupReportAnIssueBottomSheetScreen2, dVar, listC, ((n) value).f174543c.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CashTopupReportAnIssueBottomSheetScreen.Q;
                        qji.b bVarU2 = cashTopupReportAnIssueBottomSheetScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.cash_topup.impl.ui.flow.barcode.dialog.di.CashTopupReportAnIssueBottomSheetScreenInjector");
                        }
                        x xVar = new x();
                        xVar.f204113a = e4m.b.b(new y(xVar, 1, 28));
                        xVar.f204114b = e4m.b.b(new y(xVar, 0, 28));
                        return xVar;
                    default:
                        KProperty[] kPropertyArr3 = CashTopupReportAnIssueBottomSheetScreen.Q;
                        return (d) ((x) cashTopupReportAnIssueBottomSheetScreen.O.getValue()).f204114b.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: ac3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashTopupReportAnIssueBottomSheetScreen f3021b;

            {
                this.f3021b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CashTopupReportAnIssueBottomSheetScreen cashTopupReportAnIssueBottomSheetScreen = this.f3021b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CashTopupReportAnIssueBottomSheetScreen.Q;
                        CashTopupReportAnIssueBottomSheetScreen cashTopupReportAnIssueBottomSheetScreen2 = this.f3021b;
                        d dVar = (d) cashTopupReportAnIssueBottomSheetScreen2.P.getValue();
                        List listC = u.c(cashTopupReportAnIssueBottomSheetScreen2.M);
                        ViewBinding value = cashTopupReportAnIssueBottomSheetScreen2.L.getValue(cashTopupReportAnIssueBottomSheetScreen2, CashTopupReportAnIssueBottomSheetScreen.Q[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(cashTopupReportAnIssueBottomSheetScreen2, dVar, listC, ((n) value).f174543c.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CashTopupReportAnIssueBottomSheetScreen.Q;
                        qji.b bVarU2 = cashTopupReportAnIssueBottomSheetScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.cash_topup.impl.ui.flow.barcode.dialog.di.CashTopupReportAnIssueBottomSheetScreenInjector");
                        }
                        x xVar = new x();
                        xVar.f204113a = e4m.b.b(new y(xVar, 1, 28));
                        xVar.f204114b = e4m.b.b(new y(xVar, 0, 28));
                        return xVar;
                    default:
                        KProperty[] kPropertyArr3 = CashTopupReportAnIssueBottomSheetScreen.Q;
                        return (d) ((x) cashTopupReportAnIssueBottomSheetScreen.O.getValue()).f204114b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (x) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (d) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.topup_amount_cash_report_issue_dialog_title, null, null, 14), null, null, null, false, 30));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, new a15.d(rd0.e.b(this.M.f53218h), 18), null, new k(this, null, 25), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
