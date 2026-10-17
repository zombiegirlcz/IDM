package cab;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f22583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f22584c;
    public final List d;

    public g(String amount, Long l2, Data accountData, List validationErrors) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(accountData, "accountData");
        Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
        this.f22582a = amount;
        this.f22583b = l2;
        this.f22584c = accountData;
        this.d = validationErrors;
    }

    public static g a(g gVar, String amount, Long l2, Data accountData, List validationErrors, int i) {
        if ((i & 1) != 0) {
            amount = gVar.f22582a;
        }
        if ((i & 2) != 0) {
            l2 = gVar.f22583b;
        }
        if ((i & 4) != 0) {
            accountData = gVar.f22584c;
        }
        if ((i & 8) != 0) {
            validationErrors = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(accountData, "accountData");
        Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
        return new g(amount, l2, accountData, validationErrors);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f22582a, gVar.f22582a) && Intrinsics.f(this.f22583b, gVar.f22583b) && Intrinsics.f(this.f22584c, gVar.f22584c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f22582a.hashCode() * 31;
        Long l2 = this.f22583b;
        return this.d.hashCode() + kii.e.c(this.f22584c, (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31);
    }
}
