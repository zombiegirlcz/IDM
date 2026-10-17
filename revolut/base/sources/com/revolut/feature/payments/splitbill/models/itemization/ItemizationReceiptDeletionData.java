package com.revolut.feature.payments.splitbill.models.itemization;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/splitbill/models/itemization/ItemizationReceiptDeletionData;", "Landroid/os/Parcelable;", "SplitBill", "GroupBill", "Lcom/revolut/feature/payments/splitbill/models/itemization/ItemizationReceiptDeletionData$GroupBill;", "Lcom/revolut/feature/payments/splitbill/models/itemization/ItemizationReceiptDeletionData$SplitBill;", "feature_payments_splitbill_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ItemizationReceiptDeletionData extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/splitbill/models/itemization/ItemizationReceiptDeletionData$GroupBill;", "Lcom/revolut/feature/payments/splitbill/models/itemization/ItemizationReceiptDeletionData;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GroupBill implements ItemizationReceiptDeletionData {

        @NotNull
        public static final Parcelable.Creator<GroupBill> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79915b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GroupBill(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GroupBill[i];
            }
        }

        public GroupBill(String groupId, String billId) {
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(billId, "billId");
            this.f79914a = groupId;
            this.f79915b = billId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF79915b() {
            return this.f79915b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF79914a() {
            return this.f79914a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GroupBill)) {
                return false;
            }
            GroupBill groupBill = (GroupBill) obj2;
            return Intrinsics.f(this.f79914a, groupBill.f79914a) && Intrinsics.f(this.f79915b, groupBill.f79915b);
        }

        public final int hashCode() {
            return this.f79915b.hashCode() + (this.f79914a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79914a);
            dest.writeString(this.f79915b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/splitbill/models/itemization/ItemizationReceiptDeletionData$SplitBill;", "Lcom/revolut/feature/payments/splitbill/models/itemization/ItemizationReceiptDeletionData;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SplitBill implements ItemizationReceiptDeletionData {

        @NotNull
        public static final Parcelable.Creator<SplitBill> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f79918c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SplitBill(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SplitBill[i];
            }
        }

        public SplitBill(String splitBillId, String billId, List moneyRequestIds) {
            Intrinsics.checkNotNullParameter(splitBillId, "splitBillId");
            Intrinsics.checkNotNullParameter(billId, "billId");
            Intrinsics.checkNotNullParameter(moneyRequestIds, "moneyRequestIds");
            this.f79916a = splitBillId;
            this.f79917b = billId;
            this.f79918c = moneyRequestIds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SplitBill)) {
                return false;
            }
            SplitBill splitBill = (SplitBill) obj2;
            return Intrinsics.f(this.f79916a, splitBill.f79916a) && Intrinsics.f(this.f79917b, splitBill.f79917b) && Intrinsics.f(this.f79918c, splitBill.f79918c);
        }

        public final int hashCode() {
            return this.f79918c.hashCode() + p.a.c(this.f79916a.hashCode() * 31, 31, this.f79917b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79916a);
            dest.writeString(this.f79917b);
            dest.writeStringList(this.f79918c);
        }
    }
}
