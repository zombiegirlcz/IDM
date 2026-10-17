package com.revolut.feature.corporate_events.impl.ui.screen.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.r0;
import au0.s0;
import aw0.i;
import cli.o;
import cli.u;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.avatar.b;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.corporate_events.impl.R$layout;
import com.revolut.feature.corporate_events.impl.ui.screen.details.CorporateEventDetailsContract$InputData;
import com.revolut.feature.corporate_events.impl.ui.screen.details.CorporateEventDetailsController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import gp3.e;
import gp3.f;
import gp3.g;
import gp3.j;
import gp3.k;
import gp3.l;
import gp3.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m8b.c;
import org.jmrtd.lds.LDSFile;
import te0.w;
import tx0.p2;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/corporate_events/impl/ui/screen/details/CorporateEventDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lgp3/h;", "feature_corporate_events_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CorporateEventDetailsController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CorporateEventDetailsController.class, "binding", "getBinding()Lcom/revolut/feature/corporate_events/impl/databinding/ScreenCorporateEventDetailBinding;", 0))};
    public final CorporateEventDetailsContract$InputData K;
    public final h L;
    public final CellDetailsDelegate M;
    public final LargeActionButtonDelegate N;
    public final TwinHorizontalButtonDelegate O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public CorporateEventDetailsController(CorporateEventDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, m.f);
        this.M = new CellDetailsDelegate();
        this.N = new LargeActionButtonDelegate();
        this.O = new TwinHorizontalButtonDelegate();
        this.P = R$layout.screen_corporate_event_detail;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: gp3.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorporateEventDetailsController f145238b;

            {
                this.f145238b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CorporateEventDetailsController corporateEventDetailsController = this.f145238b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CorporateEventDetailsController.T;
                        CorporateEventDetailsController corporateEventDetailsController2 = this.f145238b;
                        return dli.f.a(corporateEventDetailsController2, corporateEventDetailsController2.d(), v.k(corporateEventDetailsController2.M, corporateEventDetailsController2.N, corporateEventDetailsController2.O, new CellDetailsLoadingDelegate(), new PlainTextDelegate(), new ListSubheaderDelegate()), corporateEventDetailsController2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CorporateEventDetailsController.T;
                        phm.a aVar = (phm.a) ue0.e.j(corporateEventDetailsController.m2()).a().get(wo3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", wo3.a.class, " is not found"));
                        }
                        ap3.h hVar = ((ap3.h) ((ap3.a) aVar2.b())).f8091h;
                        CorporateEventDetailsContract$InputData corporateEventDetailsContract$InputData = corporateEventDetailsController.K;
                        corporateEventDetailsContract$InputData.getClass();
                        return new ap3.c(hVar, corporateEventDetailsContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CorporateEventDetailsController.T;
                        return (a) ((ap3.c) corporateEventDetailsController.R.getValue()).f8064c.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: gp3.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorporateEventDetailsController f145238b;

            {
                this.f145238b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CorporateEventDetailsController corporateEventDetailsController = this.f145238b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CorporateEventDetailsController.T;
                        CorporateEventDetailsController corporateEventDetailsController2 = this.f145238b;
                        return dli.f.a(corporateEventDetailsController2, corporateEventDetailsController2.d(), v.k(corporateEventDetailsController2.M, corporateEventDetailsController2.N, corporateEventDetailsController2.O, new CellDetailsLoadingDelegate(), new PlainTextDelegate(), new ListSubheaderDelegate()), corporateEventDetailsController2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CorporateEventDetailsController.T;
                        phm.a aVar = (phm.a) ue0.e.j(corporateEventDetailsController.m2()).a().get(wo3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", wo3.a.class, " is not found"));
                        }
                        ap3.h hVar = ((ap3.h) ((ap3.a) aVar2.b())).f8091h;
                        CorporateEventDetailsContract$InputData corporateEventDetailsContract$InputData = corporateEventDetailsController.K;
                        corporateEventDetailsContract$InputData.getClass();
                        return new ap3.c(hVar, corporateEventDetailsContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CorporateEventDetailsController.T;
                        return (a) ((ap3.c) corporateEventDetailsController.R.getValue()).f8064c.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: gp3.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorporateEventDetailsController f145238b;

            {
                this.f145238b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CorporateEventDetailsController corporateEventDetailsController = this.f145238b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CorporateEventDetailsController.T;
                        CorporateEventDetailsController corporateEventDetailsController2 = this.f145238b;
                        return dli.f.a(corporateEventDetailsController2, corporateEventDetailsController2.d(), v.k(corporateEventDetailsController2.M, corporateEventDetailsController2.N, corporateEventDetailsController2.O, new CellDetailsLoadingDelegate(), new PlainTextDelegate(), new ListSubheaderDelegate()), corporateEventDetailsController2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CorporateEventDetailsController.T;
                        phm.a aVar = (phm.a) ue0.e.j(corporateEventDetailsController.m2()).a().get(wo3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", wo3.a.class, " is not found"));
                        }
                        ap3.h hVar = ((ap3.h) ((ap3.a) aVar2.b())).f8091h;
                        CorporateEventDetailsContract$InputData corporateEventDetailsContract$InputData = corporateEventDetailsController.K;
                        corporateEventDetailsContract$InputData.getClass();
                        return new ap3.c(hVar, corporateEventDetailsContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CorporateEventDetailsController.T;
                        return (a) ((ap3.c) corporateEventDetailsController.R.getValue()).f8064c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        gp3.h uiState = (gp3.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithBigTile screenCorporateEventDetailNavBar = d3().f307590c;
        Intrinsics.checkNotNullExpressionValue(screenCorporateEventDetailNavBar, "screenCorporateEventDetailNavBar");
        g gVar = uiState.f145234a;
        if (gVar == null) {
            screenCorporateEventDetailNavBar.setVisibility(8);
        } else if (gVar instanceof f) {
            screenCorporateEventDetailNavBar.setLoadingState(true);
        } else {
            if (!(gVar instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            screenCorporateEventDetailNavBar.setLoadingState(false);
            m8b.e eVar = ((e) gVar).f145232a;
            screenCorporateEventDetailNavBar.setTitle(eVar.f203462a);
            screenCorporateEventDetailNavBar.setDescription(eVar.f203463b);
            c cVar = eVar.e;
            if (cVar instanceof m8b.a) {
                screenCorporateEventDetailNavBar.setAvatarGroup(((m8b.a) cVar).f203460a, true);
            } else {
                Image image = eVar.f203464c;
                if (image != null) {
                    CircleBadgeModel circleBadgeModel = eVar.d;
                    screenCorporateEventDetailNavBar.setAvatar(new AvatarModel.Default(image, null, null, null, circleBadgeModel != null ? new AvatarModel.BadgeModel(circleBadgeModel, b.BOTTOM) : null, null, LDSFile.EF_DG14_TAG), r0.BLURRED_BACKGROUND);
                }
            }
            screenCorporateEventDetailNavBar.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        }
        i iVar = uiState.f145235b;
        if (iVar != null) {
            d3().f307589b.setModel(iVar);
            ActionFooterView screenCorporateEventDetailActionFooterView = d3().f307589b;
            Intrinsics.checkNotNullExpressionValue(screenCorporateEventDetailActionFooterView, "screenCorporateEventDetailActionFooterView");
            if (!screenCorporateEventDetailActionFooterView.isLaidOut() || screenCorporateEventDetailActionFooterView.isLayoutRequested()) {
                screenCorporateEventDetailActionFooterView.addOnLayoutChangeListener(new u(this, 4));
                return;
            }
            ScreenContentRecyclerView screenCorporateEventDetailRecyclerView = d3().d;
            Intrinsics.checkNotNullExpressionValue(screenCorporateEventDetailRecyclerView, "screenCorporateEventDetailRecyclerView");
            knm.b.v(screenCorporateEventDetailActionFooterView.getHeight(), screenCorporateEventDetailRecyclerView);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ap3.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile screenCorporateEventDetailNavBar = d3().f307590c;
        Intrinsics.checkNotNullExpressionValue(screenCorporateEventDetailNavBar, "screenCorporateEventDetailNavBar");
        screenCorporateEventDetailNavBar.setHeightMode(p2.f275222a);
        screenCorporateEventDetailNavBar.setLayoutType(s0.CENTERED);
        screenCorporateEventDetailNavBar.setThemeBasedColorSchemeEnabled(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f307590c.f59357t), new g85.f(this, continuation, 22), 3);
        CellDetailsDelegate cellDetailsDelegate = this.M;
        ViewController.P2(this, vkm.q.J(rd0.e.b(cellDetailsDelegate.f), rd0.e.b(cellDetailsDelegate.e)), new j(this, null), 3);
        ViewController.P2(this, vkm.q.J(rd0.e.b(d3().f307589b.f), rd0.e.b(d3().f307589b.f58955g)), new k(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.N.d.f121375b), new l(this, null), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.O;
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), new k(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), new k(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f307590c.f59360y.f57278q), new k(this, continuation, 3), 3);
    }

    public final xo3.a d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (xo3.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final gp3.a d() {
        return (gp3.a) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
