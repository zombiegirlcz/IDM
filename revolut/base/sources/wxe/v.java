package wxe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f300922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f300923c;

    public v(String storedMethodAccountId, String institutionId, String institutionName) {
        Intrinsics.checkNotNullParameter(storedMethodAccountId, "storedMethodAccountId");
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        this.f300921a = storedMethodAccountId;
        this.f300922b = institutionId;
        this.f300923c = institutionName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f300921a, vVar.f300921a) && Intrinsics.f(this.f300922b, vVar.f300922b) && Intrinsics.f(this.f300923c, vVar.f300923c);
    }

    public final int hashCode() {
        return this.f300923c.hashCode() + p.a.c(this.f300921a.hashCode() * 31, 31, this.f300922b);
    }
}
