package fr3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Lfr3/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getReferenceNumber", "referenceNumber", "b", "getData", "data", "feature_credit_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("referenceNumber")
    @NotNull
    private final String referenceNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("data")
    @NotNull
    private final String data;

    public a(String referenceNumber, String data) {
        Intrinsics.checkNotNullParameter(referenceNumber, "referenceNumber");
        Intrinsics.checkNotNullParameter(data, "data");
        this.referenceNumber = referenceNumber;
        this.data = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.referenceNumber, aVar.referenceNumber) && Intrinsics.f(this.data, aVar.data);
    }

    public final int hashCode() {
        return this.data.hashCode() + (this.referenceNumber.hashCode() * 31);
    }
}
