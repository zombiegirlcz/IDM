package n3f;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010$\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0005\u0010#R\u001a\u0010(\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b\u000e\u0010'R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b!\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b\u0014\u0010\fR\u001a\u0010/\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\u0004R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b+\u0010\u0004R\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b-\u0010\u0004R\u001a\u00103\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b2\u0010'R\u001c\u00107\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u00105\u001a\u0004\b\u0017\u00106¨\u00068"}, d2 = {"Ln3f/o;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "compoundId", "Ljo3/b;", "Ljo3/b;", "g", "()Ljo3/b;", "executedPrice", "c", "k", "gross", "d", "n", "net", "e", "o", "side", "f", "i", "externalId", "", "Ln3f/d0;", "Ljava/util/List;", "j", "()Ljava/util/List;", "fees", "Ln3f/b0;", "h", "Ln3f/b0;", "()Ln3f/b0;", "commission", "", "Z", "()Z", "confirmed", "estimatedQuantity", "executedQuantity", "l", "estimatedTotal", "m", "q", "symbol", "instrumentName", "instrumentType", "p", "standing", "Ln3f/p;", "Ln3f/p;", "()Ln3f/p;", "exchangedValue", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("compoundId")
    private final String compoundId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("executedPrice")
    private final jo3.b executedPrice;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("gross")
    private final jo3.b gross;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("net")
    private final jo3.b net;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("side")
    @NotNull
    private final String side;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("externalId")
    private final String externalId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("fees")
    @NotNull
    private final List<d0> fees;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("commission")
    private final b0 commission;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("confirmed")
    private final boolean confirmed;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedQuantity")
    private final String estimatedQuantity;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("executedQuantity")
    private final String executedQuantity;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedTotal")
    private final jo3.b estimatedTotal;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("symbol")
    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("instrumentName")
    private final String instrumentName;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("instrumentType")
    private final String instrumentType;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("standing")
    private final boolean standing;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("exchangedValue")
    private final p exchangedValue;

    public o(String str, jo3.b bVar, jo3.b bVar2, jo3.b bVar3, String side, String str2, ArrayList fees, b0 b0Var, boolean z, String str3, String str4, jo3.b bVar4, String symbol, String str5, String str6, boolean z3, p pVar) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.compoundId = str;
        this.executedPrice = bVar;
        this.gross = bVar2;
        this.net = bVar3;
        this.side = side;
        this.externalId = str2;
        this.fees = fees;
        this.commission = b0Var;
        this.confirmed = z;
        this.estimatedQuantity = str3;
        this.executedQuantity = str4;
        this.estimatedTotal = bVar4;
        this.symbol = symbol;
        this.instrumentName = str5;
        this.instrumentType = str6;
        this.standing = z3;
        this.exchangedValue = pVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getCommission() {
        return this.commission;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCompoundId() {
        return this.compoundId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getConfirmed() {
        return this.confirmed;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEstimatedQuantity() {
        return this.estimatedQuantity;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.b getEstimatedTotal() {
        return this.estimatedTotal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.compoundId, oVar.compoundId) && Intrinsics.f(this.executedPrice, oVar.executedPrice) && Intrinsics.f(this.gross, oVar.gross) && Intrinsics.f(this.net, oVar.net) && Intrinsics.f(this.side, oVar.side) && Intrinsics.f(this.externalId, oVar.externalId) && Intrinsics.f(this.fees, oVar.fees) && Intrinsics.f(this.commission, oVar.commission) && this.confirmed == oVar.confirmed && Intrinsics.f(this.estimatedQuantity, oVar.estimatedQuantity) && Intrinsics.f(this.executedQuantity, oVar.executedQuantity) && Intrinsics.f(this.estimatedTotal, oVar.estimatedTotal) && Intrinsics.f(this.symbol, oVar.symbol) && Intrinsics.f(this.instrumentName, oVar.instrumentName) && Intrinsics.f(this.instrumentType, oVar.instrumentType) && this.standing == oVar.standing && Intrinsics.f(this.exchangedValue, oVar.exchangedValue);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final p getExchangedValue() {
        return this.exchangedValue;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final jo3.b getExecutedPrice() {
        return this.executedPrice;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getExecutedQuantity() {
        return this.executedQuantity;
    }

    public final int hashCode() {
        String str = this.compoundId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        jo3.b bVar = this.executedPrice;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        jo3.b bVar2 = this.gross;
        int iHashCode3 = (iHashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        jo3.b bVar3 = this.net;
        int iC = p.a.c((iHashCode3 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31, 31, this.side);
        String str2 = this.externalId;
        int iD = p.a.d((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.fees);
        b0 b0Var = this.commission;
        int iC2 = j6.a.c((iD + (b0Var == null ? 0 : b0Var.hashCode())) * 31, 31, this.confirmed);
        String str3 = this.estimatedQuantity;
        int iHashCode4 = (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.executedQuantity;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        jo3.b bVar4 = this.estimatedTotal;
        int iC3 = p.a.c((iHashCode5 + (bVar4 == null ? 0 : bVar4.hashCode())) * 31, 31, this.symbol);
        String str5 = this.instrumentName;
        int iHashCode6 = (iC3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.instrumentType;
        int iC4 = j6.a.c((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.standing);
        p pVar = this.exchangedValue;
        return iC4 + (pVar != null ? pVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getExternalId() {
        return this.externalId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final List getFees() {
        return this.fees;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final jo3.b getGross() {
        return this.gross;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getInstrumentName() {
        return this.instrumentName;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getInstrumentType() {
        return this.instrumentType;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final jo3.b getNet() {
        return this.net;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getStanding() {
        return this.standing;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }
}
