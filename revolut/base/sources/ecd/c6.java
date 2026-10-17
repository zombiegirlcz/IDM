package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class c6 {

    @NotNull
    public static final v5 Companion = new v5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b6 f124508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y5 f124509c;

    public /* synthetic */ c6(int i, String str, b6 b6Var, y5 y5Var) {
        if (7 != (i & 7)) {
            qlm.j1.f(u5.f124683a.getDescriptor(), i, 7);
            throw null;
        }
        this.f124507a = str;
        this.f124508b = b6Var;
        this.f124509c = y5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c6)) {
            return false;
        }
        c6 c6Var = (c6) obj2;
        return Intrinsics.f(this.f124507a, c6Var.f124507a) && Intrinsics.f(this.f124508b, c6Var.f124508b) && Intrinsics.f(this.f124509c, c6Var.f124509c);
    }

    public final int hashCode() {
        return this.f124509c.hashCode() + ((this.f124508b.hashCode() + (this.f124507a.hashCode() * 31)) * 31);
    }

    public c6(String title, b6 maturity, y5 funding) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(maturity, "maturity");
        Intrinsics.checkNotNullParameter(funding, "funding");
        this.f124507a = title;
        this.f124508b = maturity;
        this.f124509c = funding;
    }
}
