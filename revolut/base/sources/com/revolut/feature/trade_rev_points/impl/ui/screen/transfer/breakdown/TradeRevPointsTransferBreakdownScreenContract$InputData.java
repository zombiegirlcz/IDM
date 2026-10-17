package com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsRate;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/trade_rev_points/impl/ui/screen/transfer/breakdown/TradeRevPointsTransferBreakdownScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "RevPoints", "PartnerPoints", "Lcom/revolut/feature/trade_rev_points/impl/ui/screen/transfer/breakdown/TradeRevPointsTransferBreakdownScreenContract$InputData$PartnerPoints;", "Lcom/revolut/feature/trade_rev_points/impl/ui/screen/transfer/breakdown/TradeRevPointsTransferBreakdownScreenContract$InputData$RevPoints;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TradeRevPointsTransferBreakdownScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/screen/transfer/breakdown/TradeRevPointsTransferBreakdownScreenContract$InputData$PartnerPoints;", "Lcom/revolut/feature/trade_rev_points/impl/ui/screen/transfer/breakdown/TradeRevPointsTransferBreakdownScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PartnerPoints extends TradeRevPointsTransferBreakdownScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<PartnerPoints> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f91172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TradeRevPointsRate f91173b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PartnerPoints(parcel.readDouble(), (TradeRevPointsRate) parcel.readParcelable(PartnerPoints.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PartnerPoints[i];
            }
        }

        public PartnerPoints(double d, TradeRevPointsRate rate) {
            Intrinsics.checkNotNullParameter(rate, "rate");
            this.f91172a = d;
            this.f91173b = rate;
        }

        @Override // com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreenContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TradeRevPointsRate getF91175b() {
            return this.f91173b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PartnerPoints)) {
                return false;
            }
            PartnerPoints partnerPoints = (PartnerPoints) obj2;
            return Double.compare(this.f91172a, partnerPoints.f91172a) == 0 && Intrinsics.f(this.f91173b, partnerPoints.f91173b);
        }

        public final int hashCode() {
            return this.f91173b.hashCode() + (Double.hashCode(this.f91172a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeDouble(this.f91172a);
            dest.writeParcelable(this.f91173b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/screen/transfer/breakdown/TradeRevPointsTransferBreakdownScreenContract$InputData$RevPoints;", "Lcom/revolut/feature/trade_rev_points/impl/ui/screen/transfer/breakdown/TradeRevPointsTransferBreakdownScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPoints extends TradeRevPointsTransferBreakdownScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<RevPoints> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f91174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TradeRevPointsRate f91175b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevPoints(parcel.readDouble(), (TradeRevPointsRate) parcel.readParcelable(RevPoints.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPoints[i];
            }
        }

        public RevPoints(double d, TradeRevPointsRate rate) {
            Intrinsics.checkNotNullParameter(rate, "rate");
            this.f91174a = d;
            this.f91175b = rate;
        }

        @Override // com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.breakdown.TradeRevPointsTransferBreakdownScreenContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TradeRevPointsRate getF91175b() {
            return this.f91175b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevPoints)) {
                return false;
            }
            RevPoints revPoints = (RevPoints) obj2;
            return Double.compare(this.f91174a, revPoints.f91174a) == 0 && Intrinsics.f(this.f91175b, revPoints.f91175b);
        }

        public final int hashCode() {
            return this.f91175b.hashCode() + (Double.hashCode(this.f91174a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeDouble(this.f91174a);
            dest.writeParcelable(this.f91175b, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract TradeRevPointsRate getF91175b();
}
