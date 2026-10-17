package qce;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244738a;

    public m(String firstName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        this.f244738a = firstName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f244738a, ((m) obj2).f244738a);
    }

    public final int hashCode() {
        return this.f244738a.hashCode();
    }
}
