package lo1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f197372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f197373b;

    public i(String listId, boolean z) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f197372a = listId;
        this.f197373b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f197372a, iVar.f197372a) && this.f197373b == iVar.f197373b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f197373b) + (this.f197372a.hashCode() * 31);
    }
}
