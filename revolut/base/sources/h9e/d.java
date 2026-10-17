package h9e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f150234a;

    public d(io3.d pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f150234a = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f150234a, ((d) obj2).f150234a);
    }

    public final int hashCode() {
        return this.f150234a.hashCode();
    }
}
