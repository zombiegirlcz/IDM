package xd3;

import com.revolut.data.model.Data;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f304251a;

    public b(Data cashbackByCurrenciesData) {
        Intrinsics.checkNotNullParameter(cashbackByCurrenciesData, "cashbackByCurrenciesData");
        this.f304251a = cashbackByCurrenciesData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f304251a, ((b) obj2).f304251a);
    }

    public final int hashCode() {
        return this.f304251a.hashCode();
    }
}
