package a8g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2216c;

    public /* synthetic */ f(int i, String str, int i2, String str2) {
        if (7 != (i & 7)) {
            j1.f(d.f2212a.getDescriptor(), i, 7);
            throw null;
        }
        this.f2214a = str;
        this.f2215b = i2;
        this.f2216c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f2214a, fVar.f2214a) && this.f2215b == fVar.f2215b && Intrinsics.f(this.f2216c, fVar.f2216c);
    }

    public final int hashCode() {
        return this.f2216c.hashCode() + j6.a.b(this.f2215b, this.f2214a.hashCode() * 31, 31);
    }
}
