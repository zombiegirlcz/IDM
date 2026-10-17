package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/otp/number_transfer_confirmation/EsimMobilePlanOtpNumberTransferConfirmationScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "TrackPortabilityStatus", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/otp/number_transfer_confirmation/EsimMobilePlanOtpNumberTransferConfirmationScreenContract$ModalStep$TrackPortabilityStatus;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EsimMobilePlanOtpNumberTransferConfirmationScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/otp/number_transfer_confirmation/EsimMobilePlanOtpNumberTransferConfirmationScreenContract$ModalStep$TrackPortabilityStatus;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/otp/number_transfer_confirmation/EsimMobilePlanOtpNumberTransferConfirmationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TrackPortabilityStatus extends EsimMobilePlanOtpNumberTransferConfirmationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TrackPortabilityStatus> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f101291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f101292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f101293c;

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
            this.f101291a = title;
            this.f101292b = clause;
            this.f101293c = portingSteps;
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
            return Intrinsics.f(this.f101291a, trackPortabilityStatus.f101291a) && Intrinsics.f(this.f101292b, trackPortabilityStatus.f101292b) && this.f101293c.equals(trackPortabilityStatus.f101293c);
        }

        public final int hashCode() {
            int iHashCode = this.f101291a.hashCode() * 31;
            Clause clause = this.f101292b;
            return this.f101293c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101291a, i);
            dest.writeParcelable(this.f101292b, i);
            Iterator itY = j6.a.y(this.f101293c, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    private EsimMobilePlanOtpNumberTransferConfirmationScreenContract$ModalStep() {
    }
}
