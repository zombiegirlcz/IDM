package com.revolut.feature.salary_switch.impl.ui.mexico.screen.status;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.salary_switch.impl.R$string;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.status.SalarySwitchStatusContract$InputData;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.status.SalarySwitchStatusController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m9d.y0;
import mrc.b;
import mrc.c;
import mrc.d;
import mrc.f;
import mrc.i;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;
import zpc.p;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/mexico/screen/status/SalarySwitchStatusController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmrc/c;", "Ldli/a;", "Lmrc/d;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SalarySwitchStatusController extends ViewController<c> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(SalarySwitchStatusController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final SalarySwitchStatusContract$InputData K;
    public final h L;
    public final CellDetailsChevronDelegate M;
    public final FullScreenStateDelegate N;
    public final ProgressStepVerticalDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final int S;

    public SalarySwitchStatusController(SalarySwitchStatusContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, f.f);
        this.M = new CellDetailsChevronDelegate();
        this.N = new FullScreenStateDelegate();
        this.O = new ProgressStepVerticalDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: mrc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalarySwitchStatusController f208104b;

            {
                this.f208104b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SalarySwitchStatusController salarySwitchStatusController = this.f208104b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SalarySwitchStatusController.T;
                        phm.a aVar = (phm.a) ue0.e.j(salarySwitchStatusController.m2()).a().get(zpc.k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zpc.k.class, " is not found"));
                        }
                        zpc.k kVar = ((zpc.k) aVar2.b()).u;
                        SalarySwitchStatusContract$InputData salarySwitchStatusContract$InputData = salarySwitchStatusController.K;
                        salarySwitchStatusContract$InputData.getClass();
                        return new p(kVar, salarySwitchStatusContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SalarySwitchStatusController.T;
                        return (b) ((p) salarySwitchStatusController.P.getValue()).f324283c.get();
                    default:
                        KProperty[] kPropertyArr3 = SalarySwitchStatusController.T;
                        SalarySwitchStatusController salarySwitchStatusController2 = this.f208104b;
                        return dli.f.a(salarySwitchStatusController2, salarySwitchStatusController2.d(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new ProgressStepVerticalLoadingDelegate(), salarySwitchStatusController2.M, salarySwitchStatusController2.N, salarySwitchStatusController2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: mrc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalarySwitchStatusController f208104b;

            {
                this.f208104b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SalarySwitchStatusController salarySwitchStatusController = this.f208104b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SalarySwitchStatusController.T;
                        phm.a aVar = (phm.a) ue0.e.j(salarySwitchStatusController.m2()).a().get(zpc.k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zpc.k.class, " is not found"));
                        }
                        zpc.k kVar = ((zpc.k) aVar2.b()).u;
                        SalarySwitchStatusContract$InputData salarySwitchStatusContract$InputData = salarySwitchStatusController.K;
                        salarySwitchStatusContract$InputData.getClass();
                        return new p(kVar, salarySwitchStatusContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SalarySwitchStatusController.T;
                        return (b) ((p) salarySwitchStatusController.P.getValue()).f324283c.get();
                    default:
                        KProperty[] kPropertyArr3 = SalarySwitchStatusController.T;
                        SalarySwitchStatusController salarySwitchStatusController2 = this.f208104b;
                        return dli.f.a(salarySwitchStatusController2, salarySwitchStatusController2.d(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new ProgressStepVerticalLoadingDelegate(), salarySwitchStatusController2.M, salarySwitchStatusController2.N, salarySwitchStatusController2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: mrc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SalarySwitchStatusController f208104b;

            {
                this.f208104b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SalarySwitchStatusController salarySwitchStatusController = this.f208104b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SalarySwitchStatusController.T;
                        phm.a aVar = (phm.a) ue0.e.j(salarySwitchStatusController.m2()).a().get(zpc.k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zpc.k.class, " is not found"));
                        }
                        zpc.k kVar = ((zpc.k) aVar2.b()).u;
                        SalarySwitchStatusContract$InputData salarySwitchStatusContract$InputData = salarySwitchStatusController.K;
                        salarySwitchStatusContract$InputData.getClass();
                        return new p(kVar, salarySwitchStatusContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SalarySwitchStatusController.T;
                        return (b) ((p) salarySwitchStatusController.P.getValue()).f324283c.get();
                    default:
                        KProperty[] kPropertyArr3 = SalarySwitchStatusController.T;
                        SalarySwitchStatusController salarySwitchStatusController2 = this.f208104b;
                        return dli.f.a(salarySwitchStatusController2, salarySwitchStatusController2.d(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new ProgressStepVerticalLoadingDelegate(), salarySwitchStatusController2.M, salarySwitchStatusController2.N, salarySwitchStatusController2.O), 0, null, null, null, 60);
                }
            }
        });
        this.S = R$layout.screen_recycler_navbar;
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.salary_switch_mx_status_title, null, null, 14);
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new y0(this, continuation, 27), 3);
        ViewController.P2(this, rd0.e.b(this.O.f53000c), new mkk.q(this, continuation, 15), 3);
        ViewController.P2(this, new mmh.e(rd0.e.b(this.N.f52371h.f121375b), 4), new mrc.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f51821c), new i(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final b d() {
        return (b) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
