package xx9;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f309417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f309418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f309419c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;

    public g(LinkedHashMap transactionsMap, LinkedHashMap moneyRequestsMap, LinkedHashMap paymentLinksMap, LinkedHashMap messagesMap, LinkedHashMap groupBillsMap, LinkedHashMap groupSettlementMap) {
        Intrinsics.checkNotNullParameter(transactionsMap, "transactionsMap");
        Intrinsics.checkNotNullParameter(moneyRequestsMap, "moneyRequestsMap");
        Intrinsics.checkNotNullParameter(paymentLinksMap, "paymentLinksMap");
        Intrinsics.checkNotNullParameter(messagesMap, "messagesMap");
        Intrinsics.checkNotNullParameter(groupBillsMap, "groupBillsMap");
        Intrinsics.checkNotNullParameter(groupSettlementMap, "groupSettlementMap");
        this.f309417a = transactionsMap;
        this.f309418b = moneyRequestsMap;
        this.f309419c = paymentLinksMap;
        this.d = messagesMap;
        this.e = groupBillsMap;
        this.f = groupSettlementMap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f309417a.equals(gVar.f309417a) && this.f309418b.equals(gVar.f309418b) && this.f309419c.equals(gVar.f309419c) && this.d.equals(gVar.d) && this.e.equals(gVar.e) && this.f.equals(gVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + r6.b.e(this.e, r6.b.e(this.d, r6.b.e(this.f309419c, r6.b.e(this.f309418b, this.f309417a.hashCode() * 31, 31), 31), 31), 31);
    }
}
