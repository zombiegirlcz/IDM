package tf1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf1.f f270160a;

    public g(qf1.f id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f270160a = id10;
    }

    @Override // tf1.h
    public final qf1.f a() {
        return this.f270160a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f270160a == ((g) obj2).f270160a;
    }

    public final int hashCode() {
        return this.f270160a.hashCode();
    }
}
