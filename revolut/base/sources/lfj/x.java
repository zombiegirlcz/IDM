package lfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004¨\u0006\u000f"}, d2 = {"Llfj/x;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "getContractDate", "()J", "contractDate", "b", "Ljava/lang/String;", "getContractVersion", "contractVersion", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("contractDate")
    private final long contractDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("contractVersion")
    @NotNull
    private final String contractVersion;

    public x(long j2, String contractVersion) {
        Intrinsics.checkNotNullParameter(contractVersion, "contractVersion");
        this.contractDate = j2;
        this.contractVersion = contractVersion;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return this.contractDate == xVar.contractDate && Intrinsics.f(this.contractVersion, xVar.contractVersion);
    }

    public final int hashCode() {
        return this.contractVersion.hashCode() + (Long.hashCode(this.contractDate) * 31);
    }
}
