package av3;

import dx4.a1;
import dx4.c1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f9900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9902c;

    public g(a1 a1Var, String str, String str2) {
        this.f9900a = a1Var;
        this.f9901b = str;
        this.f9902c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f9900a, gVar.f9900a) && Intrinsics.f(this.f9901b, gVar.f9901b) && Intrinsics.f(this.f9902c, gVar.f9902c);
    }

    public final int hashCode() {
        c1 c1Var = this.f9900a;
        int iHashCode = (c1Var == null ? 0 : c1Var.hashCode()) * 31;
        String str = this.f9901b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9902c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
