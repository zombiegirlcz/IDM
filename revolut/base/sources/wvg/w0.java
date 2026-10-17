package wvg;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eel.c f300489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f300490c;
    public final xi0.b d;
    public final mwg.h e;

    public w0(String userId, eel.c timeSpan, Instant to6, xi0.b currency, mwg.h selector) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(selector, "selector");
        this.f300488a = userId;
        this.f300489b = timeSpan;
        this.f300490c = to6;
        this.d = currency;
        this.e = selector;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return Intrinsics.f(this.f300488a, w0Var.f300488a) && this.f300489b == w0Var.f300489b && Intrinsics.f(this.f300490c, w0Var.f300490c) && this.d.equals(w0Var.d) && this.e.equals(w0Var.e);
    }

    public final int hashCode() {
        return this.e.f209462a.hashCode() + h30.l.j(this.d, r6.b.c(prk.o.c(this.f300489b, this.f300488a.hashCode() * 31, 31), 31, this.f300490c), 31);
    }
}
