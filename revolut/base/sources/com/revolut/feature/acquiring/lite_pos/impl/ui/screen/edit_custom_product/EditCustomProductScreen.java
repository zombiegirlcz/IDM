package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.CellIncrementDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.impl.R$id;
import com.revolut.feature.acquiring.lite_pos.impl.R$layout;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.EditCustomProductScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import oa2.b;
import oe1.c;
import oe1.d;
import oe1.f;
import oe1.i;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/edit_custom_product/EditCustomProductScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Loe1/i;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EditCustomProductScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(EditCustomProductScreen.class, "binding", "getBinding()Lcom/revolut/feature/acquiring/lite_pos/impl/databinding/ScreenEditCustomCartItemBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final AmountEditDelegate O;
    public final InputTextDelegate P;
    public final CellIncrementDelegate Q;
    public final Object R;

    public EditCustomProductScreen(EditCustomProductScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_edit_custom_cart_item;
        this.L = s.t(this, c.f);
        this.M = w.y0(new b(this, inputData, 7));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: oe1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditCustomProductScreen f224506b;

            {
                this.f224506b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = EditCustomProductScreen.S;
                        return (h) ((ld1.i) this.f224506b.M.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = EditCustomProductScreen.S;
                        EditCustomProductScreen editCustomProductScreen = this.f224506b;
                        return dli.f.a(editCustomProductScreen, editCustomProductScreen.d(), v.k(editCustomProductScreen.O, editCustomProductScreen.P, editCustomProductScreen.Q), R$id.editCustomCartItemScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = new AmountEditDelegate(new oa4.c(this, 14));
        this.P = new InputTextDelegate(null);
        this.Q = new CellIncrementDelegate();
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: oe1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditCustomProductScreen f224506b;

            {
                this.f224506b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EditCustomProductScreen.S;
                        return (h) ((ld1.i) this.f224506b.M.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = EditCustomProductScreen.S;
                        EditCustomProductScreen editCustomProductScreen = this.f224506b;
                        return dli.f.a(editCustomProductScreen, editCustomProductScreen.d(), v.k(editCustomProductScreen.O, editCustomProductScreen.P, editCustomProductScreen.Q), R$id.editCustomCartItemScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f172922c.setMenuItems(uiState.f224512b);
        d3().f172921b.setEnabled(uiState.f224513c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ld1.i) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f172922c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.product_catalogue_flow_products_edit_product_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f172921b.setText(new TextLocalisedClause(R$string.product_catalogue_common_action_done, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f172922c;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.o.f57403b), new o95.c(this, continuation, 13), 3);
        ViewController.P2(this, rd0.e.b(d3().f172921b.o), new d(this, continuation, 1), 3);
        InputTextDelegate inputTextDelegate = this.P;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new oe1.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f52575g.f121375b), new f(this, null), 3);
        CellIncrementDelegate cellIncrementDelegate = this.Q;
        ViewController.P2(this, rd0.e.b(cellIncrementDelegate.f51948c), new d(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(cellIncrementDelegate.d), new d(this, continuation, 3), 3);
    }

    public final jd1.f d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jd1.f) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final oe1.h d() {
        return (oe1.h) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
