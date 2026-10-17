package a9g;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u0011"}, d2 = {"La9g/u1;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "filterReference", "b", "d", "optionId", "Lxei/f;", "c", "Lxei/f;", "()Lxei/f;", "minValue", "maxValue", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("filterReference")
    @NotNull
    private final String filterReference;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("optionId")
    private final String optionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("minValue")
    private final xei.f minValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("maxValue")
    private final xei.f maxValue;

    public u1(String filterReference, String str, xei.f fVar, xei.f fVar2) {
        Intrinsics.checkNotNullParameter(filterReference, "filterReference");
        this.filterReference = filterReference;
        this.optionId = str;
        this.minValue = fVar;
        this.maxValue = fVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFilterReference() {
        return this.filterReference;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final xei.f getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final xei.f getMinValue() {
        return this.minValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getOptionId() {
        return this.optionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj2;
        return Intrinsics.f(this.filterReference, u1Var.filterReference) && Intrinsics.f(this.optionId, u1Var.optionId) && Intrinsics.f(this.minValue, u1Var.minValue) && Intrinsics.f(this.maxValue, u1Var.maxValue);
    }

    public final int hashCode() {
        int iHashCode = this.filterReference.hashCode() * 31;
        String str = this.optionId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        xei.f fVar = this.minValue;
        int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        xei.f fVar2 = this.maxValue;
        return iHashCode3 + (fVar2 != null ? fVar2.hashCode() : 0);
    }
}
