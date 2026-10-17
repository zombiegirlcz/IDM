package lqa;

import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class w {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f199277a;

    public /* synthetic */ w(int i, int i2) {
        if (1 == (i & 1)) {
            this.f199277a = i2;
        } else {
            j1.f(u.f199276a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && this.f199277a == ((w) obj2).f199277a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f199277a);
    }
}
