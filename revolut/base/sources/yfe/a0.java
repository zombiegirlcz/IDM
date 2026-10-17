package yfe;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yfe.h;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class a0 extends h.a {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f313237h = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new yfd.c(18))};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f313238c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f313239g;

    public /* synthetic */ a0(int i, dj0.d dVar, String str, String str2, String str3, w wVar) {
        if (31 != (i & 31)) {
            qlm.j1.f(u.f313309a.getDescriptor(), i, 31);
            throw null;
        }
        this.f313238c = dVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.f313239g = wVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f313238c, a0Var.f313238c) && Intrinsics.f(this.d, a0Var.d) && Intrinsics.f(this.e, a0Var.e) && Intrinsics.f(this.f, a0Var.f) && Intrinsics.f(this.f313239g, a0Var.f313239g);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f313238c.hashCode() * 31, 31, this.d), 31, this.e), 31, this.f);
        w wVar = this.f313239g;
        return iC + (wVar == null ? 0 : wVar.hashCode());
    }

    public a0(dj0.d money, String juniorId, String firstName, String fullName, w wVar) {
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        this.f313238c = money;
        this.d = juniorId;
        this.e = firstName;
        this.f = fullName;
        this.f313239g = wVar;
    }
}
