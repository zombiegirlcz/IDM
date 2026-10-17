package com.revolut.feature.transfer.core.impl.ui.reference;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transfer.core.api.ui.reference.ReferenceInputData;
import com.revolut.feature.transfer.core.impl.R$id;
import com.revolut.feature.transfer.core.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import gpf.a;
import h30.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kpf.f;
import sji.b;
import sq5.j;
import sqf.c;
import sqf.e;
import sqf.g;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/impl/ui/reference/ReferenceScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lsqf/e;", "Lcom/revolut/feature/transfer/core/api/ui/reference/ReferenceInputData;", "Lgpf/a;", "feature_transfer_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReferenceScreen extends BaseRecyclerViewScreen<e, ReferenceInputData, a> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f92217b0 = {o0.f186429a.j(new h0(ReferenceScreen.class, "binding", "getBinding()Lcom/revolut/feature/transfer/core/impl/databinding/ScreenTransferReferenceBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final boolean X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f92218a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferenceScreen(ReferenceInputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$id.transferScreenReference_recyclerView;
        this.V = R$layout.screen_transfer_reference;
        this.W = s.t(this, sqf.a.f);
        this.X = true;
        this.Y = w.y0(new j(4));
        this.Z = w.y0(new s86.a(this, inputData, 25));
        this.f92218a0 = w.y0(new sii.a(this, 5));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        g gVar = (g) this.f92218a0.getValue();
        gVar.v2(new a(gVar.f265089p.d));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (lpf.s) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) this.f92218a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, l.y(g3().f188242b.f59410q, g3().f188242b.f59409p.f57336l, "merge(...)"), null, new sqf.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f188243c.o), null, new sqf.b(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.Y.getValue()).e.f121375b), null, new c(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((lpf.s) this.Z.getValue()).getClass();
        NavBarWithToolbar navBarWithToolbar = g3().f188242b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ReferenceInputData referenceInputData = (ReferenceInputData) this.G;
        navBarWithToolbar.setTitle(referenceInputData.f92160a, null);
        navBarWithToolbar.setToolbarTitle(referenceInputData.f92160a);
        l.A(R.string.common_action_update, null, null, 14, g3().f188243c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF87162e0() {
        return u.c((InputTextDelegate) this.Y.getValue());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.U;
    }

    public final f g3() {
        ViewBinding value = this.W.getValue(this, f92217b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (f) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
