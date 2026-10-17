package eii;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.m f126647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f126648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f126649c;
    public final AnalyticsProduct d;
    public final AnalyticsContext e;

    public c(lw0.m mVar, aw0.i iVar, List items, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f126647a = mVar;
        this.f126648b = iVar;
        this.f126649c = items;
        this.d = analyticsProduct;
        this.e = analyticsContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f126647a, cVar.f126647a) && Intrinsics.f(this.f126648b, cVar.f126648b) && Intrinsics.f(this.f126649c, cVar.f126649c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        lw0.m mVar = this.f126647a;
        int iHashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
        aw0.i iVar = this.f126648b;
        int iA = h30.l.a(p.a.d((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31, 31, this.f126649c), 31, this.d);
        AnalyticsContext analyticsContext = this.e;
        return iA + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }
}
