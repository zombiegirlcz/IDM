package jr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177943a;

    public i(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f177943a = email;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f177943a, ((i) obj2).f177943a);
    }

    public final int hashCode() {
        return this.f177943a.hashCode();
    }
}
