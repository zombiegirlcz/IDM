package bg9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f15139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xf9.b f15140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f15141c;

    public a(Data data, xf9.b bVar, wi0.b bVar2) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f15139a = data;
        this.f15140b = bVar;
        this.f15141c = bVar2;
    }

    public static a a(a aVar, Data data, xf9.b bVar, wi0.b bVar2, int i) {
        if ((i & 1) != 0) {
            data = aVar.f15139a;
        }
        if ((i & 2) != 0) {
            bVar = aVar.f15140b;
        }
        if ((i & 4) != 0) {
            bVar2 = aVar.f15141c;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        return new a(data, bVar, bVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f15139a, aVar.f15139a) && Intrinsics.f(this.f15140b, aVar.f15140b) && Intrinsics.f(this.f15141c, aVar.f15141c);
    }

    public final int hashCode() {
        int iHashCode = this.f15139a.hashCode() * 31;
        xf9.b bVar = this.f15140b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        wi0.b bVar2 = this.f15141c;
        return iHashCode2 + (bVar2 != null ? bVar2.f297794a.hashCode() : 0);
    }
}
