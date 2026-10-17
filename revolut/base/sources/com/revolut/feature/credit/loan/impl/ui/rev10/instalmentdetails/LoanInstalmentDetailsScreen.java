package com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails;

import aii.q;
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
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalLoadingV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.LoanInstalmentDetailsScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.LoanInstalmentDetailsScreenContract$InputData;
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
import te0.w;
import tx0.p2;
import vc.s;
import woc.p;
import xki.e;
import y4f.c;
import y5g.d;
import y65.b;
import y65.g;
import y65.i;
import y65.j;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/instalmentdetails/LoanInstalmentDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ly65/j;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanInstalmentDetailsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(LoanInstalmentDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileBinding;", 0))};
    public final LoanInstalmentDetailsScreenContract$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;

    public LoanInstalmentDetailsScreen(LoanInstalmentDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_recycler_navbarwithbigtile;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: y65.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanInstalmentDetailsScreen f311153b;

            {
                this.f311153b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LoanInstalmentDetailsScreen loanInstalmentDetailsScreen = this.f311153b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LoanInstalmentDetailsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(loanInstalmentDetailsScreen.m2()).a().get(u45.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
                        }
                        u45.h hVar = ((u45.h) aVar2.b()).B;
                        LoanInstalmentDetailsScreenContract$InputData loanInstalmentDetailsScreenContract$InputData = loanInstalmentDetailsScreen.K;
                        loanInstalmentDetailsScreenContract$InputData.getClass();
                        return new u45.s(hVar, loanInstalmentDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LoanInstalmentDetailsScreen.W;
                        return (g) ((u45.s) loanInstalmentDetailsScreen.N.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = LoanInstalmentDetailsScreen.W;
                        LoanInstalmentDetailsScreen loanInstalmentDetailsScreen2 = this.f311153b;
                        return dli.f.a(loanInstalmentDetailsScreen2, (g) loanInstalmentDetailsScreen2.O.getValue(), v.k((PlainTextWarningDelegate) loanInstalmentDetailsScreen2.Q.getValue(), (CellDetailsDelegate) loanInstalmentDetailsScreen2.R.getValue(), (CellDetailsChevronDelegate) loanInstalmentDetailsScreen2.S.getValue(), (FullScreenStateDelegate) loanInstalmentDetailsScreen2.T.getValue(), new CellDetailsLoadingDelegate(), (ProgressStepVerticalV2Delegate) loanInstalmentDetailsScreen2.U.getValue(), new ProgressStepVerticalLoadingV2Delegate(), (SmallActionButtonDelegate) loanInstalmentDetailsScreen2.V.getValue()), R$id.screenRecyclerNavBarWithBigTile_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: y65.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanInstalmentDetailsScreen f311153b;

            {
                this.f311153b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LoanInstalmentDetailsScreen loanInstalmentDetailsScreen = this.f311153b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanInstalmentDetailsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(loanInstalmentDetailsScreen.m2()).a().get(u45.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
                        }
                        u45.h hVar = ((u45.h) aVar2.b()).B;
                        LoanInstalmentDetailsScreenContract$InputData loanInstalmentDetailsScreenContract$InputData = loanInstalmentDetailsScreen.K;
                        loanInstalmentDetailsScreenContract$InputData.getClass();
                        return new u45.s(hVar, loanInstalmentDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LoanInstalmentDetailsScreen.W;
                        return (g) ((u45.s) loanInstalmentDetailsScreen.N.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = LoanInstalmentDetailsScreen.W;
                        LoanInstalmentDetailsScreen loanInstalmentDetailsScreen2 = this.f311153b;
                        return dli.f.a(loanInstalmentDetailsScreen2, (g) loanInstalmentDetailsScreen2.O.getValue(), v.k((PlainTextWarningDelegate) loanInstalmentDetailsScreen2.Q.getValue(), (CellDetailsDelegate) loanInstalmentDetailsScreen2.R.getValue(), (CellDetailsChevronDelegate) loanInstalmentDetailsScreen2.S.getValue(), (FullScreenStateDelegate) loanInstalmentDetailsScreen2.T.getValue(), new CellDetailsLoadingDelegate(), (ProgressStepVerticalV2Delegate) loanInstalmentDetailsScreen2.U.getValue(), new ProgressStepVerticalLoadingV2Delegate(), (SmallActionButtonDelegate) loanInstalmentDetailsScreen2.V.getValue()), R$id.screenRecyclerNavBarWithBigTile_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: y65.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanInstalmentDetailsScreen f311153b;

            {
                this.f311153b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LoanInstalmentDetailsScreen loanInstalmentDetailsScreen = this.f311153b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LoanInstalmentDetailsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(loanInstalmentDetailsScreen.m2()).a().get(u45.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
                        }
                        u45.h hVar = ((u45.h) aVar2.b()).B;
                        LoanInstalmentDetailsScreenContract$InputData loanInstalmentDetailsScreenContract$InputData = loanInstalmentDetailsScreen.K;
                        loanInstalmentDetailsScreenContract$InputData.getClass();
                        return new u45.s(hVar, loanInstalmentDetailsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = LoanInstalmentDetailsScreen.W;
                        return (g) ((u45.s) loanInstalmentDetailsScreen.N.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = LoanInstalmentDetailsScreen.W;
                        LoanInstalmentDetailsScreen loanInstalmentDetailsScreen2 = this.f311153b;
                        return dli.f.a(loanInstalmentDetailsScreen2, (g) loanInstalmentDetailsScreen2.O.getValue(), v.k((PlainTextWarningDelegate) loanInstalmentDetailsScreen2.Q.getValue(), (CellDetailsDelegate) loanInstalmentDetailsScreen2.R.getValue(), (CellDetailsChevronDelegate) loanInstalmentDetailsScreen2.S.getValue(), (FullScreenStateDelegate) loanInstalmentDetailsScreen2.T.getValue(), new CellDetailsLoadingDelegate(), (ProgressStepVerticalV2Delegate) loanInstalmentDetailsScreen2.U.getValue(), new ProgressStepVerticalLoadingV2Delegate(), (SmallActionButtonDelegate) loanInstalmentDetailsScreen2.V.getValue()), R$id.screenRecyclerNavBarWithBigTile_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = w.y0(new c(8));
        this.R = w.y0(new c(9));
        this.S = w.y0(new c(10));
        this.T = w.y0(new c(11));
        this.U = w.y0(new c(12));
        this.V = w.y0(new c(13));
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithBigTile navBarWithBigTile = d3().f174510b;
        i iVar = uiState.f311165a;
        if (!(iVar instanceof y65.h)) {
            if (iVar instanceof i.a) {
                navBarWithBigTile.setLoadingState(true);
                return;
            } else {
                if (!(iVar instanceof i.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                navBarWithBigTile.setLoadingState(false);
                return;
            }
        }
        navBarWithBigTile.setLoadingState(false);
        y65.h hVar = (y65.h) iVar;
        TextLocalisedClause textLocalisedClause = hVar.f311161b;
        navBarWithBigTile.setAvatar(new AvatarModel.Default(hVar.d, null, null, null, null, null, 126), r0.BLURRED_BACKGROUND);
        navBarWithBigTile.setTitle(new z0(hVar.f311160a, false));
        navBarWithBigTile.setToolbarTitle(textLocalisedClause);
        navBarWithBigTile.setActionStatusLabel(new k(6, textLocalisedClause, null, false));
        navBarWithBigTile.setDescription(hVar.f311162c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u45.s) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f174510b;
        navBarWithBigTile.setLayoutType(s0.CENTERED_SMALL_BUTTONS);
        navBarWithBigTile.setTitleStyle(b1.LARGE_SINGLE_LINE);
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setHeightMode(p2.f275222a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174510b.f59357t), new d(this, null, 1), 3);
        ViewController.P2(this, new t4j.c(vkm.q.J(rd0.e.b(((CellDetailsChevronDelegate) this.S.getValue()).f51821c), rd0.e.b(((CellDetailsDelegate) this.R.getValue()).e), rd0.e.b(((PlainTextWarningDelegate) this.Q.getValue()).d.f121375b), rd0.e.b(((FullScreenStateDelegate) this.T.getValue()).f52371h.f121375b), rd0.e.b(((ProgressStepVerticalV2Delegate) this.U.getValue()).d), rd0.e.b(((SmallActionButtonDelegate) this.V.getValue()).f53336c.f121375b)), 5), new p(2, (g) this.O.getValue(), g.class, "onItemClick", "onItemClick(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 16), 3);
    }

    public final d0 d3() {
        ViewBinding value = this.L.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d0) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }
}
