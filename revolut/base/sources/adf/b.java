package adf;

import cli.j;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuoteParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FiatExchangeOrderQuoteParams f3327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f3328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f3329c;

    public b(FiatExchangeOrderQuoteParams orderQuoteParams, Data data, Clause clause) {
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        this.f3327a = orderQuoteParams;
        this.f3328b = data;
        this.f3329c = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f3327a, bVar.f3327a) && Intrinsics.f(this.f3328b, bVar.f3328b) && Intrinsics.f(this.f3329c, bVar.f3329c);
    }

    public final int hashCode() {
        int iHashCode = this.f3327a.hashCode() * 31;
        Data data = this.f3328b;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        Clause clause = this.f3329c;
        return iHashCode2 + (clause != null ? clause.hashCode() : 0);
    }
}
