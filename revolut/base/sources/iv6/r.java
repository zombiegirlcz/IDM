package iv6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168760a;

    public r(String number) {
        Intrinsics.checkNotNullParameter(number, "number");
        this.f168760a = number;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f168760a, ((r) obj2).f168760a);
    }

    public final int hashCode() {
        return this.f168760a.hashCode();
    }
}
