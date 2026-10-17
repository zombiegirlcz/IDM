package o2j;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f221633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f221634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f221635c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f221636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f221637h;
    public final LinkedHashMap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f221638j;
    public final LinkedHashMap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f221639l;

    public i() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f221633a, iVar.f221633a) && Intrinsics.f(this.f221634b, iVar.f221634b) && Intrinsics.f(this.f221635c, iVar.f221635c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f221636g, iVar.f221636g) && Intrinsics.f(this.f221637h, iVar.f221637h) && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f221638j, iVar.f221638j) && Intrinsics.f(this.k, iVar.k) && Intrinsics.f(this.f221639l, iVar.f221639l);
    }

    public final int hashCode() {
        return this.f221639l.hashCode() + r6.b.e(this.k, r6.b.e(this.f221638j, r6.b.e(this.i, r6.b.e(this.f221637h, r6.b.e(this.f221636g, r6.b.e(this.f, r6.b.e(this.e, r6.b.e(this.d, r6.b.e(this.f221635c, r6.b.e(this.f221634b, this.f221633a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public i(int i) {
        LinkedHashMap personalAccounts = new LinkedHashMap();
        LinkedHashMap vaults = new LinkedHashMap();
        LinkedHashMap savings = new LinkedHashMap();
        LinkedHashMap creditCards = new LinkedHashMap();
        LinkedHashMap cryptoPockets = new LinkedHashMap();
        LinkedHashMap investments = new LinkedHashMap();
        LinkedHashMap commodities = new LinkedHashMap();
        LinkedHashMap revXFiatPockets = new LinkedHashMap();
        LinkedHashMap marginCollateral = new LinkedHashMap();
        LinkedHashMap futuresCollateral = new LinkedHashMap();
        LinkedHashMap revPoints = new LinkedHashMap();
        LinkedHashMap deFi = new LinkedHashMap();
        Intrinsics.checkNotNullParameter(personalAccounts, "personalAccounts");
        Intrinsics.checkNotNullParameter(vaults, "vaults");
        Intrinsics.checkNotNullParameter(savings, "savings");
        Intrinsics.checkNotNullParameter(creditCards, "creditCards");
        Intrinsics.checkNotNullParameter(cryptoPockets, "cryptoPockets");
        Intrinsics.checkNotNullParameter(investments, "investments");
        Intrinsics.checkNotNullParameter(commodities, "commodities");
        Intrinsics.checkNotNullParameter(revXFiatPockets, "revXFiatPockets");
        Intrinsics.checkNotNullParameter(marginCollateral, "marginCollateral");
        Intrinsics.checkNotNullParameter(futuresCollateral, "futuresCollateral");
        Intrinsics.checkNotNullParameter(revPoints, "revPoints");
        Intrinsics.checkNotNullParameter(deFi, "deFi");
        this.f221633a = personalAccounts;
        this.f221634b = vaults;
        this.f221635c = savings;
        this.d = creditCards;
        this.e = cryptoPockets;
        this.f = investments;
        this.f221636g = commodities;
        this.f221637h = revXFiatPockets;
        this.i = marginCollateral;
        this.f221638j = futuresCollateral;
        this.k = revPoints;
        this.f221639l = deFi;
    }
}
