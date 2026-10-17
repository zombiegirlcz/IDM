package com.revolut.feature.customer_present.tips.impl.screen.select_tip;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.n6;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.customer_present.tips.impl.R$string;
import com.revolut.feature.customer_present.tips.impl.screen.select_tip.SelectTipScreen;
import com.revolut.feature.customer_present.tips.impl.screen.select_tip.SelectTipScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import g06.b;
import g06.c;
import g06.d;
import g06.f;
import g06.i;
import jii.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/customer_present/tips/impl/screen/select_tip/SelectTipScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lg06/f;", "Ldli/a;", "Lg06/i;", "feature_customer_present_tips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectTipScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(SelectTipScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final SelectTipScreenContract$InputData K;
    public final LargeActionButtonDelegate L;
    public final h M;
    public final Object N;
    public final Object O;
    public final int P;
    public final Object Q;

    public SelectTipScreen(SelectTipScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new LargeActionButtonDelegate();
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: g06.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectTipScreen f139351b;

            {
                this.f139351b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SelectTipScreen selectTipScreen = this.f139351b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SelectTipScreen.R;
                        return (h) ((c06.e) selectTipScreen.O.getValue()).f20180c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SelectTipScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(selectTipScreen.m2()).a().get(c06.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c06.c.class, " is not found"));
                        }
                        c06.c cVar = ((c06.c) aVar2.b()).f20175c;
                        SelectTipScreenContract$InputData selectTipScreenContract$InputData = selectTipScreen.K;
                        selectTipScreenContract$InputData.getClass();
                        return new c06.e(cVar, selectTipScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SelectTipScreen.R;
                        SelectTipScreen selectTipScreen2 = this.f139351b;
                        return dli.f.a(selectTipScreen2, selectTipScreen2.R2(), u.c(selectTipScreen2.L), selectTipScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: g06.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectTipScreen f139351b;

            {
                this.f139351b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SelectTipScreen selectTipScreen = this.f139351b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelectTipScreen.R;
                        return (h) ((c06.e) selectTipScreen.O.getValue()).f20180c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SelectTipScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(selectTipScreen.m2()).a().get(c06.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c06.c.class, " is not found"));
                        }
                        c06.c cVar = ((c06.c) aVar2.b()).f20175c;
                        SelectTipScreenContract$InputData selectTipScreenContract$InputData = selectTipScreen.K;
                        selectTipScreenContract$InputData.getClass();
                        return new c06.e(cVar, selectTipScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SelectTipScreen.R;
                        SelectTipScreen selectTipScreen2 = this.f139351b;
                        return dli.f.a(selectTipScreen2, selectTipScreen2.R2(), u.c(selectTipScreen2.L), selectTipScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        this.P = R$layout.screen_recycler_navbar_action_footer;
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: g06.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectTipScreen f139351b;

            {
                this.f139351b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SelectTipScreen selectTipScreen = this.f139351b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelectTipScreen.R;
                        return (h) ((c06.e) selectTipScreen.O.getValue()).f20180c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SelectTipScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(selectTipScreen.m2()).a().get(c06.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c06.c.class, " is not found"));
                        }
                        c06.c cVar = ((c06.c) aVar2.b()).f20175c;
                        SelectTipScreenContract$InputData selectTipScreenContract$InputData = selectTipScreen.K;
                        selectTipScreenContract$InputData.getClass();
                        return new c06.e(cVar, selectTipScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SelectTipScreen.R;
                        SelectTipScreen selectTipScreen2 = this.f139351b;
                        return dli.f.a(selectTipScreen2, selectTipScreen2.R2(), u.c(selectTipScreen2.L), selectTipScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c06.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.customer_present_tipping_add_tip_title, null, null, 14), null);
        int i = R$string.customer_present_tipping_common_total;
        SelectTipScreenContract$InputData selectTipScreenContract$InputData = this.K;
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(i, u.c(new MoneyClause(selectTipScreenContract$InputData.f71621a, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8));
        Integer numValueOf = Integer.valueOf(ofm.q.k(q2()));
        if (!selectTipScreenContract$InputData.f71622b) {
            numValueOf = null;
        }
        navBarWithToolbar.setNavigationButtonIcon(numValueOf);
        navBarWithToolbar.setDescriptionVisible(true);
        d3().f174533b.setModel(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.customer_present_tipping_no_tips_button_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.L.d.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new c(this, null, 1), 3);
    }

    public final k d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g06.h R2() {
        return (g06.h) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
