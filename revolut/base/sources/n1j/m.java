package n1j;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.transfer.core.models.CountryProfile;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements cli.j, u1j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f211389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f211390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f211391c;
    public final Clause d;
    public final j1j.b e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CountryProfile f211392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f211393h;
    public final List i;

    public m(Data balances, Map sortedAccountIdsByProductSubSpace, r rVar, Clause clause, j1j.b extraConfig, List list, CountryProfile countryProfile, Data legalEntityContext, List hiddenAccountsItems) {
        Intrinsics.checkNotNullParameter(balances, "balances");
        Intrinsics.checkNotNullParameter(sortedAccountIdsByProductSubSpace, "sortedAccountIdsByProductSubSpace");
        Intrinsics.checkNotNullParameter(extraConfig, "extraConfig");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(hiddenAccountsItems, "hiddenAccountsItems");
        this.f211389a = balances;
        this.f211390b = sortedAccountIdsByProductSubSpace;
        this.f211391c = rVar;
        this.d = clause;
        this.e = extraConfig;
        this.f = list;
        this.f211392g = countryProfile;
        this.f211393h = legalEntityContext;
        this.i = hiddenAccountsItems;
    }

    public static m e(m mVar, Data data, Map map, r rVar, Clause clause, j1j.b bVar, List list, CountryProfile countryProfile, Data data2, List list2, int i) {
        if ((i & 1) != 0) {
            data = mVar.f211389a;
        }
        Data balances = data;
        if ((i & 2) != 0) {
            map = mVar.f211390b;
        }
        Map sortedAccountIdsByProductSubSpace = map;
        if ((i & 4) != 0) {
            rVar = mVar.f211391c;
        }
        r rVar2 = rVar;
        if ((i & 8) != 0) {
            clause = mVar.d;
        }
        Clause clause2 = clause;
        if ((i & 16) != 0) {
            bVar = mVar.e;
        }
        j1j.b extraConfig = bVar;
        List list3 = (i & 32) != 0 ? mVar.f : list;
        CountryProfile countryProfile2 = (i & 64) != 0 ? mVar.f211392g : countryProfile;
        Data legalEntityContext = (i & 128) != 0 ? mVar.f211393h : data2;
        List hiddenAccountsItems = (i & 256) != 0 ? mVar.i : list2;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(balances, "balances");
        Intrinsics.checkNotNullParameter(sortedAccountIdsByProductSubSpace, "sortedAccountIdsByProductSubSpace");
        Intrinsics.checkNotNullParameter(extraConfig, "extraConfig");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(hiddenAccountsItems, "hiddenAccountsItems");
        return new m(balances, sortedAccountIdsByProductSubSpace, rVar2, clause2, extraConfig, list3, countryProfile2, legalEntityContext, hiddenAccountsItems);
    }

    @Override // u1j.a
    public final List a() {
        return this.f;
    }

    @Override // u1j.a
    public final CountryProfile c() {
        return this.f211392g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f211389a, mVar.f211389a) && Intrinsics.f(this.f211390b, mVar.f211390b) && Intrinsics.f(this.f211391c, mVar.f211391c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f211392g, mVar.f211392g) && Intrinsics.f(this.f211393h, mVar.f211393h) && Intrinsics.f(this.i, mVar.i);
    }

    public final int hashCode() {
        int iE = p.a.e(this.f211389a.hashCode() * 31, 31, this.f211390b);
        r rVar = this.f211391c;
        int iHashCode = (iE + (rVar == null ? 0 : rVar.hashCode())) * 31;
        Clause clause = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
        List list = this.f;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        CountryProfile countryProfile = this.f211392g;
        return this.i.hashCode() + kii.e.c(this.f211393h, (iHashCode3 + (countryProfile != null ? countryProfile.hashCode() : 0)) * 31, 31);
    }
}
