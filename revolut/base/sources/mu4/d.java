package mu4;

import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import ll4.x;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f208952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f208953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f208954c;
    public final dj0.d d;
    public final x e;

    public d(LocalDate paymentDue, dj0.d minimumPayment, dj0.d statementBalance, dj0.d totalBalance, x speiAttribute) {
        Intrinsics.checkNotNullParameter(paymentDue, "paymentDue");
        Intrinsics.checkNotNullParameter(minimumPayment, "minimumPayment");
        Intrinsics.checkNotNullParameter(statementBalance, "statementBalance");
        Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
        Intrinsics.checkNotNullParameter(speiAttribute, "speiAttribute");
        this.f208952a = paymentDue;
        this.f208953b = minimumPayment;
        this.f208954c = statementBalance;
        this.d = totalBalance;
        this.e = speiAttribute;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f208952a, dVar.f208952a) && Intrinsics.f(this.f208953b, dVar.f208953b) && Intrinsics.f(this.f208954c, dVar.f208954c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(v7.c(v7.c(this.f208952a.hashCode() * 31, 31, this.f208953b), 31, this.f208954c), 31, this.d);
    }
}
