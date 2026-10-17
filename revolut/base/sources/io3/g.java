package io3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f163163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f163164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f163165c;
    public final Long d;
    public final dj0.d e;

    public /* synthetic */ g(d dVar, dj0.d dVar2, dj0.d dVar3, int i) {
        this(dVar, (i & 2) != 0 ? null : dVar2, null, null, (i & 16) != 0 ? null : dVar3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f163163a, gVar.f163163a) && Intrinsics.f(this.f163164b, gVar.f163164b) && Intrinsics.f(this.f163165c, gVar.f163165c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f163163a.hashCode() * 31;
        dj0.d dVar = this.f163164b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Boolean bool = this.f163165c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        dj0.d dVar2 = this.e;
        return iHashCode4 + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    public g(d pocket, dj0.d dVar, Boolean bool, Long l2, dj0.d dVar2) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f163163a = pocket;
        this.f163164b = dVar;
        this.f163165c = bool;
        this.d = l2;
        this.e = dVar2;
    }
}
