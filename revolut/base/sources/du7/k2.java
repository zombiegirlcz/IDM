package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class k2 {

    @NotNull
    public static final j2 Companion = new j2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f117732c;

    public /* synthetic */ k2(int i, String str, String str2, t tVar) {
        if (7 != (i & 7)) {
            qlm.j1.f(i2.f117715a.getDescriptor(), i, 7);
            throw null;
        }
        this.f117730a = str;
        this.f117731b = str2;
        this.f117732c = tVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj2;
        return Intrinsics.f(this.f117730a, k2Var.f117730a) && Intrinsics.f(this.f117731b, k2Var.f117731b) && Intrinsics.f(this.f117732c, k2Var.f117732c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f117730a.hashCode() * 31, 31, this.f117731b);
        t tVar = this.f117732c;
        return iC + (tVar == null ? 0 : tVar.hashCode());
    }
}
