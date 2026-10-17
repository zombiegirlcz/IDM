package com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge;

import aii.q;
import akb.b;
import akb.c;
import akb.f;
import akb.g;
import akb.m;
import akb.n;
import akb.p;
import akb.r;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.r0;
import au0.s0;
import au0.z0;
import aw0.k;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.ManageChallengeScreen;
import com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.ManageChallengeScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jii.d0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jmrtd.lds.LDSFile;
import te0.w;
import tx0.p2;
import vc.s;
import vjb.d;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/challenge/presentation/manage_challenge/ManageChallengeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lakb/r;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ManageChallengeScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(ManageChallengeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileBinding;", 0))};
    public final ManageChallengeScreenContract$InputData K;
    public final int L;
    public final PlainTextWarningDelegate M;
    public final CellDetailsChevronDelegate N;
    public final FullScreenStateDelegate O;
    public final CellDetailsDelegate P;
    public final Object Q;
    public final h R;
    public final Object S;
    public final Object T;

    public ManageChallengeScreen(ManageChallengeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbarwithbigtile;
        this.M = new PlainTextWarningDelegate();
        this.N = new CellDetailsChevronDelegate();
        this.O = new FullScreenStateDelegate();
        this.P = new CellDetailsDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: akb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageChallengeScreen f5769b;

            {
                this.f5769b = this;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ManageChallengeScreen manageChallengeScreen = this.f5769b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ManageChallengeScreen.U;
                        ManageChallengeScreen manageChallengeScreen2 = this.f5769b;
                        return dli.f.a(manageChallengeScreen2, manageChallengeScreen2.d(), v.k(manageChallengeScreen2.P, new CellDetailsLoadingDelegate(), manageChallengeScreen2.O, manageChallengeScreen2.N, manageChallengeScreen2.M), R$id.screenRecyclerNavBarWithBigTile_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ManageChallengeScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(manageChallengeScreen.m2()).a().get(vjb.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vjb.g.class, " is not found"));
                        }
                        vjb.g gVar = ((vjb.g) aVar2.b()).f;
                        ManageChallengeScreenContract$InputData manageChallengeScreenContract$InputData = manageChallengeScreen.K;
                        manageChallengeScreenContract$InputData.getClass();
                        return new vjb.d(gVar, manageChallengeScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ManageChallengeScreen.U;
                        return (m) ((vjb.d) manageChallengeScreen.S.getValue()).f289687c.get();
                }
            }
        });
        this.R = s.t(this, b.f);
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: akb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageChallengeScreen f5769b;

            {
                this.f5769b = this;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ManageChallengeScreen manageChallengeScreen = this.f5769b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ManageChallengeScreen.U;
                        ManageChallengeScreen manageChallengeScreen2 = this.f5769b;
                        return dli.f.a(manageChallengeScreen2, manageChallengeScreen2.d(), v.k(manageChallengeScreen2.P, new CellDetailsLoadingDelegate(), manageChallengeScreen2.O, manageChallengeScreen2.N, manageChallengeScreen2.M), R$id.screenRecyclerNavBarWithBigTile_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ManageChallengeScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(manageChallengeScreen.m2()).a().get(vjb.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vjb.g.class, " is not found"));
                        }
                        vjb.g gVar = ((vjb.g) aVar2.b()).f;
                        ManageChallengeScreenContract$InputData manageChallengeScreenContract$InputData = manageChallengeScreen.K;
                        manageChallengeScreenContract$InputData.getClass();
                        return new vjb.d(gVar, manageChallengeScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ManageChallengeScreen.U;
                        return (m) ((vjb.d) manageChallengeScreen.S.getValue()).f289687c.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: akb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManageChallengeScreen f5769b;

            {
                this.f5769b = this;
            }

            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ManageChallengeScreen manageChallengeScreen = this.f5769b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ManageChallengeScreen.U;
                        ManageChallengeScreen manageChallengeScreen2 = this.f5769b;
                        return dli.f.a(manageChallengeScreen2, manageChallengeScreen2.d(), v.k(manageChallengeScreen2.P, new CellDetailsLoadingDelegate(), manageChallengeScreen2.O, manageChallengeScreen2.N, manageChallengeScreen2.M), R$id.screenRecyclerNavBarWithBigTile_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ManageChallengeScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(manageChallengeScreen.m2()).a().get(vjb.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vjb.g.class, " is not found"));
                        }
                        vjb.g gVar = ((vjb.g) aVar2.b()).f;
                        ManageChallengeScreenContract$InputData manageChallengeScreenContract$InputData = manageChallengeScreen.K;
                        manageChallengeScreenContract$InputData.getClass();
                        return new vjb.d(gVar, manageChallengeScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ManageChallengeScreen.U;
                        return (m) ((vjb.d) manageChallengeScreen.S.getValue()).f289687c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithBigTile navBarWithBigTile = d3().f174510b;
        akb.q qVar2 = uiState.f5781a;
        if (!(qVar2 instanceof n)) {
            if (qVar2.equals(p.f5780a)) {
                navBarWithBigTile.setLoadingState(true);
                return;
            } else {
                if (!qVar2.equals(akb.o.f5779a)) {
                    throw new NoWhenBranchMatchedException();
                }
                navBarWithBigTile.setLoadingState(false);
                return;
            }
        }
        n nVar = (n) qVar2;
        navBarWithBigTile.setLoadingState(false);
        navBarWithBigTile.setAvatar(new AvatarModel.Default(nVar.f5776a, null, null, null, new AvatarModel.BadgeModel(new AccentCircleBadge(dw0.a.Recurring), com.revolut.core.ui_kit.models.avatar.b.BOTTOM), null, LDSFile.EF_DG14_TAG), r0.BLURRED_BACKGROUND);
        navBarWithBigTile.setTitle(new z0(nVar.f5778c, false));
        navBarWithBigTile.setDescription(nVar.d);
        navBarWithBigTile.setActionStatusLabel(new k(6, nVar.f5777b, null, false));
        navBarWithBigTile.setActions(nVar.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f174510b;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setHeightMode(p2.f275222a);
        navBarWithBigTile.setLayoutType(s0.CENTERED_SMALL_BUTTONS);
        navBarWithBigTile.setTitleStyle(b1.LARGE_SINGLE_LINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174510b.f59357t), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174510b.K()), null, new akb.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.d.f121375b), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f51821c), null, new akb.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.e), null, new g(this, null), 3);
    }

    public final d0 d3() {
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d0) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m d() {
        return (m) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
