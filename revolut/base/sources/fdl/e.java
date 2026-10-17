package fdl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"Lfdl/e;", "", "", "a", "J", "b", "()J", "start", "end", "", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "valueType", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("start")
    private final long start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("end")
    private final long end;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("valueType")
    private final String valueType;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getValueType() {
        return this.valueType;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!getClass().equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.domain.impl.data.network.model.BaseHistoricalChartDto");
        e eVar = (e) obj2;
        return this.start == eVar.start && this.end == eVar.end && Intrinsics.f(this.valueType, eVar.valueType);
    }

    public int hashCode() {
        int iC = a0.d.c(Long.hashCode(this.start) * 31, 31, this.end);
        String str = this.valueType;
        return iC + (str != null ? str.hashCode() : 0);
    }
}
