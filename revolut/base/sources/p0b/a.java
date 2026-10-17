package p0b;

import java.util.List;
import kotlin.Metadata;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\n\u0010\u0007R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\f\u0010\u0007R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\u0004\u0010\u0007R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0013"}, d2 = {"Lp0b/a;", "", "", "", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "time", "", "b", "high", "c", "low", "d", "open", "close", "f", "volume", "feature_retail_advanced_charts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("t")
    @NotNull
    private final List<Long> time;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("h")
    @NotNull
    private final List<Double> high;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("l")
    @NotNull
    private final List<Double> low;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("o")
    @NotNull
    private final List<Double> open;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("c")
    @NotNull
    private final List<Double> close;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @b("v")
    private final List<Double> volume;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getClose() {
        return this.close;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getHigh() {
        return this.high;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getLow() {
        return this.low;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getOpen() {
        return this.open;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getVolume() {
        return this.volume;
    }
}
