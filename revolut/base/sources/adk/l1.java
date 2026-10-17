package adk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class l1 {

    @NotNull
    public static final k1 Companion = new k1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o1 f3408c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3410h;
    public final String i;

    public /* synthetic */ l1(int i, String str, String str2, o1 o1Var, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (511 != (i & 511)) {
            qlm.j1.f(j1.f3401a.getDescriptor(), i, 511);
            throw null;
        }
        this.f3406a = str;
        this.f3407b = str2;
        this.f3408c = o1Var;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f3409g = str6;
        this.f3410h = str7;
        this.i = str8;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj2;
        return Intrinsics.f(this.f3406a, l1Var.f3406a) && Intrinsics.f(this.f3407b, l1Var.f3407b) && Intrinsics.f(this.f3408c, l1Var.f3408c) && Intrinsics.f(this.d, l1Var.d) && Intrinsics.f(this.e, l1Var.e) && Intrinsics.f(this.f, l1Var.f) && Intrinsics.f(this.f3409g, l1Var.f3409g) && Intrinsics.f(this.f3410h, l1Var.f3410h) && Intrinsics.f(this.i, l1Var.i);
    }

    public final int hashCode() {
        String str = this.f3406a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f3407b;
        int iC = p.a.c(p.a.c((this.f3408c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.d), 31, this.e);
        String str3 = this.f;
        int iHashCode2 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f3409g;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f3410h;
        return this.i.hashCode() + ((iHashCode3 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }
}
