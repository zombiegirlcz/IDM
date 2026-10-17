package com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.unlink_payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rewards/impl/ui/rent_and_bills/screen/unlink_payment/RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final egc.a f84985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f84986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f84987c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            egc.a aVarValueOf = egc.a.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iE != i2) {
                iE = j6.a.e(RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData.class, parcel, arrayList2, iE, 1);
            }
            return new RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData(aVarValueOf, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData[i];
        }
    }

    public RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData(egc.a categoryType, List recurringPayments, ArrayList linkedPaymentsForCategory) {
        Intrinsics.checkNotNullParameter(categoryType, "categoryType");
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        Intrinsics.checkNotNullParameter(linkedPaymentsForCategory, "linkedPaymentsForCategory");
        this.f84985a = categoryType;
        this.f84986b = recurringPayments;
        this.f84987c = linkedPaymentsForCategory;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData)) {
            return false;
        }
        RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData rentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData = (RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData) obj2;
        return this.f84985a == rentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData.f84985a && this.f84986b.equals(rentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData.f84986b) && this.f84987c.equals(rentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData.f84987c);
    }

    public final int hashCode() {
        return this.f84987c.hashCode() + p.a.d(this.f84985a.hashCode() * 31, 31, this.f84986b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84985a.name());
        Iterator itV = p.a.v(this.f84986b, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        Iterator itY = j6.a.y(this.f84987c, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
    }
}
