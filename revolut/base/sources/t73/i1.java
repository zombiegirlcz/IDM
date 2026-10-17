package t73;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i1 implements o10.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f268476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f268477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f268478c;
    public final boolean d;
    public final boolean e;
    public final AnalyticsContext f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final po0.n f268479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CardDetailsDesignConfig f268480h;
    public final b9.u i;

    public i1(List items, List navBarMenuItems, List bottomSheetItems, boolean z, boolean z3, AnalyticsContext analyticsContext, po0.n nVar, CardDetailsDesignConfig cardDetailsDesignConfig, b9.u uVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarMenuItems, "navBarMenuItems");
        Intrinsics.checkNotNullParameter(bottomSheetItems, "bottomSheetItems");
        this.f268476a = items;
        this.f268477b = navBarMenuItems;
        this.f268478c = bottomSheetItems;
        this.d = z;
        this.e = z3;
        this.f = analyticsContext;
        this.f268479g = nVar;
        this.f268480h = cardDetailsDesignConfig;
        this.i = uVar;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof i1)) {
            return null;
        }
        i1 i1Var = (i1) oldState;
        return new h1(!Intrinsics.f(i1Var.f268480h, this.f268480h), !Intrinsics.f(i1Var.i, this.i), !Intrinsics.f(i1Var.f268479g, this.f268479g));
    }

    @Override // cli.p
    public final List c() {
        return this.f268476a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj2;
        return Intrinsics.f(this.f268476a, i1Var.f268476a) && Intrinsics.f(this.f268477b, i1Var.f268477b) && Intrinsics.f(this.f268478c, i1Var.f268478c) && this.d == i1Var.d && this.e == i1Var.e && Intrinsics.f(this.f, i1Var.f) && Intrinsics.f(this.f268479g, i1Var.f268479g) && Intrinsics.f(this.f268480h, i1Var.f268480h) && Intrinsics.f(this.i, i1Var.i);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(p.a.d(p.a.d(this.f268476a.hashCode() * 31, 31, this.f268477b), 31, this.f268478c), 31, this.d), 31, this.e);
        AnalyticsContext analyticsContext = this.f;
        int iA = (iC + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31;
        po0.n nVar = this.f268479g;
        int iHashCode = (iA + (nVar == null ? 0 : nVar.hashCode())) * 31;
        CardDetailsDesignConfig cardDetailsDesignConfig = this.f268480h;
        int iHashCode2 = (iHashCode + (cardDetailsDesignConfig == null ? 0 : cardDetailsDesignConfig.hashCode())) * 31;
        b9.u uVar = this.i;
        return iHashCode2 + (uVar != null ? uVar.hashCode() : 0);
    }

    @Override // o10.b
    public final boolean k() {
        return this.e;
    }

    @Override // o10.b
    public final List l() {
        return this.f268478c;
    }
}
