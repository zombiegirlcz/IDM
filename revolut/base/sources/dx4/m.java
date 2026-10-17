package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f120672c;
    public final l d;

    public m(String id10, String title, a1 a1Var, l action) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f120670a = id10;
        this.f120671b = title;
        this.f120672c = a1Var;
        this.d = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f120670a, mVar.f120670a) && Intrinsics.f(this.f120671b, mVar.f120671b) && this.f120672c == mVar.f120672c && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f120670a.hashCode() * 31, 31, this.f120671b);
        a1 a1Var = this.f120672c;
        return this.d.hashCode() + ((iC + (a1Var == null ? 0 : a1Var.hashCode())) * 31);
    }
}
