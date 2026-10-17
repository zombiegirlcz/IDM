package ve8;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lve8/j;", "", "", "toString", "()Ljava/lang/String;", "Lve8/i;", "a", "Lve8/i;", "b", "()Lve8/i;", "minimumAge", "maximumAge", "", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "tinRequiredAge", "feature_junior_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("minimumAge")
    @NotNull
    private final i minimumAge;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("maximumAge")
    @NotNull
    private final i maximumAge;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("tinRequiredAge")
    private final Integer tinRequiredAge;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final i getMaximumAge() {
        return this.maximumAge;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final i getMinimumAge() {
        return this.minimumAge;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getTinRequiredAge() {
        return this.tinRequiredAge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.minimumAge, jVar.minimumAge) && Intrinsics.f(this.maximumAge, jVar.maximumAge) && Intrinsics.f(this.tinRequiredAge, jVar.tinRequiredAge);
    }

    public final int hashCode() {
        int iHashCode = (this.maximumAge.hashCode() + (this.minimumAge.hashCode() * 31)) * 31;
        Integer num = this.tinRequiredAge;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
