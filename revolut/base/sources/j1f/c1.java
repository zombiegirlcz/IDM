package j1f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class c1 {

    @NotNull
    public static final b1 Companion = new b1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170372c;
    public final String d;
    public final String e;

    public /* synthetic */ c1(int i, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i & 31)) {
            j1.f(a1.f170365a.getDescriptor(), i, 31);
            throw null;
        }
        this.f170370a = str;
        this.f170371b = str2;
        this.f170372c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj2;
        return Intrinsics.f(this.f170370a, c1Var.f170370a) && Intrinsics.f(this.f170371b, c1Var.f170371b) && Intrinsics.f(this.f170372c, c1Var.f170372c) && Intrinsics.f(this.d, c1Var.d) && Intrinsics.f(this.e, c1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f170370a.hashCode() * 31, 31, this.f170371b), 31, this.f170372c), 31, this.d);
    }
}
