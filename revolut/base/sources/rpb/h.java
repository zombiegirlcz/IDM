package rpb;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f256318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f256319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f256320c;
    public final dj0.d d;
    public final o e;

    public h(g period, dj0.d totalAmount, dj0.d moneyIn, dj0.d moneyOut, o selectedSavingsAccount) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(moneyIn, "moneyIn");
        Intrinsics.checkNotNullParameter(moneyOut, "moneyOut");
        Intrinsics.checkNotNullParameter(selectedSavingsAccount, "selectedSavingsAccount");
        this.f256318a = period;
        this.f256319b = totalAmount;
        this.f256320c = moneyIn;
        this.d = moneyOut;
        this.e = selectedSavingsAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f256318a, hVar.f256318a) && Intrinsics.f(this.f256319b, hVar.f256319b) && Intrinsics.f(this.f256320c, hVar.f256320c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(v7.c(v7.c(this.f256318a.hashCode() * 31, 31, this.f256319b), 31, this.f256320c), 31, this.d);
    }
}
