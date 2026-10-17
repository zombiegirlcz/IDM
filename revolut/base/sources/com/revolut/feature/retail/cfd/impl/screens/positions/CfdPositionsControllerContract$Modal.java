package com.revolut.feature.retail.cfd.impl.screens.positions;

import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import com.revolut.feature.retail.cfd.impl.screens.review.CfdOrderReviewScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/retail/cfd/impl/screens/positions/CfdPositionsControllerContract$Modal", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "OrderReview", "TradingHours", "ExposureBreakdown", "MarginBreakdown", "MarketClosed", "Lcom/revolut/feature/retail/cfd/impl/screens/positions/CfdPositionsControllerContract$Modal$ExposureBreakdown;", "Lcom/revolut/feature/retail/cfd/impl/screens/positions/CfdPositionsControllerContract$Modal$MarginBreakdown;", "Lcom/revolut/feature/retail/cfd/impl/screens/positions/CfdPositionsControllerContract$Modal$MarketClosed;", "Lcom/revolut/feature/retail/cfd/impl/screens/positions/CfdPositionsControllerContract$Modal$OrderReview;", "Lcom/revolut/feature/retail/cfd/impl/screens/positions/CfdPositionsControllerContract$Modal$TradingHours;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CfdPositionsControllerContract$Modal extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/positions/CfdPositionsControllerContract$Modal$ExposureBreakdown;", "Lcom/revolut/feature/retail/cfd/impl/screens/positions/CfdPositionsControllerContract$Modal;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExposureBreakdown implements CfdPositionsControllerContract$Modal {

        @NotNull
        public static final Parcelable.Creator<ExposureBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f82257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f82258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f82259c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExposureBreakdown(g.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExposureBreakdown[i];
            }
        }

        public ExposureBreakdown(g tradeSide, BigDecimal quantity, String str) {
            Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            this.f82257a = tradeSide;
            this.f82258b = quantity;
            this.f82259c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExposureBreakdown)) {
                return false;
            }
            ExposureBreakdown exposureBreakdown = (ExposureBreakdown) obj2;
            return this.f82257a == exposureBreakdown.f82257a && Intrinsics.f(this.f82258b, exposureBreakdown.f82258b) && Intrinsics.f(this.f82259c, exposureBreakdown.f82259c);
        }

        public final int hashCode() {
            int iD = t61.a.d(this.f82258b, this.f82257a.hashCode() * 31, 31);
            String str = this.f82259c;
            return iD + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82257a.name());
            dest.writeSerializable(this.f82258b);
            dest.writeString(this.f82259c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/positions/CfdPositionsControllerContract$Modal$MarginBreakdown;", "Lcom/revolut/feature/retail/cfd/impl/screens/positions/CfdPositionsControllerContract$Modal;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MarginBreakdown implements CfdPositionsControllerContract$Modal {

        @NotNull
        public static final Parcelable.Creator<MarginBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f82261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BigDecimal f82262c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarginBreakdown(parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MarginBreakdown[i];
            }
        }

        public MarginBreakdown(String str, BigDecimal quantity, BigDecimal leverage) {
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(leverage, "leverage");
            this.f82260a = str;
            this.f82261b = quantity;
            this.f82262c = leverage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MarginBreakdown)) {
                return false;
            }
            MarginBreakdown marginBreakdown = (MarginBreakdown) obj2;
            return Intrinsics.f(this.f82260a, marginBreakdown.f82260a) && Intrinsics.f(this.f82261b, marginBreakdown.f82261b) && Intrinsics.f(this.f82262c, marginBreakdown.f82262c);
        }

        public final int hashCode() {
            String str = this.f82260a;
            return this.f82262c.hashCode() + t61.a.d(this.f82261b, (str == null ? 0 : str.hashCode()) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82260a);
            dest.writeSerializable(this.f82261b);
            dest.writeSerializable(this.f82262c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/positions/CfdPositionsControllerContract$Modal$MarketClosed;", "Lcom/revolut/feature/retail/cfd/impl/screens/positions/CfdPositionsControllerContract$Modal;", "<init>", "()V", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MarketClosed implements CfdPositionsControllerContract$Modal {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MarketClosed f82263a = new MarketClosed();

        @NotNull
        public static final Parcelable.Creator<MarketClosed> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MarketClosed.f82263a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MarketClosed[i];
            }
        }

        private MarketClosed() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/positions/CfdPositionsControllerContract$Modal$OrderReview;", "Lcom/revolut/feature/retail/cfd/impl/screens/positions/CfdPositionsControllerContract$Modal;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderReview implements CfdPositionsControllerContract$Modal {

        @NotNull
        public static final Parcelable.Creator<OrderReview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CfdOrderReviewScreenContract$InputData f82264a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderReview(CfdOrderReviewScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderReview[i];
            }
        }

        public OrderReview(CfdOrderReviewScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f82264a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OrderReview) && Intrinsics.f(this.f82264a, ((OrderReview) obj2).f82264a);
        }

        public final int hashCode() {
            return this.f82264a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f82264a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/positions/CfdPositionsControllerContract$Modal$TradingHours;", "Lcom/revolut/feature/retail/cfd/impl/screens/positions/CfdPositionsControllerContract$Modal;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TradingHours implements CfdPositionsControllerContract$Modal {

        @NotNull
        public static final Parcelable.Creator<TradingHours> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f82265a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TradingHours((n) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TradingHours[i];
            }
        }

        public TradingHours(n instrument) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            this.f82265a = instrument;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TradingHours) && Intrinsics.f(this.f82265a, ((TradingHours) obj2).f82265a);
        }

        public final int hashCode() {
            return this.f82265a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f82265a);
        }
    }
}
