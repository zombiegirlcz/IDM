package grd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.SmartEstimationAccess;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vzi.b f145982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f145983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f145984c;
    public final Map d;
    public final Map e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f145985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f145986h;
    public final Set i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f145987j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f145988l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SmartEstimationAccess f145989m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set f145990n;
    public final Set o;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(vzi.b bVar, ArrayList arrayList, xi0.b bVar2, Map map, Map map2, Map map3, String str, String str2, boolean z, boolean z3) {
        h0 h0Var = h0.f322473a;
        this(bVar, arrayList, bVar2, map, map2, map3, str, str2, h0Var, h0Var, z, z3, null, h0Var, h0Var);
    }

    public static a a(a aVar, xi0.b bVar, Map map, Map map2, String str, LinkedHashSet linkedHashSet, Set set, boolean z, SmartEstimationAccess smartEstimationAccess, Set set2, Set set3, int i) {
        vzi.b category = aVar.f145982a;
        List fieldDefinitions = aVar.f145983b;
        xi0.b currency = (i & 4) != 0 ? aVar.f145984c : bVar;
        Map refreshAttributes = (i & 8) != 0 ? aVar.d : map;
        Map nonRefreshAttributes = (i & 16) != 0 ? aVar.e : map2;
        Map originalAttributes = aVar.f;
        String idempotencyKey = aVar.f145985g;
        String str2 = (i & 128) != 0 ? aVar.f145986h : str;
        Set focusedOnceFieldIds = (i & 256) != 0 ? aVar.i : linkedHashSet;
        Set touchedFieldIds = (i & 512) != 0 ? aVar.f145987j : set;
        boolean z3 = (i & 1024) != 0 ? aVar.k : z;
        boolean z4 = aVar.f145988l;
        SmartEstimationAccess smartEstimationAccess2 = (i & 4096) != 0 ? aVar.f145989m : smartEstimationAccess;
        Set mileCountries = (i & 8192) != 0 ? aVar.f145990n : set2;
        Set squareFootCountries = (i & 16384) != 0 ? aVar.o : set3;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(fieldDefinitions, "fieldDefinitions");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(refreshAttributes, "refreshAttributes");
        Intrinsics.checkNotNullParameter(nonRefreshAttributes, "nonRefreshAttributes");
        Intrinsics.checkNotNullParameter(originalAttributes, "originalAttributes");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(focusedOnceFieldIds, "focusedOnceFieldIds");
        Intrinsics.checkNotNullParameter(touchedFieldIds, "touchedFieldIds");
        Intrinsics.checkNotNullParameter(mileCountries, "mileCountries");
        Intrinsics.checkNotNullParameter(squareFootCountries, "squareFootCountries");
        return new a(category, fieldDefinitions, currency, refreshAttributes, nonRefreshAttributes, originalAttributes, idempotencyKey, str2, focusedOnceFieldIds, touchedFieldIds, z3, z4, smartEstimationAccess2, mileCountries, squareFootCountries);
    }

    public final LinkedHashMap c() {
        return r0.p(this.d, this.e);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f145982a == aVar.f145982a && Intrinsics.f(this.f145983b, aVar.f145983b) && Intrinsics.f(this.f145984c, aVar.f145984c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f145985g, aVar.f145985g) && Intrinsics.f(this.f145986h, aVar.f145986h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f145987j, aVar.f145987j) && this.k == aVar.k && this.f145988l == aVar.f145988l && Intrinsics.f(this.f145989m, aVar.f145989m) && Intrinsics.f(this.f145990n, aVar.f145990n) && Intrinsics.f(this.o, aVar.o);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.e(p.a.e(p.a.e(h30.l.j(this.f145984c, p.a.d(this.f145982a.hashCode() * 31, 31, this.f145983b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.f145985g);
        String str = this.f145986h;
        int iC2 = j6.a.c(j6.a.c(p.a.f(p.a.f((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.i), 31, this.f145987j), 31, this.k), 31, this.f145988l);
        SmartEstimationAccess smartEstimationAccess = this.f145989m;
        return this.o.hashCode() + p.a.f((iC2 + (smartEstimationAccess != null ? smartEstimationAccess.hashCode() : 0)) * 31, 31, this.f145990n);
    }

    public a(vzi.b category, List fieldDefinitions, xi0.b currency, Map refreshAttributes, Map nonRefreshAttributes, Map originalAttributes, String idempotencyKey, String str, Set focusedOnceFieldIds, Set touchedFieldIds, boolean z, boolean z3, SmartEstimationAccess smartEstimationAccess, Set mileCountries, Set squareFootCountries) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(fieldDefinitions, "fieldDefinitions");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(refreshAttributes, "refreshAttributes");
        Intrinsics.checkNotNullParameter(nonRefreshAttributes, "nonRefreshAttributes");
        Intrinsics.checkNotNullParameter(originalAttributes, "originalAttributes");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(focusedOnceFieldIds, "focusedOnceFieldIds");
        Intrinsics.checkNotNullParameter(touchedFieldIds, "touchedFieldIds");
        Intrinsics.checkNotNullParameter(mileCountries, "mileCountries");
        Intrinsics.checkNotNullParameter(squareFootCountries, "squareFootCountries");
        this.f145982a = category;
        this.f145983b = fieldDefinitions;
        this.f145984c = currency;
        this.d = refreshAttributes;
        this.e = nonRefreshAttributes;
        this.f = originalAttributes;
        this.f145985g = idempotencyKey;
        this.f145986h = str;
        this.i = focusedOnceFieldIds;
        this.f145987j = touchedFieldIds;
        this.k = z;
        this.f145988l = z3;
        this.f145989m = smartEstimationAccess;
        this.f145990n = mileCountries;
        this.o = squareFootCountries;
    }
}
