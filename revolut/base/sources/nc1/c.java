package nc1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f214123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f214124c;
    public final boolean d;
    public final d e;
    public final dj0.d f;

    public c(String amount, xi0.b currency, String description, boolean z, d focusedField, dj0.d transactionLimit) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(focusedField, "focusedField");
        Intrinsics.checkNotNullParameter(transactionLimit, "transactionLimit");
        this.f214122a = amount;
        this.f214123b = currency;
        this.f214124c = description;
        this.d = z;
        this.e = focusedField;
        this.f = transactionLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f214122a, cVar.f214122a) && Intrinsics.f(this.f214123b, cVar.f214123b) && Intrinsics.f(this.f214124c, cVar.f214124c) && this.d == cVar.d && this.e == cVar.e && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + j6.a.c(p.a.c(h30.l.j(this.f214123b, this.f214122a.hashCode() * 31, 31), 31, this.f214124c), 31, this.d)) * 31);
    }
}
