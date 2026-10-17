package com.revolut.feature.topup_screen.api.destination;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.topup_screen.api.model.CheckoutCustomAmountLimit;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/api/destination/CheckoutCustomAmountBridgeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CheckoutCustomAmountBridgeDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CheckoutCustomAmountBridgeDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f90504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CheckoutCustomAmountLimit f90505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f90506c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckoutCustomAmountBridgeDestination((d) parcel.readSerializable(), (CheckoutCustomAmountLimit) parcel.readParcelable(CheckoutCustomAmountBridgeDestination.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CheckoutCustomAmountBridgeDestination[i];
        }
    }

    public CheckoutCustomAmountBridgeDestination(d customAmount, CheckoutCustomAmountLimit limit, String resultKey) {
        Intrinsics.checkNotNullParameter(customAmount, "customAmount");
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(resultKey, "resultKey");
        this.f90504a = customAmount;
        this.f90505b = limit;
        this.f90506c = resultKey;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getF90504a() {
        return this.f90504a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CheckoutCustomAmountLimit getF90505b() {
        return this.f90505b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF90506c() {
        return this.f90506c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CheckoutCustomAmountBridgeDestination)) {
            return false;
        }
        CheckoutCustomAmountBridgeDestination checkoutCustomAmountBridgeDestination = (CheckoutCustomAmountBridgeDestination) obj2;
        return Intrinsics.f(this.f90504a, checkoutCustomAmountBridgeDestination.f90504a) && Intrinsics.f(this.f90505b, checkoutCustomAmountBridgeDestination.f90505b) && Intrinsics.f(this.f90506c, checkoutCustomAmountBridgeDestination.f90506c);
    }

    public final int hashCode() {
        return this.f90506c.hashCode() + ((this.f90505b.hashCode() + (this.f90504a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90504a);
        dest.writeParcelable(this.f90505b, i);
        dest.writeString(this.f90506c);
    }
}
