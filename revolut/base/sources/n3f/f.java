package n3f;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\u0011"}, d2 = {"Ln3f/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "symbol", "Ljo3/b;", "b", "Ljo3/b;", "d", "()Ljo3/b;", "tax", "gross", "instrumentName", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("symbol")
    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("tax")
    private final jo3.b tax;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("gross")
    private final jo3.b gross;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("instrumentName")
    @NotNull
    private final String instrumentName;

    public f(String symbol, String instrumentName, jo3.b bVar, jo3.b bVar2) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(instrumentName, "instrumentName");
        this.symbol = symbol;
        this.tax = bVar;
        this.gross = bVar2;
        this.instrumentName = instrumentName;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getGross() {
        return this.gross;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInstrumentName() {
        return this.instrumentName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.b getTax() {
        return this.tax;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.symbol, fVar.symbol) && Intrinsics.f(this.tax, fVar.tax) && Intrinsics.f(this.gross, fVar.gross) && Intrinsics.f(this.instrumentName, fVar.instrumentName);
    }

    public final int hashCode() {
        int iHashCode = this.symbol.hashCode() * 31;
        jo3.b bVar = this.tax;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        jo3.b bVar2 = this.gross;
        return this.instrumentName.hashCode() + ((iHashCode2 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31);
    }
}
