package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113492b;

    public b(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f113491a = title;
        this.f113492b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f113491a, bVar.f113491a) && Intrinsics.f(this.f113492b, bVar.f113492b);
    }

    public final int hashCode() {
        return this.f113492b.hashCode() + (this.f113491a.hashCode() * 31);
    }
}
