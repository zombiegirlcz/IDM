package dx4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120660c;
    public final q d;
    public final l e;

    public l1(String title, String value, String str, q qVar, l lVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f120658a = title;
        this.f120659b = value;
        this.f120660c = str;
        this.d = qVar;
        this.e = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj2;
        return Intrinsics.f(this.f120658a, l1Var.f120658a) && Intrinsics.f(this.f120659b, l1Var.f120659b) && Intrinsics.f(this.f120660c, l1Var.f120660c) && this.d == l1Var.d && Intrinsics.f(this.e, l1Var.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f120658a.hashCode() * 31, 31, this.f120659b);
        String str = this.f120660c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        q qVar = this.d;
        int iHashCode2 = (iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        l lVar = this.e;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }
}
