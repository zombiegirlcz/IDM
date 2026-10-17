package a8g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class f0 {

    @NotNull
    public static final e0 Companion = new e0();
    public static final Lazy[] f = {null, null, yhm.j.c(yhm.k.PUBLICATION, new a32.g(27)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f2218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f2219c;
    public final String d;
    public final u e;

    public /* synthetic */ f0(int i, String str, l lVar, List list, String str2, u uVar) {
        if (30 != (i & 30)) {
            j1.f(d0.f2213a.getDescriptor(), i, 30);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f2217a = null;
        } else {
            this.f2217a = str;
        }
        this.f2218b = lVar;
        this.f2219c = list;
        this.d = str2;
        this.e = uVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f2217a, f0Var.f2217a) && Intrinsics.f(this.f2218b, f0Var.f2218b) && Intrinsics.f(this.f2219c, f0Var.f2219c) && Intrinsics.f(this.d, f0Var.d) && Intrinsics.f(this.e, f0Var.e);
    }

    public final int hashCode() {
        String str = this.f2217a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        l lVar = this.f2218b;
        return this.e.hashCode() + p.a.c(p.a.d((iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31, 31, this.f2219c), 31, this.d);
    }
}
