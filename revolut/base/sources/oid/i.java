package oid;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f225643b;

    public i(String id10, String source) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f225642a = id10;
        this.f225643b = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f225642a, iVar.f225642a) && Intrinsics.f(this.f225643b, iVar.f225643b);
    }

    public final int hashCode() {
        return this.f225643b.hashCode() + (this.f225642a.hashCode() * 31);
    }
}
