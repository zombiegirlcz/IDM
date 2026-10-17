package w3f;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\r\u0010\u0006¨\u0006\u0017"}, d2 = {"Lw3f/t;", "Lw3f/h0;", "", "s", "Ljava/lang/String;", "t", "()Ljava/lang/String;", "clientOrderId", "", "Ljava/lang/Long;", "v", "()Ljava/lang/Long;", "startedAt", "u", "w", "symbol", "", "Ljava/util/List;", "()Ljava/util/List;", "allLinkedSymbols", "eventId", "Companion", "a", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends h0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("clientOrderId")
    private final String clientOrderId;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("startedAt")
    private final Long startedAt;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("symbol")
    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("allLinkedSymbols")
    @NotNull
    private final List<String> allLinkedSymbols;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("eventId")
    private final String eventId;

    /* JADX INFO: renamed from: s, reason: from getter */
    public final List getAllLinkedSymbols() {
        return this.allLinkedSymbols;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getClientOrderId() {
        return this.clientOrderId;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final Long getStartedAt() {
        return this.startedAt;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }
}
