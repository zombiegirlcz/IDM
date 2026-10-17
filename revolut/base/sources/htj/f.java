package htj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f155404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f155406c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f155407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f155408h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a0 f155409j;

    public /* synthetic */ f(int i, jo3.a aVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, a0 a0Var) {
        if (255 != (i & 255)) {
            j1.f(d.f155402a.getDescriptor(), i, 255);
            throw null;
        }
        this.f155404a = aVar;
        this.f155405b = str;
        this.f155406c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f155407g = str6;
        this.f155408h = str7;
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str8;
        }
        if ((i & 512) == 0) {
            this.f155409j = null;
        } else {
            this.f155409j = a0Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f155404a, fVar.f155404a) && Intrinsics.f(this.f155405b, fVar.f155405b) && Intrinsics.f(this.f155406c, fVar.f155406c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f155407g, fVar.f155407g) && Intrinsics.f(this.f155408h, fVar.f155408h) && Intrinsics.f(this.i, fVar.i) && Intrinsics.f(this.f155409j, fVar.f155409j);
    }

    public final int hashCode() {
        int iHashCode = this.f155404a.hashCode() * 31;
        String str = this.f155405b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f155406c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f155407g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f155408h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        a0 a0Var = this.f155409j;
        return iHashCode9 + (a0Var != null ? a0Var.hashCode() : 0);
    }

    public f(jo3.a amount, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, a0 a0Var) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f155404a = amount;
        this.f155405b = str;
        this.f155406c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f155407g = str6;
        this.f155408h = str7;
        this.i = str8;
        this.f155409j = a0Var;
    }
}
