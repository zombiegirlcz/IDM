package fmg;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class o {

    @NotNull
    public static final m Companion = new m();
    public static final Lazy[] f = {null, null, yhm.j.c(yhm.k.PUBLICATION, new fk8.a(29)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f136444c;
    public final String d;
    public final String e;

    public /* synthetic */ o(int i, String str, String str2, n nVar, String str3, String str4) {
        if (31 != (i & 31)) {
            j1.f(l.f136437a.getDescriptor(), i, 31);
            throw null;
        }
        this.f136442a = str;
        this.f136443b = str2;
        this.f136444c = nVar;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f136442a, oVar.f136442a) && Intrinsics.f(this.f136443b, oVar.f136443b) && this.f136444c == oVar.f136444c && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e);
    }

    public final int hashCode() {
        String str = this.f136442a;
        return this.e.hashCode() + p.a.c((this.f136444c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f136443b)) * 31, 31, this.d);
    }
}
