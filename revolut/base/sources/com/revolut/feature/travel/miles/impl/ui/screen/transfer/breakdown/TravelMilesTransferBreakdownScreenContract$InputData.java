package com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.travel.miles.api.model.TravelMilesRate;
import com.revolut.kompot.common.IOData$Input;
import hfg.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/travel/miles/impl/ui/screen/transfer/breakdown/TravelMilesTransferBreakdownScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Points", "Miles", "Lcom/revolut/feature/travel/miles/impl/ui/screen/transfer/breakdown/TravelMilesTransferBreakdownScreenContract$InputData$Miles;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/transfer/breakdown/TravelMilesTransferBreakdownScreenContract$InputData$Points;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelMilesTransferBreakdownScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/transfer/breakdown/TravelMilesTransferBreakdownScreenContract$InputData$Miles;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/transfer/breakdown/TravelMilesTransferBreakdownScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Miles extends TravelMilesTransferBreakdownScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Miles> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f94395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelMilesRate f94396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t0 f94397c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Miles(parcel.readDouble(), (TravelMilesRate) parcel.readParcelable(Miles.class.getClassLoader()), t0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Miles[i];
            }
        }

        public Miles(double d, TravelMilesRate rate, t0 unit) {
            Intrinsics.checkNotNullParameter(rate, "rate");
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f94395a = d;
            this.f94396b = rate;
            this.f94397c = unit;
        }

        @Override // com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TravelMilesRate getF94399b() {
            return this.f94396b;
        }

        @Override // com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final t0 getF94400c() {
            return this.f94397c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Miles)) {
                return false;
            }
            Miles miles = (Miles) obj2;
            return Double.compare(this.f94395a, miles.f94395a) == 0 && Intrinsics.f(this.f94396b, miles.f94396b) && this.f94397c == miles.f94397c;
        }

        public final int hashCode() {
            return this.f94397c.hashCode() + ((this.f94396b.hashCode() + (Double.hashCode(this.f94395a) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeDouble(this.f94395a);
            dest.writeParcelable(this.f94396b, i);
            dest.writeString(this.f94397c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/screen/transfer/breakdown/TravelMilesTransferBreakdownScreenContract$InputData$Points;", "Lcom/revolut/feature/travel/miles/impl/ui/screen/transfer/breakdown/TravelMilesTransferBreakdownScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Points extends TravelMilesTransferBreakdownScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Points> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevPoints f94398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelMilesRate f94399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t0 f94400c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Points((RevPoints) parcel.readParcelable(Points.class.getClassLoader()), (TravelMilesRate) parcel.readParcelable(Points.class.getClassLoader()), t0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Points[i];
            }
        }

        public Points(RevPoints pointsAmount, TravelMilesRate rate, t0 unit) {
            Intrinsics.checkNotNullParameter(pointsAmount, "pointsAmount");
            Intrinsics.checkNotNullParameter(rate, "rate");
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f94398a = pointsAmount;
            this.f94399b = rate;
            this.f94400c = unit;
        }

        @Override // com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TravelMilesRate getF94399b() {
            return this.f94399b;
        }

        @Override // com.revolut.feature.travel.miles.impl.ui.screen.transfer.breakdown.TravelMilesTransferBreakdownScreenContract$InputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final t0 getF94400c() {
            return this.f94400c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Points)) {
                return false;
            }
            Points points = (Points) obj2;
            return Intrinsics.f(this.f94398a, points.f94398a) && Intrinsics.f(this.f94399b, points.f94399b) && this.f94400c == points.f94400c;
        }

        public final int hashCode() {
            return this.f94400c.hashCode() + ((this.f94399b.hashCode() + (this.f94398a.f83960a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f94398a, i);
            dest.writeParcelable(this.f94399b, i);
            dest.writeString(this.f94400c.name());
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract TravelMilesRate getF94399b();

    /* JADX INFO: renamed from: b */
    public abstract t0 getF94400c();
}
