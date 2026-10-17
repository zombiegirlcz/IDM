package uai;

import cli.j;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f278662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f278663b;

    public a(boolean z, int i) {
        this.f278662a = z;
        this.f278663b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f278662a == aVar.f278662a && this.f278663b == aVar.f278663b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f278663b) + (Boolean.hashCode(this.f278662a) * 31);
    }
}
