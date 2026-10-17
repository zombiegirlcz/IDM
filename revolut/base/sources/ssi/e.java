package ssi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f265411b;

    public e(String popUpListId, Object obj2) {
        Intrinsics.checkNotNullParameter(popUpListId, "popUpListId");
        this.f265410a = popUpListId;
        this.f265411b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f265410a, eVar.f265410a) && Intrinsics.f(this.f265411b, eVar.f265411b);
    }

    public final int hashCode() {
        int iHashCode = this.f265410a.hashCode() * 31;
        Object obj2 = this.f265411b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
