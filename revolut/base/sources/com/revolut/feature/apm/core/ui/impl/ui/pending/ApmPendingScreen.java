package com.revolut.feature.apm.core.ui.impl.ui.pending;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c12.r;
import c12.v;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.ui.api.navigation.ApmPendingNavigation$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.pending.ApmPendingScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p12.a0;
import te0.w;
import vc.s;
import x1e.g;
import x22.b;
import x22.d;
import x22.f;
import xki.e;
import yy0.i;
import yy0.l;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/pending/ApmPendingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lc12/v;", "Ldli/a;", "Lx22/a;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmPendingScreen extends ViewController<v> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(ApmPendingScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final ApmPendingNavigation$InputData K;
    public final r L;
    public final int M;
    public final boolean N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public ApmPendingScreen(ApmPendingNavigation$InputData inputData, r extension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.K = inputData;
        this.L = extension;
        this.M = R$layout.screen_recycler_navbar;
        this.N = true;
        this.O = s.t(this, d.f);
        this.P = w.y0(new g(13));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: x22.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmPendingScreen f302461b;

            {
                this.f302461b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ApmPendingScreen apmPendingScreen = this.f302461b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ApmPendingScreen.T;
                        ApmPendingScreen apmPendingScreen2 = this.f302461b;
                        return dli.f.a(apmPendingScreen2, (b) apmPendingScreen2.S.getValue(), u.c((ActionsLoadingDelegate) apmPendingScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmPendingScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(apmPendingScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        ApmPendingNavigation$InputData apmPendingNavigation$InputData = apmPendingScreen.K;
                        apmPendingNavigation$InputData.getClass();
                        r rVar = apmPendingScreen.L;
                        rVar.getClass();
                        return new a0(vVar, apmPendingNavigation$InputData, rVar);
                    default:
                        KProperty[] kPropertyArr3 = ApmPendingScreen.T;
                        return (b) ((a0) apmPendingScreen.R.getValue()).f231620c.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: x22.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmPendingScreen f302461b;

            {
                this.f302461b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ApmPendingScreen apmPendingScreen = this.f302461b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmPendingScreen.T;
                        ApmPendingScreen apmPendingScreen2 = this.f302461b;
                        return dli.f.a(apmPendingScreen2, (b) apmPendingScreen2.S.getValue(), u.c((ActionsLoadingDelegate) apmPendingScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmPendingScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(apmPendingScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        ApmPendingNavigation$InputData apmPendingNavigation$InputData = apmPendingScreen.K;
                        apmPendingNavigation$InputData.getClass();
                        r rVar = apmPendingScreen.L;
                        rVar.getClass();
                        return new a0(vVar, apmPendingNavigation$InputData, rVar);
                    default:
                        KProperty[] kPropertyArr3 = ApmPendingScreen.T;
                        return (b) ((a0) apmPendingScreen.R.getValue()).f231620c.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: x22.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmPendingScreen f302461b;

            {
                this.f302461b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ApmPendingScreen apmPendingScreen = this.f302461b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmPendingScreen.T;
                        ApmPendingScreen apmPendingScreen2 = this.f302461b;
                        return dli.f.a(apmPendingScreen2, (b) apmPendingScreen2.S.getValue(), u.c((ActionsLoadingDelegate) apmPendingScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmPendingScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(apmPendingScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        ApmPendingNavigation$InputData apmPendingNavigation$InputData = apmPendingScreen.K;
                        apmPendingNavigation$InputData.getClass();
                        r rVar = apmPendingScreen.L;
                        rVar.getClass();
                        return new a0(vVar, apmPendingNavigation$InputData, rVar);
                    default:
                        KProperty[] kPropertyArr3 = ApmPendingScreen.T;
                        return (b) ((a0) apmPendingScreen.R.getValue()).f231620c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((x22.a) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((f) ((b) this.S.getValue())).C2(c12.s.f20349a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a0) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (b) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        i iVar = l.Companion;
        ApmPendingNavigation$InputData apmPendingNavigation$InputData = this.K;
        Image image = apmPendingNavigation$InputData.f62258c;
        iVar.getClass();
        navBarWithToolbar.setEndImage(i.a(image));
        Clause clause = apmPendingNavigation$InputData.f62257b;
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setTitle(clause, null);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new x0f.g(this, null, 2), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
