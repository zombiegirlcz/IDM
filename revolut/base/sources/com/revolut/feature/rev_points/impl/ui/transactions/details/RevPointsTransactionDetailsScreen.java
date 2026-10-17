package com.revolut.feature.rev_points.impl.ui.transactions.details;

import aii.q;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.r0;
import au0.s0;
import au0.z0;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.rev_points.impl.R$id;
import com.revolut.feature.rev_points.impl.R$layout;
import com.revolut.feature.rev_points.impl.ui.transactions.details.RevPointsTransactionDetailsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mta.c;
import n0c.d;
import n0c.f;
import n0c.g;
import n0c.j;
import n0c.k;
import n0c.l;
import n0c.n;
import no.m;
import org.jmrtd.lds.LDSFile;
import rp0.l0;
import te0.w;
import tx0.p2;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/transactions/details/RevPointsTransactionDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ln0c/n;", "Lno/m;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsTransactionDetailsScreen extends ViewController<q> implements dli.a, m {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(RevPointsTransactionDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/rev_points/impl/databinding/ScreenRevPointsTransactionDetailsBinding;", 0))};
    public final RevPointsTransactionDetailsScreenContract$InputData K;
    public final int L;
    public final AnalyticsProduct.Retail M;
    public final RowDelegate N;
    public final SwipeToActionDelegate O;
    public final CellDetailsChevronDelegate P;
    public final CellDetailsDelegate Q;
    public final ActionsDelegate R;
    public final Object S;
    public final h T;
    public final Object U;
    public final Object V;
    public final Object W;

    public RevPointsTransactionDetailsScreen(RevPointsTransactionDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_rev_points_transaction_details;
        k9 k9Var = k9.RevPoints;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.M = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.N = rowDelegate;
        final int i = 0;
        this.O = new SwipeToActionDelegate(rowDelegate, false);
        this.P = new CellDetailsChevronDelegate();
        this.Q = new CellDetailsDelegate();
        this.R = new ActionsDelegate();
        this.S = w.y0(new Function0(this) { // from class: n0c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsTransactionDetailsScreen f210979b;

            {
                this.f210979b = this;
            }

            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RevPointsTransactionDetailsScreen revPointsTransactionDetailsScreen = this.f210979b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsTransactionDetailsScreen.X;
                        RevPointsTransactionDetailsScreen revPointsTransactionDetailsScreen2 = this.f210979b;
                        return dli.f.a(revPointsTransactionDetailsScreen2, revPointsTransactionDetailsScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), new CellDetailsNoteDelegate(), new FullScreenStateDelegate(), new CellDetailsActionDelegate(), new TextDelegate(), revPointsTransactionDetailsScreen2.R, revPointsTransactionDetailsScreen2.Q, revPointsTransactionDetailsScreen2.O, revPointsTransactionDetailsScreen2.P), R$id.revPointsTransactionDetails_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsTransactionDetailsScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsTransactionDetailsScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (zxb.h0) ((o0c.a) ((o0c.b) aVar2.b()).b().mo3808a(revPointsTransactionDetailsScreen)).D(revPointsTransactionDetailsScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                    case 2:
                        KProperty[] kPropertyArr3 = RevPointsTransactionDetailsScreen.X;
                        zxb.h0 h0Var = (zxb.h0) revPointsTransactionDetailsScreen.U.getValue();
                        switch (h0Var.f326157a) {
                            case 0:
                                return (j) h0Var.f326161h.get();
                            case 1:
                                return (j) h0Var.f326161h.get();
                            default:
                                return (j) h0Var.f326161h.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = RevPointsTransactionDetailsScreen.X;
                        zxb.h0 h0Var2 = (zxb.h0) revPointsTransactionDetailsScreen.U.getValue();
                        switch (h0Var2.f326157a) {
                            case 0:
                                return (l0) h0Var2.f326160g.get();
                            case 1:
                                return (l0) h0Var2.f326160g.get();
                            default:
                                return (l0) h0Var2.f326160g.get();
                        }
                }
            }
        });
        this.T = s.t(this, n0c.b.f);
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: n0c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsTransactionDetailsScreen f210979b;

            {
                this.f210979b = this;
            }

            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RevPointsTransactionDetailsScreen revPointsTransactionDetailsScreen = this.f210979b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsTransactionDetailsScreen.X;
                        RevPointsTransactionDetailsScreen revPointsTransactionDetailsScreen2 = this.f210979b;
                        return dli.f.a(revPointsTransactionDetailsScreen2, revPointsTransactionDetailsScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), new CellDetailsNoteDelegate(), new FullScreenStateDelegate(), new CellDetailsActionDelegate(), new TextDelegate(), revPointsTransactionDetailsScreen2.R, revPointsTransactionDetailsScreen2.Q, revPointsTransactionDetailsScreen2.O, revPointsTransactionDetailsScreen2.P), R$id.revPointsTransactionDetails_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsTransactionDetailsScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsTransactionDetailsScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (zxb.h0) ((o0c.a) ((o0c.b) aVar2.b()).b().mo3808a(revPointsTransactionDetailsScreen)).D(revPointsTransactionDetailsScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                    case 2:
                        KProperty[] kPropertyArr3 = RevPointsTransactionDetailsScreen.X;
                        zxb.h0 h0Var = (zxb.h0) revPointsTransactionDetailsScreen.U.getValue();
                        switch (h0Var.f326157a) {
                            case 0:
                                return (j) h0Var.f326161h.get();
                            case 1:
                                return (j) h0Var.f326161h.get();
                            default:
                                return (j) h0Var.f326161h.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = RevPointsTransactionDetailsScreen.X;
                        zxb.h0 h0Var2 = (zxb.h0) revPointsTransactionDetailsScreen.U.getValue();
                        switch (h0Var2.f326157a) {
                            case 0:
                                return (l0) h0Var2.f326160g.get();
                            case 1:
                                return (l0) h0Var2.f326160g.get();
                            default:
                                return (l0) h0Var2.f326160g.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: n0c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsTransactionDetailsScreen f210979b;

            {
                this.f210979b = this;
            }

            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RevPointsTransactionDetailsScreen revPointsTransactionDetailsScreen = this.f210979b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsTransactionDetailsScreen.X;
                        RevPointsTransactionDetailsScreen revPointsTransactionDetailsScreen2 = this.f210979b;
                        return dli.f.a(revPointsTransactionDetailsScreen2, revPointsTransactionDetailsScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), new CellDetailsNoteDelegate(), new FullScreenStateDelegate(), new CellDetailsActionDelegate(), new TextDelegate(), revPointsTransactionDetailsScreen2.R, revPointsTransactionDetailsScreen2.Q, revPointsTransactionDetailsScreen2.O, revPointsTransactionDetailsScreen2.P), R$id.revPointsTransactionDetails_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsTransactionDetailsScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsTransactionDetailsScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (zxb.h0) ((o0c.a) ((o0c.b) aVar2.b()).b().mo3808a(revPointsTransactionDetailsScreen)).D(revPointsTransactionDetailsScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                    case 2:
                        KProperty[] kPropertyArr3 = RevPointsTransactionDetailsScreen.X;
                        zxb.h0 h0Var = (zxb.h0) revPointsTransactionDetailsScreen.U.getValue();
                        switch (h0Var.f326157a) {
                            case 0:
                                return (j) h0Var.f326161h.get();
                            case 1:
                                return (j) h0Var.f326161h.get();
                            default:
                                return (j) h0Var.f326161h.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = RevPointsTransactionDetailsScreen.X;
                        zxb.h0 h0Var2 = (zxb.h0) revPointsTransactionDetailsScreen.U.getValue();
                        switch (h0Var2.f326157a) {
                            case 0:
                                return (l0) h0Var2.f326160g.get();
                            case 1:
                                return (l0) h0Var2.f326160g.get();
                            default:
                                return (l0) h0Var2.f326160g.get();
                        }
                }
            }
        });
        final int i5 = 3;
        this.W = w.y0(new Function0(this) { // from class: n0c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RevPointsTransactionDetailsScreen f210979b;

            {
                this.f210979b = this;
            }

            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                RevPointsTransactionDetailsScreen revPointsTransactionDetailsScreen = this.f210979b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RevPointsTransactionDetailsScreen.X;
                        RevPointsTransactionDetailsScreen revPointsTransactionDetailsScreen2 = this.f210979b;
                        return dli.f.a(revPointsTransactionDetailsScreen2, revPointsTransactionDetailsScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), new CellDetailsNoteDelegate(), new FullScreenStateDelegate(), new CellDetailsActionDelegate(), new TextDelegate(), revPointsTransactionDetailsScreen2.R, revPointsTransactionDetailsScreen2.Q, revPointsTransactionDetailsScreen2.O, revPointsTransactionDetailsScreen2.P), R$id.revPointsTransactionDetails_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RevPointsTransactionDetailsScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(revPointsTransactionDetailsScreen.m2()).a().get(zxb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (zxb.h0) ((o0c.a) ((o0c.b) aVar2.b()).b().mo3808a(revPointsTransactionDetailsScreen)).D(revPointsTransactionDetailsScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", zxb.e.class, " is not found"));
                    case 2:
                        KProperty[] kPropertyArr3 = RevPointsTransactionDetailsScreen.X;
                        zxb.h0 h0Var = (zxb.h0) revPointsTransactionDetailsScreen.U.getValue();
                        switch (h0Var.f326157a) {
                            case 0:
                                return (j) h0Var.f326161h.get();
                            case 1:
                                return (j) h0Var.f326161h.get();
                            default:
                                return (j) h0Var.f326161h.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = RevPointsTransactionDetailsScreen.X;
                        zxb.h0 h0Var2 = (zxb.h0) revPointsTransactionDetailsScreen.U.getValue();
                        switch (h0Var2.f326157a) {
                            case 0:
                                return (l0) h0Var2.f326160g.get();
                            case 1:
                                return (l0) h0Var2.f326160g.get();
                            default:
                                return (l0) h0Var2.f326160g.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithBigTile navBarWithBigTile = d3().f300834b;
        n0c.m mVar = uiState.f210989a;
        if (mVar instanceof l) {
            navBarWithBigTile.setLoadingState(true);
            return;
        }
        if (!(mVar instanceof k)) {
            throw new NoWhenBranchMatchedException();
        }
        navBarWithBigTile.setLoadingState(false);
        k kVar = (k) mVar;
        Clause clause = kVar.f210986b;
        Image image = kVar.d;
        CircleBadgeModel circleBadgeModel = kVar.e;
        navBarWithBigTile.setAvatar(new AvatarModel.Default(image, null, null, null, circleBadgeModel != null ? new AvatarModel.BadgeModel(circleBadgeModel, com.revolut.core.ui_kit.models.avatar.b.BOTTOM) : null, null, LDSFile.EF_DG14_TAG), r0.BLURRED_BACKGROUND);
        navBarWithBigTile.setIconClickable(false);
        navBarWithBigTile.setToolbarTitle(clause);
        navBarWithBigTile.setActionStatusLabel(new aw0.k(6, clause, null, false));
        navBarWithBigTile.setTitle(new z0(kVar.f210985a, false));
        navBarWithBigTile.setDescription(new au0.o0(kVar.f210987c));
        navBarWithBigTile.setMenuItems(v.l(uiState.f210991c));
        navBarWithBigTile.setActions(uiState.f210990b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (zxb.h0) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f300834b;
        navBarWithBigTile.setLayoutType(s0.CENTERED_SMALL_BUTTONS);
        navBarWithBigTile.setTitleStyle(b1.LARGE_SINGLE_LINE);
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setHeightMode(p2.f275222a);
        navBarWithBigTile.setIconClickable(false);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f300834b;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithBigTile.f59357t), null, new c(this, continuation, 9), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithBigTile.K()), null, new n0c.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithBigTile.b()), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((l0) this.W.getValue()).f256113c), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f51821c), null, new n0c.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f53218h), null, new g(this, null), 3);
    }

    public final wxb.k d3() {
        ViewBinding value = this.T.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (wxb.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.V.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
