package txg;

import cli.j;
import com.revolut.data.model.Data;
import jel.a3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f275420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f275421b;

    public e(a3 sector, Data data) {
        Intrinsics.checkNotNullParameter(sector, "sector");
        this.f275420a = sector;
        this.f275421b = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f275420a == eVar.f275420a && Intrinsics.f(this.f275421b, eVar.f275421b);
    }

    public final int hashCode() {
        int iHashCode = this.f275420a.hashCode() * 31;
        Data data = this.f275421b;
        return iHashCode + (data == null ? 0 : data.hashCode());
    }
}
