package myf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f210463b;

    public a0(String id10, String currency) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f210462a = id10;
        this.f210463b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f210462a, a0Var.f210462a) && Intrinsics.f(this.f210463b, a0Var.f210463b);
    }

    public final int hashCode() {
        return this.f210463b.hashCode() + (this.f210462a.hashCode() * 31);
    }
}
