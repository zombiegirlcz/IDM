package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e5 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120587c;
    public final d5 d;

    public e5(String id10, String str, String text, d5 d5Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f120585a = id10;
        this.f120586b = str;
        this.f120587c = text;
        this.d = d5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj2;
        return Intrinsics.f(this.f120585a, e5Var.f120585a) && Intrinsics.f(this.f120586b, e5Var.f120586b) && Intrinsics.f(this.f120587c, e5Var.f120587c) && Intrinsics.f(this.d, e5Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f120585a.hashCode() * 31;
        String str = this.f120586b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f120587c);
        d5 d5Var = this.d;
        return iC + (d5Var != null ? d5Var.hashCode() : 0);
    }
}
