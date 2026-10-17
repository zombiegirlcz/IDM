package qzi;

import ip0.v7;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f250654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f250655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f250656c;
    public final ArrayList d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f250657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f250658h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f250659j;

    public h(a budget, LocalDate now, g status, ArrayList accumulativeSpendingList, dj0.d maxSafeToSpend, dj0.d safeToSpend, dj0.d actualSpend, dj0.d upcomingSpend, int i, e period) {
        Intrinsics.checkNotNullParameter(budget, "budget");
        Intrinsics.checkNotNullParameter(now, "now");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(accumulativeSpendingList, "accumulativeSpendingList");
        Intrinsics.checkNotNullParameter(maxSafeToSpend, "maxSafeToSpend");
        Intrinsics.checkNotNullParameter(safeToSpend, "safeToSpend");
        Intrinsics.checkNotNullParameter(actualSpend, "actualSpend");
        Intrinsics.checkNotNullParameter(upcomingSpend, "upcomingSpend");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f250654a = budget;
        this.f250655b = now;
        this.f250656c = status;
        this.d = accumulativeSpendingList;
        this.e = maxSafeToSpend;
        this.f = safeToSpend;
        this.f250657g = actualSpend;
        this.f250658h = upcomingSpend;
        this.i = i;
        this.f250659j = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f250654a, hVar.f250654a) && this.f250655b.equals(hVar.f250655b) && this.f250656c == hVar.f250656c && this.d.equals(hVar.d) && this.e.equals(hVar.e) && this.f.equals(hVar.f) && this.f250657g.equals(hVar.f250657g) && this.f250658h.equals(hVar.f250658h) && this.i == hVar.i && this.f250659j == hVar.f250659j;
    }

    public final int hashCode() {
        return this.f250659j.hashCode() + j6.a.b(this.i, v7.c(v7.c(v7.c(v7.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (this.f250656c.hashCode() + com.revolut.data.database.models.openbanking.d.g(this.f250655b, this.f250654a.hashCode() * 31, 31)) * 31, 31), 31, this.e), 31, this.f), 31, this.f250657g), 31, this.f250658h), 31);
    }
}
