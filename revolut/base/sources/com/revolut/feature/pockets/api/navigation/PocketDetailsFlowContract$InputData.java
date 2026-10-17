package com.revolut.feature.pockets.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import h30.l;
import io3.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pockets/api/navigation/PocketDetailsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pockets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PocketDetailsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PocketDetailsFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f80771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f80772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f80773c;
    public final boolean d;
    public final b e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f80774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CheckoutParams f80775h;
    public final CheckoutOrder i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final NaviCommand f80776j;
    public final PocketDetailsInitialAction k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f80777l;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            boolean z4;
            b bVar;
            boolean z6;
            boolean z11;
            CheckoutParams checkoutParams;
            NaviCommand naviCommand;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            AccountId accountId = (AccountId) parcel.readParcelable(PocketDetailsFlowContract$InputData.class.getClassLoader());
            boolean z12 = false;
            boolean z29 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z12 = true;
            } else {
                z = false;
            }
            b bVar2 = (b) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z3 = z;
                z = true;
            } else {
                z3 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
                bVar = bVar2;
                z6 = true;
            } else {
                z4 = true;
                bVar = bVar2;
                z6 = z3;
            }
            CheckoutParams checkoutParams2 = (CheckoutParams) parcel.readParcelable(PocketDetailsFlowContract$InputData.class.getClassLoader());
            CheckoutOrder checkoutOrder = (CheckoutOrder) parcel.readParcelable(PocketDetailsFlowContract$InputData.class.getClassLoader());
            NaviCommand naviCommand2 = (NaviCommand) parcel.readParcelable(PocketDetailsFlowContract$InputData.class.getClassLoader());
            PocketDetailsInitialAction pocketDetailsInitialAction = (PocketDetailsInitialAction) parcel.readParcelable(PocketDetailsFlowContract$InputData.class.getClassLoader());
            if (parcel.readInt() != 0) {
                checkoutParams = checkoutParams2;
                naviCommand = naviCommand2;
                z11 = z4;
            } else {
                z11 = z3;
                checkoutParams = checkoutParams2;
                naviCommand = naviCommand2;
            }
            return new PocketDetailsFlowContract$InputData(dVar, accountId, z29, z12, bVar, z, z6, checkoutParams, checkoutOrder, naviCommand, pocketDetailsInitialAction, z11);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PocketDetailsFlowContract$InputData[i];
        }
    }

    public PocketDetailsFlowContract$InputData(d pocket, AccountId accountId, boolean z, boolean z3, b bVar, boolean z4, boolean z6, CheckoutParams checkoutParams, CheckoutOrder checkoutOrder, NaviCommand naviCommand, PocketDetailsInitialAction pocketDetailsInitialAction, boolean z11) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(checkoutOrder, "checkoutOrder");
        this.f80771a = pocket;
        this.f80772b = accountId;
        this.f80773c = z;
        this.d = z3;
        this.e = bVar;
        this.f = z4;
        this.f80774g = z6;
        this.f80775h = checkoutParams;
        this.i = checkoutOrder;
        this.f80776j = naviCommand;
        this.k = pocketDetailsInitialAction;
        this.f80777l = z11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PocketDetailsFlowContract$InputData)) {
            return false;
        }
        PocketDetailsFlowContract$InputData pocketDetailsFlowContract$InputData = (PocketDetailsFlowContract$InputData) obj2;
        return Intrinsics.f(this.f80771a, pocketDetailsFlowContract$InputData.f80771a) && Intrinsics.f(this.f80772b, pocketDetailsFlowContract$InputData.f80772b) && this.f80773c == pocketDetailsFlowContract$InputData.f80773c && this.d == pocketDetailsFlowContract$InputData.d && Intrinsics.f(this.e, pocketDetailsFlowContract$InputData.e) && this.f == pocketDetailsFlowContract$InputData.f && this.f80774g == pocketDetailsFlowContract$InputData.f80774g && Intrinsics.f(this.f80775h, pocketDetailsFlowContract$InputData.f80775h) && Intrinsics.f(this.i, pocketDetailsFlowContract$InputData.i) && Intrinsics.f(this.f80776j, pocketDetailsFlowContract$InputData.f80776j) && Intrinsics.f(this.k, pocketDetailsFlowContract$InputData.k) && this.f80777l == pocketDetailsFlowContract$InputData.f80777l;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(l.b(this.f80772b, this.f80771a.hashCode() * 31, 31), 31, this.f80773c), 31, this.d);
        b bVar = this.e;
        int iC2 = j6.a.c(j6.a.c((iC + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31, 31, this.f), 31, this.f80774g);
        CheckoutParams checkoutParams = this.f80775h;
        int iHashCode = (this.i.hashCode() + ((iC2 + (checkoutParams == null ? 0 : checkoutParams.hashCode())) * 31)) * 31;
        NaviCommand naviCommand = this.f80776j;
        int iHashCode2 = (iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
        PocketDetailsInitialAction pocketDetailsInitialAction = this.k;
        return Boolean.hashCode(this.f80777l) + ((iHashCode2 + (pocketDetailsInitialAction != null ? pocketDetailsInitialAction.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f80771a);
        dest.writeParcelable(this.f80772b, i);
        dest.writeInt(this.f80773c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeSerializable(this.e);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f80774g ? 1 : 0);
        dest.writeParcelable(this.f80775h, i);
        dest.writeParcelable(this.i, i);
        dest.writeParcelable(this.f80776j, i);
        dest.writeParcelable(this.k, i);
        dest.writeInt(this.f80777l ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PocketDetailsFlowContract$InputData(d dVar, AccountId accountId, boolean z, boolean z3, b bVar, boolean z4, boolean z6, CheckoutParams checkoutParams, CheckoutOrder checkoutOrder, PocketDetailsInitialAction pocketDetailsInitialAction, boolean z11, int i) {
        CheckoutOrder checkoutOrder2;
        b bVar2 = (i & 16) != 0 ? null : bVar;
        boolean z12 = (i & 32) != 0 ? false : z4;
        boolean z29 = (i & 64) != 0 ? false : z6;
        CheckoutParams checkoutParams2 = (i & 128) != 0 ? null : checkoutParams;
        if ((i & 256) != 0) {
            CheckoutOrder.INSTANCE.getClass();
            checkoutOrder2 = CheckoutOrder.f65846g;
        } else {
            checkoutOrder2 = checkoutOrder;
        }
        this(dVar, accountId, z, z3, bVar2, z12, z29, checkoutParams2, checkoutOrder2, (NaviCommand) null, (i & 1024) != 0 ? null : pocketDetailsInitialAction, (i & 2048) != 0 ? false : z11);
    }
}
