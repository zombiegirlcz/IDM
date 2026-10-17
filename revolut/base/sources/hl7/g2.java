package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g2 {

    @NotNull
    public static final f2 Companion = new f2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153116c;
    public final String d;

    public /* synthetic */ g2(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            qlm.j1.f(e2.f153073a.getDescriptor(), i, 15);
            throw null;
        }
        this.f153114a = str;
        this.f153115b = str2;
        this.f153116c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj2;
        return Intrinsics.f(this.f153114a, g2Var.f153114a) && Intrinsics.f(this.f153115b, g2Var.f153115b) && Intrinsics.f(this.f153116c, g2Var.f153116c) && Intrinsics.f(this.d, g2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f153114a.hashCode() * 31, 31, this.f153115b), 31, this.f153116c);
    }
}
