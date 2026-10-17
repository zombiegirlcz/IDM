package z66;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f319684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lk0.g f319685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f319686c;
    public final xi0.b d;
    public final SortingType e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f319687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f319688h;

    public b() {
        this(0);
    }

    public static b a(b bVar, Clause clause, lk0.g gVar, Data data, xi0.b bVar2, SortingType sortingType, boolean z, String str, List list, int i) {
        if ((i & 1) != 0) {
            clause = bVar.f319684a;
        }
        Clause clause2 = clause;
        if ((i & 2) != 0) {
            gVar = bVar.f319685b;
        }
        lk0.g gVar2 = gVar;
        if ((i & 4) != 0) {
            data = bVar.f319686c;
        }
        Data ratesData = data;
        if ((i & 8) != 0) {
            bVar2 = bVar.d;
        }
        xi0.b bVar3 = bVar2;
        if ((i & 16) != 0) {
            sortingType = bVar.e;
        }
        SortingType sortingType2 = sortingType;
        if ((i & 32) != 0) {
            z = bVar.f;
        }
        boolean z3 = z;
        String searchQuery = (i & 64) != 0 ? bVar.f319687g : str;
        List visibleAssets = (i & 128) != 0 ? bVar.f319688h : list;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(ratesData, "ratesData");
        Intrinsics.checkNotNullParameter(sortingType2, "sortingType");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(visibleAssets, "visibleAssets");
        return new b(clause2, gVar2, ratesData, bVar3, sortingType2, z3, searchQuery, visibleAssets);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f319684a, bVar.f319684a) && Intrinsics.f(this.f319685b, bVar.f319685b) && Intrinsics.f(this.f319686c, bVar.f319686c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && this.f == bVar.f && Intrinsics.f(this.f319687g, bVar.f319687g) && Intrinsics.f(this.f319688h, bVar.f319688h);
    }

    public final int hashCode() {
        Clause clause = this.f319684a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        lk0.g gVar = this.f319685b;
        int iC = kii.e.c(this.f319686c, (iHashCode + (gVar == null ? 0 : gVar.f196174a.hashCode())) * 31, 31);
        xi0.b bVar = this.d;
        return this.f319688h.hashCode() + p.a.c(j6.a.c((this.e.hashCode() + ((iC + (bVar != null ? bVar.hashCode() : 0)) * 31)) * 31, 31, this.f), 31, this.f319687g);
    }

    public b(Clause clause, lk0.g gVar, Data ratesData, xi0.b bVar, SortingType sortingType, boolean z, String searchQuery, List visibleAssets) {
        Intrinsics.checkNotNullParameter(ratesData, "ratesData");
        Intrinsics.checkNotNullParameter(sortingType, "sortingType");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(visibleAssets, "visibleAssets");
        this.f319684a = clause;
        this.f319685b = gVar;
        this.f319686c = ratesData;
        this.d = bVar;
        this.e = sortingType;
        this.f = z;
        this.f319687g = searchQuery;
        this.f319688h = visibleAssets;
    }

    public b(int i) {
        this(null, null, new Data(null, null, true, 3, null), null, new SortingType.MarketCap(0), false, "", f0.f322471a);
    }
}
