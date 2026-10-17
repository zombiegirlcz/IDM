package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class e5 {

    @NotNull
    public static final x4 Companion = new x4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124541c;
    public final String d;
    public final d5 e;
    public final a5 f;

    public /* synthetic */ e5(int i, String str, String str2, String str3, String str4, d5 d5Var, a5 a5Var) {
        if (31 != (i & 31)) {
            qlm.j1.f(w4.f124700a.getDescriptor(), i, 31);
            throw null;
        }
        this.f124539a = str;
        this.f124540b = str2;
        this.f124541c = str3;
        this.d = str4;
        this.e = d5Var;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = a5Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj2;
        return Intrinsics.f(this.f124539a, e5Var.f124539a) && Intrinsics.f(this.f124540b, e5Var.f124540b) && Intrinsics.f(this.f124541c, e5Var.f124541c) && Intrinsics.f(this.d, e5Var.d) && Intrinsics.f(this.e, e5Var.e) && Intrinsics.f(this.f, e5Var.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f124539a.hashCode() * 31, 31, this.f124540b);
        String str = this.f124541c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        d5 d5Var = this.e;
        int iHashCode3 = (iHashCode2 + (d5Var == null ? 0 : d5Var.hashCode())) * 31;
        a5 a5Var = this.f;
        return iHashCode3 + (a5Var != null ? a5Var.hashCode() : 0);
    }

    public e5(String title, String description, String str, String str2, d5 d5Var, a5 a5Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f124539a = title;
        this.f124540b = description;
        this.f124541c = str;
        this.d = str2;
        this.e = d5Var;
        this.f = a5Var;
    }
}
