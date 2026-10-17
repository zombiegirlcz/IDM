package com.revolut.feature.robo.impl.ui.screen.projection;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ForecastDelegate;
import com.revolut.core.ui_kit.delegates.ForecastLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.HorizontalBarGroupDelegate;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.robo.impl.ui.screen.projection.ProjectionScreen;
import com.revolut.feature.robo.impl.ui.screen.projection.ProjectionScreenContract$Input;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.common.ui.R$string;
import dmc.r;
import dmc.w;
import fmc.z;
import gig.t;
import grl.k9;
import jlc.u;
import jnc.b;
import jnc.d;
import jnc.f;
import jnc.i;
import jnc.k;
import jnc.l;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import org.jetbrains.annotations.NotNull;
import tki.c;
import vc.s;
import xki.e;
import yhm.j;
import z0h.s1;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006:\u0001\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/screen/projection/ProjectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljnc/f;", "Ltki/c;", "Ljnc/m;", "Lno/m;", "Lz0h/s1;", "Companion", "a", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProjectionScreen extends ViewController<f> implements c, m, s1 {
    public final ProjectionScreenContract$Input K;
    public final k9 L;
    public final h M;
    public final boolean N;
    public final Lazy O;
    public final int P;
    public final Lazy Q;
    public final InputSliderDelegate R;
    public final ForecastDelegate S;
    public final ForecastLoadingDelegate T;
    public final TextDelegate U;
    public final LargeActionButtonDelegate V;
    public final TrendViewDelegate W;
    public final ListSubheaderDelegate X;
    public final RowLoadingDelegate Y;
    public final HorizontalBarGroupDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f85178a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f85179b0;
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(ProjectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public ProjectionScreen(ProjectionScreenContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        k9 value = k9.RoboAdvisor;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        this.L = value;
        this.M = s.t(this, b.f);
        final int i = 1;
        this.N = true;
        final int i2 = 0;
        this.O = j.b(new Function0(this) { // from class: jnc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProjectionScreen f176683b;

            {
                this.f176683b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                ProjectionScreen projectionScreen = this.f176683b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = ProjectionScreen.c0;
                        qji.b bVarU2 = projectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.robo.impl.ui.screen.projection.di.ProjectionScreenComponentInjector");
                        return ((knc.b) bVarU2).j().d(projectionScreen, projectionScreen.K, projectionScreen, new jlc.e(projectionScreen.S, projectionScreen.T, projectionScreen.W, projectionScreen.U, projectionScreen.R, projectionScreen.V, null, null));
                    case 1:
                        KProperty[] kPropertyArr2 = ProjectionScreen.c0;
                        w wVar = (w) projectionScreen.O.getValue();
                        switch (wVar.f116087a) {
                            case 0:
                                ProjectionScreenContract$Input projectionScreenContract$Input = wVar.d;
                                e eVar = (e) wVar.f116095n.get();
                                ProjectionScreenContract$Input projectionScreenContract$Input2 = wVar.d;
                                r rVar = wVar.e;
                                dmc.a aVar = rVar.e;
                                t tVar = new t(projectionScreenContract$Input2, new n(projectionScreenContract$Input2, aVar.d()), (jlc.o) wVar.o.get(), new o(new yoc.a(new yoc.b())), (jlc.s) wVar.f116096p.get(), new z(projectionScreenContract$Input2));
                                zjh.f fVarA = aVar.a();
                                emc.e eVarC = aVar.c();
                                qmc.h hVarA = rVar.f116029c.a();
                                jlc.d dVar = (jlc.d) wVar.f116097q.get();
                                moc.a aVar2 = (moc.a) wVar.f116098r.get();
                                u uVar = (u) wVar.f116099s.get();
                                gte.a aVarB = rVar.d.b();
                                s.j(aVarB);
                                return new com.revolut.feature.robo.impl.ui.screen.projection.a(projectionScreenContract$Input, eVar, tVar, fVarA, eVarC, hVarA, dVar, aVar2, uVar, aVarB);
                            default:
                                ProjectionScreenContract$Input projectionScreenContract$Input3 = wVar.d;
                                e eVar2 = (e) wVar.f116095n.get();
                                ProjectionScreenContract$Input projectionScreenContract$Input4 = wVar.d;
                                r rVar2 = wVar.e;
                                dmc.a aVar3 = rVar2.e;
                                t tVar2 = new t(projectionScreenContract$Input4, new n(projectionScreenContract$Input4, aVar3.d()), (jlc.o) wVar.o.get(), new o(new yoc.a(new yoc.b())), (jlc.s) wVar.f116096p.get(), new z(projectionScreenContract$Input4));
                                zjh.f fVarA2 = aVar3.a();
                                emc.e eVarC2 = aVar3.c();
                                qmc.h hVarA2 = rVar2.f116029c.a();
                                jlc.d dVar2 = (jlc.d) wVar.f116097q.get();
                                moc.a aVar4 = (moc.a) wVar.f116098r.get();
                                u uVar2 = (u) wVar.f116099s.get();
                                gte.a aVarB2 = rVar2.d.b();
                                s.j(aVarB2);
                                return new com.revolut.feature.robo.impl.ui.screen.projection.a(projectionScreenContract$Input3, eVar2, tVar2, fVarA2, eVarC2, hVarA2, dVar2, aVar4, uVar2, aVarB2);
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = ProjectionScreen.c0;
                        ProjectionScreen projectionScreen2 = this.f176683b;
                        return tki.g.a(projectionScreen2, projectionScreen2.d(), v.k(projectionScreen2.R, new FullScreenStateDelegate(), projectionScreen2.U, projectionScreen2.S, projectionScreen2.T, new HeaderLoadingDelegate(), projectionScreen2.W, projectionScreen2.X, projectionScreen2.Y, projectionScreen2.Z), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr4 = ProjectionScreen.c0;
                        w wVar2 = (w) projectionScreen.O.getValue();
                        switch (wVar2.f116087a) {
                            case 0:
                                return (j60.a) wVar2.f116091h.get();
                            default:
                                return (j60.a) wVar2.f116091h.get();
                        }
                }
            }
        });
        this.P = R$layout.screen_recycler_navbar_nextbutton;
        this.Q = j.b(new Function0(this) { // from class: jnc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProjectionScreen f176683b;

            {
                this.f176683b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                ProjectionScreen projectionScreen = this.f176683b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = ProjectionScreen.c0;
                        qji.b bVarU2 = projectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.robo.impl.ui.screen.projection.di.ProjectionScreenComponentInjector");
                        return ((knc.b) bVarU2).j().d(projectionScreen, projectionScreen.K, projectionScreen, new jlc.e(projectionScreen.S, projectionScreen.T, projectionScreen.W, projectionScreen.U, projectionScreen.R, projectionScreen.V, null, null));
                    case 1:
                        KProperty[] kPropertyArr2 = ProjectionScreen.c0;
                        w wVar = (w) projectionScreen.O.getValue();
                        switch (wVar.f116087a) {
                            case 0:
                                ProjectionScreenContract$Input projectionScreenContract$Input = wVar.d;
                                e eVar = (e) wVar.f116095n.get();
                                ProjectionScreenContract$Input projectionScreenContract$Input2 = wVar.d;
                                r rVar = wVar.e;
                                dmc.a aVar = rVar.e;
                                t tVar = new t(projectionScreenContract$Input2, new n(projectionScreenContract$Input2, aVar.d()), (jlc.o) wVar.o.get(), new o(new yoc.a(new yoc.b())), (jlc.s) wVar.f116096p.get(), new z(projectionScreenContract$Input2));
                                zjh.f fVarA = aVar.a();
                                emc.e eVarC = aVar.c();
                                qmc.h hVarA = rVar.f116029c.a();
                                jlc.d dVar = (jlc.d) wVar.f116097q.get();
                                moc.a aVar2 = (moc.a) wVar.f116098r.get();
                                u uVar = (u) wVar.f116099s.get();
                                gte.a aVarB = rVar.d.b();
                                s.j(aVarB);
                                return new com.revolut.feature.robo.impl.ui.screen.projection.a(projectionScreenContract$Input, eVar, tVar, fVarA, eVarC, hVarA, dVar, aVar2, uVar, aVarB);
                            default:
                                ProjectionScreenContract$Input projectionScreenContract$Input3 = wVar.d;
                                e eVar2 = (e) wVar.f116095n.get();
                                ProjectionScreenContract$Input projectionScreenContract$Input4 = wVar.d;
                                r rVar2 = wVar.e;
                                dmc.a aVar3 = rVar2.e;
                                t tVar2 = new t(projectionScreenContract$Input4, new n(projectionScreenContract$Input4, aVar3.d()), (jlc.o) wVar.o.get(), new o(new yoc.a(new yoc.b())), (jlc.s) wVar.f116096p.get(), new z(projectionScreenContract$Input4));
                                zjh.f fVarA2 = aVar3.a();
                                emc.e eVarC2 = aVar3.c();
                                qmc.h hVarA2 = rVar2.f116029c.a();
                                jlc.d dVar2 = (jlc.d) wVar.f116097q.get();
                                moc.a aVar4 = (moc.a) wVar.f116098r.get();
                                u uVar2 = (u) wVar.f116099s.get();
                                gte.a aVarB2 = rVar2.d.b();
                                s.j(aVarB2);
                                return new com.revolut.feature.robo.impl.ui.screen.projection.a(projectionScreenContract$Input3, eVar2, tVar2, fVarA2, eVarC2, hVarA2, dVar2, aVar4, uVar2, aVarB2);
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = ProjectionScreen.c0;
                        ProjectionScreen projectionScreen2 = this.f176683b;
                        return tki.g.a(projectionScreen2, projectionScreen2.d(), v.k(projectionScreen2.R, new FullScreenStateDelegate(), projectionScreen2.U, projectionScreen2.S, projectionScreen2.T, new HeaderLoadingDelegate(), projectionScreen2.W, projectionScreen2.X, projectionScreen2.Y, projectionScreen2.Z), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr4 = ProjectionScreen.c0;
                        w wVar2 = (w) projectionScreen.O.getValue();
                        switch (wVar2.f116087a) {
                            case 0:
                                return (j60.a) wVar2.f116091h.get();
                            default:
                                return (j60.a) wVar2.f116091h.get();
                        }
                }
            }
        });
        this.R = new InputSliderDelegate();
        this.S = new ForecastDelegate();
        this.T = new ForecastLoadingDelegate();
        this.U = new TextDelegate();
        this.V = new LargeActionButtonDelegate();
        this.W = new TrendViewDelegate(1000L);
        this.X = new ListSubheaderDelegate();
        this.Y = new RowLoadingDelegate();
        this.Z = new HorizontalBarGroupDelegate();
        final int i3 = 2;
        this.f85178a0 = te0.w.y0(new Function0(this) { // from class: jnc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProjectionScreen f176683b;

            {
                this.f176683b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                ProjectionScreen projectionScreen = this.f176683b;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = ProjectionScreen.c0;
                        qji.b bVarU2 = projectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.robo.impl.ui.screen.projection.di.ProjectionScreenComponentInjector");
                        return ((knc.b) bVarU2).j().d(projectionScreen, projectionScreen.K, projectionScreen, new jlc.e(projectionScreen.S, projectionScreen.T, projectionScreen.W, projectionScreen.U, projectionScreen.R, projectionScreen.V, null, null));
                    case 1:
                        KProperty[] kPropertyArr2 = ProjectionScreen.c0;
                        w wVar = (w) projectionScreen.O.getValue();
                        switch (wVar.f116087a) {
                            case 0:
                                ProjectionScreenContract$Input projectionScreenContract$Input = wVar.d;
                                e eVar = (e) wVar.f116095n.get();
                                ProjectionScreenContract$Input projectionScreenContract$Input2 = wVar.d;
                                r rVar = wVar.e;
                                dmc.a aVar = rVar.e;
                                t tVar = new t(projectionScreenContract$Input2, new n(projectionScreenContract$Input2, aVar.d()), (jlc.o) wVar.o.get(), new o(new yoc.a(new yoc.b())), (jlc.s) wVar.f116096p.get(), new z(projectionScreenContract$Input2));
                                zjh.f fVarA = aVar.a();
                                emc.e eVarC = aVar.c();
                                qmc.h hVarA = rVar.f116029c.a();
                                jlc.d dVar = (jlc.d) wVar.f116097q.get();
                                moc.a aVar2 = (moc.a) wVar.f116098r.get();
                                u uVar = (u) wVar.f116099s.get();
                                gte.a aVarB = rVar.d.b();
                                s.j(aVarB);
                                return new com.revolut.feature.robo.impl.ui.screen.projection.a(projectionScreenContract$Input, eVar, tVar, fVarA, eVarC, hVarA, dVar, aVar2, uVar, aVarB);
                            default:
                                ProjectionScreenContract$Input projectionScreenContract$Input3 = wVar.d;
                                e eVar2 = (e) wVar.f116095n.get();
                                ProjectionScreenContract$Input projectionScreenContract$Input4 = wVar.d;
                                r rVar2 = wVar.e;
                                dmc.a aVar3 = rVar2.e;
                                t tVar2 = new t(projectionScreenContract$Input4, new n(projectionScreenContract$Input4, aVar3.d()), (jlc.o) wVar.o.get(), new o(new yoc.a(new yoc.b())), (jlc.s) wVar.f116096p.get(), new z(projectionScreenContract$Input4));
                                zjh.f fVarA2 = aVar3.a();
                                emc.e eVarC2 = aVar3.c();
                                qmc.h hVarA2 = rVar2.f116029c.a();
                                jlc.d dVar2 = (jlc.d) wVar.f116097q.get();
                                moc.a aVar4 = (moc.a) wVar.f116098r.get();
                                u uVar2 = (u) wVar.f116099s.get();
                                gte.a aVarB2 = rVar2.d.b();
                                s.j(aVarB2);
                                return new com.revolut.feature.robo.impl.ui.screen.projection.a(projectionScreenContract$Input3, eVar2, tVar2, fVarA2, eVarC2, hVarA2, dVar2, aVar4, uVar2, aVarB2);
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = ProjectionScreen.c0;
                        ProjectionScreen projectionScreen2 = this.f176683b;
                        return tki.g.a(projectionScreen2, projectionScreen2.d(), v.k(projectionScreen2.R, new FullScreenStateDelegate(), projectionScreen2.U, projectionScreen2.S, projectionScreen2.T, new HeaderLoadingDelegate(), projectionScreen2.W, projectionScreen2.X, projectionScreen2.Y, projectionScreen2.Z), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr4 = ProjectionScreen.c0;
                        w wVar2 = (w) projectionScreen.O.getValue();
                        switch (wVar2.f116087a) {
                            case 0:
                                return (j60.a) wVar2.f116091h.get();
                            default:
                                return (j60.a) wVar2.f116091h.get();
                        }
                }
            }
        });
        final int i5 = 3;
        this.f85179b0 = te0.w.y0(new Function0(this) { // from class: jnc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProjectionScreen f176683b;

            {
                this.f176683b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i5;
                ProjectionScreen projectionScreen = this.f176683b;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = ProjectionScreen.c0;
                        qji.b bVarU2 = projectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.robo.impl.ui.screen.projection.di.ProjectionScreenComponentInjector");
                        return ((knc.b) bVarU2).j().d(projectionScreen, projectionScreen.K, projectionScreen, new jlc.e(projectionScreen.S, projectionScreen.T, projectionScreen.W, projectionScreen.U, projectionScreen.R, projectionScreen.V, null, null));
                    case 1:
                        KProperty[] kPropertyArr2 = ProjectionScreen.c0;
                        w wVar = (w) projectionScreen.O.getValue();
                        switch (wVar.f116087a) {
                            case 0:
                                ProjectionScreenContract$Input projectionScreenContract$Input = wVar.d;
                                e eVar = (e) wVar.f116095n.get();
                                ProjectionScreenContract$Input projectionScreenContract$Input2 = wVar.d;
                                r rVar = wVar.e;
                                dmc.a aVar = rVar.e;
                                t tVar = new t(projectionScreenContract$Input2, new n(projectionScreenContract$Input2, aVar.d()), (jlc.o) wVar.o.get(), new o(new yoc.a(new yoc.b())), (jlc.s) wVar.f116096p.get(), new z(projectionScreenContract$Input2));
                                zjh.f fVarA = aVar.a();
                                emc.e eVarC = aVar.c();
                                qmc.h hVarA = rVar.f116029c.a();
                                jlc.d dVar = (jlc.d) wVar.f116097q.get();
                                moc.a aVar2 = (moc.a) wVar.f116098r.get();
                                u uVar = (u) wVar.f116099s.get();
                                gte.a aVarB = rVar.d.b();
                                s.j(aVarB);
                                return new com.revolut.feature.robo.impl.ui.screen.projection.a(projectionScreenContract$Input, eVar, tVar, fVarA, eVarC, hVarA, dVar, aVar2, uVar, aVarB);
                            default:
                                ProjectionScreenContract$Input projectionScreenContract$Input3 = wVar.d;
                                e eVar2 = (e) wVar.f116095n.get();
                                ProjectionScreenContract$Input projectionScreenContract$Input4 = wVar.d;
                                r rVar2 = wVar.e;
                                dmc.a aVar3 = rVar2.e;
                                t tVar2 = new t(projectionScreenContract$Input4, new n(projectionScreenContract$Input4, aVar3.d()), (jlc.o) wVar.o.get(), new o(new yoc.a(new yoc.b())), (jlc.s) wVar.f116096p.get(), new z(projectionScreenContract$Input4));
                                zjh.f fVarA2 = aVar3.a();
                                emc.e eVarC2 = aVar3.c();
                                qmc.h hVarA2 = rVar2.f116029c.a();
                                jlc.d dVar2 = (jlc.d) wVar.f116097q.get();
                                moc.a aVar4 = (moc.a) wVar.f116098r.get();
                                u uVar2 = (u) wVar.f116099s.get();
                                gte.a aVarB2 = rVar2.d.b();
                                s.j(aVarB2);
                                return new com.revolut.feature.robo.impl.ui.screen.projection.a(projectionScreenContract$Input3, eVar2, tVar2, fVarA2, eVarC2, hVarA2, dVar2, aVar4, uVar2, aVarB2);
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = ProjectionScreen.c0;
                        ProjectionScreen projectionScreen2 = this.f176683b;
                        return tki.g.a(projectionScreen2, projectionScreen2.d(), v.k(projectionScreen2.R, new FullScreenStateDelegate(), projectionScreen2.U, projectionScreen2.S, projectionScreen2.T, new HeaderLoadingDelegate(), projectionScreen2.W, projectionScreen2.X, projectionScreen2.Y, projectionScreen2.Z), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr4 = ProjectionScreen.c0;
                        w wVar2 = (w) projectionScreen.O.getValue();
                        switch (wVar2.f116087a) {
                            case 0:
                                return (j60.a) wVar2.f116091h.get();
                            default:
                                return (j60.a) wVar2.f116091h.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        jnc.m uiState = (jnc.m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        LargeActionButton largeActionButton = d3().f174564b;
        i iVar = uiState.f176699c;
        l lVar = uiState.f176697a;
        largeActionButton.setVisibility(iVar.f176691a ? 0 : 8);
        d3().f174564b.setText(uiState.f176699c.f176692b);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        if (!(lVar instanceof jnc.j)) {
            if (!lVar.equals(k.f176696a)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithToolbar.setLoadingVisible(true);
            return;
        }
        navBarWithToolbar.setLoadingVisible(false);
        jnc.j jVar = (jnc.j) lVar;
        navBarWithToolbar.setTitle(jVar.f176693a, null);
        navBarWithToolbar.setToolbarTitle(jVar.f176694b);
        navBarWithToolbar.setDescriptionClickable(jVar.d);
        navBarWithToolbar.setDescriptionText(jVar.f176695c);
        navBarWithToolbar.setEndIconImage(jVar.e);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        return new AnalyticsProduct.Retail(this.L);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setDescriptionVisible(true);
        d3().f174564b.setText(new TextLocalisedClause(R$string.common_action_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new jnc.c(this, null, 0), 3);
        int i = 4;
        int i2 = 2;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new jl6.b(i2, d(), jnc.h.class, "onLargeActionButtonClicked", "onLargeActionButtonClicked(Lkotlin/Unit;)V", i, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.U.d), null, new jl6.b(i2, d(), jnc.h.class, "onClauseClick", "onClauseClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", i, 2), 3);
        efm.r rVarFilter = this.X.f52707c.filter(new jeg.h(new jn2.a(3), 27));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.q0()), null, new jnc.c(this, null, 1), 3);
        ((j60.a) this.f85179b0.getValue()).d(zhm.u.c(this.V));
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final jnc.h d() {
        return (jnc.h) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.f85178a0.getValue();
    }

    @Override // z0h.s1
    public final vkm.d r() {
        return rd0.e.b(this.U.d);
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
