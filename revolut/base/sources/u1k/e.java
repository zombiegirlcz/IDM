package u1k;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f276419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f276420b;

    public e(Data vaultData, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(vaultData, "vaultData");
        this.f276419a = vaultData;
        this.f276420b = dVar;
    }

    public static e a(e eVar, Data vaultData, dj0.d dVar, int i) {
        if ((i & 1) != 0) {
            vaultData = eVar.f276419a;
        }
        if ((i & 2) != 0) {
            dVar = eVar.f276420b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(vaultData, "vaultData");
        return new e(vaultData, dVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f276419a, eVar.f276419a) && Intrinsics.f(this.f276420b, eVar.f276420b);
    }

    public final int hashCode() {
        int iHashCode = this.f276419a.hashCode() * 31;
        dj0.d dVar = this.f276420b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
