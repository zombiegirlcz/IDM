package com.revolut.feature.picker.legacy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.picker.R$id;
import com.revolut.feature.picker.R$layout;
import com.revolut.feature.picker.legacy.PickerScreen;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import no.m;
import rd0.e;
import sji.b;
import v7a.c;
import vc.s;
import y7a.f;
import y7a.f0;
import y7a.g;
import y7a.i;
import y7a.l;
import y7a.n;
import y7a.o;
import y7a.p;
import y7a.v;
import y7a.x;
import yhm.d;
import yhm.j;
import yp0.y;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/picker/legacy/PickerScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ly7a/x;", "Lcom/revolut/feature/picker/legacy/PickerScreenContract$InputData;", "Ly7a/v;", "Lno/m;", "Lno/k;", "feature_picker_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class PickerScreen extends BaseRecyclerViewScreen<x, PickerScreenContract$InputData, v> implements m, k {
    public static final /* synthetic */ KProperty[] m0 = {o0.f186429a.j(new h0(PickerScreen.class, "binding", "getBinding()Lcom/revolut/feature/picker/databinding/FeatureScreenPickerBinding;", 0))};
    public final int U;
    public final h V;
    public final AnalyticsProduct W;
    public AnalyticsContext X;
    public final int Y;
    public final Lazy Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Lazy f80352a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final RowDelegate f80353b0;
    public final InputDisclosureDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final InputChecklistDelegate f80354d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final SingleChoiceDelegate f80355e0;
    public final SelectableDelegate f0;
    public final ListSubheaderDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final AccountCellItemDelegate f80356h0;
    public final SelectableDelegate i0;
    public final SelectableDelegate j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final FullScreenStateDelegate f80357k0;
    public final Lazy l0;

    public PickerScreen(PickerScreenContract$InputData inputData) {
        c pickerErrorMapper = new c();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pickerErrorMapper, "pickerErrorMapper");
        super(inputData);
        this.U = R$layout.feature_screen_picker;
        this.V = s.t(this, y7a.c.f);
        this.W = inputData.f80373x;
        this.X = inputData.f80374y;
        this.Y = R$id.picker_recyclerView;
        this.Z = j.b(new qg7.k(this, 24, inputData, pickerErrorMapper));
        final int i = 0;
        this.f80352a0 = j.b(new Function0(this) { // from class: y7a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PickerScreen f311429b;

            {
                this.f311429b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PickerScreen pickerScreen = this.f311429b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PickerScreen.m0;
                        return ((z7a.b) pickerScreen.Z.getValue()).a();
                    default:
                        KProperty[] kPropertyArr2 = PickerScreen.m0;
                        return zhm.v.k(new RowLoadingDelegate(), pickerScreen.f80353b0, pickerScreen.c0, pickerScreen.f80354d0, pickerScreen.f80355e0, pickerScreen.f0, pickerScreen.g0, pickerScreen.f80356h0, pickerScreen.i0, pickerScreen.j0, pickerScreen.f80357k0);
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f80353b0 = rowDelegate;
        this.c0 = new InputDisclosureDelegate();
        this.f80354d0 = new InputChecklistDelegate();
        this.f80355e0 = new SingleChoiceDelegate();
        this.f0 = new SelectableDelegate(rowDelegate);
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.g0 = listSubheaderDelegate;
        AccountCellItemDelegate accountCellItemDelegate = new AccountCellItemDelegate();
        this.f80356h0 = accountCellItemDelegate;
        this.i0 = new SelectableDelegate(listSubheaderDelegate);
        this.j0 = new SelectableDelegate(accountCellItemDelegate);
        this.f80357k0 = new FullScreenStateDelegate();
        final int i2 = 1;
        this.l0 = j.b(new Function0(this) { // from class: y7a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PickerScreen f311429b;

            {
                this.f311429b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PickerScreen pickerScreen = this.f311429b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PickerScreen.m0;
                        return ((z7a.b) pickerScreen.Z.getValue()).a();
                    default:
                        KProperty[] kPropertyArr2 = PickerScreen.m0;
                        return zhm.v.k(new RowLoadingDelegate(), pickerScreen.f80353b0, pickerScreen.c0, pickerScreen.f80354d0, pickerScreen.f80355e0, pickerScreen.f0, pickerScreen.g0, pickerScreen.f80356h0, pickerScreen.i0, pickerScreen.j0, pickerScreen.f80357k0);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        f0 f0VarT2 = T2();
        if (!f0VarT2.f311442q.f80370s) {
            return super.F2();
        }
        f0VarT2.v2(new v(p.f311445a));
        return true;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.X = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getX() {
        return this.W;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getF91880d0() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (z7a.b) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        t7a.a aVarH3 = h3();
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(aVarH3.f268625c.o.f57403b), null, new y7a.d(this, continuation, 0), 3);
        NavBarWithToolbar navBarWithToolbar = aVarH3.f268625c;
        SearchView searchView = navBarWithToolbar.f59409p;
        com.revolut.kompot.navigable.a.g2(this, e.b(searchView.f57336l), null, new y5g.d(aVarH3, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(searchView.f57337m), null, new y7a.d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.f59410q), null, new y5g.d(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.x0()), null, new y7a.d(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f80353b0.f53218h), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f80356h0.f51551c.f53218h), null, new y7a.j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f80355e0.p()), null, new y7a.k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f0.r()), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.i0.r()), null, new y7a.m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.c0.f52538c), null, new n(this, null), 3);
        InputChecklistDelegate inputChecklistDelegate = this.f80354d0;
        com.revolut.kompot.navigable.a.g2(this, e.b(inputChecklistDelegate.f52518c), null, new o(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(inputChecklistDelegate.p()), null, new y7a.d(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(inputChecklistDelegate.e.f121375b), null, new y7a.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.j0.r()), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.g0.f52707c), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f80357k0.f52371h.f121375b), null, new y7a.h(this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        PickerScreenContract$InputData pickerScreenContract$InputData = (PickerScreenContract$InputData) this.G;
        ((hli.e) view).setFitStatusBar(pickerScreenContract$InputData.f80360c);
        ViewParent parent = h3().d.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(h3().d);
        }
        t7a.a aVarH3 = h3();
        LargeActionButton largeActionButton = aVarH3.f268624b;
        NavBarWithToolbar pickerNavBar = aVarH3.f268625c;
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        largeActionButton.setLoadingButtonTag("PICKER_SCREEN_PRIMARY_BUTTON_TAG");
        largeActionButton.setOnClickListener(new wk.a(this, 1));
        largeActionButton.setAnalyticsContext(pickerScreenContract$InputData.A);
        pickerNavBar.setHeaderTitleMode(pickerScreenContract$InputData.f80372w);
        Clause clause = pickerScreenContract$InputData.f80359b;
        if (clause == null) {
            pickerNavBar.j0(false);
        } else {
            pickerNavBar.setToolbarTitle(clause);
            Intrinsics.checkNotNullExpressionValue(pickerNavBar, "pickerNavBar");
            pickerNavBar.setTitle(clause, null);
        }
        Clause clause2 = pickerScreenContract$InputData.d;
        if (clause2 != null) {
            pickerNavBar.setDescriptionText(clause2);
            pickerNavBar.setDescriptionVisible(true);
        }
        Clause clause3 = pickerScreenContract$InputData.e;
        if (clause3 != null) {
            pickerNavBar.setSecondDescriptionText(clause3);
            pickerNavBar.setSecondDescriptionVisible(true);
        }
        Intrinsics.checkNotNullExpressionValue(pickerNavBar, "pickerNavBar");
        w01.k.e(pickerNavBar, pickerScreenContract$InputData.f);
        if (pickerScreenContract$InputData.f80362h) {
            pickerNavBar.setSearchButtonActive(true);
        }
        Clause clause4 = pickerScreenContract$InputData.i;
        if (clause4 != null) {
            pickerNavBar.setHint(clause4);
        }
        Clause clause5 = pickerScreenContract$InputData.f80363j;
        if (clause5 != null) {
            pickerNavBar.setSearchContentDescription(clause5);
        }
        Clause clause6 = pickerScreenContract$InputData.o;
        if (clause6 != null) {
            largeActionButton.setText(clause6);
        }
        ScreenContentRecyclerView pickerRecyclerView = aVarH3.e;
        Intrinsics.checkNotNullExpressionValue(pickerRecyclerView, "pickerRecyclerView");
        y.g(pickerRecyclerView, m2());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF67178a0() {
        return (List) this.l0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getX() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(x uiState, jki.o oVar) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().notifyDataSetChanged();
        super.Z2(uiState, oVar);
        t7a.a aVarH3 = h3();
        NavBarWithToolbar pickerNavBar = aVarH3.f268625c;
        LargeActionButton pickerButton = aVarH3.f268624b;
        ScreenContentRecyclerView pickerRecyclerView = aVarH3.e;
        boolean z = pickerNavBar.f59421x0;
        IOData$Input iOData$Input = this.G;
        if (!z && (uiState.f.length() > 0 || ((PickerScreenContract$InputData) iOData$Input).v)) {
            pickerNavBar.setSearchInput(new TextClause(uiState.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            pickerNavBar.K0(j4.NO_ANIMATION);
            pickerNavBar.post(new s7a.a(aVarH3, 1));
        }
        y7a.s sVar = uiState.f311459h;
        boolean z3 = uiState.d;
        int i = sVar == null ? -1 : y7a.b.f311431a[sVar.ordinal()];
        if (i == -1) {
            numValueOf = null;
        } else if (i == 1) {
            numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_cross);
        }
        pickerNavBar.setNavigationButtonIcon(numValueOf);
        Intrinsics.checkNotNullExpressionValue(pickerNavBar, "pickerNavBar");
        NavBarMenuItem navBarMenuItem = uiState.f311458g;
        ArrayList arrayList = new ArrayList();
        if (navBarMenuItem != null) {
            arrayList.add(navBarMenuItem);
        }
        arrayList.addAll(((PickerScreenContract$InputData) iOData$Input).f80371t);
        pickerNavBar.setMenuItems(arrayList);
        Intrinsics.checkNotNullExpressionValue(pickerRecyclerView, "pickerRecyclerView");
        w01.k.d(pickerRecyclerView);
        int i2 = uiState.e;
        Integer numValueOf2 = i2 > 2 ? Integer.valueOf(i2) : null;
        if (numValueOf2 != null) {
            int iIntValue = numValueOf2.intValue();
            RecyclerView.LayoutManager layoutManager = pickerRecyclerView.getLayoutManager();
            Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(iIntValue - 2, 0);
        }
        Clause clause = uiState.f311457c;
        if (clause != null) {
            pickerButton.setText(clause);
        }
        Intrinsics.checkNotNullExpressionValue(pickerButton, "pickerButton");
        w01.k.e(pickerButton, z3);
        pickerButton.setEnabled(uiState.f311456b);
        if (z3) {
            Intrinsics.checkNotNullExpressionValue(pickerRecyclerView, "pickerRecyclerView");
            Context context = pickerRecyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            w01.k.c(pickerRecyclerView, kli.a.k(context, 92.0f));
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    public final t7a.a h3() {
        ViewBinding value = this.V.getValue(this, m0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (t7a.a) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final f0 T2() {
        return (f0) this.f80352a0.getValue();
    }
}
