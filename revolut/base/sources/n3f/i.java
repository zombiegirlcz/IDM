package n3f;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u0005\u0010\u001aR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u001d"}, d2 = {"Ln3f/i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "symbol", "Ljo3/b;", "b", "Ljo3/b;", "g", "()Ljo3/b;", "tax", "c", "gross", "d", "instrumentName", "Lnel/z;", "e", "Lnel/z;", "()Lnel/z;", "instrumentType", "Ln3f/p;", "Ln3f/p;", "()Ln3f/p;", "exchangedValue", "rate", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

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
    private final String instrumentName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("instrumentType")
    private final nel.z instrumentType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("exchangedValue")
    private final p exchangedValue;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("rate")
    private final String rate;

    public i(String symbol, jo3.b bVar, jo3.b bVar2, String str, nel.z zVar, p pVar, String str2) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.symbol = symbol;
        this.tax = bVar;
        this.gross = bVar2;
        this.instrumentName = str;
        this.instrumentType = zVar;
        this.exchangedValue = pVar;
        this.rate = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final p getExchangedValue() {
        return this.exchangedValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getGross() {
        return this.gross;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getInstrumentName() {
        return this.instrumentName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final nel.z getInstrumentType() {
        return this.instrumentType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRate() {
        return this.rate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.symbol, iVar.symbol) && Intrinsics.f(this.tax, iVar.tax) && Intrinsics.f(this.gross, iVar.gross) && Intrinsics.f(this.instrumentName, iVar.instrumentName) && this.instrumentType == iVar.instrumentType && Intrinsics.f(this.exchangedValue, iVar.exchangedValue) && Intrinsics.f(this.rate, iVar.rate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final jo3.b getTax() {
        return this.tax;
    }

    public final int hashCode() {
        int iHashCode = this.symbol.hashCode() * 31;
        jo3.b bVar = this.tax;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        jo3.b bVar2 = this.gross;
        int iHashCode3 = (iHashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        String str = this.instrumentName;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        nel.z zVar = this.instrumentType;
        int iHashCode5 = (iHashCode4 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        p pVar = this.exchangedValue;
        int iHashCode6 = (iHashCode5 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str2 = this.rate;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }
}
