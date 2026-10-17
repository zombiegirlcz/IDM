package tf1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf1.f f270158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qf1.e f270159b;

    public f(qf1.f id10, qf1.e categoryItemGroupId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(categoryItemGroupId, "categoryItemGroupId");
        this.f270158a = id10;
        this.f270159b = categoryItemGroupId;
    }

    @Override // tf1.h
    public final qf1.f a() {
        return this.f270158a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f270158a == fVar.f270158a && this.f270159b == fVar.f270159b;
    }

    public final int hashCode() {
        return this.f270159b.hashCode() + (this.f270158a.hashCode() * 31);
    }
}
