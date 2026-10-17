package com.revolut.feature.apm.bills.f24.impl.ui.forms_list;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aq1.f;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.f24.api.R$string;
import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.FormsListScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import efm.r;
import ghk.t;
import gla.k;
import gq1.d;
import gq1.g;
import gq1.i;
import gq1.j;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/f24/impl/ui/forms_list/FormsListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lgq1/j;", "feature_apm_bills_f24_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FormsListScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(FormsListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object K;
    public final Object L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public FormsListScreen(FormsListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new k(12));
        this.L = w.y0(new k(13));
        this.M = R$layout.screen_recycler_navbar;
        this.N = s.t(this, d.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: gq1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormsListScreen f145510b;

            {
                this.f145510b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = FormsListScreen.R;
                        FormsListScreen formsListScreen = this.f145510b;
                        return dli.f.a(formsListScreen, (i) formsListScreen.Q.getValue(), v.k((RowDelegate) formsListScreen.K.getValue(), (LargeActionButtonDelegate) formsListScreen.L.getValue(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = FormsListScreen.R;
                        return (i) ((aq1.f) this.f145510b.P.getValue()).e.get();
                }
            }
        });
        this.P = w.y0(new t(this, inputData, 14));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: gq1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormsListScreen f145510b;

            {
                this.f145510b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FormsListScreen.R;
                        FormsListScreen formsListScreen = this.f145510b;
                        return dli.f.a(formsListScreen, (i) formsListScreen.Q.getValue(), v.k((RowDelegate) formsListScreen.K.getValue(), (LargeActionButtonDelegate) formsListScreen.L.getValue(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = FormsListScreen.R;
                        return (i) ((aq1.f) this.f145510b.P.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (i) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.f24_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.f24_title, null, null, 14), null);
    }

    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new g85.f(this, null, 26), 3);
        ?? r72 = this.K;
        r rVarFilter = ((RowDelegate) r72.getValue()).f53218h.filter(new gjg.e(new gn.a(22), 24));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new gq1.e(this, null), 3);
        r rVarFilter2 = ((RowDelegate) r72.getValue()).f53218h.filter(new gjg.e(new gn.a(23), 25));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter2), null, new gq1.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.L.getValue()).d.f121375b), null, new g(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
