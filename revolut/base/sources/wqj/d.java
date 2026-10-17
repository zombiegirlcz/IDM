package wqj;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f299463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f299464c;
    public final String d;
    public final String e;

    public d(String walletId, LocalDate from, LocalDate to6) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f299462a = walletId;
        this.f299463b = from;
        this.f299464c = to6;
        this.d = "budget_history_" + walletId + "_" + from + "_" + to6;
        this.e = j6.a.q("budget_history_available_from_", walletId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f299462a, dVar.f299462a) && Intrinsics.f(this.f299463b, dVar.f299463b) && Intrinsics.f(this.f299464c, dVar.f299464c);
    }

    public final int hashCode() {
        return this.f299464c.hashCode() + y.a(this.f299462a.hashCode() * 31, 31, this.f299463b);
    }
}
