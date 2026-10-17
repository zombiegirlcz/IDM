package qua;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f249287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f249288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f249289c;
    public final dj0.d d;

    public e() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f249287a, eVar.f249287a) && Intrinsics.f(this.f249288b, eVar.f249288b) && Intrinsics.f(this.f249289c, eVar.f249289c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        dj0.d dVar = this.f249287a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        dj0.d dVar2 = this.f249288b;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.f249289c;
        int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        dj0.d dVar4 = this.d;
        return iHashCode3 + (dVar4 != null ? dVar4.hashCode() : 0);
    }

    public e(dj0.d dVar, dj0.d dVar2, dj0.d dVar3, dj0.d dVar4) {
        this.f249287a = dVar;
        this.f249288b = dVar2;
        this.f249289c = dVar3;
        this.d = dVar4;
    }
}
