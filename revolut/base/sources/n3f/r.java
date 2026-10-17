package n3f;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0006\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0014"}, d2 = {"Ln3f/r;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "startedAt", "b", "Ljava/lang/String;", "d", "symbol", "", "Ljava/util/List;", "()Ljava/util/List;", "allLinkedSymbols", "eventId", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("startedAt")
    private final Long startedAt;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("symbol")
    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("allLinkedSymbols")
    @NotNull
    private final List<String> allLinkedSymbols;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("eventId")
    private final String eventId;

    public r(Long l2, String symbol, List allLinkedSymbols, String str) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(allLinkedSymbols, "allLinkedSymbols");
        this.startedAt = l2;
        this.symbol = symbol;
        this.allLinkedSymbols = allLinkedSymbols;
        this.eventId = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAllLinkedSymbols() {
        return this.allLinkedSymbols;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getStartedAt() {
        return this.startedAt;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.startedAt, rVar.startedAt) && Intrinsics.f(this.symbol, rVar.symbol) && Intrinsics.f(this.allLinkedSymbols, rVar.allLinkedSymbols) && Intrinsics.f(this.eventId, rVar.eventId);
    }

    public final int hashCode() {
        Long l2 = this.startedAt;
        int iD = p.a.d(p.a.c((l2 == null ? 0 : l2.hashCode()) * 31, 31, this.symbol), 31, this.allLinkedSymbols);
        String str = this.eventId;
        return iD + (str != null ? str.hashCode() : 0);
    }
}
