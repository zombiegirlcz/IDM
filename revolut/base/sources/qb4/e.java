package qb4;

import kotlin.jvm.internal.Intrinsics;
import xu3.o0;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f244112a;

    public e(o0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f244112a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f244112a == ((e) obj2).f244112a;
    }

    public final int hashCode() {
        return this.f244112a.hashCode();
    }
}
