package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class f1 {

    @NotNull
    public static final e1 Companion = new e1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f153095c;
    public final Boolean d;

    public /* synthetic */ f1(int i, String str, String str2, Boolean bool, Boolean bool2) {
        if (15 != (i & 15)) {
            qlm.j1.f(d1.f153058a.getDescriptor(), i, 15);
            throw null;
        }
        this.f153093a = str;
        this.f153094b = str2;
        this.f153095c = bool;
        this.d = bool2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj2;
        return Intrinsics.f(this.f153093a, f1Var.f153093a) && Intrinsics.f(this.f153094b, f1Var.f153094b) && Intrinsics.f(this.f153095c, f1Var.f153095c) && Intrinsics.f(this.d, f1Var.d);
    }

    public final int hashCode() {
        String str = this.f153093a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f153094b);
        Boolean bool = this.f153095c;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.d;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public f1(String str, String type, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f153093a = str;
        this.f153094b = type;
        this.f153095c = bool;
        this.d = bool2;
    }
}
