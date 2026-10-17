package wj8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xc8.c f298015a;

    public q(xc8.c dataManagementConsent) {
        Intrinsics.checkNotNullParameter(dataManagementConsent, "dataManagementConsent");
        this.f298015a = dataManagementConsent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f298015a, ((q) obj2).f298015a);
    }

    public final int hashCode() {
        return this.f298015a.hashCode();
    }
}
