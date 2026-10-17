package rp9;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f256289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f256290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f256291c;

    public a(Data billsData, String searchQuery, List selectedBills) {
        Intrinsics.checkNotNullParameter(billsData, "billsData");
        Intrinsics.checkNotNullParameter(selectedBills, "selectedBills");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f256289a = billsData;
        this.f256290b = selectedBills;
        this.f256291c = searchQuery;
    }

    public static a a(a aVar, Data billsData, ArrayList arrayList, String searchQuery, int i) {
        if ((i & 1) != 0) {
            billsData = aVar.f256289a;
        }
        List selectedBills = arrayList;
        if ((i & 2) != 0) {
            selectedBills = aVar.f256290b;
        }
        if ((i & 4) != 0) {
            searchQuery = aVar.f256291c;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(billsData, "billsData");
        Intrinsics.checkNotNullParameter(selectedBills, "selectedBills");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new a(billsData, searchQuery, selectedBills);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f256289a, aVar.f256289a) && Intrinsics.f(this.f256290b, aVar.f256290b) && Intrinsics.f(this.f256291c, aVar.f256291c);
    }

    public final int hashCode() {
        return this.f256291c.hashCode() + p.a.d(this.f256289a.hashCode() * 31, 31, this.f256290b);
    }
}
