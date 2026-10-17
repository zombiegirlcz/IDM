package com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pwa.n;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/referrals/shared/ui/impl/ui/referral_troubleshooter/ReferralsTroubleshooterTopLevelScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReferralsTroubleshooterTopLevelScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ReferralsTroubleshooterTopLevelScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f81910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f81911c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReferralsTroubleshooterTopLevelScreenContract$InputData(parcel.readString(), n.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReferralsTroubleshooterTopLevelScreenContract$InputData[i];
        }
    }

    public ReferralsTroubleshooterTopLevelScreenContract$InputData(String str, n referralCampaignV4Type, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        this.f81909a = str;
        this.f81910b = referralCampaignV4Type;
        this.f81911c = z;
        this.d = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReferralsTroubleshooterTopLevelScreenContract$InputData)) {
            return false;
        }
        ReferralsTroubleshooterTopLevelScreenContract$InputData referralsTroubleshooterTopLevelScreenContract$InputData = (ReferralsTroubleshooterTopLevelScreenContract$InputData) obj2;
        return Intrinsics.f(this.f81909a, referralsTroubleshooterTopLevelScreenContract$InputData.f81909a) && this.f81910b == referralsTroubleshooterTopLevelScreenContract$InputData.f81910b && this.f81911c == referralsTroubleshooterTopLevelScreenContract$InputData.f81911c && this.d == referralsTroubleshooterTopLevelScreenContract$InputData.d;
    }

    public final int hashCode() {
        String str = this.f81909a;
        return Boolean.hashCode(this.d) + j6.a.c((this.f81910b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.f81911c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81909a);
        dest.writeString(this.f81910b.name());
        dest.writeInt(this.f81911c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
    }

    public /* synthetic */ ReferralsTroubleshooterTopLevelScreenContract$InputData(n nVar, boolean z, boolean z3, int i) {
        this((String) null, nVar, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z3);
    }
}
