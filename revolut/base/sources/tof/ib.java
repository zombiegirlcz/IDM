package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class ib extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272835a;

    public ib(String revolutCardId) {
        Intrinsics.checkNotNullParameter(revolutCardId, "revolutCardId");
        this.f272835a = revolutCardId;
    }

    public final String a() {
        return this.f272835a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ib) && Intrinsics.f(this.f272835a, ((ib) obj2).f272835a);
    }

    public final int hashCode() {
        return this.f272835a.hashCode();
    }
}
