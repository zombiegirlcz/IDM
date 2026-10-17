package ny0;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class m {

    @NotNull
    public static final a Companion = new a();
    public static final m e = new m(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f220600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f220601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f220602c;
    public final int d;

    public static final class a {
        private a() {
        }
    }

    public m(int i, int i2, int i3, int i5) {
        this.f220600a = i;
        this.f220601b = i2;
        this.f220602c = i3;
        this.d = i5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f220600a == mVar.f220600a && this.f220601b == mVar.f220601b && this.f220602c == mVar.f220602c && this.d == mVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f220602c, j6.a.b(this.f220601b, Integer.hashCode(this.f220600a) * 31, 31), 31);
    }

    public m() {
        this(0, 0, 0, 0);
    }
}
