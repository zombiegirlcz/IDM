package wrj;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f299599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ie3.a f299600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f299601c;
    public final Map d;
    public final k71.q e;

    public h(List vaults, ie3.a transactionsContent, List recurringPaymentsSchedule, Map contactsWithPaidPlan, k71.q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(vaults, "vaults");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(recurringPaymentsSchedule, "recurringPaymentsSchedule");
        Intrinsics.checkNotNullParameter(contactsWithPaidPlan, "contactsWithPaidPlan");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        this.f299599a = vaults;
        this.f299600b = transactionsContent;
        this.f299601c = recurringPaymentsSchedule;
        this.d = contactsWithPaidPlan;
        this.e = transactionsExtraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f299599a, hVar.f299599a) && Intrinsics.f(this.f299600b, hVar.f299600b) && Intrinsics.f(this.f299601c, hVar.f299601c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.e(p.a.d((this.f299600b.hashCode() + (this.f299599a.hashCode() * 31)) * 31, 31, this.f299601c), 31, this.d);
    }
}
