package com.revolut.retail.feature.pending_payments.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentResult$ReturnUrl", "Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentResult$Accept;", "Lcom/revolut/retail/feature/pending_payments/api/navigation/PendingPaymentResult$Decline;", "", "toString", "()Ljava/lang/String;", "feature_retail_pending_payments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PendingPaymentResult$ReturnUrl implements PendingPaymentResult$Accept, PendingPaymentResult$Decline {

    @NotNull
    public static final Parcelable.Creator<PendingPaymentResult$ReturnUrl> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102414a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PendingPaymentResult$ReturnUrl(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PendingPaymentResult$ReturnUrl[i];
        }
    }

    public PendingPaymentResult$ReturnUrl(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f102414a = url2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PendingPaymentResult$ReturnUrl) && Intrinsics.f(this.f102414a, ((PendingPaymentResult$ReturnUrl) obj2).f102414a);
    }

    public final int hashCode() {
        return this.f102414a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102414a);
    }
}
