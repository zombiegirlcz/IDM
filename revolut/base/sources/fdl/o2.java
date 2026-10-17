package fdl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class o2 {

    @NotNull
    public static final n2 Companion = new n2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f134233b;

    public /* synthetic */ o2(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(m2.f134216a.getDescriptor(), i, 3);
            throw null;
        }
        this.f134232a = str;
        this.f134233b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj2;
        return Intrinsics.f(this.f134232a, o2Var.f134232a) && Intrinsics.f(this.f134233b, o2Var.f134233b);
    }

    public final int hashCode() {
        return this.f134233b.hashCode() + (this.f134232a.hashCode() * 31);
    }
}
