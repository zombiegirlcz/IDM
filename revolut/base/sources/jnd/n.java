package jnd;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f176718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f176719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f176720c;

    public n(String walletId, LocalDate from, LocalDate to6) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f176718a = walletId;
        this.f176719b = from;
        this.f176720c = to6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f176718a, nVar.f176718a) && Intrinsics.f(this.f176719b, nVar.f176719b) && Intrinsics.f(this.f176720c, nVar.f176720c);
    }

    public final int hashCode() {
        return this.f176720c.hashCode() + y.a(this.f176718a.hashCode() * 31, 31, this.f176719b);
    }
}
