package lk9;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f196321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f196322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f196323c;

    public q(p pVar, List items, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f196321a = pVar;
        this.f196322b = items;
        this.f196323c = analyticsContext;
    }

    @Override // jki.n
    public final List c() {
        return this.f196322b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f196321a, qVar.f196321a) && Intrinsics.f(this.f196322b, qVar.f196322b) && Intrinsics.f(this.f196323c, qVar.f196323c);
    }

    public final int hashCode() {
        p pVar = this.f196321a;
        int iD = p.a.d((pVar == null ? 0 : pVar.hashCode()) * 31, 31, this.f196322b);
        AnalyticsContext analyticsContext = this.f196323c;
        return iD + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }
}
