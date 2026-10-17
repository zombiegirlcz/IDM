package ii7;

import kotlin.jvm.internal.Intrinsics;
import tzg.m;
import ybl.i;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f161589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f161590b;

    public d(m wealthAccountsInteractor, i productAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(productAvailabilityInteractor, "productAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        this.f161589a = productAvailabilityInteractor;
        this.f161590b = wealthAccountsInteractor;
    }
}
