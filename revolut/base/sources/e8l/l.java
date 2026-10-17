package e8l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\f\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"Le8l/l;", "", "", "toString", "()Ljava/lang/String;", "Le8l/k;", "a", "Le8l/k;", "()Le8l/k;", "limitLowerBound", "b", "limitUpperBound", "c", "stopLowerBound", "d", "stopUpperBound", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("limitLowerBound")
    @NotNull
    private final k limitLowerBound;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("limitUpperBound")
    @NotNull
    private final k limitUpperBound;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("stopLowerBound")
    @NotNull
    private final k stopLowerBound;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("stopUpperBound")
    @NotNull
    private final k stopUpperBound;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final k getLimitLowerBound() {
        return this.limitLowerBound;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final k getLimitUpperBound() {
        return this.limitUpperBound;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k getStopLowerBound() {
        return this.stopLowerBound;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final k getStopUpperBound() {
        return this.stopUpperBound;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.limitLowerBound, lVar.limitLowerBound) && Intrinsics.f(this.limitUpperBound, lVar.limitUpperBound) && Intrinsics.f(this.stopLowerBound, lVar.stopLowerBound) && Intrinsics.f(this.stopUpperBound, lVar.stopUpperBound);
    }

    public final int hashCode() {
        return this.stopUpperBound.hashCode() + ((this.stopLowerBound.hashCode() + ((this.limitUpperBound.hashCode() + (this.limitLowerBound.hashCode() * 31)) * 31)) * 31);
    }
}
