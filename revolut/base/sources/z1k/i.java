package z1k;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f318864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f318865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f318866c;
    public final List d;
    public final nrf.e e;

    public i(k id10, String str, j jVar, ArrayList arrayList, nrf.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f318864a = id10;
        this.f318865b = str;
        this.f318866c = jVar;
        this.d = arrayList;
        this.e = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f318864a == iVar.f318864a && Intrinsics.f(this.f318865b, iVar.f318865b) && Intrinsics.f(this.f318866c, iVar.f318866c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f318864a.hashCode() * 31;
        String str = this.f318865b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        j jVar = this.f318866c;
        int iHashCode3 = (iHashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        nrf.e eVar = this.e;
        return iHashCode4 + (eVar != null ? eVar.hashCode() : 0);
    }
}
