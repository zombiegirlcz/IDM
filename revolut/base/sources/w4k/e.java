package w4k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kq2.b f294609a;

    public e(kq2.b descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f294609a = descriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f294609a, ((e) obj2).f294609a);
    }

    public final int hashCode() {
        return this.f294609a.hashCode();
    }
}
