package com.revolut.business.feature.referrals.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/revolut/business/feature/referrals/model/ReferralWithIncentiveCampaign$CampaignType", "Landroid/os/Parcelable;", "WithReward", "Default", "Lcom/revolut/business/feature/referrals/model/ReferralWithIncentiveCampaign$CampaignType$Default;", "Lcom/revolut/business/feature/referrals/model/ReferralWithIncentiveCampaign$CampaignType$WithReward;", "feature_business_referrals_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ReferralWithIncentiveCampaign$CampaignType implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50668a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/business/feature/referrals/model/ReferralWithIncentiveCampaign$CampaignType$Default;", "Lcom/revolut/business/feature/referrals/model/ReferralWithIncentiveCampaign$CampaignType;", "<init>", "()V", "feature_business_referrals_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Default extends ReferralWithIncentiveCampaign$CampaignType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Default f50669b = new Default();

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Default.f50669b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        private Default() {
            super("DEFAULT");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/business/feature/referrals/model/ReferralWithIncentiveCampaign$CampaignType$WithReward;", "Lcom/revolut/business/feature/referrals/model/ReferralWithIncentiveCampaign$CampaignType;", "<init>", "()V", "feature_business_referrals_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WithReward extends ReferralWithIncentiveCampaign$CampaignType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final WithReward f50670b = new WithReward();

        @NotNull
        public static final Parcelable.Creator<WithReward> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WithReward.f50670b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithReward[i];
            }
        }

        private WithReward() {
            super("WITH_REWARD");
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

    public ReferralWithIncentiveCampaign$CampaignType(String str) {
        this.f50668a = str;
    }
}
