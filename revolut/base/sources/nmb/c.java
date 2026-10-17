package nmb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f217235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavingsProductData f217236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f217237c;
    public final String d;
    public final boolean e;

    public c(Data domainData, SavingsProductData savingsProductData, TextLocalisedClause title, String searchQuery, boolean z) {
        Intrinsics.checkNotNullParameter(domainData, "domainData");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f217235a = domainData;
        this.f217236b = savingsProductData;
        this.f217237c = title;
        this.d = searchQuery;
        this.e = z;
    }

    public static c a(c cVar, Data data, SavingsProductData savingsProductData, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            data = cVar.f217235a;
        }
        Data domainData = data;
        if ((i & 2) != 0) {
            savingsProductData = cVar.f217236b;
        }
        SavingsProductData savingsProductData2 = savingsProductData;
        TextLocalisedClause title = cVar.f217237c;
        if ((i & 8) != 0) {
            str = cVar.d;
        }
        String searchQuery = str;
        if ((i & 16) != 0) {
            z = cVar.e;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(domainData, "domainData");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new c(domainData, savingsProductData2, title, searchQuery, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f217235a, cVar.f217235a) && Intrinsics.f(this.f217236b, cVar.f217236b) && this.f217237c.equals(cVar.f217237c) && Intrinsics.f(this.d, cVar.d) && this.e == cVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.f217235a.hashCode() * 31;
        SavingsProductData savingsProductData = this.f217236b;
        return Boolean.hashCode(this.e) + p.a.c(t61.a.a((iHashCode + (savingsProductData == null ? 0 : savingsProductData.hashCode())) * 31, 31, this.f217237c), 31, this.d);
    }
}
