package jkl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ljkl/t2;", "", "", "toString", "()Ljava/lang/String;", "Ljkl/y1;", "a", "Ljkl/y1;", "getEvidence", "()Ljkl/y1;", "evidence", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("evidence")
    @NotNull
    private final y1 evidence;

    public t2(y1 evidence) {
        Intrinsics.checkNotNullParameter(evidence, "evidence");
        this.evidence = evidence;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t2) && Intrinsics.f(this.evidence, ((t2) obj2).evidence);
    }

    public final int hashCode() {
        return this.evidence.hashCode();
    }
}
