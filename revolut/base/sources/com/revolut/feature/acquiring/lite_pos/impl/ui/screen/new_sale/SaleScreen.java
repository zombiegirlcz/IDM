package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.new_sale;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import com.revolut.core.ui_kit.views.numpad.PosNumpadView;
import com.revolut.feature.acquiring.lite_pos.impl.R$id;
import com.revolut.feature.acquiring.lite_pos.impl.R$layout;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import dj0.d;
import efm.r;
import jd1.m;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import ld1.u;
import rd0.e;
import rtl.y;
import s56.i;
import sc7.g;
import se1.c;
import se1.f;
import sji.b;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/new_sale/SaleScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Lse1/f;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "", "<init>", "()V", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SaleScreen extends BaseScreen<f, IOData$EmptyInput, Object> {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(SaleScreen.class, "binding", "getBinding()Lcom/revolut/feature/acquiring/lite_pos/impl/databinding/ScreenSaleBinding;", 0))};
    public final h M;
    public final int N;
    public final Object O;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/acquiring/lite_pos/impl/databinding/ScreenSaleBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.saleScreen_posNumpadView;
            PosNumpadView posNumpadView = (PosNumpadView) ViewBindings.findChildViewById(p0, i);
            if (posNumpadView != null) {
                return new m((ControllerContainerCoordinatorLayout) p0, posNumpadView);
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public SaleScreen() {
        super(IOData$EmptyInput.f98299a);
        this.M = s.t(this, a.f);
        this.N = R$layout.screen_sale;
        this.O = w.y0(new y(this, 26));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        f uiState = (f) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ViewBinding value = this.M.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        PosNumpadView posNumpadView = ((m) value).f172939b;
        posNumpadView.setMoney(new d(uiState.f262085c, uiState.f262084b));
        posNumpadView.setActionButtons(uiState.f262083a);
        posNumpadView.setChevronVisible(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (u) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        PosNumpadView posNumpadView = ((m) value).f172939b;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(posNumpadView.e), null, new i(this, continuation, 27), 3);
        com.revolut.core.ui_kit.views.e eVar = posNumpadView.f59563c;
        r rVarFilter = eVar.f59055j.f58296a.f121375b.filter(new g(new se0.a(1), 22));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarFilter), null, new se1.a(this, null), 3);
        r rVarFilter2 = eVar.f59055j.f58296a.f121375b.filter(new g(new se0.a(2), 23));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarFilter2), null, new se1.b(this, null), 3);
        r rVarFilter3 = eVar.f59055j.f58296a.f121375b.filter(new g(new se0.a(3), 24));
        Intrinsics.checkNotNullExpressionValue(rVarFilter3, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarFilter3), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(posNumpadView.numpadView.f58811b), null, new i(posNumpadView, this, continuation, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(eVar.f59057m), null, new s1k.b(this, null, 28), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: Z2, reason: merged with bridge method [inline-methods] */
    public final se1.e T2() {
        return (se1.e) ((u) this.O.getValue()).e.get();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }
}
