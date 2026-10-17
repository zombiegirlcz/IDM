package com.revolut.retail.feature.pending_payments.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentResult$Navigation", "Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentResult$Timeout;", "", "toString", "()Ljava/lang/String;", "feature_retail_pending_payments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PendingPaymentResult$Navigation implements PendingPaymentResult$Timeout {

    @NotNull
    public static final Parcelable.Creator<PendingPaymentResult$Navigation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParcelableDestination f102413a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PendingPaymentResult$Navigation((ParcelableDestination) parcel.readParcelable(PendingPaymentResult$Navigation.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PendingPaymentResult$Navigation[i];
        }
    }

    public PendingPaymentResult$Navigation(ParcelableDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f102413a = destination;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PendingPaymentResult$Navigation) && Intrinsics.f(this.f102413a, ((PendingPaymentResult$Navigation) obj2).f102413a);
    }

    public final int hashCode() {
        return this.f102413a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f102413a, i);
    }
}
