package scf;

import aii.e;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuoteParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FiatExchangeOrderQuoteParams f261745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f261746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f261747c;

    public a(FiatExchangeOrderQuoteParams orderQuoteParams, TextLocalisedClause textLocalisedClause, HtmlLocalisedClause htmlLocalisedClause) {
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        this.f261745a = orderQuoteParams;
        this.f261746b = textLocalisedClause;
        this.f261747c = htmlLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f261745a, aVar.f261745a) && this.f261746b.equals(aVar.f261746b) && Intrinsics.f(this.f261747c, aVar.f261747c);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f261745a.hashCode() * 31, 31, this.f261746b);
        Clause clause = this.f261747c;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}
