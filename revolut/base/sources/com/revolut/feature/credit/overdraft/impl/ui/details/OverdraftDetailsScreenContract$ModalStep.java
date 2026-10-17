package com.revolut.feature.credit.overdraft.impl.ui.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/credit/overdraft/impl/ui/details/OverdraftDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AprInfo", "SpendInfo", "MonthCharges", "Lcom/revolut/feature/credit/overdraft/impl/ui/details/OverdraftDetailsScreenContract$ModalStep$AprInfo;", "Lcom/revolut/feature/credit/overdraft/impl/ui/details/OverdraftDetailsScreenContract$ModalStep$MonthCharges;", "Lcom/revolut/feature/credit/overdraft/impl/ui/details/OverdraftDetailsScreenContract$ModalStep$SpendInfo;", "feature_credit_overdraft_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OverdraftDetailsScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/overdraft/impl/ui/details/OverdraftDetailsScreenContract$ModalStep$AprInfo;", "Lcom/revolut/feature/credit/overdraft/impl/ui/details/OverdraftDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_credit_overdraft_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AprInfo extends OverdraftDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AprInfo f70638a = new AprInfo();

        @NotNull
        public static final Parcelable.Creator<AprInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AprInfo.f70638a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AprInfo[i];
            }
        }

        private AprInfo() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/overdraft/impl/ui/details/OverdraftDetailsScreenContract$ModalStep$MonthCharges;", "Lcom/revolut/feature/credit/overdraft/impl/ui/details/OverdraftDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_credit_overdraft_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MonthCharges extends OverdraftDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MonthCharges f70639a = new MonthCharges();

        @NotNull
        public static final Parcelable.Creator<MonthCharges> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MonthCharges.f70639a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MonthCharges[i];
            }
        }

        private MonthCharges() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/overdraft/impl/ui/details/OverdraftDetailsScreenContract$ModalStep$SpendInfo;", "Lcom/revolut/feature/credit/overdraft/impl/ui/details/OverdraftDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_credit_overdraft_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SpendInfo extends OverdraftDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SpendInfo f70640a = new SpendInfo();

        @NotNull
        public static final Parcelable.Creator<SpendInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SpendInfo.f70640a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SpendInfo[i];
            }
        }

        private SpendInfo() {
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

    private OverdraftDetailsScreenContract$ModalStep() {
    }
}
