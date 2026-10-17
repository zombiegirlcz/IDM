package jrk;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();
    public static final Lazy[] f = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new jp9.l(20))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f178055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f178056c;
    public final j0 d;
    public final List e;

    public /* synthetic */ g0(int i, String str, String str2, String str3, j0 j0Var, List list) {
        if (23 != (i & 23)) {
            j1.f(e0.f178049a.getDescriptor(), i, 23);
            throw null;
        }
        this.f178054a = str;
        this.f178055b = str2;
        this.f178056c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = j0Var;
        }
        this.e = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f178054a, g0Var.f178054a) && Intrinsics.f(this.f178055b, g0Var.f178055b) && Intrinsics.f(this.f178056c, g0Var.f178056c) && Intrinsics.f(this.d, g0Var.d) && Intrinsics.f(this.e, g0Var.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f178054a.hashCode() * 31, 31, this.f178055b), 31, this.f178056c);
        j0 j0Var = this.d;
        return this.e.hashCode() + ((iC + (j0Var == null ? 0 : j0Var.hashCode())) * 31);
    }
}
