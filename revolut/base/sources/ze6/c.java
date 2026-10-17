package ze6;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ze6.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001a\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\b\u0010\fR\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0012\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\fR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u0010\u0010\u001a¨\u0006\u001c"}, d2 = {"Lze6/c;", "", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "id", "b", "countryCode", "", "Z", "()Z", "hasBranches", "d", "infoProvider", "e", "g", "paymentInitiation", "Lze6/a$b;", "f", "Lze6/a$b;", "()Lze6/a$b;", "paymentInfo", "Lze6/a$a;", "Lze6/a$a;", "()Lze6/a$a;", "outage", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("countryCode")
    @NotNull
    private final String countryCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("hasBranches")
    private final boolean hasBranches;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("infoProvider")
    private final boolean infoProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("paymentInitiation")
    private final boolean paymentInitiation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("paymentInfo")
    private final a.b paymentInfo;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("outage")
    private final a.C1781a outage;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getHasBranches() {
        return this.hasBranches;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getInfoProvider() {
        return this.infoProvider;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a.C1781a getOutage() {
        return this.outage;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final a.b getPaymentInfo() {
        return this.paymentInfo;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getPaymentInitiation() {
        return this.paymentInitiation;
    }
}
