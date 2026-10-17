package j29;

import j1f.q0;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import m1c.o1;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class l {

    @NotNull
    public static final e Companion = new e();
    public static final Lazy[] f = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new q0(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o1 f170759c;
    public final k d;
    public final List e;

    public /* synthetic */ l(int i, String str, String str2, o1 o1Var, k kVar, List list) {
        if (31 != (i & 31)) {
            j1.f(d.f170747a.getDescriptor(), i, 31);
            throw null;
        }
        this.f170757a = str;
        this.f170758b = str2;
        this.f170759c = o1Var;
        this.d = kVar;
        this.e = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f170757a, lVar.f170757a) && Intrinsics.f(this.f170758b, lVar.f170758b) && Intrinsics.f(this.f170759c, lVar.f170759c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f170759c.hashCode() + p.a.c(this.f170757a.hashCode() * 31, 31, this.f170758b)) * 31;
        k kVar = this.d;
        return this.e.hashCode() + ((iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31);
    }
}
