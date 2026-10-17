package szf;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lszf/b;", "", "", "toString", "()Ljava/lang/String;", "", "Lszf/a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "experiences", "b", "Ljava/lang/String;", "paginationToken", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("experiences")
    @NotNull
    private final List<a> experiences;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("next")
    private final String paginationToken;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getExperiences() {
        return this.experiences;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPaginationToken() {
        return this.paginationToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.experiences, bVar.experiences) && Intrinsics.f(this.paginationToken, bVar.paginationToken);
    }

    public final int hashCode() {
        int iHashCode = this.experiences.hashCode() * 31;
        String str = this.paginationToken;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
