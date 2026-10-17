package yfe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c1 extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313245a;

    public c1(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f313245a = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c1) && Intrinsics.f(this.f313245a, ((c1) obj2).f313245a);
    }

    public final int hashCode() {
        return this.f313245a.hashCode();
    }
}
