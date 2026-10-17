package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.details.amendment;

import aeg.f;
import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import au0.f2;
import au0.m0;
import au0.u0;
import aw0.s8;
import c9g.d;
import cli.o;
import cli.q;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.details.amendment.TravelHotelsRoomDetailsAmendmentScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import g9g.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import ydg.b;
import ydg.c;
import ydg.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/room/details/amendment/TravelHotelsRoomDetailsAmendmentScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lydg/e;", "Ldli/a;", "Laeg/e;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsRoomDetailsAmendmentScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TravelHotelsRoomDetailsAmendmentScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenRoomDetailsBinding;", 0))};
    public final int K;
    public final f L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;

    public TravelHotelsRoomDetailsAmendmentScreen(TravelHotelsRoomDetailsAmendmentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_room_details;
        this.L = new f();
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ydg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsRoomDetailsAmendmentScreen f312692b;

            {
                this.f312692b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsRoomDetailsAmendmentScreen.Q;
                        TravelHotelsRoomDetailsAmendmentScreen travelHotelsRoomDetailsAmendmentScreen = this.f312692b;
                        return dli.f.a(travelHotelsRoomDetailsAmendmentScreen, travelHotelsRoomDetailsAmendmentScreen.d(), travelHotelsRoomDetailsAmendmentScreen.L.f3584b, R$id.roomDetailsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsRoomDetailsAmendmentScreen.Q;
                        return (f) ((d0) this.f312692b.O.getValue()).f141648c.get();
                }
            }
        });
        this.N = s.t(this, b.f);
        this.O = w.y0(new y1a.a(this, inputData, 20));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ydg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsRoomDetailsAmendmentScreen f312692b;

            {
                this.f312692b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsRoomDetailsAmendmentScreen.Q;
                        TravelHotelsRoomDetailsAmendmentScreen travelHotelsRoomDetailsAmendmentScreen = this.f312692b;
                        return dli.f.a(travelHotelsRoomDetailsAmendmentScreen, travelHotelsRoomDetailsAmendmentScreen.d(), travelHotelsRoomDetailsAmendmentScreen.L.f3584b, R$id.roomDetailsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsRoomDetailsAmendmentScreen.Q;
                        return (f) ((d0) this.f312692b.O.getValue()).f141648c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        aeg.e uiState = (aeg.e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d dVarD3 = d3();
        Intrinsics.checkNotNullParameter(dVarD3, "<this>");
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        LargeActionButton roomDetailsScreenButton = dVarD3.f22388b;
        Intrinsics.checkNotNullExpressionValue(roomDetailsScreenButton, "roomDetailsScreenButton");
        boolean z = uiState.f3582c;
        int iK = 0;
        roomDetailsScreenButton.setVisibility(z ? 0 : 8);
        NavBarWithBigTile roomDetailsScreenNavBarPhoto = dVarD3.f22389c;
        Intrinsics.checkNotNullExpressionValue(roomDetailsScreenNavBarPhoto, "roomDetailsScreenNavBarPhoto");
        List list = uiState.f3581b.f3579a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new u0(new NavBarWithContainerBackground.ImageBackground((Image) it8.next(), (s8) null, (Color.SolidRes) null, 14), null, null, null));
        }
        c1.S(roomDetailsScreenNavBarPhoto, arrayList, f2.COUNT_TAG, null, 4);
        ScreenContentRecyclerView roomDetailsScreenRecyclerView = dVarD3.d;
        Intrinsics.checkNotNullExpressionValue(roomDetailsScreenRecyclerView, "roomDetailsScreenRecyclerView");
        if (z) {
            Context context = dVarD3.f22388b.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iK = kli.a.k(context, 96.0f);
        }
        roomDetailsScreenRecyclerView.setPadding(roomDetailsScreenRecyclerView.getPaddingLeft(), roomDetailsScreenRecyclerView.getPaddingTop(), roomDetailsScreenRecyclerView.getPaddingRight(), iK);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d0) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d dVarD3 = d3();
        mki.b environment = q2();
        Intrinsics.checkNotNullParameter(dVarD3, "<this>");
        Intrinsics.checkNotNullParameter(environment, "environment");
        NavBarWithBigTile navBarWithBigTile = dVarD3.f22389c;
        navBarWithBigTile.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(environment)));
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.NONE);
        LargeActionButton largeActionButton = dVarD3.f22388b;
        largeActionButton.setText(new TextLocalisedClause(R$string.hotels_common_action_select, null, null, 14));
        largeActionButton.setLoadingButtonTag("BUTTON_TAG_CHECKOUT");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f22389c.f59357t), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f22388b.o), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f22389c.f59360y.f57273m), new c(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f22389c.f59360y.m0()), new c(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(this.L.f3583a.f52371h.f121375b), new ydg.d(this, null), 3);
    }

    public final d d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ydg.f d() {
        return (ydg.f) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
