package com.revolut.feature.payments.splitbill.api.navigation;

import aii.e;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/payments/splitbill/api/navigation/SplitBillQrDescriptor;", "Laii/e;", "Laii/q;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplitBillQrDescriptor implements e, Parcelable {

    @NotNull
    public static final Parcelable.Creator<SplitBillQrDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitBillQrInputData f79827a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SplitBillQrDescriptor(SplitBillQrInputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SplitBillQrDescriptor[i];
        }
    }

    public SplitBillQrDescriptor(SplitBillQrInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f79827a = inputData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SplitBillQrDescriptor) && Intrinsics.f(this.f79827a, ((SplitBillQrDescriptor) obj2).f79827a);
    }

    public final int hashCode() {
        return this.f79827a.f79828a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f79827a.writeToParcel(dest, i);
    }
}
