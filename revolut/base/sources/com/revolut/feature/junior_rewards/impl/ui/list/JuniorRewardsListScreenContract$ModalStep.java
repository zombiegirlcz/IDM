package com.revolut.feature.junior_rewards.impl.ui.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/junior_rewards/impl/ui/list/JuniorRewardsListScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "JuniorRewardDetails", "Lcom/revolut/feature/junior_rewards/impl/ui/list/JuniorRewardsListScreenContract$ModalStep$JuniorRewardDetails;", "feature_junior_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JuniorRewardsListScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_rewards/impl/ui/list/JuniorRewardsListScreenContract$ModalStep$JuniorRewardDetails;", "Lcom/revolut/feature/junior_rewards/impl/ui/list/JuniorRewardsListScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_junior_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorRewardDetails extends JuniorRewardsListScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<JuniorRewardDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f77236b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JuniorRewardDetails(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorRewardDetails[i];
            }
        }

        public JuniorRewardDetails(String juniorId, String perkId) {
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            Intrinsics.checkNotNullParameter(perkId, "perkId");
            this.f77235a = juniorId;
            this.f77236b = perkId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JuniorRewardDetails)) {
                return false;
            }
            JuniorRewardDetails juniorRewardDetails = (JuniorRewardDetails) obj2;
            return Intrinsics.f(this.f77235a, juniorRewardDetails.f77235a) && Intrinsics.f(this.f77236b, juniorRewardDetails.f77236b);
        }

        public final int hashCode() {
            return this.f77236b.hashCode() + (this.f77235a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77235a);
            dest.writeString(this.f77236b);
        }
    }

    private JuniorRewardsListScreenContract$ModalStep() {
    }
}
