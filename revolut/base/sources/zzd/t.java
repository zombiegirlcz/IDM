package zzd;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f326693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f326694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f326695c;
    public final r d;
    public final boolean e;
    public final AnalyticsContext f;

    public t(TextClause textClause, TextClause textClause2, List items, r rVar, boolean z, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f326693a = textClause;
        this.f326694b = textClause2;
        this.f326695c = items;
        this.d = rVar;
        this.e = z;
        this.f = analyticsContext;
    }

    @Override // cli.p
    public final List c() {
        return this.f326695c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f326693a, tVar.f326693a) && Intrinsics.f(this.f326694b, tVar.f326694b) && Intrinsics.f(this.f326695c, tVar.f326695c) && Intrinsics.f(this.d, tVar.d) && this.e == tVar.e && Intrinsics.f(this.f, tVar.f);
    }

    public final int hashCode() {
        Clause clause = this.f326693a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f326694b;
        int iD = p.a.d((iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.f326695c);
        r rVar = this.d;
        int iC = j6.a.c((iD + (rVar == null ? 0 : rVar.hashCode())) * 31, 31, this.e);
        AnalyticsContext analyticsContext = this.f;
        return iC + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }

    public /* synthetic */ t(List list, boolean z, AnalyticsContext analyticsContext) {
        this(null, null, list, null, z, analyticsContext);
    }
}
