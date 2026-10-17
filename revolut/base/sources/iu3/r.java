package iu3;

import dx4.z2;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f168502c;
    public final z2 d;

    public r(String title, String value, String str, z2 z2Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f168500a = title;
        this.f168501b = value;
        this.f168502c = str;
        this.d = z2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f168500a, rVar.f168500a) && Intrinsics.f(this.f168501b, rVar.f168501b) && Intrinsics.f(this.f168502c, rVar.f168502c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f168500a.hashCode() * 31, 31, this.f168501b);
        String str = this.f168502c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        z2 z2Var = this.d;
        return iHashCode + (z2Var != null ? z2Var.hashCode() : 0);
    }
}
