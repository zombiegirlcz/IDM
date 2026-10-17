package jta;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178443a;

    public g(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f178443a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f178443a, ((g) obj2).f178443a);
    }

    public final int hashCode() {
        return this.f178443a.hashCode();
    }
}
