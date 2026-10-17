package nze;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f221029a;

    public d(a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f221029a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f221029a == ((d) obj2).f221029a;
    }

    public final int hashCode() {
        return this.f221029a.hashCode();
    }
}
