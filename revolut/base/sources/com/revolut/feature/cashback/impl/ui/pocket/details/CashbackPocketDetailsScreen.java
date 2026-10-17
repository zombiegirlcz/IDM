package com.revolut.feature.cashback.impl.ui.pocket.details;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cashback.impl.R$string;
import com.revolut.feature.cashback.impl.ui.pocket.details.CashbackPocketDetailsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import ip0.g0;
import java.util.List;
import jki.o;
import k22.c;
import k8e.a;
import kd3.b;
import kd3.d;
import kd3.g;
import kd3.i;
import kd3.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import vc.s;
import yy0.f;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cashback/impl/ui/pocket/details/CashbackPocketDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lkd3/i;", "Lcom/revolut/feature/cashback/impl/ui/pocket/details/CashbackPocketDetailsScreenContract$InputData;", "Lkd3/g;", "feature_cashback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashbackPocketDetailsScreen extends BaseRecyclerViewScreen<i, CashbackPocketDetailsScreenContract$InputData, g> {
    public static final /* synthetic */ KProperty[] g0 = {o0.f186429a.j(new h0(CashbackPocketDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final boolean V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f65699a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f65700b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f65701d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f65702e0;
    public final Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashbackPocketDetailsScreen(CashbackPocketDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = true;
        this.W = s.t(this, b.f);
        this.X = w.y0(new a(this, inputData, 7));
        final int i = 1;
        this.Y = w.y0(new Function0(this) { // from class: kd3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashbackPocketDetailsScreen f182779b;

            {
                this.f182779b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CashbackPocketDetailsScreen cashbackPocketDetailsScreen = this.f182779b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CashbackPocketDetailsScreen.g0;
                        return v.k((ListSubheaderDelegate) cashbackPocketDetailsScreen.Z.getValue(), (RowDelegate) cashbackPocketDetailsScreen.f65699a0.getValue(), (CellDetailsActionDelegate) cashbackPocketDetailsScreen.f65700b0.getValue(), (CellDetailsChevronDelegate) cashbackPocketDetailsScreen.c0.getValue(), (TextDelegate) cashbackPocketDetailsScreen.f65701d0.getValue(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate());
                    default:
                        KProperty[] kPropertyArr2 = CashbackPocketDetailsScreen.g0;
                        return (h) ((yc3.b) cashbackPocketDetailsScreen.X.getValue()).k.get();
                }
            }
        });
        this.Z = w.y0(new ka9.b(8));
        this.f65699a0 = w.y0(new ka9.b(3));
        this.f65700b0 = w.y0(new ka9.b(4));
        this.c0 = w.y0(new ka9.b(5));
        this.f65701d0 = w.y0(new ka9.b(6));
        this.f65702e0 = w.y0(new ka9.b(7));
        final int i2 = 0;
        this.f0 = w.y0(new Function0(this) { // from class: kd3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashbackPocketDetailsScreen f182779b;

            {
                this.f182779b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CashbackPocketDetailsScreen cashbackPocketDetailsScreen = this.f182779b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CashbackPocketDetailsScreen.g0;
                        return v.k((ListSubheaderDelegate) cashbackPocketDetailsScreen.Z.getValue(), (RowDelegate) cashbackPocketDetailsScreen.f65699a0.getValue(), (CellDetailsActionDelegate) cashbackPocketDetailsScreen.f65700b0.getValue(), (CellDetailsChevronDelegate) cashbackPocketDetailsScreen.c0.getValue(), (TextDelegate) cashbackPocketDetailsScreen.f65701d0.getValue(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate());
                    default:
                        KProperty[] kPropertyArr2 = CashbackPocketDetailsScreen.g0;
                        return (h) ((yc3.b) cashbackPocketDetailsScreen.X.getValue()).k.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (yc3.b) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void U2(int i, int i2, Intent intent) {
        String currencyCode;
        if (i2 != -1 || i != 4 || intent == null || (currencyCode = intent.getStringExtra("argCurrency")) == null) {
            return;
        }
        m mVar = (m) T2();
        mVar.getClass();
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        mVar.f182798w.Z2(currencyCode);
    }

    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174539b.f59410q), null, new c(this, continuation, 18), 3);
        View viewFindViewById = h3().f174539b.findViewById(R$id.chevronLayoutChevron);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ((ImageView) viewFindViewById).setOnClickListener(new g0(this, 11));
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(((CellDetailsActionDelegate) this.f65700b0.getValue()).d, new kcd.a(13))), null, new kd3.c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((CellDetailsChevronDelegate) this.c0.getValue()).f51821c), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(((ListSubheaderDelegate) this.Z.getValue()).d, new kcd.a(14))), null, new kd3.c(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((LargeActionButtonDelegate) this.f65702e0.getValue()).d.f121375b), null, new kd3.e(this, null), 3);
        r map = ((TextDelegate) this.f65701d0.getValue()).d.filter(new kce.c(new kcd.a(15), 8)).map(new kce.c(new kcd.a(16), 9));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(map), null, new kd3.c(this, continuation, 0), 3);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.cashback_source_plan_title, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) ((yc3.b) this.X.getValue()).f.get()).d(u.c((LargeActionButtonDelegate) this.f65702e0.getValue()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getY() {
        return (List) this.f0.getValue();
    }

    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(i uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        View viewFindViewById = h3().f174539b.findViewById(R$id.chevronLayoutChevron);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        Image image = uiState.f182787b;
        MoneyClause moneyClause = uiState.f182788c;
        imageView.setVisibility(image != null ? 0 : 8);
        if (image != null) {
            f.e((f) ((yc3.b) this.X.getValue()).f312455l.get(), uiState.f182787b, imageView, null, null, 12);
        }
        h3().f174539b.setToolbarTitle(moneyClause);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(moneyClause, null);
        h3().f174539b.setEndIconImage(uiState.d);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    public final jii.m h3() {
        ViewBinding value = this.W.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final kd3.h T2() {
        return (kd3.h) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
