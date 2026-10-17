package com.revolut.feature.apm.bills.core.api.model.search.tapi;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo1.g;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/search/tapi/BillSearchTapiResult;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "PaymentMethodDetails", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillSearchTapiResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BillSearchTapiResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f61450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f61451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f61452c;
    public final Boolean d;
    public final Boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f61453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f61454h;
    public final PaymentMethodDetails i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/search/tapi/BillSearchTapiResult$PaymentMethodDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentMethodDetails implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PaymentMethodDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f61456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xo1.a f61457c;
        public final d d;
        public final d e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f61458g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f61459h;
        public final String i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentMethodDetails(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : xo1.a.valueOf(parcel.readString()), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentMethodDetails[i];
            }
        }

        public PaymentMethodDetails(String str, String str2, xo1.a aVar, d dVar, d dVar2, String str3, String str4, String str5, String str6) {
            this.f61455a = str;
            this.f61456b = str2;
            this.f61457c = aVar;
            this.d = dVar;
            this.e = dVar2;
            this.f = str3;
            this.f61458g = str4;
            this.f61459h = str5;
            this.i = str6;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PaymentMethodDetails)) {
                return false;
            }
            PaymentMethodDetails paymentMethodDetails = (PaymentMethodDetails) obj2;
            return Intrinsics.f(this.f61455a, paymentMethodDetails.f61455a) && Intrinsics.f(this.f61456b, paymentMethodDetails.f61456b) && this.f61457c == paymentMethodDetails.f61457c && Intrinsics.f(this.d, paymentMethodDetails.d) && Intrinsics.f(this.e, paymentMethodDetails.e) && Intrinsics.f(this.f, paymentMethodDetails.f) && Intrinsics.f(this.f61458g, paymentMethodDetails.f61458g) && Intrinsics.f(this.f61459h, paymentMethodDetails.f61459h) && Intrinsics.f(this.i, paymentMethodDetails.i);
        }

        public final int hashCode() {
            String str = this.f61455a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f61456b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            xo1.a aVar = this.f61457c;
            int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            d dVar = this.d;
            int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            d dVar2 = this.e;
            int iHashCode5 = (iHashCode4 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
            String str3 = this.f;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f61458g;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f61459h;
            int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.i;
            return iHashCode8 + (str6 != null ? str6.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61455a);
            dest.writeString(this.f61456b);
            xo1.a aVar = this.f61457c;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
            dest.writeSerializable(this.d);
            dest.writeSerializable(this.e);
            dest.writeString(this.f);
            dest.writeString(this.f61458g);
            dest.writeString(this.f61459h);
            dest.writeString(this.i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            PaymentMethodDetails paymentMethodDetails;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            g gVarValueOf = g.valueOf(parcel.readString());
            d dVar = (d) parcel.readSerializable();
            d dVar2 = (d) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                paymentMethodDetails = null;
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                paymentMethodDetails = null;
            }
            return new BillSearchTapiResult(gVarValueOf, dVar, dVar2, boolValueOf, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? paymentMethodDetails : PaymentMethodDetails.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillSearchTapiResult[i];
        }
    }

    public BillSearchTapiResult(g paymentMethod, d amount, d totalAmount, Boolean bool, Boolean bool2, String str, String str2, String str3, PaymentMethodDetails paymentMethodDetails) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        this.f61450a = paymentMethod;
        this.f61451b = amount;
        this.f61452c = totalAmount;
        this.d = bool;
        this.e = bool2;
        this.f = str;
        this.f61453g = str2;
        this.f61454h = str3;
        this.i = paymentMethodDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BillSearchTapiResult)) {
            return false;
        }
        BillSearchTapiResult billSearchTapiResult = (BillSearchTapiResult) obj2;
        return this.f61450a == billSearchTapiResult.f61450a && Intrinsics.f(this.f61451b, billSearchTapiResult.f61451b) && Intrinsics.f(this.f61452c, billSearchTapiResult.f61452c) && Intrinsics.f(this.d, billSearchTapiResult.d) && Intrinsics.f(this.e, billSearchTapiResult.e) && Intrinsics.f(this.f, billSearchTapiResult.f) && Intrinsics.f(this.f61453g, billSearchTapiResult.f61453g) && Intrinsics.f(this.f61454h, billSearchTapiResult.f61454h) && Intrinsics.f(this.i, billSearchTapiResult.i);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(this.f61450a.hashCode() * 31, 31, this.f61451b), 31, this.f61452c);
        Boolean bool = this.d;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f61453g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61454h;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PaymentMethodDetails paymentMethodDetails = this.i;
        return iHashCode5 + (paymentMethodDetails != null ? paymentMethodDetails.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61450a.name());
        dest.writeSerializable(this.f61451b);
        dest.writeSerializable(this.f61452c);
        Boolean bool = this.d;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        Boolean bool2 = this.e;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool2);
        }
        dest.writeString(this.f);
        dest.writeString(this.f61453g);
        dest.writeString(this.f61454h);
        PaymentMethodDetails paymentMethodDetails = this.i;
        if (paymentMethodDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            paymentMethodDetails.writeToParcel(dest, i);
        }
    }
}
