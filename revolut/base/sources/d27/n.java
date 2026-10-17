package d27;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f110756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f110757b;

    public n() {
        this(0);
    }

    public static n a(n nVar, Data currencyData, long j2, int i) {
        if ((i & 1) != 0) {
            currencyData = nVar.f110756a;
        }
        if ((i & 2) != 0) {
            j2 = nVar.f110757b;
        }
        nVar.getClass();
        Intrinsics.checkNotNullParameter(currencyData, "currencyData");
        return new n(currencyData, j2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f110756a, nVar.f110756a) && this.f110757b == nVar.f110757b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f110757b) + (this.f110756a.hashCode() * 31);
    }

    public n(Data currencyData, long j2) {
        Intrinsics.checkNotNullParameter(currencyData, "currencyData");
        this.f110756a = currencyData;
        this.f110757b = j2;
    }

    public /* synthetic */ n(int i) {
        this(new Data(null, null, true, 3, null), 0L);
    }
}
