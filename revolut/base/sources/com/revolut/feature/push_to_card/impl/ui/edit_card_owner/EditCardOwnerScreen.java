package com.revolut.feature.push_to_card.impl.ui.edit_card_owner;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.push_to_card.impl.R$string;
import com.revolut.feature.push_to_card.impl.ui.edit_card_owner.EditCardOwnerScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import hl7.ma;
import hsa.b;
import hsa.c;
import hsa.j;
import hsa.k;
import jqa.d;
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

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/impl/ui/edit_card_owner/EditCardOwnerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lhsa/k;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EditCardOwnerScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(EditCardOwnerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object K;
    public final Object L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;

    public EditCardOwnerScreen(EditCardOwnerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new ma(22));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: hsa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditCardOwnerScreen f155013b;

            {
                this.f155013b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = EditCardOwnerScreen.Q;
                        EditCardOwnerScreen editCardOwnerScreen = this.f155013b;
                        return dli.f.a(editCardOwnerScreen, (j) editCardOwnerScreen.P.getValue(), u.c((InputTextDelegate) editCardOwnerScreen.K.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = EditCardOwnerScreen.Q;
                        return (j) ((jqa.d) this.f155013b.O.getValue()).f177539c.get();
                }
            }
        });
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        this.N = s.t(this, b.f);
        this.O = w.y0(new hl6.b(this, inputData, 13));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: hsa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditCardOwnerScreen f155013b;

            {
                this.f155013b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EditCardOwnerScreen.Q;
                        EditCardOwnerScreen editCardOwnerScreen = this.f155013b;
                        return dli.f.a(editCardOwnerScreen, (j) editCardOwnerScreen.P.getValue(), u.c((InputTextDelegate) editCardOwnerScreen.K.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = EditCardOwnerScreen.Q;
                        return (j) ((jqa.d) this.f155013b.O.getValue()).f177539c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f155021b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (j) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.edit_card_recipient_header_title, null, null, 14), null);
        d3().f174565c.setToolbarTitle(new TextLocalisedClause(R$string.edit_card_recipient_header_title, null, null, 14));
        d3().f174564b.setText(new TextLocalisedClause(R$string.push2card_new_recipient_save_button, null, null, 14));
        d3().f174564b.setLoadingButtonTag("EDIT_RECIPIENT_SAVE_BUTTON_TAG");
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) this.K.getValue()).e.f121375b), new hsa.d(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
