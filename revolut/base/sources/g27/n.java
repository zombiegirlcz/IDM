package g27;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f139920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f139921b;

    public n() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f139920a, nVar.f139920a) && Intrinsics.f(this.f139921b, nVar.f139921b);
    }

    public final int hashCode() {
        return this.f139921b.hashCode() + (this.f139920a.hashCode() * 31);
    }

    public n(Data orderInitiationPageData, Data orders) {
        Intrinsics.checkNotNullParameter(orderInitiationPageData, "orderInitiationPageData");
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.f139920a = orderInitiationPageData;
        this.f139921b = orders;
    }

    public /* synthetic */ n(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
