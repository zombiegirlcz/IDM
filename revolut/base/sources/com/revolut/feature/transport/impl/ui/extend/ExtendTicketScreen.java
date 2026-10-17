package com.revolut.feature.transport.impl.ui.extend;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.transport.api.R$string;
import com.revolut.feature.transport.impl.ui.extend.ExtendTicketScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import efm.r;
import hvf.g;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import vo8.b;
import vrl.i0;
import vrl.v0;
import vvf.c;
import vvf.d;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/impl/ui/extend/ExtendTicketScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Lvvf/h;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExtendTicketScreen extends ViewController<Object> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ExtendTicketScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final h O;
    public final int P;
    public final Object Q;
    public final Object R;

    public ExtendTicketScreen(ExtendTicketScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new b(10));
        this.L = w.y0(new b(11));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: vvf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExtendTicketScreen f292531b;

            {
                this.f292531b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ExtendTicketScreen extendTicketScreen = this.f292531b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ExtendTicketScreen.S;
                        return new SelectableDelegate((RowDelegate) extendTicketScreen.K.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = ExtendTicketScreen.S;
                        ExtendTicketScreen extendTicketScreen2 = this.f292531b;
                        return dli.f.a(extendTicketScreen2, (g) extendTicketScreen2.R.getValue(), v.k((RowDelegate) extendTicketScreen2.K.getValue(), (SelectableDelegate) extendTicketScreen2.M.getValue(), (LargeActionButtonDelegate) extendTicketScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ExtendTicketScreen.S;
                        return (g) ((hvf.g) extendTicketScreen.Q.getValue()).f155905c.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: vvf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExtendTicketScreen f292531b;

            {
                this.f292531b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ExtendTicketScreen extendTicketScreen = this.f292531b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ExtendTicketScreen.S;
                        return new SelectableDelegate((RowDelegate) extendTicketScreen.K.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = ExtendTicketScreen.S;
                        ExtendTicketScreen extendTicketScreen2 = this.f292531b;
                        return dli.f.a(extendTicketScreen2, (g) extendTicketScreen2.R.getValue(), v.k((RowDelegate) extendTicketScreen2.K.getValue(), (SelectableDelegate) extendTicketScreen2.M.getValue(), (LargeActionButtonDelegate) extendTicketScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ExtendTicketScreen.S;
                        return (g) ((hvf.g) extendTicketScreen.Q.getValue()).f155905c.get();
                }
            }
        });
        this.O = s.t(this, vvf.b.f);
        this.P = R$layout.screen_recycler_navbar_nextbutton;
        this.Q = w.y0(new vqd.b(this, inputData, 16));
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: vvf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExtendTicketScreen f292531b;

            {
                this.f292531b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ExtendTicketScreen extendTicketScreen = this.f292531b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ExtendTicketScreen.S;
                        return new SelectableDelegate((RowDelegate) extendTicketScreen.K.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = ExtendTicketScreen.S;
                        ExtendTicketScreen extendTicketScreen2 = this.f292531b;
                        return dli.f.a(extendTicketScreen2, (g) extendTicketScreen2.R.getValue(), v.k((RowDelegate) extendTicketScreen2.K.getValue(), (SelectableDelegate) extendTicketScreen2.M.getValue(), (LargeActionButtonDelegate) extendTicketScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ExtendTicketScreen.S;
                        return (g) ((hvf.g) extendTicketScreen.Q.getValue()).f155905c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        vvf.h uiState = (vvf.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f292535b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (vvf.g) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.transport_ticket_extend_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transport_ticket_extend_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.transport_ticket_extend_description, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.transport_ticket_extend_action, null, null, 14));
        largeActionButton.setLoadingButtonTag("EXTEND_BUTTON_LOADING_TAG");
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        r rVarFilter = ((RowDelegate) this.K.getValue()).f53218h.filter(new v0(21, new i0(26)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SelectableDelegate) this.M.getValue()).r()), null, new vvf.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, continuation, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
