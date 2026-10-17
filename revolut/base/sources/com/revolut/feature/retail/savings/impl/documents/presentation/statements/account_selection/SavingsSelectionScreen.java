package com.revolut.feature.retail.savings.impl.documents.presentation.statements.account_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cjb.a;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.savings.api.documents.navigation.SavingsAccountsSelectionControllerDescriptor$InputData;
import com.revolut.feature.retail.savings.impl.documents.presentation.statements.account_selection.SavingsSelectionScreen;
import com.revolut.feature.vaults.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import fnb.f;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nme.c;
import nnb.b;
import nnb.d;
import nnb.k;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/documents/presentation/statements/account_selection/SavingsSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcjb/a;", "Ldli/a;", "Lnnb/k;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SavingsSelectionScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(SavingsSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final SavingsAccountsSelectionControllerDescriptor$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public SavingsSelectionScreen(SavingsAccountsSelectionControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = true;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: nnb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsSelectionScreen f217488b;

            {
                this.f217488b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SavingsSelectionScreen savingsSelectionScreen = this.f217488b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsSelectionScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(savingsSelectionScreen.m2()).a().get(fnb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fnb.e.class, " is not found"));
                        }
                        fnb.e eVar = ((fnb.e) aVar2.b()).e;
                        SavingsAccountsSelectionControllerDescriptor$InputData savingsAccountsSelectionControllerDescriptor$InputData = savingsSelectionScreen.K;
                        savingsAccountsSelectionControllerDescriptor$InputData.getClass();
                        return new fnb.f(eVar, savingsAccountsSelectionControllerDescriptor$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsSelectionScreen.U;
                        return (h) ((fnb.f) savingsSelectionScreen.O.getValue()).f136610b.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsSelectionScreen.U;
                        return new SelectableDelegate((RowDelegate) savingsSelectionScreen.Q.getValue());
                    default:
                        KProperty[] kPropertyArr4 = SavingsSelectionScreen.U;
                        SavingsSelectionScreen savingsSelectionScreen2 = this.f217488b;
                        return dli.f.a(savingsSelectionScreen2, savingsSelectionScreen2.d(), v.k(new ListSubheaderDelegate(), (SelectableDelegate) savingsSelectionScreen2.R.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) savingsSelectionScreen2.S.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: nnb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsSelectionScreen f217488b;

            {
                this.f217488b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SavingsSelectionScreen savingsSelectionScreen = this.f217488b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsSelectionScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(savingsSelectionScreen.m2()).a().get(fnb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fnb.e.class, " is not found"));
                        }
                        fnb.e eVar = ((fnb.e) aVar2.b()).e;
                        SavingsAccountsSelectionControllerDescriptor$InputData savingsAccountsSelectionControllerDescriptor$InputData = savingsSelectionScreen.K;
                        savingsAccountsSelectionControllerDescriptor$InputData.getClass();
                        return new fnb.f(eVar, savingsAccountsSelectionControllerDescriptor$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsSelectionScreen.U;
                        return (h) ((fnb.f) savingsSelectionScreen.O.getValue()).f136610b.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsSelectionScreen.U;
                        return new SelectableDelegate((RowDelegate) savingsSelectionScreen.Q.getValue());
                    default:
                        KProperty[] kPropertyArr4 = SavingsSelectionScreen.U;
                        SavingsSelectionScreen savingsSelectionScreen2 = this.f217488b;
                        return dli.f.a(savingsSelectionScreen2, savingsSelectionScreen2.d(), v.k(new ListSubheaderDelegate(), (SelectableDelegate) savingsSelectionScreen2.R.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) savingsSelectionScreen2.S.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.Q = w.y0(new c(15));
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: nnb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsSelectionScreen f217488b;

            {
                this.f217488b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SavingsSelectionScreen savingsSelectionScreen = this.f217488b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsSelectionScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(savingsSelectionScreen.m2()).a().get(fnb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fnb.e.class, " is not found"));
                        }
                        fnb.e eVar = ((fnb.e) aVar2.b()).e;
                        SavingsAccountsSelectionControllerDescriptor$InputData savingsAccountsSelectionControllerDescriptor$InputData = savingsSelectionScreen.K;
                        savingsAccountsSelectionControllerDescriptor$InputData.getClass();
                        return new fnb.f(eVar, savingsAccountsSelectionControllerDescriptor$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsSelectionScreen.U;
                        return (h) ((fnb.f) savingsSelectionScreen.O.getValue()).f136610b.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsSelectionScreen.U;
                        return new SelectableDelegate((RowDelegate) savingsSelectionScreen.Q.getValue());
                    default:
                        KProperty[] kPropertyArr4 = SavingsSelectionScreen.U;
                        SavingsSelectionScreen savingsSelectionScreen2 = this.f217488b;
                        return dli.f.a(savingsSelectionScreen2, savingsSelectionScreen2.d(), v.k(new ListSubheaderDelegate(), (SelectableDelegate) savingsSelectionScreen2.R.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) savingsSelectionScreen2.S.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.S = w.y0(new c(16));
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: nnb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsSelectionScreen f217488b;

            {
                this.f217488b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                SavingsSelectionScreen savingsSelectionScreen = this.f217488b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsSelectionScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(savingsSelectionScreen.m2()).a().get(fnb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fnb.e.class, " is not found"));
                        }
                        fnb.e eVar = ((fnb.e) aVar2.b()).e;
                        SavingsAccountsSelectionControllerDescriptor$InputData savingsAccountsSelectionControllerDescriptor$InputData = savingsSelectionScreen.K;
                        savingsAccountsSelectionControllerDescriptor$InputData.getClass();
                        return new fnb.f(eVar, savingsAccountsSelectionControllerDescriptor$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsSelectionScreen.U;
                        return (h) ((fnb.f) savingsSelectionScreen.O.getValue()).f136610b.get();
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsSelectionScreen.U;
                        return new SelectableDelegate((RowDelegate) savingsSelectionScreen.Q.getValue());
                    default:
                        KProperty[] kPropertyArr4 = SavingsSelectionScreen.U;
                        SavingsSelectionScreen savingsSelectionScreen2 = this.f217488b;
                        return dli.f.a(savingsSelectionScreen2, savingsSelectionScreen2.d(), v.k(new ListSubheaderDelegate(), (SelectableDelegate) savingsSelectionScreen2.R.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) savingsSelectionScreen2.S.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setEnabled(uiState.f217500b);
        largeActionButton.setText(uiState.f217501c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.savings_statements_select_account_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.savings_statements_select_account_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new nnb.c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new nnb.c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SelectableDelegate) this.R.getValue()).r()), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.S.getValue()).f52371h.f121375b), null, new nnb.e(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final nnb.h d() {
        return (nnb.h) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
