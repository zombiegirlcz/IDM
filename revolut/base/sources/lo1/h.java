package lo1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f197370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f197371b;

    public h(String listId, String value) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f197370a = listId;
        this.f197371b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f197370a, hVar.f197370a) && Intrinsics.f(this.f197371b, hVar.f197371b);
    }

    public final int hashCode() {
        return this.f197371b.hashCode() + (this.f197370a.hashCode() * 31);
    }
}
