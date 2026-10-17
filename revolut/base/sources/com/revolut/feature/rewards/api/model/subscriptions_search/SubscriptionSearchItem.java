package com.revolut.feature.rewards.api.model.subscriptions_search;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rewards.api.model.rewards.RewardAvatar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/rewards/api/model/subscriptions_search/SubscriptionSearchItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Action", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubscriptionSearchItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SubscriptionSearchItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RewardAvatar f84884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84885c;
    public final String d;
    public final Action e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/rewards/api/model/subscriptions_search/SubscriptionSearchItem$Action;", "Landroid/os/Parcelable;", "OpenUrl", "Lcom/revolut/feature/rewards/api/model/subscriptions_search/SubscriptionSearchItem$Action$OpenUrl;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Action extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/subscriptions_search/SubscriptionSearchItem$Action$OpenUrl;", "Lcom/revolut/feature/rewards/api/model/subscriptions_search/SubscriptionSearchItem$Action;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenUrl implements Action {

            @NotNull
            public static final Parcelable.Creator<OpenUrl> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f84886a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OpenUrl(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenUrl[i];
                }
            }

            public OpenUrl(String url2) {
                Intrinsics.checkNotNullParameter(url2, "url");
                this.f84886a = url2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof OpenUrl) && Intrinsics.f(this.f84886a, ((OpenUrl) obj2).f84886a);
            }

            public final int hashCode() {
                return this.f84886a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f84886a);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubscriptionSearchItem(parcel.readString(), (RewardAvatar) parcel.readParcelable(SubscriptionSearchItem.class.getClassLoader()), parcel.readString(), parcel.readString(), (Action) parcel.readParcelable(SubscriptionSearchItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubscriptionSearchItem[i];
        }
    }

    public SubscriptionSearchItem(String str, RewardAvatar rewardAvatar, String str2, String str3, Action action) {
        this.f84883a = str;
        this.f84884b = rewardAvatar;
        this.f84885c = str2;
        this.d = str3;
        this.e = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubscriptionSearchItem)) {
            return false;
        }
        SubscriptionSearchItem subscriptionSearchItem = (SubscriptionSearchItem) obj2;
        return Intrinsics.f(this.f84883a, subscriptionSearchItem.f84883a) && Intrinsics.f(this.f84884b, subscriptionSearchItem.f84884b) && Intrinsics.f(this.f84885c, subscriptionSearchItem.f84885c) && Intrinsics.f(this.d, subscriptionSearchItem.d) && Intrinsics.f(this.e, subscriptionSearchItem.e);
    }

    public final int hashCode() {
        String str = this.f84883a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        RewardAvatar rewardAvatar = this.f84884b;
        int iHashCode2 = (iHashCode + (rewardAvatar == null ? 0 : rewardAvatar.hashCode())) * 31;
        String str2 = this.f84885c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Action action = this.e;
        return iHashCode4 + (action != null ? action.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84883a);
        dest.writeParcelable(this.f84884b, i);
        dest.writeString(this.f84885c);
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
    }
}
