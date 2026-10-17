package com.revolut.feature.retail.cfd.impl.screens.settings;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.cfd.impl.screens.settings.CfdSettingsController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import dli.c;
import dli.f;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m2b.t;
import nuh.j;
import o4b.d;
import pki.b;
import te0.w;
import ue0.e;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/settings/CfdSettingsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lo4b/d;", "<init>", "()V", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CfdSettingsController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CfdSettingsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object N;
    public final Object O;
    public final Object P;
    public final h K = s.t(this, a.f);
    public final CellDetailsDelegate L = new CellDetailsDelegate();
    public final RowDelegate M = new RowDelegate(null, null, 7);
    public final int Q = R$layout.screen_recycler_navbar;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public CfdSettingsController() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: o4b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdSettingsController f222187b;

            {
                this.f222187b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CfdSettingsController cfdSettingsController = this.f222187b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CfdSettingsController.R;
                        return (b) ((t) cfdSettingsController.P.getValue()).f201903j.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CfdSettingsController.R;
                        CfdSettingsController cfdSettingsController2 = this.f222187b;
                        return f.a(cfdSettingsController2, (b) cfdSettingsController2.N.getValue(), v.k(cfdSettingsController2.L, cfdSettingsController2.M, new CellDetailsLoadingDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr3 = CfdSettingsController.R;
                        phm.a aVar = (phm.a) e.j(cfdSettingsController.m2()).a().get(m2b.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new t(((m2b.v) aVar2.b()).C, cfdSettingsController, new jx0.a(cfdSettingsController));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", m2b.v.class, " is not found"));
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: o4b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdSettingsController f222187b;

            {
                this.f222187b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CfdSettingsController cfdSettingsController = this.f222187b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CfdSettingsController.R;
                        return (b) ((t) cfdSettingsController.P.getValue()).f201903j.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CfdSettingsController.R;
                        CfdSettingsController cfdSettingsController2 = this.f222187b;
                        return f.a(cfdSettingsController2, (b) cfdSettingsController2.N.getValue(), v.k(cfdSettingsController2.L, cfdSettingsController2.M, new CellDetailsLoadingDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr3 = CfdSettingsController.R;
                        phm.a aVar = (phm.a) e.j(cfdSettingsController.m2()).a().get(m2b.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new t(((m2b.v) aVar2.b()).C, cfdSettingsController, new jx0.a(cfdSettingsController));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", m2b.v.class, " is not found"));
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: o4b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdSettingsController f222187b;

            {
                this.f222187b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CfdSettingsController cfdSettingsController = this.f222187b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CfdSettingsController.R;
                        return (b) ((t) cfdSettingsController.P.getValue()).f201903j.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CfdSettingsController.R;
                        CfdSettingsController cfdSettingsController2 = this.f222187b;
                        return f.a(cfdSettingsController2, (b) cfdSettingsController2.N.getValue(), v.k(cfdSettingsController2.L, cfdSettingsController2.M, new CellDetailsLoadingDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr3 = CfdSettingsController.R;
                        phm.a aVar = (phm.a) e.j(cfdSettingsController.m2()).a().get(m2b.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new t(((m2b.v) aVar2.b()).C, cfdSettingsController, new jx0.a(cfdSettingsController));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", m2b.v.class, " is not found"));
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (t) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (o4b.b) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.wealth_action_settings, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new j(this, null, 16), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.TRUE;
    }
}
