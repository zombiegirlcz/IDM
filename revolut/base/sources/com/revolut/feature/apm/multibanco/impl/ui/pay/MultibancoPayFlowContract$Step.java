package com.revolut.feature.apm.multibanco.impl.ui.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.ui.api.navigation.qr.QrFlowInputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/apm/multibanco/impl/ui/pay/MultibancoPayFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Loading", "QR", "Lcom/revolut/feature/apm/multibanco/impl/ui/pay/MultibancoPayFlowContract$Step$Loading;", "Lcom/revolut/feature/apm/multibanco/impl/ui/pay/MultibancoPayFlowContract$Step$QR;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MultibancoPayFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/pay/MultibancoPayFlowContract$Step$Loading;", "Lcom/revolut/feature/apm/multibanco/impl/ui/pay/MultibancoPayFlowContract$Step;", "<init>", "()V", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Loading implements MultibancoPayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Loading f62612a = new Loading();

        @NotNull
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Loading.f62612a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Loading[i];
            }
        }

        private Loading() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/pay/MultibancoPayFlowContract$Step$QR;", "Lcom/revolut/feature/apm/multibanco/impl/ui/pay/MultibancoPayFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class QR implements MultibancoPayFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<QR> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final QrFlowInputData f62613a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new QR((QrFlowInputData) parcel.readParcelable(QR.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QR[i];
            }
        }

        public QR(QrFlowInputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f62613a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof QR) && Intrinsics.f(this.f62613a, ((QR) obj2).f62613a);
        }

        public final int hashCode() {
            return this.f62613a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62613a, i);
        }
    }
}
