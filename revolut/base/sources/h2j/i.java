package h2j;

import com.revolut.data.model.Data;
import com.revolut.feature.transfer.core.models.CountryProfile;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements cli.j, u1j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f148830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f148831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1j.d f148832c;
    public final xi0.b d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f148833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f148834h;
    public final j1j.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f148835j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CountryProfile f148836l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f148837m;

    public i(Data data, xi0.b selectedCurrency, j1j.d dVar, xi0.b bVar, boolean z, boolean z3, Map sortedAccountIdsByProductSubSpace, j jVar, j1j.b mapperExtraConfig, Data legalEntityContext, List hiddenAccountsItems, CountryProfile countryProfile, List list) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
        Intrinsics.checkNotNullParameter(sortedAccountIdsByProductSubSpace, "sortedAccountIdsByProductSubSpace");
        Intrinsics.checkNotNullParameter(mapperExtraConfig, "mapperExtraConfig");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(hiddenAccountsItems, "hiddenAccountsItems");
        this.f148830a = data;
        this.f148831b = selectedCurrency;
        this.f148832c = dVar;
        this.d = bVar;
        this.e = z;
        this.f = z3;
        this.f148833g = sortedAccountIdsByProductSubSpace;
        this.f148834h = jVar;
        this.i = mapperExtraConfig;
        this.f148835j = legalEntityContext;
        this.k = hiddenAccountsItems;
        this.f148836l = countryProfile;
        this.f148837m = list;
    }

    public static i e(i iVar, Data data, xi0.b bVar, j1j.d dVar, xi0.b bVar2, Map map, j jVar, j1j.b bVar3, Data data2, List list, CountryProfile countryProfile, List list2, int i) {
        Data data3 = (i & 1) != 0 ? iVar.f148830a : data;
        xi0.b selectedCurrency = (i & 2) != 0 ? iVar.f148831b : bVar;
        j1j.d dVar2 = (i & 4) != 0 ? iVar.f148832c : dVar;
        xi0.b bVar4 = (i & 8) != 0 ? iVar.d : bVar2;
        boolean z = (i & 16) != 0 ? iVar.e : true;
        boolean z3 = (i & 32) != 0 ? iVar.f : true;
        Map sortedAccountIdsByProductSubSpace = (i & 64) != 0 ? iVar.f148833g : map;
        j jVar2 = (i & 128) != 0 ? iVar.f148834h : jVar;
        j1j.b mapperExtraConfig = (i & 256) != 0 ? iVar.i : bVar3;
        Data legalEntityContext = (i & 512) != 0 ? iVar.f148835j : data2;
        List hiddenAccountsItems = (i & 1024) != 0 ? iVar.k : list;
        CountryProfile countryProfile2 = (i & 2048) != 0 ? iVar.f148836l : countryProfile;
        List list3 = (i & 4096) != 0 ? iVar.f148837m : list2;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(data3, "data");
        Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
        Intrinsics.checkNotNullParameter(sortedAccountIdsByProductSubSpace, "sortedAccountIdsByProductSubSpace");
        Intrinsics.checkNotNullParameter(mapperExtraConfig, "mapperExtraConfig");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        Intrinsics.checkNotNullParameter(hiddenAccountsItems, "hiddenAccountsItems");
        return new i(data3, selectedCurrency, dVar2, bVar4, z, z3, sortedAccountIdsByProductSubSpace, jVar2, mapperExtraConfig, legalEntityContext, hiddenAccountsItems, countryProfile2, list3);
    }

    @Override // u1j.a
    public final List a() {
        return this.f148837m;
    }

    @Override // u1j.a
    public final CountryProfile c() {
        return this.f148836l;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f148830a, iVar.f148830a) && Intrinsics.f(this.f148831b, iVar.f148831b) && Intrinsics.f(this.f148832c, iVar.f148832c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e && this.f == iVar.f && Intrinsics.f(this.f148833g, iVar.f148833g) && Intrinsics.f(this.f148834h, iVar.f148834h) && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f148835j, iVar.f148835j) && Intrinsics.f(this.k, iVar.k) && Intrinsics.f(this.f148836l, iVar.f148836l) && Intrinsics.f(this.f148837m, iVar.f148837m);
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.f148831b, this.f148830a.hashCode() * 31, 31);
        j1j.d dVar = this.f148832c;
        int iHashCode = (iJ + (dVar == null ? 0 : dVar.hashCode())) * 31;
        xi0.b bVar = this.d;
        int iE = p.a.e(j6.a.c(j6.a.c((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.f148833g);
        j jVar = this.f148834h;
        int iD = p.a.d(kii.e.c(this.f148835j, (this.i.hashCode() + ((iE + (jVar == null ? 0 : jVar.hashCode())) * 31)) * 31, 31), 31, this.k);
        CountryProfile countryProfile = this.f148836l;
        int iHashCode2 = (iD + (countryProfile == null ? 0 : countryProfile.hashCode())) * 31;
        List list = this.f148837m;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
