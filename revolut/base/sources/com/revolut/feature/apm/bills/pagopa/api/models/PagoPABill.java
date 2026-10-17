package com.revolut.feature.apm.bills.pagopa.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/pagopa/api/models/PagoPABill;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_pagopa_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PagoPABill implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PagoPABill> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f61476c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f61477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f61478h;
    public final LocalDate i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PagoPABill(parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PagoPABill[i];
        }
    }

    public PagoPABill(String provider, String billId, d amount, String description, String recipientName, String noticeNumber, String fiscalCode, String officeName, LocalDate applicationDate) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(billId, "billId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(recipientName, "recipientName");
        Intrinsics.checkNotNullParameter(noticeNumber, "noticeNumber");
        Intrinsics.checkNotNullParameter(fiscalCode, "fiscalCode");
        Intrinsics.checkNotNullParameter(officeName, "officeName");
        Intrinsics.checkNotNullParameter(applicationDate, "applicationDate");
        this.f61474a = provider;
        this.f61475b = billId;
        this.f61476c = amount;
        this.d = description;
        this.e = recipientName;
        this.f = noticeNumber;
        this.f61477g = fiscalCode;
        this.f61478h = officeName;
        this.i = applicationDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PagoPABill)) {
            return false;
        }
        PagoPABill pagoPABill = (PagoPABill) obj2;
        return Intrinsics.f(this.f61474a, pagoPABill.f61474a) && Intrinsics.f(this.f61475b, pagoPABill.f61475b) && Intrinsics.f(this.f61476c, pagoPABill.f61476c) && Intrinsics.f(this.d, pagoPABill.d) && Intrinsics.f(this.e, pagoPABill.e) && Intrinsics.f(this.f, pagoPABill.f) && Intrinsics.f(this.f61477g, pagoPABill.f61477g) && Intrinsics.f(this.f61478h, pagoPABill.f61478h) && Intrinsics.f(this.i, pagoPABill.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(v7.c(p.a.c(this.f61474a.hashCode() * 31, 31, this.f61475b), 31, this.f61476c), 31, this.d), 31, this.e), 31, this.f), 31, this.f61477g), 31, this.f61478h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61474a);
        dest.writeString(this.f61475b);
        dest.writeSerializable(this.f61476c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f61477g);
        dest.writeString(this.f61478h);
        dest.writeSerializable(this.i);
    }
}
