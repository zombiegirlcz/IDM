package ahd;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ogd.k f4949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f4950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4951c;
    public final Data d;

    public n(ogd.k kVar, Data watchlistItems, String str, Data data) {
        Intrinsics.checkNotNullParameter(watchlistItems, "watchlistItems");
        this.f4949a = kVar;
        this.f4950b = watchlistItems;
        this.f4951c = str;
        this.d = data;
    }

    public static n a(n nVar, ogd.k kVar, Data watchlistItems, String str, Data data, int i) {
        if ((i & 1) != 0) {
            kVar = nVar.f4949a;
        }
        if ((i & 2) != 0) {
            watchlistItems = nVar.f4950b;
        }
        if ((i & 4) != 0) {
            str = nVar.f4951c;
        }
        if ((i & 8) != 0) {
            data = nVar.d;
        }
        nVar.getClass();
        Intrinsics.checkNotNullParameter(watchlistItems, "watchlistItems");
        return new n(kVar, watchlistItems, str, data);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f4949a, nVar.f4949a) && Intrinsics.f(this.f4950b, nVar.f4950b) && Intrinsics.f(this.f4951c, nVar.f4951c) && Intrinsics.f(this.d, nVar.d);
    }

    public final int hashCode() {
        ogd.k kVar = this.f4949a;
        int iC = kii.e.c(this.f4950b, (kVar == null ? 0 : kVar.hashCode()) * 31, 31);
        String str = this.f4951c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Data data = this.d;
        return iHashCode + (data != null ? data.hashCode() : 0);
    }
}
