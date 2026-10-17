package w4k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bgf.h f294606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294607b;

    public c(bgf.h transactionWorkflow, String groupId) {
        Intrinsics.checkNotNullParameter(transactionWorkflow, "transactionWorkflow");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f294606a = transactionWorkflow;
        this.f294607b = groupId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f294606a, cVar.f294606a) && Intrinsics.f(this.f294607b, cVar.f294607b);
    }

    public final int hashCode() {
        return this.f294607b.hashCode() + (this.f294606a.hashCode() * 31);
    }
}
