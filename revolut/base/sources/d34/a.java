package d34;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements xx4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110908b;

    public a(String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f110907a = applicationId;
        this.f110908b = j6.a.q("outstanding-debts-v2-", applicationId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f110907a, ((a) obj2).f110907a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f110908b;
    }

    public final int hashCode() {
        return this.f110907a.hashCode();
    }
}
