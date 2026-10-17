package sgl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f262669a;

    public b(e fees) {
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.f262669a = fees;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f262669a, ((b) obj2).f262669a);
    }

    public final int hashCode() {
        return this.f262669a.hashCode();
    }
}
