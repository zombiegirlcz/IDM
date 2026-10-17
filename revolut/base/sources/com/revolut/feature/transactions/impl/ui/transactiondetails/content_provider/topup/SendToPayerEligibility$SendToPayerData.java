package com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.SendToPayerEligibility$State;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transactions/impl/ui/transactiondetails/content_provider/topup/SendToPayerEligibility$SendToPayerData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SendToPayerEligibility$SendToPayerData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SendToPayerEligibility$SendToPayerData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SendToPayerEligibility$State.Enabled f92097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92098b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SendToPayerEligibility$SendToPayerData(SendToPayerEligibility$State.Enabled.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SendToPayerEligibility$SendToPayerData[i];
        }
    }

    public SendToPayerEligibility$SendToPayerData(SendToPayerEligibility$State.Enabled state, String str) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f92097a = state;
        this.f92098b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SendToPayerEligibility$SendToPayerData)) {
            return false;
        }
        SendToPayerEligibility$SendToPayerData sendToPayerEligibility$SendToPayerData = (SendToPayerEligibility$SendToPayerData) obj2;
        return Intrinsics.f(this.f92097a, sendToPayerEligibility$SendToPayerData.f92097a) && Intrinsics.f(this.f92098b, sendToPayerEligibility$SendToPayerData.f92098b);
    }

    public final int hashCode() {
        int iHashCode = this.f92097a.hashCode() * 31;
        String str = this.f92098b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f92097a.writeToParcel(dest, i);
        dest.writeString(this.f92098b);
    }
}
