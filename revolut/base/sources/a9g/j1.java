package a9g;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"La9g/j1;", "", "", "toString", "()Ljava/lang/String;", "La9g/l2;", "a", "La9g/l2;", "c", "()La9g/l2;", "window", "La9g/k1;", "b", "La9g/k1;", "()La9g/k1;", "information", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "minimumAge", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("window")
    @NotNull
    private final l2 window;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("information")
    @NotNull
    private final k1 information;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("minimumAge")
    private final Integer minimumAge;

    public j1(l2 window, k1 information, Integer num) {
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(information, "information");
        this.window = window;
        this.information = information;
        this.minimumAge = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final k1 getInformation() {
        return this.information;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getMinimumAge() {
        return this.minimumAge;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final l2 getWindow() {
        return this.window;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj2;
        return Intrinsics.f(this.window, j1Var.window) && Intrinsics.f(this.information, j1Var.information) && Intrinsics.f(this.minimumAge, j1Var.minimumAge);
    }

    public final int hashCode() {
        int iHashCode = (this.information.hashCode() + (this.window.hashCode() * 31)) * 31;
        Integer num = this.minimumAge;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
