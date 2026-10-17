package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.ChartEmptyStateDelegate;
import com.revolut.core.ui_kit.delegates.ComparisonLineChartDelegate;
import com.revolut.core.ui_kit.delegates.ComparisonLineChartLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SegmentedGaugeChartDelegate;
import com.revolut.core.ui_kit.delegates.SegmentedGaugeChartLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import ipd.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import pd.b;
import ppd.j1;
import ppd.k1;
import te0.w;
import uw0.d;
import uw0.f;
import uw0.h;
import vc.s;
import zhm.d0;
import zrd.e;
import zrd.i;
import zrd.j;
import zrd.m;
import zrd.n;
import zrd.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/home/TotalWealthController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lzrd/g;", "Luw0/f;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TotalWealthController extends ViewController<q> implements dli.a, f {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f88019b0 = {o0.f186429a.j(new h0(TotalWealthController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final TotalWealthContract$InputData K;
    public final int L;
    public final Object M;
    public final d N;
    public final String O;
    public final h P;
    public final ao.h Q;
    public final g R;
    public final Object S;
    public final Object T;
    public final RowDelegate U;
    public final FullScreenStateDelegate V;
    public final SegmentedGaugeChartDelegate W;
    public final FixedTabsDelegate X;
    public final ComparisonLineChartDelegate Y;
    public final TextDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f88020a0;

    public TotalWealthController(TotalWealthContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: zrd.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TotalWealthController f324694b;

            {
                this.f324694b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                gte.a aVarB;
                int i2 = i;
                TotalWealthController totalWealthController = this.f324694b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TotalWealthController.f88019b0;
                        k1 k1Var = (k1) totalWealthController.S.getValue();
                        switch (k1Var.f238460a) {
                            case 0:
                                return (b) k1Var.i.get();
                            default:
                                return (b) k1Var.i.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = TotalWealthController.f88019b0;
                        k1 k1Var2 = (k1) totalWealthController.S.getValue();
                        switch (k1Var2.f238460a) {
                            case 0:
                                aVarB = k1Var2.f238462c.f238482a.b();
                                vc.s.j(aVarB);
                                break;
                            default:
                                aVarB = k1Var2.f238462c.f238482a.b();
                                vc.s.j(aVarB);
                                break;
                        }
                        return Boolean.valueOf(((jte.d) aVarB).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c));
                    case 2:
                        KProperty[] kPropertyArr3 = TotalWealthController.f88019b0;
                        qji.b bVarU2 = totalWealthController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.di.TotalWealthInjector");
                        j1 j1Var = (j1) ((asd.a) bVarU2).c().mo3808a(totalWealthController);
                        TotalWealthContract$InputData totalWealthContract$InputData = totalWealthController.K;
                        switch (j1Var.f238445a) {
                            case 0:
                                totalWealthContract$InputData.getClass();
                                j1Var.d = totalWealthContract$InputData;
                                break;
                            default:
                                totalWealthContract$InputData.getClass();
                                j1Var.d = totalWealthContract$InputData;
                                break;
                        }
                        return (k1) j1Var.mo3783build();
                    case 3:
                        KProperty[] kPropertyArr4 = TotalWealthController.f88019b0;
                        k1 k1Var3 = (k1) totalWealthController.S.getValue();
                        switch (k1Var3.f238460a) {
                            case 0:
                                return (fd6.a) k1Var3.e.get();
                            default:
                                return (fd6.a) k1Var3.e.get();
                        }
                    default:
                        KProperty[] kPropertyArr5 = TotalWealthController.f88019b0;
                        TotalWealthController totalWealthController2 = this.f324694b;
                        return dli.f.a(totalWealthController2, totalWealthController2.R2(), d0.E0(((fd6.a) totalWealthController2.T.getValue()).e, zhm.v.k(totalWealthController2.W, totalWealthController2.U, totalWealthController2.V, new ListSubheaderDelegate(), new RowLoadingDelegate(), new SegmentedGaugeChartLoadingDelegate(), totalWealthController2.Y, totalWealthController2.X, new ComparisonLineChartLoadingDelegate(), new ChartEmptyStateDelegate(), totalWealthController2.Z)), 0, null, null, null, 60);
                }
            }
        });
        this.N = d.f283501a;
        this.O = a0.d.r(inputData.f88016a.name(), getU());
        this.P = h.APPLICATION;
        this.Q = s.t(this, j.f);
        final int i2 = 1;
        this.R = new g(new Function0(this) { // from class: zrd.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TotalWealthController f324694b;

            {
                this.f324694b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                gte.a aVarB;
                int i22 = i2;
                TotalWealthController totalWealthController = this.f324694b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TotalWealthController.f88019b0;
                        k1 k1Var = (k1) totalWealthController.S.getValue();
                        switch (k1Var.f238460a) {
                            case 0:
                                return (b) k1Var.i.get();
                            default:
                                return (b) k1Var.i.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = TotalWealthController.f88019b0;
                        k1 k1Var2 = (k1) totalWealthController.S.getValue();
                        switch (k1Var2.f238460a) {
                            case 0:
                                aVarB = k1Var2.f238462c.f238482a.b();
                                vc.s.j(aVarB);
                                break;
                            default:
                                aVarB = k1Var2.f238462c.f238482a.b();
                                vc.s.j(aVarB);
                                break;
                        }
                        return Boolean.valueOf(((jte.d) aVarB).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c));
                    case 2:
                        KProperty[] kPropertyArr3 = TotalWealthController.f88019b0;
                        qji.b bVarU2 = totalWealthController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.di.TotalWealthInjector");
                        j1 j1Var = (j1) ((asd.a) bVarU2).c().mo3808a(totalWealthController);
                        TotalWealthContract$InputData totalWealthContract$InputData = totalWealthController.K;
                        switch (j1Var.f238445a) {
                            case 0:
                                totalWealthContract$InputData.getClass();
                                j1Var.d = totalWealthContract$InputData;
                                break;
                            default:
                                totalWealthContract$InputData.getClass();
                                j1Var.d = totalWealthContract$InputData;
                                break;
                        }
                        return (k1) j1Var.mo3783build();
                    case 3:
                        KProperty[] kPropertyArr4 = TotalWealthController.f88019b0;
                        k1 k1Var3 = (k1) totalWealthController.S.getValue();
                        switch (k1Var3.f238460a) {
                            case 0:
                                return (fd6.a) k1Var3.e.get();
                            default:
                                return (fd6.a) k1Var3.e.get();
                        }
                    default:
                        KProperty[] kPropertyArr5 = TotalWealthController.f88019b0;
                        TotalWealthController totalWealthController2 = this.f324694b;
                        return dli.f.a(totalWealthController2, totalWealthController2.R2(), d0.E0(((fd6.a) totalWealthController2.T.getValue()).e, zhm.v.k(totalWealthController2.W, totalWealthController2.U, totalWealthController2.V, new ListSubheaderDelegate(), new RowLoadingDelegate(), new SegmentedGaugeChartLoadingDelegate(), totalWealthController2.Y, totalWealthController2.X, new ComparisonLineChartLoadingDelegate(), new ChartEmptyStateDelegate(), totalWealthController2.Z)), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: zrd.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TotalWealthController f324694b;

            {
                this.f324694b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                gte.a aVarB;
                int i22 = i3;
                TotalWealthController totalWealthController = this.f324694b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TotalWealthController.f88019b0;
                        k1 k1Var = (k1) totalWealthController.S.getValue();
                        switch (k1Var.f238460a) {
                            case 0:
                                return (b) k1Var.i.get();
                            default:
                                return (b) k1Var.i.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = TotalWealthController.f88019b0;
                        k1 k1Var2 = (k1) totalWealthController.S.getValue();
                        switch (k1Var2.f238460a) {
                            case 0:
                                aVarB = k1Var2.f238462c.f238482a.b();
                                vc.s.j(aVarB);
                                break;
                            default:
                                aVarB = k1Var2.f238462c.f238482a.b();
                                vc.s.j(aVarB);
                                break;
                        }
                        return Boolean.valueOf(((jte.d) aVarB).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c));
                    case 2:
                        KProperty[] kPropertyArr3 = TotalWealthController.f88019b0;
                        qji.b bVarU2 = totalWealthController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.di.TotalWealthInjector");
                        j1 j1Var = (j1) ((asd.a) bVarU2).c().mo3808a(totalWealthController);
                        TotalWealthContract$InputData totalWealthContract$InputData = totalWealthController.K;
                        switch (j1Var.f238445a) {
                            case 0:
                                totalWealthContract$InputData.getClass();
                                j1Var.d = totalWealthContract$InputData;
                                break;
                            default:
                                totalWealthContract$InputData.getClass();
                                j1Var.d = totalWealthContract$InputData;
                                break;
                        }
                        return (k1) j1Var.mo3783build();
                    case 3:
                        KProperty[] kPropertyArr4 = TotalWealthController.f88019b0;
                        k1 k1Var3 = (k1) totalWealthController.S.getValue();
                        switch (k1Var3.f238460a) {
                            case 0:
                                return (fd6.a) k1Var3.e.get();
                            default:
                                return (fd6.a) k1Var3.e.get();
                        }
                    default:
                        KProperty[] kPropertyArr5 = TotalWealthController.f88019b0;
                        TotalWealthController totalWealthController2 = this.f324694b;
                        return dli.f.a(totalWealthController2, totalWealthController2.R2(), d0.E0(((fd6.a) totalWealthController2.T.getValue()).e, zhm.v.k(totalWealthController2.W, totalWealthController2.U, totalWealthController2.V, new ListSubheaderDelegate(), new RowLoadingDelegate(), new SegmentedGaugeChartLoadingDelegate(), totalWealthController2.Y, totalWealthController2.X, new ComparisonLineChartLoadingDelegate(), new ChartEmptyStateDelegate(), totalWealthController2.Z)), 0, null, null, null, 60);
                }
            }
        });
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: zrd.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TotalWealthController f324694b;

            {
                this.f324694b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                gte.a aVarB;
                int i22 = i5;
                TotalWealthController totalWealthController = this.f324694b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TotalWealthController.f88019b0;
                        k1 k1Var = (k1) totalWealthController.S.getValue();
                        switch (k1Var.f238460a) {
                            case 0:
                                return (b) k1Var.i.get();
                            default:
                                return (b) k1Var.i.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = TotalWealthController.f88019b0;
                        k1 k1Var2 = (k1) totalWealthController.S.getValue();
                        switch (k1Var2.f238460a) {
                            case 0:
                                aVarB = k1Var2.f238462c.f238482a.b();
                                vc.s.j(aVarB);
                                break;
                            default:
                                aVarB = k1Var2.f238462c.f238482a.b();
                                vc.s.j(aVarB);
                                break;
                        }
                        return Boolean.valueOf(((jte.d) aVarB).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c));
                    case 2:
                        KProperty[] kPropertyArr3 = TotalWealthController.f88019b0;
                        qji.b bVarU2 = totalWealthController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.di.TotalWealthInjector");
                        j1 j1Var = (j1) ((asd.a) bVarU2).c().mo3808a(totalWealthController);
                        TotalWealthContract$InputData totalWealthContract$InputData = totalWealthController.K;
                        switch (j1Var.f238445a) {
                            case 0:
                                totalWealthContract$InputData.getClass();
                                j1Var.d = totalWealthContract$InputData;
                                break;
                            default:
                                totalWealthContract$InputData.getClass();
                                j1Var.d = totalWealthContract$InputData;
                                break;
                        }
                        return (k1) j1Var.mo3783build();
                    case 3:
                        KProperty[] kPropertyArr4 = TotalWealthController.f88019b0;
                        k1 k1Var3 = (k1) totalWealthController.S.getValue();
                        switch (k1Var3.f238460a) {
                            case 0:
                                return (fd6.a) k1Var3.e.get();
                            default:
                                return (fd6.a) k1Var3.e.get();
                        }
                    default:
                        KProperty[] kPropertyArr5 = TotalWealthController.f88019b0;
                        TotalWealthController totalWealthController2 = this.f324694b;
                        return dli.f.a(totalWealthController2, totalWealthController2.R2(), d0.E0(((fd6.a) totalWealthController2.T.getValue()).e, zhm.v.k(totalWealthController2.W, totalWealthController2.U, totalWealthController2.V, new ListSubheaderDelegate(), new RowLoadingDelegate(), new SegmentedGaugeChartLoadingDelegate(), totalWealthController2.Y, totalWealthController2.X, new ComparisonLineChartLoadingDelegate(), new ChartEmptyStateDelegate(), totalWealthController2.Z)), 0, null, null, null, 60);
                }
            }
        });
        this.U = new RowDelegate(null, null, 7);
        this.V = new FullScreenStateDelegate();
        this.W = new SegmentedGaugeChartDelegate();
        this.X = new FixedTabsDelegate();
        this.Y = new ComparisonLineChartDelegate();
        this.Z = new TextDelegate();
        final int i6 = 4;
        this.f88020a0 = w.y0(new Function0(this) { // from class: zrd.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TotalWealthController f324694b;

            {
                this.f324694b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                gte.a aVarB;
                int i22 = i6;
                TotalWealthController totalWealthController = this.f324694b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TotalWealthController.f88019b0;
                        k1 k1Var = (k1) totalWealthController.S.getValue();
                        switch (k1Var.f238460a) {
                            case 0:
                                return (b) k1Var.i.get();
                            default:
                                return (b) k1Var.i.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = TotalWealthController.f88019b0;
                        k1 k1Var2 = (k1) totalWealthController.S.getValue();
                        switch (k1Var2.f238460a) {
                            case 0:
                                aVarB = k1Var2.f238462c.f238482a.b();
                                vc.s.j(aVarB);
                                break;
                            default:
                                aVarB = k1Var2.f238462c.f238482a.b();
                                vc.s.j(aVarB);
                                break;
                        }
                        return Boolean.valueOf(((jte.d) aVarB).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c));
                    case 2:
                        KProperty[] kPropertyArr3 = TotalWealthController.f88019b0;
                        qji.b bVarU2 = totalWealthController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.di.TotalWealthInjector");
                        j1 j1Var = (j1) ((asd.a) bVarU2).c().mo3808a(totalWealthController);
                        TotalWealthContract$InputData totalWealthContract$InputData = totalWealthController.K;
                        switch (j1Var.f238445a) {
                            case 0:
                                totalWealthContract$InputData.getClass();
                                j1Var.d = totalWealthContract$InputData;
                                break;
                            default:
                                totalWealthContract$InputData.getClass();
                                j1Var.d = totalWealthContract$InputData;
                                break;
                        }
                        return (k1) j1Var.mo3783build();
                    case 3:
                        KProperty[] kPropertyArr4 = TotalWealthController.f88019b0;
                        k1 k1Var3 = (k1) totalWealthController.S.getValue();
                        switch (k1Var3.f238460a) {
                            case 0:
                                return (fd6.a) k1Var3.e.get();
                            default:
                                return (fd6.a) k1Var3.e.get();
                        }
                    default:
                        KProperty[] kPropertyArr5 = TotalWealthController.f88019b0;
                        TotalWealthController totalWealthController2 = this.f324694b;
                        return dli.f.a(totalWealthController2, totalWealthController2.R2(), d0.E0(((fd6.a) totalWealthController2.T.getValue()).e, zhm.v.k(totalWealthController2.W, totalWealthController2.U, totalWealthController2.V, new ListSubheaderDelegate(), new RowLoadingDelegate(), new SegmentedGaugeChartLoadingDelegate(), totalWealthController2.Y, totalWealthController2.X, new ComparisonLineChartLoadingDelegate(), new ChartEmptyStateDelegate(), totalWealthController2.Z)), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return this.R.c();
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        zrd.g uiState = (zrd.g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        this.R.d(D2(), uiState.f324692c);
        zrd.f fVar = uiState.f324691b;
        if (fVar instanceof zrd.d) {
            NavBarWithToolbar navBarWithToolbar = d3().f174539b;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.H0(false);
            navBarWithToolbar.l0();
            navBarWithToolbar.setTitleTopDescriptionVisible(true);
            navBarWithToolbar.setSecondDescriptionVisible(true);
            zrd.d dVar = (zrd.d) fVar;
            MoneyClause moneyClause = dVar.f324687c;
            Clause clause = dVar.d;
            NavBarWithToolbar.setToolbar$default(navBarWithToolbar, clause, moneyClause, null, 4, null);
            navBarWithToolbar.setTitleTopDescription(clause);
            navBarWithToolbar.setTitle(moneyClause, null);
            navBarWithToolbar.setSecondDescriptionText(dVar.e);
            navBarWithToolbar.setSegmentedControl(dVar.f324685a, dVar.f324686b);
            return;
        }
        if (!(fVar instanceof e)) {
            if (fVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            NavBarWithToolbar navBarWithToolbar2 = d3().f174539b;
            NavBarWithToolbar.Companion companion2 = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar2.j0(false);
            navBarWithToolbar2.l0();
            return;
        }
        NavBarWithToolbar navBarWithToolbar3 = d3().f174539b;
        NavBarWithToolbar.Companion companion3 = NavBarWithToolbar.INSTANCE;
        navBarWithToolbar3.j0(false);
        navBarWithToolbar3.l0();
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        NavBarWithToolbar.setToolbar$default(navBarWithToolbar3, textClause, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 4, null);
        navBarWithToolbar3.setTitleTopDescription(null);
        navBarWithToolbar3.setTitle(null, null);
        navBarWithToolbar3.setSecondDescriptionText(null);
        e eVar = (e) fVar;
        navBarWithToolbar3.setSegmentedControl(eVar.f324688a, eVar.f324689b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (k1) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.R.a(view);
        int i = i.f324695a[this.K.f88016a.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.analytics_total_wealth_assets_screen, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.analytics_total_wealth_liabilities_screen, null, null, 14);
        }
        b.p(view, textLocalisedClause);
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        this.R.b();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new z3f.b(this, null, 25), 3);
        RowDelegate rowDelegate = this.U;
        com.revolut.kompot.navigable.a.g2(this, new z75.f(rd0.e.b(rowDelegate.f53220l), 21), null, new n(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new zrd.o(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.W.f53302c.f121375b), null, new m(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, new z75.f(rd0.e.b(this.V.f52371h.f121375b), 20), null, new p(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FixedTabs) d3().f174539b.G0.getValue()).f), null, new m(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.X.f52339c.f121375b), null, new m(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.q(rd0.e.b(this.Y.f52114c.f121375b)), null, new m(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Z.d), null, new m(this, continuation, 1), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.Q.getValue(this, f88019b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final zrd.b R2() {
        return (zrd.b) this.M.getValue();
    }

    @Override // uw0.f
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getO() {
        return this.O;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    @Override // uw0.f
    public final uw0.e getType() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.f88020a0.getValue();
    }

    @Override // uw0.f
    /* JADX INFO: renamed from: m, reason: from getter */
    public final h getP() {
        return this.P;
    }
}
