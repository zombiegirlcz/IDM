package com.revolut.feature.freelancer.common.models.invoices;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplateOverride;
import h30.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import sr6.i;
import sr6.m;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/invoices/FreelancerInvoiceUpdate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerInvoiceUpdate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerInvoiceUpdate> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f73423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f73424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f73425c;
    public final b d;
    public final String e;
    public final FreelancerInvoiceSupplierDetails f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f73426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f73427h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f73428j;
    public final FreelancerInvoiceNumberData k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f73429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f73430m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InvoiceTemplateOverride f73431n;
    public final FreelancerRecurringSchedule o;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            DateTime dateTime3 = (DateTime) parcel.readSerializable();
            b bVar = (b) parcel.readSerializable();
            String string = parcel.readString();
            FreelancerInvoiceSupplierDetails freelancerInvoiceSupplierDetailsCreateFromParcel = parcel.readInt() == 0 ? null : FreelancerInvoiceSupplierDetails.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(i.valueOf(parcel.readString()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i5 = 0; i5 != i3; i5++) {
                arrayList2.add(m.valueOf(parcel.readString()));
            }
            int i6 = parcel.readInt();
            int iA = 0;
            ArrayList arrayList3 = new ArrayList(i6);
            while (iA != i6) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(FreelancerInvoiceUpdateItem.CREATOR, parcel, arrayList3, iA, 1);
            }
            return new FreelancerInvoiceUpdate(dateTime, dateTime2, dateTime3, bVar, string, freelancerInvoiceSupplierDetailsCreateFromParcel, arrayList, arrayList2, arrayList3, parcel.readString(), parcel.readInt() == 0 ? null : FreelancerInvoiceNumberData.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (InvoiceTemplateOverride) parcel.readParcelable(FreelancerInvoiceUpdate.class.getClassLoader()), parcel.readInt() != 0 ? FreelancerRecurringSchedule.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerInvoiceUpdate[i];
        }
    }

    public FreelancerInvoiceUpdate(DateTime dateTime, DateTime dateTime2, DateTime dateTime3, b currency, String str, FreelancerInvoiceSupplierDetails freelancerInvoiceSupplierDetails, List enabledPaymentMethods, List enabledReminders, ArrayList items, String str2, FreelancerInvoiceNumberData freelancerInvoiceNumberData, String str3, String str4, InvoiceTemplateOverride invoiceTemplateOverride, FreelancerRecurringSchedule freelancerRecurringSchedule) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(enabledPaymentMethods, "enabledPaymentMethods");
        Intrinsics.checkNotNullParameter(enabledReminders, "enabledReminders");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f73423a = dateTime;
        this.f73424b = dateTime2;
        this.f73425c = dateTime3;
        this.d = currency;
        this.e = str;
        this.f = freelancerInvoiceSupplierDetails;
        this.f73426g = enabledPaymentMethods;
        this.f73427h = enabledReminders;
        this.i = items;
        this.f73428j = str2;
        this.k = freelancerInvoiceNumberData;
        this.f73429l = str3;
        this.f73430m = str4;
        this.f73431n = invoiceTemplateOverride;
        this.o = freelancerRecurringSchedule;
    }

    public static FreelancerInvoiceUpdate a(FreelancerInvoiceUpdate freelancerInvoiceUpdate, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, String str, FreelancerInvoiceNumberData freelancerInvoiceNumberData, FreelancerRecurringSchedule freelancerRecurringSchedule, int i) {
        DateTime dateTime4 = (i & 1) != 0 ? freelancerInvoiceUpdate.f73423a : dateTime;
        DateTime dateTime5 = (i & 2) != 0 ? freelancerInvoiceUpdate.f73424b : dateTime2;
        DateTime dateTime6 = (i & 4) != 0 ? freelancerInvoiceUpdate.f73425c : dateTime3;
        b currency = freelancerInvoiceUpdate.d;
        String str2 = (i & 16) != 0 ? freelancerInvoiceUpdate.e : str;
        FreelancerInvoiceSupplierDetails freelancerInvoiceSupplierDetails = freelancerInvoiceUpdate.f;
        List enabledPaymentMethods = freelancerInvoiceUpdate.f73426g;
        List enabledReminders = freelancerInvoiceUpdate.f73427h;
        ArrayList items = freelancerInvoiceUpdate.i;
        String str3 = freelancerInvoiceUpdate.f73428j;
        FreelancerInvoiceNumberData freelancerInvoiceNumberData2 = (i & 1024) != 0 ? freelancerInvoiceUpdate.k : freelancerInvoiceNumberData;
        String str4 = freelancerInvoiceUpdate.f73429l;
        String str5 = freelancerInvoiceUpdate.f73430m;
        InvoiceTemplateOverride invoiceTemplateOverride = freelancerInvoiceUpdate.f73431n;
        FreelancerRecurringSchedule freelancerRecurringSchedule2 = (i & 16384) != 0 ? freelancerInvoiceUpdate.o : freelancerRecurringSchedule;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(enabledPaymentMethods, "enabledPaymentMethods");
        Intrinsics.checkNotNullParameter(enabledReminders, "enabledReminders");
        Intrinsics.checkNotNullParameter(items, "items");
        return new FreelancerInvoiceUpdate(dateTime4, dateTime5, dateTime6, currency, str2, freelancerInvoiceSupplierDetails, enabledPaymentMethods, enabledReminders, items, str3, freelancerInvoiceNumberData2, str4, str5, invoiceTemplateOverride, freelancerRecurringSchedule2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerInvoiceUpdate)) {
            return false;
        }
        FreelancerInvoiceUpdate freelancerInvoiceUpdate = (FreelancerInvoiceUpdate) obj2;
        return Intrinsics.f(this.f73423a, freelancerInvoiceUpdate.f73423a) && Intrinsics.f(this.f73424b, freelancerInvoiceUpdate.f73424b) && Intrinsics.f(this.f73425c, freelancerInvoiceUpdate.f73425c) && Intrinsics.f(this.d, freelancerInvoiceUpdate.d) && Intrinsics.f(this.e, freelancerInvoiceUpdate.e) && Intrinsics.f(this.f, freelancerInvoiceUpdate.f) && Intrinsics.f(this.f73426g, freelancerInvoiceUpdate.f73426g) && Intrinsics.f(this.f73427h, freelancerInvoiceUpdate.f73427h) && this.i.equals(freelancerInvoiceUpdate.i) && Intrinsics.f(this.f73428j, freelancerInvoiceUpdate.f73428j) && Intrinsics.f(this.k, freelancerInvoiceUpdate.k) && Intrinsics.f(this.f73429l, freelancerInvoiceUpdate.f73429l) && Intrinsics.f(this.f73430m, freelancerInvoiceUpdate.f73430m) && Intrinsics.f(this.f73431n, freelancerInvoiceUpdate.f73431n) && Intrinsics.f(this.o, freelancerInvoiceUpdate.o);
    }

    public final int hashCode() {
        DateTime dateTime = this.f73423a;
        int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
        DateTime dateTime2 = this.f73424b;
        int iHashCode2 = (iHashCode + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.f73425c;
        int iJ = l.j(this.d, (iHashCode2 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31, 31);
        String str = this.e;
        int iHashCode3 = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        FreelancerInvoiceSupplierDetails freelancerInvoiceSupplierDetails = this.f;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.i, p.a.d(p.a.d((iHashCode3 + (freelancerInvoiceSupplierDetails == null ? 0 : freelancerInvoiceSupplierDetails.hashCode())) * 31, 31, this.f73426g), 31, this.f73427h), 31);
        String str2 = this.f73428j;
        int iHashCode4 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        FreelancerInvoiceNumberData freelancerInvoiceNumberData = this.k;
        int iHashCode5 = (iHashCode4 + (freelancerInvoiceNumberData == null ? 0 : freelancerInvoiceNumberData.hashCode())) * 31;
        String str3 = this.f73429l;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f73430m;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        InvoiceTemplateOverride invoiceTemplateOverride = this.f73431n;
        int iHashCode8 = (iHashCode7 + (invoiceTemplateOverride == null ? 0 : invoiceTemplateOverride.hashCode())) * 31;
        FreelancerRecurringSchedule freelancerRecurringSchedule = this.o;
        return iHashCode8 + (freelancerRecurringSchedule != null ? freelancerRecurringSchedule.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f73423a);
        dest.writeSerializable(this.f73424b);
        dest.writeSerializable(this.f73425c);
        dest.writeSerializable(this.d);
        dest.writeString(this.e);
        FreelancerInvoiceSupplierDetails freelancerInvoiceSupplierDetails = this.f;
        if (freelancerInvoiceSupplierDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            freelancerInvoiceSupplierDetails.writeToParcel(dest, i);
        }
        Iterator itV = p.a.v(this.f73426g, dest);
        while (itV.hasNext()) {
            dest.writeString(((i) itV.next()).name());
        }
        Iterator itV2 = p.a.v(this.f73427h, dest);
        while (itV2.hasNext()) {
            dest.writeString(((m) itV2.next()).name());
        }
        Iterator itY = j6.a.y(this.i, dest);
        while (itY.hasNext()) {
            ((FreelancerInvoiceUpdateItem) itY.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.f73428j);
        FreelancerInvoiceNumberData freelancerInvoiceNumberData = this.k;
        if (freelancerInvoiceNumberData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            freelancerInvoiceNumberData.writeToParcel(dest, i);
        }
        dest.writeString(this.f73429l);
        dest.writeString(this.f73430m);
        dest.writeParcelable(this.f73431n, i);
        FreelancerRecurringSchedule freelancerRecurringSchedule = this.o;
        if (freelancerRecurringSchedule == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            freelancerRecurringSchedule.writeToParcel(dest, i);
        }
    }
}
