package com.revolut.feature.retail.restaurants.impl.ui.customerdetails;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.restaurants.impl.R$string;
import com.revolut.feature.retail.restaurants.impl.ui.customerdetails.CustomerDetailsScreen;
import com.revolut.feature.retail.restaurants.impl.ui.customerdetails.CustomerDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import deb.d;
import deb.f;
import deb.g;
import deb.i;
import deb.k;
import deb.l;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import vdb.c;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/ui/customerdetails/CustomerDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldeb/i;", "Ldli/a;", "Ldeb/l;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomerDetailsScreen extends ViewController<i> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CustomerDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final CustomerDetailsScreenContract$InputData K;
    public final InputTextDelegate L;
    public final PhoneEditorDelegate M;
    public final h N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public CustomerDetailsScreen(CustomerDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new InputTextDelegate(null);
        this.M = new PhoneEditorDelegate();
        this.N = s.t(this, d.f);
        this.O = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: deb.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomerDetailsScreen f113351b;

            {
                this.f113351b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CustomerDetailsScreen customerDetailsScreen = this.f113351b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CustomerDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(customerDetailsScreen.m2()).a().get(vdb.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vdb.j.class, " is not found"));
                        }
                        vdb.j jVar = ((vdb.j) aVar2.b()).i;
                        CustomerDetailsScreenContract$InputData customerDetailsScreenContract$InputData = customerDetailsScreen.K;
                        customerDetailsScreenContract$InputData.getClass();
                        return new vdb.c(jVar, customerDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CustomerDetailsScreen.S;
                        return (k) ((vdb.c) customerDetailsScreen.P.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = CustomerDetailsScreen.S;
                        CustomerDetailsScreen customerDetailsScreen2 = this.f113351b;
                        return dli.f.a(customerDetailsScreen2, customerDetailsScreen2.d(), v.k(customerDetailsScreen2.L, customerDetailsScreen2.M), customerDetailsScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: deb.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomerDetailsScreen f113351b;

            {
                this.f113351b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CustomerDetailsScreen customerDetailsScreen = this.f113351b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CustomerDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(customerDetailsScreen.m2()).a().get(vdb.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vdb.j.class, " is not found"));
                        }
                        vdb.j jVar = ((vdb.j) aVar2.b()).i;
                        CustomerDetailsScreenContract$InputData customerDetailsScreenContract$InputData = customerDetailsScreen.K;
                        customerDetailsScreenContract$InputData.getClass();
                        return new vdb.c(jVar, customerDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CustomerDetailsScreen.S;
                        return (k) ((vdb.c) customerDetailsScreen.P.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = CustomerDetailsScreen.S;
                        CustomerDetailsScreen customerDetailsScreen2 = this.f113351b;
                        return dli.f.a(customerDetailsScreen2, customerDetailsScreen2.d(), v.k(customerDetailsScreen2.L, customerDetailsScreen2.M), customerDetailsScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: deb.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomerDetailsScreen f113351b;

            {
                this.f113351b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CustomerDetailsScreen customerDetailsScreen = this.f113351b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CustomerDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(customerDetailsScreen.m2()).a().get(vdb.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vdb.j.class, " is not found"));
                        }
                        vdb.j jVar = ((vdb.j) aVar2.b()).i;
                        CustomerDetailsScreenContract$InputData customerDetailsScreenContract$InputData = customerDetailsScreen.K;
                        customerDetailsScreenContract$InputData.getClass();
                        return new vdb.c(jVar, customerDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CustomerDetailsScreen.S;
                        return (k) ((vdb.c) customerDetailsScreen.P.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = CustomerDetailsScreen.S;
                        CustomerDetailsScreen customerDetailsScreen2 = this.f113351b;
                        return dli.f.a(customerDetailsScreen2, customerDetailsScreen2.d(), v.k(customerDetailsScreen2.L, customerDetailsScreen2.M), customerDetailsScreen2.d3().d.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(uiState.f113361b);
        largeActionButton.setEnabled(uiState.f113360a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.retail_restaurants_edit_customer_details_screen_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.retail_restaurants_edit_customer_details_screen_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.retail_restaurants_edit_customer_details_screen_caption, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.retail_restaurants_edit_customer_details_actions_save, null, null, 14));
        largeActionButton.setLoadingButtonTag("SAVE_BUTTON_LOADING_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.L.e.f121375b), new deb.e(this, null), 3);
        PhoneEditorDelegate phoneEditorDelegate = this.M;
        ViewController.P2(this, rd0.e.b(phoneEditorDelegate.e.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(phoneEditorDelegate.f52894c.f121375b), new g(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(phoneEditorDelegate.d.f121375b), new d8j.c(this, (Continuation) null, 12), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new g(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new g(this, null, 2), 3);
    }

    public final u d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k d() {
        return (k) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
