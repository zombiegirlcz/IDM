package tvh;

import com.revolut.data.model.Data;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f274767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274768b;

    public c(Data baseCurrencyAndBalances, String str) {
        Intrinsics.checkNotNullParameter(baseCurrencyAndBalances, "baseCurrencyAndBalances");
        this.f274767a = baseCurrencyAndBalances;
        this.f274768b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f274767a, cVar.f274767a) && Intrinsics.f(this.f274768b, cVar.f274768b);
    }

    public final int hashCode() {
        int iHashCode = this.f274767a.hashCode() * 31;
        String str = this.f274768b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
