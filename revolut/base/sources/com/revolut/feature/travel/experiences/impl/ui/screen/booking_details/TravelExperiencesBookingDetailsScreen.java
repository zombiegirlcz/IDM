package com.revolut.feature.travel.experiences.impl.ui.screen.booking_details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsTextProgressDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileDelegate;
import com.revolut.core.ui_kit.delegates.ListingTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.MapDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RoomPreviewCardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import frl.a;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.x8;
import mzb.e;
import n1g.d;
import n1g.f;
import n1g.g;
import no.m;
import sji.b;
import te0.w;
import vc.s;
import z0g.c;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/booking_details/TravelExperiencesBookingDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ln1g/g;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/booking_details/TravelExperiencesBookingDetailsScreenContract$InputData;", "Laii/q;", "Lno/m;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesBookingDetailsScreen extends BaseRecyclerViewScreen<g, TravelExperiencesBookingDetailsScreenContract$InputData, q> implements m {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(TravelExperiencesBookingDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenExperiencesBookingDetailsBinding;", 0))};
    public final AnalyticsProduct.Retail U;
    public final int V;
    public final int W;
    public final boolean X;
    public final h Y;
    public final CellDetailsChevronDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final RowDelegate f93014a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final LargeActionButtonDelegate f93015b0;
    public final List c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f93016d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f93017e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelExperiencesBookingDetailsScreen(TravelExperiencesBookingDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.f137510y;
        this.U = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.V = R$layout.screen_experiences_booking_details;
        this.W = R$id.experiencesBookingDetails_recyclerView;
        this.X = true;
        this.Y = s.t(this, n1g.a.f);
        CellDetailsChevronDelegate cellDetailsChevronDelegate = new CellDetailsChevronDelegate();
        this.Z = cellDetailsChevronDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f93014a0 = rowDelegate;
        MapDelegate mapDelegate = new MapDelegate();
        ListingTileDelegate listingTileDelegate = new ListingTileDelegate();
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        RoomPreviewCardDelegate roomPreviewCardDelegate = new RoomPreviewCardDelegate();
        SwipeToActionDelegate swipeToActionDelegate = new SwipeToActionDelegate(rowDelegate, false);
        PlainTextWarningDelegate plainTextWarningDelegate = new PlainTextWarningDelegate();
        TextDelegate textDelegate = new TextDelegate();
        CounterTextDelegate counterTextDelegate = new CounterTextDelegate();
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.f93015b0 = largeActionButtonDelegate;
        this.c0 = v.k(new CellDetailsTextProgressDelegate(), new ListingTileLoadingDelegate(), new RowLoadingDelegate(), new ListCellDelegate(), new CellDetailsDelegate(), new CounterTextDelegate(), cellDetailsChevronDelegate, roomPreviewCardDelegate, rowDelegate, mapDelegate, listingTileDelegate, listSubheaderDelegate, swipeToActionDelegate, plainTextWarningDelegate, textDelegate, fullScreenStateDelegate, new GridBoxDelegate(u.c(counterTextDelegate), 2, BitmapDescriptorFactory.HUE_RED, 8.0f, 4), largeActionButtonDelegate);
        this.f93016d0 = w.y0(new e(this, inputData, 7));
        this.f93017e0 = w.y0(new x8(this, 15));
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (c) this.f93016d0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (f) this.f93017e0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f293692b.f59410q), null, new mta.c(this, null, 11), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f93015b0.d.f121375b), null, new n1g.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Z.f51821c), null, new n1g.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f93014a0.f53218h), null, new d(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        g3().f293692b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left));
        NavBarWithToolbar experiencesBookingDetailsNavBarWithToolbar = g3().f293692b;
        Intrinsics.checkNotNullExpressionValue(experiencesBookingDetailsNavBarWithToolbar, "experiencesBookingDetailsNavBarWithToolbar");
        experiencesBookingDetailsNavBarWithToolbar.setTitle(new TextLocalisedClause(R$string.experiences_booking_title, null, null, 14), null);
        g3().f293692b.setToolbarTitle(new TextLocalisedClause(R$string.experiences_booking_title, null, null, 14));
        ((j60.a) ((c) this.f93016d0.getValue()).e.get()).d(u.c(this.f93014a0));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF96391b0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getX() {
        return this.W;
    }

    public final w0g.b g3() {
        ViewBinding value = this.Y.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w0g.b) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
