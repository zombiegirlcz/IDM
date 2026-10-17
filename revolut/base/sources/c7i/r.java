package c7i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f22022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22024c;
    public final f d;
    public final OrderQuote e;
    public final WalletAutomation.Limit f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h7i.p f22025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f22026h;
    public final Clause i;

    public r(Data accountData, long j2, long j3, f rule, OrderQuote orderQuote, WalletAutomation.Limit limit, h7i.p recurringPaymentContext, List errors, Clause clause) {
        Intrinsics.checkNotNullParameter(accountData, "accountData");
        Intrinsics.checkNotNullParameter(rule, "rule");
        Intrinsics.checkNotNullParameter(recurringPaymentContext, "recurringPaymentContext");
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.f22022a = accountData;
        this.f22023b = j2;
        this.f22024c = j3;
        this.d = rule;
        this.e = orderQuote;
        this.f = limit;
        this.f22025g = recurringPaymentContext;
        this.f22026h = errors;
        this.i = clause;
    }

    public static r a(r rVar, Data data, long j2, long j3, f fVar, OrderQuote orderQuote, WalletAutomation.Limit limit, h7i.p pVar, List list, Clause clause, int i) {
        if ((i & 1) != 0) {
            data = rVar.f22022a;
        }
        Data accountData = data;
        if ((i & 2) != 0) {
            j2 = rVar.f22023b;
        }
        long j5 = j2;
        long j16 = (i & 4) != 0 ? rVar.f22024c : j3;
        f rule = (i & 8) != 0 ? rVar.d : fVar;
        OrderQuote orderQuote2 = (i & 16) != 0 ? rVar.e : orderQuote;
        WalletAutomation.Limit limit2 = (i & 32) != 0 ? rVar.f : limit;
        h7i.p recurringPaymentContext = (i & 64) != 0 ? rVar.f22025g : pVar;
        List errors = (i & 128) != 0 ? rVar.f22026h : list;
        Clause clause2 = (i & 256) != 0 ? rVar.i : clause;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(accountData, "accountData");
        Intrinsics.checkNotNullParameter(rule, "rule");
        Intrinsics.checkNotNullParameter(recurringPaymentContext, "recurringPaymentContext");
        Intrinsics.checkNotNullParameter(errors, "errors");
        return new r(accountData, j5, j16, rule, orderQuote2, limit2, recurringPaymentContext, errors, clause2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f22022a, rVar.f22022a) && this.f22023b == rVar.f22023b && this.f22024c == rVar.f22024c && this.d == rVar.d && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f) && Intrinsics.f(this.f22025g, rVar.f22025g) && Intrinsics.f(this.f22026h, rVar.f22026h) && Intrinsics.f(this.i, rVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + a0.d.c(a0.d.c(this.f22022a.hashCode() * 31, 31, this.f22023b), 31, this.f22024c)) * 31;
        OrderQuote orderQuote = this.e;
        int iHashCode2 = (iHashCode + (orderQuote == null ? 0 : orderQuote.hashCode())) * 31;
        WalletAutomation.Limit limit = this.f;
        int iD = p.a.d((this.f22025g.hashCode() + ((iHashCode2 + (limit == null ? 0 : limit.hashCode())) * 31)) * 31, 31, this.f22026h);
        Clause clause = this.i;
        return iD + (clause != null ? clause.hashCode() : 0);
    }
}
