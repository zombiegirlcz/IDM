package g9j;

import com.revolut.feature.staking.api.model.StakingAvailability;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.g f141909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n9l.a f141910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ej0.b f141911c;
    public final StakingAvailability d;
    public final dj0.d e;
    public final Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f141912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final io3.d f141913h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qv0.i f141914j;

    public e(io3.g gVar, n9l.a aVar, ej0.b bVar, StakingAvailability stakingAvailability, dj0.d dVar, Boolean bool, Boolean bool2, io3.d dVar2, boolean z, qv0.i iVar) {
        this.f141909a = gVar;
        this.f141910b = aVar;
        this.f141911c = bVar;
        this.d = stakingAvailability;
        this.e = dVar;
        this.f = bool;
        this.f141912g = bool2;
        this.f141913h = dVar2;
        this.i = z;
        this.f141914j = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f141909a, eVar.f141909a) && Intrinsics.f(this.f141910b, eVar.f141910b) && Intrinsics.f(this.f141911c, eVar.f141911c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f141912g, eVar.f141912g) && Intrinsics.f(this.f141913h, eVar.f141913h) && this.i == eVar.i && Intrinsics.f(this.f141914j, eVar.f141914j);
    }

    public final int hashCode() {
        io3.g gVar = this.f141909a;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        n9l.a aVar = this.f141910b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        ej0.b bVar = this.f141911c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        StakingAvailability stakingAvailability = this.d;
        int iHashCode4 = (iHashCode3 + (stakingAvailability == null ? 0 : stakingAvailability.hashCode())) * 31;
        dj0.d dVar = this.e;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 961;
        Boolean bool = this.f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f141912g;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        io3.d dVar2 = this.f141913h;
        int iC = j6.a.c((iHashCode7 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31, 31, this.i);
        qv0.i iVar = this.f141914j;
        return iC + (iVar != null ? iVar.hashCode() : 0);
    }
}
