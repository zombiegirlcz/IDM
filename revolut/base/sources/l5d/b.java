package l5d;

import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements zn.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e5d.b f192231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AnalyticsContext f192232b;

    public b(e5d.b originalParcel) {
        Intrinsics.checkNotNullParameter(originalParcel, "originalParcel");
        this.f192231a = originalParcel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f192231a, ((b) obj2).f192231a);
    }

    @Override // zn.d
    public final Parcelable getAnalyticsContext() {
        return this.f192232b;
    }

    @Override // zn.d
    public final String getIdentifier() {
        return this.f192231a.f122805a.f111406a;
    }

    public final int hashCode() {
        return this.f192231a.hashCode();
    }

    @Override // zn.d
    public final ViewableRecordItem$Type p0() {
        return new ViewableRecordItem$Type.ViewableRecord(null);
    }
}
