package com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pwa.n;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/referrals/shared/ui/impl/ui/referral_troubleshooter/all/AllReferralsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AllReferralsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AllReferralsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f81920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f81921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f81922c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AllReferralsScreenContract$InputData(n.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AllReferralsScreenContract$InputData[i];
        }
    }

    public AllReferralsScreenContract$InputData(n referralCampaignV4Type, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        this.f81920a = referralCampaignV4Type;
        this.f81921b = z;
        this.f81922c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AllReferralsScreenContract$InputData)) {
            return false;
        }
        AllReferralsScreenContract$InputData allReferralsScreenContract$InputData = (AllReferralsScreenContract$InputData) obj2;
        return this.f81920a == allReferralsScreenContract$InputData.f81920a && this.f81921b == allReferralsScreenContract$InputData.f81921b && this.f81922c == allReferralsScreenContract$InputData.f81922c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f81922c) + j6.a.c(this.f81920a.hashCode() * 31, 31, this.f81921b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81920a.name());
        dest.writeInt(this.f81921b ? 1 : 0);
        dest.writeInt(this.f81922c ? 1 : 0);
    }
}
