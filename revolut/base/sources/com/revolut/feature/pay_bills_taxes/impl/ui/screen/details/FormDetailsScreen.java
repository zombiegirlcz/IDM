package com.revolut.feature.pay_bills_taxes.impl.ui.screen.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cg9.b;
import cg9.c;
import cg9.g;
import cg9.i;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.details.FormDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ef9.d;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lf9.f;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/details/FormDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lef9/d;", "Ldli/a;", "Lcg9/i;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FormDetailsScreen extends ViewController<d> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(FormDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final boolean L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public FormDetailsScreen(FormDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = true;
        this.M = s.t(this, b.f);
        this.N = w.y0(new cbh.b(17));
        this.O = w.y0(new cbh.b(18));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: cg9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormDetailsScreen f23869b;

            {
                this.f23869b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = FormDetailsScreen.S;
                        FormDetailsScreen formDetailsScreen = this.f23869b;
                        return dli.f.a(formDetailsScreen, formDetailsScreen.R2(), v.k((CellDetailsDelegate) formDetailsScreen.N.getValue(), (RowDelegate) formDetailsScreen.O.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = FormDetailsScreen.S;
                        return (h) ((lf9.f) this.f23869b.Q.getValue()).d.get();
                }
            }
        });
        this.Q = w.y0(new cf6.a(this, inputData, 2));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: cg9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormDetailsScreen f23869b;

            {
                this.f23869b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FormDetailsScreen.S;
                        FormDetailsScreen formDetailsScreen = this.f23869b;
                        return dli.f.a(formDetailsScreen, formDetailsScreen.R2(), v.k((CellDetailsDelegate) formDetailsScreen.N.getValue(), (RowDelegate) formDetailsScreen.O.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = FormDetailsScreen.S;
                        return (h) ((lf9.f) this.f23869b.Q.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        g gVar = uiState.f23876b;
        if (gVar != null) {
            CompositeClause compositeClause = gVar.f23874c;
            MoneyClause moneyClause = gVar.f23873b;
            TextClause textClause = gVar.f23872a;
            NavBarWithToolbar navBarWithToolbar = d3().f174539b;
            navBarWithToolbar.setTitle(textClause, null);
            navBarWithToolbar.setToolbarTitle(textClause);
            navBarWithToolbar.setDescriptionVisible(true);
            navBarWithToolbar.setDescriptionText(moneyClause);
            navBarWithToolbar.setSecondDescriptionVisible(true);
            navBarWithToolbar.setSecondDescriptionText(compositeClause);
            navBarWithToolbar.setTopActions(gVar.d);
            navBarWithToolbar.setMenuItems(gVar.e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new c65.i(this, continuation, 12), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.C0()), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.o.f57403b), null, new cbh.g(this, continuation, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsDelegate) this.N.getValue()).f), null, new cg9.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.O.getValue()).f53218h), null, new cg9.e(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final cg9.h R2() {
        return (cg9.h) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
