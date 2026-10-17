package ilk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f162252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iha.a f162253b;

    public d(Data availableReasons, iha.a aVar) {
        Intrinsics.checkNotNullParameter(availableReasons, "availableReasons");
        this.f162252a = availableReasons;
        this.f162253b = aVar;
    }

    public static d a(d dVar, Data availableReasons, iha.a aVar, int i) {
        if ((i & 1) != 0) {
            availableReasons = dVar.f162252a;
        }
        if ((i & 2) != 0) {
            aVar = dVar.f162253b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(availableReasons, "availableReasons");
        return new d(availableReasons, aVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f162252a, dVar.f162252a) && this.f162253b == dVar.f162253b;
    }

    public final int hashCode() {
        int iHashCode = this.f162252a.hashCode() * 31;
        iha.a aVar = this.f162253b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
