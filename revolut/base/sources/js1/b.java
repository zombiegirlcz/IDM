package js1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Ljs1/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getPortabilityCode", "portabilityCode", "b", "getTermsDocumentId", "termsDocumentId", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("portabilityCode")
    private final String portabilityCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("termsDocumentId")
    @NotNull
    private final String termsDocumentId;

    public b(String str, String termsDocumentId) {
        Intrinsics.checkNotNullParameter(termsDocumentId, "termsDocumentId");
        this.portabilityCode = str;
        this.termsDocumentId = termsDocumentId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.portabilityCode, bVar.portabilityCode) && Intrinsics.f(this.termsDocumentId, bVar.termsDocumentId);
    }

    public final int hashCode() {
        String str = this.portabilityCode;
        return this.termsDocumentId.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
