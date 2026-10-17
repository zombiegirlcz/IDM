package dtf;

import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f117444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f117445b;

    public e(dj0.d amount, Map allocation) {
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f117444a = allocation;
        this.f117445b = amount;
    }

    public final dj0.d a() {
        Collection collectionValues = this.f117444a.values();
        dj0.d.Companion.getClass();
        dj0.d dVarO = dj0.d.e;
        int i = 0;
        for (Object obj2 : collectionValues) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            dVarO = i == 0 ? (dj0.d) obj2 : pyd.c.O(dVarO, (dj0.d) obj2);
            i = i2;
        }
        return dVarO;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f117444a, eVar.f117444a) && Intrinsics.f(this.f117445b, eVar.f117445b);
    }

    public final int hashCode() {
        return this.f117445b.hashCode() + (this.f117444a.hashCode() * 31);
    }
}
