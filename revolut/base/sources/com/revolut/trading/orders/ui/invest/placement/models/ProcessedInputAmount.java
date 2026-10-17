package com.revolut.trading.orders.ui.invest.placement.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/models/ProcessedInputAmount;", "Landroid/os/Parcelable;", "Original", "Converted", "Lcom/revolut/trading/orders/ui/invest/placement/models/ProcessedInputAmount$Converted;", "Lcom/revolut/trading/orders/ui/invest/placement/models/ProcessedInputAmount$Original;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ProcessedInputAmount extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/models/ProcessedInputAmount$Converted;", "Lcom/revolut/trading/orders/ui/invest/placement/models/ProcessedInputAmount;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Converted implements ProcessedInputAmount {

        @NotNull
        public static final Parcelable.Creator<Converted> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Amount f106868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Amount f106869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final OrderQuoteResult f106870c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Converted((Amount) parcel.readParcelable(Converted.class.getClassLoader()), (Amount) parcel.readParcelable(Converted.class.getClassLoader()), OrderQuoteResult.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Converted[i];
            }
        }

        public Converted(Amount originalAmount, Amount convertedAmount, OrderQuoteResult orderQuoteResult) {
            Intrinsics.checkNotNullParameter(originalAmount, "originalAmount");
            Intrinsics.checkNotNullParameter(convertedAmount, "convertedAmount");
            Intrinsics.checkNotNullParameter(orderQuoteResult, "orderQuoteResult");
            this.f106868a = originalAmount;
            this.f106869b = convertedAmount;
            this.f106870c = orderQuoteResult;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.trading.orders.ui.invest.placement.models.ProcessedInputAmount
        /* JADX INFO: renamed from: e0, reason: from getter */
        public final Amount getF106871a() {
            return this.f106868a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Converted)) {
                return false;
            }
            Converted converted = (Converted) obj2;
            return Intrinsics.f(this.f106868a, converted.f106868a) && Intrinsics.f(this.f106869b, converted.f106869b) && Intrinsics.f(this.f106870c, converted.f106870c);
        }

        public final int hashCode() {
            return this.f106870c.hashCode() + y.d(this.f106869b, this.f106868a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106868a, i);
            dest.writeParcelable(this.f106869b, i);
            this.f106870c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/models/ProcessedInputAmount$Original;", "Lcom/revolut/trading/orders/ui/invest/placement/models/ProcessedInputAmount;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Original implements ProcessedInputAmount {

        @NotNull
        public static final Parcelable.Creator<Original> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Amount f106871a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Original((Amount) parcel.readParcelable(Original.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Original[i];
            }
        }

        public Original(Amount originalAmount) {
            Intrinsics.checkNotNullParameter(originalAmount, "originalAmount");
            this.f106871a = originalAmount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.trading.orders.ui.invest.placement.models.ProcessedInputAmount
        /* JADX INFO: renamed from: e0, reason: from getter */
        public final Amount getF106871a() {
            return this.f106871a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Original) && Intrinsics.f(this.f106871a, ((Original) obj2).f106871a);
        }

        public final int hashCode() {
            return this.f106871a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106871a, i);
        }
    }

    /* JADX INFO: renamed from: e0 */
    Amount getF106871a();
}
