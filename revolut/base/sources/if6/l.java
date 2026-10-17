package if6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lif6/l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "scheme", "b", "identification", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "expiryDate", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("scheme")
    @NotNull
    private final String scheme;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("identification")
    @NotNull
    private final String identification;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("expiryDate")
    private final Long expiryDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getExpiryDate() {
        return this.expiryDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getIdentification() {
        return this.identification;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.scheme, lVar.scheme) && Intrinsics.f(this.identification, lVar.identification) && Intrinsics.f(this.expiryDate, lVar.expiryDate);
    }

    public final int hashCode() {
        int iC = p.a.c(this.scheme.hashCode() * 31, 31, this.identification);
        Long l2 = this.expiryDate;
        return iC + (l2 == null ? 0 : l2.hashCode());
    }
}
