package kr;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkr/w0;", "Lkr/y0;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w0 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vw.n f188595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t2 f188597c;

    public w0(vw.n requestBody, String fileName, t2 metadata) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f188595a = requestBody;
        this.f188596b = fileName;
        this.f188597c = metadata;
    }

    @Override // kr.y0
    public final RequestBody a() {
        return this.f188595a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return this.f188595a.equals(w0Var.f188595a) && Intrinsics.f(this.f188596b, w0Var.f188596b) && this.f188597c.equals(w0Var.f188597c);
    }

    public final int hashCode() {
        return this.f188597c.hashCode() + p.a.c(this.f188595a.hashCode() * 31, 31, this.f188596b);
    }
}
