package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellIncrementDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.impl.R$id;
import com.revolut.feature.acquiring.lite_pos.impl.R$layout;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.EditCatalogueProductEntryScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.EditCatalogueProductEntryScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ld1.l;
import m75.i;
import me1.b;
import me1.c;
import me1.f;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/edit_catalogue_product_entry/EditCatalogueProductEntryScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lme1/f;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EditCatalogueProductEntryScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(EditCatalogueProductEntryScreen.class, "binding", "getBinding()Lcom/revolut/feature/acquiring/lite_pos/impl/databinding/ScreenEditCatalogueProductEntryBinding;", 0))};
    public final EditCatalogueProductEntryScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final RowDelegate P;
    public final CellIncrementDelegate Q;
    public final Object R;

    public EditCatalogueProductEntryScreen(EditCatalogueProductEntryScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_edit_catalogue_product_entry;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: me1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditCatalogueProductEntryScreen f204592b;

            {
                this.f204592b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EditCatalogueProductEntryScreen editCatalogueProductEntryScreen = this.f204592b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EditCatalogueProductEntryScreen.S;
                        qji.b bVarU2 = editCatalogueProductEntryScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.di.EditCatalogueProductEntryScreenInjector");
                        ld1.w wVar = (ld1.w) bVarU2;
                        l lVar = wVar.f194006a;
                        ld1.w wVar2 = wVar.f194007b;
                        EditCatalogueProductEntryScreenContract$InputData editCatalogueProductEntryScreenContract$InputData = editCatalogueProductEntryScreen.K;
                        editCatalogueProductEntryScreenContract$InputData.getClass();
                        return new ld1.h(lVar, wVar2, editCatalogueProductEntryScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EditCatalogueProductEntryScreen.S;
                        return (e) ((ld1.h) editCatalogueProductEntryScreen.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = EditCatalogueProductEntryScreen.S;
                        EditCatalogueProductEntryScreen editCatalogueProductEntryScreen2 = this.f204592b;
                        return dli.f.a(editCatalogueProductEntryScreen2, editCatalogueProductEntryScreen2.d(), v.k(editCatalogueProductEntryScreen2.P, editCatalogueProductEntryScreen2.Q), R$id.editCatalogueItemEntryScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: me1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditCatalogueProductEntryScreen f204592b;

            {
                this.f204592b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EditCatalogueProductEntryScreen editCatalogueProductEntryScreen = this.f204592b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EditCatalogueProductEntryScreen.S;
                        qji.b bVarU2 = editCatalogueProductEntryScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.di.EditCatalogueProductEntryScreenInjector");
                        ld1.w wVar = (ld1.w) bVarU2;
                        l lVar = wVar.f194006a;
                        ld1.w wVar2 = wVar.f194007b;
                        EditCatalogueProductEntryScreenContract$InputData editCatalogueProductEntryScreenContract$InputData = editCatalogueProductEntryScreen.K;
                        editCatalogueProductEntryScreenContract$InputData.getClass();
                        return new ld1.h(lVar, wVar2, editCatalogueProductEntryScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EditCatalogueProductEntryScreen.S;
                        return (e) ((ld1.h) editCatalogueProductEntryScreen.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = EditCatalogueProductEntryScreen.S;
                        EditCatalogueProductEntryScreen editCatalogueProductEntryScreen2 = this.f204592b;
                        return dli.f.a(editCatalogueProductEntryScreen2, editCatalogueProductEntryScreen2.d(), v.k(editCatalogueProductEntryScreen2.P, editCatalogueProductEntryScreen2.Q), R$id.editCatalogueItemEntryScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new RowDelegate(null, null, 7);
        this.Q = new CellIncrementDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: me1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditCatalogueProductEntryScreen f204592b;

            {
                this.f204592b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EditCatalogueProductEntryScreen editCatalogueProductEntryScreen = this.f204592b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EditCatalogueProductEntryScreen.S;
                        qji.b bVarU2 = editCatalogueProductEntryScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.di.EditCatalogueProductEntryScreenInjector");
                        ld1.w wVar = (ld1.w) bVarU2;
                        l lVar = wVar.f194006a;
                        ld1.w wVar2 = wVar.f194007b;
                        EditCatalogueProductEntryScreenContract$InputData editCatalogueProductEntryScreenContract$InputData = editCatalogueProductEntryScreen.K;
                        editCatalogueProductEntryScreenContract$InputData.getClass();
                        return new ld1.h(lVar, wVar2, editCatalogueProductEntryScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EditCatalogueProductEntryScreen.S;
                        return (e) ((ld1.h) editCatalogueProductEntryScreen.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = EditCatalogueProductEntryScreen.S;
                        EditCatalogueProductEntryScreen editCatalogueProductEntryScreen2 = this.f204592b;
                        return dli.f.a(editCatalogueProductEntryScreen2, editCatalogueProductEntryScreen2.d(), v.k(editCatalogueProductEntryScreen2.P, editCatalogueProductEntryScreen2.Q), R$id.editCatalogueItemEntryScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f172919c.setMenuItems(uiState.f204596b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ld1.h) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f172919c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.product_catalogue_flow_products_edit_product_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f172918b.setText(new TextLocalisedClause(R$string.product_catalogue_common_action_done, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f172919c;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.o.f57403b), new i(this, null, 18), 3);
        ViewController.P2(this, rd0.e.b(d3().f172918b.o), new c(this, null, 1), 3);
        CellIncrementDelegate cellIncrementDelegate = this.Q;
        ViewController.P2(this, rd0.e.b(cellIncrementDelegate.f51948c), new c(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(cellIncrementDelegate.d), new c(this, null, 3), 3);
    }

    public final jd1.e d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jd1.e) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final me1.e d() {
        return (me1.e) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
