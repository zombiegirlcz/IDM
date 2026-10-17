package jt8;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f178427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f178428b;

    public a(String projectId, String packageId) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        this.f178427a = projectId;
        this.f178428b = packageId;
    }

    public final String b() {
        return this.f178428b;
    }

    public final String c() {
        return this.f178427a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f178427a, aVar.f178427a) && Intrinsics.f(this.f178428b, aVar.f178428b);
    }

    public final int hashCode() {
        return this.f178428b.hashCode() + (this.f178427a.hashCode() * 31);
    }
}
