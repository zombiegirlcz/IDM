package w7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f295529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f295531c;
    public final String d;
    public final String e;
    public final Integer f;

    public /* synthetic */ i(int i, boolean z, String str, String str2, String str3, String str4, Integer num) {
        if (63 != (i & 63)) {
            j1.f(g.f295528a.getDescriptor(), i, 63);
            throw null;
        }
        this.f295529a = z;
        this.f295530b = str;
        this.f295531c = str2;
        this.d = str3;
        this.e = str4;
        this.f = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f295529a == iVar.f295529a && Intrinsics.f(this.f295530b, iVar.f295530b) && Intrinsics.f(this.f295531c, iVar.f295531c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(Boolean.hashCode(this.f295529a) * 31, 31, this.f295530b), 31, this.f295531c), 31, this.d), 31, this.e);
        Integer num = this.f;
        return iC + (num == null ? 0 : num.hashCode());
    }
}
