package wz8;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import wyc.u;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f301392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f301393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f301394c;
    public final String d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, yhm.j.c(kVar, new u(10)), yhm.j.c(kVar, new u(11)), null};
    }

    public /* synthetic */ n(int i, String str, List list, p pVar, String str2) {
        if (15 != (i & 15)) {
            j1.f(l.f301391a.getDescriptor(), i, 15);
            throw null;
        }
        this.f301392a = str;
        this.f301393b = list;
        this.f301394c = pVar;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f301392a, nVar.f301392a) && Intrinsics.f(this.f301393b, nVar.f301393b) && this.f301394c == nVar.f301394c && Intrinsics.f(this.d, nVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f301394c.hashCode() + p.a.d(this.f301392a.hashCode() * 31, 31, this.f301393b)) * 31);
    }
}
