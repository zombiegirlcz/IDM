package com.revolut.feature.licenses.impl.ui.licenses;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import co7.c;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.licenses.api.R$string;
import com.revolut.feature.licenses.impl.ui.licenses.LicensesController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import cvi.j;
import d19.d;
import d19.e;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import tb4.t;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/licenses/impl/ui/licenses/LicensesController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ld19/e;", "<init>", "()V", "feature_licenses_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LicensesController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(LicensesController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final RowDelegate M = new RowDelegate(null, null, 7);
    public final RowLoadingDelegate N = new RowLoadingDelegate();
    public final FullScreenStateDelegate O = new FullScreenStateDelegate();
    public final Object P;
    public final Object Q;
    public final Object R;

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

    public LicensesController() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: d19.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LicensesController f110609b;

            {
                this.f110609b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LicensesController licensesController = this.f110609b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LicensesController.S;
                        phm.a aVar = (phm.a) ue0.e.j(licensesController.m2()).a().get(z09.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z09.d.class, " is not found"));
                        }
                        t tVarB = ((z09.d) aVar2.b()).b();
                        tVarB.f269457c = licensesController;
                        return (z09.a) tVarB.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = LicensesController.S;
                        z09.a aVar3 = (z09.a) licensesController.P.getValue();
                        g gVar = new g();
                        z09.b bVar = aVar3.f318189a;
                        a19.f fVar = (a19.f) bVar.d.get();
                        n80.d dVarA = bVar.f318190a.a();
                        s.j(dVarA);
                        return new f(gVar, fVar, dVarA);
                    default:
                        KProperty[] kPropertyArr3 = LicensesController.S;
                        LicensesController licensesController2 = this.f110609b;
                        return dli.f.a(licensesController2, (d) licensesController2.Q.getValue(), v.k(licensesController2.M, licensesController2.N, licensesController2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: d19.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LicensesController f110609b;

            {
                this.f110609b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LicensesController licensesController = this.f110609b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LicensesController.S;
                        phm.a aVar = (phm.a) ue0.e.j(licensesController.m2()).a().get(z09.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z09.d.class, " is not found"));
                        }
                        t tVarB = ((z09.d) aVar2.b()).b();
                        tVarB.f269457c = licensesController;
                        return (z09.a) tVarB.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = LicensesController.S;
                        z09.a aVar3 = (z09.a) licensesController.P.getValue();
                        g gVar = new g();
                        z09.b bVar = aVar3.f318189a;
                        a19.f fVar = (a19.f) bVar.d.get();
                        n80.d dVarA = bVar.f318190a.a();
                        s.j(dVarA);
                        return new f(gVar, fVar, dVarA);
                    default:
                        KProperty[] kPropertyArr3 = LicensesController.S;
                        LicensesController licensesController2 = this.f110609b;
                        return dli.f.a(licensesController2, (d) licensesController2.Q.getValue(), v.k(licensesController2.M, licensesController2.N, licensesController2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: d19.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LicensesController f110609b;

            {
                this.f110609b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LicensesController licensesController = this.f110609b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LicensesController.S;
                        phm.a aVar = (phm.a) ue0.e.j(licensesController.m2()).a().get(z09.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z09.d.class, " is not found"));
                        }
                        t tVarB = ((z09.d) aVar2.b()).b();
                        tVarB.f269457c = licensesController;
                        return (z09.a) tVarB.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = LicensesController.S;
                        z09.a aVar3 = (z09.a) licensesController.P.getValue();
                        g gVar = new g();
                        z09.b bVar = aVar3.f318189a;
                        a19.f fVar = (a19.f) bVar.d.get();
                        n80.d dVarA = bVar.f318190a.a();
                        s.j(dVarA);
                        return new f(gVar, fVar, dVarA);
                    default:
                        KProperty[] kPropertyArr3 = LicensesController.S;
                        LicensesController licensesController2 = this.f110609b;
                        return dli.f.a(licensesController2, (d) licensesController2.Q.getValue(), v.k(licensesController2.M, licensesController2.N, licensesController2.O), 0, null, null, null, 60);
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
        return (z09.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (d) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.settings_open_source_licenses_title, null, null, 14);
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new c(this, continuation, 17), 3);
        RowDelegate rowDelegate = this.M;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new d19.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.o.f121375b), new j(this, continuation, 12), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
