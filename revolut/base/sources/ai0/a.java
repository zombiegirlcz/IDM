package ai0;

import com.google.android.gms.maps.model.BitmapDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapDescriptor f5145a;

    public a(BitmapDescriptor internal) {
        Intrinsics.checkNotNullParameter(internal, "internal");
        this.f5145a = internal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f5145a, ((a) obj2).f5145a);
    }

    public final int hashCode() {
        return this.f5145a.hashCode();
    }
}
