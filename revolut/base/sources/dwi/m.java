package dwi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f120440a;

    public m(Object obj2) {
        this.f120440a = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f120440a, ((m) obj2).f120440a);
    }

    public final int hashCode() {
        Object obj2 = this.f120440a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }
}
