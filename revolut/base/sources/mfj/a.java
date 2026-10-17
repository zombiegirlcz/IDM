package mfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lmfj/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "b", "()Z", "revPaySdkDrivenAuthenticationEnabled", "Lmfj/i;", "Lmfj/i;", "()Lmfj/i;", "revPayOrder", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("revPaySdkDrivenAuthenticationEnabled")
    private final boolean revPaySdkDrivenAuthenticationEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("revPayOrder")
    private final i revPayOrder;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final i getRevPayOrder() {
        return this.revPayOrder;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getRevPaySdkDrivenAuthenticationEnabled() {
        return this.revPaySdkDrivenAuthenticationEnabled;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.revPaySdkDrivenAuthenticationEnabled == aVar.revPaySdkDrivenAuthenticationEnabled && Intrinsics.f(this.revPayOrder, aVar.revPayOrder);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.revPaySdkDrivenAuthenticationEnabled) * 31;
        i iVar = this.revPayOrder;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
