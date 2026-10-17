package usj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class h0 {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f282948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f282949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f282950c;

    public /* synthetic */ h0(int i, String str, x xVar, String str2) {
        if (3 != (i & 3)) {
            j1.f(f0.f282946a.getDescriptor(), i, 3);
            throw null;
        }
        this.f282948a = str;
        this.f282949b = xVar;
        if ((i & 4) == 0) {
            this.f282950c = null;
        } else {
            this.f282950c = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f282948a, h0Var.f282948a) && Intrinsics.f(this.f282949b, h0Var.f282949b) && Intrinsics.f(this.f282950c, h0Var.f282950c);
    }

    public final int hashCode() {
        int iHashCode = (this.f282949b.hashCode() + (this.f282948a.hashCode() * 31)) * 31;
        String str = this.f282950c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
