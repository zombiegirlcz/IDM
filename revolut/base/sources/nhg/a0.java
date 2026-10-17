package nhg;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f215456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f215457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f215458c;
    public final AnalyticsContext d;

    public a0(ArrayList items, List menuItems, z searchInputUiState, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(searchInputUiState, "searchInputUiState");
        this.f215456a = items;
        this.f215457b = menuItems;
        this.f215458c = searchInputUiState;
        this.d = analyticsContext;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof a0)) {
            return null;
        }
        return new w(!Intrinsics.f(this.d, ((a0) oldState).d));
    }

    @Override // cli.p
    public final List c() {
        return this.f215456a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return this.f215456a.equals(a0Var.f215456a) && Intrinsics.f(this.f215457b, a0Var.f215457b) && this.f215458c.equals(a0Var.f215458c) && Intrinsics.f(this.d, a0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f215458c.hashCode() + p.a.d(this.f215456a.hashCode() * 31, 31, this.f215457b)) * 31;
        AnalyticsContext analyticsContext = this.d;
        return iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }
}
