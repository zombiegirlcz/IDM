package dee;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f113413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f113414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f113415c;

    public n(Data status, Data data, Data data2) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f113413a = status;
        this.f113414b = data;
        this.f113415c = data2;
    }

    public static n a(n nVar, Data status, Data data, Data data2, int i) {
        if ((i & 1) != 0) {
            status = nVar.f113413a;
        }
        if ((i & 2) != 0) {
            data = nVar.f113414b;
        }
        if ((i & 4) != 0) {
            data2 = nVar.f113415c;
        }
        nVar.getClass();
        Intrinsics.checkNotNullParameter(status, "status");
        return new n(status, data, data2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f113413a, nVar.f113413a) && Intrinsics.f(this.f113414b, nVar.f113414b) && Intrinsics.f(this.f113415c, nVar.f113415c);
    }

    public final int hashCode() {
        int iHashCode = this.f113413a.hashCode() * 31;
        Data data = this.f113414b;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.f113415c;
        return iHashCode2 + (data2 != null ? data2.hashCode() : 0);
    }
}
