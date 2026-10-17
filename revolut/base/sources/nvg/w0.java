package nvg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eel.c f219687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f219689c;
    public final String d;

    public w0(eel.c timeSpan, String currency, String portfolioId, String str) {
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f219687a = timeSpan;
        this.f219688b = currency;
        this.f219689c = portfolioId;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return this.f219687a == w0Var.f219687a && Intrinsics.f(this.f219688b, w0Var.f219688b) && Intrinsics.f(this.f219689c, w0Var.f219689c) && Intrinsics.f(this.d, w0Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f219687a.hashCode() * 31, 31, this.f219688b), 31, this.f219689c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
