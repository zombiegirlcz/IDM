package o6c;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f222540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f222541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f222542c;
    public final Integer d;

    public b(int i, int i2, int i3, Integer num) {
        this.f222540a = i;
        this.f222541b = i2;
        this.f222542c = i3;
        this.d = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f222540a == bVar.f222540a && this.f222541b == bVar.f222541b && this.f222542c == bVar.f222542c && this.d.equals(bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(j6.a.b(this.f222542c, j6.a.b(this.f222541b, j6.a.b(24, Integer.hashCode(this.f222540a) * 31, 31), 31), 31), 31, false);
    }
}
