package he3;

import ip0.v7;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f151564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f151565c;
    public final l d;
    public final List e;

    public j(String id10, dj0.d amount, Map dailyTotals, l type, List transactions) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(dailyTotals, "dailyTotals");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f151563a = id10;
        this.f151564b = amount;
        this.f151565c = dailyTotals;
        this.d = type;
        this.e = transactions;
    }

    public static j a(j jVar, dj0.d amount, HashMap map, List transactions, int i) {
        String id10 = jVar.f151563a;
        Map map2 = map;
        if ((i & 4) != 0) {
            map2 = jVar.f151565c;
        }
        Map dailyTotals = map2;
        l type = jVar.d;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(dailyTotals, "dailyTotals");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        return new j(id10, amount, dailyTotals, type, transactions);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f151563a, jVar.f151563a) && Intrinsics.f(this.f151564b, jVar.f151564b) && Intrinsics.f(this.f151565c, jVar.f151565c) && this.d == jVar.d && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + p.a.e(v7.c(this.f151563a.hashCode() * 31, 31, this.f151564b), 31, this.f151565c)) * 31);
    }
}
