package com.revolut.feature.apm.bills.core.api.model.search.boleto;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.BillTransferDarfDetails;
import com.revolut.feature.apm.bills.core.api.model.BillTransferType;
import dj0.d;
import ip0.v7;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/search/boleto/BillSearchBoletoResult;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillSearchBoletoResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BillSearchBoletoResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillTransferType f61428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f61429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f61430c;
    public final String d;
    public final String e;
    public final BillBoletoFees f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f61431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BillBoletoAliasType f61432h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LocalDate f61433j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f61434l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f61435m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f61436n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final BillTransferDarfDetails f61437p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f61438q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f61439r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f61440s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LocalDate f61441t;
    public final boolean u;
    public final String v;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BillTransferType billTransferTypeCreateFromParcel = BillTransferType.CREATOR.createFromParcel(parcel);
            d dVar = (d) parcel.readSerializable();
            d dVar2 = (d) parcel.readSerializable();
            String string = parcel.readString();
            String string2 = parcel.readString();
            BillBoletoFees billBoletoFeesCreateFromParcel = parcel.readInt() == 0 ? null : BillBoletoFees.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            BillBoletoAliasType billBoletoAliasTypeCreateFromParcel = parcel.readInt() == 0 ? null : BillBoletoAliasType.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            BillTransferDarfDetails billTransferDarfDetailsCreateFromParcel = parcel.readInt() != 0 ? BillTransferDarfDetails.CREATOR.createFromParcel(parcel) : null;
            d dVar3 = (d) parcel.readSerializable();
            d dVar4 = (d) parcel.readSerializable();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new BillSearchBoletoResult(billTransferTypeCreateFromParcel, dVar, dVar2, string, string2, billBoletoFeesCreateFromParcel, string3, billBoletoAliasTypeCreateFromParcel, string4, localDate, string5, string6, string7, string8, string9, billTransferDarfDetailsCreateFromParcel, dVar3, dVar4, z3, (LocalDate) parcel.readSerializable(), parcel.readInt() == 0 ? z : true, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillSearchBoletoResult[i];
        }
    }

    public BillSearchBoletoResult(BillTransferType transferType, d finalAmount, d billAmount, String str, String str2, BillBoletoFees billBoletoFees, String str3, BillBoletoAliasType billBoletoAliasType, String str4, LocalDate localDate, String str5, String str6, String str7, String str8, String str9, BillTransferDarfDetails billTransferDarfDetails, d dVar, d dVar2, boolean z, LocalDate localDate2, boolean z3, String str10) {
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        Intrinsics.checkNotNullParameter(finalAmount, "finalAmount");
        Intrinsics.checkNotNullParameter(billAmount, "billAmount");
        this.f61428a = transferType;
        this.f61429b = finalAmount;
        this.f61430c = billAmount;
        this.d = str;
        this.e = str2;
        this.f = billBoletoFees;
        this.f61431g = str3;
        this.f61432h = billBoletoAliasType;
        this.i = str4;
        this.f61433j = localDate;
        this.k = str5;
        this.f61434l = str6;
        this.f61435m = str7;
        this.f61436n = str8;
        this.o = str9;
        this.f61437p = billTransferDarfDetails;
        this.f61438q = dVar;
        this.f61439r = dVar2;
        this.f61440s = z;
        this.f61441t = localDate2;
        this.u = z3;
        this.v = str10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BillSearchBoletoResult)) {
            return false;
        }
        BillSearchBoletoResult billSearchBoletoResult = (BillSearchBoletoResult) obj2;
        return this.f61428a == billSearchBoletoResult.f61428a && Intrinsics.f(this.f61429b, billSearchBoletoResult.f61429b) && Intrinsics.f(this.f61430c, billSearchBoletoResult.f61430c) && Intrinsics.f(this.d, billSearchBoletoResult.d) && Intrinsics.f(this.e, billSearchBoletoResult.e) && Intrinsics.f(this.f, billSearchBoletoResult.f) && Intrinsics.f(this.f61431g, billSearchBoletoResult.f61431g) && this.f61432h == billSearchBoletoResult.f61432h && Intrinsics.f(this.i, billSearchBoletoResult.i) && Intrinsics.f(this.f61433j, billSearchBoletoResult.f61433j) && Intrinsics.f(this.k, billSearchBoletoResult.k) && Intrinsics.f(this.f61434l, billSearchBoletoResult.f61434l) && Intrinsics.f(this.f61435m, billSearchBoletoResult.f61435m) && Intrinsics.f(this.f61436n, billSearchBoletoResult.f61436n) && Intrinsics.f(this.o, billSearchBoletoResult.o) && Intrinsics.f(this.f61437p, billSearchBoletoResult.f61437p) && Intrinsics.f(this.f61438q, billSearchBoletoResult.f61438q) && Intrinsics.f(this.f61439r, billSearchBoletoResult.f61439r) && this.f61440s == billSearchBoletoResult.f61440s && Intrinsics.f(this.f61441t, billSearchBoletoResult.f61441t) && this.u == billSearchBoletoResult.u && Intrinsics.f(this.v, billSearchBoletoResult.v);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(this.f61428a.hashCode() * 31, 31, this.f61429b), 31, this.f61430c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BillBoletoFees billBoletoFees = this.f;
        int iHashCode3 = (iHashCode2 + (billBoletoFees == null ? 0 : billBoletoFees.hashCode())) * 31;
        String str3 = this.f61431g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BillBoletoAliasType billBoletoAliasType = this.f61432h;
        int iHashCode5 = (iHashCode4 + (billBoletoAliasType == null ? 0 : billBoletoAliasType.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LocalDate localDate = this.f61433j;
        int iHashCode7 = (iHashCode6 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str5 = this.k;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f61434l;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f61435m;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f61436n;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.o;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        BillTransferDarfDetails billTransferDarfDetails = this.f61437p;
        int iHashCode13 = (iHashCode12 + (billTransferDarfDetails == null ? 0 : billTransferDarfDetails.hashCode())) * 31;
        d dVar = this.f61438q;
        int iHashCode14 = (iHashCode13 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.f61439r;
        int iC2 = j6.a.c((iHashCode14 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31, 31, this.f61440s);
        LocalDate localDate2 = this.f61441t;
        int iC3 = j6.a.c((iC2 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31, 31, this.u);
        String str10 = this.v;
        return iC3 + (str10 != null ? str10.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f61428a.writeToParcel(dest, i);
        dest.writeSerializable(this.f61429b);
        dest.writeSerializable(this.f61430c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        BillBoletoFees billBoletoFees = this.f;
        if (billBoletoFees == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billBoletoFees.writeToParcel(dest, i);
        }
        dest.writeString(this.f61431g);
        BillBoletoAliasType billBoletoAliasType = this.f61432h;
        if (billBoletoAliasType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billBoletoAliasType.writeToParcel(dest, i);
        }
        dest.writeString(this.i);
        dest.writeSerializable(this.f61433j);
        dest.writeString(this.k);
        dest.writeString(this.f61434l);
        dest.writeString(this.f61435m);
        dest.writeString(this.f61436n);
        dest.writeString(this.o);
        BillTransferDarfDetails billTransferDarfDetails = this.f61437p;
        if (billTransferDarfDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billTransferDarfDetails.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.f61438q);
        dest.writeSerializable(this.f61439r);
        dest.writeInt(this.f61440s ? 1 : 0);
        dest.writeSerializable(this.f61441t);
        dest.writeInt(this.u ? 1 : 0);
        dest.writeString(this.v);
    }
}
