package com.revolut.feature.junior_rewards.impl.ui.details_dialog;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_rewards/impl/ui/details_dialog/JuniorRewardDetailsDialogScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorRewardDetailsDialogScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<JuniorRewardDetailsDialogScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77233b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorRewardDetailsDialogScreenContract$InputData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorRewardDetailsDialogScreenContract$InputData[i];
        }
    }

    public JuniorRewardDetailsDialogScreenContract$InputData(String juniorId, String rewardId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(rewardId, "rewardId");
        this.f77232a = juniorId;
        this.f77233b = rewardId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorRewardDetailsDialogScreenContract$InputData)) {
            return false;
        }
        JuniorRewardDetailsDialogScreenContract$InputData juniorRewardDetailsDialogScreenContract$InputData = (JuniorRewardDetailsDialogScreenContract$InputData) obj2;
        return Intrinsics.f(this.f77232a, juniorRewardDetailsDialogScreenContract$InputData.f77232a) && Intrinsics.f(this.f77233b, juniorRewardDetailsDialogScreenContract$InputData.f77233b);
    }

    public final int hashCode() {
        return this.f77233b.hashCode() + (this.f77232a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77232a);
        dest.writeString(this.f77233b);
    }
}
