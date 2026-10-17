package alc;

import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xdh.c f6208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6209c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f6210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6211h;
    public final xi0.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f6212j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dj0.d f6213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dj0.d f6214m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final PortfolioGoal f6215n;

    public n(String portfolioId, xdh.c state, String str, String str2, String str3, String str4, LocalDate canChangeTemplateSince, String str5, xi0.b baseCurrency, List ongoingRebalanceTypes, boolean z, dj0.d dVar, dj0.d dVar2, PortfolioGoal portfolioGoal) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(canChangeTemplateSince, "canChangeTemplateSince");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(ongoingRebalanceTypes, "ongoingRebalanceTypes");
        this.f6207a = portfolioId;
        this.f6208b = state;
        this.f6209c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.f6210g = canChangeTemplateSince;
        this.f6211h = str5;
        this.i = baseCurrency;
        this.f6212j = ongoingRebalanceTypes;
        this.k = z;
        this.f6213l = dVar;
        this.f6214m = dVar2;
        this.f6215n = portfolioGoal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f6207a, nVar.f6207a) && this.f6208b == nVar.f6208b && Intrinsics.f(this.f6209c, nVar.f6209c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && Intrinsics.f(this.f6210g, nVar.f6210g) && Intrinsics.f(this.f6211h, nVar.f6211h) && Intrinsics.f(this.i, nVar.i) && Intrinsics.f(this.f6212j, nVar.f6212j) && this.k == nVar.k && Intrinsics.f(this.f6213l, nVar.f6213l) && Intrinsics.f(this.f6214m, nVar.f6214m) && Intrinsics.f(this.f6215n, nVar.f6215n);
    }

    public final int hashCode() {
        int iHashCode = (this.f6208b.hashCode() + (this.f6207a.hashCode() * 31)) * 31;
        String str = this.f6209c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iA = y.a((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f6210g);
        String str5 = this.f6211h;
        int iC = j6.a.c(p.a.d(h30.l.j(this.i, (iA + (str5 == null ? 0 : str5.hashCode())) * 31, 31), 31, this.f6212j), 31, this.k);
        dj0.d dVar = this.f6213l;
        int iHashCode5 = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f6214m;
        int iHashCode6 = (iHashCode5 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        PortfolioGoal portfolioGoal = this.f6215n;
        return iHashCode6 + (portfolioGoal != null ? portfolioGoal.hashCode() : 0);
    }
}
