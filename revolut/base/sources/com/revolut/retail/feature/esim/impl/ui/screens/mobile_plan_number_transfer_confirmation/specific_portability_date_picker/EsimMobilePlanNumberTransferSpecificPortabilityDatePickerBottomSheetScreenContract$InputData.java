package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.specific_portability_date_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/specific_portability_date_picker/EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f101360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f101361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f101362c;
    public final List d;
    public final EsimGiftRecipient e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            ArrayList arrayList = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
            }
            return new EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData(localDate, lValueOf, localDate2, arrayList, (EsimGiftRecipient) parcel.readParcelable(EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData[i];
        }
    }

    public EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData(LocalDate localDate, Long l2, LocalDate localDate2, List list, EsimGiftRecipient esimGiftRecipient) {
        this.f101360a = localDate;
        this.f101361b = l2;
        this.f101362c = localDate2;
        this.d = list;
        this.e = esimGiftRecipient;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData)) {
            return false;
        }
        EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData = (EsimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101360a, esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.f101360a) && Intrinsics.f(this.f101361b, esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.f101361b) && Intrinsics.f(this.f101362c, esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.f101362c) && Intrinsics.f(this.d, esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.d) && Intrinsics.f(this.e, esimMobilePlanNumberTransferSpecificPortabilityDatePickerBottomSheetScreenContract$InputData.e);
    }

    public final int hashCode() {
        LocalDate localDate = this.f101360a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        Long l2 = this.f101361b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        LocalDate localDate2 = this.f101362c;
        int iHashCode3 = (iHashCode2 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        EsimGiftRecipient esimGiftRecipient = this.e;
        return iHashCode4 + (esimGiftRecipient != null ? esimGiftRecipient.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f101360a);
        Long l2 = this.f101361b;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        dest.writeSerializable(this.f101362c);
        List list = this.d;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeSerializable((Serializable) itQ.next());
            }
        }
        dest.writeParcelable(this.e, i);
    }
}
