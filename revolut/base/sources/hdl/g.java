package hdl;

import fdl.w2;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u000f\u0010\u001aR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u001c\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\u001c\u0010 R\u001c\u0010%\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b\u0014\u0010$R\u001c\u0010*\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)¨\u0006+"}, d2 = {"Lhdl/g;", "Lhdl/e;", "", "f", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "ref", "Lidl/b;", "g", "Lidl/b;", "i", "()Lidl/b;", "details", "Lfdl/w2;", "h", "Lfdl/w2;", "()Lfdl/w2;", "balance", "available", "j", "n", "total", "Lko3/a;", "k", "Lko3/a;", "()Lko3/a;", "decimalAveragePrice", "l", "instrumentType", "Lhdl/h;", "Lhdl/h;", "()Lhdl/h;", "marginDetails", "Lhdl/a;", "Lhdl/a;", "()Lhdl/a;", "fundHoldingDetails", "Ljava/time/ZonedDateTime;", "o", "Ljava/time/ZonedDateTime;", "()Ljava/time/ZonedDateTime;", "updatedDate", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g extends e {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("ref")
    @NotNull
    private final String ref;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("details")
    @NotNull
    private final idl.b details;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("balance")
    @NotNull
    private final w2 balance;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("available")
    @NotNull
    private final w2 available;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("total")
    @NotNull
    private final w2 total;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("averagePrice")
    private final ko3.a decimalAveragePrice;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("instrumentType")
    private final String instrumentType;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("marginDetails")
    private final h marginDetails;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("fundHoldingDetails")
    private final a fundHoldingDetails;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("updatedDate")
    private final ZonedDateTime updatedDate;

    /* JADX INFO: renamed from: f, reason: from getter */
    public final w2 getAvailable() {
        return this.available;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final w2 getBalance() {
        return this.balance;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final ko3.a getDecimalAveragePrice() {
        return this.decimalAveragePrice;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final idl.b getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final a getFundHoldingDetails() {
        return this.fundHoldingDetails;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getInstrumentType() {
        return this.instrumentType;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final h getMarginDetails() {
        return this.marginDetails;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final w2 getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final ZonedDateTime getUpdatedDate() {
        return this.updatedDate;
    }
}
