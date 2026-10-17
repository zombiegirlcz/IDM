package s47;

import com.revolut.data.model.Data;
import ds6.f0;
import ds6.g0;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f259785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f259786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f259787c;
    public final Set d;
    public final int e;
    public final Map f;

    public j(f0 direction, Data reviewData, Data userData, Set excludedTransactions, int i) {
        g0 g0Var;
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(reviewData, "reviewData");
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(excludedTransactions, "excludedTransactions");
        this.f259785a = direction;
        this.f259786b = reviewData;
        this.f259787c = userData;
        this.d = excludedTransactions;
        this.e = i;
        i iVar = (i) reviewData.getContent();
        Map map = (iVar == null || (g0Var = iVar.f259783a) == null) ? null : g0Var.f117237a;
        this.f = map == null ? r0.g() : map;
    }

    public static j a(j jVar, Data data, Data data2, Set set, int i) {
        f0 direction = jVar.f259785a;
        if ((i & 2) != 0) {
            data = jVar.f259786b;
        }
        Data reviewData = data;
        if ((i & 4) != 0) {
            data2 = jVar.f259787c;
        }
        Data userData = data2;
        if ((i & 8) != 0) {
            set = jVar.d;
        }
        Set excludedTransactions = set;
        int i2 = jVar.e;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(reviewData, "reviewData");
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(excludedTransactions, "excludedTransactions");
        return new j(direction, reviewData, userData, excludedTransactions, i2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f259785a == jVar.f259785a && Intrinsics.f(this.f259786b, jVar.f259786b) && Intrinsics.f(this.f259787c, jVar.f259787c) && Intrinsics.f(this.d, jVar.d) && this.e == jVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + p.a.f(kii.e.c(this.f259787c, kii.e.c(this.f259786b, this.f259785a.hashCode() * 31, 31), 31), 31, this.d);
    }
}
