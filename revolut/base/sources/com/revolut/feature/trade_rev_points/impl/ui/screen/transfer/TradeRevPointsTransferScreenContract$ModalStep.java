package com.revolut.feature.trade_rev_points.impl.ui.screen.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsAccountTransferLimit;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsRate;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u2f.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/trade_rev_points/impl/ui/screen/transfer/TradeRevPointsTransferScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Breakdown", "LimitInfo", "Lcom/revolut/feature/trade_rev_points/impl/ui/screen/transfer/TradeRevPointsTransferScreenContract$ModalStep$Breakdown;", "Lcom/revolut/feature/trade_rev_points/impl/ui/screen/transfer/TradeRevPointsTransferScreenContract$ModalStep$LimitInfo;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TradeRevPointsTransferScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/screen/transfer/TradeRevPointsTransferScreenContract$ModalStep$Breakdown;", "Lcom/revolut/feature/trade_rev_points/impl/ui/screen/transfer/TradeRevPointsTransferScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Breakdown implements TradeRevPointsTransferScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Breakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradeRevPointsRate f91161a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Breakdown((TradeRevPointsRate) parcel.readParcelable(Breakdown.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Breakdown[i];
            }
        }

        public Breakdown(TradeRevPointsRate rate) {
            Intrinsics.checkNotNullParameter(rate, "rate");
            this.f91161a = rate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Breakdown) && Intrinsics.f(this.f91161a, ((Breakdown) obj2).f91161a);
        }

        public final int hashCode() {
            return this.f91161a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91161a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/screen/transfer/TradeRevPointsTransferScreenContract$ModalStep$LimitInfo;", "Lcom/revolut/feature/trade_rev_points/impl/ui/screen/transfer/TradeRevPointsTransferScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LimitInfo implements TradeRevPointsTransferScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LimitInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradeRevPointsAccountTransferLimit f91162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k f91163b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LimitInfo((TradeRevPointsAccountTransferLimit) parcel.readParcelable(LimitInfo.class.getClassLoader()), k.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitInfo[i];
            }
        }

        public LimitInfo(TradeRevPointsAccountTransferLimit limit, k partnerUnit) {
            Intrinsics.checkNotNullParameter(limit, "limit");
            Intrinsics.checkNotNullParameter(partnerUnit, "partnerUnit");
            this.f91162a = limit;
            this.f91163b = partnerUnit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LimitInfo)) {
                return false;
            }
            LimitInfo limitInfo = (LimitInfo) obj2;
            return Intrinsics.f(this.f91162a, limitInfo.f91162a) && this.f91163b == limitInfo.f91163b;
        }

        public final int hashCode() {
            return this.f91163b.hashCode() + (this.f91162a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91162a, i);
            dest.writeString(this.f91163b.name());
        }
    }
}
