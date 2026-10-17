package com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_info;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/bottom_sheets/esim_info/EsimRefundInfoBottomSheetScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "HowRefundsCalculated", "RefundPending", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/bottom_sheets/esim_info/EsimRefundInfoBottomSheetScreenContract$InputData$HowRefundsCalculated;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/bottom_sheets/esim_info/EsimRefundInfoBottomSheetScreenContract$InputData$RefundPending;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EsimRefundInfoBottomSheetScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/bottom_sheets/esim_info/EsimRefundInfoBottomSheetScreenContract$InputData$HowRefundsCalculated;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/bottom_sheets/esim_info/EsimRefundInfoBottomSheetScreenContract$InputData;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HowRefundsCalculated extends EsimRefundInfoBottomSheetScreenContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HowRefundsCalculated f101436a = new HowRefundsCalculated();

        @NotNull
        public static final Parcelable.Creator<HowRefundsCalculated> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HowRefundsCalculated.f101436a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HowRefundsCalculated[i];
            }
        }

        private HowRefundsCalculated() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/bottom_sheets/esim_info/EsimRefundInfoBottomSheetScreenContract$InputData$RefundPending;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/bottom_sheets/esim_info/EsimRefundInfoBottomSheetScreenContract$InputData;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RefundPending extends EsimRefundInfoBottomSheetScreenContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RefundPending f101437a = new RefundPending();

        @NotNull
        public static final Parcelable.Creator<RefundPending> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RefundPending.f101437a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RefundPending[i];
            }
        }

        private RefundPending() {
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

    private EsimRefundInfoBottomSheetScreenContract$InputData() {
    }
}
