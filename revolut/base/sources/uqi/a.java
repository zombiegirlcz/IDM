package uqi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f282189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f282190b;

    public a(String packageName, String className) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(className, "className");
        this.f282189a = packageName;
        this.f282190b = className;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f282189a, aVar.f282189a) && Intrinsics.f(this.f282190b, aVar.f282190b);
    }

    public final int hashCode() {
        return this.f282190b.hashCode() + (this.f282189a.hashCode() * 31);
    }
}
