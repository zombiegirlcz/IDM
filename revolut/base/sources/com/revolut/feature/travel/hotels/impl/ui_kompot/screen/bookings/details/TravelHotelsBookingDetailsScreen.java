package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
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
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RoomPreviewCardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.StaggeredGridItemDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsBookingDetailsParams;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.TravelHotelsBookingDetailsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import hbg.c;
import hbg.d;
import hbg.f;
import hbg.g;
import hbg.i;
import hbg.j;
import hbg.k;
import hbg.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/bookings/details/TravelHotelsBookingDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/bookings/details/a;", "Ldli/a;", "Lhbg/v;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsBookingDetailsScreen extends ViewController<a> implements dli.a {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f93836h0 = {o0.f186429a.j(new h0(TravelHotelsBookingDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsBookingDetailsBinding;", 0))};
    public final int K;
    public final CellDetailsChevronDelegate L;
    public final RowDelegate M;
    public final MapDelegate N;
    public final ListingTileDelegate O;
    public final ListSubheaderDelegate P;
    public final RoomPreviewCardDelegate Q;
    public final SwipeToActionDelegate R;
    public final PlainTextWarningDelegate S;
    public final TextDelegate T;
    public final ActionWidgetDelegate U;
    public final VoucherSmallTileDelegate V;
    public final ScrollerDelegate W;
    public final StaggeredGridItemDelegate X;
    public final LargeActionButtonDelegate Y;
    public final GridBoxDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final FullScreenStateDelegate f93837a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f93838b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final h f93839d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final c f93840e0;
    public final Object f0;
    public final Object g0;

    public TravelHotelsBookingDetailsScreen(TravelHotelsBookingDetailsParams inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_travel_hotels_booking_details;
        this.L = new CellDetailsChevronDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.M = rowDelegate;
        this.N = new MapDelegate();
        this.O = new ListingTileDelegate();
        this.P = new ListSubheaderDelegate();
        this.Q = new RoomPreviewCardDelegate();
        final int i = 0;
        this.R = new SwipeToActionDelegate(rowDelegate, false);
        this.S = new PlainTextWarningDelegate();
        TextDelegate textDelegate = new TextDelegate();
        this.T = textDelegate;
        this.U = new ActionWidgetDelegate();
        VoucherSmallTileDelegate voucherSmallTileDelegate = new VoucherSmallTileDelegate();
        this.V = voucherSmallTileDelegate;
        this.W = new ScrollerDelegate(u.c(voucherSmallTileDelegate), false);
        this.X = new StaggeredGridItemDelegate(voucherSmallTileDelegate);
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.Y = largeActionButtonDelegate;
        this.Z = new GridBoxDelegate(u.c(new CounterTextDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
        this.f93837a0 = new FullScreenStateDelegate();
        final int i2 = 1;
        this.f93838b0 = v.k(rowDelegate, largeActionButtonDelegate, textDelegate);
        this.c0 = w.y0(new Function0(this) { // from class: hbg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsBookingDetailsScreen f150692b;

            {
                this.f150692b = this;
            }

            /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsBookingDetailsScreen.f93836h0;
                        TravelHotelsBookingDetailsScreen travelHotelsBookingDetailsScreen = this.f150692b;
                        return dli.f.a(travelHotelsBookingDetailsScreen, travelHotelsBookingDetailsScreen.R2(), zhm.v.k(travelHotelsBookingDetailsScreen.O, new CellDetailsTextProgressDelegate(), travelHotelsBookingDetailsScreen.N, travelHotelsBookingDetailsScreen.L, travelHotelsBookingDetailsScreen.P, travelHotelsBookingDetailsScreen.Q, travelHotelsBookingDetailsScreen.R, new ListingTileLoadingDelegate(), new RowLoadingDelegate(), travelHotelsBookingDetailsScreen.S, new ListCellDelegate(), travelHotelsBookingDetailsScreen.T, travelHotelsBookingDetailsScreen.U, travelHotelsBookingDetailsScreen.M, travelHotelsBookingDetailsScreen.W, travelHotelsBookingDetailsScreen.X, travelHotelsBookingDetailsScreen.Z, travelHotelsBookingDetailsScreen.f93837a0, new PlainTextLoadingDelegate(), new CellDetailsNoteDelegate()), R$id.travelHotelsBookingDetails_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsBookingDetailsScreen.f93836h0;
                        return (t) ((g9g.h) this.f150692b.f0.getValue()).i.get();
                }
            }
        });
        this.f93839d0 = s.t(this, hbg.b.f);
        this.f93840e0 = new c(this);
        this.f0 = w.y0(new h1k.a(this, inputData, 15));
        this.g0 = w.y0(new Function0(this) { // from class: hbg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsBookingDetailsScreen f150692b;

            {
                this.f150692b = this;
            }

            /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsBookingDetailsScreen.f93836h0;
                        TravelHotelsBookingDetailsScreen travelHotelsBookingDetailsScreen = this.f150692b;
                        return dli.f.a(travelHotelsBookingDetailsScreen, travelHotelsBookingDetailsScreen.R2(), zhm.v.k(travelHotelsBookingDetailsScreen.O, new CellDetailsTextProgressDelegate(), travelHotelsBookingDetailsScreen.N, travelHotelsBookingDetailsScreen.L, travelHotelsBookingDetailsScreen.P, travelHotelsBookingDetailsScreen.Q, travelHotelsBookingDetailsScreen.R, new ListingTileLoadingDelegate(), new RowLoadingDelegate(), travelHotelsBookingDetailsScreen.S, new ListCellDelegate(), travelHotelsBookingDetailsScreen.T, travelHotelsBookingDetailsScreen.U, travelHotelsBookingDetailsScreen.M, travelHotelsBookingDetailsScreen.W, travelHotelsBookingDetailsScreen.X, travelHotelsBookingDetailsScreen.Z, travelHotelsBookingDetailsScreen.f93837a0, new PlainTextLoadingDelegate(), new CellDetailsNoteDelegate()), R$id.travelHotelsBookingDetails_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsBookingDetailsScreen.f93836h0;
                        return (t) ((g9g.h) this.f150692b.f0.getValue()).i.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        hbg.v uiState = (hbg.v) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        hbg.u uVar = qVar instanceof hbg.u ? (hbg.u) qVar : null;
        if (pd.b.k(uVar != null ? Boolean.valueOf(uVar.f150717a) : null)) {
            d3().f22393b.setMenuItems(uiState.f150720b);
        }
        if (pd.b.k(uVar != null ? Boolean.valueOf(uVar.f150718b) : null) && uiState.f150721c) {
            d3().f22394c.scrollToPosition(0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g9g.h) this.f0.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((g9g.h) this.f0.getValue()).f141682g.get()).d(this.f93838b0);
        NavBarWithToolbar navBarWithToolbar = d3().f22393b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_booking_details_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        d3().f22394c.removeOnScrollListener(this.f93840e0);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22393b.f59410q), null, new hbg.h(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f51821c), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53218h), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52762c), null, new hbg.e(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52751c), null, new hbg.e(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52707c), null, new k(this, null), 3);
        RoomPreviewCardDelegate roomPreviewCardDelegate = this.Q;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(roomPreviewCardDelegate.f), null, new hbg.e(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(roomPreviewCardDelegate.f53211c), null, new hbg.e(this, continuation, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.t()), null, new hbg.e(this, continuation, 6), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Y.d.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.U.f51589c.f121375b), null, new hbg.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.V.f53608c), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22393b.o.f57403b), null, new hbg.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f93837a0.f52371h.f121375b), null, new g(this, null), 3);
        d3().f22394c.addOnScrollListener(this.f93840e0);
    }

    public final c9g.f d3() {
        ViewBinding value = this.f93839d0.getValue(this, f93836h0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c9g.f) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final t R2() {
        return (t) this.g0.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.c0.getValue();
    }
}
