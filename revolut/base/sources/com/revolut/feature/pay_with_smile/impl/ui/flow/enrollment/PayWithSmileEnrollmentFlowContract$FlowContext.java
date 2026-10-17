package com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlowContract$FlowContext", "Landroid/os/Parcelable;", "Acceptance", "Processing", "Lcom/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlowContract$FlowContext$Acceptance;", "Lcom/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlowContract$FlowContext$Processing;", "feature_pay_with_smile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PayWithSmileEnrollmentFlowContract$FlowContext extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlowContract$FlowContext$Acceptance;", "Lcom/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlowContract$FlowContext;", "", "toString", "()Ljava/lang/String;", "feature_pay_with_smile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Acceptance implements PayWithSmileEnrollmentFlowContract$FlowContext {

        @NotNull
        public static final Parcelable.Creator<Acceptance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f78968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f78969b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Acceptance((BigDecimal) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Acceptance[i];
            }
        }

        public Acceptance(BigDecimal bigDecimal, boolean z) {
            this.f78968a = bigDecimal;
            this.f78969b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Acceptance)) {
                return false;
            }
            Acceptance acceptance = (Acceptance) obj2;
            return Intrinsics.f(this.f78968a, acceptance.f78968a) && this.f78969b == acceptance.f78969b;
        }

        public final int hashCode() {
            BigDecimal bigDecimal = this.f78968a;
            return Boolean.hashCode(this.f78969b) + ((bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78968a);
            dest.writeInt(this.f78969b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlowContract$FlowContext$Processing;", "Lcom/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlowContract$FlowContext;", "<init>", "()V", "feature_pay_with_smile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Processing implements PayWithSmileEnrollmentFlowContract$FlowContext {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Processing f78970a = new Processing();

        @NotNull
        public static final Parcelable.Creator<Processing> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Processing.f78970a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Processing[i];
            }
        }

        private Processing() {
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
