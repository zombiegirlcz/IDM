package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_porting_cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_porting_cancellation/EsimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant", "Landroid/os/Parcelable;", "<init>", "()V", "PortInCancellation", "PortOutCancellation", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_porting_cancellation/EsimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant$PortInCancellation;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_porting_cancellation/EsimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant$PortOutCancellation;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EsimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_porting_cancellation/EsimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant$PortInCancellation;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_porting_cancellation/EsimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PortInCancellation extends EsimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PortInCancellation f101397a = new PortInCancellation();

        @NotNull
        public static final Parcelable.Creator<PortInCancellation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PortInCancellation.f101397a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PortInCancellation[i];
            }
        }

        private PortInCancellation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_porting_cancellation/EsimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant$PortOutCancellation;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_porting_cancellation/EsimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PortOutCancellation extends EsimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PortOutCancellation f101398a = new PortOutCancellation();

        @NotNull
        public static final Parcelable.Creator<PortOutCancellation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PortOutCancellation.f101398a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PortOutCancellation[i];
            }
        }

        private PortOutCancellation() {
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

    private EsimMobilePlanPortingCancellationScreenContract$PortingCancellationBottomSheetVariant() {
    }
}
