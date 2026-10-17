package com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import bb1.b;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.card_reader.order.impl.R$id;
import com.revolut.feature.acquiring.card_reader.order.impl.R$layout;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details.CardReaderProductDetailsScreen;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details.CardReaderProductDetailsScreenContract$ProductDetailsWidgetType;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.rx_navigable.screen.BaseRxRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import db1.d;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import ob1.e;
import ob1.g;
import ob1.i;
import ob1.j;
import ob1.k;
import ob1.o;
import te0.w;
import vc.s;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/order/impl/ui/screen/product_details/CardReaderProductDetailsScreen;", "Lcom/revolut/kompot/common/rx_navigable/screen/BaseRxRecyclerViewScreen;", "Lob1/k;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lob1/g;", "<init>", "()V", "feature_acquiring_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardReaderProductDetailsScreen extends BaseRxRecyclerViewScreen<k, IOData$EmptyInput, g> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f60604e0 = {o0.f186429a.j(new h0(CardReaderProductDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/acquiring/card_reader/order/impl/databinding/ScreenCardReaderProductDetailsBinding;", 0))};
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f60605a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f60606b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f60607d0;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/acquiring/card_reader/order/impl/databinding/ScreenCardReaderProductDetailsBinding;", 0);
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
                        return new b(largeActionButton, navBarWithToolbar, (ControllerContainerCoordinatorLayout) p0);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public CardReaderProductDetailsScreen() {
        super(IOData$EmptyInput.f98299a);
        this.X = s.t(this, a.f);
        this.Y = w.y0(new e(0));
        this.Z = w.y0(new e(1));
        this.f60605a0 = R$layout.screen_card_reader_product_details;
        final int i = 2;
        this.f60606b0 = w.y0(new Function0(this) { // from class: ob1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReaderProductDetailsScreen f223843b;

            {
                this.f223843b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardReaderProductDetailsScreen cardReaderProductDetailsScreen = this.f223843b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CardReaderProductDetailsScreen.f60604e0;
                        return (o) ((db1.d) cardReaderProductDetailsScreen.f60607d0.getValue()).f112652c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CardReaderProductDetailsScreen.f60604e0;
                        qji.b bVarQ2 = cardReaderProductDetailsScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details.di.CardReaderProductDetailsScreenInjector");
                        db1.c cVar = (db1.c) bVarQ2;
                        return new db1.d(cVar.f112647a, cVar.f112648b);
                    default:
                        KProperty[] kPropertyArr3 = CardReaderProductDetailsScreen.f60604e0;
                        return d0.E0((List) cardReaderProductDetailsScreen.Y.getValue(), v.k(new ListCellDelegate(), new ListSubheaderDelegate(), new BigTileDelegate(), new CounterTextDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) cardReaderProductDetailsScreen.Z.getValue()));
                }
            }
        });
        final int i2 = 0;
        this.c0 = w.y0(new Function0(this) { // from class: ob1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReaderProductDetailsScreen f223843b;

            {
                this.f223843b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardReaderProductDetailsScreen cardReaderProductDetailsScreen = this.f223843b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardReaderProductDetailsScreen.f60604e0;
                        return (o) ((db1.d) cardReaderProductDetailsScreen.f60607d0.getValue()).f112652c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CardReaderProductDetailsScreen.f60604e0;
                        qji.b bVarQ2 = cardReaderProductDetailsScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details.di.CardReaderProductDetailsScreenInjector");
                        db1.c cVar = (db1.c) bVarQ2;
                        return new db1.d(cVar.f112647a, cVar.f112648b);
                    default:
                        KProperty[] kPropertyArr3 = CardReaderProductDetailsScreen.f60604e0;
                        return d0.E0((List) cardReaderProductDetailsScreen.Y.getValue(), v.k(new ListCellDelegate(), new ListSubheaderDelegate(), new BigTileDelegate(), new CounterTextDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) cardReaderProductDetailsScreen.Z.getValue()));
                }
            }
        });
        final int i3 = 1;
        this.f60607d0 = w.y0(new Function0(this) { // from class: ob1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReaderProductDetailsScreen f223843b;

            {
                this.f223843b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CardReaderProductDetailsScreen cardReaderProductDetailsScreen = this.f223843b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardReaderProductDetailsScreen.f60604e0;
                        return (o) ((db1.d) cardReaderProductDetailsScreen.f60607d0.getValue()).f112652c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CardReaderProductDetailsScreen.f60604e0;
                        qji.b bVarQ2 = cardReaderProductDetailsScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details.di.CardReaderProductDetailsScreenInjector");
                        db1.c cVar = (db1.c) bVarQ2;
                        return new db1.d(cVar.f112647a, cVar.f112648b);
                    default:
                        KProperty[] kPropertyArr3 = CardReaderProductDetailsScreen.f60604e0;
                        return d0.E0((List) cardReaderProductDetailsScreen.Y.getValue(), v.k(new ListCellDelegate(), new ListSubheaderDelegate(), new BigTileDelegate(), new CounterTextDelegate(), new RowLoadingDelegate(), (FullScreenStateDelegate) cardReaderProductDetailsScreen.Z.getValue()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (d) this.f60607d0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (o) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        List list = (List) this.Y.getValue();
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((ProductDetailsWidget) it8.next()).f);
        }
        r rVarFilter = r.merge(arrayList).filter(new o5i.a(28, new o95.b(24)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        final int i = 0;
        BaseRxRecyclerViewScreen.g3(this, w.a0(rVarFilter, new o95.b(25)), new Function1(this) { // from class: ob1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReaderProductDetailsScreen f223845b;

            {
                this.f223845b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2 = i;
                CardReaderProductDetailsScreen cardReaderProductDetailsScreen = this.f223845b;
                switch (i2) {
                    case 0:
                        CardReaderProductDetailsScreenContract$ProductDetailsWidgetType widgetType = (CardReaderProductDetailsScreenContract$ProductDetailsWidgetType) obj2;
                        KProperty[] kPropertyArr = CardReaderProductDetailsScreen.f60604e0;
                        Intrinsics.checkNotNullParameter(widgetType, "productDetailsWidgetType");
                        o oVar = (o) cardReaderProductDetailsScreen.c0.getValue();
                        oVar.getClass();
                        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
                        oVar.x2(new o9h.b(widgetType, 4));
                        break;
                    case 1:
                        Unit it9 = (Unit) obj2;
                        KProperty[] kPropertyArr2 = CardReaderProductDetailsScreen.f60604e0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        cardReaderProductDetailsScreen.m2().onBackPressed();
                        break;
                    case 2:
                        Unit it10 = (Unit) obj2;
                        KProperty[] kPropertyArr3 = CardReaderProductDetailsScreen.f60604e0;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        o oVar2 = (o) cardReaderProductDetailsScreen.c0.getValue();
                        oVar2.getClass();
                        oVar2.l2(new n(oVar2, null), new yi5.b(26));
                        break;
                    default:
                        FullScreenStateDelegate.Model it11 = (FullScreenStateDelegate.Model) obj2;
                        KProperty[] kPropertyArr4 = CardReaderProductDetailsScreen.f60604e0;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        o oVar3 = (o) cardReaderProductDetailsScreen.c0.getValue();
                        yji.l.a1(oVar3, rd0.e.b(xa1.a.a(oVar3.f223857p, null, 1)), null, null, new o95.c(oVar3, null, 3), 3);
                        break;
                }
                return Unit.f186387a;
            }
        });
        final int i2 = 1;
        BaseRxRecyclerViewScreen.g3(this, i3().f14130c.f59410q, new Function1(this) { // from class: ob1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReaderProductDetailsScreen f223845b;

            {
                this.f223845b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i2;
                CardReaderProductDetailsScreen cardReaderProductDetailsScreen = this.f223845b;
                switch (i22) {
                    case 0:
                        CardReaderProductDetailsScreenContract$ProductDetailsWidgetType widgetType = (CardReaderProductDetailsScreenContract$ProductDetailsWidgetType) obj2;
                        KProperty[] kPropertyArr = CardReaderProductDetailsScreen.f60604e0;
                        Intrinsics.checkNotNullParameter(widgetType, "productDetailsWidgetType");
                        o oVar = (o) cardReaderProductDetailsScreen.c0.getValue();
                        oVar.getClass();
                        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
                        oVar.x2(new o9h.b(widgetType, 4));
                        break;
                    case 1:
                        Unit it9 = (Unit) obj2;
                        KProperty[] kPropertyArr2 = CardReaderProductDetailsScreen.f60604e0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        cardReaderProductDetailsScreen.m2().onBackPressed();
                        break;
                    case 2:
                        Unit it10 = (Unit) obj2;
                        KProperty[] kPropertyArr3 = CardReaderProductDetailsScreen.f60604e0;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        o oVar2 = (o) cardReaderProductDetailsScreen.c0.getValue();
                        oVar2.getClass();
                        oVar2.l2(new n(oVar2, null), new yi5.b(26));
                        break;
                    default:
                        FullScreenStateDelegate.Model it11 = (FullScreenStateDelegate.Model) obj2;
                        KProperty[] kPropertyArr4 = CardReaderProductDetailsScreen.f60604e0;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        o oVar3 = (o) cardReaderProductDetailsScreen.c0.getValue();
                        yji.l.a1(oVar3, rd0.e.b(xa1.a.a(oVar3.f223857p, null, 1)), null, null, new o95.c(oVar3, null, 3), 3);
                        break;
                }
                return Unit.f186387a;
            }
        });
        final int i3 = 2;
        BaseRxRecyclerViewScreen.g3(this, i3().f14129b.o, new Function1(this) { // from class: ob1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReaderProductDetailsScreen f223845b;

            {
                this.f223845b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i3;
                CardReaderProductDetailsScreen cardReaderProductDetailsScreen = this.f223845b;
                switch (i22) {
                    case 0:
                        CardReaderProductDetailsScreenContract$ProductDetailsWidgetType widgetType = (CardReaderProductDetailsScreenContract$ProductDetailsWidgetType) obj2;
                        KProperty[] kPropertyArr = CardReaderProductDetailsScreen.f60604e0;
                        Intrinsics.checkNotNullParameter(widgetType, "productDetailsWidgetType");
                        o oVar = (o) cardReaderProductDetailsScreen.c0.getValue();
                        oVar.getClass();
                        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
                        oVar.x2(new o9h.b(widgetType, 4));
                        break;
                    case 1:
                        Unit it9 = (Unit) obj2;
                        KProperty[] kPropertyArr2 = CardReaderProductDetailsScreen.f60604e0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        cardReaderProductDetailsScreen.m2().onBackPressed();
                        break;
                    case 2:
                        Unit it10 = (Unit) obj2;
                        KProperty[] kPropertyArr3 = CardReaderProductDetailsScreen.f60604e0;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        o oVar2 = (o) cardReaderProductDetailsScreen.c0.getValue();
                        oVar2.getClass();
                        oVar2.l2(new n(oVar2, null), new yi5.b(26));
                        break;
                    default:
                        FullScreenStateDelegate.Model it11 = (FullScreenStateDelegate.Model) obj2;
                        KProperty[] kPropertyArr4 = CardReaderProductDetailsScreen.f60604e0;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        o oVar3 = (o) cardReaderProductDetailsScreen.c0.getValue();
                        yji.l.a1(oVar3, rd0.e.b(xa1.a.a(oVar3.f223857p, null, 1)), null, null, new o95.c(oVar3, null, 3), 3);
                        break;
                }
                return Unit.f186387a;
            }
        });
        final int i5 = 3;
        BaseRxRecyclerViewScreen.g3(this, ((FullScreenStateDelegate) this.Z.getValue()).f52371h.f121375b, new Function1(this) { // from class: ob1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardReaderProductDetailsScreen f223845b;

            {
                this.f223845b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i5;
                CardReaderProductDetailsScreen cardReaderProductDetailsScreen = this.f223845b;
                switch (i22) {
                    case 0:
                        CardReaderProductDetailsScreenContract$ProductDetailsWidgetType widgetType = (CardReaderProductDetailsScreenContract$ProductDetailsWidgetType) obj2;
                        KProperty[] kPropertyArr = CardReaderProductDetailsScreen.f60604e0;
                        Intrinsics.checkNotNullParameter(widgetType, "productDetailsWidgetType");
                        o oVar = (o) cardReaderProductDetailsScreen.c0.getValue();
                        oVar.getClass();
                        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
                        oVar.x2(new o9h.b(widgetType, 4));
                        break;
                    case 1:
                        Unit it9 = (Unit) obj2;
                        KProperty[] kPropertyArr2 = CardReaderProductDetailsScreen.f60604e0;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        cardReaderProductDetailsScreen.m2().onBackPressed();
                        break;
                    case 2:
                        Unit it10 = (Unit) obj2;
                        KProperty[] kPropertyArr3 = CardReaderProductDetailsScreen.f60604e0;
                        Intrinsics.checkNotNullParameter(it10, "it");
                        o oVar2 = (o) cardReaderProductDetailsScreen.c0.getValue();
                        oVar2.getClass();
                        oVar2.l2(new n(oVar2, null), new yi5.b(26));
                        break;
                    default:
                        FullScreenStateDelegate.Model it11 = (FullScreenStateDelegate.Model) obj2;
                        KProperty[] kPropertyArr4 = CardReaderProductDetailsScreen.f60604e0;
                        Intrinsics.checkNotNullParameter(it11, "it");
                        o oVar3 = (o) cardReaderProductDetailsScreen.c0.getValue();
                        yji.l.a1(oVar3, rd0.e.b(xa1.a.a(oVar3.f223857p, null, 1)), null, null, new o95.c(oVar3, null, 3), 3);
                        break;
                }
                return Unit.f186387a;
            }
        });
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        LargeActionButton continueButton = i3().f14129b;
        Intrinsics.checkNotNullExpressionValue(continueButton, "continueButton");
        continueButton.setVisibility(8);
        i3().f14129b.setEnabled(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getV() {
        return (List) this.f60606b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.f60605a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final void Z2(k uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        i3().f14130c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        if ((uiState instanceof j) || (uiState instanceof i)) {
            NavBarWithToolbar navBar = i3().f14130c;
            Intrinsics.checkNotNullExpressionValue(navBar, "navBar");
            navBar.j0(false);
            LargeActionButton continueButton = i3().f14129b;
            Intrinsics.checkNotNullExpressionValue(continueButton, "continueButton");
            continueButton.setVisibility(8);
            i3().f14130c.setDescriptionVisible(false);
            h().setLayoutManager(a3(m2()));
            h().setAdapter(d3());
            return;
        }
        if (!(uiState instanceof ob1.h)) {
            throw new NoWhenBranchMatchedException();
        }
        NavBarWithToolbar navBar2 = i3().f14130c;
        Intrinsics.checkNotNullExpressionValue(navBar2, "navBar");
        navBar2.H0(false);
        NavBarWithToolbar navBar3 = i3().f14130c;
        Intrinsics.checkNotNullExpressionValue(navBar3, "navBar");
        ob1.h hVar = (ob1.h) uiState;
        TextLocalisedClause textLocalisedClause = hVar.f223852b;
        navBar3.setTitle(textLocalisedClause, null);
        i3().f14130c.setToolbarTitle(textLocalisedClause);
        i3().f14130c.setDescriptionText(hVar.f223853c);
        i3().f14130c.setDescriptionVisible(true);
        LargeActionButton continueButton2 = i3().f14129b;
        Intrinsics.checkNotNullExpressionValue(continueButton2, "continueButton");
        continueButton2.setVisibility(0);
        i3().f14129b.setEnabled(hVar.e);
        i3().f14129b.setText(hVar.d);
    }

    public final b i3() {
        ViewBinding value = this.X.getValue(this, f60604e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (b) value;
    }
}
