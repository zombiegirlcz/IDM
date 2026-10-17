package com.revolut.retail.feature.payments.bank_transfer.impl.structured_reference_transfer_note;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/payments/bank_transfer/impl/structured_reference_transfer_note/StructuredReferenceTransferNoteScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StructuredReferenceTransferNoteScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<StructuredReferenceTransferNoteScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferNote.StructuredNote f102058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f102059b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            TransferNote.StructuredNote structuredNote = (TransferNote.StructuredNote) j6.a.f(parcel, "parcel", StructuredReferenceTransferNoteScreenContract$InputData.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(StructuredReferenceTransferNoteScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new StructuredReferenceTransferNoteScreenContract$InputData(structuredNote, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StructuredReferenceTransferNoteScreenContract$InputData[i];
        }
    }

    public StructuredReferenceTransferNoteScreenContract$InputData(TransferNote.StructuredNote transferNote, List referenceOptions) {
        Intrinsics.checkNotNullParameter(transferNote, "transferNote");
        Intrinsics.checkNotNullParameter(referenceOptions, "referenceOptions");
        this.f102058a = transferNote;
        this.f102059b = referenceOptions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StructuredReferenceTransferNoteScreenContract$InputData)) {
            return false;
        }
        StructuredReferenceTransferNoteScreenContract$InputData structuredReferenceTransferNoteScreenContract$InputData = (StructuredReferenceTransferNoteScreenContract$InputData) obj2;
        return Intrinsics.f(this.f102058a, structuredReferenceTransferNoteScreenContract$InputData.f102058a) && Intrinsics.f(this.f102059b, structuredReferenceTransferNoteScreenContract$InputData.f102059b);
    }

    public final int hashCode() {
        return this.f102059b.hashCode() + (this.f102058a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f102058a, i);
        Iterator itV = p.a.v(this.f102059b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
