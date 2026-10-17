package com.revolut.feature.rev_points.impl.ui.opt_in.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import aw0.i;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.impl.R$id;
import com.revolut.feature.rev_points.impl.R$layout;
import com.revolut.feature.rev_points.impl.ui.opt_in.screen.RevPointsOptInScreen;
import com.revolut.feature.rev_points.impl.ui.opt_in.screen.RevPointsOptInScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import qg4.d;
import qzb.b;
import qzb.c;
import qzb.f;
import qzb.g;
import qzb.j;
import qzb.k;
import qzb.l;
import te0.w;
import vc.s;
import xki.e;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/opt_in/screen/RevPointsOptInScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqzb/j;", "Ldli/a;", "Lqzb/l;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsOptInScreen extends ViewController<j> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(RevPointsOptInScreen.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/impl/databinding/ScreenRevPointsOptInBinding;", 0))};
    public final RevPointsOptInScreenContract$InputData K;
    public final int L;
    public final RowDelegate M;
    public final TextDelegate N;
    public final FullScreenStateDelegate O;
    public final Object P;
    public final h Q;
    public final Object R;
    public final Object S;

    public RevPointsOptInScreen(RevPointsOptInScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_rev_points_opt_in;
        this.M = new RowDelegate(null, null, 7);
        this.N = new TextDelegate();
        this.O = new FullScreenStateDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: qzb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsOptInScreen f250492b;

            {
                this.f250492b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsOptInScreen revPointsOptInScreen = this.f250492b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsOptInScreen.T;
                        RevPointsOptInScreen revPointsOptInScreen2 = this.f250492b;
                        return dli.f.a(revPointsOptInScreen2, revPointsOptInScreen2.d(), d0.E0(((fd6.a) ((zxb.o) revPointsOptInScreen2.R.getValue()).d.get()).e, v.k(revPointsOptInScreen2.M, revPointsOptInScreen2.N, new RowLoadingDelegate(), revPointsOptInScreen2.O)), R$id.revPointsOptInScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsOptInScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsOptInScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        RevPointsOptInScreenContract$InputData revPointsOptInScreenContract$InputData = revPointsOptInScreen.K;
                        revPointsOptInScreenContract$InputData.getClass();
                        return new zxb.o(eVar, revPointsOptInScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsOptInScreen.T;
                        return (k) ((zxb.o) revPointsOptInScreen.R.getValue()).f326233g.get();
                }
            }
        });
        this.Q = s.t(this, b.f);
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: qzb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsOptInScreen f250492b;

            {
                this.f250492b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsOptInScreen revPointsOptInScreen = this.f250492b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsOptInScreen.T;
                        RevPointsOptInScreen revPointsOptInScreen2 = this.f250492b;
                        return dli.f.a(revPointsOptInScreen2, revPointsOptInScreen2.d(), d0.E0(((fd6.a) ((zxb.o) revPointsOptInScreen2.R.getValue()).d.get()).e, v.k(revPointsOptInScreen2.M, revPointsOptInScreen2.N, new RowLoadingDelegate(), revPointsOptInScreen2.O)), R$id.revPointsOptInScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsOptInScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsOptInScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        RevPointsOptInScreenContract$InputData revPointsOptInScreenContract$InputData = revPointsOptInScreen.K;
                        revPointsOptInScreenContract$InputData.getClass();
                        return new zxb.o(eVar, revPointsOptInScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsOptInScreen.T;
                        return (k) ((zxb.o) revPointsOptInScreen.R.getValue()).f326233g.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: qzb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsOptInScreen f250492b;

            {
                this.f250492b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevPointsOptInScreen revPointsOptInScreen = this.f250492b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsOptInScreen.T;
                        RevPointsOptInScreen revPointsOptInScreen2 = this.f250492b;
                        return dli.f.a(revPointsOptInScreen2, revPointsOptInScreen2.d(), d0.E0(((fd6.a) ((zxb.o) revPointsOptInScreen2.R.getValue()).d.get()).e, v.k(revPointsOptInScreen2.M, revPointsOptInScreen2.N, new RowLoadingDelegate(), revPointsOptInScreen2.O)), R$id.revPointsOptInScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsOptInScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsOptInScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                        }
                        zxb.e eVar = ((zxb.e) aVar2.b()).V;
                        RevPointsOptInScreenContract$InputData revPointsOptInScreenContract$InputData = revPointsOptInScreen.K;
                        revPointsOptInScreenContract$InputData.getClass();
                        return new zxb.o(eVar, revPointsOptInScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = RevPointsOptInScreen.T;
                        return (k) ((zxb.o) revPointsOptInScreen.R.getValue()).f326233g.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ActionFooterView revPointsOptInScreenButton = d3().f300820b;
        Intrinsics.checkNotNullExpressionValue(revPointsOptInScreenButton, "revPointsOptInScreenButton");
        i iVar = uiState.f250503c;
        qzb.i iVar2 = uiState.d;
        revPointsOptInScreenButton.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            d3().f300820b.setModel(iVar);
        }
        d3().f300821c.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        d3().f300821c.setMenuItems(uiState.f250502b);
        d3().f300821c.setThemeBasedColorSchemeEnabled(true);
        NavBarWithBigTile revPointsOptInScreenNavBar = d3().f300821c;
        Intrinsics.checkNotNullExpressionValue(revPointsOptInScreenNavBar, "revPointsOptInScreenNavBar");
        c1.S(revPointsOptInScreenNavBar, iVar2.a(), null, null, 6);
        if (iVar2 instanceof f) {
            d3().f300821c.setLoadingState(false);
            NavBarWithBigTile navBarWithBigTile = d3().f300821c;
            TextLocalisedClause textLocalisedClause = ((f) iVar2).f250496a;
            navBarWithBigTile.setTitle(textLocalisedClause);
            d3().f300821c.setToolbarTitle(textLocalisedClause);
            return;
        }
        if (iVar2 instanceof g) {
            d3().f300821c.setLoadingState(false);
        } else {
            if (!(iVar2 instanceof qzb.h)) {
                throw new NoWhenBranchMatchedException();
            }
            d3().f300821c.setLoadingState(true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (zxb.o) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f300821c;
        int i = R$string.rev_points_new_opt_in_screen;
        m70.a.c(t0.f186434a);
        navBarWithBigTile.setTitle(new TextLocalisedClause(i, u.c(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f300821c.f59357t), null, new d(this, continuation, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53226s), null, new qzb.d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.d), null, new qzb.d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f300820b.f), null, new qzb.d(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f300821c.b()), null, new qzb.d(this, continuation, 3), 3);
    }

    public final wxb.f d3() {
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (wxb.f) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k d() {
        return (k) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
