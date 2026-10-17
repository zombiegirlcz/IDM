package cxe;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f109962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f109963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f109964c;
    public final AnalyticsContext d;

    public q(List items, p pVar, aw0.i iVar, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f109962a = items;
        this.f109963b = pVar;
        this.f109964c = iVar;
        this.d = analyticsContext;
    }

    @Override // cli.p
    public final List c() {
        return this.f109962a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f109962a, qVar.f109962a) && Intrinsics.f(this.f109963b, qVar.f109963b) && Intrinsics.f(this.f109964c, qVar.f109964c) && Intrinsics.f(this.d, qVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f109962a.hashCode() * 31;
        p pVar = this.f109963b;
        int iHashCode2 = (iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
        aw0.i iVar = this.f109964c;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.d;
        return iHashCode3 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }
}
