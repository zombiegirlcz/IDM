package cp4;

import com.google.gson.reflect.TypeToken;
import ft3.g1;
import ft3.j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ll4.c f107832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f107833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107834c;

    public n(ll4.c entryPointType, List productTypes) {
        Intrinsics.checkNotNullParameter(entryPointType, "entryPointType");
        Intrinsics.checkNotNullParameter(productTypes, "productTypes");
        this.f107832a = entryPointType;
        this.f107833b = productTypes;
        String strName = entryPointType.name();
        List list = productTypes;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(g1.i((j1) it8.next()));
        }
        this.f107834c = a0.d.s("credit_card_entry_points_", strName, "_", zhm.d0.k0(zhm.d0.O0(arrayList), "_", null, null, 0, null, 62));
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<List<? extends xo4.k>>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$EntryPoints$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f107832a == nVar.f107832a && Intrinsics.f(this.f107833b, nVar.f107833b);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107834c;
    }

    public final int hashCode() {
        return this.f107833b.hashCode() + (this.f107832a.hashCode() * 31);
    }
}
