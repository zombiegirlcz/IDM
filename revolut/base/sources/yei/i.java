package yei;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0006\u0010\u0012¨\u0006\u0014"}, d2 = {"Lyei/i;", "", "", "toString", "()Ljava/lang/String;", "Lyei/a0;", "a", "Lyei/a0;", "c", "()Lyei/a0;", "window", "", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "minimumAge", "Lyei/j;", "Lyei/j;", "()Lyei/j;", "information", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("window")
    @NotNull
    private final a0 window;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("minimumAge")
    private final Integer minimumAge;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("info")
    @NotNull
    private final j information;

    public i(a0 window, Integer num, j information) {
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(information, "information");
        this.window = window;
        this.minimumAge = num;
        this.information = information;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final j getInformation() {
        return this.information;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getMinimumAge() {
        return this.minimumAge;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a0 getWindow() {
        return this.window;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.window, iVar.window) && Intrinsics.f(this.minimumAge, iVar.minimumAge) && Intrinsics.f(this.information, iVar.information);
    }

    public final int hashCode() {
        int iHashCode = this.window.hashCode() * 31;
        Integer num = this.minimumAge;
        return this.information.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }
}
