package m8l;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0004R(\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010&\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010,\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0012\u001a\u0004\b.\u0010\u0004R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u0012\u001a\u0004\b1\u0010\u0004¨\u00063"}, d2 = {"Lm8l/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "getAmount", "()J", "amount", "Lm8l/j;", "b", "Lm8l/j;", "getSide", "()Lm8l/j;", "side", "c", "Ljava/lang/String;", "getSourcePocketId", "sourcePocketId", "d", "getDestinationPocketId", "destinationPocketId", "e", "getReason", "reason", "", "f", "Ljava/util/Map;", "getExtraAttributes", "()Ljava/util/Map;", "extraAttributes", "Lm8l/c;", "g", "Lm8l/c;", "getTransferReason", "()Lm8l/c;", "transferReason", "", "h", "Ljava/lang/Integer;", "getNumberOfInstalments", "()Ljava/lang/Integer;", "numberOfInstalments", "i", "getSignedQuote", "signedQuote", "j", "getNote", "note", "feature_shared_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("side")
    @NotNull
    private final j side;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("sourcePocketId")
    @NotNull
    private final String sourcePocketId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("destinationPocketId")
    @NotNull
    private final String destinationPocketId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("reason")
    private final String reason;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("extraAttributes")
    private final Map<String, String> extraAttributes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferReason")
    private final c transferReason;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("numberOfInstalments")
    private final Integer numberOfInstalments;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("signedQuote")
    private final String signedQuote;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("note")
    private final String note;

    public b(long j2, j side, String sourcePocketId, String destinationPocketId, Map map, c cVar, Integer num, String str, String str2) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(sourcePocketId, "sourcePocketId");
        Intrinsics.checkNotNullParameter(destinationPocketId, "destinationPocketId");
        this.amount = j2;
        this.side = side;
        this.sourcePocketId = sourcePocketId;
        this.destinationPocketId = destinationPocketId;
        this.reason = null;
        this.extraAttributes = map;
        this.transferReason = cVar;
        this.numberOfInstalments = num;
        this.signedQuote = str;
        this.note = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.amount == bVar.amount && this.side == bVar.side && Intrinsics.f(this.sourcePocketId, bVar.sourcePocketId) && Intrinsics.f(this.destinationPocketId, bVar.destinationPocketId) && Intrinsics.f(this.reason, bVar.reason) && Intrinsics.f(this.extraAttributes, bVar.extraAttributes) && Intrinsics.f(this.transferReason, bVar.transferReason) && Intrinsics.f(this.numberOfInstalments, bVar.numberOfInstalments) && Intrinsics.f(this.signedQuote, bVar.signedQuote) && Intrinsics.f(this.note, bVar.note);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c((this.side.hashCode() + (Long.hashCode(this.amount) * 31)) * 31, 31, this.sourcePocketId), 31, this.destinationPocketId);
        String str = this.reason;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.extraAttributes;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        c cVar = this.transferReason;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Integer num = this.numberOfInstalments;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.signedQuote;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.note;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }
}
