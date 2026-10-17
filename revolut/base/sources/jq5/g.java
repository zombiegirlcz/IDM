package jq5;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FiatCryptoMoney f177474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FiatCryptoMoney f177475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f177476c;
    public final int d;
    public final Clause e;

    public g(FiatCryptoMoney usage, FiatCryptoMoney limit, int i, int i2, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(usage, "usage");
        Intrinsics.checkNotNullParameter(limit, "limit");
        this.f177474a = usage;
        this.f177475b = limit;
        this.f177476c = i;
        this.d = i2;
        this.e = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f177474a, gVar.f177474a) && Intrinsics.f(this.f177475b, gVar.f177475b) && this.f177476c == gVar.f177476c && this.d == gVar.d && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.d, j6.a.b(this.f177476c, (this.f177475b.hashCode() + (this.f177474a.hashCode() * 31)) * 31, 31), 31);
        Clause clause = this.e;
        return iB + (clause == null ? 0 : clause.hashCode());
    }
}
