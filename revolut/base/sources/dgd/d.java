package dgd;

import com.revolut.feature.shared_separate_favourites.common.screen.init.SharedFavouritesInitScreenContract$InputData;
import dce.s0;
import jki.g;
import jki.h;
import jki.i;
import jki.j;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SharedFavouritesInitScreenContract$InputData f114641p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z2d.c f114642q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final efd.a f114643r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j f114644s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SharedFavouritesInitScreenContract$InputData inputData, z2d.c assetTypesInteractor, efd.a alertsInteractor, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(assetTypesInteractor, "assetTypesInteractor");
        Intrinsics.checkNotNullParameter(alertsInteractor, "alertsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f114641p = inputData;
        this.f114642q = assetTypesInteractor;
        this.f114643r = alertsInteractor;
        this.f114644s = j.f175191a;
    }

    @Override // yji.l
    public final void I1() {
        SharedFavouritesInitScreenContract$InputData sharedFavouritesInitScreenContract$InputData = this.f114641p;
        l2(new s0(this, sharedFavouritesInitScreenContract$InputData.f86840a, sharedFavouritesInitScreenContract$InputData.f86841b, null, 3), new yi5.b(26));
    }

    @Override // jki.g
    public final i r2() {
        return this.f114644s;
    }
}
