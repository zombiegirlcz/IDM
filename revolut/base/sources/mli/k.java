package mli;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import maa.r;

/* JADX INFO: loaded from: classes13.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a31.a f206977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.analytics.tracking.v3.d f206978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ah2.d f206979c;
    public final Lazy d;

    public k(a31.a retailPreferences, com.revolut.analytics.tracking.v3.d diagnosticEventsTracker, ah2.d upiSmartIntentInteractor) {
        Intrinsics.checkNotNullParameter(retailPreferences, "retailPreferences");
        Intrinsics.checkNotNullParameter(diagnosticEventsTracker, "diagnosticEventsTracker");
        Intrinsics.checkNotNullParameter(upiSmartIntentInteractor, "upiSmartIntentInteractor");
        this.f206977a = retailPreferences;
        this.f206978b = diagnosticEventsTracker;
        this.f206979c = upiSmartIntentInteractor;
        this.d = yhm.j.b(new r(this, 11));
    }
}
