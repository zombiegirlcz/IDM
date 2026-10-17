package u6a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000e"}, d2 = {"Lu6a/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "encodedValue", "c", "reference", "d", "vpa", "companyName", "feature_paynow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("encodedValue")
    @NotNull
    private final String encodedValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("reference")
    @NotNull
    private final String reference;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("vpa")
    @NotNull
    private final String vpa;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("companyName")
    @NotNull
    private final String companyName;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCompanyName() {
        return this.companyName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEncodedValue() {
        return this.encodedValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getVpa() {
        return this.vpa;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.encodedValue, bVar.encodedValue) && Intrinsics.f(this.reference, bVar.reference) && Intrinsics.f(this.vpa, bVar.vpa) && Intrinsics.f(this.companyName, bVar.companyName);
    }

    public final int hashCode() {
        return this.companyName.hashCode() + p.a.c(p.a.c(this.encodedValue.hashCode() * 31, 31, this.reference), 31, this.vpa);
    }
}
