package zda;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f321359c;

    public /* synthetic */ a0(int i, String str, String str2, o oVar) {
        if (7 != (i & 7)) {
            j1.f(y.f321427a.getDescriptor(), i, 7);
            throw null;
        }
        this.f321357a = str;
        this.f321358b = str2;
        this.f321359c = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f321357a, a0Var.f321357a) && Intrinsics.f(this.f321358b, a0Var.f321358b) && Intrinsics.f(this.f321359c, a0Var.f321359c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f321357a.hashCode() * 31, 31, this.f321358b);
        o oVar = this.f321359c;
        return iC + (oVar == null ? 0 : oVar.hashCode());
    }

    public a0(String currency, String country, o oVar) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(country, "country");
        this.f321357a = currency;
        this.f321358b = country;
        this.f321359c = oVar;
    }
}
