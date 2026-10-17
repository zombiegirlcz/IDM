package zlg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f323262b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String username) {
        super(username);
        Intrinsics.checkNotNullParameter(username, "username");
        this.f323262b = username;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f323262b, ((o) obj2).f323262b);
    }

    public final int hashCode() {
        return this.f323262b.hashCode();
    }
}
