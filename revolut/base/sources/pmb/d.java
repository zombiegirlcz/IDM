package pmb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f237529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavingsProductData f237530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f237531c;
    public final TextLocalisedClause d;

    public d(Data domainData, SavingsProductData savingsProductData, int i, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(domainData, "domainData");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f237529a = domainData;
        this.f237530b = savingsProductData;
        this.f237531c = i;
        this.d = title;
    }

    public static d a(d dVar, Data domainData, SavingsProductData savingsProductData, int i, int i2) {
        if ((i2 & 1) != 0) {
            domainData = dVar.f237529a;
        }
        if ((i2 & 2) != 0) {
            savingsProductData = dVar.f237530b;
        }
        if ((i2 & 4) != 0) {
            i = dVar.f237531c;
        }
        TextLocalisedClause title = dVar.d;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(domainData, "domainData");
        Intrinsics.checkNotNullParameter(title, "title");
        return new d(domainData, savingsProductData, i, title);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f237529a, dVar.f237529a) && Intrinsics.f(this.f237530b, dVar.f237530b) && this.f237531c == dVar.f237531c && this.d.equals(dVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f237529a.hashCode() * 31;
        SavingsProductData savingsProductData = this.f237530b;
        return this.d.hashCode() + j6.a.b(this.f237531c, (iHashCode + (savingsProductData == null ? 0 : savingsProductData.hashCode())) * 31, 31);
    }
}
