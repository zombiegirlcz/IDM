package p35;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f232619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f232620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f232621c;
    public final dj0.d d;
    public final dj0.d e;
    public final dj0.d f;

    public e(dj0.d dVar, dj0.d dVar2, dj0.d dVar3, dj0.d dVar4, dj0.d dVar5, dj0.d dVar6) {
        this.f232619a = dVar;
        this.f232620b = dVar2;
        this.f232621c = dVar3;
        this.d = dVar4;
        this.e = dVar5;
        this.f = dVar6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f232619a, eVar.f232619a) && Intrinsics.f(this.f232620b, eVar.f232620b) && Intrinsics.f(this.f232621c, eVar.f232621c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f);
    }

    public final int hashCode() {
        dj0.d dVar = this.f232619a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        dj0.d dVar2 = this.f232620b;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.f232621c;
        int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        dj0.d dVar4 = this.d;
        int iHashCode4 = (iHashCode3 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31;
        dj0.d dVar5 = this.e;
        int iHashCode5 = (iHashCode4 + (dVar5 == null ? 0 : dVar5.hashCode())) * 31;
        dj0.d dVar6 = this.f;
        return iHashCode5 + (dVar6 != null ? dVar6.hashCode() : 0);
    }

    public e() {
        this(null, null, null, null, null, null);
    }
}
