package dii;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f115062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f115063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct f115064c;
    public final AnalyticsContext d;
    public final j e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(lw0.a header, aw0.i iVar, AnalyticsProduct.Retail analyticsProduct, AnalyticsContext analyticsContext, Clause clause) {
        this(header, iVar, analyticsProduct, analyticsContext, clause != null ? new i(clause) : null);
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f115062a, aVar.f115062a) && Intrinsics.f(this.f115063b, aVar.f115063b) && Intrinsics.f(this.f115064c, aVar.f115064c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f115062a.hashCode() * 31;
        aw0.i iVar = this.f115063b;
        int iA = h30.l.a((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31, 31, this.f115064c);
        AnalyticsContext analyticsContext = this.d;
        int iA2 = (iA + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31;
        j jVar = this.e;
        return iA2 + (jVar != null ? jVar.hashCode() : 0);
    }

    public a(lw0.a header, aw0.i iVar, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, j jVar) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f115062a = header;
        this.f115063b = iVar;
        this.f115064c = analyticsProduct;
        this.d = analyticsContext;
        this.e = jVar;
    }

    public /* synthetic */ a(lw0.a aVar, aw0.i iVar, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, j jVar, int i) {
        this(aVar, iVar, analyticsProduct, (i & 8) != 0 ? null : analyticsContext, (i & 16) != 0 ? null : jVar);
    }
}
