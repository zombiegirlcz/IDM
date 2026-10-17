package vw3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements xx4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292613b;

    public a(String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f292612a = applicationId;
        this.f292613b = j6.a.q("cc-offer-", applicationId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f292612a, ((a) obj2).f292612a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f292613b;
    }

    public final int hashCode() {
        return this.f292612a.hashCode();
    }
}
