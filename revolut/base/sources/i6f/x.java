package i6f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final alc.d f158989a;

    public x(alc.d action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f158989a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && this.f158989a == ((x) obj2).f158989a;
    }

    public final int hashCode() {
        return this.f158989a.hashCode();
    }
}
