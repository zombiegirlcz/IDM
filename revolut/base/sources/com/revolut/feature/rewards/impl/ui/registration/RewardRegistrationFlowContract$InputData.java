package com.revolut.feature.rewards.impl.ui.registration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rewards/impl/ui/registration/RewardRegistrationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RewardRegistrationFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RewardRegistrationFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f84951b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            int iD = 0;
            while (iD != i) {
                iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
            }
            return new RewardRegistrationFlowContract$InputData(string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RewardRegistrationFlowContract$InputData[i];
        }
    }

    public RewardRegistrationFlowContract$InputData(String merchantRef, HashMap parameters) {
        Intrinsics.checkNotNullParameter(merchantRef, "merchantRef");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f84950a = merchantRef;
        this.f84951b = parameters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RewardRegistrationFlowContract$InputData)) {
            return false;
        }
        RewardRegistrationFlowContract$InputData rewardRegistrationFlowContract$InputData = (RewardRegistrationFlowContract$InputData) obj2;
        return Intrinsics.f(this.f84950a, rewardRegistrationFlowContract$InputData.f84950a) && this.f84951b.equals(rewardRegistrationFlowContract$InputData.f84951b);
    }

    public final int hashCode() {
        return this.f84951b.hashCode() + (this.f84950a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84950a);
        HashMap map = this.f84951b;
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }
}
