package snk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264637a;

    public g(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f264637a = email;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f264637a, ((g) obj2).f264637a);
    }

    public final int hashCode() {
        return this.f264637a.hashCode();
    }
}
