package cj6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ri6.d f24609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ei6.d f24610b;

    public d(ri6.d dVar, ei6.d dVar2) {
        this.f24609a = dVar;
        this.f24610b = dVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f24609a, dVar.f24609a) && Intrinsics.f(this.f24610b, dVar.f24610b);
    }

    public final int hashCode() {
        ri6.d dVar = this.f24609a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        ei6.d dVar2 = this.f24610b;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
