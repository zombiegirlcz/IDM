package com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change;

import android.os.Parcelable;
import android.view.View;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$InputData;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Result;
import com.revolut.feature.rev_points.spare_change.impl.R$id;
import com.revolut.feature.rev_points.spare_change.impl.R$layout;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.RevPointsSpareChangeController;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import no.m;
import org.jetbrains.annotations.NotNull;
import ot1.p;
import ox5.r;
import p2c.d;
import p2c.f;
import p2c.h;
import pd.b;
import te0.w;
import tki.c;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/rev_points/spare_change/impl/ui/screen/spare_change/RevPointsSpareChangeController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/rev_points/spare_change/api/navigation/RevPointsSpareChangeControllerApi$Result;", "Ltki/c;", "Lp2c/m;", "Lno/m;", "Companion", "a", "feature_rev_points_spare_change_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsSpareChangeController extends ViewController<RevPointsSpareChangeControllerApi$Result> implements c, m {

    @NotNull
    private static final a Companion = new a();
    public final TextDelegate K;
    public final LargeActionButtonDelegate L;
    public final TwinHorizontalButtonDelegate M;
    public final AttributeSelectorSmallDelegate N;
    public final FullScreenStateDelegate O;
    public final int P;
    public final AnalyticsProduct.Retail Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public static final class a {
        private a() {
        }
    }

    public RevPointsSpareChangeController(RevPointsSpareChangeControllerApi$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new TextDelegate();
        this.L = new LargeActionButtonDelegate();
        this.M = new TwinHorizontalButtonDelegate();
        this.N = new AttributeSelectorSmallDelegate();
        this.O = new FullScreenStateDelegate();
        this.P = R$layout.screen_rev_points_spare_change;
        k9 k9Var = k9.RevPoints;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.Q = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.R = w.y0(new p(this, inputData, 14));
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: p2c.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsSpareChangeController f232208b;

            {
                this.f232208b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (h) ((w1c.c) this.f232208b.R.getValue()).f293826c.get();
                    default:
                        RevPointsSpareChangeController revPointsSpareChangeController = this.f232208b;
                        return tki.g.a(revPointsSpareChangeController, revPointsSpareChangeController.d(), zhm.v.k(revPointsSpareChangeController.K, new PlainTextLoadingDelegate(), revPointsSpareChangeController.O, revPointsSpareChangeController.L, new LargeActionButtonLoadingDelegate(), revPointsSpareChangeController.M, new GridBoxDelegate(zhm.v.k(revPointsSpareChangeController.N, new AttributeSelectorSmallLoadingDelegate()), 8.0f, 8.0f, 3)), R$id.revPointsSpareChangeScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: p2c.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsSpareChangeController f232208b;

            {
                this.f232208b = this;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (h) ((w1c.c) this.f232208b.R.getValue()).f293826c.get();
                    default:
                        RevPointsSpareChangeController revPointsSpareChangeController = this.f232208b;
                        return tki.g.a(revPointsSpareChangeController, revPointsSpareChangeController.d(), zhm.v.k(revPointsSpareChangeController.K, new PlainTextLoadingDelegate(), revPointsSpareChangeController.O, revPointsSpareChangeController.L, new LargeActionButtonLoadingDelegate(), revPointsSpareChangeController.M, new GridBoxDelegate(zhm.v.k(revPointsSpareChangeController.N, new AttributeSelectorSmallLoadingDelegate()), 8.0f, 8.0f, 3)), R$id.revPointsSpareChangeScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((p2c.m) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getX() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w1c.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i = R$string.rev_points_spare_change;
        m70.a.c(t0.f186434a);
        b.p(view, new TextLocalisedClause(i, u.c(""), null, 12));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.K.d), null, new r(this, null, 6), 3);
        ViewController.P2(this, rd0.e.b(this.N.p()), new p2c.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.L.d.f121375b), new d(this, null), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.M;
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), new p2c.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), new p2c.e(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final h d() {
        return (h) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.T.getValue();
    }
}
