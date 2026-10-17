package com.revolut.feature_retail_user_declarations.purpose.screen;

import a0.d;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.x5;
import aw0.o9;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.StaggeredGridItemDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_retail_user_declarations.purpose.screen.PurposeOfAccountTilesScreen;
import com.revolut.feature_retail_user_declarations.purpose.screen.PurposeOfAccountTilesScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.common.ui.R$string;
import dli.a;
import do2.o;
import fci.l0;
import fci.n0;
import fci.p0;
import fci.q;
import fci.q0;
import fci.r0;
import fci.s0;
import fci.t0;
import fci.u0;
import fci.w0;
import fci.x0;
import fci.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import oai.a0;
import rd0.c;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import vkm.j2;
import xki.e;
import z4l.j;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/purpose/screen/PurposeOfAccountTilesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfci/u0;", "Lno/m;", "Ldli/a;", "Lfci/x0;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PurposeOfAccountTilesScreen extends ViewController<u0> implements m, a {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(PurposeOfAccountTilesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final PurposeOfAccountTilesScreenContract$InputData K;
    public final h L;
    public final int M;
    public final VoucherSmallTileDelegate N;
    public final SmallCardDelegate O;
    public final FullScreenStateDelegate P;
    public final j Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public boolean V;
    public OneShotPreDrawListener W;
    public final Object X;
    public final Object Y;
    public x0 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f97722a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final s0 f97723b0;

    public PurposeOfAccountTilesScreen(PurposeOfAccountTilesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, n0.f);
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        VoucherSmallTileDelegate voucherSmallTileDelegate = new VoucherSmallTileDelegate();
        this.N = voucherSmallTileDelegate;
        SmallCardDelegate smallCardDelegate = new SmallCardDelegate(q.f133802a);
        this.O = smallCardDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.P = fullScreenStateDelegate;
        StaggeredGridItemDelegate.Companion aVar = StaggeredGridItemDelegate.INSTANCE;
        final int i = 3;
        final int i2 = 0;
        final int i3 = 1;
        final int i5 = 2;
        List listK = v.k(voucherSmallTileDelegate, smallCardDelegate, fullScreenStateDelegate);
        aVar.getClass();
        this.Q = new j(7, (List) StaggeredGridItemDelegate.Companion.a(listK), false);
        this.R = w.y0(new Function0(this) { // from class: fci.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PurposeOfAccountTilesScreen f133794b;

            {
                this.f133794b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i6 = i2;
                PurposeOfAccountTilesScreen purposeOfAccountTilesScreen = this.f133794b;
                switch (i6) {
                    case 0:
                        KProperty[] kPropertyArr = PurposeOfAccountTilesScreen.c0;
                        qji.b bVarU2 = purposeOfAccountTilesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.purpose.screen.di.PurposeOfAccountTilesScreenInjector");
                        oai.y yVar = (oai.y) bVarU2;
                        oai.i0 i0Var = yVar.f223787b;
                        oai.y yVar2 = yVar.f223788c;
                        PurposeOfAccountTilesScreenContract$InputData purposeOfAccountTilesScreenContract$InputData = purposeOfAccountTilesScreen.K;
                        purposeOfAccountTilesScreenContract$InputData.getClass();
                        return new oai.a0(i0Var, yVar2, purposeOfAccountTilesScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PurposeOfAccountTilesScreen.c0;
                        return (w0) ((oai.a0) purposeOfAccountTilesScreen.R.getValue()).f223659c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = PurposeOfAccountTilesScreen.c0;
                        PurposeOfAccountTilesScreen purposeOfAccountTilesScreen2 = this.f133794b;
                        return dli.f.a(purposeOfAccountTilesScreen2, purposeOfAccountTilesScreen2.R2(), zhm.f0.f322471a, R$id.recyclerView, null, purposeOfAccountTilesScreen2.Q, null, 40);
                    case 3:
                        KProperty[] kPropertyArr4 = PurposeOfAccountTilesScreen.c0;
                        yji.o oVar = purposeOfAccountTilesScreen.f98405m;
                        no.m mVar = oVar instanceof no.m ? (no.m) oVar : null;
                        if (mVar != null) {
                            return mVar.getU();
                        }
                        return null;
                    case 4:
                        KProperty[] kPropertyArr5 = PurposeOfAccountTilesScreen.c0;
                        ScreenContentRecyclerView recyclerView = purposeOfAccountTilesScreen.e3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return new l0(recyclerView);
                    default:
                        KProperty[] kPropertyArr6 = PurposeOfAccountTilesScreen.c0;
                        ScreenContentRecyclerView recyclerView2 = purposeOfAccountTilesScreen.e3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
                        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = purposeOfAccountTilesScreen.e3().f174563a;
                        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
                        return new d0(controllerContainerCoordinatorLayout, recyclerView2);
                }
            }
        });
        this.S = w.y0(new Function0(this) { // from class: fci.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PurposeOfAccountTilesScreen f133794b;

            {
                this.f133794b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i6 = i3;
                PurposeOfAccountTilesScreen purposeOfAccountTilesScreen = this.f133794b;
                switch (i6) {
                    case 0:
                        KProperty[] kPropertyArr = PurposeOfAccountTilesScreen.c0;
                        qji.b bVarU2 = purposeOfAccountTilesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.purpose.screen.di.PurposeOfAccountTilesScreenInjector");
                        oai.y yVar = (oai.y) bVarU2;
                        oai.i0 i0Var = yVar.f223787b;
                        oai.y yVar2 = yVar.f223788c;
                        PurposeOfAccountTilesScreenContract$InputData purposeOfAccountTilesScreenContract$InputData = purposeOfAccountTilesScreen.K;
                        purposeOfAccountTilesScreenContract$InputData.getClass();
                        return new oai.a0(i0Var, yVar2, purposeOfAccountTilesScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PurposeOfAccountTilesScreen.c0;
                        return (w0) ((oai.a0) purposeOfAccountTilesScreen.R.getValue()).f223659c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = PurposeOfAccountTilesScreen.c0;
                        PurposeOfAccountTilesScreen purposeOfAccountTilesScreen2 = this.f133794b;
                        return dli.f.a(purposeOfAccountTilesScreen2, purposeOfAccountTilesScreen2.R2(), zhm.f0.f322471a, R$id.recyclerView, null, purposeOfAccountTilesScreen2.Q, null, 40);
                    case 3:
                        KProperty[] kPropertyArr4 = PurposeOfAccountTilesScreen.c0;
                        yji.o oVar = purposeOfAccountTilesScreen.f98405m;
                        no.m mVar = oVar instanceof no.m ? (no.m) oVar : null;
                        if (mVar != null) {
                            return mVar.getU();
                        }
                        return null;
                    case 4:
                        KProperty[] kPropertyArr5 = PurposeOfAccountTilesScreen.c0;
                        ScreenContentRecyclerView recyclerView = purposeOfAccountTilesScreen.e3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return new l0(recyclerView);
                    default:
                        KProperty[] kPropertyArr6 = PurposeOfAccountTilesScreen.c0;
                        ScreenContentRecyclerView recyclerView2 = purposeOfAccountTilesScreen.e3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
                        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = purposeOfAccountTilesScreen.e3().f174563a;
                        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
                        return new d0(controllerContainerCoordinatorLayout, recyclerView2);
                }
            }
        });
        this.T = w.y0(new Function0(this) { // from class: fci.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PurposeOfAccountTilesScreen f133794b;

            {
                this.f133794b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i6 = i5;
                PurposeOfAccountTilesScreen purposeOfAccountTilesScreen = this.f133794b;
                switch (i6) {
                    case 0:
                        KProperty[] kPropertyArr = PurposeOfAccountTilesScreen.c0;
                        qji.b bVarU2 = purposeOfAccountTilesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.purpose.screen.di.PurposeOfAccountTilesScreenInjector");
                        oai.y yVar = (oai.y) bVarU2;
                        oai.i0 i0Var = yVar.f223787b;
                        oai.y yVar2 = yVar.f223788c;
                        PurposeOfAccountTilesScreenContract$InputData purposeOfAccountTilesScreenContract$InputData = purposeOfAccountTilesScreen.K;
                        purposeOfAccountTilesScreenContract$InputData.getClass();
                        return new oai.a0(i0Var, yVar2, purposeOfAccountTilesScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PurposeOfAccountTilesScreen.c0;
                        return (w0) ((oai.a0) purposeOfAccountTilesScreen.R.getValue()).f223659c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = PurposeOfAccountTilesScreen.c0;
                        PurposeOfAccountTilesScreen purposeOfAccountTilesScreen2 = this.f133794b;
                        return dli.f.a(purposeOfAccountTilesScreen2, purposeOfAccountTilesScreen2.R2(), zhm.f0.f322471a, R$id.recyclerView, null, purposeOfAccountTilesScreen2.Q, null, 40);
                    case 3:
                        KProperty[] kPropertyArr4 = PurposeOfAccountTilesScreen.c0;
                        yji.o oVar = purposeOfAccountTilesScreen.f98405m;
                        no.m mVar = oVar instanceof no.m ? (no.m) oVar : null;
                        if (mVar != null) {
                            return mVar.getU();
                        }
                        return null;
                    case 4:
                        KProperty[] kPropertyArr5 = PurposeOfAccountTilesScreen.c0;
                        ScreenContentRecyclerView recyclerView = purposeOfAccountTilesScreen.e3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return new l0(recyclerView);
                    default:
                        KProperty[] kPropertyArr6 = PurposeOfAccountTilesScreen.c0;
                        ScreenContentRecyclerView recyclerView2 = purposeOfAccountTilesScreen.e3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
                        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = purposeOfAccountTilesScreen.e3().f174563a;
                        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
                        return new d0(controllerContainerCoordinatorLayout, recyclerView2);
                }
            }
        });
        this.U = w.y0(new Function0(this) { // from class: fci.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PurposeOfAccountTilesScreen f133794b;

            {
                this.f133794b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i6 = i;
                PurposeOfAccountTilesScreen purposeOfAccountTilesScreen = this.f133794b;
                switch (i6) {
                    case 0:
                        KProperty[] kPropertyArr = PurposeOfAccountTilesScreen.c0;
                        qji.b bVarU2 = purposeOfAccountTilesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.purpose.screen.di.PurposeOfAccountTilesScreenInjector");
                        oai.y yVar = (oai.y) bVarU2;
                        oai.i0 i0Var = yVar.f223787b;
                        oai.y yVar2 = yVar.f223788c;
                        PurposeOfAccountTilesScreenContract$InputData purposeOfAccountTilesScreenContract$InputData = purposeOfAccountTilesScreen.K;
                        purposeOfAccountTilesScreenContract$InputData.getClass();
                        return new oai.a0(i0Var, yVar2, purposeOfAccountTilesScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PurposeOfAccountTilesScreen.c0;
                        return (w0) ((oai.a0) purposeOfAccountTilesScreen.R.getValue()).f223659c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = PurposeOfAccountTilesScreen.c0;
                        PurposeOfAccountTilesScreen purposeOfAccountTilesScreen2 = this.f133794b;
                        return dli.f.a(purposeOfAccountTilesScreen2, purposeOfAccountTilesScreen2.R2(), zhm.f0.f322471a, R$id.recyclerView, null, purposeOfAccountTilesScreen2.Q, null, 40);
                    case 3:
                        KProperty[] kPropertyArr4 = PurposeOfAccountTilesScreen.c0;
                        yji.o oVar = purposeOfAccountTilesScreen.f98405m;
                        no.m mVar = oVar instanceof no.m ? (no.m) oVar : null;
                        if (mVar != null) {
                            return mVar.getU();
                        }
                        return null;
                    case 4:
                        KProperty[] kPropertyArr5 = PurposeOfAccountTilesScreen.c0;
                        ScreenContentRecyclerView recyclerView = purposeOfAccountTilesScreen.e3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return new l0(recyclerView);
                    default:
                        KProperty[] kPropertyArr6 = PurposeOfAccountTilesScreen.c0;
                        ScreenContentRecyclerView recyclerView2 = purposeOfAccountTilesScreen.e3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
                        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = purposeOfAccountTilesScreen.e3().f174563a;
                        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
                        return new d0(controllerContainerCoordinatorLayout, recyclerView2);
                }
            }
        });
        final int i6 = 4;
        this.X = w.y0(new Function0(this) { // from class: fci.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PurposeOfAccountTilesScreen f133794b;

            {
                this.f133794b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i66 = i6;
                PurposeOfAccountTilesScreen purposeOfAccountTilesScreen = this.f133794b;
                switch (i66) {
                    case 0:
                        KProperty[] kPropertyArr = PurposeOfAccountTilesScreen.c0;
                        qji.b bVarU2 = purposeOfAccountTilesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.purpose.screen.di.PurposeOfAccountTilesScreenInjector");
                        oai.y yVar = (oai.y) bVarU2;
                        oai.i0 i0Var = yVar.f223787b;
                        oai.y yVar2 = yVar.f223788c;
                        PurposeOfAccountTilesScreenContract$InputData purposeOfAccountTilesScreenContract$InputData = purposeOfAccountTilesScreen.K;
                        purposeOfAccountTilesScreenContract$InputData.getClass();
                        return new oai.a0(i0Var, yVar2, purposeOfAccountTilesScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PurposeOfAccountTilesScreen.c0;
                        return (w0) ((oai.a0) purposeOfAccountTilesScreen.R.getValue()).f223659c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = PurposeOfAccountTilesScreen.c0;
                        PurposeOfAccountTilesScreen purposeOfAccountTilesScreen2 = this.f133794b;
                        return dli.f.a(purposeOfAccountTilesScreen2, purposeOfAccountTilesScreen2.R2(), zhm.f0.f322471a, R$id.recyclerView, null, purposeOfAccountTilesScreen2.Q, null, 40);
                    case 3:
                        KProperty[] kPropertyArr4 = PurposeOfAccountTilesScreen.c0;
                        yji.o oVar = purposeOfAccountTilesScreen.f98405m;
                        no.m mVar = oVar instanceof no.m ? (no.m) oVar : null;
                        if (mVar != null) {
                            return mVar.getU();
                        }
                        return null;
                    case 4:
                        KProperty[] kPropertyArr5 = PurposeOfAccountTilesScreen.c0;
                        ScreenContentRecyclerView recyclerView = purposeOfAccountTilesScreen.e3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return new l0(recyclerView);
                    default:
                        KProperty[] kPropertyArr6 = PurposeOfAccountTilesScreen.c0;
                        ScreenContentRecyclerView recyclerView2 = purposeOfAccountTilesScreen.e3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
                        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = purposeOfAccountTilesScreen.e3().f174563a;
                        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
                        return new d0(controllerContainerCoordinatorLayout, recyclerView2);
                }
            }
        });
        final int i21 = 5;
        this.Y = w.y0(new Function0(this) { // from class: fci.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PurposeOfAccountTilesScreen f133794b;

            {
                this.f133794b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i66 = i21;
                PurposeOfAccountTilesScreen purposeOfAccountTilesScreen = this.f133794b;
                switch (i66) {
                    case 0:
                        KProperty[] kPropertyArr = PurposeOfAccountTilesScreen.c0;
                        qji.b bVarU2 = purposeOfAccountTilesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.purpose.screen.di.PurposeOfAccountTilesScreenInjector");
                        oai.y yVar = (oai.y) bVarU2;
                        oai.i0 i0Var = yVar.f223787b;
                        oai.y yVar2 = yVar.f223788c;
                        PurposeOfAccountTilesScreenContract$InputData purposeOfAccountTilesScreenContract$InputData = purposeOfAccountTilesScreen.K;
                        purposeOfAccountTilesScreenContract$InputData.getClass();
                        return new oai.a0(i0Var, yVar2, purposeOfAccountTilesScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PurposeOfAccountTilesScreen.c0;
                        return (w0) ((oai.a0) purposeOfAccountTilesScreen.R.getValue()).f223659c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = PurposeOfAccountTilesScreen.c0;
                        PurposeOfAccountTilesScreen purposeOfAccountTilesScreen2 = this.f133794b;
                        return dli.f.a(purposeOfAccountTilesScreen2, purposeOfAccountTilesScreen2.R2(), zhm.f0.f322471a, R$id.recyclerView, null, purposeOfAccountTilesScreen2.Q, null, 40);
                    case 3:
                        KProperty[] kPropertyArr4 = PurposeOfAccountTilesScreen.c0;
                        yji.o oVar = purposeOfAccountTilesScreen.f98405m;
                        no.m mVar = oVar instanceof no.m ? (no.m) oVar : null;
                        if (mVar != null) {
                            return mVar.getU();
                        }
                        return null;
                    case 4:
                        KProperty[] kPropertyArr5 = PurposeOfAccountTilesScreen.c0;
                        ScreenContentRecyclerView recyclerView = purposeOfAccountTilesScreen.e3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return new l0(recyclerView);
                    default:
                        KProperty[] kPropertyArr6 = PurposeOfAccountTilesScreen.c0;
                        ScreenContentRecyclerView recyclerView2 = purposeOfAccountTilesScreen.e3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
                        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = purposeOfAccountTilesScreen.e3().f174563a;
                        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
                        return new d0(controllerContainerCoordinatorLayout, recyclerView2);
                }
            }
        });
        this.f97723b0 = new s0(this);
    }

    public static final void d3(PurposeOfAccountTilesScreen purposeOfAccountTilesScreen, Object obj2) {
        List listU;
        List list = obj2 instanceof List ? (List) obj2 : null;
        if (list != null) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    if (!(it8.next() instanceof String)) {
                    }
                }
            }
            w0 w0VarR2 = purposeOfAccountTilesScreen.R2();
            ArrayList purposes = new ArrayList();
            for (Object obj3 : list2) {
                if (obj3 instanceof String) {
                    purposes.add(obj3);
                }
            }
            y0 y0Var = (y0) w0VarR2;
            y yVar = y0Var.f133828q;
            Intrinsics.checkNotNullParameter(purposes, "purposes");
            if (purposes.isEmpty()) {
                return;
            }
            if (purposes.isEmpty()) {
                listU = d0.U(d0.E0(purposes, ((t0) ((j2) yVar.f22677a).getValue()).f133814b));
            } else {
                Iterator it9 = purposes.iterator();
                while (it9.hasNext()) {
                    if (((t0) ((j2) yVar.f22677a).getValue()).f133814b.contains((String) it9.next())) {
                        listU = d0.B0(((t0) ((j2) yVar.f22677a).getValue()).f133814b, d0.i1(purposes));
                        break;
                    }
                }
                listU = d0.U(d0.E0(purposes, ((t0) ((j2) yVar.f22677a).getValue()).f133814b));
            }
            y0Var.H2(yVar, new o(listU, 20));
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(d.m(obj2, "Unexpected item's payload "));
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(c.ERROR, null, null, illegalStateException, h0Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        x0 uiState = (x0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        this.Z = uiState;
        i3(uiState.f133824b);
        Clause clause = uiState.f133825c;
        ?? r06 = this.Y;
        if (clause == null && uiState.f133823a.isEmpty()) {
            this.f97722a0 = false;
            ((fci.d0) r06.getValue()).c();
            h3();
            NavBarWithToolbar navBarWithToolbar = e3().f174565c;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
            return;
        }
        if (clause == null) {
            this.f97722a0 = false;
            ((fci.d0) r06.getValue()).c();
            h3();
            j3(uiState);
            return;
        }
        j3(uiState);
        if (this.V) {
            return;
        }
        this.V = true;
        ScreenContentRecyclerView recyclerView = e3().d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        this.W = OneShotPreDrawListener.add(recyclerView, new x5(recyclerView, this, uiState, 7));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getU() {
        return (AnalyticsProduct) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a0) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView recyclerView = e3().d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        yp0.y.k(recyclerView, this.Q, R$attr.uikit_dp8, 10);
        e3().d.setItemAnimator(null);
        e3().d.addOnChildAttachStateChangeListener(this.f97723b0);
        NavBarWithToolbar navBarWithToolbar = e3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        i3(false);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        e3().d.removeOnChildAttachStateChangeListener(this.f97723b0);
        boolean z = this.f97722a0;
        ?? r110 = this.Y;
        if (!z) {
            this.f97722a0 = false;
            ((fci.d0) r110.getValue()).c();
            h3();
        } else {
            OneShotPreDrawListener oneShotPreDrawListener = this.W;
            if (oneShotPreDrawListener != null) {
                oneShotPreDrawListener.removeListener();
            }
            this.W = null;
            ((fci.d0) r110.getValue()).a();
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        OneShotPreDrawListener oneShotPreDrawListener = this.W;
        if (oneShotPreDrawListener != null) {
            oneShotPreDrawListener.removeListener();
        }
        this.W = null;
        if (this.f97722a0) {
            return;
        }
        g3().c();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(this.N.f53608c), new fci.o0(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.d), new p0(this, null), 3);
        ViewController.P2(this, rd0.e.b(e3().f174564b.o), new q0(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new r0(this, null), 3);
        e3().f174565c.setNavigationButtonIcon(this.K.f97724a.a());
        ViewController.P2(this, rd0.e.b(e3().f174565c.f59410q), new q0(this, continuation, 1), 3);
    }

    public final u e3() {
        ViewBinding value = this.L.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final w0 k3() {
        return (w0) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final l0 g3() {
        return (l0) this.X.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.M;
    }

    public final void h3() {
        OneShotPreDrawListener oneShotPreDrawListener = this.W;
        if (oneShotPreDrawListener != null) {
            oneShotPreDrawListener.removeListener();
        }
        this.W = null;
        g3().c();
        this.V = false;
    }

    public final void i3(boolean z) {
        e3().f174564b.setEnabled(z && !this.f97722a0);
        e3().f174564b.setText(new TextLocalisedClause(z ? R$string.common_action_continue : com.revolut.feature.user_declarations.shared.R$string.purpose_of_account_continue_button_disabled_title, null, null, 14));
    }

    public final void j3(x0 x0Var) {
        NavBarWithToolbar navBarWithToolbar = e3().f174565c;
        navBarWithToolbar.l0();
        navBarWithToolbar.setTitle(x0Var.f133825c, null);
        Clause textClause = x0Var.f133825c;
        if (textClause == null) {
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        navBarWithToolbar.setToolbarTitle(textClause);
        navBarWithToolbar.setSecondDescriptionText(x0Var.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
