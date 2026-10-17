package kr;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkr/u0;", "Lkr/y0;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u0 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ulm.o1 f188587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f188588b;

    public u0(ulm.o1 requestBody, j1 metadata) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f188587a = requestBody;
        this.f188588b = metadata;
    }

    @Override // kr.y0
    public final RequestBody a() {
        return this.f188587a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return this.f188587a.equals(u0Var.f188587a) && this.f188588b.equals(u0Var.f188588b);
    }

    public final int hashCode() {
        return this.f188588b.hashCode() + (this.f188587a.hashCode() * 31);
    }
}
