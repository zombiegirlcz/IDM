package com.revolut.feature.three_ds_verification.impl.ui.merchant_redirect;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.transactions.ThreeDSTransaction;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/three_ds_verification/impl/ui/merchant_redirect/MerchantRedirectFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_three_ds_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MerchantRedirectFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<MerchantRedirectFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreeDSTransaction f90401a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MerchantRedirectFlowContract$InputData((ThreeDSTransaction) parcel.readParcelable(MerchantRedirectFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MerchantRedirectFlowContract$InputData[i];
        }
    }

    public MerchantRedirectFlowContract$InputData(ThreeDSTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f90401a = transaction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof MerchantRedirectFlowContract$InputData) && Intrinsics.f(this.f90401a, ((MerchantRedirectFlowContract$InputData) obj2).f90401a);
    }

    public final int hashCode() {
        return this.f90401a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f90401a, i);
    }
}
