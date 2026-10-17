package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f113483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.time.b f113484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlin.time.b f113485c;

    public a3(t1 subscription, kotlin.time.b bVar, kotlin.time.b bVar2) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f113483a = subscription;
        this.f113484b = bVar;
        this.f113485c = bVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj2;
        return Intrinsics.f(this.f113483a, a3Var.f113483a) && Intrinsics.f(this.f113484b, a3Var.f113484b) && Intrinsics.f(this.f113485c, a3Var.f113485c);
    }

    public final int hashCode() {
        int iHashCode = this.f113483a.hashCode() * 31;
        kotlin.time.b bVar = this.f113484b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : Long.hashCode(bVar.f187924a))) * 31;
        kotlin.time.b bVar2 = this.f113485c;
        return iHashCode2 + (bVar2 != null ? Long.hashCode(bVar2.f187924a) : 0);
    }
}
