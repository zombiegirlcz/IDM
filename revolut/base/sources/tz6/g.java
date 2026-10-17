package tz6;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f275873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f275874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f275875c;
    public final Clause d;
    public final AnalyticsContext e;
    public final boolean f;

    public g(TextLocalisedClause textLocalisedClause, boolean z, AnalyticsContext analyticsContext, TextLocalisedClause textLocalisedClause2, AnalyticsContext analyticsContext2, boolean z3) {
        this.f275873a = textLocalisedClause;
        this.f275874b = z;
        this.f275875c = analyticsContext;
        this.d = textLocalisedClause2;
        this.e = analyticsContext2;
        this.f = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f275873a.equals(gVar.f275873a) && this.f275874b == gVar.f275874b && Intrinsics.f(this.f275875c, gVar.f275875c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f == gVar.f;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f275873a.hashCode() * 31, 31, this.f275874b);
        AnalyticsContext analyticsContext = this.f275875c;
        int iA = (iC + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31;
        Clause clause = this.d;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        AnalyticsContext analyticsContext2 = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (analyticsContext2 != null ? AnalyticsContext.a(analyticsContext2.f50296a) : 0)) * 31);
    }
}
