package aue;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f9807a;

    public f(a limit) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        this.f9807a = limit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f9807a, ((f) obj2).f9807a);
    }

    public final int hashCode() {
        return this.f9807a.hashCode();
    }
}
