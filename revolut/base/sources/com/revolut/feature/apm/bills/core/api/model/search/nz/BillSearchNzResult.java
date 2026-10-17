package com.revolut.feature.apm.bills.core.api.model.search.nz;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.search.service_provider.ServiceProvider;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo1.g;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/search/nz/BillSearchNzResult;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillSearchNzResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BillSearchNzResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f61442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f61443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f61444c;
    public final ServiceProvider d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f61445g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            g gVarValueOf = g.valueOf(parcel.readString());
            d dVar = (d) parcel.readSerializable();
            d dVar2 = (d) parcel.readSerializable();
            ServiceProvider serviceProviderCreateFromParcel = ServiceProvider.CREATOR.createFromParcel(parcel);
            boolean z4 = false;
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z6 = z;
            }
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new BillSearchNzResult(gVarValueOf, dVar, dVar2, serviceProviderCreateFromParcel, z4, z6, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillSearchNzResult[i];
        }
    }

    public BillSearchNzResult(g paymentMethod, d dVar, d dVar2, ServiceProvider serviceProvider, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(serviceProvider, "serviceProvider");
        this.f61442a = paymentMethod;
        this.f61443b = dVar;
        this.f61444c = dVar2;
        this.d = serviceProvider;
        this.e = z;
        this.f = z3;
        this.f61445g = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BillSearchNzResult)) {
            return false;
        }
        BillSearchNzResult billSearchNzResult = (BillSearchNzResult) obj2;
        return this.f61442a == billSearchNzResult.f61442a && Intrinsics.f(this.f61443b, billSearchNzResult.f61443b) && Intrinsics.f(this.f61444c, billSearchNzResult.f61444c) && Intrinsics.f(this.d, billSearchNzResult.d) && this.e == billSearchNzResult.e && this.f == billSearchNzResult.f && this.f61445g == billSearchNzResult.f61445g;
    }

    public final int hashCode() {
        int iHashCode = this.f61442a.hashCode() * 31;
        d dVar = this.f61443b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.f61444c;
        return Boolean.hashCode(this.f61445g) + j6.a.c(j6.a.c((this.d.hashCode() + ((iHashCode2 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31)) * 31, 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61442a.name());
        dest.writeSerializable(this.f61443b);
        dest.writeSerializable(this.f61444c);
        this.d.writeToParcel(dest, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f61445g ? 1 : 0);
    }
}
