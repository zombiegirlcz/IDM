package bgf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15190a;

    public d(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f15190a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f15190a, ((d) obj2).f15190a);
    }

    public final int hashCode() {
        return this.f15190a.hashCode();
    }
}
