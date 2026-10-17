package com.revolut.feature.freelancer.common.models.invoices;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import sr6.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/invoices/FreelancerInvoiceItemPayload;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerInvoiceItemPayload implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerInvoiceItemPayload> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f73395c;
    public final double d;
    public final d e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f73396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f73397h;
    public final List i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            h hVarValueOf = h.valueOf(parcel.readString());
            double d = parcel.readDouble();
            d dVar = (d) parcel.readSerializable();
            d dVar2 = (d) parcel.readSerializable();
            d dVar3 = (d) parcel.readSerializable();
            d dVar4 = (d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(FreelancerInvoiceTax.CREATOR, parcel, arrayList, iA, 1);
            }
            return new FreelancerInvoiceItemPayload(string, string2, hVarValueOf, d, dVar, dVar2, dVar3, dVar4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerInvoiceItemPayload[i];
        }
    }

    public FreelancerInvoiceItemPayload(String id10, String name, h unit, double d, d unitPrice, d total, d subtotal, d totalTax, List taxes) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(unitPrice, "unitPrice");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(subtotal, "subtotal");
        Intrinsics.checkNotNullParameter(totalTax, "totalTax");
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        this.f73393a = id10;
        this.f73394b = name;
        this.f73395c = unit;
        this.d = d;
        this.e = unitPrice;
        this.f = total;
        this.f73396g = subtotal;
        this.f73397h = totalTax;
        this.i = taxes;
    }

    public static FreelancerInvoiceItemPayload a(FreelancerInvoiceItemPayload freelancerInvoiceItemPayload, String str, h hVar, double d, d dVar, List list, int i) {
        String id10 = freelancerInvoiceItemPayload.f73393a;
        if ((i & 2) != 0) {
            str = freelancerInvoiceItemPayload.f73394b;
        }
        String name = str;
        if ((i & 4) != 0) {
            hVar = freelancerInvoiceItemPayload.f73395c;
        }
        h unit = hVar;
        double d5 = (i & 8) != 0 ? freelancerInvoiceItemPayload.d : d;
        d unitPrice = (i & 16) != 0 ? freelancerInvoiceItemPayload.e : dVar;
        d total = freelancerInvoiceItemPayload.f;
        d subtotal = freelancerInvoiceItemPayload.f73396g;
        d totalTax = freelancerInvoiceItemPayload.f73397h;
        List taxes = (i & 256) != 0 ? freelancerInvoiceItemPayload.i : list;
        freelancerInvoiceItemPayload.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(unitPrice, "unitPrice");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(subtotal, "subtotal");
        Intrinsics.checkNotNullParameter(totalTax, "totalTax");
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        return new FreelancerInvoiceItemPayload(id10, name, unit, d5, unitPrice, total, subtotal, totalTax, taxes);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerInvoiceItemPayload)) {
            return false;
        }
        FreelancerInvoiceItemPayload freelancerInvoiceItemPayload = (FreelancerInvoiceItemPayload) obj2;
        return Intrinsics.f(this.f73393a, freelancerInvoiceItemPayload.f73393a) && Intrinsics.f(this.f73394b, freelancerInvoiceItemPayload.f73394b) && this.f73395c == freelancerInvoiceItemPayload.f73395c && Double.compare(this.d, freelancerInvoiceItemPayload.d) == 0 && Intrinsics.f(this.e, freelancerInvoiceItemPayload.e) && Intrinsics.f(this.f, freelancerInvoiceItemPayload.f) && Intrinsics.f(this.f73396g, freelancerInvoiceItemPayload.f73396g) && Intrinsics.f(this.f73397h, freelancerInvoiceItemPayload.f73397h) && Intrinsics.f(this.i, freelancerInvoiceItemPayload.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + v7.c(v7.c(v7.c(v7.c(b.c((this.f73395c.hashCode() + p.a.c(this.f73393a.hashCode() * 31, 31, this.f73394b)) * 31, this.d, 31), 31, this.e), 31, this.f), 31, this.f73396g), 31, this.f73397h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73393a);
        dest.writeString(this.f73394b);
        dest.writeString(this.f73395c.name());
        dest.writeDouble(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f73396g);
        dest.writeSerializable(this.f73397h);
        Iterator itV = p.a.v(this.i, dest);
        while (itV.hasNext()) {
            ((FreelancerInvoiceTax) itV.next()).writeToParcel(dest, i);
        }
    }
}
