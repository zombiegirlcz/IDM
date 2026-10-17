package w3f;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0003\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u0010"}, d2 = {"Lw3f/k;", "Lw3f/h0;", "", "s", "Ljava/lang/String;", "u", "()Ljava/lang/String;", "symbol", "Ljo3/a;", "t", "Ljo3/a;", "v", "()Ljo3/a;", "tax", "gross", "instrumentName", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class k extends h0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("symbol")
    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("tax")
    private final jo3.a tax;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("gross")
    private final jo3.a gross;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("instrumentName")
    @NotNull
    private final String instrumentName;

    /* JADX INFO: renamed from: s, reason: from getter */
    public final jo3.a getGross() {
        return this.gross;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getInstrumentName() {
        return this.instrumentName;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final jo3.a getTax() {
        return this.tax;
    }
}
