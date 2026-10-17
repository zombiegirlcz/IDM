package com.revolut.feature.apm.bills.f24.impl.ui.entry;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aq1.c;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.f24.impl.ui.entry.F24EntryController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import eq1.d;
import eq1.f;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/f24/impl/ui/entry/F24EntryController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Leq1/d;", "<init>", "()V", "feature_apm_bills_f24_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class F24EntryController extends SimpleViewController<d> {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(F24EntryController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int N = R$layout.screen_recycler_navbar;
    public final boolean O = true;
    public final h P = s.t(this, a.f);
    public final Object Q;
    public final Object R;

    public static final /* synthetic */ class a extends q implements Function1 {
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

    public F24EntryController() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: eq1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ F24EntryController f128218b;

            {
                this.f128218b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                F24EntryController f24EntryController = this.f128218b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = F24EntryController.S;
                        qji.b bVarU2 = f24EntryController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.f24.impl.ui.entry.di.F24EntryControllerInjector");
                        aq1.d dVar = (aq1.d) bVarU2;
                        return new aq1.c(dVar.f8236a, dVar.f8237b);
                    default:
                        KProperty[] kPropertyArr2 = F24EntryController.S;
                        return (f) ((aq1.c) f24EntryController.Q.getValue()).f8235b.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: eq1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ F24EntryController f128218b;

            {
                this.f128218b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                F24EntryController f24EntryController = this.f128218b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = F24EntryController.S;
                        qji.b bVarU2 = f24EntryController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.f24.impl.ui.entry.di.F24EntryControllerInjector");
                        aq1.d dVar = (aq1.d) bVarU2;
                        return new aq1.c(dVar.f8236a, dVar.f8237b);
                    default:
                        KProperty[] kPropertyArr2 = F24EntryController.S;
                        return (f) ((aq1.c) f24EntryController.Q.getValue()).f8235b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.I0(t3.DEFAULT, false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new ec8.c(this, null, 24), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }
}
