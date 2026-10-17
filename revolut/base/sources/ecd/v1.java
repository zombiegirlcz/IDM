package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class v1 {

    @NotNull
    public static final u1 Companion = new u1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f124689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f124690c;

    public /* synthetic */ v1(double d, double d5, int i, String str) {
        if (7 != (i & 7)) {
            qlm.j1.f(t1.f124674a.getDescriptor(), i, 7);
            throw null;
        }
        this.f124688a = str;
        this.f124689b = d;
        this.f124690c = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj2;
        return Intrinsics.f(this.f124688a, v1Var.f124688a) && Double.compare(this.f124689b, v1Var.f124689b) == 0 && Double.compare(this.f124690c, v1Var.f124690c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f124690c) + m72.b.c(this.f124688a.hashCode() * 31, this.f124689b, 31);
    }

    public v1(String title, double d, double d5) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f124688a = title;
        this.f124689b = d;
        this.f124690c = d5;
    }
}
