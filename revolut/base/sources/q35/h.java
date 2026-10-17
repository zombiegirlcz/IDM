package q35;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f241818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f241819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f241820c;
    public final boolean d;
    public final boolean e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f241821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f241822h;
    public final int i;

    public h(boolean z, e autoPay, g statementType, boolean z3, boolean z4, f repaymentManagement, boolean z6, String str, int i) {
        Intrinsics.checkNotNullParameter(autoPay, "autoPay");
        Intrinsics.checkNotNullParameter(statementType, "statementType");
        Intrinsics.checkNotNullParameter(repaymentManagement, "repaymentManagement");
        this.f241818a = z;
        this.f241819b = autoPay;
        this.f241820c = statementType;
        this.d = z3;
        this.e = z4;
        this.f = repaymentManagement;
        this.f241821g = z6;
        this.f241822h = str;
        this.i = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f241818a == hVar.f241818a && this.f241819b == hVar.f241819b && this.f241820c == hVar.f241820c && this.d == hVar.d && this.e == hVar.e && this.f == hVar.f && this.f241821g == hVar.f241821g && Intrinsics.f(this.f241822h, hVar.f241822h) && this.i == hVar.i;
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f.hashCode() + j6.a.c(j6.a.c((this.f241820c.hashCode() + ((this.f241819b.hashCode() + (Boolean.hashCode(this.f241818a) * 31)) * 31)) * 31, 31, this.d), 31, this.e)) * 31, 31, this.f241821g);
        String str = this.f241822h;
        return Integer.hashCode(this.i) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
