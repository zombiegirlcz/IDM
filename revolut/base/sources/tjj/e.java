package tjj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f271797a;

    public e(Object obj2) {
        this.f271797a = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f271797a, ((e) obj2).f271797a);
    }

    public final int hashCode() {
        Object obj2 = this.f271797a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }
}
