package com.revolut.feature.apm.bills.core.api.model.search.boleto;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/search/boleto/BillBoletoFees;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillBoletoFees implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BillBoletoFees> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f61425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f61426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f61427c;
    public final d d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BillBoletoFees((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillBoletoFees[i];
        }
    }

    public BillBoletoFees(d dVar, d dVar2, d dVar3, d dVar4) {
        this.f61425a = dVar;
        this.f61426b = dVar2;
        this.f61427c = dVar3;
        this.d = dVar4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BillBoletoFees)) {
            return false;
        }
        BillBoletoFees billBoletoFees = (BillBoletoFees) obj2;
        return Intrinsics.f(this.f61425a, billBoletoFees.f61425a) && Intrinsics.f(this.f61426b, billBoletoFees.f61426b) && Intrinsics.f(this.f61427c, billBoletoFees.f61427c) && Intrinsics.f(this.d, billBoletoFees.d);
    }

    public final int hashCode() {
        d dVar = this.f61425a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        d dVar2 = this.f61426b;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        d dVar3 = this.f61427c;
        int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        d dVar4 = this.d;
        return iHashCode3 + (dVar4 != null ? dVar4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f61425a);
        dest.writeSerializable(this.f61426b);
        dest.writeSerializable(this.f61427c);
        dest.writeSerializable(this.d);
    }
}
