package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_travel_hotels_models.campaign.TravelHotelsCampaign;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/campaign/TravelHotelsCampaignsHubScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "Campaign", "Id", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/campaign/TravelHotelsCampaignsHubScreenContract$InputData$Campaign;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/campaign/TravelHotelsCampaignsHubScreenContract$InputData$Id;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelHotelsCampaignsHubScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/campaign/TravelHotelsCampaignsHubScreenContract$InputData$Campaign;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/campaign/TravelHotelsCampaignsHubScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Campaign extends TravelHotelsCampaignsHubScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Campaign> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelHotelsCampaign f93859a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Campaign((TravelHotelsCampaign) parcel.readParcelable(Campaign.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Campaign[i];
            }
        }

        public Campaign(TravelHotelsCampaign campaign) {
            Intrinsics.checkNotNullParameter(campaign, "campaign");
            this.f93859a = campaign;
        }

        @Override // com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.TravelHotelsCampaignsHubScreenContract$InputData
        /* JADX INFO: renamed from: a */
        public final String getF93860a() {
            return this.f93859a.f97892a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Campaign) && Intrinsics.f(this.f93859a, ((Campaign) obj2).f93859a);
        }

        public final int hashCode() {
            return this.f93859a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93859a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/campaign/TravelHotelsCampaignsHubScreenContract$InputData$Id;", "Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/campaign/TravelHotelsCampaignsHubScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Id extends TravelHotelsCampaignsHubScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Id> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93860a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Id(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Id[i];
            }
        }

        public Id(String campaignId) {
            Intrinsics.checkNotNullParameter(campaignId, "campaignId");
            this.f93860a = campaignId;
        }

        @Override // com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.TravelHotelsCampaignsHubScreenContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF93860a() {
            return this.f93860a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Id) && Intrinsics.f(this.f93860a, ((Id) obj2).f93860a);
        }

        public final int hashCode() {
            return this.f93860a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f93860a);
        }
    }

    private TravelHotelsCampaignsHubScreenContract$InputData() {
    }

    /* JADX INFO: renamed from: a */
    public abstract String getF93860a();
}
