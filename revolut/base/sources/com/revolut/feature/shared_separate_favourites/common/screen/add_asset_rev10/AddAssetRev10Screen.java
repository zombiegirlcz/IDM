package com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ce9.r;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.shared_separate_favourites.R$id;
import com.revolut.feature.shared_separate_favourites.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import yq0.e;
import yy6.f;
import z4l.j;
import za9.c;
import zc0.z;
import zfd.g;
import zfd.p;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/common/screen/add_asset_rev10/AddAssetRev10Screen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lzfd/p;", "Lcom/revolut/feature/shared_separate_favourites/common/screen/add_asset_rev10/AddAssetRev10ScreenContract$InputData;", "Laii/q;", "Companion", "a", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddAssetRev10Screen extends BaseRecyclerViewScreen<p, AddAssetRev10ScreenContract$InputData, q> {
    public final RowDelegate U;
    public final FullScreenStateDelegate V;
    public final r W;
    public final h X;
    public final int Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f86818a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f86819b0;
    public final j c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f86820d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f86817e0 = {o0.f186429a.j(new h0(AddAssetRev10Screen.class, "binding", "getBinding()Lcom/revolut/feature/shared_separate_favourites/databinding/ScreenRev10AddAssetBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10.AddAssetRev10Screen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddAssetRev10Screen(AddAssetRev10ScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.U = rowDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.V = fullScreenStateDelegate;
        this.W = new r(new zba.a(this, 8));
        this.X = s.t(this, zfd.a.f);
        this.Y = R$layout.screen_rev10_add_asset;
        this.Z = R$id.screenRev10AddAsset_recyclerView;
        this.f86818a0 = w.y0(new ywi.b(this, inputData, 26));
        this.f86819b0 = w.y0(new e(this, 25));
        this.c0 = new j(4, (List) f0.f322471a, true);
        this.f86820d0 = v.k(rowDelegate, fullScreenStateDelegate, new RowLoadingDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (fhd.a) this.f86818a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.V.f52371h.f121375b), null, new zfd.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(this.U.f53218h, new z(27))), null, new f(this, null, 29), 3);
        c cVar = new c(this, 16);
        qji.c cVarZ2 = z2();
        if (!(cVarZ2 instanceof g)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        cVar.invoke(cVarZ2);
        g3().f183956b.addOnScrollListener(this.W);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ScreenContentRecyclerView screenRev10AddAssetRecyclerView = g3().f183956b;
        Intrinsics.checkNotNullExpressionValue(screenRev10AddAssetRecyclerView, "screenRev10AddAssetRecyclerView");
        knm.b.v(kli.a.k(m2(), 72.0f), screenRev10AddAssetRecyclerView);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void Y2() {
        g3().f183956b.removeOnScrollListener(this.W);
        super.Y2();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF86820d0() {
        return this.f86820d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final koi.h d3() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
        return this.Z;
    }

    public final kgd.c g3() {
        ViewBinding value = this.X.getValue(this, f86817e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (kgd.c) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Y;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final zfd.j T2() {
        return (zfd.j) this.f86819b0.getValue();
    }
}
