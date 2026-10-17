package x15;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f302294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f302295b;

    public n(List managementList, l application) {
        Intrinsics.checkNotNullParameter(managementList, "managementList");
        Intrinsics.checkNotNullParameter(application, "application");
        this.f302294a = managementList;
        this.f302295b = application;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f302294a, nVar.f302294a) && Intrinsics.f(this.f302295b, nVar.f302295b);
    }

    public final int hashCode() {
        return this.f302295b.hashCode() + (this.f302294a.hashCode() * 31);
    }
}
