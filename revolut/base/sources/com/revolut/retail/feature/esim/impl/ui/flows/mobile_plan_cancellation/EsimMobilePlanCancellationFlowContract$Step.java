package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import dej.p0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_cancellation/EsimMobilePlanCancellationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CancellationReasonForm", "Cancellation", "EsimRefund", "Help", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_cancellation/EsimMobilePlanCancellationFlowContract$Step$Cancellation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_cancellation/EsimMobilePlanCancellationFlowContract$Step$CancellationReasonForm;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_cancellation/EsimMobilePlanCancellationFlowContract$Step$EsimRefund;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_cancellation/EsimMobilePlanCancellationFlowContract$Step$Help;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimMobilePlanCancellationFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_cancellation/EsimMobilePlanCancellationFlowContract$Step$Cancellation;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_cancellation/EsimMobilePlanCancellationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cancellation implements EsimMobilePlanCancellationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Cancellation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p0 f100703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f100704c;
        public final EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType d;
        public final EsimGiftRecipient e;
        public final String f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Cancellation(parcel.readString(), parcel.readInt() == 0 ? null : p0.valueOf(parcel.readString()), parcel.readString(), (EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType) parcel.readParcelable(Cancellation.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(Cancellation.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cancellation[i];
            }
        }

        public Cancellation(String str, p0 p0Var, String str2, EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType cancellationType, EsimGiftRecipient esimGiftRecipient, String str3) {
            Intrinsics.checkNotNullParameter(cancellationType, "cancellationType");
            this.f100702a = str;
            this.f100703b = p0Var;
            this.f100704c = str2;
            this.d = cancellationType;
            this.e = esimGiftRecipient;
            this.f = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Cancellation)) {
                return false;
            }
            Cancellation cancellation = (Cancellation) obj2;
            return Intrinsics.f(this.f100702a, cancellation.f100702a) && this.f100703b == cancellation.f100703b && Intrinsics.f(this.f100704c, cancellation.f100704c) && Intrinsics.f(this.d, cancellation.d) && Intrinsics.f(this.e, cancellation.e) && Intrinsics.f(this.f, cancellation.f);
        }

        public final int hashCode() {
            String str = this.f100702a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            p0 p0Var = this.f100703b;
            int iHashCode2 = (iHashCode + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
            String str2 = this.f100704c;
            int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            EsimGiftRecipient esimGiftRecipient = this.e;
            int iHashCode4 = (iHashCode3 + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode())) * 31;
            String str3 = this.f;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100702a);
            p0 p0Var = this.f100703b;
            if (p0Var == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(p0Var.name());
            }
            dest.writeString(this.f100704c);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeString(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_cancellation/EsimMobilePlanCancellationFlowContract$Step$CancellationReasonForm;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_cancellation/EsimMobilePlanCancellationFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CancellationReasonForm implements EsimMobilePlanCancellationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CancellationReasonForm f100705a = new CancellationReasonForm();

        @NotNull
        public static final Parcelable.Creator<CancellationReasonForm> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CancellationReasonForm.f100705a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancellationReasonForm[i];
            }
        }

        private CancellationReasonForm() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_cancellation/EsimMobilePlanCancellationFlowContract$Step$EsimRefund;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_cancellation/EsimMobilePlanCancellationFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EsimRefund implements EsimMobilePlanCancellationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EsimRefund f100706a = new EsimRefund();

        @NotNull
        public static final Parcelable.Creator<EsimRefund> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EsimRefund.f100706a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EsimRefund[i];
            }
        }

        private EsimRefund() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_cancellation/EsimMobilePlanCancellationFlowContract$Step$Help;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_cancellation/EsimMobilePlanCancellationFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Help implements EsimMobilePlanCancellationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Help f100707a = new Help();

        @NotNull
        public static final Parcelable.Creator<Help> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Help.f100707a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Help[i];
            }
        }

        private Help() {
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
