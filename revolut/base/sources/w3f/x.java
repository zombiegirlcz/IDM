package w3f;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\t"}, d2 = {"Lw3f/x;", "Lw3f/h0;", "", "s", "Ljava/lang/String;", "t", "()Ljava/lang/String;", "symbol", "instrumentName", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class x extends h0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("symbol")
    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("instrumentName")
    @NotNull
    private final String instrumentName;

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getInstrumentName() {
        return this.instrumentName;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }
}
