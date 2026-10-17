package com.revolut.feature.wealth.assetdetails.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"com/revolut/feature/wealth/assetdetails/ui/api/navigation/InstrumentRatingsFeatureConfig$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Landroid/os/Parcelable;", "<init>", "()V", "InstrumentCreditQualityDestination", "InstrumentCreditRatingsDestination", "Lcom/revolut/feature/wealth/assetdetails/ui/api/navigation/InstrumentRatingsFeatureConfig$Destination$InstrumentCreditQualityDestination;", "Lcom/revolut/feature/wealth/assetdetails/ui/api/navigation/InstrumentRatingsFeatureConfig$Destination$InstrumentCreditRatingsDestination;", "feature_wealth_asset_details_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class InstrumentRatingsFeatureConfig$Destination implements KompotDestination, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/assetdetails/ui/api/navigation/InstrumentRatingsFeatureConfig$Destination$InstrumentCreditQualityDestination;", "Lcom/revolut/feature/wealth/assetdetails/ui/api/navigation/InstrumentRatingsFeatureConfig$Destination;", "", "toString", "()Ljava/lang/String;", "feature_wealth_asset_details_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InstrumentCreditQualityDestination extends InstrumentRatingsFeatureConfig$Destination {

        @NotNull
        public static final Parcelable.Creator<InstrumentCreditQualityDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yel.a f95408a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InstrumentCreditQualityDestination(parcel.readInt() == 0 ? null : yel.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstrumentCreditQualityDestination[i];
            }
        }

        public InstrumentCreditQualityDestination(yel.a aVar) {
            this.f95408a = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InstrumentCreditQualityDestination) && this.f95408a == ((InstrumentCreditQualityDestination) obj2).f95408a;
        }

        public final int hashCode() {
            yel.a aVar = this.f95408a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            yel.a aVar = this.f95408a;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/assetdetails/ui/api/navigation/InstrumentRatingsFeatureConfig$Destination$InstrumentCreditRatingsDestination;", "Lcom/revolut/feature/wealth/assetdetails/ui/api/navigation/InstrumentRatingsFeatureConfig$Destination;", "", "toString", "()Ljava/lang/String;", "feature_wealth_asset_details_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InstrumentCreditRatingsDestination extends InstrumentRatingsFeatureConfig$Destination {

        @NotNull
        public static final Parcelable.Creator<InstrumentCreditRatingsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wdh.a f95409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f95410b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InstrumentCreditRatingsDestination(wdh.a.valueOf(parcel.readString()), (n) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstrumentCreditRatingsDestination[i];
            }
        }

        public InstrumentCreditRatingsDestination(wdh.a ratingsProvider, n instrument) {
            Intrinsics.checkNotNullParameter(ratingsProvider, "ratingsProvider");
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            this.f95409a = ratingsProvider;
            this.f95410b = instrument;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InstrumentCreditRatingsDestination)) {
                return false;
            }
            InstrumentCreditRatingsDestination instrumentCreditRatingsDestination = (InstrumentCreditRatingsDestination) obj2;
            return this.f95409a == instrumentCreditRatingsDestination.f95409a && Intrinsics.f(this.f95410b, instrumentCreditRatingsDestination.f95410b);
        }

        public final int hashCode() {
            return this.f95410b.hashCode() + (this.f95409a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95409a.name());
            dest.writeSerializable(this.f95410b);
        }
    }

    private InstrumentRatingsFeatureConfig$Destination() {
    }
}
