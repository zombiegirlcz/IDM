package g8c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f141342a;

    public e(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f141342a = email;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f141342a, ((e) obj2).f141342a);
    }

    public final int hashCode() {
        return this.f141342a.hashCode();
    }
}
