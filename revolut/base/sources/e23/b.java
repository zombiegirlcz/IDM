package e23;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f122013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f122014b;

    public b(String name, String code) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f122013a = name;
        this.f122014b = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f122013a, bVar.f122013a) && Intrinsics.f(this.f122014b, bVar.f122014b);
    }

    public final int hashCode() {
        return this.f122014b.hashCode() + (this.f122013a.hashCode() * 31);
    }
}
