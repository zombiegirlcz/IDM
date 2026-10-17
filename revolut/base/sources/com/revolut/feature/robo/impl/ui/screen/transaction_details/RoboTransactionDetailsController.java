package com.revolut.feature.robo.impl.ui.screen.transaction_details;

import aii.q;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.r0;
import au0.s0;
import aw0.k;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.robo.impl.ui.screen.transaction_details.RoboTransactionDetailsController;
import com.revolut.feature.robo.impl.ui.screen.transaction_details.RoboTransactionDetailsControllerContract$Input;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import dli.c;
import dmc.r;
import grl.k9;
import java.util.List;
import jii.d0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import org.jmrtd.lds.LDSFile;
import te0.w;
import tx0.p2;
import vc.s;
import zhm.u;
import zhm.v;
import znc.b;
import znc.e;
import znc.f;
import znc.g;
import znc.n;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/screen/transaction_details/RoboTransactionDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lznc/h;", "Lno/m;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RoboTransactionDetailsController extends ViewController<q> implements a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(RoboTransactionDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileBinding;", 0))};
    public final RoboTransactionDetailsControllerContract$Input K;
    public final int L;
    public final h M;
    public final CellDetailsActionDelegate N;
    public final CellDetailsChevronDelegate O;
    public final LargeActionButtonDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final AnalyticsProduct.Retail T;

    public RoboTransactionDetailsController(RoboTransactionDetailsControllerContract$Input inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbarwithbigtile;
        this.M = s.t(this, b.f);
        this.N = new CellDetailsActionDelegate();
        this.O = new CellDetailsChevronDelegate();
        this.P = new LargeActionButtonDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: znc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RoboTransactionDetailsController f323688b;

            {
                this.f323688b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RoboTransactionDetailsController roboTransactionDetailsController = this.f323688b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RoboTransactionDetailsController.U;
                        RoboTransactionDetailsController roboTransactionDetailsController2 = this.f323688b;
                        n nVar = (n) roboTransactionDetailsController2.R.getValue();
                        List listK = v.k(new CellDetailsDelegate(), roboTransactionDetailsController2.N, roboTransactionDetailsController2.O, new CellDetailsLoadingDelegate(), new PlainTextDelegate());
                        ViewBinding value = roboTransactionDetailsController2.M.getValue(roboTransactionDetailsController2, RoboTransactionDetailsController.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        ScreenContentRecyclerView screenRecyclerNavBarWithBigTileRecyclerView = ((d0) value).f174511c;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavBarWithBigTileRecyclerView, "screenRecyclerNavBarWithBigTileRecyclerView");
                        return dli.f.a(roboTransactionDetailsController2, nVar, listK, screenRecyclerNavBarWithBigTileRecyclerView.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RoboTransactionDetailsController.U;
                        return (n) ((dmc.q) roboTransactionDetailsController.S.getValue()).f116026l.get();
                    default:
                        KProperty[] kPropertyArr3 = RoboTransactionDetailsController.U;
                        phm.a aVar = (phm.a) ue0.e.j(roboTransactionDetailsController.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                        }
                        r rVar = ((r) aVar2.b()).f116039s;
                        RoboTransactionDetailsControllerContract$Input roboTransactionDetailsControllerContract$Input = roboTransactionDetailsController.K;
                        roboTransactionDetailsControllerContract$Input.getClass();
                        return new dmc.q(rVar, roboTransactionDetailsController, roboTransactionDetailsControllerContract$Input, new v1h.a(roboTransactionDetailsController.O));
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: znc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RoboTransactionDetailsController f323688b;

            {
                this.f323688b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RoboTransactionDetailsController roboTransactionDetailsController = this.f323688b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RoboTransactionDetailsController.U;
                        RoboTransactionDetailsController roboTransactionDetailsController2 = this.f323688b;
                        n nVar = (n) roboTransactionDetailsController2.R.getValue();
                        List listK = v.k(new CellDetailsDelegate(), roboTransactionDetailsController2.N, roboTransactionDetailsController2.O, new CellDetailsLoadingDelegate(), new PlainTextDelegate());
                        ViewBinding value = roboTransactionDetailsController2.M.getValue(roboTransactionDetailsController2, RoboTransactionDetailsController.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        ScreenContentRecyclerView screenRecyclerNavBarWithBigTileRecyclerView = ((d0) value).f174511c;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavBarWithBigTileRecyclerView, "screenRecyclerNavBarWithBigTileRecyclerView");
                        return dli.f.a(roboTransactionDetailsController2, nVar, listK, screenRecyclerNavBarWithBigTileRecyclerView.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RoboTransactionDetailsController.U;
                        return (n) ((dmc.q) roboTransactionDetailsController.S.getValue()).f116026l.get();
                    default:
                        KProperty[] kPropertyArr3 = RoboTransactionDetailsController.U;
                        phm.a aVar = (phm.a) ue0.e.j(roboTransactionDetailsController.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                        }
                        r rVar = ((r) aVar2.b()).f116039s;
                        RoboTransactionDetailsControllerContract$Input roboTransactionDetailsControllerContract$Input = roboTransactionDetailsController.K;
                        roboTransactionDetailsControllerContract$Input.getClass();
                        return new dmc.q(rVar, roboTransactionDetailsController, roboTransactionDetailsControllerContract$Input, new v1h.a(roboTransactionDetailsController.O));
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: znc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RoboTransactionDetailsController f323688b;

            {
                this.f323688b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RoboTransactionDetailsController roboTransactionDetailsController = this.f323688b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RoboTransactionDetailsController.U;
                        RoboTransactionDetailsController roboTransactionDetailsController2 = this.f323688b;
                        n nVar = (n) roboTransactionDetailsController2.R.getValue();
                        List listK = v.k(new CellDetailsDelegate(), roboTransactionDetailsController2.N, roboTransactionDetailsController2.O, new CellDetailsLoadingDelegate(), new PlainTextDelegate());
                        ViewBinding value = roboTransactionDetailsController2.M.getValue(roboTransactionDetailsController2, RoboTransactionDetailsController.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        ScreenContentRecyclerView screenRecyclerNavBarWithBigTileRecyclerView = ((d0) value).f174511c;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavBarWithBigTileRecyclerView, "screenRecyclerNavBarWithBigTileRecyclerView");
                        return dli.f.a(roboTransactionDetailsController2, nVar, listK, screenRecyclerNavBarWithBigTileRecyclerView.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = RoboTransactionDetailsController.U;
                        return (n) ((dmc.q) roboTransactionDetailsController.S.getValue()).f116026l.get();
                    default:
                        KProperty[] kPropertyArr3 = RoboTransactionDetailsController.U;
                        phm.a aVar = (phm.a) ue0.e.j(roboTransactionDetailsController.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                        }
                        r rVar = ((r) aVar2.b()).f116039s;
                        RoboTransactionDetailsControllerContract$Input roboTransactionDetailsControllerContract$Input = roboTransactionDetailsController.K;
                        roboTransactionDetailsControllerContract$Input.getClass();
                        return new dmc.q(rVar, roboTransactionDetailsController, roboTransactionDetailsControllerContract$Input, new v1h.a(roboTransactionDetailsController.O));
                }
            }
        });
        k9 k9Var = k9.RoboAdvisor;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.T = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        znc.h uiState = (znc.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithBigTile screenRecyclerNavBarWithBigTileNavBarWithBigTile = ((d0) value).f174510b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavBarWithBigTileNavBarWithBigTile, "screenRecyclerNavBarWithBigTileNavBarWithBigTile");
        g gVar = uiState.f323695a;
        if (Intrinsics.f(gVar, f.f323694a)) {
            screenRecyclerNavBarWithBigTileNavBarWithBigTile.setLoadingState(true);
            return;
        }
        if (!(gVar instanceof e)) {
            if (gVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        screenRecyclerNavBarWithBigTileNavBarWithBigTile.setLoadingState(false);
        e eVar = (e) gVar;
        ?? r110 = eVar.f323692b;
        MoneyClause moneyClause = eVar.f323691a;
        screenRecyclerNavBarWithBigTileNavBarWithBigTile.setToolbarTitleWithSubtitle(moneyClause, r110);
        screenRecyclerNavBarWithBigTileNavBarWithBigTile.setTitle(moneyClause);
        screenRecyclerNavBarWithBigTileNavBarWithBigTile.setDescription(eVar.f323693c);
        Image image = eVar.d;
        CircleBadgeModel circleBadgeModel = eVar.f;
        screenRecyclerNavBarWithBigTileNavBarWithBigTile.setAvatar(new AvatarModel.Default(image, null, null, null, circleBadgeModel != null ? new AvatarModel.BadgeModel(circleBadgeModel, com.revolut.core.ui_kit.models.avatar.b.BOTTOM) : null, null, LDSFile.EF_DG14_TAG), r0.BLURRED_BACKGROUND);
        screenRecyclerNavBarWithBigTileNavBarWithBigTile.setActionStatusLabel(new k(6, r110, null, false));
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getP() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (dmc.q) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (n) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((dmc.q) this.S.getValue()).f.get()).d(u.c(this.P));
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithBigTile screenRecyclerNavBarWithBigTileNavBarWithBigTile = ((d0) value).f174510b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavBarWithBigTileNavBarWithBigTile, "screenRecyclerNavBarWithBigTileNavBarWithBigTile");
        screenRecyclerNavBarWithBigTileNavBarWithBigTile.setHeightMode(p2.f275222a);
        screenRecyclerNavBarWithBigTileNavBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        screenRecyclerNavBarWithBigTileNavBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithBigTile screenRecyclerNavBarWithBigTileNavBarWithBigTile = ((d0) value).f174510b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavBarWithBigTileNavBarWithBigTile, "screenRecyclerNavBarWithBigTileNavBarWithBigTile");
        ViewController.P2(this, rd0.e.b(screenRecyclerNavBarWithBigTileNavBarWithBigTile.f59357t), new z3f.b(this, null, 21), 3);
        efm.r rVarMerge = efm.r.merge(this.N.d, this.O.f51821c, this.P.d.f121375b);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        ViewController.P2(this, new z75.f(rd0.e.b(rVarMerge), 14), new zfd.s(this, (Continuation) null, 18), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
