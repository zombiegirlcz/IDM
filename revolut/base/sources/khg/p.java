package khg;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f184133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f184134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f184135c;
    public final AnalyticsContext d;
    public final aw0.i e;

    public p(List items, boolean z, j headerState, AnalyticsContext analyticsContext, aw0.e eVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        this.f184133a = items;
        this.f184134b = z;
        this.f184135c = headerState;
        this.d = analyticsContext;
        this.e = eVar;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (oldState instanceof p) {
            return new o(((p) oldState).f184134b != this.f184134b);
        }
        return null;
    }

    @Override // cli.p
    public final List c() {
        return this.f184133a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f184133a, pVar.f184133a) && this.f184134b == pVar.f184134b && Intrinsics.f(this.f184135c, pVar.f184135c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f184135c.hashCode() + j6.a.c(this.f184133a.hashCode() * 31, 31, this.f184134b)) * 31;
        AnalyticsContext analyticsContext = this.d;
        int iA = (iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31;
        aw0.i iVar = this.e;
        return iA + (iVar != null ? iVar.hashCode() : 0);
    }
}
