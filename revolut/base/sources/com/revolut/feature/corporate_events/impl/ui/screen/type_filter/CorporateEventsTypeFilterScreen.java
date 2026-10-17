package com.revolut.feature.corporate_events.impl.ui.screen.type_filter;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ap3.g;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.corporate_events.impl.R$id;
import com.revolut.feature.corporate_events.impl.R$layout;
import com.revolut.feature.corporate_events.impl.ui.screen.type_filter.CorporateEventsTypeFilterScreen;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import ip0.e70;
import ip0.md;
import ip3.b;
import ip3.c;
import ip3.d;
import ip3.h;
import ip3.j;
import ip3.k;
import ip3.l;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/corporate_events/impl/ui/screen/type_filter/CorporateEventsTypeFilterScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lip3/k;", "Lcom/revolut/feature/corporate_events/impl/ui/screen/type_filter/CorporateEventsTypeFilterScreenContract$InputData;", "Lip3/h;", "feature_corporate_events_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CorporateEventsTypeFilterScreen extends BaseRecyclerViewScreen<k, CorporateEventsTypeFilterScreenContract$InputData, h> {
    public static final /* synthetic */ KProperty[] i0 = {o0.f186429a.j(new h0(CorporateEventsTypeFilterScreen.class, "binding", "getBinding()Lcom/revolut/feature/corporate_events/impl/databinding/ScreenCorporateEventsTypeFilterBinding;", 0))};
    public final boolean U;
    public final int V;
    public final int W;
    public final ao.h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f66148a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f66149b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f66150d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f66151e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f66152h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorporateEventsTypeFilterScreen(CorporateEventsTypeFilterScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = true;
        this.V = R$layout.screen_corporate_events_type_filter;
        this.W = R$id.corporateEventsFilter_recyclerView;
        this.X = s.t(this, b.f);
        this.Y = w.y0(new e70(19));
        this.Z = w.y0(new e70(20));
        this.f66148a0 = w.y0(new e70(21));
        this.f66149b0 = w.y0(new e70(22));
        this.c0 = w.y0(new e70(23));
        this.f66150d0 = w.y0(new e70(24));
        this.f66151e0 = w.y0(new e70(25));
        final int i = 0;
        this.f0 = w.y0(new Function0(this) { // from class: ip3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorporateEventsTypeFilterScreen f167630b;

            {
                this.f167630b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CorporateEventsTypeFilterScreen corporateEventsTypeFilterScreen = this.f167630b;
                switch (i2) {
                    case 0:
                        return v.k((CellDetailsDelegate) corporateEventsTypeFilterScreen.Z.getValue(), (LargeActionButtonDelegate) corporateEventsTypeFilterScreen.f66148a0.getValue(), (TwinHorizontalButtonDelegate) corporateEventsTypeFilterScreen.f66149b0.getValue(), (ListSubheaderDelegate) corporateEventsTypeFilterScreen.Y.getValue(), (DatePickerDelegate) corporateEventsTypeFilterScreen.c0.getValue(), (ProgressStepVerticalDelegate) corporateEventsTypeFilterScreen.f66150d0.getValue(), (InputChecklistDelegate) corporateEventsTypeFilterScreen.f66151e0.getValue());
                    default:
                        KProperty[] kPropertyArr = CorporateEventsTypeFilterScreen.i0;
                        return (j) ((ap3.g) corporateEventsTypeFilterScreen.g0.getValue()).i.get();
                }
            }
        });
        this.g0 = w.y0(new md(this, inputData, 11));
        final int i2 = 1;
        this.f66152h0 = w.y0(new Function0(this) { // from class: ip3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorporateEventsTypeFilterScreen f167630b;

            {
                this.f167630b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CorporateEventsTypeFilterScreen corporateEventsTypeFilterScreen = this.f167630b;
                switch (i22) {
                    case 0:
                        return v.k((CellDetailsDelegate) corporateEventsTypeFilterScreen.Z.getValue(), (LargeActionButtonDelegate) corporateEventsTypeFilterScreen.f66148a0.getValue(), (TwinHorizontalButtonDelegate) corporateEventsTypeFilterScreen.f66149b0.getValue(), (ListSubheaderDelegate) corporateEventsTypeFilterScreen.Y.getValue(), (DatePickerDelegate) corporateEventsTypeFilterScreen.c0.getValue(), (ProgressStepVerticalDelegate) corporateEventsTypeFilterScreen.f66150d0.getValue(), (InputChecklistDelegate) corporateEventsTypeFilterScreen.f66151e0.getValue());
                    default:
                        KProperty[] kPropertyArr = CorporateEventsTypeFilterScreen.i0;
                        return (j) ((ap3.g) corporateEventsTypeFilterScreen.g0.getValue()).i.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((l) T2()).v2(h.a.f167633a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (g) this.g0.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        a.g2(this, e.b(h3().f307596c.f59410q), null, new c(this, null, 0), 3);
        a.g2(this, e.b(h3().f307595b.o), null, new c(this, null, 1), 3);
        a.g2(this, e.b(((InputChecklistDelegate) this.f66151e0.getValue()).f52518c), null, new d(this, null), 3);
        a.g2(this, e.b(((ListSubheaderDelegate) this.Y.getValue()).e), null, new ip3.e(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f307596c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setSearchButtonActive(false);
        navBarWithToolbar.setDescriptionVisible(false);
        ((j60.a) ((g) this.g0.getValue()).d.get()).d(getF94799d0());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF94799d0() {
        return (List) this.f0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(k uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        LargeActionButton largeActionButton = h3().f307595b;
        largeActionButton.setEnabled(uiState.f167637c);
        largeActionButton.setText(uiState.f167636b);
        NavBarWithToolbar navBarWithToolbar = h3().f307596c;
        TextLocalisedClause textLocalisedClause = uiState.f167635a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final xo3.c h3() {
        ViewBinding value = this.X.getValue(this, i0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (xo3.c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final j T2() {
        return (j) this.f66152h0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.U);
    }
}
