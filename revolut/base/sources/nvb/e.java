package nvb;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f219574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f219575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f219576c;

    public e(int i, int i2, int i3) {
        this.f219574a = i;
        this.f219575b = i2;
        this.f219576c = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f219574a == eVar.f219574a && this.f219575b == eVar.f219575b && this.f219576c == eVar.f219576c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f219576c) + j6.a.b(this.f219575b, Integer.hashCode(this.f219574a) * 31, 31);
    }
}
