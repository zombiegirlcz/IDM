package com.revolut.feature.payments.splitbill.impl.ui_new.manage_split;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.splitbill.api.R$string;
import com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.RecurringPaymentsManageSplitContract$InputData;
import com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.RecurringPaymentsManageSplitScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import j1a.i;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import vc.s;
import vge.z1;
import vrl.d;
import w1a.g;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/ui_new/manage_split/RecurringPaymentsManageSplitScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/manage_split/a;", "Ltki/c;", "Lw1a/c;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecurringPaymentsManageSplitScreen extends ViewController<a> implements c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(RecurringPaymentsManageSplitScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final RecurringPaymentsManageSplitContract$InputData K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final RowLoadingDelegate O;
    public final FullScreenStateDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public RecurringPaymentsManageSplitScreen(RecurringPaymentsManageSplitContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, g.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = new RowLoadingDelegate();
        this.P = new FullScreenStateDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: w1a.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecurringPaymentsManageSplitScreen f293816b;

            {
                this.f293816b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RecurringPaymentsManageSplitScreen recurringPaymentsManageSplitScreen = this.f293816b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RecurringPaymentsManageSplitScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(recurringPaymentsManageSplitScreen.m2()).a().get(v0a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v0a.b.class, " is not found"));
                        }
                        i iVar = ((i) aVar2.b()).f170313p;
                        RecurringPaymentsManageSplitContract$InputData recurringPaymentsManageSplitContract$InputData = recurringPaymentsManageSplitScreen.K;
                        recurringPaymentsManageSplitContract$InputData.getClass();
                        return new j1a.c(iVar, recurringPaymentsManageSplitContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = RecurringPaymentsManageSplitScreen.T;
                        return (b) ((j1a.c) recurringPaymentsManageSplitScreen.Q.getValue()).f170291c.get();
                    default:
                        KProperty[] kPropertyArr3 = RecurringPaymentsManageSplitScreen.T;
                        RecurringPaymentsManageSplitScreen recurringPaymentsManageSplitScreen2 = this.f293816b;
                        return tki.g.a(recurringPaymentsManageSplitScreen2, (b) recurringPaymentsManageSplitScreen2.R.getValue(), v.k(recurringPaymentsManageSplitScreen2.N, recurringPaymentsManageSplitScreen2.O, recurringPaymentsManageSplitScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: w1a.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecurringPaymentsManageSplitScreen f293816b;

            {
                this.f293816b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RecurringPaymentsManageSplitScreen recurringPaymentsManageSplitScreen = this.f293816b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RecurringPaymentsManageSplitScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(recurringPaymentsManageSplitScreen.m2()).a().get(v0a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v0a.b.class, " is not found"));
                        }
                        i iVar = ((i) aVar2.b()).f170313p;
                        RecurringPaymentsManageSplitContract$InputData recurringPaymentsManageSplitContract$InputData = recurringPaymentsManageSplitScreen.K;
                        recurringPaymentsManageSplitContract$InputData.getClass();
                        return new j1a.c(iVar, recurringPaymentsManageSplitContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = RecurringPaymentsManageSplitScreen.T;
                        return (b) ((j1a.c) recurringPaymentsManageSplitScreen.Q.getValue()).f170291c.get();
                    default:
                        KProperty[] kPropertyArr3 = RecurringPaymentsManageSplitScreen.T;
                        RecurringPaymentsManageSplitScreen recurringPaymentsManageSplitScreen2 = this.f293816b;
                        return tki.g.a(recurringPaymentsManageSplitScreen2, (b) recurringPaymentsManageSplitScreen2.R.getValue(), v.k(recurringPaymentsManageSplitScreen2.N, recurringPaymentsManageSplitScreen2.O, recurringPaymentsManageSplitScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: w1a.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecurringPaymentsManageSplitScreen f293816b;

            {
                this.f293816b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RecurringPaymentsManageSplitScreen recurringPaymentsManageSplitScreen = this.f293816b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RecurringPaymentsManageSplitScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(recurringPaymentsManageSplitScreen.m2()).a().get(v0a.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v0a.b.class, " is not found"));
                        }
                        i iVar = ((i) aVar2.b()).f170313p;
                        RecurringPaymentsManageSplitContract$InputData recurringPaymentsManageSplitContract$InputData = recurringPaymentsManageSplitScreen.K;
                        recurringPaymentsManageSplitContract$InputData.getClass();
                        return new j1a.c(iVar, recurringPaymentsManageSplitContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = RecurringPaymentsManageSplitScreen.T;
                        return (b) ((j1a.c) recurringPaymentsManageSplitScreen.Q.getValue()).f170291c.get();
                    default:
                        KProperty[] kPropertyArr3 = RecurringPaymentsManageSplitScreen.T;
                        RecurringPaymentsManageSplitScreen recurringPaymentsManageSplitScreen2 = this.f293816b;
                        return tki.g.a(recurringPaymentsManageSplitScreen2, (b) recurringPaymentsManageSplitScreen2.R.getValue(), v.k(recurringPaymentsManageSplitScreen2.N, recurringPaymentsManageSplitScreen2.O, recurringPaymentsManageSplitScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((w1a.c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j1a.c) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (w1a.b) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.payments_split_bill_contacts_picker_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.payments_split_bill_contacts_picker_title, null, null, 14));
        navBarWithToolbar.setMenuItems(u.c(PlusActionNavBarMenuItem.Companion.b(PlusActionNavBarMenuItem.INSTANCE, "UPDATE_RECURRING_SPLIT_MENU_ITEM_ID", new TextLocalisedClause(R$string.payments_split_bill_contacts_picker_title, null, null, 14))));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new z1(this, null, 25), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new d(this, null, 18), 3);
        ViewController.P2(this, rd0.e.b(this.N.k), new w1a.h(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }
}
