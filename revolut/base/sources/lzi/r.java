package lzi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f200999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f201000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f201001c;

    public r(v id10, int i, int i2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f200999a = id10;
        this.f201000b = i;
        this.f201001c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f200999a == rVar.f200999a && this.f201000b == rVar.f201000b && this.f201001c == rVar.f201001c;
    }

    @Override // lzi.u
    public final v getId() {
        return this.f200999a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f201001c) + j6.a.b(this.f201000b, this.f200999a.hashCode() * 31, 31);
    }
}
