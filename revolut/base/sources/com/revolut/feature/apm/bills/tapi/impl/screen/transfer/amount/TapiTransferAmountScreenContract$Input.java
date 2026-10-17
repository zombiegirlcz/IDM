package com.revolut.feature.apm.bills.tapi.impl.screen.transfer.amount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.search.tapi.BillSearchTapiResult;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/bills/tapi/impl/screen/transfer/amount/TapiTransferAmountScreenContract$Input", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_tapi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TapiTransferAmountScreenContract$Input implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TapiTransferAmountScreenContract$Input> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f61547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f61548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f61549c;
    public final BillSearchTapiResult d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TapiTransferAmountScreenContract$Input((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (BillSearchTapiResult) parcel.readParcelable(TapiTransferAmountScreenContract$Input.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TapiTransferAmountScreenContract$Input[i];
        }
    }

    public TapiTransferAmountScreenContract$Input(d amount, d dVar, d dVar2, BillSearchTapiResult tapiBill) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(tapiBill, "tapiBill");
        this.f61547a = amount;
        this.f61548b = dVar;
        this.f61549c = dVar2;
        this.d = tapiBill;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TapiTransferAmountScreenContract$Input)) {
            return false;
        }
        TapiTransferAmountScreenContract$Input tapiTransferAmountScreenContract$Input = (TapiTransferAmountScreenContract$Input) obj2;
        return Intrinsics.f(this.f61547a, tapiTransferAmountScreenContract$Input.f61547a) && Intrinsics.f(this.f61548b, tapiTransferAmountScreenContract$Input.f61548b) && Intrinsics.f(this.f61549c, tapiTransferAmountScreenContract$Input.f61549c) && Intrinsics.f(this.d, tapiTransferAmountScreenContract$Input.d);
    }

    public final int hashCode() {
        int iHashCode = this.f61547a.hashCode() * 31;
        d dVar = this.f61548b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.f61549c;
        return this.d.hashCode() + ((iHashCode2 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f61547a);
        dest.writeSerializable(this.f61548b);
        dest.writeSerializable(this.f61549c);
        dest.writeParcelable(this.d, i);
    }
}
