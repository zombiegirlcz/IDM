package uad;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001c\u0010 \u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004¨\u0006$"}, d2 = {"Luad/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getProduct", "product", "", "b", "Ljava/util/List;", "getStates", "()Ljava/util/List;", "states", "c", "getCurrencies", "currencies", "", "d", "Ljava/lang/Long;", "getFrom", "()Ljava/lang/Long;", "from", "e", "getTo", "to", "f", "getFromAmount", "fromAmount", "g", "getToAmount", "toAmount", "h", "getSearchText", "searchText", "feature_shared_order_initiation_page_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("product")
    @NotNull
    private final String product;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("states")
    @NotNull
    private final List<String> states;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("currencies")
    @NotNull
    private final List<String> currencies;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("from")
    private final Long from;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("to")
    private final Long to;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("fromAmount")
    private final Long fromAmount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("toAmount")
    private final Long toAmount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("searchText")
    private final String searchText;

    public e(String product, ArrayList states, ArrayList currencies, Long l2, Long l3, Long l4, Long l5, String str) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        this.product = product;
        this.states = states;
        this.currencies = currencies;
        this.from = l2;
        this.to = l3;
        this.fromAmount = l4;
        this.toAmount = l5;
        this.searchText = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.product, eVar.product) && Intrinsics.f(this.states, eVar.states) && Intrinsics.f(this.currencies, eVar.currencies) && Intrinsics.f(this.from, eVar.from) && Intrinsics.f(this.to, eVar.to) && Intrinsics.f(this.fromAmount, eVar.fromAmount) && Intrinsics.f(this.toAmount, eVar.toAmount) && Intrinsics.f(this.searchText, eVar.searchText);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(this.product.hashCode() * 31, 31, this.states), 31, this.currencies);
        Long l2 = this.from;
        int iHashCode = (iD + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.to;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.fromAmount;
        int iHashCode3 = (iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.toAmount;
        int iHashCode4 = (iHashCode3 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str = this.searchText;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }
}
