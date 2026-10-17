package aw0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q4 implements s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10486a;

    public q4(List keepSegmentsIds) {
        Intrinsics.checkNotNullParameter(keepSegmentsIds, "keepSegmentsIds");
        this.f10486a = keepSegmentsIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof q4) {
            return Float.compare(0.05f, 0.05f) == 0 && Intrinsics.f(this.f10486a, ((q4) obj2).f10486a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10486a.hashCode() + (Float.hashCode(0.05f) * 31);
    }
}
