package com.revolut.feature.freelancer.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.freelancer.common.models.orders.FreelancerOrderInvoiceDetails;
import dj0.d;
import ip0.v7;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jli.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lr6.k;
import lr6.l;
import lr6.q;
import lr6.r;
import lr6.s;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerOrder;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerOrder implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerOrder> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f73290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f73291c;
    public final k d;
    public final l e;
    public final s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FreelancerOrderCustomer f73292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FreelancerOrderInvoiceDetails f73293h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f73294j;
    public final d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f73295l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f73296m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f73297n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f73298p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f73299q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final FreelancerOriginalOrderDetails f73300r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f73301s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f73302t;
    public final List u;
    public final DateTime v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final DateTime f73303w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final DateTime f73304x;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String str;
            ArrayList arrayList2;
            ArrayList arrayList3;
            FreelancerOriginalOrderDetails freelancerOriginalOrderDetails;
            ArrayList arrayList4;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String string = parcel2.readString();
            r rVarValueOf = r.valueOf(parcel2.readString());
            String string2 = parcel2.readString();
            k kVarValueOf = parcel2.readInt() == 0 ? null : k.valueOf(parcel2.readString());
            l lVarValueOf = parcel2.readInt() == 0 ? null : l.valueOf(parcel2.readString());
            s sVarValueOf = s.valueOf(parcel2.readString());
            FreelancerOrderCustomer freelancerOrderCustomerCreateFromParcel = parcel2.readInt() == 0 ? null : FreelancerOrderCustomer.CREATOR.createFromParcel(parcel2);
            FreelancerOrderInvoiceDetails freelancerOrderInvoiceDetailsCreateFromParcel = parcel2.readInt() == 0 ? null : FreelancerOrderInvoiceDetails.CREATOR.createFromParcel(parcel2);
            String string3 = parcel2.readString();
            d dVar = (d) parcel2.readSerializable();
            d dVar2 = (d) parcel2.readSerializable();
            d dVar3 = (d) parcel2.readSerializable();
            d dVar4 = (d) parcel2.readSerializable();
            String string4 = parcel2.readString();
            String string5 = parcel2.readString();
            if (parcel2.readInt() == 0) {
                str = string;
                arrayList = null;
            } else {
                int i = parcel2.readInt();
                arrayList = new ArrayList(i);
                str = string;
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(FreelancerOrder.CREATOR, parcel2, arrayList, iA, 1);
                    i = i;
                    rVarValueOf = rVarValueOf;
                }
            }
            r rVar = rVarValueOf;
            if (parcel2.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i2 = parcel2.readInt();
                arrayList2 = new ArrayList(i2);
                int iA2 = 0;
                while (iA2 != i2) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(FreelancerOrderTransaction.CREATOR, parcel2, arrayList2, iA2, 1);
                    i2 = i2;
                    arrayList = arrayList;
                }
            }
            ArrayList arrayList5 = arrayList;
            FreelancerOriginalOrderDetails freelancerOriginalOrderDetailsCreateFromParcel = parcel2.readInt() == 0 ? null : FreelancerOriginalOrderDetails.CREATOR.createFromParcel(parcel2);
            if (parcel2.readInt() == 0) {
                freelancerOriginalOrderDetails = freelancerOriginalOrderDetailsCreateFromParcel;
                arrayList3 = null;
            } else {
                int i3 = parcel2.readInt();
                arrayList3 = new ArrayList(i3);
                freelancerOriginalOrderDetails = freelancerOriginalOrderDetailsCreateFromParcel;
                int iE = 0;
                while (iE != i3) {
                    iE = j6.a.e(FreelancerOrder.class, parcel2, arrayList3, iE, 1);
                    i3 = i3;
                    arrayList2 = arrayList2;
                }
            }
            ArrayList arrayList6 = arrayList2;
            if (parcel2.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i5 = parcel2.readInt();
                arrayList4 = new ArrayList(i5);
                int iA3 = 0;
                while (iA3 != i5) {
                    iA3 = org.bouncycastle.jcajce.provider.digest.a.a(FreelancerOrderPayment.CREATOR, parcel2, arrayList4, iA3, 1);
                    i5 = i5;
                    arrayList3 = arrayList3;
                }
            }
            ArrayList arrayList7 = arrayList3;
            int i6 = parcel2.readInt();
            ArrayList arrayList8 = new ArrayList(i6);
            int i21 = 0;
            while (i21 != i6) {
                arrayList8.add(q.valueOf(parcel2.readString()));
                i21++;
                parcel2 = parcel;
            }
            return new FreelancerOrder(str, rVar, string2, kVarValueOf, lVarValueOf, sVarValueOf, freelancerOrderCustomerCreateFromParcel, freelancerOrderInvoiceDetailsCreateFromParcel, string3, dVar, dVar2, dVar3, dVar4, string4, string5, arrayList5, arrayList6, freelancerOriginalOrderDetails, arrayList7, arrayList4, arrayList8, (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerOrder[i];
        }
    }

    public FreelancerOrder(String id10, r state, String description, k kVar, l lVar, s type, FreelancerOrderCustomer freelancerOrderCustomer, FreelancerOrderInvoiceDetails freelancerOrderInvoiceDetails, String str, d money, d dVar, d dVar2, d dVar3, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, FreelancerOriginalOrderDetails freelancerOriginalOrderDetails, ArrayList arrayList3, ArrayList arrayList4, List allowedPaymentMethods, DateTime createdAt, DateTime updatedAt, DateTime expiresAt) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(allowedPaymentMethods, "allowedPaymentMethods");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(expiresAt, "expiresAt");
        this.f73289a = id10;
        this.f73290b = state;
        this.f73291c = description;
        this.d = kVar;
        this.e = lVar;
        this.f = type;
        this.f73292g = freelancerOrderCustomer;
        this.f73293h = freelancerOrderInvoiceDetails;
        this.i = str;
        this.f73294j = money;
        this.k = dVar;
        this.f73295l = dVar2;
        this.f73296m = dVar3;
        this.f73297n = str2;
        this.o = str3;
        this.f73298p = arrayList;
        this.f73299q = arrayList2;
        this.f73300r = freelancerOriginalOrderDetails;
        this.f73301s = arrayList3;
        this.f73302t = arrayList4;
        this.u = allowedPaymentMethods;
        this.v = createdAt;
        this.f73303w = updatedAt;
        this.f73304x = expiresAt;
    }

    public final LocalDateTime a() {
        org.joda.time.LocalDateTime localDateTime = this.v.toLocalDateTime();
        Intrinsics.checkNotNullExpressionValue(localDateTime, "toLocalDateTime(...)");
        return b.f(localDateTime);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerOrder)) {
            return false;
        }
        FreelancerOrder freelancerOrder = (FreelancerOrder) obj2;
        return Intrinsics.f(this.f73289a, freelancerOrder.f73289a) && this.f73290b == freelancerOrder.f73290b && Intrinsics.f(this.f73291c, freelancerOrder.f73291c) && this.d == freelancerOrder.d && this.e == freelancerOrder.e && this.f == freelancerOrder.f && Intrinsics.f(this.f73292g, freelancerOrder.f73292g) && Intrinsics.f(this.f73293h, freelancerOrder.f73293h) && Intrinsics.f(this.i, freelancerOrder.i) && Intrinsics.f(this.f73294j, freelancerOrder.f73294j) && Intrinsics.f(this.k, freelancerOrder.k) && Intrinsics.f(this.f73295l, freelancerOrder.f73295l) && Intrinsics.f(this.f73296m, freelancerOrder.f73296m) && Intrinsics.f(this.f73297n, freelancerOrder.f73297n) && Intrinsics.f(this.o, freelancerOrder.o) && Intrinsics.f(this.f73298p, freelancerOrder.f73298p) && Intrinsics.f(this.f73299q, freelancerOrder.f73299q) && Intrinsics.f(this.f73300r, freelancerOrder.f73300r) && Intrinsics.f(this.f73301s, freelancerOrder.f73301s) && Intrinsics.f(this.f73302t, freelancerOrder.f73302t) && Intrinsics.f(this.u, freelancerOrder.u) && Intrinsics.f(this.v, freelancerOrder.v) && Intrinsics.f(this.f73303w, freelancerOrder.f73303w) && Intrinsics.f(this.f73304x, freelancerOrder.f73304x);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f73290b.hashCode() + (this.f73289a.hashCode() * 31)) * 31, 31, this.f73291c);
        k kVar = this.d;
        int iHashCode = (iC + (kVar == null ? 0 : kVar.hashCode())) * 31;
        l lVar = this.e;
        int iHashCode2 = (this.f.hashCode() + ((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31)) * 31;
        FreelancerOrderCustomer freelancerOrderCustomer = this.f73292g;
        int iHashCode3 = (iHashCode2 + (freelancerOrderCustomer == null ? 0 : freelancerOrderCustomer.hashCode())) * 31;
        FreelancerOrderInvoiceDetails freelancerOrderInvoiceDetails = this.f73293h;
        int iHashCode4 = (iHashCode3 + (freelancerOrderInvoiceDetails == null ? 0 : freelancerOrderInvoiceDetails.hashCode())) * 31;
        String str = this.i;
        int iC2 = v7.c((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f73294j);
        d dVar = this.k;
        int iHashCode5 = (iC2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.f73295l;
        int iHashCode6 = (iHashCode5 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        d dVar3 = this.f73296m;
        int iHashCode7 = (iHashCode6 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        String str2 = this.f73297n;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.o;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f73298p;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f73299q;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        FreelancerOriginalOrderDetails freelancerOriginalOrderDetails = this.f73300r;
        int iHashCode12 = (iHashCode11 + (freelancerOriginalOrderDetails == null ? 0 : freelancerOriginalOrderDetails.hashCode())) * 31;
        List list3 = this.f73301s;
        int iHashCode13 = (iHashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f73302t;
        return this.f73304x.hashCode() + m72.b.f(this.f73303w, m72.b.f(this.v, p.a.d((iHashCode13 + (list4 != null ? list4.hashCode() : 0)) * 31, 31, this.u), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73289a);
        dest.writeString(this.f73290b.name());
        dest.writeString(this.f73291c);
        k kVar = this.d;
        if (kVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(kVar.name());
        }
        l lVar = this.e;
        if (lVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(lVar.name());
        }
        dest.writeString(this.f.name());
        FreelancerOrderCustomer freelancerOrderCustomer = this.f73292g;
        if (freelancerOrderCustomer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            freelancerOrderCustomer.writeToParcel(dest, i);
        }
        FreelancerOrderInvoiceDetails freelancerOrderInvoiceDetails = this.f73293h;
        if (freelancerOrderInvoiceDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            freelancerOrderInvoiceDetails.writeToParcel(dest, i);
        }
        dest.writeString(this.i);
        dest.writeSerializable(this.f73294j);
        dest.writeSerializable(this.k);
        dest.writeSerializable(this.f73295l);
        dest.writeSerializable(this.f73296m);
        dest.writeString(this.f73297n);
        dest.writeString(this.o);
        List list = this.f73298p;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((FreelancerOrder) itQ.next()).writeToParcel(dest, i);
            }
        }
        List list2 = this.f73299q;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = v0.a.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                ((FreelancerOrderTransaction) itQ2.next()).writeToParcel(dest, i);
            }
        }
        FreelancerOriginalOrderDetails freelancerOriginalOrderDetails = this.f73300r;
        if (freelancerOriginalOrderDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            freelancerOriginalOrderDetails.writeToParcel(dest, i);
        }
        List list3 = this.f73301s;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ3 = v0.a.q(dest, 1, list3);
            while (itQ3.hasNext()) {
                dest.writeParcelable((Parcelable) itQ3.next(), i);
            }
        }
        List list4 = this.f73302t;
        if (list4 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ4 = v0.a.q(dest, 1, list4);
            while (itQ4.hasNext()) {
                ((FreelancerOrderPayment) itQ4.next()).writeToParcel(dest, i);
            }
        }
        Iterator itV = p.a.v(this.u, dest);
        while (itV.hasNext()) {
            dest.writeString(((q) itV.next()).name());
        }
        dest.writeSerializable(this.v);
        dest.writeSerializable(this.f73303w);
        dest.writeSerializable(this.f73304x);
    }
}
