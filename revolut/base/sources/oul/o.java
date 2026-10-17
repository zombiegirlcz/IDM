package oul;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f229910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f229911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f229912c;

    public o(TextLocalisedClause textClause, boolean z, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(textClause, "textClause");
        this.f229910a = textClause;
        this.f229911b = z;
        this.f229912c = analyticsContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f229910a.equals(oVar.f229910a) && this.f229911b == oVar.f229911b && Intrinsics.f(this.f229912c, oVar.f229912c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f229910a.hashCode() * 31, 31, this.f229911b);
        AnalyticsContext analyticsContext = this.f229912c;
        return iC + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }
}
