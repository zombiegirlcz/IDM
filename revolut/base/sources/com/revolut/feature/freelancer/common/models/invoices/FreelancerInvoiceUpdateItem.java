package com.revolut.feature.freelancer.common.models.invoices;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import sr6.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/invoices/FreelancerInvoiceUpdateItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerInvoiceUpdateItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerInvoiceUpdateItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f73434c;
    public final d d;
    public final List e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerInvoiceUpdateItem(parcel.readString(), parcel.readString(), parcel.readDouble(), (d) parcel.readSerializable(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerInvoiceUpdateItem[i];
        }
    }

    public FreelancerInvoiceUpdateItem(String name, String unitName, double d, d unitPrice, List taxesIds) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(unitName, "unitName");
        Intrinsics.checkNotNullParameter(unitPrice, "unitPrice");
        Intrinsics.checkNotNullParameter(taxesIds, "taxesIds");
        this.f73432a = name;
        this.f73433b = unitName;
        this.f73434c = d;
        this.d = unitPrice;
        this.e = taxesIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerInvoiceUpdateItem)) {
            return false;
        }
        FreelancerInvoiceUpdateItem freelancerInvoiceUpdateItem = (FreelancerInvoiceUpdateItem) obj2;
        return Intrinsics.f(this.f73432a, freelancerInvoiceUpdateItem.f73432a) && Intrinsics.f(this.f73433b, freelancerInvoiceUpdateItem.f73433b) && Double.compare(this.f73434c, freelancerInvoiceUpdateItem.f73434c) == 0 && Intrinsics.f(this.d, freelancerInvoiceUpdateItem.d) && Intrinsics.f(this.e, freelancerInvoiceUpdateItem.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(b.c(p.a.c(this.f73432a.hashCode() * 31, 31, this.f73433b), this.f73434c, 31), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73432a);
        dest.writeString(this.f73433b);
        dest.writeDouble(this.f73434c);
        dest.writeSerializable(this.d);
        dest.writeStringList(this.e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FreelancerInvoiceUpdateItem(String name, h unit, double d, d unitPrice, List taxesIds) {
        this(name, unit.name(), d, unitPrice, taxesIds);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(unitPrice, "unitPrice");
        Intrinsics.checkNotNullParameter(taxesIds, "taxesIds");
    }
}
