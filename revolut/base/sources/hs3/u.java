package hs3;

import dx4.z2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class u implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154951c;
    public final z2 d;

    public u(String title, String str, String buttonTitle, z2 z2Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f154949a = title;
        this.f154950b = str;
        this.f154951c = buttonTitle;
        this.d = z2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f154949a, uVar.f154949a) && Intrinsics.f(this.f154950b, uVar.f154950b) && Intrinsics.f(this.f154951c, uVar.f154951c) && Intrinsics.f(this.d, uVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f154949a.hashCode() * 31;
        String str = this.f154950b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f154951c);
        z2 z2Var = this.d;
        return iC + (z2Var != null ? z2Var.hashCode() : 0);
    }
}
