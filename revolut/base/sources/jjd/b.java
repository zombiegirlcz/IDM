package jjd;

import cli.g;
import cli.y;
import com.revolut.feature.shops.impl.ui.items_details.cancellation.ShopsCancelOrderContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements dli.b {
    public final ShopsCancelOrderContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kye.e f174815p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f174816q;

    public b(ShopsCancelOrderContract$InputData inputData, e stateMapper, kye.e storeExclusivesInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(storeExclusivesInteractor, "storeExclusivesInteractor");
        this.o = inputData;
        this.f174815p = storeExclusivesInteractor;
        this.f174816q = mra.d.b(this, new a(inputData, false), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f174816q;
    }
}
