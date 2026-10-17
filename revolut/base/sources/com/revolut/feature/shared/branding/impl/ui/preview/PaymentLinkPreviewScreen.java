package com.revolut.feature.shared.branding.impl.ui.preview;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared.branding.api.PaymentLinkPreviewScreenProvider$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pt4.d;
import q6d.a;
import q6d.c;
import rd0.e;
import sji.b;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/branding/impl/ui/preview/PaymentLinkPreviewScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lq6d/c;", "Lcom/revolut/feature/shared/branding/api/PaymentLinkPreviewScreenProvider$InputData;", "Laii/q;", "feature_shared_branding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentLinkPreviewScreen extends BaseRecyclerViewScreen<c, PaymentLinkPreviewScreenProvider$InputData, q> {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f86072a0 = {o0.f186429a.j(new h0(PaymentLinkPreviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h U;
    public final int V;
    public final Object W;
    public final boolean X;
    public final Object Y;
    public final List Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentLinkPreviewScreen(PaymentLinkPreviewScreenProvider$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, a.f);
        this.V = R$layout.screen_recycler_navbar;
        this.W = w.y0(new d(this, inputData, 24));
        this.X = true;
        this.Y = w.y0(new pyc.a(this, 21));
        this.Z = u.c(new WebViewDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (o6d.h) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (q6d.d) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.U.getValue(this, f86072a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(((m) value).f174539b.f59410q), null, new q43.m(this, null, 4), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.U.getValue(this, f86072a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.j0(false);
        navBarWithToolbar.setToolbarTitle(((PaymentLinkPreviewScreenProvider$InputData) this.G).f86060c);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getZ() {
        return this.Z;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
