package a9g;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u0011"}, d2 = {"La9g/d;", "", "", "toString", "()Ljava/lang/String;", "", "b", "Z", "a", "()Z", "freeCancellation", "", "La9g/g;", "c", "Ljava/util/List;", "()Ljava/util/List;", "windows", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("freeCancellation")
    private final boolean freeCancellation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("windows")
    @NotNull
    private final List<g> windows;

    public d(ArrayList windows, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(windows, "windows");
        this.f2459a = z;
        this.freeCancellation = z3;
        this.windows = windows;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getFreeCancellation() {
        return this.freeCancellation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getWindows() {
        return this.windows;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f2459a == dVar.f2459a && this.freeCancellation == dVar.freeCancellation && Intrinsics.f(this.windows, dVar.windows);
    }

    public final int hashCode() {
        return this.windows.hashCode() + j6.a.c(Boolean.hashCode(this.f2459a) * 31, 31, this.freeCancellation);
    }
}
