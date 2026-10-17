package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class az {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yy f163508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f163509c;

    public az(String listId, yy action, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f163507a = listId;
        this.f163508b = action;
        this.f163509c = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof az)) {
            return false;
        }
        az azVar = (az) obj2;
        return Intrinsics.f(this.f163507a, azVar.f163507a) && this.f163508b == azVar.f163508b && Intrinsics.f(this.f163509c, azVar.f163509c);
    }

    public final int hashCode() {
        int iHashCode = (this.f163508b.hashCode() + (this.f163507a.hashCode() * 31)) * 31;
        Object obj2 = this.f163509c;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
