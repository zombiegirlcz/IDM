package kea;

import com.revolut.feature.pockets.impl.details_v2.pocket_details.PocketDetailsScreenContract$InputData;
import k7c.l0;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends n implements b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PocketDetailsScreenContract$InputData f183060l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vte.b f183061m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xye.d f183062n;
    public final l61.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Lazy f183063p;

    public c(PocketDetailsScreenContract$InputData inputData, vte.b topUpLimitsInteractor, xye.d topUpLimitsControllerInputFactory, l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(topUpLimitsInteractor, "topUpLimitsInteractor");
        Intrinsics.checkNotNullParameter(topUpLimitsControllerInputFactory, "topUpLimitsControllerInputFactory");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.f183060l = inputData;
        this.f183061m = topUpLimitsInteractor;
        this.f183062n = topUpLimitsControllerInputFactory;
        this.o = userCompanyInteractor;
        this.f183063p = j.b(new ka9.b(11));
    }

    @Override // yji.n
    public final void D2() {
        T2(new l0(this, null, 13), new yi5.b(27));
    }
}
