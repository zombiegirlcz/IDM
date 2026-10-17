package kve;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f190099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jve.a f190100b;

    public d(c topUpMethodsEntity, jve.a aVar) {
        Intrinsics.checkNotNullParameter(topUpMethodsEntity, "topUpMethodsEntity");
        this.f190099a = topUpMethodsEntity;
        this.f190100b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f190099a, dVar.f190099a) && Intrinsics.f(this.f190100b, dVar.f190100b);
    }

    public final int hashCode() {
        int iHashCode = this.f190099a.hashCode() * 31;
        jve.a aVar = this.f190100b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
