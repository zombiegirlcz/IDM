package fif;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f135399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f135400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f135401c;
    public final Map d;
    public final Map e;

    public g(Map categories, Map deviceContacts, Map apmContacts, Map suspiciousTransactions, Map cryptoDepositCounterparties) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(deviceContacts, "deviceContacts");
        Intrinsics.checkNotNullParameter(apmContacts, "apmContacts");
        Intrinsics.checkNotNullParameter(suspiciousTransactions, "suspiciousTransactions");
        Intrinsics.checkNotNullParameter(cryptoDepositCounterparties, "cryptoDepositCounterparties");
        this.f135399a = categories;
        this.f135400b = deviceContacts;
        this.f135401c = apmContacts;
        this.d = suspiciousTransactions;
        this.e = cryptoDepositCounterparties;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f135399a, gVar.f135399a) && Intrinsics.f(this.f135400b, gVar.f135400b) && Intrinsics.f(this.f135401c, gVar.f135401c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.e(p.a.e(p.a.e(this.f135399a.hashCode() * 31, 31, this.f135400b), 31, this.f135401c), 31, this.d);
    }
}
