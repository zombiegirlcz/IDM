package gl4;

import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f144557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f144558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f144559c;
    public final dj0.d d;
    public final LocalDate e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f144560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f144561h;

    public d(xi0.b currency, dj0.d minimalPayment, dj0.d statement, dj0.d totalAmount, LocalDate statementDueDate, LocalDate localDate, dj0.d minLimit, dj0.d maxLimit) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(minimalPayment, "minimalPayment");
        Intrinsics.checkNotNullParameter(statement, "statement");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(statementDueDate, "statementDueDate");
        Intrinsics.checkNotNullParameter(minLimit, "minLimit");
        Intrinsics.checkNotNullParameter(maxLimit, "maxLimit");
        this.f144557a = currency;
        this.f144558b = minimalPayment;
        this.f144559c = statement;
        this.d = totalAmount;
        this.e = statementDueDate;
        this.f = localDate;
        this.f144560g = minLimit;
        this.f144561h = maxLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f144557a, dVar.f144557a) && Intrinsics.f(this.f144558b, dVar.f144558b) && Intrinsics.f(this.f144559c, dVar.f144559c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f144560g, dVar.f144560g) && Intrinsics.f(this.f144561h, dVar.f144561h);
    }

    public final int hashCode() {
        int iA = y.a(v7.c(v7.c(v7.c(this.f144557a.hashCode() * 31, 31, this.f144558b), 31, this.f144559c), 31, this.d), 31, this.e);
        LocalDate localDate = this.f;
        return this.f144561h.hashCode() + v7.c((iA + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.f144560g);
    }
}
