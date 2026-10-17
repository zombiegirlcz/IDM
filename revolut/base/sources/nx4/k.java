package nx4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lnx4/k;", "Lnx4/n;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "screenId", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("screenId")
    @NotNull
    private final String screenId;

    public k(String screenId) {
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        this.screenId = screenId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getScreenId() {
        return this.screenId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.screenId, ((k) obj2).screenId);
    }

    public final int hashCode() {
        return this.screenId.hashCode();
    }

    @Override // nx4.n
    public final String j() {
        return p.a.p("ShowScreenDto(screenId=", this.screenId, ")");
    }
}
