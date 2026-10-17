package f23;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pi3.h f131348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131349b;

    public a(pi3.h hVar, String str) {
        this.f131348a = hVar;
        this.f131349b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f131348a, aVar.f131348a) && Intrinsics.f(this.f131349b, aVar.f131349b);
    }

    public final int hashCode() {
        pi3.h hVar = this.f131348a;
        int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        String str = this.f131349b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
