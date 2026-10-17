package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294973c;

    public /* synthetic */ p0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(n0.f294931a.getDescriptor(), i, 7);
            throw null;
        }
        this.f294971a = str;
        this.f294972b = str2;
        this.f294973c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f294971a, p0Var.f294971a) && Intrinsics.f(this.f294972b, p0Var.f294972b) && Intrinsics.f(this.f294973c, p0Var.f294973c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f294971a.hashCode() * 31, 31, this.f294972b);
        String str = this.f294973c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
