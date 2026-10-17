package r5b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f251560b;

    public b(String title, c action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f251559a = title;
        this.f251560b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f251559a, bVar.f251559a) && this.f251560b == bVar.f251560b;
    }

    public final int hashCode() {
        return this.f251560b.hashCode() + (this.f251559a.hashCode() * 31);
    }
}
