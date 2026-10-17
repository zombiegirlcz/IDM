package com.revolut.feature.rewards.impl.ui.details.flow;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PerkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PerkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84921c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PerkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PerkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo[i];
        }
    }

    public PerkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo(String str, String rewardId, String merchantName, boolean z) {
        Intrinsics.checkNotNullParameter(rewardId, "rewardId");
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        this.f84919a = str;
        this.f84920b = rewardId;
        this.f84921c = merchantName;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PerkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo)) {
            return false;
        }
        PerkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo perkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo = (PerkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo) obj2;
        return Intrinsics.f(this.f84919a, perkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo.f84919a) && Intrinsics.f(this.f84920b, perkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo.f84920b) && Intrinsics.f(this.f84921c, perkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo.f84921c) && this.d == perkDetailsFlowContract$ActivatePartnerMembershipAction$PartnerMembershipActivationInfo.d;
    }

    public final int hashCode() {
        String str = this.f84919a;
        return Boolean.hashCode(this.d) + p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f84920b), 31, this.f84921c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84919a);
        dest.writeString(this.f84920b);
        dest.writeString(this.f84921c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
