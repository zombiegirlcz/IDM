package ttj;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class t {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f274404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f274405b;

    public /* synthetic */ t(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            qlm.j1.f(r.f274396a.getDescriptor(), i, 3);
            throw null;
        }
        this.f274404a = i2;
        this.f274405b = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f274404a == tVar.f274404a && this.f274405b == tVar.f274405b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f274405b) + (Integer.hashCode(this.f274404a) * 31);
    }
}
