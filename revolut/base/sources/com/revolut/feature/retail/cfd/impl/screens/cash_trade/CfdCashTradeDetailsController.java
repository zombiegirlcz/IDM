package com.revolut.feature.retail.cfd.impl.screens.cash_trade;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.r0;
import au0.s0;
import au0.z0;
import aw0.k;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.retail.cfd.impl.screens.cash_trade.CfdCashTradeDetailsContract$InputData;
import com.revolut.feature.retail.cfd.impl.screens.cash_trade.CfdCashTradeDetailsController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import i7d.i;
import j3b.b;
import j3b.c;
import j3b.d;
import j3b.e;
import j3b.g;
import j3b.j;
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
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/cash_trade/CfdCashTradeDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lj3b/e;", "Li7d/i;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CfdCashTradeDetailsController extends ViewController<q> implements a, i {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(CfdCashTradeDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileBinding;", 0))};
    public final CfdCashTradeDetailsContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public CfdCashTradeDetailsController(CfdCashTradeDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbarwithbigtile;
        this.M = s.t(this, g.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: j3b.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdCashTradeDetailsController f171007b;

            {
                this.f171007b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CfdCashTradeDetailsController cfdCashTradeDetailsController = this.f171007b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CfdCashTradeDetailsController.Q;
                        CfdCashTradeDetailsController cfdCashTradeDetailsController2 = this.f171007b;
                        j jVar = (j) cfdCashTradeDetailsController2.P.getValue();
                        List listK = v.k(new CellDetailsDelegate(), new CellDetailsNoteDelegate());
                        ViewBinding value = cfdCashTradeDetailsController2.M.getValue(cfdCashTradeDetailsController2, CfdCashTradeDetailsController.Q[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        ScreenContentRecyclerView screenRecyclerNavBarWithBigTileRecyclerView = ((d0) value).f174511c;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavBarWithBigTileRecyclerView, "screenRecyclerNavBarWithBigTileRecyclerView");
                        return dli.f.a(cfdCashTradeDetailsController2, jVar, listK, screenRecyclerNavBarWithBigTileRecyclerView.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CfdCashTradeDetailsController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(cfdCashTradeDetailsController.m2()).a().get(m2b.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2b.v.class, " is not found"));
                        }
                        m2b.v vVar = ((m2b.v) aVar2.b()).C;
                        CfdCashTradeDetailsContract$InputData cfdCashTradeDetailsContract$InputData = cfdCashTradeDetailsController.K;
                        cfdCashTradeDetailsContract$InputData.getClass();
                        return new m2b.h(vVar, cfdCashTradeDetailsContract$InputData, cfdCashTradeDetailsController);
                    default:
                        KProperty[] kPropertyArr3 = CfdCashTradeDetailsController.Q;
                        return (j) ((m2b.h) cfdCashTradeDetailsController.O.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: j3b.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdCashTradeDetailsController f171007b;

            {
                this.f171007b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CfdCashTradeDetailsController cfdCashTradeDetailsController = this.f171007b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CfdCashTradeDetailsController.Q;
                        CfdCashTradeDetailsController cfdCashTradeDetailsController2 = this.f171007b;
                        j jVar = (j) cfdCashTradeDetailsController2.P.getValue();
                        List listK = v.k(new CellDetailsDelegate(), new CellDetailsNoteDelegate());
                        ViewBinding value = cfdCashTradeDetailsController2.M.getValue(cfdCashTradeDetailsController2, CfdCashTradeDetailsController.Q[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        ScreenContentRecyclerView screenRecyclerNavBarWithBigTileRecyclerView = ((d0) value).f174511c;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavBarWithBigTileRecyclerView, "screenRecyclerNavBarWithBigTileRecyclerView");
                        return dli.f.a(cfdCashTradeDetailsController2, jVar, listK, screenRecyclerNavBarWithBigTileRecyclerView.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CfdCashTradeDetailsController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(cfdCashTradeDetailsController.m2()).a().get(m2b.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2b.v.class, " is not found"));
                        }
                        m2b.v vVar = ((m2b.v) aVar2.b()).C;
                        CfdCashTradeDetailsContract$InputData cfdCashTradeDetailsContract$InputData = cfdCashTradeDetailsController.K;
                        cfdCashTradeDetailsContract$InputData.getClass();
                        return new m2b.h(vVar, cfdCashTradeDetailsContract$InputData, cfdCashTradeDetailsController);
                    default:
                        KProperty[] kPropertyArr3 = CfdCashTradeDetailsController.Q;
                        return (j) ((m2b.h) cfdCashTradeDetailsController.O.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: j3b.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CfdCashTradeDetailsController f171007b;

            {
                this.f171007b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CfdCashTradeDetailsController cfdCashTradeDetailsController = this.f171007b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CfdCashTradeDetailsController.Q;
                        CfdCashTradeDetailsController cfdCashTradeDetailsController2 = this.f171007b;
                        j jVar = (j) cfdCashTradeDetailsController2.P.getValue();
                        List listK = v.k(new CellDetailsDelegate(), new CellDetailsNoteDelegate());
                        ViewBinding value = cfdCashTradeDetailsController2.M.getValue(cfdCashTradeDetailsController2, CfdCashTradeDetailsController.Q[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        ScreenContentRecyclerView screenRecyclerNavBarWithBigTileRecyclerView = ((d0) value).f174511c;
                        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavBarWithBigTileRecyclerView, "screenRecyclerNavBarWithBigTileRecyclerView");
                        return dli.f.a(cfdCashTradeDetailsController2, jVar, listK, screenRecyclerNavBarWithBigTileRecyclerView.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CfdCashTradeDetailsController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(cfdCashTradeDetailsController.m2()).a().get(m2b.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m2b.v.class, " is not found"));
                        }
                        m2b.v vVar = ((m2b.v) aVar2.b()).C;
                        CfdCashTradeDetailsContract$InputData cfdCashTradeDetailsContract$InputData = cfdCashTradeDetailsController.K;
                        cfdCashTradeDetailsContract$InputData.getClass();
                        return new m2b.h(vVar, cfdCashTradeDetailsContract$InputData, cfdCashTradeDetailsController);
                    default:
                        KProperty[] kPropertyArr3 = CfdCashTradeDetailsController.Q;
                        return (j) ((m2b.h) cfdCashTradeDetailsController.O.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithBigTile screenRecyclerNavBarWithBigTileNavBarWithBigTile = ((d0) value).f174510b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavBarWithBigTileNavBarWithBigTile, "screenRecyclerNavBarWithBigTileNavBarWithBigTile");
        Clause clause = uiState.f171003a;
        Clause clause2 = uiState.f171004b;
        screenRecyclerNavBarWithBigTileNavBarWithBigTile.setToolbarTitleWithSubtitle(clause, clause2);
        screenRecyclerNavBarWithBigTileNavBarWithBigTile.setTitle(new z0(clause, false));
        screenRecyclerNavBarWithBigTileNavBarWithBigTile.setDescription(uiState.f171005c);
        d dVar = uiState.d;
        if (dVar instanceof b) {
            screenRecyclerNavBarWithBigTileNavBarWithBigTile.setAvatarGroup(((b) dVar).f170999a, true);
        } else {
            if (!(dVar instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            c cVar = (c) dVar;
            Image image = cVar.f171000a;
            CircleBadgeModel circleBadgeModel = cVar.f171002c;
            screenRecyclerNavBarWithBigTileNavBarWithBigTile.setAvatar(new AvatarModel.Default(image, null, null, null, circleBadgeModel != null ? new AvatarModel.BadgeModel(circleBadgeModel, com.revolut.core.ui_kit.models.avatar.b.BOTTOM) : null, null, LDSFile.EF_DG14_TAG), r0.BLURRED_BACKGROUND);
        }
        screenRecyclerNavBarWithBigTileNavBarWithBigTile.setActionStatusLabel(new k(6, clause2, null, false));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (m2b.h) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithBigTile screenRecyclerNavBarWithBigTileNavBarWithBigTile = ((d0) value).f174510b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavBarWithBigTileNavBarWithBigTile, "screenRecyclerNavBarWithBigTileNavBarWithBigTile");
        screenRecyclerNavBarWithBigTileNavBarWithBigTile.setHeightMode(p2.f275222a);
        screenRecyclerNavBarWithBigTileNavBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        screenRecyclerNavBarWithBigTileNavBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // i7d.i
    public final koi.a b1() {
        return ((dli.c) this.N.getValue()).w();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithBigTile screenRecyclerNavBarWithBigTileNavBarWithBigTile = ((d0) value).f174510b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavBarWithBigTileNavBarWithBigTile, "screenRecyclerNavBarWithBigTileNavBarWithBigTile");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(screenRecyclerNavBarWithBigTileNavBarWithBigTile.f59357t), null, new j2c.b(this, null, 4), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
