package com.revolut.retail.feature.esim.impl.ui.flows.refund;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import dej.e3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/refund/EsimRefundFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Refund", "Help", "RefundReasonForm", "Restricted", "Lcom/revolut/retail/feature/esim/impl/ui/flows/refund/EsimRefundFlowContract$Step$Help;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/refund/EsimRefundFlowContract$Step$Refund;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/refund/EsimRefundFlowContract$Step$RefundReasonForm;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/refund/EsimRefundFlowContract$Step$Restricted;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EsimRefundFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/refund/EsimRefundFlowContract$Step$Help;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/refund/EsimRefundFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Help extends EsimRefundFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Help f100869a = new Help();

        @NotNull
        public static final Parcelable.Creator<Help> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Help.f100869a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/refund/EsimRefundFlowContract$Step$Refund;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/refund/EsimRefundFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Refund extends EsimRefundFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Refund> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e3 f100870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f100871b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Refund(parcel.readInt() == 0 ? null : e3.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Refund[i];
            }
        }

        public Refund(e3 e3Var, String str) {
            this.f100870a = e3Var;
            this.f100871b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Refund)) {
                return false;
            }
            Refund refund = (Refund) obj2;
            return this.f100870a == refund.f100870a && Intrinsics.f(this.f100871b, refund.f100871b);
        }

        public final int hashCode() {
            e3 e3Var = this.f100870a;
            int iHashCode = (e3Var == null ? 0 : e3Var.hashCode()) * 31;
            String str = this.f100871b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            e3 e3Var = this.f100870a;
            if (e3Var == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(e3Var.name());
            }
            dest.writeString(this.f100871b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/refund/EsimRefundFlowContract$Step$RefundReasonForm;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/refund/EsimRefundFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RefundReasonForm extends EsimRefundFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RefundReasonForm f100872a = new RefundReasonForm();

        @NotNull
        public static final Parcelable.Creator<RefundReasonForm> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RefundReasonForm.f100872a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RefundReasonForm[i];
            }
        }

        private RefundReasonForm() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/refund/EsimRefundFlowContract$Step$Restricted;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/refund/EsimRefundFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Restricted extends EsimRefundFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Restricted> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PromptMarketingScreenContract$InputData f100873a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Restricted((PromptMarketingScreenContract$InputData) parcel.readParcelable(Restricted.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Restricted[i];
            }
        }

        public Restricted(PromptMarketingScreenContract$InputData promptInput) {
            Intrinsics.checkNotNullParameter(promptInput, "promptInput");
            this.f100873a = promptInput;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Restricted) && Intrinsics.f(this.f100873a, ((Restricted) obj2).f100873a);
        }

        public final int hashCode() {
            return this.f100873a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100873a, i);
        }
    }

    private EsimRefundFlowContract$Step() {
    }
}
