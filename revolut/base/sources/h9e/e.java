package h9e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f150235a;

    public e(io3.d pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f150235a = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f150235a, ((e) obj2).f150235a);
    }

    public final int hashCode() {
        return this.f150235a.hashCode();
    }
}
