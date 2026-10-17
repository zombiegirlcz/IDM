package lbc;

import com.revolut.data.model.Data;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f193637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f193638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f193639c;
    public final Set d;
    public final boolean e;
    public final boolean f;

    public m(Data orderDetails, Data linkedTransactionContent, Data popUpMenuItems, Set userToggledDeliveries, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(orderDetails, "orderDetails");
        Intrinsics.checkNotNullParameter(linkedTransactionContent, "linkedTransactionContent");
        Intrinsics.checkNotNullParameter(popUpMenuItems, "popUpMenuItems");
        Intrinsics.checkNotNullParameter(userToggledDeliveries, "userToggledDeliveries");
        this.f193637a = orderDetails;
        this.f193638b = linkedTransactionContent;
        this.f193639c = popUpMenuItems;
        this.d = userToggledDeliveries;
        this.e = z;
        this.f = z3;
    }

    public static m a(m mVar, Data data, Data data2, Data data3, LinkedHashSet linkedHashSet, boolean z, int i) {
        if ((i & 1) != 0) {
            data = mVar.f193637a;
        }
        Data orderDetails = data;
        if ((i & 2) != 0) {
            data2 = mVar.f193638b;
        }
        Data linkedTransactionContent = data2;
        if ((i & 4) != 0) {
            data3 = mVar.f193639c;
        }
        Data popUpMenuItems = data3;
        Set set = linkedHashSet;
        if ((i & 8) != 0) {
            set = mVar.d;
        }
        Set userToggledDeliveries = set;
        boolean z3 = mVar.e;
        if ((i & 32) != 0) {
            z = mVar.f;
        }
        mVar.getClass();
        Intrinsics.checkNotNullParameter(orderDetails, "orderDetails");
        Intrinsics.checkNotNullParameter(linkedTransactionContent, "linkedTransactionContent");
        Intrinsics.checkNotNullParameter(popUpMenuItems, "popUpMenuItems");
        Intrinsics.checkNotNullParameter(userToggledDeliveries, "userToggledDeliveries");
        return new m(orderDetails, linkedTransactionContent, popUpMenuItems, userToggledDeliveries, z3, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f193637a, mVar.f193637a) && Intrinsics.f(this.f193638b, mVar.f193638b) && Intrinsics.f(this.f193639c, mVar.f193639c) && Intrinsics.f(this.d, mVar.d) && this.e == mVar.e && this.f == mVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(p.a.f(kii.e.c(this.f193639c, kii.e.c(this.f193638b, this.f193637a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e);
    }
}
