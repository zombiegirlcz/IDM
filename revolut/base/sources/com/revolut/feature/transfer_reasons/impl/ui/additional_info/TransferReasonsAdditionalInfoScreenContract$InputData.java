package com.revolut.feature.transfer_reasons.impl.ui.additional_info;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfo;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transfer_reasons/impl/ui/additional_info/TransferReasonsAdditionalInfoScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferReasonsAdditionalInfoScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransferReasonsAdditionalInfoScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f92374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdditionalInfo f92375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f92376c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            AdditionalInfo additionalInfo = (AdditionalInfo) parcel.readParcelable(TransferReasonsAdditionalInfoScreenContract$InputData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TransferReasonsAdditionalInfoScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new TransferReasonsAdditionalInfoScreenContract$InputData(dVar, additionalInfo, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferReasonsAdditionalInfoScreenContract$InputData[i];
        }
    }

    public TransferReasonsAdditionalInfoScreenContract$InputData(d amount, AdditionalInfo info, List values) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f92374a = amount;
        this.f92375b = info;
        this.f92376c = values;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferReasonsAdditionalInfoScreenContract$InputData)) {
            return false;
        }
        TransferReasonsAdditionalInfoScreenContract$InputData transferReasonsAdditionalInfoScreenContract$InputData = (TransferReasonsAdditionalInfoScreenContract$InputData) obj2;
        return Intrinsics.f(this.f92374a, transferReasonsAdditionalInfoScreenContract$InputData.f92374a) && Intrinsics.f(this.f92375b, transferReasonsAdditionalInfoScreenContract$InputData.f92375b) && Intrinsics.f(this.f92376c, transferReasonsAdditionalInfoScreenContract$InputData.f92376c);
    }

    public final int hashCode() {
        return this.f92376c.hashCode() + ((this.f92375b.hashCode() + (this.f92374a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f92374a);
        dest.writeParcelable(this.f92375b, i);
        Iterator itV = p.a.v(this.f92376c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
