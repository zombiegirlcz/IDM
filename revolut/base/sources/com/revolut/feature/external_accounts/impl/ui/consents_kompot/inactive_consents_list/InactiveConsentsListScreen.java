package com.revolut.feature.external_accounts.impl.ui.consents_kompot.inactive_consents_list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.inactive_consents_list.InactiveConsentsListScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.inactive_consents_list.InactiveConsentsListScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tk5.c;
import tl6.b;
import tl6.d;
import tl6.f;
import tl6.g;
import tx0.j0;
import vc.s;
import xf6.n2;
import xf6.w2;
import xf6.x2;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/inactive_consents_list/InactiveConsentsListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/external_accounts/impl/ui/consents_kompot/inactive_consents_list/InactiveConsentsListScreenContract$OutputData;", "Ldli/a;", "Ltl6/g;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InactiveConsentsListScreen extends ViewController<InactiveConsentsListScreenContract$OutputData> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(InactiveConsentsListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final InactiveConsentsListScreenContract$InputData K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public InactiveConsentsListScreen(InactiveConsentsListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = new RowDelegate(null, null, 7);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: tl6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InactiveConsentsListScreen f272001b;

            {
                this.f272001b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InactiveConsentsListScreen inactiveConsentsListScreen = this.f272001b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InactiveConsentsListScreen.R;
                        qji.b bVarU2 = inactiveConsentsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.consents_kompot.inactive_consents_list.di.InactiveConsentsListScreenInjector");
                        x2 x2Var = (x2) bVarU2;
                        w2 w2Var = x2Var.f305161a;
                        x2 x2Var2 = x2Var.f305162b;
                        InactiveConsentsListScreenContract$InputData inactiveConsentsListScreenContract$InputData = inactiveConsentsListScreen.K;
                        inactiveConsentsListScreenContract$InputData.getClass();
                        return new n2(w2Var, x2Var2, inactiveConsentsListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InactiveConsentsListScreen.R;
                        return (f) ((n2) inactiveConsentsListScreen.O.getValue()).f304968c.get();
                    default:
                        KProperty[] kPropertyArr3 = InactiveConsentsListScreen.R;
                        InactiveConsentsListScreen inactiveConsentsListScreen2 = this.f272001b;
                        return dli.f.a(inactiveConsentsListScreen2, (f) inactiveConsentsListScreen2.P.getValue(), v.k(inactiveConsentsListScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: tl6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InactiveConsentsListScreen f272001b;

            {
                this.f272001b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InactiveConsentsListScreen inactiveConsentsListScreen = this.f272001b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InactiveConsentsListScreen.R;
                        qji.b bVarU2 = inactiveConsentsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.consents_kompot.inactive_consents_list.di.InactiveConsentsListScreenInjector");
                        x2 x2Var = (x2) bVarU2;
                        w2 w2Var = x2Var.f305161a;
                        x2 x2Var2 = x2Var.f305162b;
                        InactiveConsentsListScreenContract$InputData inactiveConsentsListScreenContract$InputData = inactiveConsentsListScreen.K;
                        inactiveConsentsListScreenContract$InputData.getClass();
                        return new n2(w2Var, x2Var2, inactiveConsentsListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InactiveConsentsListScreen.R;
                        return (f) ((n2) inactiveConsentsListScreen.O.getValue()).f304968c.get();
                    default:
                        KProperty[] kPropertyArr3 = InactiveConsentsListScreen.R;
                        InactiveConsentsListScreen inactiveConsentsListScreen2 = this.f272001b;
                        return dli.f.a(inactiveConsentsListScreen2, (f) inactiveConsentsListScreen2.P.getValue(), v.k(inactiveConsentsListScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: tl6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InactiveConsentsListScreen f272001b;

            {
                this.f272001b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InactiveConsentsListScreen inactiveConsentsListScreen = this.f272001b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InactiveConsentsListScreen.R;
                        qji.b bVarU2 = inactiveConsentsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.consents_kompot.inactive_consents_list.di.InactiveConsentsListScreenInjector");
                        x2 x2Var = (x2) bVarU2;
                        w2 w2Var = x2Var.f305161a;
                        x2 x2Var2 = x2Var.f305162b;
                        InactiveConsentsListScreenContract$InputData inactiveConsentsListScreenContract$InputData = inactiveConsentsListScreen.K;
                        inactiveConsentsListScreenContract$InputData.getClass();
                        return new n2(w2Var, x2Var2, inactiveConsentsListScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = InactiveConsentsListScreen.R;
                        return (f) ((n2) inactiveConsentsListScreen.O.getValue()).f304968c.get();
                    default:
                        KProperty[] kPropertyArr3 = InactiveConsentsListScreen.R;
                        InactiveConsentsListScreen inactiveConsentsListScreen2 = this.f272001b;
                        return dli.f.a(inactiveConsentsListScreen2, (f) inactiveConsentsListScreen2.P.getValue(), v.k(inactiveConsentsListScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n2) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        InactiveConsentsListScreenContract$InputData inactiveConsentsListScreenContract$InputData = this.K;
        navBarWithToolbar.setToolbarTitle(new TextClause(inactiveConsentsListScreenContract$InputData.f72789a.f60396b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        navBarWithToolbar.setTitle(new TextClause(inactiveConsentsListScreenContract$InputData.f72789a.f60396b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new c(this, null, 2), 3);
        ViewController.P2(this, new t9l.f(rd0.e.b(this.N.f53218h), 9), new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
