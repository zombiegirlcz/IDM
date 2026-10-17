package com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pwa.n;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/referrals/shared/ui/impl/ui/invite_campaign/home/InviteCampaignHomeControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InviteCampaignHomeControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InviteCampaignHomeControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f81842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f81843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f81844c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InviteCampaignHomeControllerContract$InputData(parcel.readString(), n.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InviteCampaignHomeControllerContract$InputData[i];
        }
    }

    public InviteCampaignHomeControllerContract$InputData() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InviteCampaignHomeControllerContract$InputData)) {
            return false;
        }
        InviteCampaignHomeControllerContract$InputData inviteCampaignHomeControllerContract$InputData = (InviteCampaignHomeControllerContract$InputData) obj2;
        return this.f81842a == inviteCampaignHomeControllerContract$InputData.f81842a && this.f81843b == inviteCampaignHomeControllerContract$InputData.f81843b && this.f81844c == inviteCampaignHomeControllerContract$InputData.f81844c && Intrinsics.f(this.d, inviteCampaignHomeControllerContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f81844c.hashCode() + j6.a.c(Boolean.hashCode(this.f81842a) * 31, 31, this.f81843b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f81842a ? 1 : 0);
        dest.writeInt(this.f81843b ? 1 : 0);
        dest.writeString(this.f81844c.name());
        dest.writeString(this.d);
    }

    public InviteCampaignHomeControllerContract$InputData(String str, n referralCampaignV4Type, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        this.f81842a = z;
        this.f81843b = z3;
        this.f81844c = referralCampaignV4Type;
        this.d = str;
    }

    public /* synthetic */ InviteCampaignHomeControllerContract$InputData(int i) {
        this(null, n.STANDARD, false, false);
    }
}
