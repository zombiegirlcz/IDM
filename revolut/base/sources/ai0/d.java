package ai0;

import com.google.android.gms.maps.model.LatLng;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yv0.k f5146a;

    public d(yv0.k internal) {
        Intrinsics.checkNotNullParameter(internal, "internal");
        this.f5146a = internal;
    }

    public final LatLng a() {
        return jb3.l.M(this.f5146a.getPosition());
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f5146a, ((d) obj2).f5146a);
    }

    public final int hashCode() {
        return this.f5146a.hashCode();
    }
}
