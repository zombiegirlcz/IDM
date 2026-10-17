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

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillTransferDataV2;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillTransferDataV2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BillTransferDataV2> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f61340c;
    public final List d;
    public final String e;
    public final LocalDate f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            d dVar = (d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(BillTransferDataV2.class, parcel, arrayList, iE, 1);
            }
            return new BillTransferDataV2(string, string2, dVar, arrayList, parcel.readString(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillTransferDataV2[i];
        }
    }

    public BillTransferDataV2(String paymentMethod, String str, d amount, List inputs, String str2, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        this.f61338a = paymentMethod;
        this.f61339b = str;
        this.f61340c = amount;
        this.d = inputs;
        this.e = str2;
        this.f = localDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BillTransferDataV2)) {
            return false;
        }
        BillTransferDataV2 billTransferDataV2 = (BillTransferDataV2) obj2;
        return Intrinsics.f(this.f61338a, billTransferDataV2.f61338a) && Intrinsics.f(this.f61339b, billTransferDataV2.f61339b) && Intrinsics.f(this.f61340c, billTransferDataV2.f61340c) && Intrinsics.f(this.d, billTransferDataV2.d) && Intrinsics.f(this.e, billTransferDataV2.e) && Intrinsics.f(this.f, billTransferDataV2.f);
    }

    public final int hashCode() {
        int iHashCode = this.f61338a.hashCode() * 31;
        String str = this.f61339b;
        int iD = p.a.d(v7.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f61340c), 31, this.d);
        String str2 = this.e;
        int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocalDate localDate = this.f;
        return iHashCode2 + (localDate != null ? localDate.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61338a);
        dest.writeString(this.f61339b);
        dest.writeSerializable(this.f61340c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
    }
}
