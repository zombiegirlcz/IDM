package na8;

import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f213828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f213829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f213830c;
    public final Data d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f213831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f213832h;
    public final bj0.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Address f213833j;
    public final com.revolut.feature.junior_profile.api.models.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f213834l;

    public l(Data parent, Data juniorFullNames, Data featureConfigs, Data planConfiguration, String str, boolean z, String str2, k dob2, bj0.b bVar, Address address, com.revolut.feature.junior_profile.api.models.a aVar, String str3) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(juniorFullNames, "juniorFullNames");
        Intrinsics.checkNotNullParameter(featureConfigs, "featureConfigs");
        Intrinsics.checkNotNullParameter(planConfiguration, "planConfiguration");
        Intrinsics.checkNotNullParameter(dob2, "dob");
        this.f213828a = parent;
        this.f213829b = juniorFullNames;
        this.f213830c = featureConfigs;
        this.d = planConfiguration;
        this.e = str;
        this.f = z;
        this.f213831g = str2;
        this.f213832h = dob2;
        this.i = bVar;
        this.f213833j = address;
        this.k = aVar;
        this.f213834l = str3;
    }

    public static l a(l lVar, Data data, Data data2, Data data3, Data data4, String str, boolean z, String str2, k kVar, bj0.b bVar, Address address, com.revolut.feature.junior_profile.api.models.a aVar, String str3, int i) {
        if ((i & 1) != 0) {
            data = lVar.f213828a;
        }
        Data parent = data;
        if ((i & 2) != 0) {
            data2 = lVar.f213829b;
        }
        Data juniorFullNames = data2;
        Data featureConfigs = (i & 4) != 0 ? lVar.f213830c : data3;
        Data planConfiguration = (i & 8) != 0 ? lVar.d : data4;
        String str4 = (i & 16) != 0 ? lVar.e : str;
        boolean z3 = (i & 32) != 0 ? lVar.f : z;
        String str5 = (i & 64) != 0 ? lVar.f213831g : str2;
        k dob2 = (i & 128) != 0 ? lVar.f213832h : kVar;
        bj0.b bVar2 = (i & 256) != 0 ? lVar.i : bVar;
        Address address2 = (i & 512) != 0 ? lVar.f213833j : address;
        com.revolut.feature.junior_profile.api.models.a aVar2 = (i & 1024) != 0 ? lVar.k : aVar;
        String str6 = (i & 2048) != 0 ? lVar.f213834l : str3;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(juniorFullNames, "juniorFullNames");
        Intrinsics.checkNotNullParameter(featureConfigs, "featureConfigs");
        Intrinsics.checkNotNullParameter(planConfiguration, "planConfiguration");
        Intrinsics.checkNotNullParameter(dob2, "dob");
        return new l(parent, juniorFullNames, featureConfigs, planConfiguration, str4, z3, str5, dob2, bVar2, address2, aVar2, str6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f213828a, lVar.f213828a) && Intrinsics.f(this.f213829b, lVar.f213829b) && Intrinsics.f(this.f213830c, lVar.f213830c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && this.f == lVar.f && Intrinsics.f(this.f213831g, lVar.f213831g) && Intrinsics.f(this.f213832h, lVar.f213832h) && this.i == lVar.i && Intrinsics.f(this.f213833j, lVar.f213833j) && Intrinsics.f(this.k, lVar.k) && Intrinsics.f(this.f213834l, lVar.f213834l);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.d, kii.e.c(this.f213830c, kii.e.c(this.f213829b, this.f213828a.hashCode() * 31, 31), 31), 31);
        String str = this.e;
        int iC2 = j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        String str2 = this.f213831g;
        int iHashCode = (this.f213832h.hashCode() + ((iC2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        bj0.b bVar = this.i;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Address address = this.f213833j;
        int iHashCode3 = (iHashCode2 + (address == null ? 0 : address.hashCode())) * 31;
        com.revolut.feature.junior_profile.api.models.a aVar = this.k;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str3 = this.f213834l;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
