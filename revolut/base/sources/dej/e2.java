package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e2 implements g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2 f113530a;

    public e2(d2 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f113530a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e2) && this.f113530a == ((e2) obj2).f113530a;
    }

    public final int hashCode() {
        return this.f113530a.hashCode();
    }
}
