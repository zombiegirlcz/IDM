package m25;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f201705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f201706c;

    public j(dj0.d dVar, String pocketId, String str) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f201704a = pocketId;
        this.f201705b = dVar;
        this.f201706c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f201704a, jVar.f201704a) && Intrinsics.f(this.f201705b, jVar.f201705b) && Intrinsics.f(this.f201706c, jVar.f201706c);
    }

    public final int hashCode() {
        int iHashCode = this.f201704a.hashCode() * 31;
        dj0.d dVar = this.f201705b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f201706c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
