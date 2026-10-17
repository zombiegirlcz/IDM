package gs2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f146281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f146282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f146283c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f146284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k71.q f146285h;

    public i(Data blockedSubscriptions, Data blockedMerchants, Data inactiveDirectDebits, Data cancelledPayToSubscriptions, Data cancelledUpiSubscriptions, Data cancelledDirectDebits, boolean z, k71.q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(blockedSubscriptions, "blockedSubscriptions");
        Intrinsics.checkNotNullParameter(blockedMerchants, "blockedMerchants");
        Intrinsics.checkNotNullParameter(inactiveDirectDebits, "inactiveDirectDebits");
        Intrinsics.checkNotNullParameter(cancelledPayToSubscriptions, "cancelledPayToSubscriptions");
        Intrinsics.checkNotNullParameter(cancelledUpiSubscriptions, "cancelledUpiSubscriptions");
        Intrinsics.checkNotNullParameter(cancelledDirectDebits, "cancelledDirectDebits");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        this.f146281a = blockedSubscriptions;
        this.f146282b = blockedMerchants;
        this.f146283c = inactiveDirectDebits;
        this.d = cancelledPayToSubscriptions;
        this.e = cancelledUpiSubscriptions;
        this.f = cancelledDirectDebits;
        this.f146284g = z;
        this.f146285h = transactionsExtraData;
    }

    public static i a(i iVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, boolean z, k71.q qVar, int i) {
        if ((i & 1) != 0) {
            data = iVar.f146281a;
        }
        Data blockedSubscriptions = data;
        if ((i & 2) != 0) {
            data2 = iVar.f146282b;
        }
        Data blockedMerchants = data2;
        if ((i & 4) != 0) {
            data3 = iVar.f146283c;
        }
        Data inactiveDirectDebits = data3;
        if ((i & 8) != 0) {
            data4 = iVar.d;
        }
        Data cancelledPayToSubscriptions = data4;
        if ((i & 16) != 0) {
            data5 = iVar.e;
        }
        Data cancelledUpiSubscriptions = data5;
        if ((i & 32) != 0) {
            data6 = iVar.f;
        }
        Data cancelledDirectDebits = data6;
        boolean z3 = (i & 64) != 0 ? iVar.f146284g : z;
        k71.q transactionsExtraData = (i & 128) != 0 ? iVar.f146285h : qVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(blockedSubscriptions, "blockedSubscriptions");
        Intrinsics.checkNotNullParameter(blockedMerchants, "blockedMerchants");
        Intrinsics.checkNotNullParameter(inactiveDirectDebits, "inactiveDirectDebits");
        Intrinsics.checkNotNullParameter(cancelledPayToSubscriptions, "cancelledPayToSubscriptions");
        Intrinsics.checkNotNullParameter(cancelledUpiSubscriptions, "cancelledUpiSubscriptions");
        Intrinsics.checkNotNullParameter(cancelledDirectDebits, "cancelledDirectDebits");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        return new i(blockedSubscriptions, blockedMerchants, inactiveDirectDebits, cancelledPayToSubscriptions, cancelledUpiSubscriptions, cancelledDirectDebits, z3, transactionsExtraData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f146281a, iVar.f146281a) && Intrinsics.f(this.f146282b, iVar.f146282b) && Intrinsics.f(this.f146283c, iVar.f146283c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && this.f146284g == iVar.f146284g && Intrinsics.f(this.f146285h, iVar.f146285h);
    }

    public final int hashCode() {
        return this.f146285h.hashCode() + j6.a.c(kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f146283c, kii.e.c(this.f146282b, this.f146281a.hashCode() * 31, 31), 31), 31), 31), 31), 31, this.f146284g);
    }
}
