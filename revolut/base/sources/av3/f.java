package av3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f9898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f9899c;
    public final e d;

    public f(boolean z, d introScreen, e eVar, e eVar2) {
        Intrinsics.checkNotNullParameter(introScreen, "introScreen");
        this.f9897a = z;
        this.f9898b = introScreen;
        this.f9899c = eVar;
        this.d = eVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f9897a == fVar.f9897a && Intrinsics.f(this.f9898b, fVar.f9898b) && Intrinsics.f(this.f9899c, fVar.f9899c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f9898b.hashCode() + (Boolean.hashCode(this.f9897a) * 31)) * 31;
        e eVar = this.f9899c;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        e eVar2 = this.d;
        return iHashCode2 + (eVar2 != null ? eVar2.hashCode() : 0);
    }
}
