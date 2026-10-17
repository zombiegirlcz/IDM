package lnf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f197241a;

    public g(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f197241a = groupId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f197241a, ((g) obj2).f197241a);
    }

    public final int hashCode() {
        return this.f197241a.hashCode();
    }
}
