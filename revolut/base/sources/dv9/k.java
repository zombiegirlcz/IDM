package dv9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f118074c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String userCode, String groupId) {
        super(groupId);
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f118073b = userCode;
        this.f118074c = groupId;
    }

    public final String a() {
        return this.f118073b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f118073b, kVar.f118073b) && Intrinsics.f(this.f118074c, kVar.f118074c);
    }

    public final int hashCode() {
        return this.f118074c.hashCode() + (this.f118073b.hashCode() * 31);
    }
}
