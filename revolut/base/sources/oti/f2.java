package oti;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class f2 {

    @NotNull
    public static final e2 Companion = new e2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f229635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f229636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f229637c;
    public final c2 d;
    public final c2 e;

    public /* synthetic */ f2(int i, c2 c2Var, c2 c2Var2, c2 c2Var3, c2 c2Var4, c2 c2Var5) {
        if (1 != (i & 1)) {
            qlm.j1.f(d2.f229629a.getDescriptor(), i, 1);
            throw null;
        }
        this.f229635a = c2Var;
        if ((i & 2) == 0) {
            this.f229636b = null;
        } else {
            this.f229636b = c2Var2;
        }
        if ((i & 4) == 0) {
            this.f229637c = null;
        } else {
            this.f229637c = c2Var3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = c2Var4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = c2Var5;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj2;
        return Intrinsics.f(this.f229635a, f2Var.f229635a) && Intrinsics.f(this.f229636b, f2Var.f229636b) && Intrinsics.f(this.f229637c, f2Var.f229637c) && Intrinsics.f(this.d, f2Var.d) && Intrinsics.f(this.e, f2Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f229635a.hashCode() * 31;
        c2 c2Var = this.f229636b;
        int iHashCode2 = (iHashCode + (c2Var == null ? 0 : c2Var.hashCode())) * 31;
        c2 c2Var2 = this.f229637c;
        int iHashCode3 = (iHashCode2 + (c2Var2 == null ? 0 : c2Var2.hashCode())) * 31;
        c2 c2Var3 = this.d;
        int iHashCode4 = (iHashCode3 + (c2Var3 == null ? 0 : c2Var3.hashCode())) * 31;
        c2 c2Var4 = this.e;
        return iHashCode4 + (c2Var4 != null ? c2Var4.hashCode() : 0);
    }

    public f2(c2 content, c2 c2Var, c2 c2Var2, c2 c2Var3, c2 c2Var4) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f229635a = content;
        this.f229636b = c2Var;
        this.f229637c = c2Var2;
        this.d = c2Var3;
        this.e = c2Var4;
    }
}
