package wm;

import kotlin.jvm.internal.Intrinsics;
import rp0.a0;

/* JADX INFO: loaded from: classes17.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f298576a;

    public h(a0 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f298576a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f298576a, ((h) obj2).f298576a);
    }

    public final int hashCode() {
        return this.f298576a.hashCode();
    }
}
