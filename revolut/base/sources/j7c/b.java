package j7c;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0012"}, d2 = {"Lj7c/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "browserPackageName", "", "b", "Ljava/util/List;", "browserCertificateFingerprints", "c", "paymentRequestOrigin", "d", "topLevelOrigin", "e", "methodName", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("browserPackageName")
    @NotNull
    private final String browserPackageName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("browserCertificateFingerprints")
    @NotNull
    private final List<String> browserCertificateFingerprints;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentRequestOrigin")
    @NotNull
    private final String paymentRequestOrigin;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("topLevelOrigin")
    @NotNull
    private final String topLevelOrigin;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("methodName")
    @NotNull
    private final String methodName;

    public b(String browserPackageName, String paymentRequestOrigin, String topLevelOrigin, String methodName, ArrayList browserCertificateFingerprints) {
        Intrinsics.checkNotNullParameter(browserPackageName, "browserPackageName");
        Intrinsics.checkNotNullParameter(browserCertificateFingerprints, "browserCertificateFingerprints");
        Intrinsics.checkNotNullParameter(paymentRequestOrigin, "paymentRequestOrigin");
        Intrinsics.checkNotNullParameter(topLevelOrigin, "topLevelOrigin");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        this.browserPackageName = browserPackageName;
        this.browserCertificateFingerprints = browserCertificateFingerprints;
        this.paymentRequestOrigin = paymentRequestOrigin;
        this.topLevelOrigin = topLevelOrigin;
        this.methodName = methodName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.browserPackageName, bVar.browserPackageName) && Intrinsics.f(this.browserCertificateFingerprints, bVar.browserCertificateFingerprints) && Intrinsics.f(this.paymentRequestOrigin, bVar.paymentRequestOrigin) && Intrinsics.f(this.topLevelOrigin, bVar.topLevelOrigin) && Intrinsics.f(this.methodName, bVar.methodName);
    }

    public final int hashCode() {
        return this.methodName.hashCode() + p.a.c(p.a.c(p.a.d(this.browserPackageName.hashCode() * 31, 31, this.browserCertificateFingerprints), 31, this.paymentRequestOrigin), 31, this.topLevelOrigin);
    }
}
