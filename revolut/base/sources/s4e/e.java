package s4e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259837a;

    public e(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f259837a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f259837a, ((e) obj2).f259837a);
    }

    public final int hashCode() {
        return this.f259837a.hashCode();
    }
}
