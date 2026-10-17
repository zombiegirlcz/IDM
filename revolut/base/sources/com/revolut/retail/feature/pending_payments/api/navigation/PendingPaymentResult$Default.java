package com.revolut.retail.feature.pending_payments.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentResult$Default", "Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentResult$Accept;", "Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentResult$Decline;", "Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentResult$Timeout;", "<init>", "()V", "feature_retail_pending_payments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PendingPaymentResult$Default implements PendingPaymentResult$Accept, PendingPaymentResult$Decline, PendingPaymentResult$Timeout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PendingPaymentResult$Default f102412a = new PendingPaymentResult$Default();

    @NotNull
    public static final Parcelable.Creator<PendingPaymentResult$Default> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return PendingPaymentResult$Default.f102412a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PendingPaymentResult$Default[i];
        }
    }

    private PendingPaymentResult$Default() {
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
