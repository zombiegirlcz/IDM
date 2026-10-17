package en8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f127763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f127764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f127765c;

    public e(Data savings, Data juniorProfile, Data juniorSavingProduct) {
        Intrinsics.checkNotNullParameter(savings, "savings");
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(juniorSavingProduct, "juniorSavingProduct");
        this.f127763a = savings;
        this.f127764b = juniorProfile;
        this.f127765c = juniorSavingProduct;
    }

    public static e a(e eVar, Data savings, Data juniorProfile, Data juniorSavingProduct, int i) {
        if ((i & 1) != 0) {
            savings = eVar.f127763a;
        }
        if ((i & 2) != 0) {
            juniorProfile = eVar.f127764b;
        }
        if ((i & 4) != 0) {
            juniorSavingProduct = eVar.f127765c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(savings, "savings");
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(juniorSavingProduct, "juniorSavingProduct");
        return new e(savings, juniorProfile, juniorSavingProduct);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f127763a, eVar.f127763a) && Intrinsics.f(this.f127764b, eVar.f127764b) && Intrinsics.f(this.f127765c, eVar.f127765c);
    }

    public final int hashCode() {
        return this.f127765c.hashCode() + kii.e.c(this.f127764b, this.f127763a.hashCode() * 31, 31);
    }
}
