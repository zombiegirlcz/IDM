package com.revolut.feature.rev_points.spare_change.impl.ui.screen.deactivation;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeDeactivationControllerApi$InputData;
import com.revolut.feature.rev_points.spare_change.impl.R$id;
import com.revolut.feature.rev_points.spare_change.impl.R$layout;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.deactivation.RevPointsSpareChangeDeactivationController;
import com.revolut.kompot.navigable.vc.ViewController;
import d2c.b;
import d2c.f;
import dli.a;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import p1c.c;
import te0.w;
import vc.s;
import w1c.d;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u00012\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/rev_points/spare_change/impl/ui/screen/deactivation/RevPointsSpareChangeDeactivationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lp1c/c;", "Lcom/revolut/feature/rev_points/spare_change/impl/ui/screen/deactivation/DeactivationResult;", "Lno/m;", "Ldli/a;", "Ld2c/f;", "feature_rev_points_spare_change_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsSpareChangeDeactivationController extends ViewController<c> implements m, a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(RevPointsSpareChangeDeactivationController.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/spare_change/impl/databinding/ScreenRevPointsSpareChangeDeactivationBinding;", 0))};
    public final SimpleMediaDelegate K;
    public final RowDelegate L;
    public final Object M;
    public final h N;
    public final Object O;
    public final boolean P;
    public final AnalyticsProduct.Retail Q;
    public final int R;
    public final Object S;

    public RevPointsSpareChangeDeactivationController() {
        RevPointsSpareChangeDeactivationControllerApi$InputData.Confirm inputData = RevPointsSpareChangeDeactivationControllerApi$InputData.Confirm.f84134a;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new SimpleMediaDelegate();
        this.L = new RowDelegate(null, null, 7);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: d2c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsSpareChangeDeactivationController f110786b;

            {
                this.f110786b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsSpareChangeDeactivationController revPointsSpareChangeDeactivationController = this.f110786b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsSpareChangeDeactivationController.T;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsSpareChangeDeactivationController.m2()).a().get(w1c.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w1c.a.class, " is not found"));
                        }
                        w1c.a aVar3 = ((w1c.a) aVar2.b()).f293821h;
                        w1c.d dVar = new w1c.d();
                        dVar.f293827a = e4m.b.b(new vzc.j(aVar3, dVar, 1, 5));
                        dVar.f293828b = e4m.b.b(new vzc.j(aVar3, dVar, 2, 5));
                        dVar.f293829c = e4m.b.b(new vzc.j(aVar3, dVar, 0, 5));
                        return dVar;
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsSpareChangeDeactivationController.T;
                        return (d) ((w1c.d) revPointsSpareChangeDeactivationController.M.getValue()).f293829c.get();
                    default:
                        KProperty[] kPropertyArr3 = RevPointsSpareChangeDeactivationController.T;
                        RevPointsSpareChangeDeactivationController revPointsSpareChangeDeactivationController2 = this.f110786b;
                        return dli.f.a(revPointsSpareChangeDeactivationController2, (d) revPointsSpareChangeDeactivationController2.O.getValue(), v.k(revPointsSpareChangeDeactivationController2.K, revPointsSpareChangeDeactivationController2.L), R$id.spareChangeDeactivation_recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = s.t(this, b.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: d2c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsSpareChangeDeactivationController f110786b;

            {
                this.f110786b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsSpareChangeDeactivationController revPointsSpareChangeDeactivationController = this.f110786b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsSpareChangeDeactivationController.T;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsSpareChangeDeactivationController.m2()).a().get(w1c.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w1c.a.class, " is not found"));
                        }
                        w1c.a aVar3 = ((w1c.a) aVar2.b()).f293821h;
                        w1c.d dVar = new w1c.d();
                        dVar.f293827a = e4m.b.b(new vzc.j(aVar3, dVar, 1, 5));
                        dVar.f293828b = e4m.b.b(new vzc.j(aVar3, dVar, 2, 5));
                        dVar.f293829c = e4m.b.b(new vzc.j(aVar3, dVar, 0, 5));
                        return dVar;
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsSpareChangeDeactivationController.T;
                        return (d) ((w1c.d) revPointsSpareChangeDeactivationController.M.getValue()).f293829c.get();
                    default:
                        KProperty[] kPropertyArr3 = RevPointsSpareChangeDeactivationController.T;
                        RevPointsSpareChangeDeactivationController revPointsSpareChangeDeactivationController2 = this.f110786b;
                        return dli.f.a(revPointsSpareChangeDeactivationController2, (d) revPointsSpareChangeDeactivationController2.O.getValue(), v.k(revPointsSpareChangeDeactivationController2.K, revPointsSpareChangeDeactivationController2.L), R$id.spareChangeDeactivation_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = true;
        k9 k9Var = k9.RevPoints;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.Q = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.R = R$layout.screen_rev_points_spare_change_deactivation;
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: d2c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsSpareChangeDeactivationController f110786b;

            {
                this.f110786b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevPointsSpareChangeDeactivationController revPointsSpareChangeDeactivationController = this.f110786b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsSpareChangeDeactivationController.T;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsSpareChangeDeactivationController.m2()).a().get(w1c.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w1c.a.class, " is not found"));
                        }
                        w1c.a aVar3 = ((w1c.a) aVar2.b()).f293821h;
                        w1c.d dVar = new w1c.d();
                        dVar.f293827a = e4m.b.b(new vzc.j(aVar3, dVar, 1, 5));
                        dVar.f293828b = e4m.b.b(new vzc.j(aVar3, dVar, 2, 5));
                        dVar.f293829c = e4m.b.b(new vzc.j(aVar3, dVar, 0, 5));
                        return dVar;
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsSpareChangeDeactivationController.T;
                        return (d) ((w1c.d) revPointsSpareChangeDeactivationController.M.getValue()).f293829c.get();
                    default:
                        KProperty[] kPropertyArr3 = RevPointsSpareChangeDeactivationController.T;
                        RevPointsSpareChangeDeactivationController revPointsSpareChangeDeactivationController2 = this.f110786b;
                        return dli.f.a(revPointsSpareChangeDeactivationController2, (d) revPointsSpareChangeDeactivationController2.O.getValue(), v.k(revPointsSpareChangeDeactivationController2.K, revPointsSpareChangeDeactivationController2.L), R$id.spareChangeDeactivation_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((f) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getP() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d2c.d) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().d;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.rev_points_deactivation_button_go_back, null, null, 14), 126));
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.rev_points_deactivation_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.rev_points_deactivation_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.rev_points_deactivation_description, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        LargeActionButton largeActionButton = d3().f276387c;
        largeActionButton.setText(new TextLocalisedClause(R$string.rev_points_deactivation_button_go_back, null, null, 14));
        largeActionButton.o(LargeActionButton.ButtonStyle.o);
        LargeActionButton largeActionButton2 = d3().f276386b;
        largeActionButton2.setText(new TextLocalisedClause(R$string.rev_points_deactivation_button_continue_anyway, null, null, 14));
        largeActionButton2.o(LargeActionButton.ButtonStyle.f58725a);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f59410q), null, new d2c.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f276386b.o), null, new d2c.c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f276387c.o), null, new d2c.c(this, null, 2), 3);
    }

    public final u1c.a d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u1c.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }
}
