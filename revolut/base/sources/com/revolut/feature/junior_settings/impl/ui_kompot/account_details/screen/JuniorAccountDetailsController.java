package com.revolut.feature.junior_settings.impl.ui_kompot.account_details.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bo8.c;
import bo8.i;
import bo8.n;
import bo8.p;
import bo8.r;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ProfileCardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.junior_settings.impl.R$string;
import com.revolut.feature.junior_settings.impl.ui_kompot.account_details.screen.JuniorAccountDetailsController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mn8.f;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/account_details/screen/JuniorAccountDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbo8/i;", "Ldli/a;", "Lbo8/n;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorAccountDetailsController extends ViewController<i> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(JuniorAccountDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final c K;
    public final h L;
    public final RowDelegate M;
    public final ProfileCardDelegate N;
    public final FullScreenStateDelegate O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public JuniorAccountDetailsController(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, p.f);
        this.M = new RowDelegate(null, null, 7);
        this.N = new ProfileCardDelegate();
        this.O = new FullScreenStateDelegate();
        this.P = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: bo8.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAccountDetailsController f17323b;

            {
                this.f17323b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorAccountDetailsController juniorAccountDetailsController = this.f17323b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorAccountDetailsController.T;
                        JuniorAccountDetailsController juniorAccountDetailsController2 = this.f17323b;
                        return dli.f.a(juniorAccountDetailsController2, juniorAccountDetailsController2.R2(), zhm.v.k(juniorAccountDetailsController2.M, juniorAccountDetailsController2.N, juniorAccountDetailsController2.O, new ListCellDelegate(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorAccountDetailsController.T;
                        qji.b bVarU2 = juniorAccountDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_settings.impl.ui_kompot.account_details.screen.di.JuniorAccountDetailsControllerComponent.Injector");
                        mn8.g gVar = (mn8.g) bVarU2;
                        mn8.o oVar = gVar.f207430b;
                        mn8.g gVar2 = gVar.f207431c;
                        c cVar = juniorAccountDetailsController.K;
                        cVar.getClass();
                        return new mn8.f(oVar, gVar2, cVar);
                    default:
                        KProperty[] kPropertyArr3 = JuniorAccountDetailsController.T;
                        return (m) ((mn8.f) juniorAccountDetailsController.R.getValue()).f207428c.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: bo8.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAccountDetailsController f17323b;

            {
                this.f17323b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorAccountDetailsController juniorAccountDetailsController = this.f17323b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorAccountDetailsController.T;
                        JuniorAccountDetailsController juniorAccountDetailsController2 = this.f17323b;
                        return dli.f.a(juniorAccountDetailsController2, juniorAccountDetailsController2.R2(), zhm.v.k(juniorAccountDetailsController2.M, juniorAccountDetailsController2.N, juniorAccountDetailsController2.O, new ListCellDelegate(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorAccountDetailsController.T;
                        qji.b bVarU2 = juniorAccountDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_settings.impl.ui_kompot.account_details.screen.di.JuniorAccountDetailsControllerComponent.Injector");
                        mn8.g gVar = (mn8.g) bVarU2;
                        mn8.o oVar = gVar.f207430b;
                        mn8.g gVar2 = gVar.f207431c;
                        c cVar = juniorAccountDetailsController.K;
                        cVar.getClass();
                        return new mn8.f(oVar, gVar2, cVar);
                    default:
                        KProperty[] kPropertyArr3 = JuniorAccountDetailsController.T;
                        return (m) ((mn8.f) juniorAccountDetailsController.R.getValue()).f207428c.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: bo8.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAccountDetailsController f17323b;

            {
                this.f17323b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorAccountDetailsController juniorAccountDetailsController = this.f17323b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorAccountDetailsController.T;
                        JuniorAccountDetailsController juniorAccountDetailsController2 = this.f17323b;
                        return dli.f.a(juniorAccountDetailsController2, juniorAccountDetailsController2.R2(), zhm.v.k(juniorAccountDetailsController2.M, juniorAccountDetailsController2.N, juniorAccountDetailsController2.O, new ListCellDelegate(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorAccountDetailsController.T;
                        qji.b bVarU2 = juniorAccountDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_settings.impl.ui_kompot.account_details.screen.di.JuniorAccountDetailsControllerComponent.Injector");
                        mn8.g gVar = (mn8.g) bVarU2;
                        mn8.o oVar = gVar.f207430b;
                        mn8.g gVar2 = gVar.f207431c;
                        c cVar = juniorAccountDetailsController.K;
                        cVar.getClass();
                        return new mn8.f(oVar, gVar2, cVar);
                    default:
                        KProperty[] kPropertyArr3 = JuniorAccountDetailsController.T;
                        return (m) ((mn8.f) juniorAccountDetailsController.R.getValue()).f207428c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((n) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.junior_account_details_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.junior_account_details_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new bf5.a(this, continuation, 20), 3);
        ViewController.P2(this, rd0.e.b(this.O.f.f121375b), new bo8.q(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new r(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.e.f121375b), new bi2.n(this, continuation, 12), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final bo8.m R2() {
        return (bo8.m) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
