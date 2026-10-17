package com.revolut.feature.shared_separate_favourites.common.screen.init;

import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseScreen;
import cvi.b;
import dgd.a;
import dgd.d;
import jki.h;
import jki.k;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/common/screen/init/SharedFavouritesInitScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Ljki/k;", "Lcom/revolut/feature/shared_separate_favourites/common/screen/init/SharedFavouritesInitScreenContract$InputData;", "Ldgd/a;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SharedFavouritesInitScreen extends BaseScreen<k, SharedFavouritesInitScreenContract$InputData, a> {
    public final boolean M;
    public final int N;
    public final Object O;
    public final Object P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedFavouritesInitScreen(SharedFavouritesInitScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.M = true;
        this.N = R$layout.screen_transparent;
        this.O = w.y0(new b(this, inputData, 29));
        this.P = w.y0(new d8e.a(this, 3));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        k uiState = (k) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (ned.m) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final h T2() {
        return (d) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
