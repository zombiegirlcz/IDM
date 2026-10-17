package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/cryptocommodity_invest/impl/ui/activities/crypto/ui/trade/trade/CryptoTradeContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SelectSorting", "Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/crypto/ui/trade/trade/CryptoTradeContract$ModalStep$SelectSorting;", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoTradeContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/crypto/ui/trade/trade/CryptoTradeContract$ModalStep$SelectSorting;", "Lcom/revolut/feature/cryptocommodity_invest/impl/ui/activities/crypto/ui/trade/trade/CryptoTradeContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectSorting implements CryptoTradeContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SelectSorting> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SortingType f71561a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectSorting((SortingType) parcel.readParcelable(SelectSorting.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectSorting[i];
            }
        }

        public SelectSorting(SortingType selectedSortingType) {
            Intrinsics.checkNotNullParameter(selectedSortingType, "selectedSortingType");
            this.f71561a = selectedSortingType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectSorting) && Intrinsics.f(this.f71561a, ((SelectSorting) obj2).f71561a);
        }

        public final int hashCode() {
            return this.f71561a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f71561a, i);
        }
    }
}
