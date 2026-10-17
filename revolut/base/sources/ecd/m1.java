package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class m1 {

    @NotNull
    public static final l1 Companion = new l1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f124617c;
    public final int d;

    public /* synthetic */ m1(int i, int i2, int i3, String str, String str2) {
        if (15 != (i & 15)) {
            qlm.j1.f(k1.f124599a.getDescriptor(), i, 15);
            throw null;
        }
        this.f124615a = str;
        this.f124616b = str2;
        this.f124617c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj2;
        return Intrinsics.f(this.f124615a, m1Var.f124615a) && Intrinsics.f(this.f124616b, m1Var.f124616b) && this.f124617c == m1Var.f124617c && this.d == m1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f124617c, p.a.c(this.f124615a.hashCode() * 31, 31, this.f124616b), 31);
    }

    public m1(String title, String explanation, int i, int i2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(explanation, "explanation");
        this.f124615a = title;
        this.f124616b = explanation;
        this.f124617c = i;
        this.d = i2;
    }
}
