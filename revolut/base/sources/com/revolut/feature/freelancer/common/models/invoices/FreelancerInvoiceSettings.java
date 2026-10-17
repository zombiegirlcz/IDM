package com.revolut.feature.freelancer.common.models.invoices;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sr6.b;
import sr6.i;
import sr6.m;
import sr6.o;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/invoices/FreelancerInvoiceSettings;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerInvoiceSettings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerInvoiceSettings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f73403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sr6.a f73404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sr6.a f73405c;
    public final b d;
    public final String e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f73406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f73407h;
    public final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f73408j;
    public final FreelancerInvoiceRecurringPeriod k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f73409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f73410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xi0.b f73411n;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(InvoiceMethodsDetails.CREATOR, parcel, arrayList3, iA, 1);
            }
            sr6.a aVarValueOf = parcel.readInt() == 0 ? null : sr6.a.valueOf(parcel.readString());
            sr6.a aVarValueOf2 = parcel.readInt() == 0 ? null : sr6.a.valueOf(parcel.readString());
            b bVarValueOf = parcel.readInt() == 0 ? null : b.valueOf(parcel.readString());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(m.valueOf(parcel.readString()));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList4.add(i.valueOf(parcel.readString()));
                }
                arrayList2 = arrayList4;
            }
            return new FreelancerInvoiceSettings(arrayList3, aVarValueOf, aVarValueOf2, bVarValueOf, string, arrayList, arrayList2, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : FreelancerInvoiceRecurringPeriod.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), (xi0.b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerInvoiceSettings[i];
        }
    }

    public FreelancerInvoiceSettings(ArrayList paymentMethodsDetails, sr6.a aVar, sr6.a aVar2, b bVar, String str, List list, List list2, String str2, Integer num, Boolean bool, FreelancerInvoiceRecurringPeriod freelancerInvoiceRecurringPeriod, Integer num2, String str3, xi0.b bVar2) {
        Intrinsics.checkNotNullParameter(paymentMethodsDetails, "paymentMethodsDetails");
        this.f73403a = paymentMethodsDetails;
        this.f73404b = aVar;
        this.f73405c = aVar2;
        this.d = bVar;
        this.e = str;
        this.f = list;
        this.f73406g = list2;
        this.f73407h = str2;
        this.i = num;
        this.f73408j = bool;
        this.k = freelancerInvoiceRecurringPeriod;
        this.f73409l = num2;
        this.f73410m = str3;
        this.f73411n = bVar2;
    }

    public static FreelancerInvoiceSettings a(FreelancerInvoiceSettings freelancerInvoiceSettings, sr6.a aVar, sr6.a aVar2, b bVar, String str, List list, List list2, String str2, Integer num, FreelancerInvoiceRecurringPeriod freelancerInvoiceRecurringPeriod, Integer num2, String str3, xi0.b bVar2, int i) {
        ArrayList paymentMethodsDetails = freelancerInvoiceSettings.f73403a;
        sr6.a aVar3 = (i & 2) != 0 ? freelancerInvoiceSettings.f73404b : aVar;
        sr6.a aVar4 = (i & 4) != 0 ? freelancerInvoiceSettings.f73405c : aVar2;
        b bVar3 = (i & 8) != 0 ? freelancerInvoiceSettings.d : bVar;
        String str4 = (i & 16) != 0 ? freelancerInvoiceSettings.e : str;
        List list3 = (i & 32) != 0 ? freelancerInvoiceSettings.f : list;
        List list4 = (i & 64) != 0 ? freelancerInvoiceSettings.f73406g : list2;
        String str5 = (i & 128) != 0 ? freelancerInvoiceSettings.f73407h : str2;
        Integer num3 = (i & 256) != 0 ? freelancerInvoiceSettings.i : num;
        Boolean bool = freelancerInvoiceSettings.f73408j;
        FreelancerInvoiceRecurringPeriod freelancerInvoiceRecurringPeriod2 = (i & 1024) != 0 ? freelancerInvoiceSettings.k : freelancerInvoiceRecurringPeriod;
        Integer num4 = (i & 2048) != 0 ? freelancerInvoiceSettings.f73409l : num2;
        String str6 = (i & 4096) != 0 ? freelancerInvoiceSettings.f73410m : str3;
        xi0.b bVar4 = (i & 8192) != 0 ? freelancerInvoiceSettings.f73411n : bVar2;
        freelancerInvoiceSettings.getClass();
        Intrinsics.checkNotNullParameter(paymentMethodsDetails, "paymentMethodsDetails");
        return new FreelancerInvoiceSettings(paymentMethodsDetails, aVar3, aVar4, bVar3, str4, list3, list4, str5, num3, bool, freelancerInvoiceRecurringPeriod2, num4, str6, bVar4);
    }

    public final Set b() {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this.f73403a) {
            if (((InvoiceMethodsDetails) obj2).f73441b == o.ACTIVE) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((InvoiceMethodsDetails) it8.next()).f73440a);
        }
        return d0.i1(arrayList2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerInvoiceSettings)) {
            return false;
        }
        FreelancerInvoiceSettings freelancerInvoiceSettings = (FreelancerInvoiceSettings) obj2;
        return this.f73403a.equals(freelancerInvoiceSettings.f73403a) && this.f73404b == freelancerInvoiceSettings.f73404b && this.f73405c == freelancerInvoiceSettings.f73405c && this.d == freelancerInvoiceSettings.d && Intrinsics.f(this.e, freelancerInvoiceSettings.e) && Intrinsics.f(this.f, freelancerInvoiceSettings.f) && Intrinsics.f(this.f73406g, freelancerInvoiceSettings.f73406g) && Intrinsics.f(this.f73407h, freelancerInvoiceSettings.f73407h) && Intrinsics.f(this.i, freelancerInvoiceSettings.i) && Intrinsics.f(this.f73408j, freelancerInvoiceSettings.f73408j) && Intrinsics.f(this.k, freelancerInvoiceSettings.k) && Intrinsics.f(this.f73409l, freelancerInvoiceSettings.f73409l) && Intrinsics.f(this.f73410m, freelancerInvoiceSettings.f73410m) && Intrinsics.f(this.f73411n, freelancerInvoiceSettings.f73411n);
    }

    public final int hashCode() {
        int iHashCode = this.f73403a.hashCode() * 31;
        sr6.a aVar = this.f73404b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        sr6.a aVar2 = this.f73405c;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        b bVar = this.d;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f73406g;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.f73407h;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.i;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f73408j;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        FreelancerInvoiceRecurringPeriod freelancerInvoiceRecurringPeriod = this.k;
        int iHashCode11 = (iHashCode10 + (freelancerInvoiceRecurringPeriod == null ? 0 : freelancerInvoiceRecurringPeriod.hashCode())) * 31;
        Integer num2 = this.f73409l;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f73410m;
        int iHashCode13 = (iHashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        xi0.b bVar2 = this.f73411n;
        return iHashCode13 + (bVar2 != null ? bVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f73403a, dest);
        while (itY.hasNext()) {
            ((InvoiceMethodsDetails) itY.next()).writeToParcel(dest, i);
        }
        sr6.a aVar = this.f73404b;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        sr6.a aVar2 = this.f73405c;
        if (aVar2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar2.name());
        }
        b bVar = this.d;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        dest.writeString(this.e);
        List list = this.f;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeString(((m) itQ.next()).name());
            }
        }
        List list2 = this.f73406g;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = v0.a.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                dest.writeString(((i) itQ2.next()).name());
            }
        }
        dest.writeString(this.f73407h);
        Integer num = this.i;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Boolean bool = this.f73408j;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        FreelancerInvoiceRecurringPeriod freelancerInvoiceRecurringPeriod = this.k;
        if (freelancerInvoiceRecurringPeriod == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            freelancerInvoiceRecurringPeriod.writeToParcel(dest, i);
        }
        Integer num2 = this.f73409l;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        dest.writeString(this.f73410m);
        dest.writeSerializable(this.f73411n);
    }
}
