package com.revolut.feature.corporate_events.impl.ui.screen.home;

import aii.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ap3.f;
import avk.j;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CalendarRowDelegate;
import com.revolut.core.ui_kit.delegates.CalendarRowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.corporate_events.impl.R$layout;
import com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreen;
import com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreenContract$Input;
import com.revolut.feature.corporate_events.impl.ui.screen.home.a;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.wealth.resources.R$string;
import efm.r;
import hl7.ma;
import hp3.c;
import hp3.d;
import hp3.g;
import hp3.i;
import hp3.n;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/corporate_events/impl/ui/screen/home/CorporateEventsHomeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lhp3/o;", "Companion", "a", "feature_corporate_events_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CorporateEventsHomeScreen extends ViewController<q> implements dli.a {
    public final CorporateEventsHomeScreenContract$Input K;
    public final boolean L;
    public final int M;
    public final h N;
    public final Object O;
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
    public final Object f66130a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ihm.b f66131b0;
    public int c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f66132d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public a f66133e0;
    public Integer f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f66134h0;
    public final Object i0;
    public final Object j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f66135k0;
    public final Object l0;
    public final j m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f66129n0 = {o0.f186429a.j(new h0(CorporateEventsHomeScreen.class, "binding", "getBinding()Lcom/revolut/feature/corporate_events/impl/databinding/ScreenCorporateEventsHomeBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public CorporateEventsHomeScreen(CorporateEventsHomeScreenContract$Input inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = true;
        this.M = R$layout.screen_corporate_events_home;
        this.N = s.t(this, hp3.b.f);
        this.O = w.y0(new ma(4));
        this.P = w.y0(new ma(5));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: hp3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorporateEventsHomeScreen f154400b;

            {
                this.f154400b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CorporateEventsHomeScreen corporateEventsHomeScreen = this.f154400b;
                switch (i2) {
                    case 0:
                        CorporateEventsHomeScreen.Companion companion = CorporateEventsHomeScreen.INSTANCE;
                        return new SwipeToActionDelegate((RowDelegate) corporateEventsHomeScreen.O.getValue(), false);
                    case 1:
                        CorporateEventsHomeScreen.Companion companion2 = CorporateEventsHomeScreen.INSTANCE;
                        FormsActionButton formsActionButton = corporateEventsHomeScreen.d3().d;
                        formsActionButton.setAlpha(BitmapDescriptorFactory.HUE_RED);
                        return formsActionButton;
                    case 2:
                        CorporateEventsHomeScreen.Companion companion3 = CorporateEventsHomeScreen.INSTANCE;
                        return zhm.v.k((RowDelegate) corporateEventsHomeScreen.O.getValue(), (TextDelegate) corporateEventsHomeScreen.P.getValue(), (RowLoadingDelegate) corporateEventsHomeScreen.R.getValue(), (ListSubheaderDelegate) corporateEventsHomeScreen.T.getValue(), (SwipeToActionDelegate) corporateEventsHomeScreen.Q.getValue(), (FullScreenStateDelegate) corporateEventsHomeScreen.U.getValue(), (HeaderLoadingDelegate) corporateEventsHomeScreen.S.getValue(), (LargeActionButtonDelegate) corporateEventsHomeScreen.X.getValue(), (CalendarRowDelegate) corporateEventsHomeScreen.V.getValue(), new CalendarRowLoadingDelegate());
                    case 3:
                        CorporateEventsHomeScreen.Companion companion4 = CorporateEventsHomeScreen.INSTANCE;
                        return zhm.v.k((CellDetailsDelegate) corporateEventsHomeScreen.W.getValue(), (LargeActionButtonDelegate) corporateEventsHomeScreen.X.getValue(), (TextDelegate) corporateEventsHomeScreen.P.getValue(), (TwinHorizontalButtonDelegate) corporateEventsHomeScreen.Y.getValue(), (ListSubheaderDelegate) corporateEventsHomeScreen.T.getValue(), (DatePickerDelegate) corporateEventsHomeScreen.Z.getValue());
                    case 4:
                        CorporateEventsHomeScreen.Companion companion5 = CorporateEventsHomeScreen.INSTANCE;
                        CorporateEventsHomeScreen corporateEventsHomeScreen2 = this.f154400b;
                        qji.b bVarU2 = corporateEventsHomeScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreenInjector");
                        ap3.e eVar = (ap3.e) bVarU2;
                        ap3.h hVar = eVar.f8068b;
                        ap3.e eVar2 = eVar.f8069c;
                        ScreenContentRecyclerView corporateEventsHomeRecyclerView = corporateEventsHomeScreen2.d3().f307593c;
                        Intrinsics.checkNotNullExpressionValue(corporateEventsHomeRecyclerView, "corporateEventsHomeRecyclerView");
                        CorporateEventsHomeScreenContract$Input corporateEventsHomeScreenContract$Input = corporateEventsHomeScreen2.K;
                        corporateEventsHomeScreenContract$Input.getClass();
                        avk.j jVar = corporateEventsHomeScreen2.m0;
                        jVar.getClass();
                        return new ap3.f(hVar, eVar2, corporateEventsHomeScreen2, corporateEventsHomeRecyclerView, corporateEventsHomeScreenContract$Input, jVar);
                    case 5:
                        CorporateEventsHomeScreen.Companion companion6 = CorporateEventsHomeScreen.INSTANCE;
                        return (n) ((ap3.f) corporateEventsHomeScreen.i0.getValue()).f8081r.get();
                    case 6:
                        CorporateEventsHomeScreen.Companion companion7 = CorporateEventsHomeScreen.INSTANCE;
                        CorporateEventsHomeScreen corporateEventsHomeScreen3 = this.f154400b;
                        n nVarR2 = corporateEventsHomeScreen3.R2();
                        List list = (List) corporateEventsHomeScreen3.g0.getValue();
                        int id10 = corporateEventsHomeScreen3.d3().f307593c.getId();
                        koi.c delegatesManager = new koi.c(0);
                        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
                        return dli.f.a(corporateEventsHomeScreen3, nVarR2, list, id10, null, new no0.a(delegatesManager, false, true, true), null, 40);
                    default:
                        CorporateEventsHomeScreen.Companion companion8 = CorporateEventsHomeScreen.INSTANCE;
                        return (t60.b) ((ap3.f) corporateEventsHomeScreen.i0.getValue()).f.get();
                }
            }
        });
        this.R = w.y0(new ma(6));
        this.S = w.y0(new ma(7));
        this.T = w.y0(new ma(8));
        this.U = w.y0(new ma(9));
        this.V = w.y0(new ma(10));
        this.W = w.y0(new ma(11));
        this.X = w.y0(new ma(12));
        this.Y = w.y0(new ma(13));
        this.Z = w.y0(new ma(14));
        final int i2 = 1;
        this.f66130a0 = w.y0(new Function0(this) { // from class: hp3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorporateEventsHomeScreen f154400b;

            {
                this.f154400b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CorporateEventsHomeScreen corporateEventsHomeScreen = this.f154400b;
                switch (i22) {
                    case 0:
                        CorporateEventsHomeScreen.Companion companion = CorporateEventsHomeScreen.INSTANCE;
                        return new SwipeToActionDelegate((RowDelegate) corporateEventsHomeScreen.O.getValue(), false);
                    case 1:
                        CorporateEventsHomeScreen.Companion companion2 = CorporateEventsHomeScreen.INSTANCE;
                        FormsActionButton formsActionButton = corporateEventsHomeScreen.d3().d;
                        formsActionButton.setAlpha(BitmapDescriptorFactory.HUE_RED);
                        return formsActionButton;
                    case 2:
                        CorporateEventsHomeScreen.Companion companion3 = CorporateEventsHomeScreen.INSTANCE;
                        return zhm.v.k((RowDelegate) corporateEventsHomeScreen.O.getValue(), (TextDelegate) corporateEventsHomeScreen.P.getValue(), (RowLoadingDelegate) corporateEventsHomeScreen.R.getValue(), (ListSubheaderDelegate) corporateEventsHomeScreen.T.getValue(), (SwipeToActionDelegate) corporateEventsHomeScreen.Q.getValue(), (FullScreenStateDelegate) corporateEventsHomeScreen.U.getValue(), (HeaderLoadingDelegate) corporateEventsHomeScreen.S.getValue(), (LargeActionButtonDelegate) corporateEventsHomeScreen.X.getValue(), (CalendarRowDelegate) corporateEventsHomeScreen.V.getValue(), new CalendarRowLoadingDelegate());
                    case 3:
                        CorporateEventsHomeScreen.Companion companion4 = CorporateEventsHomeScreen.INSTANCE;
                        return zhm.v.k((CellDetailsDelegate) corporateEventsHomeScreen.W.getValue(), (LargeActionButtonDelegate) corporateEventsHomeScreen.X.getValue(), (TextDelegate) corporateEventsHomeScreen.P.getValue(), (TwinHorizontalButtonDelegate) corporateEventsHomeScreen.Y.getValue(), (ListSubheaderDelegate) corporateEventsHomeScreen.T.getValue(), (DatePickerDelegate) corporateEventsHomeScreen.Z.getValue());
                    case 4:
                        CorporateEventsHomeScreen.Companion companion5 = CorporateEventsHomeScreen.INSTANCE;
                        CorporateEventsHomeScreen corporateEventsHomeScreen2 = this.f154400b;
                        qji.b bVarU2 = corporateEventsHomeScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreenInjector");
                        ap3.e eVar = (ap3.e) bVarU2;
                        ap3.h hVar = eVar.f8068b;
                        ap3.e eVar2 = eVar.f8069c;
                        ScreenContentRecyclerView corporateEventsHomeRecyclerView = corporateEventsHomeScreen2.d3().f307593c;
                        Intrinsics.checkNotNullExpressionValue(corporateEventsHomeRecyclerView, "corporateEventsHomeRecyclerView");
                        CorporateEventsHomeScreenContract$Input corporateEventsHomeScreenContract$Input = corporateEventsHomeScreen2.K;
                        corporateEventsHomeScreenContract$Input.getClass();
                        avk.j jVar = corporateEventsHomeScreen2.m0;
                        jVar.getClass();
                        return new ap3.f(hVar, eVar2, corporateEventsHomeScreen2, corporateEventsHomeRecyclerView, corporateEventsHomeScreenContract$Input, jVar);
                    case 5:
                        CorporateEventsHomeScreen.Companion companion6 = CorporateEventsHomeScreen.INSTANCE;
                        return (n) ((ap3.f) corporateEventsHomeScreen.i0.getValue()).f8081r.get();
                    case 6:
                        CorporateEventsHomeScreen.Companion companion7 = CorporateEventsHomeScreen.INSTANCE;
                        CorporateEventsHomeScreen corporateEventsHomeScreen3 = this.f154400b;
                        n nVarR2 = corporateEventsHomeScreen3.R2();
                        List list = (List) corporateEventsHomeScreen3.g0.getValue();
                        int id10 = corporateEventsHomeScreen3.d3().f307593c.getId();
                        koi.c delegatesManager = new koi.c(0);
                        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
                        return dli.f.a(corporateEventsHomeScreen3, nVarR2, list, id10, null, new no0.a(delegatesManager, false, true, true), null, 40);
                    default:
                        CorporateEventsHomeScreen.Companion companion8 = CorporateEventsHomeScreen.INSTANCE;
                        return (t60.b) ((ap3.f) corporateEventsHomeScreen.i0.getValue()).f.get();
                }
            }
        });
        this.f66131b0 = j6.a.h("create(...)");
        this.f66132d0 = true;
        this.f66133e0 = a.C0469a.f66137a;
        final int i3 = 2;
        this.g0 = w.y0(new Function0(this) { // from class: hp3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorporateEventsHomeScreen f154400b;

            {
                this.f154400b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CorporateEventsHomeScreen corporateEventsHomeScreen = this.f154400b;
                switch (i22) {
                    case 0:
                        CorporateEventsHomeScreen.Companion companion = CorporateEventsHomeScreen.INSTANCE;
                        return new SwipeToActionDelegate((RowDelegate) corporateEventsHomeScreen.O.getValue(), false);
                    case 1:
                        CorporateEventsHomeScreen.Companion companion2 = CorporateEventsHomeScreen.INSTANCE;
                        FormsActionButton formsActionButton = corporateEventsHomeScreen.d3().d;
                        formsActionButton.setAlpha(BitmapDescriptorFactory.HUE_RED);
                        return formsActionButton;
                    case 2:
                        CorporateEventsHomeScreen.Companion companion3 = CorporateEventsHomeScreen.INSTANCE;
                        return zhm.v.k((RowDelegate) corporateEventsHomeScreen.O.getValue(), (TextDelegate) corporateEventsHomeScreen.P.getValue(), (RowLoadingDelegate) corporateEventsHomeScreen.R.getValue(), (ListSubheaderDelegate) corporateEventsHomeScreen.T.getValue(), (SwipeToActionDelegate) corporateEventsHomeScreen.Q.getValue(), (FullScreenStateDelegate) corporateEventsHomeScreen.U.getValue(), (HeaderLoadingDelegate) corporateEventsHomeScreen.S.getValue(), (LargeActionButtonDelegate) corporateEventsHomeScreen.X.getValue(), (CalendarRowDelegate) corporateEventsHomeScreen.V.getValue(), new CalendarRowLoadingDelegate());
                    case 3:
                        CorporateEventsHomeScreen.Companion companion4 = CorporateEventsHomeScreen.INSTANCE;
                        return zhm.v.k((CellDetailsDelegate) corporateEventsHomeScreen.W.getValue(), (LargeActionButtonDelegate) corporateEventsHomeScreen.X.getValue(), (TextDelegate) corporateEventsHomeScreen.P.getValue(), (TwinHorizontalButtonDelegate) corporateEventsHomeScreen.Y.getValue(), (ListSubheaderDelegate) corporateEventsHomeScreen.T.getValue(), (DatePickerDelegate) corporateEventsHomeScreen.Z.getValue());
                    case 4:
                        CorporateEventsHomeScreen.Companion companion5 = CorporateEventsHomeScreen.INSTANCE;
                        CorporateEventsHomeScreen corporateEventsHomeScreen2 = this.f154400b;
                        qji.b bVarU2 = corporateEventsHomeScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreenInjector");
                        ap3.e eVar = (ap3.e) bVarU2;
                        ap3.h hVar = eVar.f8068b;
                        ap3.e eVar2 = eVar.f8069c;
                        ScreenContentRecyclerView corporateEventsHomeRecyclerView = corporateEventsHomeScreen2.d3().f307593c;
                        Intrinsics.checkNotNullExpressionValue(corporateEventsHomeRecyclerView, "corporateEventsHomeRecyclerView");
                        CorporateEventsHomeScreenContract$Input corporateEventsHomeScreenContract$Input = corporateEventsHomeScreen2.K;
                        corporateEventsHomeScreenContract$Input.getClass();
                        avk.j jVar = corporateEventsHomeScreen2.m0;
                        jVar.getClass();
                        return new ap3.f(hVar, eVar2, corporateEventsHomeScreen2, corporateEventsHomeRecyclerView, corporateEventsHomeScreenContract$Input, jVar);
                    case 5:
                        CorporateEventsHomeScreen.Companion companion6 = CorporateEventsHomeScreen.INSTANCE;
                        return (n) ((ap3.f) corporateEventsHomeScreen.i0.getValue()).f8081r.get();
                    case 6:
                        CorporateEventsHomeScreen.Companion companion7 = CorporateEventsHomeScreen.INSTANCE;
                        CorporateEventsHomeScreen corporateEventsHomeScreen3 = this.f154400b;
                        n nVarR2 = corporateEventsHomeScreen3.R2();
                        List list = (List) corporateEventsHomeScreen3.g0.getValue();
                        int id10 = corporateEventsHomeScreen3.d3().f307593c.getId();
                        koi.c delegatesManager = new koi.c(0);
                        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
                        return dli.f.a(corporateEventsHomeScreen3, nVarR2, list, id10, null, new no0.a(delegatesManager, false, true, true), null, 40);
                    default:
                        CorporateEventsHomeScreen.Companion companion8 = CorporateEventsHomeScreen.INSTANCE;
                        return (t60.b) ((ap3.f) corporateEventsHomeScreen.i0.getValue()).f.get();
                }
            }
        });
        final int i5 = 3;
        this.f66134h0 = w.y0(new Function0(this) { // from class: hp3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorporateEventsHomeScreen f154400b;

            {
                this.f154400b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CorporateEventsHomeScreen corporateEventsHomeScreen = this.f154400b;
                switch (i22) {
                    case 0:
                        CorporateEventsHomeScreen.Companion companion = CorporateEventsHomeScreen.INSTANCE;
                        return new SwipeToActionDelegate((RowDelegate) corporateEventsHomeScreen.O.getValue(), false);
                    case 1:
                        CorporateEventsHomeScreen.Companion companion2 = CorporateEventsHomeScreen.INSTANCE;
                        FormsActionButton formsActionButton = corporateEventsHomeScreen.d3().d;
                        formsActionButton.setAlpha(BitmapDescriptorFactory.HUE_RED);
                        return formsActionButton;
                    case 2:
                        CorporateEventsHomeScreen.Companion companion3 = CorporateEventsHomeScreen.INSTANCE;
                        return zhm.v.k((RowDelegate) corporateEventsHomeScreen.O.getValue(), (TextDelegate) corporateEventsHomeScreen.P.getValue(), (RowLoadingDelegate) corporateEventsHomeScreen.R.getValue(), (ListSubheaderDelegate) corporateEventsHomeScreen.T.getValue(), (SwipeToActionDelegate) corporateEventsHomeScreen.Q.getValue(), (FullScreenStateDelegate) corporateEventsHomeScreen.U.getValue(), (HeaderLoadingDelegate) corporateEventsHomeScreen.S.getValue(), (LargeActionButtonDelegate) corporateEventsHomeScreen.X.getValue(), (CalendarRowDelegate) corporateEventsHomeScreen.V.getValue(), new CalendarRowLoadingDelegate());
                    case 3:
                        CorporateEventsHomeScreen.Companion companion4 = CorporateEventsHomeScreen.INSTANCE;
                        return zhm.v.k((CellDetailsDelegate) corporateEventsHomeScreen.W.getValue(), (LargeActionButtonDelegate) corporateEventsHomeScreen.X.getValue(), (TextDelegate) corporateEventsHomeScreen.P.getValue(), (TwinHorizontalButtonDelegate) corporateEventsHomeScreen.Y.getValue(), (ListSubheaderDelegate) corporateEventsHomeScreen.T.getValue(), (DatePickerDelegate) corporateEventsHomeScreen.Z.getValue());
                    case 4:
                        CorporateEventsHomeScreen.Companion companion5 = CorporateEventsHomeScreen.INSTANCE;
                        CorporateEventsHomeScreen corporateEventsHomeScreen2 = this.f154400b;
                        qji.b bVarU2 = corporateEventsHomeScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreenInjector");
                        ap3.e eVar = (ap3.e) bVarU2;
                        ap3.h hVar = eVar.f8068b;
                        ap3.e eVar2 = eVar.f8069c;
                        ScreenContentRecyclerView corporateEventsHomeRecyclerView = corporateEventsHomeScreen2.d3().f307593c;
                        Intrinsics.checkNotNullExpressionValue(corporateEventsHomeRecyclerView, "corporateEventsHomeRecyclerView");
                        CorporateEventsHomeScreenContract$Input corporateEventsHomeScreenContract$Input = corporateEventsHomeScreen2.K;
                        corporateEventsHomeScreenContract$Input.getClass();
                        avk.j jVar = corporateEventsHomeScreen2.m0;
                        jVar.getClass();
                        return new ap3.f(hVar, eVar2, corporateEventsHomeScreen2, corporateEventsHomeRecyclerView, corporateEventsHomeScreenContract$Input, jVar);
                    case 5:
                        CorporateEventsHomeScreen.Companion companion6 = CorporateEventsHomeScreen.INSTANCE;
                        return (n) ((ap3.f) corporateEventsHomeScreen.i0.getValue()).f8081r.get();
                    case 6:
                        CorporateEventsHomeScreen.Companion companion7 = CorporateEventsHomeScreen.INSTANCE;
                        CorporateEventsHomeScreen corporateEventsHomeScreen3 = this.f154400b;
                        n nVarR2 = corporateEventsHomeScreen3.R2();
                        List list = (List) corporateEventsHomeScreen3.g0.getValue();
                        int id10 = corporateEventsHomeScreen3.d3().f307593c.getId();
                        koi.c delegatesManager = new koi.c(0);
                        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
                        return dli.f.a(corporateEventsHomeScreen3, nVarR2, list, id10, null, new no0.a(delegatesManager, false, true, true), null, 40);
                    default:
                        CorporateEventsHomeScreen.Companion companion8 = CorporateEventsHomeScreen.INSTANCE;
                        return (t60.b) ((ap3.f) corporateEventsHomeScreen.i0.getValue()).f.get();
                }
            }
        });
        final int i6 = 4;
        this.i0 = w.y0(new Function0(this) { // from class: hp3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorporateEventsHomeScreen f154400b;

            {
                this.f154400b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                CorporateEventsHomeScreen corporateEventsHomeScreen = this.f154400b;
                switch (i22) {
                    case 0:
                        CorporateEventsHomeScreen.Companion companion = CorporateEventsHomeScreen.INSTANCE;
                        return new SwipeToActionDelegate((RowDelegate) corporateEventsHomeScreen.O.getValue(), false);
                    case 1:
                        CorporateEventsHomeScreen.Companion companion2 = CorporateEventsHomeScreen.INSTANCE;
                        FormsActionButton formsActionButton = corporateEventsHomeScreen.d3().d;
                        formsActionButton.setAlpha(BitmapDescriptorFactory.HUE_RED);
                        return formsActionButton;
                    case 2:
                        CorporateEventsHomeScreen.Companion companion3 = CorporateEventsHomeScreen.INSTANCE;
                        return zhm.v.k((RowDelegate) corporateEventsHomeScreen.O.getValue(), (TextDelegate) corporateEventsHomeScreen.P.getValue(), (RowLoadingDelegate) corporateEventsHomeScreen.R.getValue(), (ListSubheaderDelegate) corporateEventsHomeScreen.T.getValue(), (SwipeToActionDelegate) corporateEventsHomeScreen.Q.getValue(), (FullScreenStateDelegate) corporateEventsHomeScreen.U.getValue(), (HeaderLoadingDelegate) corporateEventsHomeScreen.S.getValue(), (LargeActionButtonDelegate) corporateEventsHomeScreen.X.getValue(), (CalendarRowDelegate) corporateEventsHomeScreen.V.getValue(), new CalendarRowLoadingDelegate());
                    case 3:
                        CorporateEventsHomeScreen.Companion companion4 = CorporateEventsHomeScreen.INSTANCE;
                        return zhm.v.k((CellDetailsDelegate) corporateEventsHomeScreen.W.getValue(), (LargeActionButtonDelegate) corporateEventsHomeScreen.X.getValue(), (TextDelegate) corporateEventsHomeScreen.P.getValue(), (TwinHorizontalButtonDelegate) corporateEventsHomeScreen.Y.getValue(), (ListSubheaderDelegate) corporateEventsHomeScreen.T.getValue(), (DatePickerDelegate) corporateEventsHomeScreen.Z.getValue());
                    case 4:
                        CorporateEventsHomeScreen.Companion companion5 = CorporateEventsHomeScreen.INSTANCE;
                        CorporateEventsHomeScreen corporateEventsHomeScreen2 = this.f154400b;
                        qji.b bVarU2 = corporateEventsHomeScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreenInjector");
                        ap3.e eVar = (ap3.e) bVarU2;
                        ap3.h hVar = eVar.f8068b;
                        ap3.e eVar2 = eVar.f8069c;
                        ScreenContentRecyclerView corporateEventsHomeRecyclerView = corporateEventsHomeScreen2.d3().f307593c;
                        Intrinsics.checkNotNullExpressionValue(corporateEventsHomeRecyclerView, "corporateEventsHomeRecyclerView");
                        CorporateEventsHomeScreenContract$Input corporateEventsHomeScreenContract$Input = corporateEventsHomeScreen2.K;
                        corporateEventsHomeScreenContract$Input.getClass();
                        avk.j jVar = corporateEventsHomeScreen2.m0;
                        jVar.getClass();
                        return new ap3.f(hVar, eVar2, corporateEventsHomeScreen2, corporateEventsHomeRecyclerView, corporateEventsHomeScreenContract$Input, jVar);
                    case 5:
                        CorporateEventsHomeScreen.Companion companion6 = CorporateEventsHomeScreen.INSTANCE;
                        return (n) ((ap3.f) corporateEventsHomeScreen.i0.getValue()).f8081r.get();
                    case 6:
                        CorporateEventsHomeScreen.Companion companion7 = CorporateEventsHomeScreen.INSTANCE;
                        CorporateEventsHomeScreen corporateEventsHomeScreen3 = this.f154400b;
                        n nVarR2 = corporateEventsHomeScreen3.R2();
                        List list = (List) corporateEventsHomeScreen3.g0.getValue();
                        int id10 = corporateEventsHomeScreen3.d3().f307593c.getId();
                        koi.c delegatesManager = new koi.c(0);
                        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
                        return dli.f.a(corporateEventsHomeScreen3, nVarR2, list, id10, null, new no0.a(delegatesManager, false, true, true), null, 40);
                    default:
                        CorporateEventsHomeScreen.Companion companion8 = CorporateEventsHomeScreen.INSTANCE;
                        return (t60.b) ((ap3.f) corporateEventsHomeScreen.i0.getValue()).f.get();
                }
            }
        });
        final int i21 = 5;
        this.j0 = w.y0(new Function0(this) { // from class: hp3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorporateEventsHomeScreen f154400b;

            {
                this.f154400b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                CorporateEventsHomeScreen corporateEventsHomeScreen = this.f154400b;
                switch (i22) {
                    case 0:
                        CorporateEventsHomeScreen.Companion companion = CorporateEventsHomeScreen.INSTANCE;
                        return new SwipeToActionDelegate((RowDelegate) corporateEventsHomeScreen.O.getValue(), false);
                    case 1:
                        CorporateEventsHomeScreen.Companion companion2 = CorporateEventsHomeScreen.INSTANCE;
                        FormsActionButton formsActionButton = corporateEventsHomeScreen.d3().d;
                        formsActionButton.setAlpha(BitmapDescriptorFactory.HUE_RED);
                        return formsActionButton;
                    case 2:
                        CorporateEventsHomeScreen.Companion companion3 = CorporateEventsHomeScreen.INSTANCE;
                        return zhm.v.k((RowDelegate) corporateEventsHomeScreen.O.getValue(), (TextDelegate) corporateEventsHomeScreen.P.getValue(), (RowLoadingDelegate) corporateEventsHomeScreen.R.getValue(), (ListSubheaderDelegate) corporateEventsHomeScreen.T.getValue(), (SwipeToActionDelegate) corporateEventsHomeScreen.Q.getValue(), (FullScreenStateDelegate) corporateEventsHomeScreen.U.getValue(), (HeaderLoadingDelegate) corporateEventsHomeScreen.S.getValue(), (LargeActionButtonDelegate) corporateEventsHomeScreen.X.getValue(), (CalendarRowDelegate) corporateEventsHomeScreen.V.getValue(), new CalendarRowLoadingDelegate());
                    case 3:
                        CorporateEventsHomeScreen.Companion companion4 = CorporateEventsHomeScreen.INSTANCE;
                        return zhm.v.k((CellDetailsDelegate) corporateEventsHomeScreen.W.getValue(), (LargeActionButtonDelegate) corporateEventsHomeScreen.X.getValue(), (TextDelegate) corporateEventsHomeScreen.P.getValue(), (TwinHorizontalButtonDelegate) corporateEventsHomeScreen.Y.getValue(), (ListSubheaderDelegate) corporateEventsHomeScreen.T.getValue(), (DatePickerDelegate) corporateEventsHomeScreen.Z.getValue());
                    case 4:
                        CorporateEventsHomeScreen.Companion companion5 = CorporateEventsHomeScreen.INSTANCE;
                        CorporateEventsHomeScreen corporateEventsHomeScreen2 = this.f154400b;
                        qji.b bVarU2 = corporateEventsHomeScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreenInjector");
                        ap3.e eVar = (ap3.e) bVarU2;
                        ap3.h hVar = eVar.f8068b;
                        ap3.e eVar2 = eVar.f8069c;
                        ScreenContentRecyclerView corporateEventsHomeRecyclerView = corporateEventsHomeScreen2.d3().f307593c;
                        Intrinsics.checkNotNullExpressionValue(corporateEventsHomeRecyclerView, "corporateEventsHomeRecyclerView");
                        CorporateEventsHomeScreenContract$Input corporateEventsHomeScreenContract$Input = corporateEventsHomeScreen2.K;
                        corporateEventsHomeScreenContract$Input.getClass();
                        avk.j jVar = corporateEventsHomeScreen2.m0;
                        jVar.getClass();
                        return new ap3.f(hVar, eVar2, corporateEventsHomeScreen2, corporateEventsHomeRecyclerView, corporateEventsHomeScreenContract$Input, jVar);
                    case 5:
                        CorporateEventsHomeScreen.Companion companion6 = CorporateEventsHomeScreen.INSTANCE;
                        return (n) ((ap3.f) corporateEventsHomeScreen.i0.getValue()).f8081r.get();
                    case 6:
                        CorporateEventsHomeScreen.Companion companion7 = CorporateEventsHomeScreen.INSTANCE;
                        CorporateEventsHomeScreen corporateEventsHomeScreen3 = this.f154400b;
                        n nVarR2 = corporateEventsHomeScreen3.R2();
                        List list = (List) corporateEventsHomeScreen3.g0.getValue();
                        int id10 = corporateEventsHomeScreen3.d3().f307593c.getId();
                        koi.c delegatesManager = new koi.c(0);
                        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
                        return dli.f.a(corporateEventsHomeScreen3, nVarR2, list, id10, null, new no0.a(delegatesManager, false, true, true), null, 40);
                    default:
                        CorporateEventsHomeScreen.Companion companion8 = CorporateEventsHomeScreen.INSTANCE;
                        return (t60.b) ((ap3.f) corporateEventsHomeScreen.i0.getValue()).f.get();
                }
            }
        });
        final int i22 = 6;
        this.f66135k0 = w.y0(new Function0(this) { // from class: hp3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorporateEventsHomeScreen f154400b;

            {
                this.f154400b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i22;
                CorporateEventsHomeScreen corporateEventsHomeScreen = this.f154400b;
                switch (i222) {
                    case 0:
                        CorporateEventsHomeScreen.Companion companion = CorporateEventsHomeScreen.INSTANCE;
                        return new SwipeToActionDelegate((RowDelegate) corporateEventsHomeScreen.O.getValue(), false);
                    case 1:
                        CorporateEventsHomeScreen.Companion companion2 = CorporateEventsHomeScreen.INSTANCE;
                        FormsActionButton formsActionButton = corporateEventsHomeScreen.d3().d;
                        formsActionButton.setAlpha(BitmapDescriptorFactory.HUE_RED);
                        return formsActionButton;
                    case 2:
                        CorporateEventsHomeScreen.Companion companion3 = CorporateEventsHomeScreen.INSTANCE;
                        return zhm.v.k((RowDelegate) corporateEventsHomeScreen.O.getValue(), (TextDelegate) corporateEventsHomeScreen.P.getValue(), (RowLoadingDelegate) corporateEventsHomeScreen.R.getValue(), (ListSubheaderDelegate) corporateEventsHomeScreen.T.getValue(), (SwipeToActionDelegate) corporateEventsHomeScreen.Q.getValue(), (FullScreenStateDelegate) corporateEventsHomeScreen.U.getValue(), (HeaderLoadingDelegate) corporateEventsHomeScreen.S.getValue(), (LargeActionButtonDelegate) corporateEventsHomeScreen.X.getValue(), (CalendarRowDelegate) corporateEventsHomeScreen.V.getValue(), new CalendarRowLoadingDelegate());
                    case 3:
                        CorporateEventsHomeScreen.Companion companion4 = CorporateEventsHomeScreen.INSTANCE;
                        return zhm.v.k((CellDetailsDelegate) corporateEventsHomeScreen.W.getValue(), (LargeActionButtonDelegate) corporateEventsHomeScreen.X.getValue(), (TextDelegate) corporateEventsHomeScreen.P.getValue(), (TwinHorizontalButtonDelegate) corporateEventsHomeScreen.Y.getValue(), (ListSubheaderDelegate) corporateEventsHomeScreen.T.getValue(), (DatePickerDelegate) corporateEventsHomeScreen.Z.getValue());
                    case 4:
                        CorporateEventsHomeScreen.Companion companion5 = CorporateEventsHomeScreen.INSTANCE;
                        CorporateEventsHomeScreen corporateEventsHomeScreen2 = this.f154400b;
                        qji.b bVarU2 = corporateEventsHomeScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreenInjector");
                        ap3.e eVar = (ap3.e) bVarU2;
                        ap3.h hVar = eVar.f8068b;
                        ap3.e eVar2 = eVar.f8069c;
                        ScreenContentRecyclerView corporateEventsHomeRecyclerView = corporateEventsHomeScreen2.d3().f307593c;
                        Intrinsics.checkNotNullExpressionValue(corporateEventsHomeRecyclerView, "corporateEventsHomeRecyclerView");
                        CorporateEventsHomeScreenContract$Input corporateEventsHomeScreenContract$Input = corporateEventsHomeScreen2.K;
                        corporateEventsHomeScreenContract$Input.getClass();
                        avk.j jVar = corporateEventsHomeScreen2.m0;
                        jVar.getClass();
                        return new ap3.f(hVar, eVar2, corporateEventsHomeScreen2, corporateEventsHomeRecyclerView, corporateEventsHomeScreenContract$Input, jVar);
                    case 5:
                        CorporateEventsHomeScreen.Companion companion6 = CorporateEventsHomeScreen.INSTANCE;
                        return (n) ((ap3.f) corporateEventsHomeScreen.i0.getValue()).f8081r.get();
                    case 6:
                        CorporateEventsHomeScreen.Companion companion7 = CorporateEventsHomeScreen.INSTANCE;
                        CorporateEventsHomeScreen corporateEventsHomeScreen3 = this.f154400b;
                        n nVarR2 = corporateEventsHomeScreen3.R2();
                        List list = (List) corporateEventsHomeScreen3.g0.getValue();
                        int id10 = corporateEventsHomeScreen3.d3().f307593c.getId();
                        koi.c delegatesManager = new koi.c(0);
                        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
                        return dli.f.a(corporateEventsHomeScreen3, nVarR2, list, id10, null, new no0.a(delegatesManager, false, true, true), null, 40);
                    default:
                        CorporateEventsHomeScreen.Companion companion8 = CorporateEventsHomeScreen.INSTANCE;
                        return (t60.b) ((ap3.f) corporateEventsHomeScreen.i0.getValue()).f.get();
                }
            }
        });
        final int i32 = 7;
        this.l0 = w.y0(new Function0(this) { // from class: hp3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorporateEventsHomeScreen f154400b;

            {
                this.f154400b = this;
            }

            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i222 = i32;
                CorporateEventsHomeScreen corporateEventsHomeScreen = this.f154400b;
                switch (i222) {
                    case 0:
                        CorporateEventsHomeScreen.Companion companion = CorporateEventsHomeScreen.INSTANCE;
                        return new SwipeToActionDelegate((RowDelegate) corporateEventsHomeScreen.O.getValue(), false);
                    case 1:
                        CorporateEventsHomeScreen.Companion companion2 = CorporateEventsHomeScreen.INSTANCE;
                        FormsActionButton formsActionButton = corporateEventsHomeScreen.d3().d;
                        formsActionButton.setAlpha(BitmapDescriptorFactory.HUE_RED);
                        return formsActionButton;
                    case 2:
                        CorporateEventsHomeScreen.Companion companion3 = CorporateEventsHomeScreen.INSTANCE;
                        return zhm.v.k((RowDelegate) corporateEventsHomeScreen.O.getValue(), (TextDelegate) corporateEventsHomeScreen.P.getValue(), (RowLoadingDelegate) corporateEventsHomeScreen.R.getValue(), (ListSubheaderDelegate) corporateEventsHomeScreen.T.getValue(), (SwipeToActionDelegate) corporateEventsHomeScreen.Q.getValue(), (FullScreenStateDelegate) corporateEventsHomeScreen.U.getValue(), (HeaderLoadingDelegate) corporateEventsHomeScreen.S.getValue(), (LargeActionButtonDelegate) corporateEventsHomeScreen.X.getValue(), (CalendarRowDelegate) corporateEventsHomeScreen.V.getValue(), new CalendarRowLoadingDelegate());
                    case 3:
                        CorporateEventsHomeScreen.Companion companion4 = CorporateEventsHomeScreen.INSTANCE;
                        return zhm.v.k((CellDetailsDelegate) corporateEventsHomeScreen.W.getValue(), (LargeActionButtonDelegate) corporateEventsHomeScreen.X.getValue(), (TextDelegate) corporateEventsHomeScreen.P.getValue(), (TwinHorizontalButtonDelegate) corporateEventsHomeScreen.Y.getValue(), (ListSubheaderDelegate) corporateEventsHomeScreen.T.getValue(), (DatePickerDelegate) corporateEventsHomeScreen.Z.getValue());
                    case 4:
                        CorporateEventsHomeScreen.Companion companion5 = CorporateEventsHomeScreen.INSTANCE;
                        CorporateEventsHomeScreen corporateEventsHomeScreen2 = this.f154400b;
                        qji.b bVarU2 = corporateEventsHomeScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreenInjector");
                        ap3.e eVar = (ap3.e) bVarU2;
                        ap3.h hVar = eVar.f8068b;
                        ap3.e eVar2 = eVar.f8069c;
                        ScreenContentRecyclerView corporateEventsHomeRecyclerView = corporateEventsHomeScreen2.d3().f307593c;
                        Intrinsics.checkNotNullExpressionValue(corporateEventsHomeRecyclerView, "corporateEventsHomeRecyclerView");
                        CorporateEventsHomeScreenContract$Input corporateEventsHomeScreenContract$Input = corporateEventsHomeScreen2.K;
                        corporateEventsHomeScreenContract$Input.getClass();
                        avk.j jVar = corporateEventsHomeScreen2.m0;
                        jVar.getClass();
                        return new ap3.f(hVar, eVar2, corporateEventsHomeScreen2, corporateEventsHomeRecyclerView, corporateEventsHomeScreenContract$Input, jVar);
                    case 5:
                        CorporateEventsHomeScreen.Companion companion6 = CorporateEventsHomeScreen.INSTANCE;
                        return (n) ((ap3.f) corporateEventsHomeScreen.i0.getValue()).f8081r.get();
                    case 6:
                        CorporateEventsHomeScreen.Companion companion7 = CorporateEventsHomeScreen.INSTANCE;
                        CorporateEventsHomeScreen corporateEventsHomeScreen3 = this.f154400b;
                        n nVarR2 = corporateEventsHomeScreen3.R2();
                        List list = (List) corporateEventsHomeScreen3.g0.getValue();
                        int id10 = corporateEventsHomeScreen3.d3().f307593c.getId();
                        koi.c delegatesManager = new koi.c(0);
                        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
                        return dli.f.a(corporateEventsHomeScreen3, nVarR2, list, id10, null, new no0.a(delegatesManager, false, true, true), null, 40);
                    default:
                        CorporateEventsHomeScreen.Companion companion8 = CorporateEventsHomeScreen.INSTANCE;
                        return (t60.b) ((ap3.f) corporateEventsHomeScreen.i0.getValue()).f.get();
                }
            }
        });
        this.m0 = new j(this, 10);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        hp3.o uiState = (hp3.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        this.c0++;
        NavBarWithToolbar navBarWithToolbar = d3().f307592b;
        navBarWithToolbar.setTitle(uiState.f154422a, null);
        navBarWithToolbar.setToolbarTitle(uiState.f154422a);
        navBarWithToolbar.setMenuItems(uiState.f154423b);
        boolean z = uiState.i;
        this.f66132d0 = z;
        if (!z) {
            d3().e.setVisibility(8);
        } else if (!d3().f307592b.f59421x0) {
            d3().e.setVisibility(0);
        }
        d3().e.setItems(uiState.d, uiState.e);
        this.f0 = uiState.f154425g;
        h3(uiState.f, uiState.f154426h);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.i0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f307592b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.wealth_stocks_search, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(false);
        ((j60.a) ((f) this.i0.getValue()).f8075j.get()).d((List) this.f66134h0.getValue());
    }

    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v55, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().e.f), new c(this, continuation, 5), 3);
        ViewController.P2(this, rd0.e.b(d3().f307592b.f59410q), new d(this, continuation, 2), 3);
        ViewController.P2(this, kii.e.t(((CalendarRowDelegate) this.V.getValue()).f, "hide(...)"), new hp3.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsDelegate) this.W.getValue()).e), new hp3.f(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.U.getValue()).f52371h.f121375b), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(((LargeActionButtonDelegate) this.X.getValue()).d.f121375b), new hp3.h(this, null), 3);
        ?? r102 = this.Y;
        ViewController.P2(this, rd0.e.b(((TwinHorizontalButtonDelegate) r102.getValue()).f53572c.f121375b), new c(this, continuation, 6), 3);
        ViewController.P2(this, rd0.e.b(((TwinHorizontalButtonDelegate) r102.getValue()).d.f121375b), new c(this, continuation, 7), 3);
        ViewController.P2(this, rd0.e.b(d3().f307592b.o.f57403b), new c(this, continuation, 8), 3);
        ihm.f fVar = d3().f307592b.f59409p.f57337m;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        r rVarDebounce = fVar.debounce(300L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(rVarDebounce, "debounce(...)");
        r rVarFilter = o70.a.f(rVarDebounce).filter(new hje.e(new hg4.a(this, 26), 26));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        int i = 0;
        ViewController.P2(this, rd0.e.b(rVarFilter), new c(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(d3().f307592b.f59409p.f57336l), new d(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(((t60.g) ((t60.b) this.l0.getValue())).d), new c(this, continuation, 1), 3);
        ?? r103 = this.Z;
        ViewController.P2(this, rd0.e.b(((DatePickerDelegate) r103.getValue()).f52176c.f121375b), new c(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(((DatePickerDelegate) r103.getValue()).d.f121375b), new c(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(g3().f58987s), new d(this, continuation, 1), 3);
        r<Long> rVarInterval = r.interval(200L, 300L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(rVarInterval, "interval(...)");
        r rVarFilter2 = o70.a.f(rVarInterval).cast(Object.class).mergeWith(this.f66131b0).map(new hje.e(this, 27)).filter(new hje.e(new hmc.a(29), 28));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter2), new c(this, continuation, 4), 3);
    }

    public final xo3.b d3() {
        ViewBinding value = this.N.getValue(this, f66129n0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (xo3.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n R2() {
        return (n) this.j0.getValue();
    }

    public final ScreenContentRecyclerView f3() {
        ScreenContentRecyclerView corporateEventsHomeRecyclerView = d3().f307593c;
        Intrinsics.checkNotNullExpressionValue(corporateEventsHomeRecyclerView, "corporateEventsHomeRecyclerView");
        return corporateEventsHomeRecyclerView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final FormsActionButton g3() {
        return (FormsActionButton) this.f66130a0.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    public final void h3(Integer num, boolean z) {
        int i = this.c0;
        if (num != null) {
            Integer num2 = z ? num : null;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                RecyclerView.Adapter adapter = f3().getAdapter();
                Integer num3 = (adapter != null ? adapter.getItemCount() : 0) > iIntValue ? num2 : null;
                if (num3 != null) {
                    int iIntValue2 = num3.intValue();
                    f3().addOnLayoutChangeListener(new i(this, i, num, z));
                    RecyclerView.LayoutManager layoutManager = f3().getLayoutManager();
                    if (!(layoutManager instanceof LinearLayoutManager)) {
                        f3().scrollToPosition(iIntValue2);
                        return;
                    }
                    Context context = f3().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R$attr.uikit_dp32});
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
                    typedArrayObtainStyledAttributes.recycle();
                    ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(iIntValue2, dimensionPixelSize);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f66135k0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
