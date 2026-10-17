package com.revolut.feature.apm.multibanco.impl.ui.pay.loading;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.multibanco.api.R$string;
import com.revolut.feature.apm.multibanco.impl.ui.pay.loading.PayLoadingController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import g82.d;
import i72.t;
import i72.x;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/pay/loading/PayLoadingController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lg82/d;", "<init>", "()V", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayLoadingController extends SimpleViewController<d> {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PayLoadingController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int N = R$layout.screen_recycler_navbar;
    public final h O = s.t(this, a.f);
    public final Object P;
    public final Object Q;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public PayLoadingController() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: g82.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLoadingController f141241b;

            {
                this.f141241b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PayLoadingController payLoadingController = this.f141241b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PayLoadingController.R;
                        qji.b bVarU2 = payLoadingController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.ui.pay.loading.di.PayLoadingControllerInjector");
                        i72.m mVar = ((t) bVarU2).f159165b;
                        x xVar = new x();
                        xVar.f159177a = e4m.b.b(new hm9.d(mVar, 22));
                        return xVar;
                    default:
                        KProperty[] kPropertyArr2 = PayLoadingController.R;
                        return (e) ((x) payLoadingController.P.getValue()).f159177a.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: g82.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLoadingController f141241b;

            {
                this.f141241b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PayLoadingController payLoadingController = this.f141241b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayLoadingController.R;
                        qji.b bVarU2 = payLoadingController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.ui.pay.loading.di.PayLoadingControllerInjector");
                        i72.m mVar = ((t) bVarU2).f159165b;
                        x xVar = new x();
                        xVar.f159177a = e4m.b.b(new hm9.d(mVar, 22));
                        return xVar;
                    default:
                        KProperty[] kPropertyArr2 = PayLoadingController.R;
                        return (e) ((x) payLoadingController.P.getValue()).f159177a.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (g82.e) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R.string.apm_product_multibanco, null, null, 14));
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.multibanco_back, null, null, 14), 126));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.I0(t3.PROFILE, false);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.N;
    }
}
