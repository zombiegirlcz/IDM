package com.revolut.feature.junior_savings.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/junior_savings/api/navigation/JuniorSavingFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "SavingReviewDestination", "SavingReview", "JuniorSavingsListDestination", "Lcom/revolut/feature/junior_savings/api/navigation/JuniorSavingFeatureConfig$SavingReview;", "feature_junior_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JuniorSavingFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_savings/api/navigation/JuniorSavingFeatureConfig$JuniorSavingsListDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorSavingsListDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<JuniorSavingsListDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77245a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JuniorSavingsListDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorSavingsListDestination[i];
            }
        }

        public JuniorSavingsListDestination(String juniorId) {
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            this.f77245a = juniorId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF77245a() {
            return this.f77245a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof JuniorSavingsListDestination) && Intrinsics.f(this.f77245a, ((JuniorSavingsListDestination) obj2).f77245a);
        }

        public final int hashCode() {
            return this.f77245a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77245a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_savings/api/navigation/JuniorSavingFeatureConfig$SavingReview;", "Lcom/revolut/feature/junior_savings/api/navigation/JuniorSavingFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_junior_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SavingReview extends JuniorSavingFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<SavingReview> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f77246g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f77247h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavingReview(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavingReview[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingReview(String requestId, String juniorId) {
            super(null, new SavingReviewDestination(requestId, juniorId), false, null, 0, 61);
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            this.f77246g = requestId;
            this.f77247h = juniorId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SavingReview)) {
                return false;
            }
            SavingReview savingReview = (SavingReview) obj2;
            return Intrinsics.f(this.f77246g, savingReview.f77246g) && Intrinsics.f(this.f77247h, savingReview.f77247h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f77247h.hashCode() + (this.f77246g.hashCode() * 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77246g);
            dest.writeString(this.f77247h);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_savings/api/navigation/JuniorSavingFeatureConfig$SavingReviewDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SavingReviewDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<SavingReviewDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f77249b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavingReviewDestination(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavingReviewDestination[i];
            }
        }

        public SavingReviewDestination(String requestId, String juniorId) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            this.f77248a = requestId;
            this.f77249b = juniorId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF77249b() {
            return this.f77249b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF77248a() {
            return this.f77248a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SavingReviewDestination)) {
                return false;
            }
            SavingReviewDestination savingReviewDestination = (SavingReviewDestination) obj2;
            return Intrinsics.f(this.f77248a, savingReviewDestination.f77248a) && Intrinsics.f(this.f77249b, savingReviewDestination.f77249b);
        }

        public final int hashCode() {
            return this.f77249b.hashCode() + (this.f77248a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77248a);
            dest.writeString(this.f77249b);
        }
    }
}
