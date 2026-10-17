package oyd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, d2 = {"Loyd/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getFrom", "from", "b", "getTo", "to", "", "c", "Ljava/util/List;", "getCurrencies", "()Ljava/util/List;", "currencies", "d", "getExcludeTransactionIds", "excludeTransactionIds", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("from")
    @NotNull
    private final String from;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("to")
    @NotNull
    private final String to;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("currencies")
    @NotNull
    private final List<String> currencies;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("excludeTransactionIds")
    private final List<String> excludeTransactionIds;

    public e(String from, String to6, ArrayList currencies, List list) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        this.from = from;
        this.to = to6;
        this.currencies = currencies;
        this.excludeTransactionIds = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.from, eVar.from) && Intrinsics.f(this.to, eVar.to) && Intrinsics.f(this.currencies, eVar.currencies) && Intrinsics.f(this.excludeTransactionIds, eVar.excludeTransactionIds);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.from.hashCode() * 31, 31, this.to), 31, this.currencies);
        List<String> list = this.excludeTransactionIds;
        return iD + (list == null ? 0 : list.hashCode());
    }
}
