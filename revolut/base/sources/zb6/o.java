package zb6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f320816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f320817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f320818c;

    public o(Data charity, Data currency, Data moneyInputState) {
        Intrinsics.checkNotNullParameter(charity, "charity");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(moneyInputState, "moneyInputState");
        this.f320816a = charity;
        this.f320817b = currency;
        this.f320818c = moneyInputState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f320816a, oVar.f320816a) && Intrinsics.f(this.f320817b, oVar.f320817b) && Intrinsics.f(this.f320818c, oVar.f320818c);
    }

    public final int hashCode() {
        return this.f320818c.hashCode() + kii.e.c(this.f320817b, this.f320816a.hashCode() * 31, 31);
    }
}
