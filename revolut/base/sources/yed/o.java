package yed;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FavouritesAssetDetails f312875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f312876c;
    public final String d;
    public final BigDecimal e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f312877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f312878h;
    public final BigDecimal i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mgd.f f312879j;
    public final mgd.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f312880l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f312881m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f312882n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AlertItem f312883p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mgd.e f312884q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f312885r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Data f312886s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n f312887t;

    public o(String id10, FavouritesAssetDetails fromAsset, String str, String amountString, BigDecimal bigDecimal, boolean z, boolean z3, boolean z4, BigDecimal targetRate, mgd.f alertType, mgd.b frequency, List existingAlerts, boolean z6, String note, boolean z11, AlertItem alertItem, mgd.e timeRange, boolean z12, Data data, n nVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(fromAsset, "fromAsset");
        Intrinsics.checkNotNullParameter(amountString, "amountString");
        Intrinsics.checkNotNullParameter(targetRate, "targetRate");
        Intrinsics.checkNotNullParameter(alertType, "alertType");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(existingAlerts, "existingAlerts");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(timeRange, "timeRange");
        this.f312874a = id10;
        this.f312875b = fromAsset;
        this.f312876c = str;
        this.d = amountString;
        this.e = bigDecimal;
        this.f = z;
        this.f312877g = z3;
        this.f312878h = z4;
        this.i = targetRate;
        this.f312879j = alertType;
        this.k = frequency;
        this.f312880l = existingAlerts;
        this.f312881m = z6;
        this.f312882n = note;
        this.o = z11;
        this.f312883p = alertItem;
        this.f312884q = timeRange;
        this.f312885r = z12;
        this.f312886s = data;
        this.f312887t = nVar;
    }

    public static o a(o oVar, String str, String str2, String str3, BigDecimal bigDecimal, boolean z, boolean z3, BigDecimal bigDecimal2, mgd.f fVar, mgd.b bVar, List list, boolean z4, String str4, boolean z6, mgd.e eVar, Data data, n nVar, int i) {
        String id10 = (i & 1) != 0 ? oVar.f312874a : str;
        FavouritesAssetDetails fromAsset = oVar.f312875b;
        String str5 = (i & 4) != 0 ? oVar.f312876c : str2;
        String amountString = (i & 8) != 0 ? oVar.d : str3;
        BigDecimal bigDecimal3 = (i & 16) != 0 ? oVar.e : bigDecimal;
        boolean z11 = (i & 32) != 0 ? oVar.f : z;
        boolean z12 = (i & 64) != 0 ? oVar.f312877g : z3;
        boolean z29 = oVar.f312878h;
        BigDecimal targetRate = (i & 256) != 0 ? oVar.i : bigDecimal2;
        mgd.f alertType = (i & 512) != 0 ? oVar.f312879j : fVar;
        mgd.b frequency = (i & 1024) != 0 ? oVar.k : bVar;
        List existingAlerts = (i & 2048) != 0 ? oVar.f312880l : list;
        boolean z31 = (i & 4096) != 0 ? oVar.f312881m : z4;
        String note = (i & 8192) != 0 ? oVar.f312882n : str4;
        boolean z41 = (i & 16384) != 0 ? oVar.o : z6;
        AlertItem alertItem = oVar.f312883p;
        mgd.e timeRange = (i & 65536) != 0 ? oVar.f312884q : eVar;
        boolean z49 = oVar.f312885r;
        Data data2 = (i & 262144) != 0 ? oVar.f312886s : data;
        n nVar2 = (i & 524288) != 0 ? oVar.f312887t : nVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(fromAsset, "fromAsset");
        Intrinsics.checkNotNullParameter(amountString, "amountString");
        Intrinsics.checkNotNullParameter(targetRate, "targetRate");
        Intrinsics.checkNotNullParameter(alertType, "alertType");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(existingAlerts, "existingAlerts");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(timeRange, "timeRange");
        return new o(id10, fromAsset, str5, amountString, bigDecimal3, z11, z12, z29, targetRate, alertType, frequency, existingAlerts, z31, note, z41, alertItem, timeRange, z49, data2, nVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f312874a, oVar.f312874a) && Intrinsics.f(this.f312875b, oVar.f312875b) && Intrinsics.f(this.f312876c, oVar.f312876c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && this.f == oVar.f && this.f312877g == oVar.f312877g && this.f312878h == oVar.f312878h && Intrinsics.f(this.i, oVar.i) && this.f312879j == oVar.f312879j && this.k == oVar.k && Intrinsics.f(this.f312880l, oVar.f312880l) && this.f312881m == oVar.f312881m && Intrinsics.f(this.f312882n, oVar.f312882n) && this.o == oVar.o && Intrinsics.f(this.f312883p, oVar.f312883p) && this.f312884q == oVar.f312884q && this.f312885r == oVar.f312885r && Intrinsics.f(this.f312886s, oVar.f312886s) && Intrinsics.f(this.f312887t, oVar.f312887t);
    }

    public final int hashCode() {
        int iHashCode = (this.f312875b.hashCode() + (this.f312874a.hashCode() * 31)) * 31;
        String str = this.f312876c;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        BigDecimal bigDecimal = this.e;
        int iC2 = j6.a.c(p.a.c(j6.a.c(p.a.d((this.k.hashCode() + ((this.f312879j.hashCode() + t61.a.d(this.i, j6.a.c(j6.a.c(j6.a.c((iC + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31, 31, this.f), 31, this.f312877g), 31, this.f312878h), 31)) * 31)) * 31, 31, this.f312880l), 31, this.f312881m), 31, this.f312882n), 31, this.o);
        AlertItem alertItem = this.f312883p;
        int iC3 = j6.a.c((this.f312884q.hashCode() + ((iC2 + (alertItem == null ? 0 : alertItem.hashCode())) * 31)) * 31, 31, this.f312885r);
        Data data = this.f312886s;
        int iHashCode2 = (iC3 + (data == null ? 0 : data.hashCode())) * 31;
        n nVar = this.f312887t;
        return iHashCode2 + (nVar != null ? nVar.hashCode() : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(String str, FavouritesAssetDetails favouritesAssetDetails, String str2, String str3, boolean z, BigDecimal bigDecimal, mgd.f fVar, mgd.b bVar, String str4, AlertItem alertItem, mgd.e eVar, boolean z3, int i) {
        BigDecimal bigDecimal2;
        String str5;
        if ((i & 256) != 0) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            bigDecimal2 = ZERO;
        } else {
            bigDecimal2 = bigDecimal;
        }
        mgd.b bVar2 = (i & 1024) != 0 ? mgd.b.ONE_TIME : bVar;
        zhm.f0 f0Var = zhm.f0.f322471a;
        if ((i & 8192) != 0) {
            m70.a.c(t0.f186434a);
            str5 = "";
        } else {
            str5 = str4;
        }
        this(str, favouritesAssetDetails, str2, str3, null, false, false, z, bigDecimal2, fVar, bVar2, f0Var, false, str5, true, (32768 & i) != 0 ? null : alertItem, (i & 65536) != 0 ? mgd.e.ONE_DAY : eVar, z3, null, null);
    }
}
