package com.revolut.feature.apm.bills.core.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo1.q;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillSearchResponse;", "Lxo1/q;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillSearchResponse implements q, Parcelable {

    @NotNull
    public static final Parcelable.Creator<BillSearchResponse> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f61322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f61323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f61324c;
    public final boolean d;
    public final BillWarning e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BillSearchResponse((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : BillWarning.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillSearchResponse[i];
        }
    }

    public BillSearchResponse(d amount, d dVar, d dVar2, boolean z, BillWarning billWarning) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f61322a = amount;
        this.f61323b = dVar;
        this.f61324c = dVar2;
        this.d = z;
        this.e = billWarning;
    }

    @Override // xo1.q
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BillWarning getE() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BillSearchResponse)) {
            return false;
        }
        BillSearchResponse billSearchResponse = (BillSearchResponse) obj2;
        return Intrinsics.f(this.f61322a, billSearchResponse.f61322a) && Intrinsics.f(this.f61323b, billSearchResponse.f61323b) && Intrinsics.f(this.f61324c, billSearchResponse.f61324c) && this.d == billSearchResponse.d && Intrinsics.f(this.e, billSearchResponse.e);
    }

    public final int hashCode() {
        int iHashCode = this.f61322a.hashCode() * 31;
        d dVar = this.f61323b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.f61324c;
        int iC = j6.a.c((iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31, 31, this.d);
        BillWarning billWarning = this.e;
        return iC + (billWarning != null ? billWarning.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f61322a);
        dest.writeSerializable(this.f61323b);
        dest.writeSerializable(this.f61324c);
        dest.writeInt(this.d ? 1 : 0);
        BillWarning billWarning = this.e;
        if (billWarning == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billWarning.writeToParcel(dest, i);
        }
    }
}
