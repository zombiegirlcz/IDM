package com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.delivery_address;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.MapDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.card_reader.order.impl.R$id;
import com.revolut.feature.acquiring.card_reader.order.impl.R$layout;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import db1.g;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import lb1.e;
import lb1.f;
import lb1.i;
import lb1.j;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/order/impl/ui/screen/delivery_address/DeliveryAddressScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Llb1/j;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Llb1/e;", "<init>", "()V", "feature_acquiring_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeliveryAddressScreen extends BaseRecyclerViewScreen<j, IOData$EmptyInput, e> {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f60603a0 = {o0.f186429a.j(new h0(DeliveryAddressScreen.class, "binding", "getBinding()Lcom/revolut/feature/acquiring/card_reader/order/impl/databinding/ScreenCardReaderDeliveryAddressBinding;", 0))};
    public final h U;
    public final MapDelegate V;
    public final FullScreenStateDelegate W;
    public final List X;
    public final int Y;
    public final Object Z;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, bb1.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/acquiring/card_reader/order/impl/databinding/ScreenCardReaderDeliveryAddressBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.continueButton;
            LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
            if (largeActionButton != null) {
                i = R$id.navBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new bb1.a(largeActionButton, navBarWithToolbar, (ControllerContainerCoordinatorLayout) p0);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public DeliveryAddressScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = s.t(this, a.f);
        MapDelegate mapDelegate = new MapDelegate();
        this.V = mapDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.W = fullScreenStateDelegate;
        this.X = v.k(mapDelegate, new RowDelegate(null, null, 7), new RowLoadingDelegate(), fullScreenStateDelegate);
        this.Y = R$layout.screen_card_reader_delivery_address;
        this.Z = w.y0(new kob.a(this, 23));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (g) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (f) ((g) this.Z.getValue()).f112660b.get();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f14127c.f59410q), null, new lb1.a(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f14126b.o), null, new lb1.a(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.V.d), null, new lb1.a(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.W.f52371h.f121375b), null, new lb1.b(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getX() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        h3().f14127c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        if ((uiState instanceof i) || (uiState instanceof lb1.h)) {
            NavBarWithToolbar navBar = h3().f14127c;
            Intrinsics.checkNotNullExpressionValue(navBar, "navBar");
            navBar.j0(false);
            h3().f14127c.setDescriptionVisible(false);
            LargeActionButton continueButton = h3().f14126b;
            Intrinsics.checkNotNullExpressionValue(continueButton, "continueButton");
            continueButton.setVisibility(8);
            return;
        }
        if (!(uiState instanceof lb1.g)) {
            throw new NoWhenBranchMatchedException();
        }
        NavBarWithToolbar navBar2 = h3().f14127c;
        Intrinsics.checkNotNullExpressionValue(navBar2, "navBar");
        navBar2.H0(false);
        NavBarWithToolbar navBar3 = h3().f14127c;
        Intrinsics.checkNotNullExpressionValue(navBar3, "navBar");
        lb1.g gVar = (lb1.g) uiState;
        TextLocalisedClause textLocalisedClause = gVar.f193576b;
        navBar3.setTitle(textLocalisedClause, null);
        h3().f14127c.setToolbarTitle(textLocalisedClause);
        h3().f14127c.setDescriptionVisible(true);
        h3().f14127c.setDescriptionText(gVar.f193577c);
        LargeActionButton continueButton2 = h3().f14126b;
        Intrinsics.checkNotNullExpressionValue(continueButton2, "continueButton");
        continueButton2.setVisibility(0);
        h3().f14126b.setText(gVar.d);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.Y;
    }

    public final bb1.a h3() {
        ViewBinding value = this.U.getValue(this, f60603a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (bb1.a) value;
    }
}
