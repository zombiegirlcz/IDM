package com.revolut.feature.payments.bills_chooser.impl.ui.itemization;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.bills_chooser.impl.domain.SplitBillItem;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/bills_chooser/impl/ui/itemization/SplitItemizationControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplitItemizationControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SplitItemizationControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f79265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f79266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f79267c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            long j2 = parcel.readLong();
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(SplitBillItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new SplitItemizationControllerContract$InputData(j2, arrayList, bVar, z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SplitItemizationControllerContract$InputData[i];
        }
    }

    public SplitItemizationControllerContract$InputData(long j2, List items, b currency, boolean z) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f79265a = currency;
        this.f79266b = j2;
        this.f79267c = z;
        this.d = items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SplitItemizationControllerContract$InputData)) {
            return false;
        }
        SplitItemizationControllerContract$InputData splitItemizationControllerContract$InputData = (SplitItemizationControllerContract$InputData) obj2;
        return Intrinsics.f(this.f79265a, splitItemizationControllerContract$InputData.f79265a) && this.f79266b == splitItemizationControllerContract$InputData.f79266b && this.f79267c == splitItemizationControllerContract$InputData.f79267c && Intrinsics.f(this.d, splitItemizationControllerContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(d.c(this.f79265a.hashCode() * 31, 31, this.f79266b), 31, this.f79267c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f79265a);
        dest.writeLong(this.f79266b);
        dest.writeInt(this.f79267c ? 1 : 0);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            ((SplitBillItem) itV.next()).writeToParcel(dest, i);
        }
    }
}
