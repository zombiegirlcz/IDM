package qs9;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f248759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f248760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f248761c;

    public b(LinkedHashMap balancesExpandedMap, List debts, List debtsReminders) {
        Intrinsics.checkNotNullParameter(debts, "debts");
        Intrinsics.checkNotNullParameter(debtsReminders, "debtsReminders");
        Intrinsics.checkNotNullParameter(balancesExpandedMap, "balancesExpandedMap");
        this.f248759a = debts;
        this.f248760b = debtsReminders;
        this.f248761c = balancesExpandedMap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f248759a, bVar.f248759a) && Intrinsics.f(this.f248760b, bVar.f248760b) && this.f248761c.equals(bVar.f248761c);
    }

    public final int hashCode() {
        return this.f248761c.hashCode() + p.a.d(this.f248759a.hashCode() * 31, 31, this.f248760b);
    }
}
