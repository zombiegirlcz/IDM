package dx4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g2 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120604c;
    public final List d;
    public final q e;
    public final l f;

    public g2(String str, String str2, String str3, List items, q qVar, l lVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f120602a = str;
        this.f120603b = str2;
        this.f120604c = str3;
        this.d = items;
        this.e = qVar;
        this.f = lVar;
    }

    public static g2 a(g2 g2Var, List items) {
        String str = g2Var.f120602a;
        String str2 = g2Var.f120603b;
        String str3 = g2Var.f120604c;
        q qVar = g2Var.e;
        l lVar = g2Var.f;
        Intrinsics.checkNotNullParameter(items, "items");
        return new g2(str, str2, str3, items, qVar, lVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj2;
        return Intrinsics.f(this.f120602a, g2Var.f120602a) && Intrinsics.f(this.f120603b, g2Var.f120603b) && Intrinsics.f(this.f120604c, g2Var.f120604c) && Intrinsics.f(this.d, g2Var.d) && this.e == g2Var.e && Intrinsics.f(this.f, g2Var.f);
    }

    public final int hashCode() {
        String str = this.f120602a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f120603b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f120604c;
        int iD = p.a.d((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.d);
        q qVar = this.e;
        int iHashCode3 = (iD + (qVar == null ? 0 : qVar.hashCode())) * 31;
        l lVar = this.f;
        return iHashCode3 + (lVar != null ? lVar.hashCode() : 0);
    }
}
