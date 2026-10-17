package kye;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f190749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f190750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f190751c;
    public final boolean d;
    public final AnalyticsContext e;

    public j0(List items, TextLocalisedClause textLocalisedClause, i0 i0Var, boolean z, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f190749a = items;
        this.f190750b = textLocalisedClause;
        this.f190751c = i0Var;
        this.d = z;
        this.e = analyticsContext;
    }

    @Override // cli.p
    public final List c() {
        return this.f190749a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f190749a, j0Var.f190749a) && Intrinsics.f(this.f190750b, j0Var.f190750b) && Intrinsics.f(this.f190751c, j0Var.f190751c) && this.d == j0Var.d && Intrinsics.f(this.e, j0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f190749a.hashCode() * 31;
        Clause clause = this.f190750b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        i0 i0Var = this.f190751c;
        int iC = j6.a.c((iHashCode2 + (i0Var == null ? 0 : i0Var.hashCode())) * 31, 31, this.d);
        AnalyticsContext analyticsContext = this.e;
        return iC + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }
}
