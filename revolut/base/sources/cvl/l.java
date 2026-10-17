package cvl;

import com.revolut.data.model.Data;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f109489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f109490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SourcePocket f109491c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f109492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f109493h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d1h.g f109494j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f109495l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f109496m;

    public l() {
        this(8191, null);
    }

    public static l a(l lVar, xi0.b bVar, xi0.b bVar2, SourcePocket sourcePocket, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, d1h.g gVar, boolean z, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            bVar = lVar.f109489a;
        }
        xi0.b bVar3 = bVar;
        xi0.b bVar4 = (i & 2) != 0 ? lVar.f109490b : bVar2;
        SourcePocket sourcePocket2 = (i & 4) != 0 ? lVar.f109491c : sourcePocket;
        Data currencies = (i & 8) != 0 ? lVar.d : data;
        Data suggestedCurrencies = (i & 16) != 0 ? lVar.e : data2;
        Data pocketSections = (i & 32) != 0 ? lVar.f : data3;
        Data data7 = (i & 64) != 0 ? lVar.f109492g : data4;
        Data data8 = (i & 128) != 0 ? lVar.f109493h : data5;
        Data data9 = (i & 256) != 0 ? lVar.i : data6;
        d1h.g gVar2 = (i & 512) != 0 ? lVar.f109494j : gVar;
        boolean z6 = (i & 1024) != 0 ? lVar.k : z;
        boolean z11 = (i & 2048) != 0 ? lVar.f109495l : z3;
        boolean z12 = (i & 4096) != 0 ? lVar.f109496m : z4;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(suggestedCurrencies, "suggestedCurrencies");
        Intrinsics.checkNotNullParameter(pocketSections, "pocketSections");
        return new l(bVar3, bVar4, sourcePocket2, currencies, suggestedCurrencies, pocketSections, data7, data8, data9, gVar2, z6, z11, z12);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f109489a, lVar.f109489a) && Intrinsics.f(this.f109490b, lVar.f109490b) && Intrinsics.f(this.f109491c, lVar.f109491c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f109492g, lVar.f109492g) && Intrinsics.f(this.f109493h, lVar.f109493h) && Intrinsics.f(this.i, lVar.i) && Intrinsics.f(this.f109494j, lVar.f109494j) && this.k == lVar.k && this.f109495l == lVar.f109495l && this.f109496m == lVar.f109496m;
    }

    public final int hashCode() {
        xi0.b bVar = this.f109489a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        xi0.b bVar2 = this.f109490b;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        SourcePocket sourcePocket = this.f109491c;
        int iC = kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, (iHashCode2 + (sourcePocket == null ? 0 : sourcePocket.hashCode())) * 31, 31), 31), 31);
        Data data = this.f109492g;
        int iHashCode3 = (iC + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.f109493h;
        int iHashCode4 = (iHashCode3 + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.i;
        int iHashCode5 = (iHashCode4 + (data3 == null ? 0 : data3.hashCode())) * 31;
        d1h.g gVar = this.f109494j;
        return Boolean.hashCode(this.f109496m) + j6.a.c(j6.a.c((iHashCode5 + (gVar != null ? gVar.hashCode() : 0)) * 31, 31, this.k), 31, this.f109495l);
    }

    public l(xi0.b bVar, xi0.b bVar2, SourcePocket sourcePocket, Data currencies, Data suggestedCurrencies, Data pocketSections, Data data, Data data2, Data data3, d1h.g gVar, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(suggestedCurrencies, "suggestedCurrencies");
        Intrinsics.checkNotNullParameter(pocketSections, "pocketSections");
        this.f109489a = bVar;
        this.f109490b = bVar2;
        this.f109491c = sourcePocket;
        this.d = currencies;
        this.e = suggestedCurrencies;
        this.f = pocketSections;
        this.f109492g = data;
        this.f109493h = data2;
        this.i = data3;
        this.f109494j = gVar;
        this.k = z;
        this.f109495l = z3;
        this.f109496m = z4;
    }

    public /* synthetic */ l(int i, xi0.b bVar) {
        this((i & 1) != 0 ? null : bVar, null, null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, null, null, null, false, false, false);
    }
}
