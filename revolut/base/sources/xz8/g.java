package xz8;

import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f309896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f309897b;

    public /* synthetic */ g(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            j1.f(e.f309895a.getDescriptor(), i, 3);
            throw null;
        }
        this.f309896a = i2;
        this.f309897b = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f309896a == gVar.f309896a && this.f309897b == gVar.f309897b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f309897b) + (Integer.hashCode(this.f309896a) * 31);
    }
}
