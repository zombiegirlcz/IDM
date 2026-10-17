package qzi;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f250646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f250647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f250648c;
    public final String d;
    public final LocalDate e;
    public final LocalDate f;

    public a(String id10, String walletId, dj0.d plannedMoney, String budgetingCategory, LocalDate startDate, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(plannedMoney, "plannedMoney");
        Intrinsics.checkNotNullParameter(budgetingCategory, "budgetingCategory");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f250646a = id10;
        this.f250647b = walletId;
        this.f250648c = plannedMoney;
        this.d = budgetingCategory;
        this.e = startDate;
        this.f = endDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f250646a, aVar.f250646a) && Intrinsics.f(this.f250647b, aVar.f250647b) && Intrinsics.f(this.f250648c, aVar.f250648c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + com.revolut.data.database.models.openbanking.d.g(this.e, p.a.c(v7.c(p.a.c(this.f250646a.hashCode() * 31, 31, this.f250647b), 31, this.f250648c), 31, this.d), 31);
    }
}
