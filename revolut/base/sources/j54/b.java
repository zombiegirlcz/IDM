package j54;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f171495c;

    public b(String applicationId, String workflowId, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f171493a = applicationId;
        this.f171494b = workflowId;
        this.f171495c = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f171493a, bVar.f171493a) && Intrinsics.f(this.f171494b, bVar.f171494b) && Intrinsics.f(this.f171495c, bVar.f171495c);
    }

    public final int hashCode() {
        return this.f171495c.f297794a.hashCode() + p.a.c(this.f171493a.hashCode() * 31, 31, this.f171494b);
    }
}
