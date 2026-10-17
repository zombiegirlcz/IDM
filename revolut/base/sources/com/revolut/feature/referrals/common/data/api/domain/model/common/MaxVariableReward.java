package com.revolut.feature.referrals.common.data.api.domain.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/common/data/api/domain/model/common/MaxVariableReward;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_common_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MaxVariableReward implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MaxVariableReward> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f81745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81746b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MaxVariableReward((d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MaxVariableReward[i];
        }
    }

    public MaxVariableReward(d money, String str) {
        Intrinsics.checkNotNullParameter(money, "money");
        this.f81745a = money;
        this.f81746b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MaxVariableReward)) {
            return false;
        }
        MaxVariableReward maxVariableReward = (MaxVariableReward) obj2;
        return Intrinsics.f(this.f81745a, maxVariableReward.f81745a) && Intrinsics.f(this.f81746b, maxVariableReward.f81746b);
    }

    public final int hashCode() {
        int iHashCode = this.f81745a.hashCode() * 31;
        String str = this.f81746b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f81745a);
        dest.writeString(this.f81746b);
    }
}
