package com.revolut.feature.shops.impl.ui.map_view;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import au0.s4;
import cli.a0;
import cli.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.LargeVoucherTileDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shops.impl.R$dimen;
import com.revolut.feature.shops.impl.R$layout;
import com.revolut.feature.shops.impl.R$string;
import com.revolut.feature.shops.impl.ui.map_view.ShopsMapViewScreen;
import com.revolut.feature.shops.impl.ui.map_view.ShopsMapViewScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import did.m;
import java.util.List;
import jo0.g;
import kjd.h;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.p5;
import tx0.d0;
import vc.s;
import vkm.q;
import yhm.j;
import yp0.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/map_view/ShopsMapViewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkjd/h;", "Lcli/w;", "Lkjd/k;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShopsMapViewScreen extends ViewController<h> implements w {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(ShopsMapViewScreen.class, "binding", "getBinding()Lcom/revolut/feature/shops/impl/databinding/ScreenShopsMapViewBinding;", 0))};
    public final ShopsMapViewScreenContract$InputData K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final ao.h Q;
    public final Lazy R;
    public final Lazy S;
    public final NotificationCentreItemDelegate T;
    public final Lazy U;
    public ValueAnimator V;
    public ofm.h W;

    public ShopsMapViewScreen(ShopsMapViewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: kjd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsMapViewScreen f184366b;

            {
                this.f184366b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ShopsMapViewScreen shopsMapViewScreen = this.f184366b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ShopsMapViewScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(shopsMapViewScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                        }
                        did.d dVar = ((did.d) aVar2.b()).f115008y;
                        ShopsMapViewScreenContract$InputData shopsMapViewScreenContract$InputData = shopsMapViewScreen.K;
                        shopsMapViewScreenContract$InputData.getClass();
                        return new did.m(dVar, shopsMapViewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ShopsMapViewScreen.X;
                        return (j) ((did.m) shopsMapViewScreen.L.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ShopsMapViewScreen.X;
                        return n14.e.a(shopsMapViewScreen, shopsMapViewScreen.d());
                    case 3:
                        KProperty[] kPropertyArr4 = ShopsMapViewScreen.X;
                        return (on.a) ((did.m) shopsMapViewScreen.L.getValue()).f115042g.get();
                    case 4:
                        KProperty[] kPropertyArr5 = ShopsMapViewScreen.X;
                        return new ScrollerDelegate(u.c((LargeVoucherTileDelegate) shopsMapViewScreen.R.getValue()), false);
                    default:
                        KProperty[] kPropertyArr6 = ShopsMapViewScreen.X;
                        return new z4l.j(7, v.k((ScrollerDelegate) shopsMapViewScreen.S.getValue(), shopsMapViewScreen.T), false);
                }
            }
        });
        this.M = R$layout.screen_shops_map_view;
        final int i2 = 1;
        this.N = te0.w.y0(new Function0(this) { // from class: kjd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsMapViewScreen f184366b;

            {
                this.f184366b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ShopsMapViewScreen shopsMapViewScreen = this.f184366b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ShopsMapViewScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(shopsMapViewScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                        }
                        did.d dVar = ((did.d) aVar2.b()).f115008y;
                        ShopsMapViewScreenContract$InputData shopsMapViewScreenContract$InputData = shopsMapViewScreen.K;
                        shopsMapViewScreenContract$InputData.getClass();
                        return new did.m(dVar, shopsMapViewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ShopsMapViewScreen.X;
                        return (j) ((did.m) shopsMapViewScreen.L.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ShopsMapViewScreen.X;
                        return n14.e.a(shopsMapViewScreen, shopsMapViewScreen.d());
                    case 3:
                        KProperty[] kPropertyArr4 = ShopsMapViewScreen.X;
                        return (on.a) ((did.m) shopsMapViewScreen.L.getValue()).f115042g.get();
                    case 4:
                        KProperty[] kPropertyArr5 = ShopsMapViewScreen.X;
                        return new ScrollerDelegate(u.c((LargeVoucherTileDelegate) shopsMapViewScreen.R.getValue()), false);
                    default:
                        KProperty[] kPropertyArr6 = ShopsMapViewScreen.X;
                        return new z4l.j(7, v.k((ScrollerDelegate) shopsMapViewScreen.S.getValue(), shopsMapViewScreen.T), false);
                }
            }
        });
        final int i3 = 2;
        this.O = te0.w.y0(new Function0(this) { // from class: kjd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsMapViewScreen f184366b;

            {
                this.f184366b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ShopsMapViewScreen shopsMapViewScreen = this.f184366b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ShopsMapViewScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(shopsMapViewScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                        }
                        did.d dVar = ((did.d) aVar2.b()).f115008y;
                        ShopsMapViewScreenContract$InputData shopsMapViewScreenContract$InputData = shopsMapViewScreen.K;
                        shopsMapViewScreenContract$InputData.getClass();
                        return new did.m(dVar, shopsMapViewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ShopsMapViewScreen.X;
                        return (j) ((did.m) shopsMapViewScreen.L.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ShopsMapViewScreen.X;
                        return n14.e.a(shopsMapViewScreen, shopsMapViewScreen.d());
                    case 3:
                        KProperty[] kPropertyArr4 = ShopsMapViewScreen.X;
                        return (on.a) ((did.m) shopsMapViewScreen.L.getValue()).f115042g.get();
                    case 4:
                        KProperty[] kPropertyArr5 = ShopsMapViewScreen.X;
                        return new ScrollerDelegate(u.c((LargeVoucherTileDelegate) shopsMapViewScreen.R.getValue()), false);
                    default:
                        KProperty[] kPropertyArr6 = ShopsMapViewScreen.X;
                        return new z4l.j(7, v.k((ScrollerDelegate) shopsMapViewScreen.S.getValue(), shopsMapViewScreen.T), false);
                }
            }
        });
        final int i5 = 3;
        this.P = te0.w.y0(new Function0(this) { // from class: kjd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsMapViewScreen f184366b;

            {
                this.f184366b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ShopsMapViewScreen shopsMapViewScreen = this.f184366b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ShopsMapViewScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(shopsMapViewScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                        }
                        did.d dVar = ((did.d) aVar2.b()).f115008y;
                        ShopsMapViewScreenContract$InputData shopsMapViewScreenContract$InputData = shopsMapViewScreen.K;
                        shopsMapViewScreenContract$InputData.getClass();
                        return new did.m(dVar, shopsMapViewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ShopsMapViewScreen.X;
                        return (j) ((did.m) shopsMapViewScreen.L.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ShopsMapViewScreen.X;
                        return n14.e.a(shopsMapViewScreen, shopsMapViewScreen.d());
                    case 3:
                        KProperty[] kPropertyArr4 = ShopsMapViewScreen.X;
                        return (on.a) ((did.m) shopsMapViewScreen.L.getValue()).f115042g.get();
                    case 4:
                        KProperty[] kPropertyArr5 = ShopsMapViewScreen.X;
                        return new ScrollerDelegate(u.c((LargeVoucherTileDelegate) shopsMapViewScreen.R.getValue()), false);
                    default:
                        KProperty[] kPropertyArr6 = ShopsMapViewScreen.X;
                        return new z4l.j(7, v.k((ScrollerDelegate) shopsMapViewScreen.S.getValue(), shopsMapViewScreen.T), false);
                }
            }
        });
        this.Q = s.t(this, kjd.c.f);
        this.R = j.b(new ka9.b(20));
        final int i6 = 4;
        this.S = j.b(new Function0(this) { // from class: kjd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsMapViewScreen f184366b;

            {
                this.f184366b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                ShopsMapViewScreen shopsMapViewScreen = this.f184366b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ShopsMapViewScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(shopsMapViewScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                        }
                        did.d dVar = ((did.d) aVar2.b()).f115008y;
                        ShopsMapViewScreenContract$InputData shopsMapViewScreenContract$InputData = shopsMapViewScreen.K;
                        shopsMapViewScreenContract$InputData.getClass();
                        return new did.m(dVar, shopsMapViewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ShopsMapViewScreen.X;
                        return (j) ((did.m) shopsMapViewScreen.L.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ShopsMapViewScreen.X;
                        return n14.e.a(shopsMapViewScreen, shopsMapViewScreen.d());
                    case 3:
                        KProperty[] kPropertyArr4 = ShopsMapViewScreen.X;
                        return (on.a) ((did.m) shopsMapViewScreen.L.getValue()).f115042g.get();
                    case 4:
                        KProperty[] kPropertyArr5 = ShopsMapViewScreen.X;
                        return new ScrollerDelegate(u.c((LargeVoucherTileDelegate) shopsMapViewScreen.R.getValue()), false);
                    default:
                        KProperty[] kPropertyArr6 = ShopsMapViewScreen.X;
                        return new z4l.j(7, v.k((ScrollerDelegate) shopsMapViewScreen.S.getValue(), shopsMapViewScreen.T), false);
                }
            }
        });
        this.T = new NotificationCentreItemDelegate();
        final int i21 = 5;
        this.U = j.b(new Function0(this) { // from class: kjd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsMapViewScreen f184366b;

            {
                this.f184366b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                ShopsMapViewScreen shopsMapViewScreen = this.f184366b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ShopsMapViewScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(shopsMapViewScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                        }
                        did.d dVar = ((did.d) aVar2.b()).f115008y;
                        ShopsMapViewScreenContract$InputData shopsMapViewScreenContract$InputData = shopsMapViewScreen.K;
                        shopsMapViewScreenContract$InputData.getClass();
                        return new did.m(dVar, shopsMapViewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ShopsMapViewScreen.X;
                        return (j) ((did.m) shopsMapViewScreen.L.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ShopsMapViewScreen.X;
                        return n14.e.a(shopsMapViewScreen, shopsMapViewScreen.d());
                    case 3:
                        KProperty[] kPropertyArr4 = ShopsMapViewScreen.X;
                        return (on.a) ((did.m) shopsMapViewScreen.L.getValue()).f115042g.get();
                    case 4:
                        KProperty[] kPropertyArr5 = ShopsMapViewScreen.X;
                        return new ScrollerDelegate(u.c((LargeVoucherTileDelegate) shopsMapViewScreen.R.getValue()), false);
                    default:
                        KProperty[] kPropertyArr6 = ShopsMapViewScreen.X;
                        return new z4l.j(7, v.k((ScrollerDelegate) shopsMapViewScreen.S.getValue(), shopsMapViewScreen.T), false);
                }
            }
        });
    }

    public static boolean f3(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static void g3(ScreenContentRecyclerView screenContentRecyclerView, boolean z) {
        int height = screenContentRecyclerView.getHeight();
        ObjectAnimator objectAnimatorOfFloat = z ? ObjectAnimator.ofFloat(screenContentRecyclerView, "translationY", height, BitmapDescriptorFactory.HUE_RED) : ObjectAnimator.ofFloat(screenContentRecyclerView, "translationY", BitmapDescriptorFactory.HUE_RED, height);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.addListener(new s4(z, screenContentRecyclerView, 3));
        objectAnimatorOfFloat.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0197  */
    @Override // cli.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(cli.o r13, cli.q r14) {
        /*
            Method dump skipped, instruction units count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.shops.impl.ui.map_view.ShopsMapViewScreen.B(cli.o, cli.q):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (m) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        SmallActionButton smallActionButton = d3().i;
        smallActionButton.setIcon(new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
        smallActionButton.setText(new TextLocalisedClause(R$string.shops_screens_map_search_button_title, null, null, 14));
        BasicNavBar basicNavBar = d3().f305863h;
        basicNavBar.setExpanded(false);
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        basicNavBar.setBackground(d0.TRANSPARENT);
        BottomExpandableDialogView bottomExpandableDialogView = d3().d;
        BottomExpandableDialogView.setupRecyclerView$default(bottomExpandableDialogView, u.c((LargeVoucherTileDelegate) this.R.getValue()), (RecyclerView.ItemAnimator) null, 2, (Object) null);
        bottomExpandableDialogView.setupDialog(new BottomExpandableDialogView.b.a(R$attr.uikit_windowBackground, new p5(R$dimen.shops_expandable_layout_top_offset, ((Boolean) g.k.getValue()).booleanValue() ? R$dimen.shops_expandable_layout_bottom_offset : R$dimen.shops_expandable_layout_bottom_offset_legacy, null), ((Boolean) g.k.getValue()).booleanValue() ? com.revolut.core.ui_kit.internal.dialogs.b.DYNAMIC_MARGINS : com.revolut.core.ui_kit.internal.dialogs.b.FIXED_SIZE));
        bottomExpandableDialogView.setHideable(false);
        bottomExpandableDialogView.setHasCollapsedState(true);
        bottomExpandableDialogView.setHasExpandedState(true);
        bottomExpandableDialogView.setCloseAutomaticallyByChevron(false);
        bottomExpandableDialogView.setHideAnchorInExpandedState(true);
        bottomExpandableDialogView.setNeedDrawToolbarShadow(false);
        bottomExpandableDialogView.setSupportBackButtonHideDialog(false);
        bottomExpandableDialogView.setNestedScrollingEnabled(false);
        CoordinatorLayout shopsMapViewScreenCoordinatorLayout = d3().f305861c;
        Intrinsics.checkNotNullExpressionValue(shopsMapViewScreenCoordinatorLayout, "shopsMapViewScreenCoordinatorLayout");
        if (shopsMapViewScreenCoordinatorLayout.getViewTreeObserver().isAlive()) {
            shopsMapViewScreenCoordinatorLayout.getViewTreeObserver().addOnGlobalLayoutListener(new kjd.f(bottomExpandableDialogView, shopsMapViewScreenCoordinatorLayout, 0));
        }
        ScreenContentRecyclerView shopsMapViewScreenHorizontalRecyclerView = d3().e;
        Intrinsics.checkNotNullExpressionValue(shopsMapViewScreenHorizontalRecyclerView, "shopsMapViewScreenHorizontalRecyclerView");
        y.h(shopsMapViewScreenHorizontalRecyclerView, (z4l.j) this.U.getValue(), new LinearLayoutManager(shopsMapViewScreenHorizontalRecyclerView.getContext()));
        FormsActionButton formsActionButton = d3().f;
        formsActionButton.setImage(new ResourceImage(R$drawable.uikit_icn_24_location_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        formsActionButton.f(FormsActionButton.a.b.f58990a);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        ofm.h hVar = this.W;
        if (hVar != null) {
            lfm.d.a(hVar);
        }
        this.W = null;
    }

    /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f305863h.f59211b), new kjd.d(this, null, 0), 3);
        ViewController.P2(this, q.q(new t38.e(rd0.e.b(d3().f305862g.f58772l), 24, rd0.e.b(d3().f305862g.k), new hwi.b(3, 26, continuation))), new kjd.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f305862g.f58773m), null, new kjd.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().i.f56386h), new kjd.d(this, null, 1), 3);
        FormsActionButton shopsMapViewScreenLocationButton = d3().f;
        Intrinsics.checkNotNullExpressionValue(shopsMapViewScreenLocationButton, "shopsMapViewScreenLocationButton");
        ViewController.P2(this, rd0.e.b(hx7.b.k(shopsMapViewScreenLocationButton)), new kjd.d(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().d.getStateChangeEvents()), new kjd.e(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ScrollerDelegate) this.S.getValue()).q()), null, new kjd.e(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeVoucherTileDelegate) this.R.getValue()).d), null, new kjd.e(this, continuation, 4), 3);
        ViewController.P2(this, ((sn.a) ((on.a) this.P.getValue())).b(d3().d.getRecyclerView(), false), new kjd.e(this, continuation, 5), 3);
    }

    public final xhd.b d3() {
        ViewBinding value = this.Q.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (xhd.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final kjd.j d() {
        return (kjd.j) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.O.getValue();
    }
}
