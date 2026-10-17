package uel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f279489a;

    public c(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f279489a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f279489a, ((c) obj2).f279489a);
    }

    public final int hashCode() {
        return this.f279489a.hashCode();
    }
}
