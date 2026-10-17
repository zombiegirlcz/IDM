package com.revolut.retail.feature.plan_rewards.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/api/navigation/MonthlyDrawsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MonthlyDrawsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<MonthlyDrawsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f102537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f102538b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MonthlyDrawsDestination(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MonthlyDrawsDestination[i];
        }
    }

    public MonthlyDrawsDestination(boolean z, boolean z3) {
        this.f102537a = z;
        this.f102538b = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MonthlyDrawsDestination)) {
            return false;
        }
        MonthlyDrawsDestination monthlyDrawsDestination = (MonthlyDrawsDestination) obj2;
        return this.f102537a == monthlyDrawsDestination.f102537a && this.f102538b == monthlyDrawsDestination.f102538b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f102538b) + (Boolean.hashCode(this.f102537a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f102537a ? 1 : 0);
        dest.writeInt(this.f102538b ? 1 : 0);
    }
}
