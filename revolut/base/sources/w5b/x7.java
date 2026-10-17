package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class x7 {

    @NotNull
    public static final w7 Companion = new w7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f295077c;
    public final Double d;

    public /* synthetic */ x7(int i, String str, String str2, String str3, Double d) {
        if (15 != (i & 15)) {
            qlm.j1.f(v7.f295050a.getDescriptor(), i, 15);
            throw null;
        }
        this.f295075a = str;
        this.f295076b = str2;
        this.f295077c = str3;
        this.d = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x7)) {
            return false;
        }
        x7 x7Var = (x7) obj2;
        return Intrinsics.f(this.f295075a, x7Var.f295075a) && Intrinsics.f(this.f295076b, x7Var.f295076b) && Intrinsics.f(this.f295077c, x7Var.f295077c) && Intrinsics.f(this.d, x7Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f295075a.hashCode() * 31, 31, this.f295076b), 31, this.f295077c);
        Double d = this.d;
        return iC + (d == null ? 0 : d.hashCode());
    }

    public x7(String title, String subtitle, String icon, Double d) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f295075a = title;
        this.f295076b = subtitle;
        this.f295077c = icon;
        this.d = d;
    }
}
