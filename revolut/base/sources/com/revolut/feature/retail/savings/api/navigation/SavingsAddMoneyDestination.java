package com.revolut.feature.retail.savings.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/api/navigation/SavingsAddMoneyDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavingsAddMoneyDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<SavingsAddMoneyDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f83155b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SavingsAddMoneyDestination(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SavingsAddMoneyDestination[i];
        }
    }

    public SavingsAddMoneyDestination(String savingsAccountId, boolean z) {
        Intrinsics.checkNotNullParameter(savingsAccountId, "savingsAccountId");
        this.f83154a = savingsAccountId;
        this.f83155b = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF83155b() {
        return this.f83155b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF83154a() {
        return this.f83154a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SavingsAddMoneyDestination)) {
            return false;
        }
        SavingsAddMoneyDestination savingsAddMoneyDestination = (SavingsAddMoneyDestination) obj2;
        return Intrinsics.f(this.f83154a, savingsAddMoneyDestination.f83154a) && this.f83155b == savingsAddMoneyDestination.f83155b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f83155b) + (this.f83154a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f83154a);
        dest.writeInt(this.f83155b ? 1 : 0);
    }
}
