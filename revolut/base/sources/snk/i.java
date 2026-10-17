package snk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264639a;

    public i(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f264639a = email;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f264639a, ((i) obj2).f264639a);
    }

    public final int hashCode() {
        return this.f264639a.hashCode();
    }
}
