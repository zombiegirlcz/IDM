package aw0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f10549c;
    public final List d;
    public final boolean e;

    public t9(String str, String amount, xi0.b currency, List transferSuggestions, int i) {
        boolean z = (i & 64) != 0;
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(transferSuggestions, "transferSuggestions");
        this.f10547a = str;
        this.f10548b = amount;
        this.f10549c = currency;
        this.d = transferSuggestions;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t9)) {
            return false;
        }
        t9 t9Var = (t9) obj2;
        return Intrinsics.f(this.f10547a, t9Var.f10547a) && Intrinsics.f(this.f10548b, t9Var.f10548b) && Intrinsics.f(this.f10549c, t9Var.f10549c) && Intrinsics.f(this.d, t9Var.d) && this.e == t9Var.e;
    }

    public final int hashCode() {
        String str = this.f10547a;
        return j6.a.c(j6.a.b(Integer.MAX_VALUE, p.a.d(h30.l.j(this.f10549c, p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f10548b), 31), 961, this.d), 31), 31, this.e);
    }
}
