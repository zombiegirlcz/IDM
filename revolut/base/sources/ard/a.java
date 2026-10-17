package ard;

import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionContract$DateRange;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionContract$SelectionMode;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lk0.g f8633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f8634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SelectTransactionContract$SelectionMode f8635c;
    public final boolean d;
    public final SelectTransactionContract$DateRange e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k71.q f8636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f8637h;
    public final xi0.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ZonedDateTime f8638j;

    public a(lk0.g gVar, Set selectedTransactions, SelectTransactionContract$SelectionMode selectionMode, boolean z, SelectTransactionContract$DateRange selectTransactionContract$DateRange, String currentSearchQuery, k71.q qVar, List list, xi0.b bVar, ZonedDateTime zonedDateTime) {
        Intrinsics.checkNotNullParameter(selectedTransactions, "selectedTransactions");
        Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
        Intrinsics.checkNotNullParameter(currentSearchQuery, "currentSearchQuery");
        this.f8633a = gVar;
        this.f8634b = selectedTransactions;
        this.f8635c = selectionMode;
        this.d = z;
        this.e = selectTransactionContract$DateRange;
        this.f = currentSearchQuery;
        this.f8636g = qVar;
        this.f8637h = list;
        this.i = bVar;
        this.f8638j = zonedDateTime;
    }

    public static a a(a aVar, lk0.g gVar, Set set, boolean z, String str, k71.q qVar, List list, xi0.b bVar, ZonedDateTime zonedDateTime, int i) {
        if ((i & 1) != 0) {
            gVar = aVar.f8633a;
        }
        lk0.g gVar2 = gVar;
        Set selectedTransactions = (i & 2) != 0 ? aVar.f8634b : set;
        SelectTransactionContract$SelectionMode selectionMode = aVar.f8635c;
        boolean z3 = (i & 8) != 0 ? aVar.d : z;
        SelectTransactionContract$DateRange selectTransactionContract$DateRange = (i & 16) != 0 ? aVar.e : null;
        String currentSearchQuery = (i & 32) != 0 ? aVar.f : str;
        k71.q qVar2 = (i & 64) != 0 ? aVar.f8636g : qVar;
        List list2 = (i & 128) != 0 ? aVar.f8637h : list;
        xi0.b bVar2 = (i & 256) != 0 ? aVar.i : bVar;
        ZonedDateTime zonedDateTime2 = (i & 512) != 0 ? aVar.f8638j : zonedDateTime;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(selectedTransactions, "selectedTransactions");
        Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
        Intrinsics.checkNotNullParameter(currentSearchQuery, "currentSearchQuery");
        return new a(gVar2, selectedTransactions, selectionMode, z3, selectTransactionContract$DateRange, currentSearchQuery, qVar2, list2, bVar2, zonedDateTime2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f8633a, aVar.f8633a) && Intrinsics.f(this.f8634b, aVar.f8634b) && Intrinsics.f(this.f8635c, aVar.f8635c) && this.d == aVar.d && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f8636g, aVar.f8636g) && Intrinsics.f(this.f8637h, aVar.f8637h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f8638j, aVar.f8638j);
    }

    public final int hashCode() {
        lk0.g gVar = this.f8633a;
        int iC = j6.a.c((this.f8635c.hashCode() + p.a.f((gVar == null ? 0 : gVar.f196174a.hashCode()) * 31, 31, this.f8634b)) * 31, 31, this.d);
        SelectTransactionContract$DateRange selectTransactionContract$DateRange = this.e;
        int iC2 = p.a.c((iC + (selectTransactionContract$DateRange == null ? 0 : selectTransactionContract$DateRange.hashCode())) * 31, 31, this.f);
        k71.q qVar = this.f8636g;
        int iHashCode = (iC2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        List list = this.f8637h;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        xi0.b bVar = this.i;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.f8638j;
        return iHashCode3 + (zonedDateTime != null ? zonedDateTime.hashCode() : 0);
    }
}
