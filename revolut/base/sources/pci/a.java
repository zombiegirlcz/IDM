package pci;

import aii.e;
import com.revolut.feature_retail_user_declarations.transaction_countries.TransactionCountriesInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionCountriesInputData f234918a;

    public a(TransactionCountriesInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f234918a = inputData;
    }

    public final TransactionCountriesInputData b() {
        return this.f234918a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f234918a, ((a) obj2).f234918a);
    }

    public final int hashCode() {
        return this.f234918a.hashCode();
    }
}
