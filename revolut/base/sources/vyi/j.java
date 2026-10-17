package vyi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f293338b;

    public j(String loungeId, String str) {
        Intrinsics.checkNotNullParameter(loungeId, "loungeId");
        this.f293337a = loungeId;
        this.f293338b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f293337a, jVar.f293337a) && Intrinsics.f(this.f293338b, jVar.f293338b);
    }

    public final int hashCode() {
        int iHashCode = this.f293337a.hashCode() * 31;
        String str = this.f293338b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
