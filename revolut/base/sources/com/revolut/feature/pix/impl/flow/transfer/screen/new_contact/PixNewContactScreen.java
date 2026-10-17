package com.revolut.feature.pix.impl.flow.transfer.screen.new_contact;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.api.navigation.PixTransferNavigation$InputData;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.transfer.screen.new_contact.PixNewContactScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p8a.g0;
import qba.b;
import qba.c;
import qca.d;
import qca.f;
import qca.m;
import qca.n;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/transfer/screen/new_contact/PixNewContactScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqca/m;", "Ldli/a;", "Lqca/o;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixNewContactScreen extends ViewController<m> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PixNewContactScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public PixNewContactScreen(PixTransferNavigation$InputData.NewContact inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: qca.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixNewContactScreen f244670b;

            {
                this.f244670b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = PixNewContactScreen.R;
                        PixNewContactScreen pixNewContactScreen = this.f244670b;
                        return dli.f.a(pixNewContactScreen, pixNewContactScreen.R2(), u.c((InputTextDelegate) pixNewContactScreen.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = PixNewContactScreen.R;
                        return (n) ((g0) ((rca.a) this.f244670b.M.getValue())).f.get();
                }
            }
        });
        this.M = w.y0(new b(this, inputData, 4));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: qca.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixNewContactScreen f244670b;

            {
                this.f244670b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PixNewContactScreen.R;
                        PixNewContactScreen pixNewContactScreen = this.f244670b;
                        return dli.f.a(pixNewContactScreen, pixNewContactScreen.R2(), u.c((InputTextDelegate) pixNewContactScreen.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = PixNewContactScreen.R;
                        return (n) ((g0) ((rca.a) this.f244670b.M.getValue())).f.get();
                }
            }
        });
        this.O = s.t(this, qca.b.f);
        this.P = w.y0(new c(10));
        this.Q = w.y0(new c(11));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        qca.o uiState = (qca.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f244679b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (rca.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.pix_area_contacts_placeholder, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
        largeActionButton.setLoadingButtonTag("NEW_CONTACT_BUTTON_LOADING_TAG");
        ((j60.a) ((g0) ((rca.a) this.M.getValue())).d.get()).d(u.c((RowDelegate) this.Q.getValue()));
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new qca.c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new qca.c(this, continuation, 1), 3);
        ?? r56 = this.P;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).i.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).e.f121375b), null, new qca.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.Q.getValue()).f53218h), null, new f(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n R2() {
        return (n) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
