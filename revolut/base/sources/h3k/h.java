package h3k;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0006\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u001c"}, d2 = {"Lh3k/h;", "", "", "toString", "()Ljava/lang/String;", "Lh3k/e;", "a", "Lh3k/e;", "e", "()Lh3k/e;", "fxRareCurrency", "b", "f", "fxWeekend", "", "c", "J", "d", "()J", "fx", "ftt", "h", "transfer", "g", "total", "cost", "Ljava/lang/String;", "currency", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("fxRareCurrency")
    private final e fxRareCurrency;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fxWeekend")
    private final e fxWeekend;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("fx")
    private final long fx;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("ftt")
    private final long ftt;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("transfer")
    private final long transfer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("total")
    private final long total;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("cost")
    private final long cost;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCost() {
        return this.cost;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getFtt() {
        return this.ftt;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getFx() {
        return this.fx;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final e getFxRareCurrency() {
        return this.fxRareCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.fxRareCurrency, hVar.fxRareCurrency) && Intrinsics.f(this.fxWeekend, hVar.fxWeekend) && this.fx == hVar.fx && this.ftt == hVar.ftt && this.transfer == hVar.transfer && this.total == hVar.total && this.cost == hVar.cost && Intrinsics.f(this.currency, hVar.currency);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final e getFxWeekend() {
        return this.fxWeekend;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getTransfer() {
        return this.transfer;
    }

    public final int hashCode() {
        e eVar = this.fxRareCurrency;
        int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        e eVar2 = this.fxWeekend;
        return this.currency.hashCode() + a0.d.c(a0.d.c(a0.d.c(a0.d.c(a0.d.c((iHashCode + (eVar2 != null ? eVar2.hashCode() : 0)) * 31, 31, this.fx), 31, this.ftt), 31, this.transfer), 31, this.total), 31, this.cost);
    }
}
