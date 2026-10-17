package com.revolut.feature.selfserve.sot.impl.ui.home;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.feature.selfserve.sot.impl.ui.home.SotHomeController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.d0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zyc.i;
import zyc.j;
import zyc.l;
import zyc.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/home/SotHomeController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzyc/o;", "Ldli/a;", "Lzyc/q;", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SotHomeController extends ViewController<o> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(SotHomeController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileBinding;", 0))};
    public final boolean K;
    public final int L = R$layout.screen_recycler_navbarwithbigtile;
    public final h M = s.t(this, i.f);
    public final RowDelegate N = new RowDelegate(null, null, 7);
    public final Object O;
    public final Object P;
    public final Object Q;

    public SotHomeController(boolean z) {
        this.K = z;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: zyc.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SotHomeController f326415b;

            {
                this.f326415b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SotHomeController sotHomeController = this.f326415b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SotHomeController.R;
                        phm.a aVar = (phm.a) ue0.e.j(sotHomeController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        r10.q qVarJ = ((jyc.r) aVar2.b()).j();
                        qVarJ.d = Boolean.valueOf(sotHomeController.K);
                        qVarJ.f250850c = sotHomeController;
                        return (jyc.l) qVarJ.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = SotHomeController.R;
                        jyc.l lVar = (jyc.l) sotHomeController.O.getValue();
                        boolean zBooleanValue = lVar.f179397a.booleanValue();
                        tyc.l lVar2 = new tyc.l(new w());
                        jyc.h hVar = lVar.f179398b;
                        kpj.f fVarM = hVar.m();
                        kpj.f fVarM2 = hVar.m();
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) hVar.f179384c).c();
                        vc.s.j(aVarC);
                        return new s(zBooleanValue, lVar2, fVarM, new zq.a(fVarM2, aVarC));
                    default:
                        KProperty[] kPropertyArr3 = SotHomeController.R;
                        SotHomeController sotHomeController2 = this.f326415b;
                        return dli.f.a(sotHomeController2, (s) sotHomeController2.P.getValue(), zhm.v.k(new PlainTextWarningDelegate(), new PlainTextDelegate(), new RowLoadingDelegate(), new ProgressStepsDelegate(), new ListSubheaderDelegate(), sotHomeController2.N), R$id.screenRecyclerNavBarWithBigTile_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: zyc.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SotHomeController f326415b;

            {
                this.f326415b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SotHomeController sotHomeController = this.f326415b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SotHomeController.R;
                        phm.a aVar = (phm.a) ue0.e.j(sotHomeController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        r10.q qVarJ = ((jyc.r) aVar2.b()).j();
                        qVarJ.d = Boolean.valueOf(sotHomeController.K);
                        qVarJ.f250850c = sotHomeController;
                        return (jyc.l) qVarJ.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = SotHomeController.R;
                        jyc.l lVar = (jyc.l) sotHomeController.O.getValue();
                        boolean zBooleanValue = lVar.f179397a.booleanValue();
                        tyc.l lVar2 = new tyc.l(new w());
                        jyc.h hVar = lVar.f179398b;
                        kpj.f fVarM = hVar.m();
                        kpj.f fVarM2 = hVar.m();
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) hVar.f179384c).c();
                        vc.s.j(aVarC);
                        return new s(zBooleanValue, lVar2, fVarM, new zq.a(fVarM2, aVarC));
                    default:
                        KProperty[] kPropertyArr3 = SotHomeController.R;
                        SotHomeController sotHomeController2 = this.f326415b;
                        return dli.f.a(sotHomeController2, (s) sotHomeController2.P.getValue(), zhm.v.k(new PlainTextWarningDelegate(), new PlainTextDelegate(), new RowLoadingDelegate(), new ProgressStepsDelegate(), new ListSubheaderDelegate(), sotHomeController2.N), R$id.screenRecyclerNavBarWithBigTile_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: zyc.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SotHomeController f326415b;

            {
                this.f326415b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SotHomeController sotHomeController = this.f326415b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SotHomeController.R;
                        phm.a aVar = (phm.a) ue0.e.j(sotHomeController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        r10.q qVarJ = ((jyc.r) aVar2.b()).j();
                        qVarJ.d = Boolean.valueOf(sotHomeController.K);
                        qVarJ.f250850c = sotHomeController;
                        return (jyc.l) qVarJ.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = SotHomeController.R;
                        jyc.l lVar = (jyc.l) sotHomeController.O.getValue();
                        boolean zBooleanValue = lVar.f179397a.booleanValue();
                        tyc.l lVar2 = new tyc.l(new w());
                        jyc.h hVar = lVar.f179398b;
                        kpj.f fVarM = hVar.m();
                        kpj.f fVarM2 = hVar.m();
                        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) hVar.f179384c).c();
                        vc.s.j(aVarC);
                        return new s(zBooleanValue, lVar2, fVarM, new zq.a(fVarM2, aVarC));
                    default:
                        KProperty[] kPropertyArr3 = SotHomeController.R;
                        SotHomeController sotHomeController2 = this.f326415b;
                        return dli.f.a(sotHomeController2, (s) sotHomeController2.P.getValue(), zhm.v.k(new PlainTextWarningDelegate(), new PlainTextDelegate(), new RowLoadingDelegate(), new ProgressStepsDelegate(), new ListSubheaderDelegate(), sotHomeController2.N), R$id.screenRecyclerNavBarWithBigTile_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        zyc.q uiState = (zyc.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        l lVar = uiState.f326424a;
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithBigTile navBarWithBigTile = ((d0) value).f174510b;
        navBarWithBigTile.setTitle(lVar.f326419a);
        navBarWithBigTile.setToolbarTitle(lVar.f326420b);
        Integer num = lVar.d;
        if (num != null) {
            navBarWithBigTile.setNavigationButtonIcon(Integer.valueOf(num.intValue()));
        }
        navBarWithBigTile.setBackgroundImage(lVar.f326421c);
        navBarWithBigTile.setActionStatusLabel(lVar.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (jyc.l) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (zyc.s) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((d0) value).f174510b.f59357t), new zub.b(this, null, 6), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new j(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
