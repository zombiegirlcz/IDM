package yld;

import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f314687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f314688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f314689c;
    public final dj0.d d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f314690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f314691h;

    public a(f fVar, f fVar2, dj0.d totalSpendMoney, dj0.d regularSpendMoney, dj0.d committedSpendMoney, dj0.d forecastSpendMoney, dj0.d amountOfChangeMoney, List items) {
        Intrinsics.checkNotNullParameter(totalSpendMoney, "totalSpendMoney");
        Intrinsics.checkNotNullParameter(regularSpendMoney, "regularSpendMoney");
        Intrinsics.checkNotNullParameter(committedSpendMoney, "committedSpendMoney");
        Intrinsics.checkNotNullParameter(forecastSpendMoney, "forecastSpendMoney");
        Intrinsics.checkNotNullParameter(amountOfChangeMoney, "amountOfChangeMoney");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f314687a = fVar;
        this.f314688b = fVar2;
        this.f314689c = totalSpendMoney;
        this.d = regularSpendMoney;
        this.e = committedSpendMoney;
        this.f = forecastSpendMoney;
        this.f314690g = amountOfChangeMoney;
        this.f314691h = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f314687a, aVar.f314687a) && Intrinsics.f(this.f314688b, aVar.f314688b) && Intrinsics.f(this.f314689c, aVar.f314689c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f314690g, aVar.f314690g) && Intrinsics.f(this.f314691h, aVar.f314691h);
    }

    public final int hashCode() {
        f fVar = this.f314687a;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        f fVar2 = this.f314688b;
        return this.f314691h.hashCode() + v7.c(v7.c(v7.c(v7.c(v7.c((iHashCode + (fVar2 != null ? fVar2.hashCode() : 0)) * 31, 31, this.f314689c), 31, this.d), 31, this.e), 31, this.f), 31, this.f314690g);
    }
}
