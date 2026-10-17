package j1f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f170385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f170386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f170387c;
    public final String d;

    public /* synthetic */ i(int i, int i2, int i3, int i5, String str) {
        if (15 != (i & 15)) {
            j1.f(g.f170380a.getDescriptor(), i, 15);
            throw null;
        }
        this.f170385a = i2;
        this.f170386b = i3;
        this.f170387c = i5;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f170385a == iVar.f170385a && this.f170386b == iVar.f170386b && this.f170387c == iVar.f170387c && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.b(this.f170387c, j6.a.b(this.f170386b, Integer.hashCode(this.f170385a) * 31, 31), 31);
    }

    public i(int i, int i2, int i3, String period) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.f170385a = i;
        this.f170386b = i2;
        this.f170387c = i3;
        this.d = period;
    }
}
