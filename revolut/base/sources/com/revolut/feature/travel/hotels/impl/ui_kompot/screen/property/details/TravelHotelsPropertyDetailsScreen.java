package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import au0.f2;
import au0.u0;
import aw0.s8;
import cli.o;
import cli.q;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionListDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsRevPointsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.MapDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.PropertyCardDelegate;
import com.revolut.core.ui_kit.delegates.ReviewCardDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.TravelHotelsPropertyDetailsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.TravelHotelsPropertyDetailsScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.a;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pdg.d;
import pdg.e;
import pdg.f;
import pdg.g;
import pdg.i;
import pdg.j;
import pdg.k;
import pdg.l;
import pdg.p;
import pdg.x;
import pdg.y;
import pdg.z;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/property/details/TravelHotelsPropertyDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpdg/p;", "Ldli/a;", "Lpdg/z;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsPropertyDetailsScreen extends ViewController<p> implements dli.a {
    public static final /* synthetic */ KProperty[] i0 = {o0.f186429a.j(new h0(TravelHotelsPropertyDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsPropertyDetailsBinding;", 0))};
    public final TravelHotelsPropertyDetailsScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f93976a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f93977b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f93978d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f93979e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f93980h0;

    public TravelHotelsPropertyDetailsScreen(TravelHotelsPropertyDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: pdg.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsPropertyDetailsScreen f235178b;

            {
                this.f235178b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelHotelsPropertyDetailsScreen travelHotelsPropertyDetailsScreen = this.f235178b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsPropertyDetailsScreen.i0;
                        return (x) ((g9g.y) travelHotelsPropertyDetailsScreen.M.getValue()).f141857p.get();
                    case 1:
                        return new ScrollerDelegate(zhm.v.k((ReviewCardDelegate) travelHotelsPropertyDetailsScreen.f93976a0.getValue(), (ActionCardDelegate) travelHotelsPropertyDetailsScreen.U.getValue()), false);
                    case 2:
                        KProperty[] kPropertyArr2 = TravelHotelsPropertyDetailsScreen.i0;
                        qji.b bVarU2 = travelHotelsPropertyDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.di.TravelHotelsPropertyDetailsScreenInjector");
                        g9g.z zVar = (g9g.z) bVarU2;
                        g9g.d dVar = zVar.f141862b;
                        g9g.z zVar2 = zVar.f141863c;
                        TravelHotelsPropertyDetailsScreenContract$InputData travelHotelsPropertyDetailsScreenContract$InputData = travelHotelsPropertyDetailsScreen.K;
                        travelHotelsPropertyDetailsScreenContract$InputData.getClass();
                        return new g9g.y(dVar, zVar2, travelHotelsPropertyDetailsScreen, travelHotelsPropertyDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsPropertyDetailsScreen.i0;
                        TravelHotelsPropertyDetailsScreen travelHotelsPropertyDetailsScreen2 = this.f235178b;
                        return dli.f.a(travelHotelsPropertyDetailsScreen2, travelHotelsPropertyDetailsScreen2.d(), zhm.v.k(new PlainTextLoadingDelegate(), new ListSubheaderLoadingDelegate(), (PropertyCardDelegate) travelHotelsPropertyDetailsScreen2.P.getValue(), (PlainTextDelegate) travelHotelsPropertyDetailsScreen2.Q.getValue(), (ListSubheaderDelegate) travelHotelsPropertyDetailsScreen2.R.getValue(), (CellDetailsActionListDelegate) travelHotelsPropertyDetailsScreen2.S.getValue(), (CellDetailsActionDelegate) travelHotelsPropertyDetailsScreen2.T.getValue(), (CellDetailsChevronDelegate) travelHotelsPropertyDetailsScreen2.V.getValue(), (MapDelegate) travelHotelsPropertyDetailsScreen2.W.getValue(), (CellDetailsBadgeDelegate) travelHotelsPropertyDetailsScreen2.X.getValue(), (TextDelegate) travelHotelsPropertyDetailsScreen2.Y.getValue(), (CellDetailsPriceDelegate) travelHotelsPropertyDetailsScreen2.Z.getValue(), (LargeActionButtonDelegate) travelHotelsPropertyDetailsScreen2.f93977b0.getValue(), (CellDetailsDelegate) travelHotelsPropertyDetailsScreen2.c0.getValue(), (RewardsGridDelegate) travelHotelsPropertyDetailsScreen2.f93978d0.getValue(), (RowDelegate) travelHotelsPropertyDetailsScreen2.f93979e0.getValue(), (ListCellDelegate) travelHotelsPropertyDetailsScreen2.f0.getValue(), (ScrollerDelegate) travelHotelsPropertyDetailsScreen2.g0.getValue(), new CellDetailsRevPointsDelegate(), new ProgressStepVerticalDelegate()), R$id.travelHotelsPropertyDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 2;
        this.M = w.y0(new Function0(this) { // from class: pdg.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsPropertyDetailsScreen f235178b;

            {
                this.f235178b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelHotelsPropertyDetailsScreen travelHotelsPropertyDetailsScreen = this.f235178b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsPropertyDetailsScreen.i0;
                        return (x) ((g9g.y) travelHotelsPropertyDetailsScreen.M.getValue()).f141857p.get();
                    case 1:
                        return new ScrollerDelegate(zhm.v.k((ReviewCardDelegate) travelHotelsPropertyDetailsScreen.f93976a0.getValue(), (ActionCardDelegate) travelHotelsPropertyDetailsScreen.U.getValue()), false);
                    case 2:
                        KProperty[] kPropertyArr2 = TravelHotelsPropertyDetailsScreen.i0;
                        qji.b bVarU2 = travelHotelsPropertyDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.di.TravelHotelsPropertyDetailsScreenInjector");
                        g9g.z zVar = (g9g.z) bVarU2;
                        g9g.d dVar = zVar.f141862b;
                        g9g.z zVar2 = zVar.f141863c;
                        TravelHotelsPropertyDetailsScreenContract$InputData travelHotelsPropertyDetailsScreenContract$InputData = travelHotelsPropertyDetailsScreen.K;
                        travelHotelsPropertyDetailsScreenContract$InputData.getClass();
                        return new g9g.y(dVar, zVar2, travelHotelsPropertyDetailsScreen, travelHotelsPropertyDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsPropertyDetailsScreen.i0;
                        TravelHotelsPropertyDetailsScreen travelHotelsPropertyDetailsScreen2 = this.f235178b;
                        return dli.f.a(travelHotelsPropertyDetailsScreen2, travelHotelsPropertyDetailsScreen2.d(), zhm.v.k(new PlainTextLoadingDelegate(), new ListSubheaderLoadingDelegate(), (PropertyCardDelegate) travelHotelsPropertyDetailsScreen2.P.getValue(), (PlainTextDelegate) travelHotelsPropertyDetailsScreen2.Q.getValue(), (ListSubheaderDelegate) travelHotelsPropertyDetailsScreen2.R.getValue(), (CellDetailsActionListDelegate) travelHotelsPropertyDetailsScreen2.S.getValue(), (CellDetailsActionDelegate) travelHotelsPropertyDetailsScreen2.T.getValue(), (CellDetailsChevronDelegate) travelHotelsPropertyDetailsScreen2.V.getValue(), (MapDelegate) travelHotelsPropertyDetailsScreen2.W.getValue(), (CellDetailsBadgeDelegate) travelHotelsPropertyDetailsScreen2.X.getValue(), (TextDelegate) travelHotelsPropertyDetailsScreen2.Y.getValue(), (CellDetailsPriceDelegate) travelHotelsPropertyDetailsScreen2.Z.getValue(), (LargeActionButtonDelegate) travelHotelsPropertyDetailsScreen2.f93977b0.getValue(), (CellDetailsDelegate) travelHotelsPropertyDetailsScreen2.c0.getValue(), (RewardsGridDelegate) travelHotelsPropertyDetailsScreen2.f93978d0.getValue(), (RowDelegate) travelHotelsPropertyDetailsScreen2.f93979e0.getValue(), (ListCellDelegate) travelHotelsPropertyDetailsScreen2.f0.getValue(), (ScrollerDelegate) travelHotelsPropertyDetailsScreen2.g0.getValue(), new CellDetailsRevPointsDelegate(), new ProgressStepVerticalDelegate()), R$id.travelHotelsPropertyDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = R$layout.screen_travel_hotels_property_details;
        this.O = s.t(this, e.f);
        this.P = w.y0(new p0l.a(26));
        this.Q = w.y0(new p0l.a(27));
        this.R = w.y0(new p0l.a(28));
        this.S = w.y0(new p0l.a(29));
        this.T = w.y0(new d(0));
        this.U = w.y0(new d(1));
        this.V = w.y0(new d(2));
        this.W = w.y0(new d(4));
        this.X = w.y0(new d(3));
        this.Y = w.y0(new d(5));
        this.Z = w.y0(new d(6));
        this.f93976a0 = w.y0(new d(7));
        this.f93977b0 = w.y0(new d(8));
        this.c0 = w.y0(new d(9));
        this.f93978d0 = w.y0(new d(10));
        this.f93979e0 = w.y0(new d(11));
        this.f0 = w.y0(new d(12));
        final int i3 = 1;
        this.g0 = w.y0(new Function0(this) { // from class: pdg.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsPropertyDetailsScreen f235178b;

            {
                this.f235178b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelHotelsPropertyDetailsScreen travelHotelsPropertyDetailsScreen = this.f235178b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsPropertyDetailsScreen.i0;
                        return (x) ((g9g.y) travelHotelsPropertyDetailsScreen.M.getValue()).f141857p.get();
                    case 1:
                        return new ScrollerDelegate(zhm.v.k((ReviewCardDelegate) travelHotelsPropertyDetailsScreen.f93976a0.getValue(), (ActionCardDelegate) travelHotelsPropertyDetailsScreen.U.getValue()), false);
                    case 2:
                        KProperty[] kPropertyArr2 = TravelHotelsPropertyDetailsScreen.i0;
                        qji.b bVarU2 = travelHotelsPropertyDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.di.TravelHotelsPropertyDetailsScreenInjector");
                        g9g.z zVar = (g9g.z) bVarU2;
                        g9g.d dVar = zVar.f141862b;
                        g9g.z zVar2 = zVar.f141863c;
                        TravelHotelsPropertyDetailsScreenContract$InputData travelHotelsPropertyDetailsScreenContract$InputData = travelHotelsPropertyDetailsScreen.K;
                        travelHotelsPropertyDetailsScreenContract$InputData.getClass();
                        return new g9g.y(dVar, zVar2, travelHotelsPropertyDetailsScreen, travelHotelsPropertyDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsPropertyDetailsScreen.i0;
                        TravelHotelsPropertyDetailsScreen travelHotelsPropertyDetailsScreen2 = this.f235178b;
                        return dli.f.a(travelHotelsPropertyDetailsScreen2, travelHotelsPropertyDetailsScreen2.d(), zhm.v.k(new PlainTextLoadingDelegate(), new ListSubheaderLoadingDelegate(), (PropertyCardDelegate) travelHotelsPropertyDetailsScreen2.P.getValue(), (PlainTextDelegate) travelHotelsPropertyDetailsScreen2.Q.getValue(), (ListSubheaderDelegate) travelHotelsPropertyDetailsScreen2.R.getValue(), (CellDetailsActionListDelegate) travelHotelsPropertyDetailsScreen2.S.getValue(), (CellDetailsActionDelegate) travelHotelsPropertyDetailsScreen2.T.getValue(), (CellDetailsChevronDelegate) travelHotelsPropertyDetailsScreen2.V.getValue(), (MapDelegate) travelHotelsPropertyDetailsScreen2.W.getValue(), (CellDetailsBadgeDelegate) travelHotelsPropertyDetailsScreen2.X.getValue(), (TextDelegate) travelHotelsPropertyDetailsScreen2.Y.getValue(), (CellDetailsPriceDelegate) travelHotelsPropertyDetailsScreen2.Z.getValue(), (LargeActionButtonDelegate) travelHotelsPropertyDetailsScreen2.f93977b0.getValue(), (CellDetailsDelegate) travelHotelsPropertyDetailsScreen2.c0.getValue(), (RewardsGridDelegate) travelHotelsPropertyDetailsScreen2.f93978d0.getValue(), (RowDelegate) travelHotelsPropertyDetailsScreen2.f93979e0.getValue(), (ListCellDelegate) travelHotelsPropertyDetailsScreen2.f0.getValue(), (ScrollerDelegate) travelHotelsPropertyDetailsScreen2.g0.getValue(), new CellDetailsRevPointsDelegate(), new ProgressStepVerticalDelegate()), R$id.travelHotelsPropertyDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.f93980h0 = w.y0(new Function0(this) { // from class: pdg.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsPropertyDetailsScreen f235178b;

            {
                this.f235178b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TravelHotelsPropertyDetailsScreen travelHotelsPropertyDetailsScreen = this.f235178b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsPropertyDetailsScreen.i0;
                        return (x) ((g9g.y) travelHotelsPropertyDetailsScreen.M.getValue()).f141857p.get();
                    case 1:
                        return new ScrollerDelegate(zhm.v.k((ReviewCardDelegate) travelHotelsPropertyDetailsScreen.f93976a0.getValue(), (ActionCardDelegate) travelHotelsPropertyDetailsScreen.U.getValue()), false);
                    case 2:
                        KProperty[] kPropertyArr2 = TravelHotelsPropertyDetailsScreen.i0;
                        qji.b bVarU2 = travelHotelsPropertyDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.di.TravelHotelsPropertyDetailsScreenInjector");
                        g9g.z zVar = (g9g.z) bVarU2;
                        g9g.d dVar = zVar.f141862b;
                        g9g.z zVar2 = zVar.f141863c;
                        TravelHotelsPropertyDetailsScreenContract$InputData travelHotelsPropertyDetailsScreenContract$InputData = travelHotelsPropertyDetailsScreen.K;
                        travelHotelsPropertyDetailsScreenContract$InputData.getClass();
                        return new g9g.y(dVar, zVar2, travelHotelsPropertyDetailsScreen, travelHotelsPropertyDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TravelHotelsPropertyDetailsScreen.i0;
                        TravelHotelsPropertyDetailsScreen travelHotelsPropertyDetailsScreen2 = this.f235178b;
                        return dli.f.a(travelHotelsPropertyDetailsScreen2, travelHotelsPropertyDetailsScreen2.d(), zhm.v.k(new PlainTextLoadingDelegate(), new ListSubheaderLoadingDelegate(), (PropertyCardDelegate) travelHotelsPropertyDetailsScreen2.P.getValue(), (PlainTextDelegate) travelHotelsPropertyDetailsScreen2.Q.getValue(), (ListSubheaderDelegate) travelHotelsPropertyDetailsScreen2.R.getValue(), (CellDetailsActionListDelegate) travelHotelsPropertyDetailsScreen2.S.getValue(), (CellDetailsActionDelegate) travelHotelsPropertyDetailsScreen2.T.getValue(), (CellDetailsChevronDelegate) travelHotelsPropertyDetailsScreen2.V.getValue(), (MapDelegate) travelHotelsPropertyDetailsScreen2.W.getValue(), (CellDetailsBadgeDelegate) travelHotelsPropertyDetailsScreen2.X.getValue(), (TextDelegate) travelHotelsPropertyDetailsScreen2.Y.getValue(), (CellDetailsPriceDelegate) travelHotelsPropertyDetailsScreen2.Z.getValue(), (LargeActionButtonDelegate) travelHotelsPropertyDetailsScreen2.f93977b0.getValue(), (CellDetailsDelegate) travelHotelsPropertyDetailsScreen2.c0.getValue(), (RewardsGridDelegate) travelHotelsPropertyDetailsScreen2.f93978d0.getValue(), (RowDelegate) travelHotelsPropertyDetailsScreen2.f93979e0.getValue(), (ListCellDelegate) travelHotelsPropertyDetailsScreen2.f0.getValue(), (ScrollerDelegate) travelHotelsPropertyDetailsScreen2.g0.getValue(), new CellDetailsRevPointsDelegate(), new ProgressStepVerticalDelegate()), R$id.travelHotelsPropertyDetails_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        z uiState = (z) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        y yVar = qVar instanceof y ? (y) qVar : null;
        dli.a.z0(uiState);
        if (pd.b.k(yVar != null ? Boolean.valueOf(yVar.f235221a) : null)) {
            NavBarWithBigTile travelHotelsPropertyDetailsNavBarWithBigTile = d3().f22418b;
            Intrinsics.checkNotNullExpressionValue(travelHotelsPropertyDetailsNavBarWithBigTile, "travelHotelsPropertyDetailsNavBarWithBigTile");
            List list = uiState.f235225b.f235210a;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(new u0(new NavBarWithContainerBackground.ImageBackground((Image) it8.next(), (s8) null, (Color.SolidRes) null, 14), null, null, null));
            }
            c1.S(travelHotelsPropertyDetailsNavBarWithBigTile, arrayList, f2.COUNT_TAG, null, 4);
        }
        if (pd.b.k(yVar != null ? Boolean.valueOf(yVar.f235223c) : null)) {
            d3().f22418b.setMenuItems(uiState.d);
        }
        if (pd.b.k(yVar != null ? Boolean.valueOf(yVar.f235222b) : null)) {
            a aVar = uiState.f235226c;
            if (aVar instanceof a.c) {
                LargeActionButton largeActionButton = d3().f22419c;
                largeActionButton.setVisibility(0);
                largeActionButton.setProgressVisible(false);
                largeActionButton.setIcon(null);
                largeActionButton.setText(((a.c) aVar).f93986a);
                return;
            }
            if (aVar instanceof a.C0570a) {
                LargeActionButton travelHotelsPropertyDetailsNextButton = d3().f22419c;
                Intrinsics.checkNotNullExpressionValue(travelHotelsPropertyDetailsNextButton, "travelHotelsPropertyDetailsNextButton");
                travelHotelsPropertyDetailsNextButton.setVisibility(8);
            } else {
                if (!(aVar instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                d3().f22419c.setProgressVisible(true);
                LargeActionButton travelHotelsPropertyDetailsNextButton2 = d3().f22419c;
                Intrinsics.checkNotNullExpressionValue(travelHotelsPropertyDetailsNextButton2, "travelHotelsPropertyDetailsNextButton");
                travelHotelsPropertyDetailsNextButton2.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g9g.y) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((g9g.y) this.M.getValue()).e.get()).d(v.k((CellDetailsDelegate) this.c0.getValue(), (LargeActionButtonDelegate) this.f93977b0.getValue(), new RowDelegate(null, null, 7)));
        d3().f22418b.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_left, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v49, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v55, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22418b.f59357t), null, new pdg.h(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22418b.f59360y.m0()), null, new pdg.h(this, continuation, 1), 3);
        int i = 2;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22419c.o), null, new pdg.h(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f22418b.b()), null, new f(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsChevronDelegate) this.V.getValue()).f51821c), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ListSubheaderDelegate) this.R.getValue()).f52707c), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsActionListDelegate) this.S.getValue()).f51795c), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsActionDelegate) this.T.getValue()).d), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PropertyCardDelegate) this.P.getValue()).f53119c.f121375b), null, new f(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((MapDelegate) this.W.getValue()).f52762c), null, new f(this, continuation, 0), 3);
        ?? r56 = this.X;
        com.revolut.kompot.navigable.a.g2(this, wp5.y.x(((CellDetailsBadgeDelegate) r56.getValue()).f51819c.f121375b, ((CellDetailsBadgeDelegate) r56.getValue()).d.f121375b, "mergeWith(...)"), null, new f(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.f93977b0.getValue()).d.f121375b), null, new g(this, null), 3);
    }

    public final c9g.p d3() {
        ViewBinding value = this.O.getValue(this, i0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c9g.p) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final x d() {
        return (x) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.f93980h0.getValue();
    }
}
