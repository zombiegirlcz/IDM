package iqg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yvh.b f167842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yvh.b f167843b;

    public j(yvh.b bVar, yvh.b bVar2) {
        this.f167842a = bVar;
        this.f167843b = bVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f167842a, jVar.f167842a) && Intrinsics.f(this.f167843b, jVar.f167843b);
    }

    public final int hashCode() {
        yvh.b bVar = this.f167842a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        yvh.b bVar2 = this.f167843b;
        return iHashCode + (bVar2 != null ? bVar2.hashCode() : 0);
    }
}
