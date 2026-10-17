package w3b;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f294255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f294256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2b.a f294257c;

    public d(Data data, Data data2, e2b.a orderType) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.f294255a = data;
        this.f294256b = data2;
        this.f294257c = orderType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f294255a, dVar.f294255a) && Intrinsics.f(this.f294256b, dVar.f294256b) && this.f294257c == dVar.f294257c;
    }

    public final int hashCode() {
        Data data = this.f294255a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f294256b;
        return this.f294257c.hashCode() + ((iHashCode + (data2 != null ? data2.hashCode() : 0)) * 31);
    }
}
