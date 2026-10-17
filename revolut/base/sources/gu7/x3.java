package gu7;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class x3 {

    @NotNull
    public static final w3 Companion = new w3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f146864c = {null, yhm.j.c(yhm.k.PUBLICATION, new v1(14))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y3 f146866b;

    public /* synthetic */ x3(int i, String str, y3 y3Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(v3.f146849a.getDescriptor(), i, 3);
            throw null;
        }
        this.f146865a = str;
        this.f146866b = y3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x3)) {
            return false;
        }
        x3 x3Var = (x3) obj2;
        return Intrinsics.f(this.f146865a, x3Var.f146865a) && this.f146866b == x3Var.f146866b;
    }

    public final int hashCode() {
        String str = this.f146865a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        y3 y3Var = this.f146866b;
        return iHashCode + (y3Var != null ? y3Var.hashCode() : 0);
    }

    public x3(String str, y3 y3Var) {
        this.f146865a = str;
        this.f146866b = y3Var;
    }
}
