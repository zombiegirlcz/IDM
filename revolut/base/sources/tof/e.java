package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f272701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f272702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f272703c;

    public e(dj0.d dVar, dj0.d dVar2, Double d) {
        this.f272701a = dVar;
        this.f272702b = dVar2;
        this.f272703c = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f272701a, eVar.f272701a) && Intrinsics.f(this.f272702b, eVar.f272702b) && Intrinsics.f(this.f272703c, eVar.f272703c);
    }

    public final int hashCode() {
        dj0.d dVar = this.f272701a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        dj0.d dVar2 = this.f272702b;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        Double d = this.f272703c;
        return iHashCode2 + (d != null ? d.hashCode() : 0);
    }
}
