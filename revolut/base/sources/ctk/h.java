package ctk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108687a;

    public h(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f108687a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f108687a, ((h) obj2).f108687a);
    }

    public final int hashCode() {
        return this.f108687a.hashCode();
    }
}
