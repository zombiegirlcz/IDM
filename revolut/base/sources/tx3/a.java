package tx3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements xx4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f275320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f275321b;

    public a(String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f275320a = applicationId;
        this.f275321b = j6.a.q("od-offer-", applicationId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f275320a, ((a) obj2).f275320a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f275321b;
    }

    public final int hashCode() {
        return this.f275320a.hashCode();
    }
}
