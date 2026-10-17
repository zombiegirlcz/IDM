package iy9;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f169640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f169641b;

    public b(a id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f169640a = id10;
        this.f169641b = z;
    }

    public static b a(b bVar, boolean z) {
        a id10 = bVar.f169640a;
        Intrinsics.checkNotNullParameter(id10, "id");
        return new b(id10, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f169640a == bVar.f169640a && this.f169641b == bVar.f169641b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f169641b) + (this.f169640a.hashCode() * 31);
    }
}
