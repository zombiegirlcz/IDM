package ip0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class zi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej0 f167472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f167474c;

    public zi0(ej0 data, boolean z, List tracks) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        this.f167472a = data;
        this.f167473b = z;
        this.f167474c = tracks;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zi0)) {
            return false;
        }
        zi0 zi0Var = (zi0) obj2;
        return Intrinsics.f(this.f167472a, zi0Var.f167472a) && this.f167473b == zi0Var.f167473b && Intrinsics.f(this.f167474c, zi0Var.f167474c);
    }

    public final int hashCode() {
        return this.f167474c.hashCode() + j6.a.c(this.f167472a.hashCode() * 31, 31, this.f167473b);
    }
}
