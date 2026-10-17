package com.revolut.feature.bank_account_switching.impl.ui.request_list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.ui.request_list.RequestListScreen;
import com.revolut.feature.bank_account_switching.impl.ui.request_list.RequestListScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import to2.b;
import to2.c;
import to2.d;
import to2.k;
import to2.l;
import tx0.t3;
import vc.s;
import vn2.z;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/request_list/RequestListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lto2/k;", "Ldli/a;", "Lto2/l;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RequestListScreen extends ViewController<k> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(RequestListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final RequestListScreenContract$InputData K;
    public final int L;
    public final ActionsDelegate M;
    public final FullScreenStateDelegate N;
    public final RowDelegate O;
    public final Object P;
    public final h Q;
    public final Object R;
    public final Object S;

    public RequestListScreen(RequestListScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = new ActionsDelegate();
        this.N = new FullScreenStateDelegate();
        this.O = new RowDelegate(null, null, 7);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: to2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestListScreen f272497b;

            {
                this.f272497b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RequestListScreen requestListScreen = this.f272497b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RequestListScreen.T;
                        RequestListScreen requestListScreen2 = this.f272497b;
                        return dli.f.a(requestListScreen2, requestListScreen2.R2(), v.k(requestListScreen2.M, new ListSubheaderDelegate(), requestListScreen2.O, requestListScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RequestListScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(requestListScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        RequestListScreenContract$InputData requestListScreenContract$InputData = requestListScreen.K;
                        requestListScreenContract$InputData.getClass();
                        return new z(hVar, requestListScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = RequestListScreen.T;
                        return (m) ((z) requestListScreen.R.getValue()).d.get();
                }
            }
        });
        this.Q = s.t(this, b.f);
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: to2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestListScreen f272497b;

            {
                this.f272497b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RequestListScreen requestListScreen = this.f272497b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RequestListScreen.T;
                        RequestListScreen requestListScreen2 = this.f272497b;
                        return dli.f.a(requestListScreen2, requestListScreen2.R2(), v.k(requestListScreen2.M, new ListSubheaderDelegate(), requestListScreen2.O, requestListScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RequestListScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(requestListScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        RequestListScreenContract$InputData requestListScreenContract$InputData = requestListScreen.K;
                        requestListScreenContract$InputData.getClass();
                        return new z(hVar, requestListScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = RequestListScreen.T;
                        return (m) ((z) requestListScreen.R.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: to2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestListScreen f272497b;

            {
                this.f272497b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RequestListScreen requestListScreen = this.f272497b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RequestListScreen.T;
                        RequestListScreen requestListScreen2 = this.f272497b;
                        return dli.f.a(requestListScreen2, requestListScreen2.R2(), v.k(requestListScreen2.M, new ListSubheaderDelegate(), requestListScreen2.O, requestListScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RequestListScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(requestListScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        RequestListScreenContract$InputData requestListScreenContract$InputData = requestListScreen.K;
                        requestListScreenContract$InputData.getClass();
                        return new z(hVar, requestListScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = RequestListScreen.T;
                        return (m) ((z) requestListScreen.R.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        if (uiState.f272505b) {
            d3().f174539b.I0(t3.PROFILE, true);
        } else {
            d3().f174539b.l0();
        }
        d3().f174539b.setSecondDescriptionText(uiState.f272506c);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        R2().C2(to2.h.f272501a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.account_switch_feature_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.account_switch_feature_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52371h.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f51611c.f121375b), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f53218h), null, new to2.e(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final to2.m R2() {
        return (to2.m) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
