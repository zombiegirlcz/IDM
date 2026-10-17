package fu9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f138148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f138149c;

    public b(String fullName, String code, boolean z) {
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f138147a = fullName;
        this.f138148b = code;
        this.f138149c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f138147a, bVar.f138147a) && Intrinsics.f(this.f138148b, bVar.f138148b) && this.f138149c == bVar.f138149c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f138149c) + p.a.c(this.f138147a.hashCode() * 31, 31, this.f138148b);
    }
}
