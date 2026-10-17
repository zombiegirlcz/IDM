package cke;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24820a;

    public d(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f24820a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f24820a, ((d) obj2).f24820a);
    }

    public final int hashCode() {
        return this.f24820a.hashCode();
    }
}
