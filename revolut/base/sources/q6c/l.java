package q6c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f242553a;

    public l(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f242553a = token;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f242553a, ((l) obj2).f242553a);
    }

    public final int hashCode() {
        return this.f242553a.hashCode();
    }
}
