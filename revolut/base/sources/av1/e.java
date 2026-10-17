package av1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9875a;

    public e(String institutionName) {
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        this.f9875a = institutionName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f9875a, ((e) obj2).f9875a);
    }

    public final int hashCode() {
        return this.f9875a.hashCode();
    }
}
