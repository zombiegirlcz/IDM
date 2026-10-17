package com.revolut.feature.apm.bills.core.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillTransferDarfDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillTransferDarfDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BillTransferDarfDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillTransferDarfType f61325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillTransferPayer f61326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f61327c;
    public final Long d;
    public final Long e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f61328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f61329h;
    public final d i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BillTransferDarfDetails(parcel.readInt() == 0 ? null : BillTransferDarfType.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BillTransferPayer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillTransferDarfDetails[i];
        }
    }

    public BillTransferDarfDetails(BillTransferDarfType billTransferDarfType, BillTransferPayer billTransferPayer, Long l2, Long l3, Long l4, Long l5, String str, d dVar, d dVar2) {
        this.f61325a = billTransferDarfType;
        this.f61326b = billTransferPayer;
        this.f61327c = l2;
        this.d = l3;
        this.e = l4;
        this.f = l5;
        this.f61328g = str;
        this.f61329h = dVar;
        this.i = dVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BillTransferDarfDetails)) {
            return false;
        }
        BillTransferDarfDetails billTransferDarfDetails = (BillTransferDarfDetails) obj2;
        return this.f61325a == billTransferDarfDetails.f61325a && Intrinsics.f(this.f61326b, billTransferDarfDetails.f61326b) && Intrinsics.f(this.f61327c, billTransferDarfDetails.f61327c) && Intrinsics.f(this.d, billTransferDarfDetails.d) && Intrinsics.f(this.e, billTransferDarfDetails.e) && Intrinsics.f(this.f, billTransferDarfDetails.f) && Intrinsics.f(this.f61328g, billTransferDarfDetails.f61328g) && Intrinsics.f(this.f61329h, billTransferDarfDetails.f61329h) && Intrinsics.f(this.i, billTransferDarfDetails.i);
    }

    public final int hashCode() {
        BillTransferDarfType billTransferDarfType = this.f61325a;
        int iHashCode = (billTransferDarfType == null ? 0 : billTransferDarfType.hashCode()) * 31;
        BillTransferPayer billTransferPayer = this.f61326b;
        int iHashCode2 = (iHashCode + (billTransferPayer == null ? 0 : billTransferPayer.hashCode())) * 31;
        Long l2 = this.f61327c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.e;
        int iHashCode5 = (iHashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.f;
        int iHashCode6 = (iHashCode5 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str = this.f61328g;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        d dVar = this.f61329h;
        int iHashCode8 = (iHashCode7 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.i;
        return iHashCode8 + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        BillTransferDarfType billTransferDarfType = this.f61325a;
        if (billTransferDarfType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billTransferDarfType.writeToParcel(dest, i);
        }
        BillTransferPayer billTransferPayer = this.f61326b;
        if (billTransferPayer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billTransferPayer.writeToParcel(dest, i);
        }
        Long l2 = this.f61327c;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        Long l3 = this.d;
        if (l3 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l3);
        }
        Long l4 = this.e;
        if (l4 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l4);
        }
        Long l5 = this.f;
        if (l5 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l5);
        }
        dest.writeString(this.f61328g);
        dest.writeSerializable(this.f61329h);
        dest.writeSerializable(this.i);
    }
}
