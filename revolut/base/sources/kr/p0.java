package kr;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkr/p0;", "Lkr/y0;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p0 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ulm.o1 f188555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f188556b;

    public p0(ulm.o1 requestBody, d metadata) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f188555a = requestBody;
        this.f188556b = metadata;
    }

    @Override // kr.y0
    public final RequestBody a() {
        return this.f188555a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return this.f188555a.equals(p0Var.f188555a) && this.f188556b.equals(p0Var.f188556b);
    }

    public final int hashCode() {
        return this.f188556b.hashCode() + (this.f188555a.hashCode() * 31);
    }
}
