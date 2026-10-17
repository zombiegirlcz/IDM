package skg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f263947a;

    public b(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f263947a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f263947a, ((b) obj2).f263947a);
    }

    public final int hashCode() {
        return this.f263947a.hashCode();
    }
}
