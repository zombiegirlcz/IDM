package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u7 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273105a;

    public u7(String str) {
        this.f273105a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u7) && Intrinsics.f(this.f273105a, ((u7) obj2).f273105a);
    }

    public final String getId() {
        return this.f273105a;
    }

    public final int hashCode() {
        String str = this.f273105a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
