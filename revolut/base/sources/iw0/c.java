package iw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.v7;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f168888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f168889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f168890c;
    public final TextClause d;
    public final Object e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f168891g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Image icon, Clause buy, Clause sell, TextClause amount, Clause trades, ArrayList transactions) {
        this(new f(icon), buy, sell, amount, trades, -1, transactions);
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(buy, "buy");
        Intrinsics.checkNotNullParameter(sell, "sell");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(trades, "trades");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
    }

    @Override // iw0.a
    public final h a() {
        return this.f168888a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f168888a, cVar.f168888a) && Intrinsics.f(this.f168889b, cVar.f168889b) && Intrinsics.f(this.f168890c, cVar.f168890c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && this.f == cVar.f && Intrinsics.f(this.f168891g, cVar.f168891g);
    }

    public final int hashCode() {
        return this.f168891g.hashCode() + j6.a.b(this.f, p.a.b(v7.b(p.a.b(p.a.b(this.f168888a.hashCode() * 31, 31, this.f168889b), 31, this.f168890c), 31, this.d), 31, this.e), 31);
    }

    public c(h indicatorIcon, Clause buy, Clause sell, TextClause amount, Clause trades, int i, ArrayList transactions) {
        Intrinsics.checkNotNullParameter(indicatorIcon, "indicatorIcon");
        Intrinsics.checkNotNullParameter(buy, "buy");
        Intrinsics.checkNotNullParameter(sell, "sell");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(trades, "trades");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f168888a = indicatorIcon;
        this.f168889b = buy;
        this.f168890c = sell;
        this.d = amount;
        this.e = trades;
        this.f = i;
        this.f168891g = transactions;
    }
}
