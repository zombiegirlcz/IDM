package com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestinationParcel;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import g3a.e;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/who_to_transfer/impl/transfer/new_transfer/NewTransferScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NewTransferScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<NewTransferScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f80119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferDestinationParcel f80120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f80121c;
    public final e d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = d.e(NewTransferScreenContract$InputData.class, parcel, linkedHashSet, iE, 1);
            }
            return new NewTransferScreenContract$InputData(linkedHashSet, (TransferDestinationParcel) parcel.readParcelable(NewTransferScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0, e.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NewTransferScreenContract$InputData[i];
        }
    }

    public NewTransferScreenContract$InputData(Set availableFilters, TransferDestinationParcel transferDestinationParcel, boolean z, e entryPoint) {
        Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.f80119a = availableFilters;
        this.f80120b = transferDestinationParcel;
        this.f80121c = z;
        this.d = entryPoint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NewTransferScreenContract$InputData)) {
            return false;
        }
        NewTransferScreenContract$InputData newTransferScreenContract$InputData = (NewTransferScreenContract$InputData) obj2;
        return Intrinsics.f(this.f80119a, newTransferScreenContract$InputData.f80119a) && Intrinsics.f(this.f80120b, newTransferScreenContract$InputData.f80120b) && this.f80121c == newTransferScreenContract$InputData.f80121c && this.d == newTransferScreenContract$InputData.d;
    }

    public final int hashCode() {
        int iHashCode = this.f80119a.hashCode() * 31;
        TransferDestinationParcel transferDestinationParcel = this.f80120b;
        return this.d.hashCode() + j6.a.c((iHashCode + (transferDestinationParcel == null ? 0 : transferDestinationParcel.hashCode())) * 31, 31, this.f80121c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f80119a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f80120b, i);
        dest.writeInt(this.f80121c ? 1 : 0);
        dest.writeString(this.d.name());
    }
}
