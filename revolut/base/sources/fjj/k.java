package fjj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f135657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f135658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f135659c;
    public final Data d;
    public final Data e;

    public k(Data pocket, Data esimSubscription, Data revPointsAccountStatus, Data giftRecipient, boolean z) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(esimSubscription, "esimSubscription");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        Intrinsics.checkNotNullParameter(giftRecipient, "giftRecipient");
        this.f135657a = pocket;
        this.f135658b = esimSubscription;
        this.f135659c = z;
        this.d = revPointsAccountStatus;
        this.e = giftRecipient;
    }

    public static k a(k kVar, Data data, Data data2, boolean z, Data data3, Data data4, int i) {
        if ((i & 1) != 0) {
            data = kVar.f135657a;
        }
        Data pocket = data;
        if ((i & 2) != 0) {
            data2 = kVar.f135658b;
        }
        Data esimSubscription = data2;
        if ((i & 4) != 0) {
            z = kVar.f135659c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            data3 = kVar.d;
        }
        Data revPointsAccountStatus = data3;
        if ((i & 16) != 0) {
            data4 = kVar.e;
        }
        Data giftRecipient = data4;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(esimSubscription, "esimSubscription");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        Intrinsics.checkNotNullParameter(giftRecipient, "giftRecipient");
        return new k(pocket, esimSubscription, revPointsAccountStatus, giftRecipient, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f135657a, kVar.f135657a) && Intrinsics.f(this.f135658b, kVar.f135658b) && this.f135659c == kVar.f135659c && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kii.e.c(this.d, j6.a.c(kii.e.c(this.f135658b, this.f135657a.hashCode() * 31, 31), 31, this.f135659c), 31);
    }
}
