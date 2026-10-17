package rt5;

import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import ip0.v7;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitAccountsItemGroup.RowItem f257202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SplitAccountsItemGroup.RowItem f257203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f257204c;
    public final String d;
    public final dj0.d e;
    public final dj0.d f;

    public i(SplitAccountsItemGroup.RowItem baseItem, SplitAccountsItemGroup.RowItem rowItem, BigDecimal bigDecimal, String currencyName, dj0.d combinedBalance, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(baseItem, "baseItem");
        Intrinsics.checkNotNullParameter(currencyName, "currencyName");
        Intrinsics.checkNotNullParameter(combinedBalance, "combinedBalance");
        this.f257202a = baseItem;
        this.f257203b = rowItem;
        this.f257204c = bigDecimal;
        this.d = currencyName;
        this.e = combinedBalance;
        this.f = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f257202a, iVar.f257202a) && Intrinsics.f(this.f257203b, iVar.f257203b) && Intrinsics.f(this.f257204c, iVar.f257204c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f257202a.hashCode() * 31;
        SplitAccountsItemGroup.RowItem rowItem = this.f257203b;
        int iHashCode2 = (iHashCode + (rowItem == null ? 0 : rowItem.hashCode())) * 31;
        BigDecimal bigDecimal = this.f257204c;
        int iC = v7.c(p.a.c((iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31, 31, this.d), 31, this.e);
        dj0.d dVar = this.f;
        return iC + (dVar != null ? dVar.hashCode() : 0);
    }
}
