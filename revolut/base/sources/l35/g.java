package l35;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f191854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f191855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f191856c;

    public g(boolean z, boolean z3, boolean z4) {
        this.f191854a = z;
        this.f191855b = z3;
        this.f191856c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f191854a == gVar.f191854a && this.f191855b == gVar.f191855b && this.f191856c == gVar.f191856c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f191856c) + j6.a.c(Boolean.hashCode(this.f191854a) * 31, 31, this.f191855b);
    }
}
