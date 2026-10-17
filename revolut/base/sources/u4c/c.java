package u4c;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f277309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t4c.a f277310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f277311c;

    public c(xi0.b currency, t4c.a breakdownStyle, Data revolutXOrders) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(breakdownStyle, "breakdownStyle");
        Intrinsics.checkNotNullParameter(revolutXOrders, "revolutXOrders");
        this.f277309a = currency;
        this.f277310b = breakdownStyle;
        this.f277311c = revolutXOrders;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f277309a, cVar.f277309a) && this.f277310b == cVar.f277310b && Intrinsics.f(this.f277311c, cVar.f277311c);
    }

    public final int hashCode() {
        return this.f277311c.hashCode() + ((this.f277310b.hashCode() + (this.f277309a.hashCode() * 31)) * 31);
    }
}
