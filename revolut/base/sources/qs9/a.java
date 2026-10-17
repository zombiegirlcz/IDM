package qs9;

import do3.n;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import st9.f;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f248756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f248757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f248758c;
    public final Map d;
    public final List e;
    public final f f;

    public a(n user, List debts, List debtsReminders, Map balancesExpandedMap, List transactions, f paymentGroupLink) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(debts, "debts");
        Intrinsics.checkNotNullParameter(debtsReminders, "debtsReminders");
        Intrinsics.checkNotNullParameter(balancesExpandedMap, "balancesExpandedMap");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(paymentGroupLink, "paymentGroupLink");
        this.f248756a = user;
        this.f248757b = debts;
        this.f248758c = debtsReminders;
        this.d = balancesExpandedMap;
        this.e = transactions;
        this.f = paymentGroupLink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f248756a, aVar.f248756a) && Intrinsics.f(this.f248757b, aVar.f248757b) && Intrinsics.f(this.f248758c, aVar.f248758c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.d(p.a.e(p.a.d(p.a.d(this.f248756a.hashCode() * 31, 31, this.f248757b), 31, this.f248758c), 31, this.d), 31, this.e);
    }
}
