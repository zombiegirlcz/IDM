package y7d;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f311483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f311484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f311485c;
    public final List d;
    public final AnalyticsContext e;
    public final TextLocalisedClause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f311486g;

    public r(o itemsAppearMode, boolean z, p searchField, List items, AnalyticsContext analyticsContext, TextLocalisedClause textLocalisedClause, long j2) {
        Intrinsics.checkNotNullParameter(itemsAppearMode, "itemsAppearMode");
        Intrinsics.checkNotNullParameter(searchField, "searchField");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f311483a = itemsAppearMode;
        this.f311484b = z;
        this.f311485c = searchField;
        this.d = items;
        this.e = analyticsContext;
        this.f = textLocalisedClause;
        this.f311486g = j2;
    }

    @Override // jki.m
    public final jki.o b(jki.m oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof r)) {
            return null;
        }
        r rVar = (r) oldState;
        return new m(this.f311483a != rVar.f311483a, this.f311486g != rVar.f311486g, !Intrinsics.f(this.f311485c, rVar.f311485c));
    }

    @Override // jki.n
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f311483a == rVar.f311483a && this.f311484b == rVar.f311484b && this.f311485c.equals(rVar.f311485c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && this.f.equals(rVar.f) && this.f311486g == rVar.f311486g;
    }

    public final int hashCode() {
        int iD = p.a.d((this.f311485c.hashCode() + j6.a.c(this.f311483a.hashCode() * 31, 31, this.f311484b)) * 31, 31, this.d);
        AnalyticsContext analyticsContext = this.e;
        return Long.hashCode(this.f311486g) + t61.a.a((iD + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31, 31, this.f);
    }
}
