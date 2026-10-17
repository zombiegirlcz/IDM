package com.revolut.feature.atm.impl.ui.redesign.error;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.atm.impl.R$id;
import com.revolut.feature.atm.impl.R$layout;
import com.revolut.feature.atm.impl.R$string;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import hk2.c;
import hk2.d;
import ip0.zj;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import vc.s;
import yp0.y;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/atm/impl/ui/redesign/error/AtmErrorController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lhk2/c;", "<init>", "()V", "Companion", "a", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AtmErrorController extends SimpleViewController<c> {
    public final h N = s.t(this, b.f);
    public final int O = R$layout.screen_atm_error;
    public final FullScreenStateDelegate P;
    public final j Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AtmErrorController.class, "binding", "getBinding()Lcom/revolut/feature/atm/impl/databinding/ScreenAtmErrorBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static final /* synthetic */ class b extends q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, uj2.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/atm/impl/databinding/ScreenAtmErrorBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
            int i = R$id.atmErrorScreen_recyclerView;
            ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
            if (screenContentRecyclerView != null) {
                i = R$id.atmsMapController_navbar;
                BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
                if (basicNavBar != null) {
                    return new uj2.b(basicNavBar, controllerContainerConstraintLayout, screenContentRecyclerView);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public AtmErrorController() {
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.P = fullScreenStateDelegate;
        this.Q = new j(7, u.c(fullScreenStateDelegate), false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        c3(hk2.a.f152845a);
        return true;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f280479c.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_left, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView atmErrorScreenRecyclerView = d3().f280478b;
        Intrinsics.checkNotNullExpressionValue(atmErrorScreenRecyclerView, "atmErrorScreenRecyclerView");
        j jVar = this.Q;
        y.h(atmErrorScreenRecyclerView, jVar, new LinearLayoutManager(atmErrorScreenRecyclerView.getContext()));
        ViewController.P2(this, e.b(this.P.f52371h.f121375b), new d(this, null), 3);
        jVar.c(u.c(new FullScreenStateDelegate.Model("ATM_ERROR_ITEM_ID", new TextLocalisedClause(R$string.map_atms_error_load_map, null, null, 14), new TextLocalisedClause(R$string.map_atms_error_load_map_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), new l6(12, new TextLocalisedClause(R$string.map_atms_error_load_map_button, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1856)));
        ViewController.P2(this, e.b(d3().f280479c.f59211b), new hbg.h(this, null, 10), 3);
    }

    public final uj2.b d3() {
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (uj2.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }
}
