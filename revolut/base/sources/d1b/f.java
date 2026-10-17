package d1b;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001b"}, d2 = {"Ld1b/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getIndicatorSdkName", "indicatorSdkName", "b", "getIndicatorName", "indicatorName", "", "c", "Ljava/util/Map;", "getInputs", "()Ljava/util/Map;", "inputs", "", "d", "Z", "getForceOverlay", "()Z", "forceOverlay", "e", "getLock", "lock", "feature_retail_advanced_charts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("indicatorSdkName")
    @NotNull
    private final String indicatorSdkName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("indicatorName")
    @NotNull
    private final String indicatorName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("inputs")
    private final Map<String, Object> inputs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("forceOverlay")
    private final boolean forceOverlay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("lock")
    private final boolean lock;

    public f(String indicatorSdkName, String indicatorName, Map map, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(indicatorSdkName, "indicatorSdkName");
        Intrinsics.checkNotNullParameter(indicatorName, "indicatorName");
        this.indicatorSdkName = indicatorSdkName;
        this.indicatorName = indicatorName;
        this.inputs = map;
        this.forceOverlay = z;
        this.lock = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.indicatorSdkName, fVar.indicatorSdkName) && Intrinsics.f(this.indicatorName, fVar.indicatorName) && Intrinsics.f(this.inputs, fVar.inputs) && this.forceOverlay == fVar.forceOverlay && this.lock == fVar.lock;
    }

    public final int hashCode() {
        int iC = p.a.c(this.indicatorSdkName.hashCode() * 31, 31, this.indicatorName);
        Map<String, Object> map = this.inputs;
        return Boolean.hashCode(this.lock) + j6.a.c((iC + (map == null ? 0 : map.hashCode())) * 31, 31, this.forceOverlay);
    }
}
