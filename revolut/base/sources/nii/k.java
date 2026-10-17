package nii;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f216181a;

    public k(AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
        this.f216181a = analyticsContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f216181a, ((k) obj2).f216181a);
    }

    public final int hashCode() {
        return this.f216181a.hashCode();
    }
}
