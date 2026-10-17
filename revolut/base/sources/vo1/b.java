package vo1;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();
    public static final b f = new b(false, false, false, false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f290839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f290840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f290841c;
    public final boolean d;
    public final boolean e;

    public b(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f290839a = z;
        this.f290840b = z3;
        this.f290841c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f290839a == bVar.f290839a && this.f290840b == bVar.f290840b && this.f290841c == bVar.f290841c && this.d == bVar.d && this.e == bVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f290839a) * 31, 31, this.f290840b), 31, this.f290841c), 31, this.d);
    }
}
