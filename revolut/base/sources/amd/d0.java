package amd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6315a;

    public d0(String pocketId) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f6315a = pocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d0) && Intrinsics.f(this.f6315a, ((d0) obj2).f6315a);
    }

    public final int hashCode() {
        return this.f6315a.hashCode();
    }
}
