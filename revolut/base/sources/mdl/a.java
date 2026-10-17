package mdl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lmdl/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "rtlBrexitOptInRequired", "b", "rtlBrexitOptInSkippable", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("rtlBrexitOptInRequired")
    private final Boolean rtlBrexitOptInRequired;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("rtlBrexitOptInSkippable")
    private final Boolean rtlBrexitOptInSkippable;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getRtlBrexitOptInRequired() {
        return this.rtlBrexitOptInRequired;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getRtlBrexitOptInSkippable() {
        return this.rtlBrexitOptInSkippable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.rtlBrexitOptInRequired, aVar.rtlBrexitOptInRequired) && Intrinsics.f(this.rtlBrexitOptInSkippable, aVar.rtlBrexitOptInSkippable);
    }

    public final int hashCode() {
        Boolean bool = this.rtlBrexitOptInRequired;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.rtlBrexitOptInSkippable;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }
}
