package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_cancellation/EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType", "Landroid/os/Parcelable;", "Cancellation", "Withdrawal", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_cancellation/EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType$Cancellation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_cancellation/EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType$Withdrawal;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_cancellation/EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType$Cancellation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_cancellation/EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Cancellation implements EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Cancellation f100697a = new Cancellation();

        @NotNull
        public static final Parcelable.Creator<Cancellation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Cancellation.f100697a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cancellation[i];
            }
        }

        private Cancellation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_cancellation/EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType$Withdrawal;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_cancellation/EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Withdrawal implements EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Withdrawal f100698a = new Withdrawal();

        @NotNull
        public static final Parcelable.Creator<Withdrawal> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Withdrawal.f100698a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Withdrawal[i];
            }
        }

        private Withdrawal() {
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
}
