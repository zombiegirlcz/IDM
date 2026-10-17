package com.revolut.feature.wealth.impl.ui.screens.pocket_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ot1.p;
import ox5.r;
import pch.a;
import pch.d;
import pch.e;
import sji.b;
import te0.w;
import vc.s;
import z9h.g;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/screens/pocket_picker/PocketPickerScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lpch/e;", "Lcom/revolut/feature/wealth/impl/ui/screens/pocket_picker/PocketPickerScreenContract$Input;", "Lpch/d;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PocketPickerScreen extends BaseRecyclerViewScreen<e, PocketPickerScreenContract$Input, d> {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f95623a0 = {o0.f186429a.j(new h0(PocketPickerScreen.class, "binding", "getBinding()Lcom/revolut/feature/wealth/impl/databinding/ScreenPocketPickerBinding;", 0))};
    public final Object U;
    public final int V;
    public final boolean W;
    public final h X;
    public final RowDelegate Y;
    public final List Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PocketPickerScreen(PocketPickerScreenContract$Input inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = w.y0(new p(this, inputData, 27));
        this.V = R$layout.screen_pocket_picker;
        this.W = true;
        this.X = s.t(this, a.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Y = rowDelegate;
        this.Z = v.k(rowDelegate, new ListSubheaderDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (g) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (pch.h) ((g) this.U.getValue()).f320429c.get();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.X.getValue(this, f95623a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((q8h.a) value).f243073b.f59211b), null, new p0l.d(this, continuation, 15), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(this.Y.f53218h, new pb2.a(8))), null, new r(this, continuation, 22), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.X.getValue(this, f95623a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((q8h.a) value).f243073b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF95992b0() {
        return this.Z;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
