package lcd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193866a;

    public o(String teenId) {
        Intrinsics.checkNotNullParameter(teenId, "teenId");
        this.f193866a = teenId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f193866a, ((o) obj2).f193866a);
    }

    public final int hashCode() {
        return this.f193866a.hashCode();
    }
}
