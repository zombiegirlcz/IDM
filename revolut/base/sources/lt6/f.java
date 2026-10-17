package lt6;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0007\u0010\u0004¨\u0006\u000f"}, d2 = {"Llt6/f;", "", "", "toString", "()Ljava/lang/String;", "", "Llt6/b;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "payments", "Ljava/lang/String;", "nextPageToken", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("payments")
    @NotNull
    private final List<b> payments;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextPageToken")
    private final String nextPageToken;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getNextPageToken() {
        return this.nextPageToken;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getPayments() {
        return this.payments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.payments, fVar.payments) && Intrinsics.f(this.nextPageToken, fVar.nextPageToken);
    }

    public final int hashCode() {
        int iHashCode = this.payments.hashCode() * 31;
        String str = this.nextPageToken;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
