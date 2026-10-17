package o23;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f0 implements s7a.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f221446a;

    public f0(e0 streetType) {
        Intrinsics.checkNotNullParameter(streetType, "streetType");
        this.f221446a = streetType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f0) && this.f221446a == ((f0) obj2).f221446a;
    }

    public final int hashCode() {
        return this.f221446a.hashCode();
    }
}
