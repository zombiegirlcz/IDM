package xug;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f309065a;

    public h(a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f309065a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f309065a == ((h) obj2).f309065a;
    }

    public final int hashCode() {
        return this.f309065a.hashCode();
    }
}
