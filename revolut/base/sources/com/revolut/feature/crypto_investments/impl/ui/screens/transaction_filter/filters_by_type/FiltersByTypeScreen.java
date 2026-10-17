package com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.filters_by_type;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ap7.k;
import at4.b;
import av5.c;
import av5.d;
import av5.g;
import av5.j;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto_investments.api.R$string;
import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.filters_by_type.FiltersByTypeScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.u;
import jki.m;
import jki.n;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/impl/ui/screens/transaction_filter/filters_by_type/FiltersByTypeScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lav5/j;", "Lcom/revolut/feature/crypto_investments/impl/ui/screens/transaction_filter/filters_by_type/FiltersByTypeScreenContract$InputData;", "Lav5/g;", "feature_crypto_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FiltersByTypeScreen extends BaseRecyclerViewScreen<j, FiltersByTypeScreenContract$InputData, g> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(FiltersByTypeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int U;
    public final boolean V;
    public final Object W;
    public final Object X;
    public final h Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f71442a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f71443b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiltersByTypeScreen(FiltersByTypeScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        this.V = true;
        this.W = w.y0(new b(this, inputData, 5));
        final int i = 0;
        this.X = w.y0(new Function0(this) { // from class: av5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FiltersByTypeScreen f9914b;

            {
                this.f9914b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FiltersByTypeScreen filtersByTypeScreen = this.f9914b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FiltersByTypeScreen.c0;
                        return (h) ((ku5.h) filtersByTypeScreen.W.getValue()).f189698c.get();
                    default:
                        KProperty[] kPropertyArr2 = FiltersByTypeScreen.c0;
                        return v.k((InputChecklistDelegate) filtersByTypeScreen.Z.getValue(), (SelectableDelegate) filtersByTypeScreen.f71442a0.getValue());
                }
            }
        });
        this.Y = s.t(this, av5.b.f);
        this.Z = w.y0(new ar0.b(25));
        this.f71442a0 = w.y0(new ar0.b(26));
        final int i2 = 1;
        this.f71443b0 = w.y0(new Function0(this) { // from class: av5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FiltersByTypeScreen f9914b;

            {
                this.f9914b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FiltersByTypeScreen filtersByTypeScreen = this.f9914b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FiltersByTypeScreen.c0;
                        return (h) ((ku5.h) filtersByTypeScreen.W.getValue()).f189698c.get();
                    default:
                        KProperty[] kPropertyArr2 = FiltersByTypeScreen.c0;
                        return v.k((InputChecklistDelegate) filtersByTypeScreen.Z.getValue(), (SelectableDelegate) filtersByTypeScreen.f71442a0.getValue());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        j uiState = (j) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174565c.setSearchButtonActive(uiState.f9920b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (ku5.h) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        a.g2(this, e.b(g3().f174565c.f59410q), null, new c(this, null, 0), 3);
        a.g2(this, e.b(g3().f174564b.o), null, new c(this, null, 1), 3);
        a.g2(this, e.b(((InputChecklistDelegate) this.Z.getValue()).f52518c), null, new d(this, null), 3);
        a.g2(this, e.b(((SelectableDelegate) this.f71442a0.getValue()).r()), null, new av5.e(this, null), 3);
        a.g2(this, e.b(g3().f174565c.f59409p.f57337m), null, new k(this, null, 23), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(((FiltersByTypeScreenContract$InputData) this.G).f71444a.a(), null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.crypto_investments_search_placeholder, null, null, 14));
        g3().f174564b.setText(new TextLocalisedClause(R$string.crypto_transaction_filters_filters_by_type_screen_button, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        j uiState = (j) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f174565c.setSearchButtonActive(uiState.f9920b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF101524d0() {
        return (List) this.f71443b0.getValue();
    }

    public final u g3() {
        ViewBinding value = this.Y.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final av5.h T2() {
        return (av5.h) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
