package com.revolut.feature_move_money.impl.topup;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_move_money.impl.R$id;
import com.revolut.feature_move_money.impl.R$layout;
import com.revolut.feature_move_money.impl.topup.MoveMoneyTopupScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mzb.e;
import n85.b;
import n8i.f;
import n8i.i;
import n8i.j;
import n8i.j0;
import n8i.k0;
import n8i.l0;
import n8i.m0;
import n8i.n0;
import n8i.t;
import n8i.u;
import no.m;
import org.jetbrains.annotations.NotNull;
import p8i.g;
import s7i.d;
import te0.w;
import vc.s;
import w01.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature_move_money/impl/topup/MoveMoneyTopupScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ln8i/t;", "Ldli/a;", "Ln8i/n0;", "Lno/m;", "Companion", "a", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MoveMoneyTopupScreen extends ViewController<t> implements dli.a, m {
    public final AnalyticsProduct K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final h U;
    public final Object V;
    public final Object W;
    public final Object X;
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(MoveMoneyTopupScreen.class, "binding", "getBinding()Lcom/revolut/feature_move_money/impl/databinding/ScreenMoveMoneyTopupBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature_move_money.impl.topup.MoveMoneyTopupScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public MoveMoneyTopupScreen(MoveMoneyTopupScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData.f97415c;
        this.L = R$layout.screen_move_money_topup;
        final int i = 1;
        this.M = w.y0(new Function0(this) { // from class: n8i.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoveMoneyTopupScreen f213413b;

            {
                this.f213413b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                MoveMoneyTopupScreen moveMoneyTopupScreen = this.f213413b;
                switch (i2) {
                    case 0:
                        MoveMoneyTopupScreen.Companion companion = MoveMoneyTopupScreen.INSTANCE;
                        return (u) ((u7i.o) ((p8i.g) moveMoneyTopupScreen.V.getValue())).E.get();
                    case 1:
                        MoveMoneyTopupScreen.Companion companion2 = MoveMoneyTopupScreen.INSTANCE;
                        qd0.b bVarN = ((u7i.o) ((p8i.g) moveMoneyTopupScreen.V.getValue())).f277871b.f277824c.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        MoveMoneyTopupScreen.Companion companion3 = MoveMoneyTopupScreen.INSTANCE;
                        return moveMoneyTopupScreen.d3().f.A.V();
                    case 3:
                        MoveMoneyTopupScreen.Companion companion4 = MoveMoneyTopupScreen.INSTANCE;
                        return new CenteredAmountDelegate(new e(moveMoneyTopupScreen, i3));
                    case 4:
                        MoveMoneyTopupScreen.Companion companion5 = MoveMoneyTopupScreen.INSTANCE;
                        return new GridBoxDelegate(zhm.v.k((AttributeSelectorSmallDelegate) moveMoneyTopupScreen.P.getValue(), new AttributeSelectorSmallLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    default:
                        MoveMoneyTopupScreen.Companion companion6 = MoveMoneyTopupScreen.INSTANCE;
                        MoveMoneyTopupScreen moveMoneyTopupScreen2 = this.f213413b;
                        return dli.f.a(moveMoneyTopupScreen2, moveMoneyTopupScreen2.d(), zhm.v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), new AttributeSelectorSmallLoadingDelegate(), (TextDelegate) moveMoneyTopupScreen2.R.getValue(), (GridBoxDelegate) moveMoneyTopupScreen2.Q.getValue(), (FullScreenStateDelegate) moveMoneyTopupScreen2.O.getValue(), (CenteredAmountDelegate) moveMoneyTopupScreen2.N.getValue(), (FooterTextDelegate) moveMoneyTopupScreen2.S.getValue()), R$id.screenMoveMoneyTopup_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 3;
        this.N = w.y0(new Function0(this) { // from class: n8i.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoveMoneyTopupScreen f213413b;

            {
                this.f213413b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                MoveMoneyTopupScreen moveMoneyTopupScreen = this.f213413b;
                switch (i22) {
                    case 0:
                        MoveMoneyTopupScreen.Companion companion = MoveMoneyTopupScreen.INSTANCE;
                        return (u) ((u7i.o) ((p8i.g) moveMoneyTopupScreen.V.getValue())).E.get();
                    case 1:
                        MoveMoneyTopupScreen.Companion companion2 = MoveMoneyTopupScreen.INSTANCE;
                        qd0.b bVarN = ((u7i.o) ((p8i.g) moveMoneyTopupScreen.V.getValue())).f277871b.f277824c.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        MoveMoneyTopupScreen.Companion companion3 = MoveMoneyTopupScreen.INSTANCE;
                        return moveMoneyTopupScreen.d3().f.A.V();
                    case 3:
                        MoveMoneyTopupScreen.Companion companion4 = MoveMoneyTopupScreen.INSTANCE;
                        return new CenteredAmountDelegate(new e(moveMoneyTopupScreen, i3));
                    case 4:
                        MoveMoneyTopupScreen.Companion companion5 = MoveMoneyTopupScreen.INSTANCE;
                        return new GridBoxDelegate(zhm.v.k((AttributeSelectorSmallDelegate) moveMoneyTopupScreen.P.getValue(), new AttributeSelectorSmallLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    default:
                        MoveMoneyTopupScreen.Companion companion6 = MoveMoneyTopupScreen.INSTANCE;
                        MoveMoneyTopupScreen moveMoneyTopupScreen2 = this.f213413b;
                        return dli.f.a(moveMoneyTopupScreen2, moveMoneyTopupScreen2.d(), zhm.v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), new AttributeSelectorSmallLoadingDelegate(), (TextDelegate) moveMoneyTopupScreen2.R.getValue(), (GridBoxDelegate) moveMoneyTopupScreen2.Q.getValue(), (FullScreenStateDelegate) moveMoneyTopupScreen2.O.getValue(), (CenteredAmountDelegate) moveMoneyTopupScreen2.N.getValue(), (FooterTextDelegate) moveMoneyTopupScreen2.S.getValue()), R$id.screenMoveMoneyTopup_recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = w.y0(new b(1));
        this.P = w.y0(new b(2));
        final int i3 = 4;
        this.Q = w.y0(new Function0(this) { // from class: n8i.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoveMoneyTopupScreen f213413b;

            {
                this.f213413b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                MoveMoneyTopupScreen moveMoneyTopupScreen = this.f213413b;
                switch (i22) {
                    case 0:
                        MoveMoneyTopupScreen.Companion companion = MoveMoneyTopupScreen.INSTANCE;
                        return (u) ((u7i.o) ((p8i.g) moveMoneyTopupScreen.V.getValue())).E.get();
                    case 1:
                        MoveMoneyTopupScreen.Companion companion2 = MoveMoneyTopupScreen.INSTANCE;
                        qd0.b bVarN = ((u7i.o) ((p8i.g) moveMoneyTopupScreen.V.getValue())).f277871b.f277824c.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        MoveMoneyTopupScreen.Companion companion3 = MoveMoneyTopupScreen.INSTANCE;
                        return moveMoneyTopupScreen.d3().f.A.V();
                    case 3:
                        MoveMoneyTopupScreen.Companion companion4 = MoveMoneyTopupScreen.INSTANCE;
                        return new CenteredAmountDelegate(new e(moveMoneyTopupScreen, i32));
                    case 4:
                        MoveMoneyTopupScreen.Companion companion5 = MoveMoneyTopupScreen.INSTANCE;
                        return new GridBoxDelegate(zhm.v.k((AttributeSelectorSmallDelegate) moveMoneyTopupScreen.P.getValue(), new AttributeSelectorSmallLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    default:
                        MoveMoneyTopupScreen.Companion companion6 = MoveMoneyTopupScreen.INSTANCE;
                        MoveMoneyTopupScreen moveMoneyTopupScreen2 = this.f213413b;
                        return dli.f.a(moveMoneyTopupScreen2, moveMoneyTopupScreen2.d(), zhm.v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), new AttributeSelectorSmallLoadingDelegate(), (TextDelegate) moveMoneyTopupScreen2.R.getValue(), (GridBoxDelegate) moveMoneyTopupScreen2.Q.getValue(), (FullScreenStateDelegate) moveMoneyTopupScreen2.O.getValue(), (CenteredAmountDelegate) moveMoneyTopupScreen2.N.getValue(), (FooterTextDelegate) moveMoneyTopupScreen2.S.getValue()), R$id.screenMoveMoneyTopup_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = w.y0(new b(3));
        this.S = w.y0(new b(4));
        final int i5 = 5;
        this.T = w.y0(new Function0(this) { // from class: n8i.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoveMoneyTopupScreen f213413b;

            {
                this.f213413b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                int i32 = 0;
                MoveMoneyTopupScreen moveMoneyTopupScreen = this.f213413b;
                switch (i22) {
                    case 0:
                        MoveMoneyTopupScreen.Companion companion = MoveMoneyTopupScreen.INSTANCE;
                        return (u) ((u7i.o) ((p8i.g) moveMoneyTopupScreen.V.getValue())).E.get();
                    case 1:
                        MoveMoneyTopupScreen.Companion companion2 = MoveMoneyTopupScreen.INSTANCE;
                        qd0.b bVarN = ((u7i.o) ((p8i.g) moveMoneyTopupScreen.V.getValue())).f277871b.f277824c.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        MoveMoneyTopupScreen.Companion companion3 = MoveMoneyTopupScreen.INSTANCE;
                        return moveMoneyTopupScreen.d3().f.A.V();
                    case 3:
                        MoveMoneyTopupScreen.Companion companion4 = MoveMoneyTopupScreen.INSTANCE;
                        return new CenteredAmountDelegate(new e(moveMoneyTopupScreen, i32));
                    case 4:
                        MoveMoneyTopupScreen.Companion companion5 = MoveMoneyTopupScreen.INSTANCE;
                        return new GridBoxDelegate(zhm.v.k((AttributeSelectorSmallDelegate) moveMoneyTopupScreen.P.getValue(), new AttributeSelectorSmallLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    default:
                        MoveMoneyTopupScreen.Companion companion6 = MoveMoneyTopupScreen.INSTANCE;
                        MoveMoneyTopupScreen moveMoneyTopupScreen2 = this.f213413b;
                        return dli.f.a(moveMoneyTopupScreen2, moveMoneyTopupScreen2.d(), zhm.v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), new AttributeSelectorSmallLoadingDelegate(), (TextDelegate) moveMoneyTopupScreen2.R.getValue(), (GridBoxDelegate) moveMoneyTopupScreen2.Q.getValue(), (FullScreenStateDelegate) moveMoneyTopupScreen2.O.getValue(), (CenteredAmountDelegate) moveMoneyTopupScreen2.N.getValue(), (FooterTextDelegate) moveMoneyTopupScreen2.S.getValue()), R$id.screenMoveMoneyTopup_recyclerView, null, null, null, 56);
                }
            }
        });
        this.U = s.t(this, f.f);
        this.V = w.y0(new e(this, inputData, 15));
        final int i6 = 0;
        this.W = w.y0(new Function0(this) { // from class: n8i.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoveMoneyTopupScreen f213413b;

            {
                this.f213413b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                int i32 = 0;
                MoveMoneyTopupScreen moveMoneyTopupScreen = this.f213413b;
                switch (i22) {
                    case 0:
                        MoveMoneyTopupScreen.Companion companion = MoveMoneyTopupScreen.INSTANCE;
                        return (u) ((u7i.o) ((p8i.g) moveMoneyTopupScreen.V.getValue())).E.get();
                    case 1:
                        MoveMoneyTopupScreen.Companion companion2 = MoveMoneyTopupScreen.INSTANCE;
                        qd0.b bVarN = ((u7i.o) ((p8i.g) moveMoneyTopupScreen.V.getValue())).f277871b.f277824c.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        MoveMoneyTopupScreen.Companion companion3 = MoveMoneyTopupScreen.INSTANCE;
                        return moveMoneyTopupScreen.d3().f.A.V();
                    case 3:
                        MoveMoneyTopupScreen.Companion companion4 = MoveMoneyTopupScreen.INSTANCE;
                        return new CenteredAmountDelegate(new e(moveMoneyTopupScreen, i32));
                    case 4:
                        MoveMoneyTopupScreen.Companion companion5 = MoveMoneyTopupScreen.INSTANCE;
                        return new GridBoxDelegate(zhm.v.k((AttributeSelectorSmallDelegate) moveMoneyTopupScreen.P.getValue(), new AttributeSelectorSmallLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    default:
                        MoveMoneyTopupScreen.Companion companion6 = MoveMoneyTopupScreen.INSTANCE;
                        MoveMoneyTopupScreen moveMoneyTopupScreen2 = this.f213413b;
                        return dli.f.a(moveMoneyTopupScreen2, moveMoneyTopupScreen2.d(), zhm.v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), new AttributeSelectorSmallLoadingDelegate(), (TextDelegate) moveMoneyTopupScreen2.R.getValue(), (GridBoxDelegate) moveMoneyTopupScreen2.Q.getValue(), (FullScreenStateDelegate) moveMoneyTopupScreen2.O.getValue(), (CenteredAmountDelegate) moveMoneyTopupScreen2.N.getValue(), (FooterTextDelegate) moveMoneyTopupScreen2.S.getValue()), R$id.screenMoveMoneyTopup_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i21 = 2;
        this.X = w.y0(new Function0(this) { // from class: n8i.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoveMoneyTopupScreen f213413b;

            {
                this.f213413b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                int i32 = 0;
                MoveMoneyTopupScreen moveMoneyTopupScreen = this.f213413b;
                switch (i22) {
                    case 0:
                        MoveMoneyTopupScreen.Companion companion = MoveMoneyTopupScreen.INSTANCE;
                        return (u) ((u7i.o) ((p8i.g) moveMoneyTopupScreen.V.getValue())).E.get();
                    case 1:
                        MoveMoneyTopupScreen.Companion companion2 = MoveMoneyTopupScreen.INSTANCE;
                        qd0.b bVarN = ((u7i.o) ((p8i.g) moveMoneyTopupScreen.V.getValue())).f277871b.f277824c.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        MoveMoneyTopupScreen.Companion companion3 = MoveMoneyTopupScreen.INSTANCE;
                        return moveMoneyTopupScreen.d3().f.A.V();
                    case 3:
                        MoveMoneyTopupScreen.Companion companion4 = MoveMoneyTopupScreen.INSTANCE;
                        return new CenteredAmountDelegate(new e(moveMoneyTopupScreen, i32));
                    case 4:
                        MoveMoneyTopupScreen.Companion companion5 = MoveMoneyTopupScreen.INSTANCE;
                        return new GridBoxDelegate(zhm.v.k((AttributeSelectorSmallDelegate) moveMoneyTopupScreen.P.getValue(), new AttributeSelectorSmallLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    default:
                        MoveMoneyTopupScreen.Companion companion6 = MoveMoneyTopupScreen.INSTANCE;
                        MoveMoneyTopupScreen moveMoneyTopupScreen2 = this.f213413b;
                        return dli.f.a(moveMoneyTopupScreen2, moveMoneyTopupScreen2.d(), zhm.v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), new AttributeSelectorSmallLoadingDelegate(), (TextDelegate) moveMoneyTopupScreen2.R.getValue(), (GridBoxDelegate) moveMoneyTopupScreen2.Q.getValue(), (FullScreenStateDelegate) moveMoneyTopupScreen2.O.getValue(), (CenteredAmountDelegate) moveMoneyTopupScreen2.N.getValue(), (FooterTextDelegate) moveMoneyTopupScreen2.S.getValue()), R$id.screenMoveMoneyTopup_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n0 uiState = (n0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        m0 m0Var = uiState.f213453a;
        NavBarWithToolbar navBarWithToolbar = d3().f260851c;
        Clause clause = m0Var.f213448b;
        Clause clause2 = m0Var.f213447a;
        if (clause != null) {
            NavBarWithToolbar.setToolbar$default(navBarWithToolbar, clause2, clause, null, 4, null);
        } else {
            navBarWithToolbar.setToolbarTitle(clause2);
            navBarWithToolbar.setTitle(clause2, null);
            navBarWithToolbar.setMenuItems(m0Var.f213449c);
        }
        n8i.h0 h0Var = uiState.f213454b;
        LargeActionButton largeActionButton = d3().f;
        ((rr0.f) ((sy0.b) this.X.getValue())).b(false);
        largeActionButton.setLoadingButtonTag("MOVE_MONEY_TOPUP_CTA_BUTTON_TAG");
        largeActionButton.setText(h0Var.f213429a);
        largeActionButton.setEnabled(h0Var.f213430b);
        k.d(largeActionButton);
        l0 l0Var = uiState.f213455c;
        LargeActionButton largeActionButton2 = d3().e;
        if (l0Var instanceof k0) {
            k.a(largeActionButton2);
        } else {
            if (!(l0Var instanceof j0)) {
                throw new NoWhenBranchMatchedException();
            }
            j0 j0Var = (j0) l0Var;
            largeActionButton2.setEnabled(j0Var.f213438b);
            largeActionButton2.setIcon(j0Var.f213437a);
            k.d(largeActionButton2);
        }
        Clause clause3 = uiState.d;
        FooterTextView footerTextView = d3().f260850b;
        footerTextView.setVisibility(clause3 == null ? 8 : 0);
        footerTextView.setTextClause(clause3);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f.setCustomE2ETestId("SubmitMoneyButton");
        NavBarWithToolbar navBarWithToolbar = d3().f260851c;
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        navBarWithToolbar.j0(false);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        ScreenContentRecyclerView screenContentRecyclerView = d3().d;
        screenContentRecyclerView.setNestedScrollingEnabled(false);
        screenContentRecyclerView.setOverScrollMode(2);
        ViewCompat.setOnApplyWindowInsetsListener(screenContentRecyclerView, new kx7.o0(28));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i = 2;
        int i2 = 0;
        int i3 = 1;
        Continuation continuation = null;
        ViewController.P2(this, vkm.q.J(rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), rd0.e.b(((AttributeSelectorSmallDelegate) this.P.getValue()).p())), new n8i.h(this, continuation, i3), 3);
        ViewController.P2(this, rd0.e.b(d3().f260851c.f59410q), new i(this, continuation, i2), 3);
        ViewController.P2(this, rd0.e.b(d3().f.o), new i(this, continuation, i3), 3);
        ViewController.P2(this, rd0.e.b(d3().e.o), new i(this, continuation, i), 3);
        ?? r06 = this.N;
        ViewController.P2(this, rd0.e.b(((CenteredAmountDelegate) r06.getValue()).e.f121375b), new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new mmh.e(rd0.e.b(((CenteredAmountDelegate) r06.getValue()).f.f121375b), 21), null, new n8i.h(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.q(rd0.e.b(((CenteredAmountDelegate) r06.getValue()).f51967l.f121375b)), null, new n8i.h(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.q(vkm.q.J(rd0.e.b(((TextDelegate) this.R.getValue()).d), rd0.e.b(((FooterTextDelegate) this.S.getValue()).e.f121375b))), null, new n8i.h(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(d3().f260851c.o.f57403b), new n8i.h(this, continuation, i2), 3);
    }

    public final d d3() {
        ViewBinding value = this.U.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final u R2() {
        return (u) this.W.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.T.getValue();
    }
}
