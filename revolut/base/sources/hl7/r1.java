package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class r1 {

    @NotNull
    public static final q1 Companion = new q1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153285c;

    public /* synthetic */ r1(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(p1.f153250a.getDescriptor(), i, 7);
            throw null;
        }
        this.f153283a = str;
        this.f153284b = str2;
        this.f153285c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj2;
        return Intrinsics.f(this.f153283a, r1Var.f153283a) && Intrinsics.f(this.f153284b, r1Var.f153284b) && Intrinsics.f(this.f153285c, r1Var.f153285c);
    }

    public final int hashCode() {
        int iHashCode = this.f153283a.hashCode() * 31;
        String str = this.f153284b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f153285c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public r1(String state, String str, String str2) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f153283a = state;
        this.f153284b = str;
        this.f153285c = str2;
    }
}
