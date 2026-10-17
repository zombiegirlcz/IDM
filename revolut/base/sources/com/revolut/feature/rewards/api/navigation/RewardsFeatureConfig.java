package com.revolut.feature.rewards.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rewards.api.model.rewards.RewardOutlet;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/rewards/api/navigation/RewardsFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "RewardDetails", "hgc/a", "Lcom/revolut/feature/rewards/api/navigation/RewardsFeatureConfig$RewardDetails;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RewardsFeatureConfig implements FeatureConfig {
    private RewardsFeatureConfig() {
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/navigation/RewardsFeatureConfig$RewardDetails;", "Lcom/revolut/feature/rewards/api/navigation/RewardsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RewardDetails extends RewardsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<RewardDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f84902c;
        public final boolean d;
        public final RewardOutlet e;
        public final boolean f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                RewardOutlet rewardOutlet;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z4 = false;
                }
                RewardOutlet rewardOutletCreateFromParcel = parcel.readInt() == 0 ? null : RewardOutlet.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    rewardOutlet = rewardOutletCreateFromParcel;
                    z3 = z;
                } else {
                    z3 = false;
                    rewardOutlet = rewardOutletCreateFromParcel;
                }
                return new RewardDetails(rewardOutlet, string, string2, string3, z4, z3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RewardDetails[i];
            }
        }

        public RewardDetails(RewardOutlet rewardOutlet, String rewardId, String source, String str, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(rewardId, "rewardId");
            Intrinsics.checkNotNullParameter(source, "source");
            this.f84900a = rewardId;
            this.f84901b = source;
            this.f84902c = str;
            this.d = z;
            this.e = rewardOutlet;
            this.f = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RewardDetails)) {
                return false;
            }
            RewardDetails rewardDetails = (RewardDetails) obj2;
            return Intrinsics.f(this.f84900a, rewardDetails.f84900a) && Intrinsics.f(this.f84901b, rewardDetails.f84901b) && Intrinsics.f(this.f84902c, rewardDetails.f84902c) && this.d == rewardDetails.d && Intrinsics.f(this.e, rewardDetails.e) && this.f == rewardDetails.f;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f84900a.hashCode() * 31, 31, this.f84901b);
            String str = this.f84902c;
            int iC2 = j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
            RewardOutlet rewardOutlet = this.e;
            return Boolean.hashCode(this.f) + ((iC2 + (rewardOutlet != null ? rewardOutlet.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84900a);
            dest.writeString(this.f84901b);
            dest.writeString(this.f84902c);
            dest.writeInt(this.d ? 1 : 0);
            RewardOutlet rewardOutlet = this.e;
            if (rewardOutlet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                rewardOutlet.writeToParcel(dest, i);
            }
            dest.writeInt(this.f ? 1 : 0);
        }

        public /* synthetic */ RewardDetails(String str, String str2, int i) {
            this(null, str, str2, null, false, false);
        }
    }
}
