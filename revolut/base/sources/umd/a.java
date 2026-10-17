package umd;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import ip0.v7;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f281279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f281280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wmd.i f281281c;
    public final AnalyticsSpendingPeriod$Interval d;
    public final lzi.h e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f281282g;

    public a(dj0.d budgetTotal, dj0.d spent, wmd.i upcoming, AnalyticsSpendingPeriod$Interval interval, lzi.h cycle, ArrayList categories, String walletId) {
        Intrinsics.checkNotNullParameter(budgetTotal, "budgetTotal");
        Intrinsics.checkNotNullParameter(spent, "spent");
        Intrinsics.checkNotNullParameter(upcoming, "upcoming");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(cycle, "cycle");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        this.f281279a = budgetTotal;
        this.f281280b = spent;
        this.f281281c = upcoming;
        this.d = interval;
        this.e = cycle;
        this.f = categories;
        this.f281282g = walletId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f281279a.equals(aVar.f281279a) && this.f281280b.equals(aVar.f281280b) && Intrinsics.f(this.f281281c, aVar.f281281c) && this.d.equals(aVar.d) && Intrinsics.f(this.e, aVar.e) && this.f.equals(aVar.f) && Intrinsics.f(this.f281282g, aVar.f281282g);
    }

    public final int hashCode() {
        return this.f281282g.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((this.f281281c.hashCode() + v7.c(this.f281279a.hashCode() * 31, 31, this.f281280b)) * 31)) * 31)) * 31, 31);
    }
}
