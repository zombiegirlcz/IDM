package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class l1 {

    @NotNull
    public static final k1 Companion = new k1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153183c;
    public final String d;

    public /* synthetic */ l1(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            qlm.j1.f(j1.f153157a.getDescriptor(), i, 15);
            throw null;
        }
        this.f153181a = str;
        this.f153182b = str2;
        this.f153183c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj2;
        return Intrinsics.f(this.f153181a, l1Var.f153181a) && Intrinsics.f(this.f153182b, l1Var.f153182b) && Intrinsics.f(this.f153183c, l1Var.f153183c) && Intrinsics.f(this.d, l1Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f153181a.hashCode() * 31, 31, this.f153182b), 31, this.f153183c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
