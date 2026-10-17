package com.revolut.feature.apm.bills.core.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillForm;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillForm implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BillForm> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f61270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillFormHeader f61271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BillFormFooter f61272c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(BillFormField.CREATOR, parcel, arrayList, iA, 1);
            }
            return new BillForm(arrayList, parcel.readInt() == 0 ? null : BillFormHeader.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BillFormFooter.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillForm[i];
        }
    }

    public BillForm(ArrayList inputs, BillFormHeader billFormHeader, BillFormFooter billFormFooter) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        this.f61270a = inputs;
        this.f61271b = billFormHeader;
        this.f61272c = billFormFooter;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BillForm)) {
            return false;
        }
        BillForm billForm = (BillForm) obj2;
        return this.f61270a.equals(billForm.f61270a) && Intrinsics.f(this.f61271b, billForm.f61271b) && Intrinsics.f(this.f61272c, billForm.f61272c);
    }

    public final int hashCode() {
        int iHashCode = this.f61270a.hashCode() * 31;
        BillFormHeader billFormHeader = this.f61271b;
        int iHashCode2 = (iHashCode + (billFormHeader == null ? 0 : billFormHeader.hashCode())) * 31;
        BillFormFooter billFormFooter = this.f61272c;
        return iHashCode2 + (billFormFooter != null ? billFormFooter.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f61270a, dest);
        while (itY.hasNext()) {
            ((BillFormField) itY.next()).writeToParcel(dest, i);
        }
        BillFormHeader billFormHeader = this.f61271b;
        if (billFormHeader == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billFormHeader.writeToParcel(dest, i);
        }
        BillFormFooter billFormFooter = this.f61272c;
        if (billFormFooter == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billFormFooter.writeToParcel(dest, i);
        }
    }
}
