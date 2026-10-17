package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingProgress;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "PhoneNumberActions", "EditLabel", "TerminatePhoneNumber", "CancelPortIn", "CancelPortOut", "GetPacCode", "GetStacCode", "PortInStatus", "ReleasePhoneNumber", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep$CancelPortIn;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep$CancelPortOut;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep$EditLabel;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep$GetPacCode;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep$GetStacCode;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep$PhoneNumberActions;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep$PortInStatus;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep$ReleasePhoneNumber;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep$TerminatePhoneNumber;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimMobilePlanMyNumbersScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep$CancelPortIn;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelPortIn implements EsimMobilePlanMyNumbersScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CancelPortIn> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimSubscriptionPhoneNumber f101238a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancelPortIn((EsimSubscriptionPhoneNumber) parcel.readParcelable(CancelPortIn.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelPortIn[i];
            }
        }

        public CancelPortIn(EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber) {
            Intrinsics.checkNotNullParameter(esimSubscriptionPhoneNumber, "esimSubscriptionPhoneNumber");
            this.f101238a = esimSubscriptionPhoneNumber;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancelPortIn) && Intrinsics.f(this.f101238a, ((CancelPortIn) obj2).f101238a);
        }

        public final int hashCode() {
            return this.f101238a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101238a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep$CancelPortOut;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelPortOut implements EsimMobilePlanMyNumbersScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CancelPortOut> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimSubscriptionPhoneNumber f101239a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancelPortOut((EsimSubscriptionPhoneNumber) parcel.readParcelable(CancelPortOut.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelPortOut[i];
            }
        }

        public CancelPortOut(EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber) {
            Intrinsics.checkNotNullParameter(esimSubscriptionPhoneNumber, "esimSubscriptionPhoneNumber");
            this.f101239a = esimSubscriptionPhoneNumber;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancelPortOut) && Intrinsics.f(this.f101239a, ((CancelPortOut) obj2).f101239a);
        }

        public final int hashCode() {
            return this.f101239a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101239a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep$EditLabel;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditLabel implements EsimMobilePlanMyNumbersScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EditLabel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimSubscriptionPhoneNumber f101240a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditLabel((EsimSubscriptionPhoneNumber) parcel.readParcelable(EditLabel.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditLabel[i];
            }
        }

        public EditLabel(EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber) {
            Intrinsics.checkNotNullParameter(esimSubscriptionPhoneNumber, "esimSubscriptionPhoneNumber");
            this.f101240a = esimSubscriptionPhoneNumber;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditLabel) && Intrinsics.f(this.f101240a, ((EditLabel) obj2).f101240a);
        }

        public final int hashCode() {
            return this.f101240a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101240a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep$GetPacCode;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GetPacCode implements EsimMobilePlanMyNumbersScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<GetPacCode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimSubscriptionPhoneNumber f101241a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GetPacCode((EsimSubscriptionPhoneNumber) parcel.readParcelable(GetPacCode.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GetPacCode[i];
            }
        }

        public GetPacCode(EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber) {
            Intrinsics.checkNotNullParameter(esimSubscriptionPhoneNumber, "esimSubscriptionPhoneNumber");
            this.f101241a = esimSubscriptionPhoneNumber;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GetPacCode) && Intrinsics.f(this.f101241a, ((GetPacCode) obj2).f101241a);
        }

        public final int hashCode() {
            return this.f101241a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101241a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep$GetStacCode;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GetStacCode implements EsimMobilePlanMyNumbersScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<GetStacCode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimSubscriptionPhoneNumber f101242a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GetStacCode((EsimSubscriptionPhoneNumber) parcel.readParcelable(GetStacCode.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GetStacCode[i];
            }
        }

        public GetStacCode(EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber) {
            Intrinsics.checkNotNullParameter(esimSubscriptionPhoneNumber, "esimSubscriptionPhoneNumber");
            this.f101242a = esimSubscriptionPhoneNumber;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GetStacCode) && Intrinsics.f(this.f101242a, ((GetStacCode) obj2).f101242a);
        }

        public final int hashCode() {
            return this.f101242a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101242a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep$PhoneNumberActions;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PhoneNumberActions implements EsimMobilePlanMyNumbersScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PhoneNumberActions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimSubscriptionPhoneNumber f101243a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PhoneNumberActions((EsimSubscriptionPhoneNumber) parcel.readParcelable(PhoneNumberActions.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PhoneNumberActions[i];
            }
        }

        public PhoneNumberActions(EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber) {
            Intrinsics.checkNotNullParameter(esimSubscriptionPhoneNumber, "esimSubscriptionPhoneNumber");
            this.f101243a = esimSubscriptionPhoneNumber;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PhoneNumberActions) && Intrinsics.f(this.f101243a, ((PhoneNumberActions) obj2).f101243a);
        }

        public final int hashCode() {
            return this.f101243a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101243a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep$PortInStatus;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PortInStatus implements EsimMobilePlanMyNumbersScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PortInStatus> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimSubscriptionPhoneNumber f101244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimPhoneNumberPortingProgress f101245b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PortInStatus((EsimSubscriptionPhoneNumber) parcel.readParcelable(PortInStatus.class.getClassLoader()), (EsimPhoneNumberPortingProgress) parcel.readParcelable(PortInStatus.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PortInStatus[i];
            }
        }

        public PortInStatus(EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber, EsimPhoneNumberPortingProgress progress) {
            Intrinsics.checkNotNullParameter(progress, "progress");
            this.f101244a = esimSubscriptionPhoneNumber;
            this.f101245b = progress;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PortInStatus)) {
                return false;
            }
            PortInStatus portInStatus = (PortInStatus) obj2;
            return Intrinsics.f(this.f101244a, portInStatus.f101244a) && Intrinsics.f(this.f101245b, portInStatus.f101245b);
        }

        public final int hashCode() {
            EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber = this.f101244a;
            return this.f101245b.hashCode() + ((esimSubscriptionPhoneNumber == null ? 0 : esimSubscriptionPhoneNumber.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101244a, i);
            dest.writeParcelable(this.f101245b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep$ReleasePhoneNumber;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReleasePhoneNumber implements EsimMobilePlanMyNumbersScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ReleasePhoneNumber> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimSubscriptionPhoneNumber f101246a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReleasePhoneNumber((EsimSubscriptionPhoneNumber) parcel.readParcelable(ReleasePhoneNumber.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReleasePhoneNumber[i];
            }
        }

        public ReleasePhoneNumber(EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber) {
            Intrinsics.checkNotNullParameter(esimSubscriptionPhoneNumber, "esimSubscriptionPhoneNumber");
            this.f101246a = esimSubscriptionPhoneNumber;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReleasePhoneNumber) && Intrinsics.f(this.f101246a, ((ReleasePhoneNumber) obj2).f101246a);
        }

        public final int hashCode() {
            return this.f101246a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101246a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep$TerminatePhoneNumber;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TerminatePhoneNumber implements EsimMobilePlanMyNumbersScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TerminatePhoneNumber> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimSubscriptionPhoneNumber f101247a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TerminatePhoneNumber((EsimSubscriptionPhoneNumber) parcel.readParcelable(TerminatePhoneNumber.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TerminatePhoneNumber[i];
            }
        }

        public TerminatePhoneNumber(EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber) {
            Intrinsics.checkNotNullParameter(esimSubscriptionPhoneNumber, "esimSubscriptionPhoneNumber");
            this.f101247a = esimSubscriptionPhoneNumber;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TerminatePhoneNumber) && Intrinsics.f(this.f101247a, ((TerminatePhoneNumber) obj2).f101247a);
        }

        public final int hashCode() {
            return this.f101247a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101247a, i);
        }
    }
}
