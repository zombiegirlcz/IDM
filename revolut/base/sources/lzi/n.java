package lzi;

import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f200991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f200992c;

    public n(String walletId, LocalDate historyAvailableFrom, List snapshots) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(historyAvailableFrom, "historyAvailableFrom");
        Intrinsics.checkNotNullParameter(snapshots, "snapshots");
        this.f200990a = walletId;
        this.f200991b = historyAvailableFrom;
        this.f200992c = snapshots;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f200990a, nVar.f200990a) && Intrinsics.f(this.f200991b, nVar.f200991b) && Intrinsics.f(this.f200992c, nVar.f200992c);
    }

    public final int hashCode() {
        return this.f200992c.hashCode() + wp5.y.a(this.f200990a.hashCode() * 31, 31, this.f200991b);
    }
}
