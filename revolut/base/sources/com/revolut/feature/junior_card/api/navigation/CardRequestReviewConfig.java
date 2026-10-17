package com.revolut.feature.junior_card.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import jc8.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_card/api/navigation/CardRequestReviewConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Review", "ReviewDestination", "Lcom/revolut/feature/junior_card/api/navigation/CardRequestReviewConfig$Review;", "feature_junior_card_request_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardRequestReviewConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_card/api/navigation/CardRequestReviewConfig$Review;", "Lcom/revolut/feature/junior_card/api/navigation/CardRequestReviewConfig;", "", "toString", "()Ljava/lang/String;", "feature_junior_card_request_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review extends CardRequestReviewConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f76854g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final NaviCommand f76855h;
        public final c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f76856j;

        /* JADX WARN: Illegal instructions before constructor call */
        public Review(String juniorId, NaviCommand naviCommand, c cardRequestType, String str, int i) {
            naviCommand = (i & 2) != 0 ? null : naviCommand;
            cardRequestType = (i & 4) != 0 ? c.PHYSICAL : cardRequestType;
            str = (i & 8) != 0 ? null : str;
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            Intrinsics.checkNotNullParameter(cardRequestType, "cardRequestType");
            super(null, new ReviewDestination(naviCommand, juniorId, str, cardRequestType), false, null, 0, 61);
            this.f76854g = juniorId;
            this.f76855h = naviCommand;
            this.i = cardRequestType;
            this.f76856j = str;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Review)) {
                return false;
            }
            Review review = (Review) obj2;
            return Intrinsics.f(this.f76854g, review.f76854g) && Intrinsics.f(this.f76855h, review.f76855h) && this.i == review.i && Intrinsics.f(this.f76856j, review.f76856j);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f76854g.hashCode() * 31;
            NaviCommand naviCommand = this.f76855h;
            int iHashCode2 = (this.i.hashCode() + ((iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31)) * 31;
            String str = this.f76856j;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_card/api/navigation/CardRequestReviewConfig$ReviewDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_card_request_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<ReviewDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NaviCommand f76858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f76859c;
        public final String d;

        /* JADX INFO: loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                return new ReviewDestination((NaviCommand) parcel.readParcelable(ReviewDestination.class.getClassLoader()), string, parcel.readString(), c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewDestination[i];
            }
        }

        public ReviewDestination(NaviCommand naviCommand, String juniorId, String str, c cardRequestType) {
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            Intrinsics.checkNotNullParameter(cardRequestType, "cardRequestType");
            this.f76857a = juniorId;
            this.f76858b = naviCommand;
            this.f76859c = cardRequestType;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ReviewDestination)) {
                return false;
            }
            ReviewDestination reviewDestination = (ReviewDestination) obj2;
            return Intrinsics.f(this.f76857a, reviewDestination.f76857a) && Intrinsics.f(this.f76858b, reviewDestination.f76858b) && this.f76859c == reviewDestination.f76859c && Intrinsics.f(this.d, reviewDestination.d);
        }

        public final int hashCode() {
            int iHashCode = this.f76857a.hashCode() * 31;
            NaviCommand naviCommand = this.f76858b;
            int iHashCode2 = (this.f76859c.hashCode() + ((iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31)) * 31;
            String str = this.d;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76857a);
            dest.writeParcelable(this.f76858b, i);
            dest.writeString(this.f76859c.name());
            dest.writeString(this.d);
        }
    }
}
