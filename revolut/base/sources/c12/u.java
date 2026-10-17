package c12;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class u implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20353a;

    public u(Object obj2) {
        this.f20353a = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f20353a, ((u) obj2).f20353a);
    }

    public final int hashCode() {
        Object obj2 = this.f20353a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }
}
