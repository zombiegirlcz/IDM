package n3f;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0014"}, d2 = {"Ln3f/l;", "", "", "toString", "()Ljava/lang/String;", "Ln3f/p;", "a", "Ln3f/p;", "b", "()Ln3f/p;", "exchangedValue", "Ljava/lang/String;", "d", "rate", "Ljo3/b;", "c", "Ljo3/b;", "()Ljo3/b;", "fees", "compoundId", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("exchangedValue")
    @NotNull
    private final p exchangedValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("rate")
    @NotNull
    private final String rate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("fees")
    @NotNull
    private final jo3.b fees;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("compoundId")
    @NotNull
    private final String compoundId;

    public l(p exchangedValue, String rate, jo3.b fees, String compoundId) {
        Intrinsics.checkNotNullParameter(exchangedValue, "exchangedValue");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(compoundId, "compoundId");
        this.exchangedValue = exchangedValue;
        this.rate = rate;
        this.fees = fees;
        this.compoundId = compoundId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCompoundId() {
        return this.compoundId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final p getExchangedValue() {
        return this.exchangedValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.b getFees() {
        return this.fees;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRate() {
        return this.rate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.exchangedValue, lVar.exchangedValue) && Intrinsics.f(this.rate, lVar.rate) && Intrinsics.f(this.fees, lVar.fees) && Intrinsics.f(this.compoundId, lVar.compoundId);
    }

    public final int hashCode() {
        return this.compoundId.hashCode() + wp5.y.e(this.fees, p.a.c(this.exchangedValue.hashCode() * 31, 31, this.rate), 31);
    }
}
