package gu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class u3 {

    @NotNull
    public static final t3 Companion = new t3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x3 f146841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x3 f146842c;

    public /* synthetic */ u3(int i, String str, x3 x3Var, x3 x3Var2) {
        if (7 != (i & 7)) {
            qlm.j1.f(s3.f146830a.getDescriptor(), i, 7);
            throw null;
        }
        this.f146840a = str;
        this.f146841b = x3Var;
        this.f146842c = x3Var2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj2;
        return Intrinsics.f(this.f146840a, u3Var.f146840a) && Intrinsics.f(this.f146841b, u3Var.f146841b) && Intrinsics.f(this.f146842c, u3Var.f146842c);
    }

    public final int hashCode() {
        String str = this.f146840a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        x3 x3Var = this.f146841b;
        int iHashCode2 = (iHashCode + (x3Var == null ? 0 : x3Var.hashCode())) * 31;
        x3 x3Var2 = this.f146842c;
        return iHashCode2 + (x3Var2 != null ? x3Var2.hashCode() : 0);
    }

    public u3(String str, x3 x3Var, x3 x3Var2) {
        this.f146840a = str;
        this.f146841b = x3Var;
        this.f146842c = x3Var2;
    }
}
