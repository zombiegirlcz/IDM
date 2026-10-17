package com.revolut.feature.business.referrals.ui.screens.referral_campaign_state;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/business/referrals/ui/screens/referral_campaign_state/ReferralCampaignStateScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "Active", "Inactive", "Lcom/revolut/feature/business/referrals/ui/screens/referral_campaign_state/ReferralCampaignStateScreenContract$InputData$Active;", "Lcom/revolut/feature/business/referrals/ui/screens/referral_campaign_state/ReferralCampaignStateScreenContract$InputData$Inactive;", "feature_business_referrals_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ReferralCampaignStateScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/business/referrals/ui/screens/referral_campaign_state/ReferralCampaignStateScreenContract$InputData$Active;", "Lcom/revolut/feature/business/referrals/ui/screens/referral_campaign_state/ReferralCampaignStateScreenContract$InputData;", "<init>", "()V", "feature_business_referrals_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Active extends ReferralCampaignStateScreenContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Active f64356a = new Active();

        @NotNull
        public static final Parcelable.Creator<Active> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Active.f64356a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Active[i];
            }
        }

        private Active() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/business/referrals/ui/screens/referral_campaign_state/ReferralCampaignStateScreenContract$InputData$Inactive;", "Lcom/revolut/feature/business/referrals/ui/screens/referral_campaign_state/ReferralCampaignStateScreenContract$InputData;", "<init>", "()V", "feature_business_referrals_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Inactive extends ReferralCampaignStateScreenContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Inactive f64357a = new Inactive();

        @NotNull
        public static final Parcelable.Creator<Inactive> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Inactive.f64357a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Inactive[i];
            }
        }

        private Inactive() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private ReferralCampaignStateScreenContract$InputData() {
    }
}
