package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t6 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f273089a;

    public t6(Boolean bool) {
        this.f273089a = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t6) && Intrinsics.f(this.f273089a, ((t6) obj2).f273089a);
    }

    public final int hashCode() {
        Boolean bool = this.f273089a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }
}
