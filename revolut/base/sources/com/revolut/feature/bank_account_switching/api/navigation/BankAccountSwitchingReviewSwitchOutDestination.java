package com.revolut.feature.bank_account_switching.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/api/navigation/BankAccountSwitchingReviewSwitchOutDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BankAccountSwitchingReviewSwitchOutDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<BankAccountSwitchingReviewSwitchOutDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn2.a f63890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63891b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BankAccountSwitchingReviewSwitchOutDestination(parcel.readString(), mn2.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BankAccountSwitchingReviewSwitchOutDestination[i];
        }
    }

    public BankAccountSwitchingReviewSwitchOutDestination(String requestId, mn2.a serviceType) {
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.f63890a = serviceType;
        this.f63891b = requestId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BankAccountSwitchingReviewSwitchOutDestination)) {
            return false;
        }
        BankAccountSwitchingReviewSwitchOutDestination bankAccountSwitchingReviewSwitchOutDestination = (BankAccountSwitchingReviewSwitchOutDestination) obj2;
        return this.f63890a == bankAccountSwitchingReviewSwitchOutDestination.f63890a && Intrinsics.f(this.f63891b, bankAccountSwitchingReviewSwitchOutDestination.f63891b);
    }

    public final int hashCode() {
        return this.f63891b.hashCode() + (this.f63890a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63890a.name());
        dest.writeString(this.f63891b);
    }
}
