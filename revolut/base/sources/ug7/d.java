package ug7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f279981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f279982b;

    public d(String loadingTag, c action) {
        Intrinsics.checkNotNullParameter(loadingTag, "loadingTag");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f279981a = loadingTag;
        this.f279982b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f279981a, dVar.f279981a) && this.f279982b == dVar.f279982b;
    }

    public final int hashCode() {
        return this.f279982b.hashCode() + (this.f279981a.hashCode() * 31);
    }
}
