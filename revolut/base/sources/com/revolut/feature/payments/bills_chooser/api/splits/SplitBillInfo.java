package com.revolut.feature.payments.bills_chooser.api.splits;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/api/splits/SplitBillInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplitBillInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SplitBillInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillType f79210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f79211b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            BillType billType = (BillType) j6.a.f(parcel, "parcel", SplitBillInfo.class);
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(SplitMember.CREATOR.createFromParcel(parcel), Split.CREATOR.createFromParcel(parcel));
            }
            return new SplitBillInfo(billType, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SplitBillInfo[i];
        }
    }

    public SplitBillInfo(BillType bill, Map splits) {
        Intrinsics.checkNotNullParameter(bill, "bill");
        Intrinsics.checkNotNullParameter(splits, "splits");
        this.f79210a = bill;
        this.f79211b = splits;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SplitBillInfo)) {
            return false;
        }
        SplitBillInfo splitBillInfo = (SplitBillInfo) obj2;
        return Intrinsics.f(this.f79210a, splitBillInfo.f79210a) && Intrinsics.f(this.f79211b, splitBillInfo.f79211b);
    }

    public final int hashCode() {
        return this.f79211b.hashCode() + (this.f79210a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f79210a, i);
        Iterator itZ = j6.a.z(this.f79211b, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            ((SplitMember) entry.getKey()).writeToParcel(dest, i);
            ((Split) entry.getValue()).writeToParcel(dest, i);
        }
    }
}
