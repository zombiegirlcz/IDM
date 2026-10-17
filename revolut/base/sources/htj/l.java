package htj;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();
    public static final Lazy[] k = {null, null, null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new ht1.e(2)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f155423c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f155424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f155425h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f0 f155426j;

    public /* synthetic */ l(int i, String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3, List list, f0 f0Var) {
        if (1023 != (i & 1023)) {
            j1.f(j.f155419a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f155421a = str;
        this.f155422b = str2;
        this.f155423c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f155424g = j2;
        this.f155425h = j3;
        this.i = list;
        this.f155426j = f0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f155421a, lVar.f155421a) && Intrinsics.f(this.f155422b, lVar.f155422b) && Intrinsics.f(this.f155423c, lVar.f155423c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && this.f155424g == lVar.f155424g && this.f155425h == lVar.f155425h && Intrinsics.f(this.i, lVar.i) && Intrinsics.f(this.f155426j, lVar.f155426j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.f155421a.hashCode() * 31, 31, this.f155422b), 31, this.f155423c), 31, this.d), 31, this.e);
        String str = this.f;
        int iD = p.a.d(a0.d.c(a0.d.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f155424g), 31, this.f155425h), 31, this.i);
        f0 f0Var = this.f155426j;
        return iD + (f0Var != null ? f0Var.hashCode() : 0);
    }
}
