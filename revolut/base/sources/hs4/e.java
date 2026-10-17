package hs4;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.instalment.past.CreditCardInstalmentsScreenContract$InstalmentFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f154987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardInstalmentsScreenContract$InstalmentFilter f154988b;

    public e(Data model, CreditCardInstalmentsScreenContract$InstalmentFilter filter) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f154987a = model;
        this.f154988b = filter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f154987a, eVar.f154987a) && Intrinsics.f(this.f154988b, eVar.f154988b);
    }

    public final int hashCode() {
        return this.f154988b.hashCode() + (this.f154987a.hashCode() * 31);
    }
}
