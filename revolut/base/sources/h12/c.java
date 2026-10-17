package h12;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f148446a;

    public c(Object obj2) {
        this.f148446a = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f148446a, ((c) obj2).f148446a);
    }

    public final int hashCode() {
        Object obj2 = this.f148446a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }
}
