package com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.dropdown_searchable;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import com.revolut.feature.apm.bills.core.api.model.form.DropdownField;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.dropdown_searchable.DropdownSearchableSelectionScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.dropdown_searchable.DropdownSearchableSelectionScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lf9.x;
import lf9.y;
import o95.c;
import ocb.d;
import og9.b;
import og9.f;
import og9.g;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/fields/dropdown_searchable/DropdownSearchableSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Log9/f;", "Ldli/a;", "Log9/h;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DropdownSearchableSelectionScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(DropdownSearchableSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final DropdownSearchableSelectionScreenContract$InputData K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final FullScreenStateDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public DropdownSearchableSelectionScreen(DropdownSearchableSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = new FullScreenStateDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: og9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DropdownSearchableSelectionScreen f225057b;

            {
                this.f225057b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DropdownSearchableSelectionScreen dropdownSearchableSelectionScreen = this.f225057b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DropdownSearchableSelectionScreen.S;
                        DropdownSearchableSelectionScreen dropdownSearchableSelectionScreen2 = this.f225057b;
                        return dli.f.a(dropdownSearchableSelectionScreen2, (g) dropdownSearchableSelectionScreen2.R.getValue(), v.k(dropdownSearchableSelectionScreen2.N, dropdownSearchableSelectionScreen2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DropdownSearchableSelectionScreen.S;
                        qji.b bVarU2 = dropdownSearchableSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.dropdown_searchable.di.DropdownSearchableSelectionScreenInjector");
                        x xVar = (x) ((pg9.a) bVarU2).c().mo3808a(dropdownSearchableSelectionScreen);
                        DropdownSearchableSelectionScreenContract$InputData dropdownSearchableSelectionScreenContract$InputData = dropdownSearchableSelectionScreen.K;
                        switch (xVar.f194811a) {
                            case 0:
                                dropdownSearchableSelectionScreenContract$InputData.getClass();
                                xVar.d = dropdownSearchableSelectionScreenContract$InputData;
                                break;
                            case 1:
                                dropdownSearchableSelectionScreenContract$InputData.getClass();
                                xVar.d = dropdownSearchableSelectionScreenContract$InputData;
                                break;
                            default:
                                dropdownSearchableSelectionScreenContract$InputData.getClass();
                                xVar.d = dropdownSearchableSelectionScreenContract$InputData;
                                break;
                        }
                        return (y) xVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = DropdownSearchableSelectionScreen.S;
                        y yVar = (y) dropdownSearchableSelectionScreen.Q.getValue();
                        switch (yVar.f194814a) {
                            case 0:
                                return (g) yVar.d.get();
                            case 1:
                                return (g) yVar.d.get();
                            default:
                                return (g) yVar.d.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: og9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DropdownSearchableSelectionScreen f225057b;

            {
                this.f225057b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DropdownSearchableSelectionScreen dropdownSearchableSelectionScreen = this.f225057b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DropdownSearchableSelectionScreen.S;
                        DropdownSearchableSelectionScreen dropdownSearchableSelectionScreen2 = this.f225057b;
                        return dli.f.a(dropdownSearchableSelectionScreen2, (g) dropdownSearchableSelectionScreen2.R.getValue(), v.k(dropdownSearchableSelectionScreen2.N, dropdownSearchableSelectionScreen2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DropdownSearchableSelectionScreen.S;
                        qji.b bVarU2 = dropdownSearchableSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.dropdown_searchable.di.DropdownSearchableSelectionScreenInjector");
                        x xVar = (x) ((pg9.a) bVarU2).c().mo3808a(dropdownSearchableSelectionScreen);
                        DropdownSearchableSelectionScreenContract$InputData dropdownSearchableSelectionScreenContract$InputData = dropdownSearchableSelectionScreen.K;
                        switch (xVar.f194811a) {
                            case 0:
                                dropdownSearchableSelectionScreenContract$InputData.getClass();
                                xVar.d = dropdownSearchableSelectionScreenContract$InputData;
                                break;
                            case 1:
                                dropdownSearchableSelectionScreenContract$InputData.getClass();
                                xVar.d = dropdownSearchableSelectionScreenContract$InputData;
                                break;
                            default:
                                dropdownSearchableSelectionScreenContract$InputData.getClass();
                                xVar.d = dropdownSearchableSelectionScreenContract$InputData;
                                break;
                        }
                        return (y) xVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = DropdownSearchableSelectionScreen.S;
                        y yVar = (y) dropdownSearchableSelectionScreen.Q.getValue();
                        switch (yVar.f194814a) {
                            case 0:
                                return (g) yVar.d.get();
                            case 1:
                                return (g) yVar.d.get();
                            default:
                                return (g) yVar.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: og9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DropdownSearchableSelectionScreen f225057b;

            {
                this.f225057b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DropdownSearchableSelectionScreen dropdownSearchableSelectionScreen = this.f225057b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DropdownSearchableSelectionScreen.S;
                        DropdownSearchableSelectionScreen dropdownSearchableSelectionScreen2 = this.f225057b;
                        return dli.f.a(dropdownSearchableSelectionScreen2, (g) dropdownSearchableSelectionScreen2.R.getValue(), v.k(dropdownSearchableSelectionScreen2.N, dropdownSearchableSelectionScreen2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DropdownSearchableSelectionScreen.S;
                        qji.b bVarU2 = dropdownSearchableSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.dropdown_searchable.di.DropdownSearchableSelectionScreenInjector");
                        x xVar = (x) ((pg9.a) bVarU2).c().mo3808a(dropdownSearchableSelectionScreen);
                        DropdownSearchableSelectionScreenContract$InputData dropdownSearchableSelectionScreenContract$InputData = dropdownSearchableSelectionScreen.K;
                        switch (xVar.f194811a) {
                            case 0:
                                dropdownSearchableSelectionScreenContract$InputData.getClass();
                                xVar.d = dropdownSearchableSelectionScreenContract$InputData;
                                break;
                            case 1:
                                dropdownSearchableSelectionScreenContract$InputData.getClass();
                                xVar.d = dropdownSearchableSelectionScreenContract$InputData;
                                break;
                            default:
                                dropdownSearchableSelectionScreenContract$InputData.getClass();
                                xVar.d = dropdownSearchableSelectionScreenContract$InputData;
                                break;
                        }
                        return (y) xVar.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = DropdownSearchableSelectionScreen.S;
                        y yVar = (y) dropdownSearchableSelectionScreen.Q.getValue();
                        switch (yVar.f194814a) {
                            case 0:
                                return (g) yVar.d.get();
                            case 1:
                                return (g) yVar.d.get();
                            default:
                                return (g) yVar.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((og9.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        DropdownSearchableSelectionScreenContract$InputData dropdownSearchableSelectionScreenContract$InputData = this.K;
        navBarWithToolbar.setTitle(new TextClause(dropdownSearchableSelectionScreenContract$InputData.f78713a.f61380b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        DropdownField dropdownField = dropdownSearchableSelectionScreenContract$InputData.f78713a;
        navBarWithToolbar.setToolbarTitle(new TextClause(dropdownField.f61380b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setSearchButtonActive(true);
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = dropdownField.d;
        if (billFormFieldAttributes == null || (str = billFormFieldAttributes.e) == null) {
            return;
        }
        navBarWithToolbar.setHint(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new d(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59409p.f57337m), new c(this, continuation, 16), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new og9.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new og9.d(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
