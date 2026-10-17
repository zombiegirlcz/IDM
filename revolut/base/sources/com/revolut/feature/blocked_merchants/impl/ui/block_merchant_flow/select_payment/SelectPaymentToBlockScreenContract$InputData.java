package com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.ContentUser;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/blocked_merchants/impl/ui/block_merchant_flow/select_payment/SelectPaymentToBlockScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_blocked_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectPaymentToBlockScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SelectPaymentToBlockScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentUser f64261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SelectPaymentToBlockScreenContract$ScreenType f64262b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectPaymentToBlockScreenContract$InputData((ContentUser) parcel.readParcelable(SelectPaymentToBlockScreenContract$InputData.class.getClassLoader()), (SelectPaymentToBlockScreenContract$ScreenType) parcel.readParcelable(SelectPaymentToBlockScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectPaymentToBlockScreenContract$InputData[i];
        }
    }

    public SelectPaymentToBlockScreenContract$InputData(ContentUser contentUser, SelectPaymentToBlockScreenContract$ScreenType screenType) {
        Intrinsics.checkNotNullParameter(contentUser, "contentUser");
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        this.f64261a = contentUser;
        this.f64262b = screenType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelectPaymentToBlockScreenContract$InputData)) {
            return false;
        }
        SelectPaymentToBlockScreenContract$InputData selectPaymentToBlockScreenContract$InputData = (SelectPaymentToBlockScreenContract$InputData) obj2;
        return Intrinsics.f(this.f64261a, selectPaymentToBlockScreenContract$InputData.f64261a) && Intrinsics.f(this.f64262b, selectPaymentToBlockScreenContract$InputData.f64262b);
    }

    public final int hashCode() {
        return this.f64262b.hashCode() + (this.f64261a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f64261a, i);
        dest.writeParcelable(this.f64262b, i);
    }
}
