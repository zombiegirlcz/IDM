package eel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f125238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f125239c;

    public l(String ref2, long j2, h price) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(price, "price");
        this.f125237a = ref2;
        this.f125238b = j2;
        this.f125239c = price;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f125237a, lVar.f125237a) && this.f125238b == lVar.f125238b && Intrinsics.f(this.f125239c, lVar.f125239c);
    }

    public final int hashCode() {
        return this.f125239c.hashCode() + a0.d.c(this.f125237a.hashCode() * 31, 31, this.f125238b);
    }
}
