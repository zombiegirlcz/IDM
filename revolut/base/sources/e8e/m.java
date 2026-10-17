package e8e;

import com.revolut.data.model.Data;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f123643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f123644c;
    public final Set d;
    public final boolean e;
    public final k71.q f;

    public m(String subaccountId, Data billsData, Set selectedItems, Set expandedItems, boolean z, k71.q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
        Intrinsics.checkNotNullParameter(billsData, "billsData");
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        Intrinsics.checkNotNullParameter(expandedItems, "expandedItems");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        this.f123642a = subaccountId;
        this.f123643b = billsData;
        this.f123644c = selectedItems;
        this.d = expandedItems;
        this.e = z;
        this.f = transactionsExtraData;
    }

    public static m a(m mVar, Data data, Set set, LinkedHashSet linkedHashSet, k71.q qVar, int i) {
        String subaccountId = mVar.f123642a;
        if ((i & 2) != 0) {
            data = mVar.f123643b;
        }
        Data billsData = data;
        if ((i & 4) != 0) {
            set = mVar.f123644c;
        }
        Set selectedItems = set;
        Set set2 = linkedHashSet;
        if ((i & 8) != 0) {
            set2 = mVar.d;
        }
        Set expandedItems = set2;
        boolean z = (i & 16) != 0 ? mVar.e : true;
        if ((i & 32) != 0) {
            qVar = mVar.f;
        }
        k71.q transactionsExtraData = qVar;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
        Intrinsics.checkNotNullParameter(billsData, "billsData");
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        Intrinsics.checkNotNullParameter(expandedItems, "expandedItems");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        return new m(subaccountId, billsData, selectedItems, expandedItems, z, transactionsExtraData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f123642a, mVar.f123642a) && Intrinsics.f(this.f123643b, mVar.f123643b) && Intrinsics.f(this.f123644c, mVar.f123644c) && Intrinsics.f(this.d, mVar.d) && this.e == mVar.e && Intrinsics.f(this.f, mVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + j6.a.c(p.a.f(p.a.f(kii.e.c(this.f123643b, this.f123642a.hashCode() * 31, 31), 31, this.f123644c), 31, this.d), 31, this.e);
    }
}
