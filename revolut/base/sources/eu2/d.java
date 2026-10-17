package eu2;

import cli.j;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f129477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f129478b;

    public d(boolean z, boolean z3) {
        this.f129477a = z;
        this.f129478b = z3;
    }

    public static d a(d dVar, boolean z, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = dVar.f129477a;
        }
        if ((i & 2) != 0) {
            z3 = dVar.f129478b;
        }
        dVar.getClass();
        return new d(z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f129477a == dVar.f129477a && this.f129478b == dVar.f129478b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f129478b) + (Boolean.hashCode(this.f129477a) * 31);
    }
}
