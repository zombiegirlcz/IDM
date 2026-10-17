package m8l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0018"}, d2 = {"Lm8l/i;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "getAmount", "()J", "amount", "b", "Ljava/lang/String;", "getSourcePocketId", "sourcePocketId", "Lm8l/j;", "c", "Lm8l/j;", "getSide", "()Lm8l/j;", "side", "d", "getNote", "note", "feature_shared_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fromPocket")
    @NotNull
    private final String sourcePocketId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("side")
    @NotNull
    private final j side;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("note")
    private final String note;

    public i(long j2, String sourcePocketId, j side, String str) {
        Intrinsics.checkNotNullParameter(sourcePocketId, "sourcePocketId");
        Intrinsics.checkNotNullParameter(side, "side");
        this.amount = j2;
        this.sourcePocketId = sourcePocketId;
        this.side = side;
        this.note = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.amount == iVar.amount && Intrinsics.f(this.sourcePocketId, iVar.sourcePocketId) && this.side == iVar.side && Intrinsics.f(this.note, iVar.note);
    }

    public final int hashCode() {
        int iHashCode = (this.side.hashCode() + p.a.c(Long.hashCode(this.amount) * 31, 31, this.sourcePocketId)) * 31;
        String str = this.note;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
