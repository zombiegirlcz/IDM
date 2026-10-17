package m6f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203054a;

    public b(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f203054a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f203054a, ((b) obj2).f203054a);
    }

    public final int hashCode() {
        return this.f203054a.hashCode();
    }
}
