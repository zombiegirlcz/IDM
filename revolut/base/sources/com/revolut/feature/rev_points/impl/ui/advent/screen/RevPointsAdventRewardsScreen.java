package com.revolut.feature.rev_points.impl.ui.advent.screen;

import aii.q;
import cli.a0;
import cli.l;
import cli.o;
import cli.w;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.tracking.v3.RevPointsAdventCalendarContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.k;
import pki.b;
import vyb.a;
import xki.e;
import zxb.d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/advent/screen/RevPointsAdventRewardsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "Lcli/l;", "Lno/k;", "Companion", "a", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsAdventRewardsScreen extends ViewController<q> implements w, k {
    public final int K;
    public AnalyticsContext L;
    public final Object M;
    public final Object N;
    public final Object O;

    public RevPointsAdventRewardsScreen(RevPointsAdventRewardsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        RevPointsAdventCalendarContext.a aVarNewBuilder = RevPointsAdventCalendarContext.newBuilder();
        String str = inputData.f83772a;
        aVarNewBuilder.c();
        ((RevPointsAdventCalendarContext) aVarNewBuilder.f49761b).setAnalyticsRef(str);
        aVarNewBuilder.c();
        ((RevPointsAdventCalendarContext) aVarNewBuilder.f49761b).setPlacementId("RevPointsAdventCalendar");
        aVarNewBuilder.c();
        ((RevPointsAdventCalendarContext) aVarNewBuilder.f49761b).setIsLinkout(true);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        this.L = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        this.M = te0.w.y0(new a(this, 0));
        this.N = te0.w.y0(new a(this, 1));
        this.O = te0.w.y0(new a(this, inputData));
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.L = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.O.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (vyb.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.N.getValue();
    }
}
