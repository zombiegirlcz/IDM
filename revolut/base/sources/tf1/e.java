package tf1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf1.f f270154a;

    public e(qf1.f id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f270154a = id10;
    }

    @Override // tf1.h
    public final qf1.f a() {
        return this.f270154a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f270154a == ((e) obj2).f270154a;
    }

    public final int hashCode() {
        return this.f270154a.hashCode();
    }
}
