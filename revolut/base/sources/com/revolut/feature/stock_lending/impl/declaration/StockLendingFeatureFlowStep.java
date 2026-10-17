package com.revolut.feature.stock_lending.impl.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.FeatureFlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/stock_lending/impl/declaration/StockLendingFeatureFlowStep;", "Lcom/revolut/kompot/FeatureFlowStep;", "<init>", "()V", "LendingDetails", "Lcom/revolut/feature/stock_lending/impl/declaration/StockLendingFeatureFlowStep$LendingDetails;", "feature_stock_lending_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StockLendingFeatureFlowStep implements FeatureFlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/stock_lending/impl/declaration/StockLendingFeatureFlowStep$LendingDetails;", "Lcom/revolut/feature/stock_lending/impl/declaration/StockLendingFeatureFlowStep;", "<init>", "()V", "feature_stock_lending_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LendingDetails extends StockLendingFeatureFlowStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LendingDetails f88400a = new LendingDetails();

        @NotNull
        public static final Parcelable.Creator<LendingDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LendingDetails.f88400a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LendingDetails[i];
            }
        }

        private LendingDetails() {
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

    private StockLendingFeatureFlowStep() {
    }
}
