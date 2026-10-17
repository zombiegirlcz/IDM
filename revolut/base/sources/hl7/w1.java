package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class w1 {

    @NotNull
    public static final v1 Companion = new v1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153348b;

    public /* synthetic */ w1(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(u1.f153326a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153347a = str;
        this.f153348b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj2;
        return Intrinsics.f(this.f153347a, w1Var.f153347a) && Intrinsics.f(this.f153348b, w1Var.f153348b);
    }

    public final int hashCode() {
        return this.f153348b.hashCode() + (this.f153347a.hashCode() * 31);
    }
}
