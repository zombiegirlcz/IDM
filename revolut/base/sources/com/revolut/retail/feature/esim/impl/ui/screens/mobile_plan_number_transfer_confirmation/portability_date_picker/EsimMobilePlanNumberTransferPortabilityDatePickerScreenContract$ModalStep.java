package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/portability_date_picker/EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PortabilitySpecificDatePicker", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/portability_date_picker/EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$ModalStep$PortabilitySpecificDatePicker;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/portability_date_picker/EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$ModalStep$PortabilitySpecificDatePicker;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/portability_date_picker/EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PortabilitySpecificDatePicker extends EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PortabilitySpecificDatePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f101333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f101334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f101335c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                LocalDate localDate = (LocalDate) parcel.readSerializable();
                ArrayList arrayList = null;
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                if (parcel.readInt() != 0) {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    int iC = 0;
                    while (iC != i) {
                        iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
                    }
                    arrayList = arrayList2;
                }
                return new PortabilitySpecificDatePicker(localDate, lValueOf, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PortabilitySpecificDatePicker[i];
            }
        }

        public PortabilitySpecificDatePicker(LocalDate localDate, Long l2, List list) {
            this.f101333a = localDate;
            this.f101334b = l2;
            this.f101335c = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PortabilitySpecificDatePicker)) {
                return false;
            }
            PortabilitySpecificDatePicker portabilitySpecificDatePicker = (PortabilitySpecificDatePicker) obj2;
            return Intrinsics.f(this.f101333a, portabilitySpecificDatePicker.f101333a) && Intrinsics.f(this.f101334b, portabilitySpecificDatePicker.f101334b) && Intrinsics.f(this.f101335c, portabilitySpecificDatePicker.f101335c);
        }

        public final int hashCode() {
            LocalDate localDate = this.f101333a;
            int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
            Long l2 = this.f101334b;
            int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            List list = this.f101335c;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f101333a);
            Long l2 = this.f101334b;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                b.A(dest, 1, l2);
            }
            List list = this.f101335c;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeSerializable((Serializable) itQ.next());
            }
        }
    }

    private EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$ModalStep() {
    }
}
