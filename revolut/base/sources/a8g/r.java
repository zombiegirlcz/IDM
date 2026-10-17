package a8g;

import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2238b;

    public /* synthetic */ r(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            j1.f(p.f2236a.getDescriptor(), i, 3);
            throw null;
        }
        this.f2237a = i2;
        this.f2238b = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f2237a == rVar.f2237a && this.f2238b == rVar.f2238b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2238b) + (Integer.hashCode(this.f2237a) * 31);
    }
}
