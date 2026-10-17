package q3m;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f241988b;

    public a(String path, String version) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(version, "version");
        this.f241987a = path;
        this.f241988b = version;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f241987a, aVar.f241987a) && Intrinsics.f(this.f241988b, aVar.f241988b);
    }

    public final int hashCode() {
        return this.f241988b.hashCode() + (this.f241987a.hashCode() * 31);
    }

    public final String toString() {
        return j6.a.s("Model(path=", this.f241987a, ", version=", this.f241988b, ")");
    }
}
