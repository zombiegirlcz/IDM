package com.revolut.feature.apm.qvik.impl.ui.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/apm/qvik/impl/ui/pay/QvikPayFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Scanner", "Transfer", "Lcom/revolut/feature/apm/qvik/impl/ui/pay/QvikPayFlowContract$Step$Scanner;", "Lcom/revolut/feature/apm/qvik/impl/ui/pay/QvikPayFlowContract$Step$Transfer;", "feature_apm_qvik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface QvikPayFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/qvik/impl/ui/pay/QvikPayFlowContract$Step$Scanner;", "Lcom/revolut/feature/apm/qvik/impl/ui/pay/QvikPayFlowContract$Step;", "<init>", "()V", "feature_apm_qvik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Scanner implements QvikPayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Scanner f62818a = new Scanner();

        @NotNull
        public static final Parcelable.Creator<Scanner> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Scanner.f62818a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Scanner[i];
            }
        }

        private Scanner() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/qvik/impl/ui/pay/QvikPayFlowContract$Step$Transfer;", "Lcom/revolut/feature/apm/qvik/impl/ui/pay/QvikPayFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_qvik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Transfer implements QvikPayFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Transfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmTransferContract$InputData f62819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f62820b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Transfer((ApmTransferContract$InputData) parcel.readParcelable(Transfer.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transfer[i];
            }
        }

        public Transfer(ApmTransferContract$InputData inputData, String str) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f62819a = inputData;
            this.f62820b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Transfer)) {
                return false;
            }
            Transfer transfer = (Transfer) obj2;
            return Intrinsics.f(this.f62819a, transfer.f62819a) && Intrinsics.f(this.f62820b, transfer.f62820b);
        }

        public final int hashCode() {
            int iHashCode = this.f62819a.hashCode() * 31;
            String str = this.f62820b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62819a, i);
            dest.writeString(this.f62820b);
        }
    }
}
