package nxa;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f220499b;

    public /* synthetic */ g0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(e0.f220494a.getDescriptor(), i, 3);
            throw null;
        }
        this.f220498a = str;
        this.f220499b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f220498a, g0Var.f220498a) && Intrinsics.f(this.f220499b, g0Var.f220499b);
    }

    public final int hashCode() {
        return this.f220499b.hashCode() + (this.f220498a.hashCode() * 31);
    }
}
