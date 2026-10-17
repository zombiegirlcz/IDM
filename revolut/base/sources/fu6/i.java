package fu6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f138088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f138089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f138090c;
    public final Data d;

    public i() {
        this(0);
    }

    public static i a(i iVar, Data accountDetailsData, Data lineItemsData, Data orderDetailsData, Data paymentDetailsData, int i) {
        if ((i & 1) != 0) {
            accountDetailsData = iVar.f138088a;
        }
        if ((i & 2) != 0) {
            lineItemsData = iVar.f138089b;
        }
        if ((i & 4) != 0) {
            orderDetailsData = iVar.f138090c;
        }
        if ((i & 8) != 0) {
            paymentDetailsData = iVar.d;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(accountDetailsData, "accountDetailsData");
        Intrinsics.checkNotNullParameter(lineItemsData, "lineItemsData");
        Intrinsics.checkNotNullParameter(orderDetailsData, "orderDetailsData");
        Intrinsics.checkNotNullParameter(paymentDetailsData, "paymentDetailsData");
        return new i(accountDetailsData, lineItemsData, orderDetailsData, paymentDetailsData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f138088a, iVar.f138088a) && Intrinsics.f(this.f138089b, iVar.f138089b) && Intrinsics.f(this.f138090c, iVar.f138090c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f138090c, kii.e.c(this.f138089b, this.f138088a.hashCode() * 31, 31), 31);
    }

    public i(Data accountDetailsData, Data lineItemsData, Data orderDetailsData, Data paymentDetailsData) {
        Intrinsics.checkNotNullParameter(accountDetailsData, "accountDetailsData");
        Intrinsics.checkNotNullParameter(lineItemsData, "lineItemsData");
        Intrinsics.checkNotNullParameter(orderDetailsData, "orderDetailsData");
        Intrinsics.checkNotNullParameter(paymentDetailsData, "paymentDetailsData");
        this.f138088a = accountDetailsData;
        this.f138089b = lineItemsData;
        this.f138090c = orderDetailsData;
        this.d = paymentDetailsData;
    }

    public /* synthetic */ i(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
