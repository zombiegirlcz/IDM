package w4k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f294610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bgf.h f294611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294612c;

    public g(f type, bgf.h transactionWorkflow, String groupId) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(transactionWorkflow, "transactionWorkflow");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f294610a = type;
        this.f294611b = transactionWorkflow;
        this.f294612c = groupId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f294610a == gVar.f294610a && Intrinsics.f(this.f294611b, gVar.f294611b) && Intrinsics.f(this.f294612c, gVar.f294612c);
    }

    public final int hashCode() {
        return this.f294612c.hashCode() + ((this.f294611b.hashCode() + (this.f294610a.hashCode() * 31)) * 31);
    }
}
