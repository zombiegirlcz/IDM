package com.revolut.feature.payments.bills_chooser.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitLineItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/api/model/ItemizedBillData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ScanData", "feature_payments_bills_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ItemizedBillData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ItemizedBillData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f79179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScanData f79180b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/api/model/ItemizedBillData$ScanData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ScanData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ScanData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f79183c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ScanData(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ScanData[i];
            }
        }

        public ScanData(String receiptFileName, String scanTaskId, boolean z) {
            Intrinsics.checkNotNullParameter(receiptFileName, "receiptFileName");
            Intrinsics.checkNotNullParameter(scanTaskId, "scanTaskId");
            this.f79181a = receiptFileName;
            this.f79182b = scanTaskId;
            this.f79183c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ScanData)) {
                return false;
            }
            ScanData scanData = (ScanData) obj2;
            return Intrinsics.f(this.f79181a, scanData.f79181a) && Intrinsics.f(this.f79182b, scanData.f79182b) && this.f79183c == scanData.f79183c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f79183c) + p.a.c(this.f79181a.hashCode() * 31, 31, this.f79182b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79181a);
            dest.writeString(this.f79182b);
            dest.writeInt(this.f79183c ? 1 : 0);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(SplitLineItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new ItemizedBillData(arrayList, parcel.readInt() == 0 ? null : ScanData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ItemizedBillData[i];
        }
    }

    public ItemizedBillData(ArrayList lineItems, ScanData scanData) {
        Intrinsics.checkNotNullParameter(lineItems, "lineItems");
        this.f79179a = lineItems;
        this.f79180b = scanData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ItemizedBillData)) {
            return false;
        }
        ItemizedBillData itemizedBillData = (ItemizedBillData) obj2;
        return this.f79179a.equals(itemizedBillData.f79179a) && Intrinsics.f(this.f79180b, itemizedBillData.f79180b);
    }

    public final int hashCode() {
        int iHashCode = this.f79179a.hashCode() * 31;
        ScanData scanData = this.f79180b;
        return iHashCode + (scanData == null ? 0 : scanData.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f79179a, dest);
        while (itY.hasNext()) {
            ((SplitLineItem) itY.next()).writeToParcel(dest, i);
        }
        ScanData scanData = this.f79180b;
        if (scanData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            scanData.writeToParcel(dest, i);
        }
    }
}
