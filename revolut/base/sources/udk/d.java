package udk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f279252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f279253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f279254c;

    public d(Data revealData, String str, n nVar) {
        Intrinsics.checkNotNullParameter(revealData, "revealData");
        this.f279252a = revealData;
        this.f279253b = str;
        this.f279254c = nVar;
    }

    public static d a(d dVar, Data revealData, String str, n nVar, int i) {
        if ((i & 1) != 0) {
            revealData = dVar.f279252a;
        }
        if ((i & 2) != 0) {
            str = dVar.f279253b;
        }
        if ((i & 4) != 0) {
            nVar = dVar.f279254c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(revealData, "revealData");
        return new d(revealData, str, nVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f279252a, dVar.f279252a) && Intrinsics.f(this.f279253b, dVar.f279253b) && Intrinsics.f(this.f279254c, dVar.f279254c);
    }

    public final int hashCode() {
        int iHashCode = this.f279252a.hashCode() * 31;
        String str = this.f279253b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        n nVar = this.f279254c;
        return iHashCode2 + (nVar != null ? nVar.hashCode() : 0);
    }
}
