package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimIcon;
import com.revolut.retail.feature.esim.api.model.EsimInfoBottomSheetData;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.model.EsimProfileEntry;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionCancellationConfirmation;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CoverageCountries", "EsimMigration", "PerkInfoBottomSheet", "EsimTransferConfirmation", "RequestPacCode", "EsimInstallation", "ShareEsim", "SubscriptionActivationConfirmation", "CancellationConfirmation", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep$CancellationConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep$CoverageCountries;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep$EsimInstallation;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep$EsimMigration;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep$EsimTransferConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep$PerkInfoBottomSheet;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep$RequestPacCode;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep$ShareEsim;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep$SubscriptionActivationConfirmation;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimMobilePlanDetailsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep$CancellationConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancellationConfirmation implements EsimMobilePlanDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CancellationConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType f101192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimSubscriptionCancellationConfirmation f101193b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancellationConfirmation((EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType) parcel.readParcelable(CancellationConfirmation.class.getClassLoader()), (EsimSubscriptionCancellationConfirmation) parcel.readParcelable(CancellationConfirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancellationConfirmation[i];
            }
        }

        public CancellationConfirmation(EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType cancellationType, EsimSubscriptionCancellationConfirmation confirmation) {
            Intrinsics.checkNotNullParameter(cancellationType, "cancellationType");
            Intrinsics.checkNotNullParameter(confirmation, "confirmation");
            this.f101192a = cancellationType;
            this.f101193b = confirmation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CancellationConfirmation)) {
                return false;
            }
            CancellationConfirmation cancellationConfirmation = (CancellationConfirmation) obj2;
            return Intrinsics.f(this.f101192a, cancellationConfirmation.f101192a) && Intrinsics.f(this.f101193b, cancellationConfirmation.f101193b);
        }

        public final int hashCode() {
            return this.f101193b.hashCode() + (this.f101192a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101192a, i);
            dest.writeParcelable(this.f101193b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep$CoverageCountries;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CoverageCountries implements EsimMobilePlanDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CoverageCountries> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f101194a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new CoverageCountries(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CoverageCountries[i];
            }
        }

        public CoverageCountries(List countries) {
            Intrinsics.checkNotNullParameter(countries, "countries");
            this.f101194a = countries;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CoverageCountries) && Intrinsics.f(this.f101194a, ((CoverageCountries) obj2).f101194a);
        }

        public final int hashCode() {
            return this.f101194a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f101194a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep$EsimInstallation;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EsimInstallation implements EsimMobilePlanDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EsimInstallation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimProfile f101195a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EsimInstallation((EsimProfile) parcel.readParcelable(EsimInstallation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EsimInstallation[i];
            }
        }

        public EsimInstallation(EsimProfile esimProfile) {
            Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
            this.f101195a = esimProfile;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EsimInstallation) && Intrinsics.f(this.f101195a, ((EsimInstallation) obj2).f101195a);
        }

        public final int hashCode() {
            return this.f101195a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101195a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep$EsimMigration;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EsimMigration implements EsimMobilePlanDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EsimMigration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f101196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimProfileEntry f101197b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EsimMigration(parcel.readInt() != 0, (EsimProfileEntry) parcel.readParcelable(EsimMigration.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EsimMigration[i];
            }
        }

        public EsimMigration(boolean z, EsimProfileEntry esimProfileEntry) {
            Intrinsics.checkNotNullParameter(esimProfileEntry, "esimProfileEntry");
            this.f101196a = z;
            this.f101197b = esimProfileEntry;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EsimMigration)) {
                return false;
            }
            EsimMigration esimMigration = (EsimMigration) obj2;
            return this.f101196a == esimMigration.f101196a && Intrinsics.f(this.f101197b, esimMigration.f101197b);
        }

        public final int hashCode() {
            return this.f101197b.hashCode() + (Boolean.hashCode(this.f101196a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f101196a ? 1 : 0);
            dest.writeParcelable(this.f101197b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep$EsimTransferConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EsimTransferConfirmation implements EsimMobilePlanDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EsimTransferConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimProfile f101199b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EsimTransferConfirmation((EsimProfile) parcel.readParcelable(EsimTransferConfirmation.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EsimTransferConfirmation[i];
            }
        }

        public EsimTransferConfirmation(EsimProfile profileToTransfer, String deviceNameFromWhichEsimTransfers) {
            Intrinsics.checkNotNullParameter(deviceNameFromWhichEsimTransfers, "deviceNameFromWhichEsimTransfers");
            Intrinsics.checkNotNullParameter(profileToTransfer, "profileToTransfer");
            this.f101198a = deviceNameFromWhichEsimTransfers;
            this.f101199b = profileToTransfer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EsimTransferConfirmation)) {
                return false;
            }
            EsimTransferConfirmation esimTransferConfirmation = (EsimTransferConfirmation) obj2;
            return Intrinsics.f(this.f101198a, esimTransferConfirmation.f101198a) && Intrinsics.f(this.f101199b, esimTransferConfirmation.f101199b);
        }

        public final int hashCode() {
            return this.f101199b.hashCode() + (this.f101198a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101198a);
            dest.writeParcelable(this.f101199b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep$PerkInfoBottomSheet;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PerkInfoBottomSheet implements EsimMobilePlanDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PerkInfoBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimIcon f101200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimInfoBottomSheetData f101201b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PerkInfoBottomSheet((EsimIcon) parcel.readParcelable(PerkInfoBottomSheet.class.getClassLoader()), (EsimInfoBottomSheetData) parcel.readParcelable(PerkInfoBottomSheet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PerkInfoBottomSheet[i];
            }
        }

        public PerkInfoBottomSheet(EsimIcon esimIcon, EsimInfoBottomSheetData details) {
            Intrinsics.checkNotNullParameter(details, "details");
            this.f101200a = esimIcon;
            this.f101201b = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PerkInfoBottomSheet)) {
                return false;
            }
            PerkInfoBottomSheet perkInfoBottomSheet = (PerkInfoBottomSheet) obj2;
            return Intrinsics.f(this.f101200a, perkInfoBottomSheet.f101200a) && Intrinsics.f(this.f101201b, perkInfoBottomSheet.f101201b);
        }

        public final int hashCode() {
            EsimIcon esimIcon = this.f101200a;
            return this.f101201b.hashCode() + ((esimIcon == null ? 0 : esimIcon.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101200a, i);
            dest.writeParcelable(this.f101201b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep$RequestPacCode;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RequestPacCode implements EsimMobilePlanDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RequestPacCode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimSubscriptionPhoneNumber f101202a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RequestPacCode((EsimSubscriptionPhoneNumber) parcel.readParcelable(RequestPacCode.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestPacCode[i];
            }
        }

        public RequestPacCode(EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber) {
            Intrinsics.checkNotNullParameter(esimSubscriptionPhoneNumber, "esimSubscriptionPhoneNumber");
            this.f101202a = esimSubscriptionPhoneNumber;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RequestPacCode) && Intrinsics.f(this.f101202a, ((RequestPacCode) obj2).f101202a);
        }

        public final int hashCode() {
            return this.f101202a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101202a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep$ShareEsim;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShareEsim implements EsimMobilePlanDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ShareEsim> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101203a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShareEsim(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShareEsim[i];
            }
        }

        public ShareEsim(String simProfileId) {
            Intrinsics.checkNotNullParameter(simProfileId, "simProfileId");
            this.f101203a = simProfileId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShareEsim) && Intrinsics.f(this.f101203a, ((ShareEsim) obj2).f101203a);
        }

        public final int hashCode() {
            return this.f101203a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101203a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep$SubscriptionActivationConfirmation;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubscriptionActivationConfirmation implements EsimMobilePlanDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SubscriptionActivationConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101204a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubscriptionActivationConfirmation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubscriptionActivationConfirmation[i];
            }
        }

        public SubscriptionActivationConfirmation(String subscriptionId) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            this.f101204a = subscriptionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SubscriptionActivationConfirmation) && Intrinsics.f(this.f101204a, ((SubscriptionActivationConfirmation) obj2).f101204a);
        }

        public final int hashCode() {
            return this.f101204a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101204a);
        }
    }
}
