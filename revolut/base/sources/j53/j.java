package j53;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f171469a;

    public j(Throwable th10) {
        this.f171469a = th10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f171469a, ((j) obj2).f171469a);
    }

    public final int hashCode() {
        Throwable th10 = this.f171469a;
        if (th10 == null) {
            return 0;
        }
        return th10.hashCode();
    }
}
