package com.revolut.feature.apm.bills.boleto.impl.finder.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/apm/bills/boleto/impl/finder/flow/BoletoFinderFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "HiddenBoletos", "BoletosInfo", "DeactivateBoletoFinder", "Lcom/revolut/feature/apm/bills/boleto/impl/finder/flow/BoletoFinderFlowContract$Step$BoletosInfo;", "Lcom/revolut/feature/apm/bills/boleto/impl/finder/flow/BoletoFinderFlowContract$Step$DeactivateBoletoFinder;", "Lcom/revolut/feature/apm/bills/boleto/impl/finder/flow/BoletoFinderFlowContract$Step$HiddenBoletos;", "feature_apm_bills_boleto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BoletoFinderFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/bills/boleto/impl/finder/flow/BoletoFinderFlowContract$Step$BoletosInfo;", "Lcom/revolut/feature/apm/bills/boleto/impl/finder/flow/BoletoFinderFlowContract$Step;", "<init>", "()V", "feature_apm_bills_boleto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BoletosInfo implements BoletoFinderFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BoletosInfo f61168a = new BoletosInfo();

        @NotNull
        public static final Parcelable.Creator<BoletosInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BoletosInfo.f61168a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BoletosInfo[i];
            }
        }

        private BoletosInfo() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/bills/boleto/impl/finder/flow/BoletoFinderFlowContract$Step$DeactivateBoletoFinder;", "Lcom/revolut/feature/apm/bills/boleto/impl/finder/flow/BoletoFinderFlowContract$Step;", "<init>", "()V", "feature_apm_bills_boleto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DeactivateBoletoFinder implements BoletoFinderFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DeactivateBoletoFinder f61169a = new DeactivateBoletoFinder();

        @NotNull
        public static final Parcelable.Creator<DeactivateBoletoFinder> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DeactivateBoletoFinder.f61169a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeactivateBoletoFinder[i];
            }
        }

        private DeactivateBoletoFinder() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/bills/boleto/impl/finder/flow/BoletoFinderFlowContract$Step$HiddenBoletos;", "Lcom/revolut/feature/apm/bills/boleto/impl/finder/flow/BoletoFinderFlowContract$Step;", "<init>", "()V", "feature_apm_bills_boleto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HiddenBoletos implements BoletoFinderFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HiddenBoletos f61170a = new HiddenBoletos();

        @NotNull
        public static final Parcelable.Creator<HiddenBoletos> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HiddenBoletos.f61170a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HiddenBoletos[i];
            }
        }

        private HiddenBoletos() {
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
