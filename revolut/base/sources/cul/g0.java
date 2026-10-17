package cul;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f109105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f109106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f109107c;
    public final List d;
    public final List e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnalyticsContext f109108g;

    public g0(f0 toolbar, d0 nextButton, e0 e0Var, List keyboardSuggestions, List items, Clause clause, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        Intrinsics.checkNotNullParameter(keyboardSuggestions, "keyboardSuggestions");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f109105a = toolbar;
        this.f109106b = nextButton;
        this.f109107c = e0Var;
        this.d = keyboardSuggestions;
        this.e = items;
        this.f = clause;
        this.f109108g = analyticsContext;
    }

    @Override // cli.p
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f109105a, g0Var.f109105a) && Intrinsics.f(this.f109106b, g0Var.f109106b) && Intrinsics.f(this.f109107c, g0Var.f109107c) && Intrinsics.f(this.d, g0Var.d) && Intrinsics.f(this.e, g0Var.e) && Intrinsics.f(this.f, g0Var.f) && Intrinsics.f(this.f109108g, g0Var.f109108g);
    }

    public final int hashCode() {
        int iHashCode = (this.f109106b.hashCode() + (this.f109105a.hashCode() * 31)) * 31;
        e0 e0Var = this.f109107c;
        int iD = p.a.d(p.a.d((iHashCode + (e0Var == null ? 0 : e0Var.hashCode())) * 31, 31, this.d), 31, this.e);
        Clause clause = this.f;
        int iHashCode2 = (iD + (clause == null ? 0 : clause.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.f109108g;
        return iHashCode2 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }
}
