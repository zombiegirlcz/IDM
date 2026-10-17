package lzi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f201002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f201003b;

    public s(v id10, int i) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f201002a = id10;
        this.f201003b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f201002a == sVar.f201002a && this.f201003b == sVar.f201003b;
    }

    @Override // lzi.u
    public final v getId() {
        return this.f201002a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f201003b) + (this.f201002a.hashCode() * 31);
    }
}
