package od3;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b0 extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f224262a;

    public b0(Data transactionsData) {
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        this.f224262a = transactionsData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f224262a, ((b0) obj2).f224262a);
    }

    public final int hashCode() {
        return this.f224262a.hashCode();
    }
}
