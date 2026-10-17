package py0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240640a;

    public a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f240640a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f240640a, ((a) obj2).f240640a);
    }

    public final int hashCode() {
        return this.f240640a.hashCode();
    }
}
