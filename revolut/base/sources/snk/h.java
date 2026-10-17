package snk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264638a;

    public h(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f264638a = email;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f264638a, ((h) obj2).f264638a);
    }

    public final int hashCode() {
        return this.f264638a.hashCode();
    }
}
