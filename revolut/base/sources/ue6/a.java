package ue6;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f279303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f279304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f279305c;
    public final d d;

    public a(String limitName, d dVar, d dVar2, d dVar3) {
        Intrinsics.checkNotNullParameter(limitName, "limitName");
        this.f279303a = limitName;
        this.f279304b = dVar;
        this.f279305c = dVar2;
        this.d = dVar3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f279303a, aVar.f279303a) && Intrinsics.f(this.f279304b, aVar.f279304b) && Intrinsics.f(this.f279305c, aVar.f279305c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f279303a.hashCode() * 31;
        d dVar = this.f279304b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.f279305c;
        int iHashCode3 = (iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        d dVar3 = this.d;
        return iHashCode3 + (dVar3 != null ? dVar3.hashCode() : 0);
    }
}
