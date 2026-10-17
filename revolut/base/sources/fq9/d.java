package fq9;

import cli.j;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType;
import com.revolut.feature.payments.bills_chooser.impl.domain.SplitBillItem;
import do3.n;
import h30.l;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitBillItem f137213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SplitMembersType f137214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f137215c;
    public final n d;
    public final Set e;

    public d(SplitBillItem item, SplitMembersType members, xi0.b currency, n nVar, Set selectedMemberIds) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(members, "members");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(selectedMemberIds, "selectedMemberIds");
        this.f137213a = item;
        this.f137214b = members;
        this.f137215c = currency;
        this.d = nVar;
        this.e = selectedMemberIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f137213a, dVar.f137213a) && Intrinsics.f(this.f137214b, dVar.f137214b) && Intrinsics.f(this.f137215c, dVar.f137215c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iJ = l.j(this.f137215c, (this.f137214b.hashCode() + (this.f137213a.hashCode() * 31)) * 31, 31);
        n nVar = this.d;
        return this.e.hashCode() + ((iJ + (nVar == null ? 0 : nVar.hashCode())) * 31);
    }
}
