package com.revolut.retail.feature.payments.bank_transfer.impl.new_zealand_transfer_note;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/payments/bank_transfer/impl/new_zealand_transfer_note/NewZealandTransferNoteScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NewZealandTransferNoteScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<NewZealandTransferNoteScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferNote.NewZealandNote f102012a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NewZealandTransferNoteScreenContract$InputData((TransferNote.NewZealandNote) parcel.readParcelable(NewZealandTransferNoteScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NewZealandTransferNoteScreenContract$InputData[i];
        }
    }

    public NewZealandTransferNoteScreenContract$InputData(TransferNote.NewZealandNote note) {
        Intrinsics.checkNotNullParameter(note, "note");
        this.f102012a = note;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof NewZealandTransferNoteScreenContract$InputData) && Intrinsics.f(this.f102012a, ((NewZealandTransferNoteScreenContract$InputData) obj2).f102012a);
    }

    public final int hashCode() {
        return this.f102012a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f102012a, i);
    }
}
