package com.revolut.feature.payments.bills_chooser.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/api/navigation/BillsChooserInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillsChooserInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BillsChooserInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f79186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f79187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f79188c;
    public final LimitedCurrenciesConfig d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int iE = 0;
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (iE != i) {
                iE = j6.a.e(BillsChooserInputData.class, parcel, arrayList, iE, 1);
            }
            return new BillsChooserInputData(z, arrayList, (b) parcel.readSerializable(), (LimitedCurrenciesConfig) parcel.readParcelable(BillsChooserInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillsChooserInputData[i];
        }
    }

    public BillsChooserInputData(boolean z, List preselectedBills, b bVar, LimitedCurrenciesConfig limitedCurrenciesConfig) {
        Intrinsics.checkNotNullParameter(preselectedBills, "preselectedBills");
        Intrinsics.checkNotNullParameter(limitedCurrenciesConfig, "limitedCurrenciesConfig");
        this.f79186a = z;
        this.f79187b = preselectedBills;
        this.f79188c = bVar;
        this.d = limitedCurrenciesConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BillsChooserInputData)) {
            return false;
        }
        BillsChooserInputData billsChooserInputData = (BillsChooserInputData) obj2;
        return this.f79186a == billsChooserInputData.f79186a && Intrinsics.f(this.f79187b, billsChooserInputData.f79187b) && Intrinsics.f(this.f79188c, billsChooserInputData.f79188c) && Intrinsics.f(this.d, billsChooserInputData.d);
    }

    public final int hashCode() {
        int iD = p.a.d(Boolean.hashCode(this.f79186a) * 31, 31, this.f79187b);
        b bVar = this.f79188c;
        return this.d.hashCode() + ((iD + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f79186a ? 1 : 0);
        Iterator itV = p.a.v(this.f79187b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeSerializable(this.f79188c);
        dest.writeParcelable(this.d, i);
    }
}
