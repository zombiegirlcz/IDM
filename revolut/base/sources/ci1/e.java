package ci1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24343a;

    public e(String fieldValue) {
        Intrinsics.checkNotNullParameter(fieldValue, "fieldValue");
        this.f24343a = fieldValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f24343a, ((e) obj2).f24343a);
    }

    public final int hashCode() {
        return this.f24343a.hashCode();
    }
}
