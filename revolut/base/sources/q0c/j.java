package q0c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lk0.g f241232a;

    public j(lk0.g data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f241232a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f241232a, ((j) obj2).f241232a);
    }

    public final int hashCode() {
        return this.f241232a.f196174a.hashCode();
    }
}
