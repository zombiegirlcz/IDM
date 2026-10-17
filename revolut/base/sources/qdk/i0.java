package qdk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244968a;

    public i0(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f244968a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i0) && Intrinsics.f(this.f244968a, ((i0) obj2).f244968a);
    }

    public final int hashCode() {
        return this.f244968a.hashCode();
    }
}
