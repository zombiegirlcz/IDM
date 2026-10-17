package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120674b;

    public m0(String name, String path) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(path, "path");
        this.f120673a = name;
        this.f120674b = path;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f120673a, m0Var.f120673a) && Intrinsics.f(this.f120674b, m0Var.f120674b);
    }

    public final int hashCode() {
        return this.f120674b.hashCode() + (this.f120673a.hashCode() * 31);
    }
}
