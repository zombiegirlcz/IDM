package com.revolut.feature.payments.who_to_transfer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/payments/who_to_transfer/api/navigation/AdditionalConfig$StraightToCardTransferDisabled", "", "<init>", "()V", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdditionalConfig$StraightToCardTransferDisabled implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AdditionalConfig$StraightToCardTransferDisabled f80010a = new AdditionalConfig$StraightToCardTransferDisabled();

    @NotNull
    public static final Parcelable.Creator<AdditionalConfig$StraightToCardTransferDisabled> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return AdditionalConfig$StraightToCardTransferDisabled.f80010a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdditionalConfig$StraightToCardTransferDisabled[i];
        }
    }

    private AdditionalConfig$StraightToCardTransferDisabled() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
