package w4k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kq2.b f294608a;

    public d(kq2.b descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f294608a = descriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f294608a, ((d) obj2).f294608a);
    }

    public final int hashCode() {
        return this.f294608a.hashCode();
    }
}
