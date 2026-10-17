package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingInstruction;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingPreferredSchedule;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingScheduleOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/portability_date_picker/EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberPortingPreferredSchedule f101330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f101331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f101332c;
    public final EsimPhoneNumberPortingScheduleOption d;
    public final EsimPhoneNumberPortingInstruction e;
    public final EsimGiftRecipient f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            EsimPhoneNumberPortingPreferredSchedule esimPhoneNumberPortingPreferredSchedule = (EsimPhoneNumberPortingPreferredSchedule) j6.a.f(parcel, "parcel", EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData(esimPhoneNumberPortingPreferredSchedule, arrayList, (LocalDate) parcel.readSerializable(), (EsimPhoneNumberPortingScheduleOption) parcel.readParcelable(EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData.class.getClassLoader()), (EsimPhoneNumberPortingInstruction) parcel.readParcelable(EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData[i];
        }
    }

    public EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData(EsimPhoneNumberPortingPreferredSchedule preferredSchedule, List preferredScheduleOptions, LocalDate localDate, EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption, EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction, EsimGiftRecipient esimGiftRecipient) {
        Intrinsics.checkNotNullParameter(preferredSchedule, "preferredSchedule");
        Intrinsics.checkNotNullParameter(preferredScheduleOptions, "preferredScheduleOptions");
        this.f101330a = preferredSchedule;
        this.f101331b = preferredScheduleOptions;
        this.f101332c = localDate;
        this.d = esimPhoneNumberPortingScheduleOption;
        this.e = esimPhoneNumberPortingInstruction;
        this.f = esimGiftRecipient;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData)) {
            return false;
        }
        EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData = (EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101330a, esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData.f101330a) && Intrinsics.f(this.f101331b, esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData.f101331b) && Intrinsics.f(this.f101332c, esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData.f101332c) && Intrinsics.f(this.d, esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData.d) && Intrinsics.f(this.e, esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData.e) && Intrinsics.f(this.f, esimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData.f);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f101330a.hashCode() * 31, 31, this.f101331b);
        LocalDate localDate = this.f101332c;
        int iHashCode = (iD + (localDate == null ? 0 : localDate.hashCode())) * 31;
        EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption = this.d;
        int iHashCode2 = (iHashCode + (esimPhoneNumberPortingScheduleOption == null ? 0 : esimPhoneNumberPortingScheduleOption.hashCode())) * 31;
        EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction = this.e;
        int iHashCode3 = (iHashCode2 + (esimPhoneNumberPortingInstruction == null ? 0 : esimPhoneNumberPortingInstruction.hashCode())) * 31;
        EsimGiftRecipient esimGiftRecipient = this.f;
        return iHashCode3 + (esimGiftRecipient != null ? esimGiftRecipient.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f101330a, i);
        Iterator itV = p.a.v(this.f101331b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeSerializable(this.f101332c);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
    }
}
