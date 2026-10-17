package com.revolut.feature.freelancer.common.models.invoices;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplateOverride;
import dj0.d;
import h30.l;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import sr6.i;
import sr6.m;
import sr6.n;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/invoices/FreelancerInvoice;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerInvoice implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerInvoice> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f73376c;
    public final String d;
    public final DateTime e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f73377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f73378h;
    public final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f73379j;
    public final d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f73380l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f73381m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f73382n;
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FreelancerInvoiceCustomerDetails f73383p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final FreelancerInvoiceSupplierDetails f73384q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final FreelancerInvoiceStatusDetails f73385r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f73386s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f73387t;
    public final String u;
    public final String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f73388w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final FreelancerRecurringSchedule f73389x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f73390y;
    public final InvoiceTemplateOverride z;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            FreelancerInvoiceCustomerDetails freelancerInvoiceCustomerDetails;
            FreelancerInvoiceStatusDetails freelancerInvoiceStatusDetailsCreateFromParcel;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            DateTime dateTime3 = (DateTime) parcel.readSerializable();
            n nVarValueOf = n.valueOf(parcel.readString());
            b bVar = (b) parcel.readSerializable();
            d dVar = (d) parcel.readSerializable();
            d dVar2 = (d) parcel.readSerializable();
            d dVar3 = (d) parcel.readSerializable();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (i2 != i) {
                arrayList.add(i.valueOf(parcel.readString()));
                i2++;
                i = i;
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            int i5 = 0;
            while (i5 != i3) {
                arrayList2.add(m.valueOf(parcel.readString()));
                i5++;
                i3 = i3;
            }
            FreelancerInvoiceCustomerDetails freelancerInvoiceCustomerDetailsCreateFromParcel = parcel.readInt() == 0 ? null : FreelancerInvoiceCustomerDetails.CREATOR.createFromParcel(parcel);
            FreelancerInvoiceSupplierDetails freelancerInvoiceSupplierDetailsCreateFromParcel = parcel.readInt() == 0 ? null : FreelancerInvoiceSupplierDetails.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                freelancerInvoiceCustomerDetails = freelancerInvoiceCustomerDetailsCreateFromParcel;
                freelancerInvoiceStatusDetailsCreateFromParcel = null;
            } else {
                freelancerInvoiceCustomerDetails = freelancerInvoiceCustomerDetailsCreateFromParcel;
                freelancerInvoiceStatusDetailsCreateFromParcel = FreelancerInvoiceStatusDetails.CREATOR.createFromParcel(parcel);
            }
            FreelancerInvoiceStatusDetails freelancerInvoiceStatusDetails = freelancerInvoiceStatusDetailsCreateFromParcel;
            int i6 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i6);
            int iA = 0;
            while (iA != i6) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(FreelancerInvoiceTax.CREATOR, parcel, arrayList3, iA, 1);
                i6 = i6;
            }
            int i21 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i21);
            int iA2 = 0;
            while (iA2 != i21) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(FreelancerInvoiceItemPayload.CREATOR, parcel, arrayList4, iA2, 1);
                i21 = i21;
                arrayList3 = arrayList3;
            }
            return new FreelancerInvoice(string, string2, string3, string4, dateTime, dateTime2, dateTime3, nVarValueOf, bVar, dVar, dVar2, dVar3, string5, arrayList, arrayList2, freelancerInvoiceCustomerDetails, freelancerInvoiceSupplierDetailsCreateFromParcel, freelancerInvoiceStatusDetails, arrayList3, arrayList4, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FreelancerRecurringSchedule.CREATOR.createFromParcel(parcel), parcel.readString(), (InvoiceTemplateOverride) parcel.readParcelable(FreelancerInvoice.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerInvoice[i];
        }
    }

    public FreelancerInvoice(String id10, String number, String numberFormatted, String numberPrefix, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, n status, b currency, d total, d subtotal, d totalTax, String str, List enabledPaymentMethods, List enabledReminders, FreelancerInvoiceCustomerDetails freelancerInvoiceCustomerDetails, FreelancerInvoiceSupplierDetails freelancerInvoiceSupplierDetails, FreelancerInvoiceStatusDetails freelancerInvoiceStatusDetails, ArrayList taxes, List items, String str2, String str3, String str4, FreelancerRecurringSchedule freelancerRecurringSchedule, String str5, InvoiceTemplateOverride invoiceTemplateOverride) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(numberFormatted, "numberFormatted");
        Intrinsics.checkNotNullParameter(numberPrefix, "numberPrefix");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(subtotal, "subtotal");
        Intrinsics.checkNotNullParameter(totalTax, "totalTax");
        Intrinsics.checkNotNullParameter(enabledPaymentMethods, "enabledPaymentMethods");
        Intrinsics.checkNotNullParameter(enabledReminders, "enabledReminders");
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f73374a = id10;
        this.f73375b = number;
        this.f73376c = numberFormatted;
        this.d = numberPrefix;
        this.e = dateTime;
        this.f = dateTime2;
        this.f73377g = dateTime3;
        this.f73378h = status;
        this.i = currency;
        this.f73379j = total;
        this.k = subtotal;
        this.f73380l = totalTax;
        this.f73381m = str;
        this.f73382n = enabledPaymentMethods;
        this.o = enabledReminders;
        this.f73383p = freelancerInvoiceCustomerDetails;
        this.f73384q = freelancerInvoiceSupplierDetails;
        this.f73385r = freelancerInvoiceStatusDetails;
        this.f73386s = taxes;
        this.f73387t = items;
        this.u = str2;
        this.v = str3;
        this.f73388w = str4;
        this.f73389x = freelancerRecurringSchedule;
        this.f73390y = str5;
        this.z = invoiceTemplateOverride;
    }

    public static FreelancerInvoice a(FreelancerInvoice freelancerInvoice, b bVar, List list, List list2, ArrayList arrayList, String str, String str2, String str3, InvoiceTemplateOverride invoiceTemplateOverride, int i) {
        DateTime dateTime;
        List items;
        DateTime dateTime2;
        String str4;
        FreelancerRecurringSchedule freelancerRecurringSchedule;
        String str5;
        String id10 = freelancerInvoice.f73374a;
        String number = freelancerInvoice.f73375b;
        String numberFormatted = freelancerInvoice.f73376c;
        String numberPrefix = freelancerInvoice.d;
        DateTime dateTime3 = freelancerInvoice.e;
        DateTime dateTime4 = freelancerInvoice.f;
        DateTime dateTime5 = freelancerInvoice.f73377g;
        n status = freelancerInvoice.f73378h;
        b currency = (i & 256) != 0 ? freelancerInvoice.i : bVar;
        d total = freelancerInvoice.f73379j;
        d subtotal = freelancerInvoice.k;
        d totalTax = freelancerInvoice.f73380l;
        String str6 = freelancerInvoice.f73381m;
        List enabledPaymentMethods = (i & 8192) != 0 ? freelancerInvoice.f73382n : list;
        List enabledReminders = (i & 16384) != 0 ? freelancerInvoice.o : list2;
        FreelancerInvoiceCustomerDetails freelancerInvoiceCustomerDetails = freelancerInvoice.f73383p;
        FreelancerInvoiceSupplierDetails freelancerInvoiceSupplierDetails = freelancerInvoice.f73384q;
        FreelancerInvoiceStatusDetails freelancerInvoiceStatusDetails = freelancerInvoice.f73385r;
        ArrayList taxes = freelancerInvoice.f73386s;
        if ((i & 524288) != 0) {
            dateTime = dateTime5;
            items = freelancerInvoice.f73387t;
        } else {
            dateTime = dateTime5;
            items = arrayList;
        }
        if ((i & PKIFailureInfo.badCertTemplate) != 0) {
            dateTime2 = dateTime3;
            str4 = freelancerInvoice.u;
        } else {
            dateTime2 = dateTime3;
            str4 = str;
        }
        String str7 = str4;
        String str8 = (i & PKIFailureInfo.badSenderNonce) != 0 ? freelancerInvoice.v : str2;
        String str9 = freelancerInvoice.f73388w;
        FreelancerRecurringSchedule freelancerRecurringSchedule2 = freelancerInvoice.f73389x;
        if ((i & 16777216) != 0) {
            freelancerRecurringSchedule = freelancerRecurringSchedule2;
            str5 = freelancerInvoice.f73390y;
        } else {
            freelancerRecurringSchedule = freelancerRecurringSchedule2;
            str5 = str3;
        }
        InvoiceTemplateOverride invoiceTemplateOverride2 = (i & 33554432) != 0 ? freelancerInvoice.z : invoiceTemplateOverride;
        freelancerInvoice.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(numberFormatted, "numberFormatted");
        Intrinsics.checkNotNullParameter(numberPrefix, "numberPrefix");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(subtotal, "subtotal");
        Intrinsics.checkNotNullParameter(totalTax, "totalTax");
        Intrinsics.checkNotNullParameter(enabledPaymentMethods, "enabledPaymentMethods");
        Intrinsics.checkNotNullParameter(enabledReminders, "enabledReminders");
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        Intrinsics.checkNotNullParameter(items, "items");
        return new FreelancerInvoice(id10, number, numberFormatted, numberPrefix, dateTime2, dateTime4, dateTime, status, currency, total, subtotal, totalTax, str6, enabledPaymentMethods, enabledReminders, freelancerInvoiceCustomerDetails, freelancerInvoiceSupplierDetails, freelancerInvoiceStatusDetails, taxes, items, str7, str8, str9, freelancerRecurringSchedule, str5, invoiceTemplateOverride2);
    }

    public final FreelancerInvoiceStatusDetails J() {
        FreelancerInvoiceStatusDetails freelancerInvoiceStatusDetails = this.f73385r;
        if (freelancerInvoiceStatusDetails != null) {
            return freelancerInvoiceStatusDetails;
        }
        throw new IllegalArgumentException(j6.a.q("Status details should not be null. Invoice id: ", this.f73374a).toString());
    }

    public final boolean b() {
        FreelancerInvoiceCustomerDetails freelancerInvoiceCustomerDetails = this.f73383p;
        String str = freelancerInvoiceCustomerDetails != null ? freelancerInvoiceCustomerDetails.f73391a : null;
        if (str == null || str.length() == 0) {
            return false;
        }
        String str2 = freelancerInvoiceCustomerDetails != null ? freelancerInvoiceCustomerDetails.f73392b : null;
        return (str2 == null || str2.length() == 0) ? false : true;
    }

    public final boolean c() {
        return !d();
    }

    public final boolean d() {
        return this.f73389x != null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final DateTime e() {
        DateTime dateTime = this.f73377g;
        if (dateTime != null) {
            return dateTime;
        }
        throw new IllegalArgumentException(j6.a.q("Due date should not be null. Invoice id: ", this.f73374a).toString());
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerInvoice)) {
            return false;
        }
        FreelancerInvoice freelancerInvoice = (FreelancerInvoice) obj2;
        return Intrinsics.f(this.f73374a, freelancerInvoice.f73374a) && Intrinsics.f(this.f73375b, freelancerInvoice.f73375b) && Intrinsics.f(this.f73376c, freelancerInvoice.f73376c) && Intrinsics.f(this.d, freelancerInvoice.d) && Intrinsics.f(this.e, freelancerInvoice.e) && Intrinsics.f(this.f, freelancerInvoice.f) && Intrinsics.f(this.f73377g, freelancerInvoice.f73377g) && this.f73378h == freelancerInvoice.f73378h && Intrinsics.f(this.i, freelancerInvoice.i) && Intrinsics.f(this.f73379j, freelancerInvoice.f73379j) && Intrinsics.f(this.k, freelancerInvoice.k) && Intrinsics.f(this.f73380l, freelancerInvoice.f73380l) && Intrinsics.f(this.f73381m, freelancerInvoice.f73381m) && Intrinsics.f(this.f73382n, freelancerInvoice.f73382n) && Intrinsics.f(this.o, freelancerInvoice.o) && Intrinsics.f(this.f73383p, freelancerInvoice.f73383p) && Intrinsics.f(this.f73384q, freelancerInvoice.f73384q) && Intrinsics.f(this.f73385r, freelancerInvoice.f73385r) && this.f73386s.equals(freelancerInvoice.f73386s) && Intrinsics.f(this.f73387t, freelancerInvoice.f73387t) && Intrinsics.f(this.u, freelancerInvoice.u) && Intrinsics.f(this.v, freelancerInvoice.v) && Intrinsics.f(this.f73388w, freelancerInvoice.f73388w) && Intrinsics.f(this.f73389x, freelancerInvoice.f73389x) && Intrinsics.f(this.f73390y, freelancerInvoice.f73390y) && Intrinsics.f(this.z, freelancerInvoice.z);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f73374a.hashCode() * 31, 31, this.f73375b), 31, this.f73376c), 31, this.d);
        DateTime dateTime = this.e;
        int iHashCode = (iC + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f;
        int iHashCode2 = (iHashCode + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.f73377g;
        int iC2 = v7.c(v7.c(v7.c(l.j(this.i, (this.f73378h.hashCode() + ((iHashCode2 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31)) * 31, 31), 31, this.f73379j), 31, this.k), 31, this.f73380l);
        String str = this.f73381m;
        int iD = p.a.d(p.a.d((iC2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f73382n), 31, this.o);
        FreelancerInvoiceCustomerDetails freelancerInvoiceCustomerDetails = this.f73383p;
        int iHashCode3 = (iD + (freelancerInvoiceCustomerDetails == null ? 0 : freelancerInvoiceCustomerDetails.hashCode())) * 31;
        FreelancerInvoiceSupplierDetails freelancerInvoiceSupplierDetails = this.f73384q;
        int iHashCode4 = (iHashCode3 + (freelancerInvoiceSupplierDetails == null ? 0 : freelancerInvoiceSupplierDetails.hashCode())) * 31;
        FreelancerInvoiceStatusDetails freelancerInvoiceStatusDetails = this.f73385r;
        int iD2 = p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f73386s, (iHashCode4 + (freelancerInvoiceStatusDetails == null ? 0 : freelancerInvoiceStatusDetails.hashCode())) * 31, 31), 31, this.f73387t);
        String str2 = this.u;
        int iHashCode5 = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.v;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f73388w;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        FreelancerRecurringSchedule freelancerRecurringSchedule = this.f73389x;
        int iHashCode8 = (iHashCode7 + (freelancerRecurringSchedule == null ? 0 : freelancerRecurringSchedule.hashCode())) * 31;
        String str5 = this.f73390y;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        InvoiceTemplateOverride invoiceTemplateOverride = this.z;
        return iHashCode9 + (invoiceTemplateOverride != null ? invoiceTemplateOverride.hashCode() : 0);
    }

    public final DateTime j() {
        DateTime dateTime = this.f;
        if (dateTime != null) {
            return dateTime;
        }
        throw new IllegalArgumentException(j6.a.q("Issue date should not be null. Invoice id: ", this.f73374a).toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73374a);
        dest.writeString(this.f73375b);
        dest.writeString(this.f73376c);
        dest.writeString(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f73377g);
        dest.writeString(this.f73378h.name());
        dest.writeSerializable(this.i);
        dest.writeSerializable(this.f73379j);
        dest.writeSerializable(this.k);
        dest.writeSerializable(this.f73380l);
        dest.writeString(this.f73381m);
        Iterator itV = p.a.v(this.f73382n, dest);
        while (itV.hasNext()) {
            dest.writeString(((i) itV.next()).name());
        }
        Iterator itV2 = p.a.v(this.o, dest);
        while (itV2.hasNext()) {
            dest.writeString(((m) itV2.next()).name());
        }
        FreelancerInvoiceCustomerDetails freelancerInvoiceCustomerDetails = this.f73383p;
        if (freelancerInvoiceCustomerDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            freelancerInvoiceCustomerDetails.writeToParcel(dest, i);
        }
        FreelancerInvoiceSupplierDetails freelancerInvoiceSupplierDetails = this.f73384q;
        if (freelancerInvoiceSupplierDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            freelancerInvoiceSupplierDetails.writeToParcel(dest, i);
        }
        FreelancerInvoiceStatusDetails freelancerInvoiceStatusDetails = this.f73385r;
        if (freelancerInvoiceStatusDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            freelancerInvoiceStatusDetails.writeToParcel(dest, i);
        }
        Iterator itY = j6.a.y(this.f73386s, dest);
        while (itY.hasNext()) {
            ((FreelancerInvoiceTax) itY.next()).writeToParcel(dest, i);
        }
        Iterator itV3 = p.a.v(this.f73387t, dest);
        while (itV3.hasNext()) {
            ((FreelancerInvoiceItemPayload) itV3.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.u);
        dest.writeString(this.v);
        dest.writeString(this.f73388w);
        FreelancerRecurringSchedule freelancerRecurringSchedule = this.f73389x;
        if (freelancerRecurringSchedule == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            freelancerRecurringSchedule.writeToParcel(dest, i);
        }
        dest.writeString(this.f73390y);
        dest.writeParcelable(this.z, i);
    }

    public final FreelancerRecurringSchedule z() {
        FreelancerRecurringSchedule freelancerRecurringSchedule = this.f73389x;
        if (freelancerRecurringSchedule != null) {
            return freelancerRecurringSchedule;
        }
        throw new IllegalArgumentException(j6.a.q("Recurring schedule should not be null. Invoice id: ", this.f73374a).toString());
    }
}
