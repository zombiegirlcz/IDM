package d3b;

import e8l.u;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u0016\u0010\u001dR\u001a\u0010#\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010'\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b\u000b\u0010&¨\u0006("}, d2 = {"Ld3b/d;", "", "Le8l/a;", "a", "Le8l/a;", "d", "()Le8l/a;", "marginGross", "b", "e", "marginNet", "c", "exposure", "asset", "", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "side", "f", "marginRate", "Le8l/u;", "g", "Le8l/u;", "h", "()Le8l/u;", "rate", "Ld3b/e;", "Ld3b/e;", "()Ld3b/e;", "overnightFee", "Ld3b/f;", "Ld3b/f;", "j", "()Ld3b/f;", "spread", "Ld3b/c;", "Ld3b/c;", "()Ld3b/c;", "fee", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("marginGross")
    @NotNull
    private final e8l.a marginGross;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("marginNet")
    @NotNull
    private final e8l.a marginNet;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("exposure")
    @NotNull
    private final e8l.a exposure;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("asset")
    @NotNull
    private final e8l.a asset;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("side")
    @NotNull
    private final String side;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("marginRate")
    @NotNull
    private final String marginRate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("rate")
    @NotNull
    private final u rate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("overnightFee")
    private final e overnightFee;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("spread")
    @NotNull
    private final f spread;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("fee")
    @NotNull
    private final c fee;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e8l.a getAsset() {
        return this.asset;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e8l.a getExposure() {
        return this.exposure;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e8l.a getMarginGross() {
        return this.marginGross;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final e8l.a getMarginNet() {
        return this.marginNet;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getMarginRate() {
        return this.marginRate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final e getOvernightFee() {
        return this.overnightFee;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final u getRate() {
        return this.rate;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final f getSpread() {
        return this.spread;
    }
}
