package ruf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f257547b;

    public e(String listId, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f257546a = listId;
        this.f257547b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f257546a, eVar.f257546a) && Intrinsics.f(this.f257547b, eVar.f257547b);
    }

    public final int hashCode() {
        int iHashCode = this.f257546a.hashCode() * 31;
        Object obj2 = this.f257547b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
