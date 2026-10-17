package h9e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f150231a;

    public b(io3.d pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f150231a = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f150231a, ((b) obj2).f150231a);
    }

    public final int hashCode() {
        return this.f150231a.hashCode();
    }
}
