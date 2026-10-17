package qbf;

import ip0.v7;
import java.time.Period;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u000b\u0010\u0018R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c¨\u0006\u001e"}, d2 = {"Lqbf/d;", "", "", "toString", "()Ljava/lang/String;", "Lqbf/b;", "a", "Lqbf/b;", "()Lqbf/b;", "code", "Ljava/time/Period;", "b", "Ljava/time/Period;", "e", "()Ljava/time/Period;", "period", "Ljo3/a;", "c", "Ljo3/a;", "()Ljo3/a;", "fee", "Lqbf/c;", "d", "Lqbf/c;", "()Lqbf/c;", "discount", "Lqbf/e;", "Lqbf/e;", "()Lqbf/e;", "freeTrial", "feature_trading_add_ons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    @NotNull
    private final b code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("period")
    @NotNull
    private final Period period;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("fee")
    @NotNull
    private final jo3.a fee;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("discount")
    private final c discount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("freeTrial")
    private final e freeTrial;

    public d(b code, Period period, jo3.a fee2, c cVar, e eVar) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.code = code;
        this.period = period;
        this.fee = fee2;
        this.discount = cVar;
        this.freeTrial = eVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getDiscount() {
        return this.discount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e getFreeTrial() {
        return this.freeTrial;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Period getPeriod() {
        return this.period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.code == dVar.code && Intrinsics.f(this.period, dVar.period) && Intrinsics.f(this.fee, dVar.fee) && Intrinsics.f(this.discount, dVar.discount) && Intrinsics.f(this.freeTrial, dVar.freeTrial);
    }

    public final int hashCode() {
        int iJ = v7.j(this.fee, (this.period.hashCode() + (this.code.hashCode() * 31)) * 31, 31);
        c cVar = this.discount;
        int iHashCode = (iJ + (cVar == null ? 0 : cVar.hashCode())) * 31;
        e eVar = this.freeTrial;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }
}
