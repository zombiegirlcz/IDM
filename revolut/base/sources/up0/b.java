package up0;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();
    public static final b e = new b(0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f281677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f281678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f281679c;
    public final int d;

    public b(int i, int i2, int i3) {
        this.f281677a = i;
        this.f281678b = i2;
        this.f281679c = i3;
        this.d = i + i2 + i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f281677a == bVar.f281677a && this.f281678b == bVar.f281678b && this.f281679c == bVar.f281679c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f281679c) + j6.a.b(this.f281678b, Integer.hashCode(this.f281677a) * 31, 31);
    }
}
