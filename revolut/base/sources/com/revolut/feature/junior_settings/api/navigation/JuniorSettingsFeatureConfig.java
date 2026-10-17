package com.revolut.feature.junior_settings.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_settings/api/navigation/JuniorSettingsFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "ReferralCampaignAccess", "Lcom/revolut/feature/junior_settings/api/navigation/JuniorSettingsFeatureConfig$ReferralCampaignAccess;", "feature_junior_settings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JuniorSettingsFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/api/navigation/JuniorSettingsFeatureConfig$ReferralCampaignAccess;", "Lcom/revolut/feature/junior_settings/api/navigation/JuniorSettingsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_junior_settings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReferralCampaignAccess extends JuniorSettingsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<ReferralCampaignAccess> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f77256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f77257c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReferralCampaignAccess((d) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReferralCampaignAccess[i];
            }
        }

        public ReferralCampaignAccess(d referralCampaignAmount, String juniorId, String juniorFirstName, String termsUrl) {
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
            Intrinsics.checkNotNullParameter(referralCampaignAmount, "referralCampaignAmount");
            Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
            this.f77255a = juniorId;
            this.f77256b = juniorFirstName;
            this.f77257c = referralCampaignAmount;
            this.d = termsUrl;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ReferralCampaignAccess)) {
                return false;
            }
            ReferralCampaignAccess referralCampaignAccess = (ReferralCampaignAccess) obj2;
            return Intrinsics.f(this.f77255a, referralCampaignAccess.f77255a) && Intrinsics.f(this.f77256b, referralCampaignAccess.f77256b) && Intrinsics.f(this.f77257c, referralCampaignAccess.f77257c) && Intrinsics.f(this.d, referralCampaignAccess.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + v7.c(p.a.c(this.f77255a.hashCode() * 31, 31, this.f77256b), 31, this.f77257c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77255a);
            dest.writeString(this.f77256b);
            dest.writeSerializable(this.f77257c);
            dest.writeString(this.d);
        }
    }
}
