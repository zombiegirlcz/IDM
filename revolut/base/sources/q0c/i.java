package q0c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lk0.g f241231a;

    public i(lk0.g data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f241231a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f241231a, ((i) obj2).f241231a);
    }

    public final int hashCode() {
        return this.f241231a.f196174a.hashCode();
    }
}
