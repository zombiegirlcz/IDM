package com.revolut.feature.apm.bills.core.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource;
import dj0.d;
import ip0.v7;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo1.p;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillTransferData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillTransferData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BillTransferData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillTransferType f61331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f61332c;
    public final ApmPaymentSource d;
    public final List e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f61333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f61334h;
    public final BillTransferDarfDetails i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BillTransferPaymentMethodDetails f61335j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f61336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LocalDate f61337m;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            BillTransferType billTransferTypeCreateFromParcel = BillTransferType.CREATOR.createFromParcel(parcel);
            d dVar = (d) parcel.readSerializable();
            ApmPaymentSource apmPaymentSource = (ApmPaymentSource) parcel.readParcelable(BillTransferData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(BillInput.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new BillTransferData(string, billTransferTypeCreateFromParcel, dVar, apmPaymentSource, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BillTransferDarfDetails.CREATOR.createFromParcel(parcel), (BillTransferPaymentMethodDetails) parcel.readParcelable(BillTransferData.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? p.valueOf(parcel.readString()) : null, (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillTransferData[i];
        }
    }

    public BillTransferData(String paymentMethod, BillTransferType type, d amount, ApmPaymentSource apmPaymentSource, List list, String str, String str2, String str3, BillTransferDarfDetails billTransferDarfDetails, BillTransferPaymentMethodDetails billTransferPaymentMethodDetails, String str4, p pVar, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f61330a = paymentMethod;
        this.f61331b = type;
        this.f61332c = amount;
        this.d = apmPaymentSource;
        this.e = list;
        this.f = str;
        this.f61333g = str2;
        this.f61334h = str3;
        this.i = billTransferDarfDetails;
        this.f61335j = billTransferPaymentMethodDetails;
        this.k = str4;
        this.f61336l = pVar;
        this.f61337m = localDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BillTransferData)) {
            return false;
        }
        BillTransferData billTransferData = (BillTransferData) obj2;
        return Intrinsics.f(this.f61330a, billTransferData.f61330a) && this.f61331b == billTransferData.f61331b && Intrinsics.f(this.f61332c, billTransferData.f61332c) && Intrinsics.f(this.d, billTransferData.d) && Intrinsics.f(this.e, billTransferData.e) && Intrinsics.f(this.f, billTransferData.f) && Intrinsics.f(this.f61333g, billTransferData.f61333g) && Intrinsics.f(this.f61334h, billTransferData.f61334h) && Intrinsics.f(this.i, billTransferData.i) && Intrinsics.f(this.f61335j, billTransferData.f61335j) && Intrinsics.f(this.k, billTransferData.k) && this.f61336l == billTransferData.f61336l && Intrinsics.f(this.f61337m, billTransferData.f61337m);
    }

    public final int hashCode() {
        int iC = v7.c((this.f61331b.hashCode() + (this.f61330a.hashCode() * 31)) * 31, 31, this.f61332c);
        ApmPaymentSource apmPaymentSource = this.d;
        int iHashCode = (iC + (apmPaymentSource == null ? 0 : apmPaymentSource.hashCode())) * 31;
        List list = this.e;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f61333g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61334h;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BillTransferDarfDetails billTransferDarfDetails = this.i;
        int iHashCode6 = (iHashCode5 + (billTransferDarfDetails == null ? 0 : billTransferDarfDetails.hashCode())) * 31;
        BillTransferPaymentMethodDetails billTransferPaymentMethodDetails = this.f61335j;
        int iHashCode7 = (iHashCode6 + (billTransferPaymentMethodDetails == null ? 0 : billTransferPaymentMethodDetails.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        p pVar = this.f61336l;
        int iHashCode9 = (iHashCode8 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        LocalDate localDate = this.f61337m;
        return iHashCode9 + (localDate != null ? localDate.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61330a);
        this.f61331b.writeToParcel(dest, i);
        dest.writeSerializable(this.f61332c);
        dest.writeParcelable(this.d, i);
        List list = this.e;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((BillInput) itQ.next()).writeToParcel(dest, i);
            }
        }
        dest.writeString(this.f);
        dest.writeString(this.f61333g);
        dest.writeString(this.f61334h);
        BillTransferDarfDetails billTransferDarfDetails = this.i;
        if (billTransferDarfDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billTransferDarfDetails.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f61335j, i);
        dest.writeString(this.k);
        p pVar = this.f61336l;
        if (pVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(pVar.name());
        }
        dest.writeSerializable(this.f61337m);
    }

    public /* synthetic */ BillTransferData(String str, BillTransferType billTransferType, d dVar, ApmPaymentSource apmPaymentSource, List list, String str2, String str3, String str4, BillTransferDarfDetails billTransferDarfDetails, BillTransferPaymentMethodDetails billTransferPaymentMethodDetails, String str5, p pVar, LocalDate localDate, int i) {
        this(str, billTransferType, dVar, apmPaymentSource, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : billTransferDarfDetails, (i & 512) != 0 ? null : billTransferPaymentMethodDetails, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : pVar, (i & 4096) != 0 ? null : localDate);
    }
}
