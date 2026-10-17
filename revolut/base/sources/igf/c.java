package igf;

import cli.j;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements j, oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f161187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f161188c;
    public final Data d;

    public c(Data transactions, Integer num, String selectedPagerItemId, List pagerItems) {
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f161186a = selectedPagerItemId;
        this.f161187b = pagerItems;
        this.f161188c = num;
        this.d = transactions;
    }

    public static c a(c cVar, String selectedPagerItemId, List pagerItems, Integer num, Data transactions, int i) {
        if ((i & 1) != 0) {
            selectedPagerItemId = cVar.f161186a;
        }
        if ((i & 2) != 0) {
            pagerItems = cVar.f161187b;
        }
        if ((i & 4) != 0) {
            num = cVar.f161188c;
        }
        if ((i & 8) != 0) {
            transactions = cVar.d;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        return new c(transactions, num, selectedPagerItemId, pagerItems);
    }

    @Override // oki.a
    public final List W() {
        return this.f161187b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f161186a, cVar.f161186a) && Intrinsics.f(this.f161187b, cVar.f161187b) && Intrinsics.f(this.f161188c, cVar.f161188c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f161186a.hashCode() * 31, 31, this.f161187b);
        Integer num = this.f161188c;
        return this.d.hashCode() + ((iD + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Override // oki.a
    public final String z() {
        return this.f161186a;
    }
}
