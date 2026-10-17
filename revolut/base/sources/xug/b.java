package xug;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f309061a;

    public b(f type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f309061a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f309061a == ((b) obj2).f309061a;
    }

    public final int hashCode() {
        return this.f309061a.hashCode();
    }
}
