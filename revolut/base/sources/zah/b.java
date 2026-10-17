package zah;

import cli.j;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements j, oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f320706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f320707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f320708c;
    public final Integer d;

    public b(Data data, Integer num, String selectedPagerItemId, List pagerItems) {
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        this.f320706a = selectedPagerItemId;
        this.f320707b = pagerItems;
        this.f320708c = data;
        this.d = num;
    }

    public static b a(b bVar, String selectedPagerItemId, List pagerItems, Data data, Integer num, int i) {
        if ((i & 1) != 0) {
            selectedPagerItemId = bVar.f320706a;
        }
        if ((i & 2) != 0) {
            pagerItems = bVar.f320707b;
        }
        if ((i & 4) != 0) {
            data = bVar.f320708c;
        }
        if ((i & 8) != 0) {
            num = bVar.d;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        return new b(data, num, selectedPagerItemId, pagerItems);
    }

    @Override // oki.a
    public final List W() {
        return this.f320707b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f320706a, bVar.f320706a) && Intrinsics.f(this.f320707b, bVar.f320707b) && Intrinsics.f(this.f320708c, bVar.f320708c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f320706a.hashCode() * 31, 31, this.f320707b);
        Data data = this.f320708c;
        int iHashCode = (iD + (data == null ? 0 : data.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // oki.a
    public final String z() {
        return this.f320706a;
    }
}
