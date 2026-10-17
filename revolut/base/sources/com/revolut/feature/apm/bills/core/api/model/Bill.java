package com.revolut.feature.apm.bills.core.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo1.g;
import xo1.j;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/Bill;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Bill implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Bill> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f61246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f61247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f61248c;
    public final List d;
    public final String e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f61249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f61250h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LocalDate f61251j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            g gVarValueOf = g.valueOf(parcel.readString());
            j jVarValueOf = j.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            int iE2 = 0;
            while (iE2 != i) {
                iE2 = j6.a.e(Bill.class, parcel, arrayList, iE2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iE != i2) {
                iE = j6.a.e(Bill.class, parcel, arrayList2, iE, 1);
            }
            return new Bill(gVarValueOf, jVarValueOf, arrayList, arrayList2, parcel.readString(), (d) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Bill[i];
        }
    }

    public Bill(g paymentMethod, j state, List inputs, List fields, String paymentIntentId, d amount, String str, String str2, String str3, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(paymentIntentId, "paymentIntentId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f61246a = paymentMethod;
        this.f61247b = state;
        this.f61248c = inputs;
        this.d = fields;
        this.e = paymentIntentId;
        this.f = amount;
        this.f61249g = str;
        this.f61250h = str2;
        this.i = str3;
        this.f61251j = localDate;
    }

    public static Bill a(Bill bill, List inputs) {
        g paymentMethod = bill.f61246a;
        j state = bill.f61247b;
        List fields = bill.d;
        String paymentIntentId = bill.e;
        d amount = bill.f;
        String str = bill.f61249g;
        String str2 = bill.f61250h;
        String str3 = bill.i;
        LocalDate localDate = bill.f61251j;
        bill.getClass();
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(paymentIntentId, "paymentIntentId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return new Bill(paymentMethod, state, inputs, fields, paymentIntentId, amount, str, str2, str3, localDate);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Bill)) {
            return false;
        }
        Bill bill = (Bill) obj2;
        return this.f61246a == bill.f61246a && this.f61247b == bill.f61247b && Intrinsics.f(this.f61248c, bill.f61248c) && Intrinsics.f(this.d, bill.d) && Intrinsics.f(this.e, bill.e) && Intrinsics.f(this.f, bill.f) && Intrinsics.f(this.f61249g, bill.f61249g) && Intrinsics.f(this.f61250h, bill.f61250h) && Intrinsics.f(this.i, bill.i) && Intrinsics.f(this.f61251j, bill.f61251j);
    }

    public final int hashCode() {
        int iC = v7.c(p.a.c(p.a.d(p.a.d((this.f61247b.hashCode() + (this.f61246a.hashCode() * 31)) * 31, 31, this.f61248c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.f61249g;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f61250h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LocalDate localDate = this.f61251j;
        return iHashCode3 + (localDate != null ? localDate.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61246a.name());
        dest.writeString(this.f61247b.name());
        Iterator itV = p.a.v(this.f61248c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Iterator itV2 = p.a.v(this.d, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
        dest.writeString(this.f61249g);
        dest.writeString(this.f61250h);
        dest.writeString(this.i);
        dest.writeSerializable(this.f61251j);
    }
}
