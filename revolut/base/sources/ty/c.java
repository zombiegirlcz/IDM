package ty;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import h30.l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f275438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f275439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f275440c;
    public final AnalyticsProduct d;

    public c(lw0.a header, aw0.i iVar, List items, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f275438a = header;
        this.f275439b = iVar;
        this.f275440c = items;
        this.d = analyticsProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f275438a.equals(cVar.f275438a) && this.f275439b.equals(cVar.f275439b) && Intrinsics.f(this.f275440c, cVar.f275440c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return l.a(p.a.d((this.f275439b.hashCode() + (this.f275438a.hashCode() * 31)) * 31, 31, this.f275440c), 31, this.d);
    }
}
