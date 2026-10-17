package gk7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance.api.models.CFACClaimExpense;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f144330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f144331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f144332c;
    public final Data d;

    public f(Data mappedTransactionsData, Data currentPlan, String searchQuery, List selectedExpenses) {
        Intrinsics.checkNotNullParameter(mappedTransactionsData, "mappedTransactionsData");
        Intrinsics.checkNotNullParameter(selectedExpenses, "selectedExpenses");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        this.f144330a = mappedTransactionsData;
        this.f144331b = selectedExpenses;
        this.f144332c = searchQuery;
        this.d = currentPlan;
    }

    public static f a(f fVar, Data mappedTransactionsData, List selectedExpenses, String searchQuery, Data currentPlan, int i) {
        if ((i & 1) != 0) {
            mappedTransactionsData = fVar.f144330a;
        }
        if ((i & 2) != 0) {
            selectedExpenses = fVar.f144331b;
        }
        if ((i & 4) != 0) {
            searchQuery = fVar.f144332c;
        }
        if ((i & 8) != 0) {
            currentPlan = fVar.d;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(mappedTransactionsData, "mappedTransactionsData");
        Intrinsics.checkNotNullParameter(selectedExpenses, "selectedExpenses");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        return new f(mappedTransactionsData, currentPlan, searchQuery, selectedExpenses);
    }

    public final HashSet b() {
        List list = this.f144331b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((CFACClaimExpense) it8.next()).f74926a.f272579a);
        }
        return d0.b1(arrayList);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f144330a, fVar.f144330a) && Intrinsics.f(this.f144331b, fVar.f144331b) && Intrinsics.f(this.f144332c, fVar.f144332c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.d(this.f144330a.hashCode() * 31, 31, this.f144331b), 31, this.f144332c);
    }
}
