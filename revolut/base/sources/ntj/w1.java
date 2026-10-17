package ntj;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class w1 {

    @NotNull
    public static final v1 Companion = new v1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f219138a;

    public w1(int i) {
        this.f219138a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w1) && this.f219138a == ((w1) obj2).f219138a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f219138a);
    }

    public /* synthetic */ w1(int i, int i2) {
        if (1 == (i & 1)) {
            this.f219138a = i2;
        } else {
            qlm.j1.f(u1.f219134a.getDescriptor(), i, 1);
            throw null;
        }
    }
}
