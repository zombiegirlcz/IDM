package s7a;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f260647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f260648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f260649c;
    public final w d;
    public final List e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f260650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f260651h;
    public final Clause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f260652j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f260653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f260654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AnalyticsProduct f260655n;
    public final AnalyticsContext o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v f260656p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f260657q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AnalyticsContext f260658r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Integer f260659s;

    public x(t headerMode, Object obj2, boolean z, w searchVisibilityConfig, List list, boolean z3, boolean z4, boolean z6, Clause clause, Set preSelectedModelIds, boolean z11, boolean z12, boolean z29, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, v noResultsFoundConfig, boolean z31, AnalyticsContext analyticsContext2, Integer num) {
        Intrinsics.checkNotNullParameter(headerMode, "headerMode");
        Intrinsics.checkNotNullParameter(searchVisibilityConfig, "searchVisibilityConfig");
        Intrinsics.checkNotNullParameter(preSelectedModelIds, "preSelectedModelIds");
        Intrinsics.checkNotNullParameter(noResultsFoundConfig, "noResultsFoundConfig");
        this.f260647a = headerMode;
        this.f260648b = obj2;
        this.f260649c = z;
        this.d = searchVisibilityConfig;
        this.e = list;
        this.f = z3;
        this.f260650g = z4;
        this.f260651h = z6;
        this.i = clause;
        this.f260652j = preSelectedModelIds;
        this.k = z11;
        this.f260653l = z12;
        this.f260654m = z29;
        this.f260655n = analyticsProduct;
        this.o = analyticsContext;
        this.f260656p = noResultsFoundConfig;
        this.f260657q = z31;
        this.f260658r = analyticsContext2;
        this.f260659s = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f260647a, xVar.f260647a) && Intrinsics.f(this.f260648b, xVar.f260648b) && this.f260649c == xVar.f260649c && this.d == xVar.d && Intrinsics.f(this.e, xVar.e) && this.f == xVar.f && this.f260650g == xVar.f260650g && this.f260651h == xVar.f260651h && Intrinsics.f(this.i, xVar.i) && Intrinsics.f(this.f260652j, xVar.f260652j) && this.k == xVar.k && this.f260653l == xVar.f260653l && this.f260654m == xVar.f260654m && Intrinsics.f(this.f260655n, xVar.f260655n) && Intrinsics.f(this.o, xVar.o) && Intrinsics.f(this.f260656p, xVar.f260656p) && this.f260657q == xVar.f260657q && Intrinsics.f(this.f260658r, xVar.f260658r) && Intrinsics.f(this.f260659s, xVar.f260659s);
    }

    public final int hashCode() {
        int iHashCode = this.f260647a.hashCode() * 31;
        Object obj2 = this.f260648b;
        int iHashCode2 = (this.d.hashCode() + j6.a.c((iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31, this.f260649c)) * 31;
        List list = this.e;
        int iC = j6.a.c(j6.a.c(j6.a.c((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f), 31, this.f260650g), 31, this.f260651h);
        Clause clause = this.i;
        int iC2 = j6.a.c(j6.a.c(j6.a.c(p.a.f(j6.a.c((iC + (clause == null ? 0 : clause.hashCode())) * 31, 31, false), 31, this.f260652j), 31, this.k), 31, this.f260653l), 31, this.f260654m);
        AnalyticsProduct analyticsProduct = this.f260655n;
        int iHashCode3 = (iC2 + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.o;
        int iC3 = j6.a.c((this.f260656p.hashCode() + ((iHashCode3 + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31)) * 31, 31, this.f260657q);
        AnalyticsContext analyticsContext2 = this.f260658r;
        int iA = (iC3 + (analyticsContext2 == null ? 0 : AnalyticsContext.a(analyticsContext2.f50296a))) * 31;
        Integer num = this.f260659s;
        return iA + (num != null ? num.hashCode() : 0);
    }

    public x(t tVar, Object obj2, w wVar, Set set, int i) {
        this(tVar, obj2, false, (i & 8) != 0 ? w.SHOWN : wVar, null, (i & 32) == 0, false, false, null, set, (i & 2048) != 0, false, false, null, null, new v(15, null, null), false, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(Clause clause, Object obj2, Clause clause2, Clause clause3, boolean z, w wVar, Clause clause4, TextLocalisedClause textLocalisedClause, List list, boolean z3, TextLocalisedClause textLocalisedClause2, String str, Set set, aim.e eVar, boolean z4, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, v vVar, AnalyticsContext analyticsContext2, Integer num, int i) {
        Object obj3;
        boolean z6;
        Integer num2;
        v noResultsFoundConfig;
        Object obj4 = (i & 2) != 0 ? null : obj2;
        boolean z11 = (i & 4) == 0;
        Clause clause5 = (i & 8) != 0 ? null : clause2;
        Clause clause6 = (i & 32) != 0 ? null : clause3;
        boolean z12 = (i & 128) != 0 ? true : z;
        w searchVisibilityConfig = (i & 256) != 0 ? w.SHOWN : wVar;
        Clause clause7 = (i & 512) != 0 ? null : clause4;
        TextLocalisedClause textLocalisedClause3 = (i & 1024) != 0 ? null : textLocalisedClause;
        List list2 = (i & 2048) != 0 ? null : list;
        boolean z29 = (i & 4096) != 0 ? false : z3;
        boolean z31 = (i & 16384) == 0;
        TextLocalisedClause textLocalisedClause4 = (32768 & i) != 0 ? null : textLocalisedClause2;
        String str2 = (i & 131072) != 0 ? null : str;
        Set preSelectedModelIds = (i & 262144) != 0 ? zhm.h0.f322473a : set;
        boolean z41 = (i & PKIFailureInfo.badCertTemplate) == 0;
        List menuItems = (i & PKIFailureInfo.badSenderNonce) != 0 ? zhm.f0.f322471a : eVar;
        boolean z49 = (i & 4194304) == 0;
        boolean z54 = (i & 8388608) != 0 ? false : z4;
        tx0.j0 headerTitleMode = tx0.j0.MULTILINE;
        AnalyticsProduct analyticsProduct2 = (i & 33554432) != 0 ? null : analyticsProduct;
        AnalyticsContext analyticsContext3 = (i & 67108864) != 0 ? null : analyticsContext;
        if ((i & 134217728) != 0) {
            obj3 = obj4;
            z6 = z11;
            num2 = null;
            noResultsFoundConfig = new v(15, null, null);
        } else {
            obj3 = obj4;
            z6 = z11;
            num2 = null;
            noResultsFoundConfig = vVar;
        }
        boolean z74 = (i & 268435456) == 0;
        Object obj5 = (i & PKIFailureInfo.duplicateCertReq) != 0 ? num2 : analyticsContext2;
        num2 = (i & 1073741824) == 0 ? num : num2;
        AnalyticsContext analyticsContext4 = obj5;
        Intrinsics.checkNotNullParameter(searchVisibilityConfig, "searchVisibilityConfig");
        Intrinsics.checkNotNullParameter(preSelectedModelIds, "preSelectedModelIds");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(headerTitleMode, "headerTitleMode");
        Intrinsics.checkNotNullParameter(noResultsFoundConfig, "noResultsFoundConfig");
        this(new t(clause, z12, headerTitleMode, clause5, clause6, menuItems, clause7, textLocalisedClause3, z49), obj3, z6, searchVisibilityConfig, list2, z29, false, z31, textLocalisedClause4, preSelectedModelIds.isEmpty() ? (str2 == null || kotlin.text.d0.W(str2)) ? zhm.h0.f322473a : y0.b(str2) : preSelectedModelIds, true, z41, z54, analyticsProduct2, analyticsContext3, noResultsFoundConfig, z74, analyticsContext4, num2);
    }
}
