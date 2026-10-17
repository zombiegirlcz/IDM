package dx4;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s0 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f120760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120761c;

    public s0(dj0.d amount, String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f120759a = id10;
        this.f120760b = amount;
        this.f120761c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f120759a, s0Var.f120759a) && Intrinsics.f(this.f120760b, s0Var.f120760b) && Intrinsics.f(this.f120761c, s0Var.f120761c);
    }

    public final int hashCode() {
        int iC = v7.c(this.f120759a.hashCode() * 31, 31, this.f120760b);
        String str = this.f120761c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
