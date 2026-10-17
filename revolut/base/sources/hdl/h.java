package hdl;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0003\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\t\u0010\u0011¨\u0006\u0013"}, d2 = {"Lhdl/h;", "", "Lko3/a;", "a", "Lko3/a;", "d", "()Lko3/a;", "openingPrice", "Ljo3/a;", "b", "Ljo3/a;", "c", "()Ljo3/a;", "margin", "exposure", "", "Ljava/lang/String;", "()Ljava/lang/String;", "leverage", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("openingPrice")
    @NotNull
    private final ko3.a openingPrice;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("margin")
    @NotNull
    private final jo3.a margin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("exposure")
    @NotNull
    private final jo3.a exposure;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("leverage")
    @NotNull
    private final String leverage;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getExposure() {
        return this.exposure;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLeverage() {
        return this.leverage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getMargin() {
        return this.margin;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ko3.a getOpeningPrice() {
        return this.openingPrice;
    }
}
