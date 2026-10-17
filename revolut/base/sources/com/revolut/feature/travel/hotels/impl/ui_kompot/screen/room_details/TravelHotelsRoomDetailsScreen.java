package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room_details;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import au0.c1;
import au0.f2;
import au0.m0;
import au0.u0;
import aw0.s8;
import c9g.d;
import cli.o;
import cli.q;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardDelegate;
import com.revolut.core.ui_kit.delegates.PropertyCardDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room_details.TravelHotelsRoomDetailsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import g9g.f0;
import gaa.g;
import geg.b;
import geg.c;
import geg.h;
import geg.i;
import geg.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/room_details/TravelHotelsRoomDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgeg/h;", "Ldli/a;", "Lgeg/j;", "Companion", "a", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsRoomDetailsScreen extends ViewController<h> implements dli.a {
    public final int K;
    public final ListingCardDelegate L;
    public final Object M;
    public final ao.h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TravelHotelsRoomDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenRoomDetailsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room_details.TravelHotelsRoomDetailsScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public TravelHotelsRoomDetailsScreen(TravelHotelsRoomDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_room_details;
        this.L = new ListingCardDelegate();
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: geg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsRoomDetailsScreen f143286b;

            {
                this.f143286b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelHotelsRoomDetailsScreen travelHotelsRoomDetailsScreen = this.f143286b;
                switch (i2) {
                    case 0:
                        TravelHotelsRoomDetailsScreen.Companion companion = TravelHotelsRoomDetailsScreen.INSTANCE;
                        TravelHotelsRoomDetailsScreen travelHotelsRoomDetailsScreen2 = this.f143286b;
                        return dli.f.a(travelHotelsRoomDetailsScreen2, travelHotelsRoomDetailsScreen2.d(), v.k(new PropertyCardDelegate(), new ListCellDelegate(), travelHotelsRoomDetailsScreen2.L), R$id.roomDetailsScreen_recyclerView, null, null, null, 56);
                    case 1:
                        TravelHotelsRoomDetailsScreen.Companion companion2 = TravelHotelsRoomDetailsScreen.INSTANCE;
                        return (i) ((f0) travelHotelsRoomDetailsScreen.O.getValue()).e.get();
                    default:
                        TravelHotelsRoomDetailsScreen.Companion companion3 = TravelHotelsRoomDetailsScreen.INSTANCE;
                        Context context = travelHotelsRoomDetailsScreen.D2().getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        return Integer.valueOf(kli.a.k(context, 96.0f));
                }
            }
        });
        this.N = s.t(this, b.f);
        this.O = w.y0(new fx5.a(this, inputData, 26));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: geg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsRoomDetailsScreen f143286b;

            {
                this.f143286b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelHotelsRoomDetailsScreen travelHotelsRoomDetailsScreen = this.f143286b;
                switch (i22) {
                    case 0:
                        TravelHotelsRoomDetailsScreen.Companion companion = TravelHotelsRoomDetailsScreen.INSTANCE;
                        TravelHotelsRoomDetailsScreen travelHotelsRoomDetailsScreen2 = this.f143286b;
                        return dli.f.a(travelHotelsRoomDetailsScreen2, travelHotelsRoomDetailsScreen2.d(), v.k(new PropertyCardDelegate(), new ListCellDelegate(), travelHotelsRoomDetailsScreen2.L), R$id.roomDetailsScreen_recyclerView, null, null, null, 56);
                    case 1:
                        TravelHotelsRoomDetailsScreen.Companion companion2 = TravelHotelsRoomDetailsScreen.INSTANCE;
                        return (i) ((f0) travelHotelsRoomDetailsScreen.O.getValue()).e.get();
                    default:
                        TravelHotelsRoomDetailsScreen.Companion companion3 = TravelHotelsRoomDetailsScreen.INSTANCE;
                        Context context = travelHotelsRoomDetailsScreen.D2().getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        return Integer.valueOf(kli.a.k(context, 96.0f));
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: geg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsRoomDetailsScreen f143286b;

            {
                this.f143286b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelHotelsRoomDetailsScreen travelHotelsRoomDetailsScreen = this.f143286b;
                switch (i22) {
                    case 0:
                        TravelHotelsRoomDetailsScreen.Companion companion = TravelHotelsRoomDetailsScreen.INSTANCE;
                        TravelHotelsRoomDetailsScreen travelHotelsRoomDetailsScreen2 = this.f143286b;
                        return dli.f.a(travelHotelsRoomDetailsScreen2, travelHotelsRoomDetailsScreen2.d(), v.k(new PropertyCardDelegate(), new ListCellDelegate(), travelHotelsRoomDetailsScreen2.L), R$id.roomDetailsScreen_recyclerView, null, null, null, 56);
                    case 1:
                        TravelHotelsRoomDetailsScreen.Companion companion2 = TravelHotelsRoomDetailsScreen.INSTANCE;
                        return (i) ((f0) travelHotelsRoomDetailsScreen.O.getValue()).e.get();
                    default:
                        TravelHotelsRoomDetailsScreen.Companion companion3 = TravelHotelsRoomDetailsScreen.INSTANCE;
                        Context context = travelHotelsRoomDetailsScreen.D2().getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        return Integer.valueOf(kli.a.k(context, 96.0f));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d dVarD3 = d3();
        LargeActionButton roomDetailsScreenButton = dVarD3.f22388b;
        Intrinsics.checkNotNullExpressionValue(roomDetailsScreenButton, "roomDetailsScreenButton");
        boolean z = uiState.f143294c;
        roomDetailsScreenButton.setVisibility(z ? 0 : 8);
        NavBarWithBigTile roomDetailsScreenNavBarPhoto = dVarD3.f22389c;
        Intrinsics.checkNotNullExpressionValue(roomDetailsScreenNavBarPhoto, "roomDetailsScreenNavBarPhoto");
        ArrayList arrayList = uiState.f143293b.f143289a;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(new u0(new NavBarWithContainerBackground.ImageBackground((Image) it8.next(), (s8) null, (Color.SolidRes) null, 14), null, null, null));
        }
        c1.S(roomDetailsScreenNavBarPhoto, arrayList2, f2.COUNT_TAG, null, 4);
        ScreenContentRecyclerView roomDetailsScreenRecyclerView = dVarD3.d;
        Intrinsics.checkNotNullExpressionValue(roomDetailsScreenRecyclerView, "roomDetailsScreenRecyclerView");
        roomDetailsScreenRecyclerView.setPadding(roomDetailsScreenRecyclerView.getPaddingLeft(), roomDetailsScreenRecyclerView.getPaddingTop(), roomDetailsScreenRecyclerView.getPaddingRight(), z ? ((Number) this.Q.getValue()).intValue() : 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f0) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f22389c;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.NONE);
        LargeActionButton largeActionButton = d3().f22388b;
        largeActionButton.setText(new TextLocalisedClause(R$string.hotels_common_action_select, null, null, 14));
        largeActionButton.setLoadingButtonTag("BUTTON_TAG_CHECKOUT");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22389c.f59357t), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22388b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22389c.f59360y.f57273m), null, new c(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22389c.f59360y.m0()), null, new c(this, null, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f), null, new g(this, null, 15), 3);
    }

    public final d d3() {
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
