package qf1;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f245219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f245220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f245221c;
    public final Clause d;
    public final AnalyticsContext e;
    public final List f;

    public k(int i, Clause title, Clause subtitle, TextLocalisedClause textLocalisedClause, AnalyticsContext analyticsContext, ArrayList arrayList, int i2) {
        textLocalisedClause = (i2 & 8) != 0 ? null : textLocalisedClause;
        analyticsContext = (i2 & 16) != 0 ? null : analyticsContext;
        List tags = arrayList;
        tags = (i2 & 32) != 0 ? f0.f322471a : tags;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f245219a = i;
        this.f245220b = title;
        this.f245221c = subtitle;
        this.d = textLocalisedClause;
        this.e = analyticsContext;
        this.f = tags;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f245219a == kVar.f245219a && Intrinsics.f(this.f245220b, kVar.f245220b) && Intrinsics.f(this.f245221c, kVar.f245221c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f);
    }

    public final int hashCode() {
        int iA = p.a.a(p.a.a(Integer.hashCode(this.f245219a) * 31, 31, this.f245220b), 31, this.f245221c);
        Clause clause = this.d;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.e;
        return this.f.hashCode() + ((iHashCode + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0)) * 31);
    }
}
