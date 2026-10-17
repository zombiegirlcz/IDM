package wp3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299027a;

    public g(String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f299027a = applicationId;
    }

    public final String a() {
        return this.f299027a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f299027a, ((g) obj2).f299027a);
    }

    public final int hashCode() {
        return this.f299027a.hashCode();
    }
}
