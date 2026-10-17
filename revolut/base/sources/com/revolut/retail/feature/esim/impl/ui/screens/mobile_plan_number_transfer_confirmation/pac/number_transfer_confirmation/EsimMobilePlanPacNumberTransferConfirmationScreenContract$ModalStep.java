package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingInstruction;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingPreferredSchedule;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/pac/number_transfer_confirmation/EsimMobilePlanPacNumberTransferConfirmationScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PortingPreferredSchedulePicker", "TrackPortabilityStatus", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/pac/number_transfer_confirmation/EsimMobilePlanPacNumberTransferConfirmationScreenContract$ModalStep$PortingPreferredSchedulePicker;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/pac/number_transfer_confirmation/EsimMobilePlanPacNumberTransferConfirmationScreenContract$ModalStep$TrackPortabilityStatus;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EsimMobilePlanPacNumberTransferConfirmationScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/pac/number_transfer_confirmation/EsimMobilePlanPacNumberTransferConfirmationScreenContract$ModalStep$PortingPreferredSchedulePicker;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/pac/number_transfer_confirmation/EsimMobilePlanPacNumberTransferConfirmationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PortingPreferredSchedulePicker extends EsimMobilePlanPacNumberTransferConfirmationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PortingPreferredSchedulePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimPhoneNumberPortingPreferredSchedule f101311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f101312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final EsimPhoneNumberPortingInstruction f101313c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                EsimPhoneNumberPortingPreferredSchedule esimPhoneNumberPortingPreferredSchedule = (EsimPhoneNumberPortingPreferredSchedule) j6.a.f(parcel, "parcel", PortingPreferredSchedulePicker.class);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(PortingPreferredSchedulePicker.class, parcel, arrayList, iE, 1);
                }
                return new PortingPreferredSchedulePicker(esimPhoneNumberPortingPreferredSchedule, arrayList, (EsimPhoneNumberPortingInstruction) parcel.readParcelable(PortingPreferredSchedulePicker.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PortingPreferredSchedulePicker[i];
            }
        }

        public PortingPreferredSchedulePicker(EsimPhoneNumberPortingPreferredSchedule preferredSchedule, ArrayList preferredScheduleOptions, EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction) {
            Intrinsics.checkNotNullParameter(preferredSchedule, "preferredSchedule");
            Intrinsics.checkNotNullParameter(preferredScheduleOptions, "preferredScheduleOptions");
            this.f101311a = preferredSchedule;
            this.f101312b = preferredScheduleOptions;
            this.f101313c = esimPhoneNumberPortingInstruction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PortingPreferredSchedulePicker)) {
                return false;
            }
            PortingPreferredSchedulePicker portingPreferredSchedulePicker = (PortingPreferredSchedulePicker) obj2;
            return Intrinsics.f(this.f101311a, portingPreferredSchedulePicker.f101311a) && this.f101312b.equals(portingPreferredSchedulePicker.f101312b) && Intrinsics.f(this.f101313c, portingPreferredSchedulePicker.f101313c);
        }

        public final int hashCode() {
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f101312b, this.f101311a.hashCode() * 31, 31);
            EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction = this.f101313c;
            return iB + (esimPhoneNumberPortingInstruction == null ? 0 : esimPhoneNumberPortingInstruction.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101311a, i);
            Iterator itY = j6.a.y(this.f101312b, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeParcelable(this.f101313c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/pac/number_transfer_confirmation/EsimMobilePlanPacNumberTransferConfirmationScreenContract$ModalStep$TrackPortabilityStatus;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/pac/number_transfer_confirmation/EsimMobilePlanPacNumberTransferConfirmationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TrackPortabilityStatus extends EsimMobilePlanPacNumberTransferConfirmationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TrackPortabilityStatus> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f101314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f101315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f101316c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Clause clause = (Clause) j6.a.f(parcel, "parcel", TrackPortabilityStatus.class);
                Clause clause2 = (Clause) parcel.readParcelable(TrackPortabilityStatus.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(TrackPortabilityStatus.class, parcel, arrayList, iE, 1);
                }
                return new TrackPortabilityStatus(clause, clause2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TrackPortabilityStatus[i];
            }
        }

        public TrackPortabilityStatus(Clause title, Clause clause, ArrayList portingSteps) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(portingSteps, "portingSteps");
            this.f101314a = title;
            this.f101315b = clause;
            this.f101316c = portingSteps;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TrackPortabilityStatus)) {
                return false;
            }
            TrackPortabilityStatus trackPortabilityStatus = (TrackPortabilityStatus) obj2;
            return Intrinsics.f(this.f101314a, trackPortabilityStatus.f101314a) && Intrinsics.f(this.f101315b, trackPortabilityStatus.f101315b) && this.f101316c.equals(trackPortabilityStatus.f101316c);
        }

        public final int hashCode() {
            int iHashCode = this.f101314a.hashCode() * 31;
            Clause clause = this.f101315b;
            return this.f101316c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101314a, i);
            dest.writeParcelable(this.f101315b, i);
            Iterator itY = j6.a.y(this.f101316c, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    private EsimMobilePlanPacNumberTransferConfirmationScreenContract$ModalStep() {
    }
}
