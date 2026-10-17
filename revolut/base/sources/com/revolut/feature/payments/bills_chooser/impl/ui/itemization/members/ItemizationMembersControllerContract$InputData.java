package com.revolut.feature.payments.bills_chooser.impl.ui.itemization.members;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType;
import com.revolut.feature.payments.bills_chooser.impl.domain.SplitBillItem;
import com.revolut.kompot.common.IOData$Input;
import do3.n;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/bills_chooser/impl/ui/itemization/members/ItemizationMembersControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ItemizationMembersControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ItemizationMembersControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitBillItem f79277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SplitMembersType f79278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f79279c;
    public final n d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ItemizationMembersControllerContract$InputData(SplitBillItem.CREATOR.createFromParcel(parcel), (SplitMembersType) parcel.readParcelable(ItemizationMembersControllerContract$InputData.class.getClassLoader()), (b) parcel.readSerializable(), (n) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ItemizationMembersControllerContract$InputData[i];
        }
    }

    public ItemizationMembersControllerContract$InputData(SplitBillItem item, SplitMembersType members, b currency, n nVar) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(members, "members");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f79277a = item;
        this.f79278b = members;
        this.f79279c = currency;
        this.d = nVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ItemizationMembersControllerContract$InputData)) {
            return false;
        }
        ItemizationMembersControllerContract$InputData itemizationMembersControllerContract$InputData = (ItemizationMembersControllerContract$InputData) obj2;
        return Intrinsics.f(this.f79277a, itemizationMembersControllerContract$InputData.f79277a) && Intrinsics.f(this.f79278b, itemizationMembersControllerContract$InputData.f79278b) && Intrinsics.f(this.f79279c, itemizationMembersControllerContract$InputData.f79279c) && Intrinsics.f(this.d, itemizationMembersControllerContract$InputData.d);
    }

    public final int hashCode() {
        int iJ = l.j(this.f79279c, (this.f79278b.hashCode() + (this.f79277a.hashCode() * 31)) * 31, 31);
        n nVar = this.d;
        return iJ + (nVar == null ? 0 : nVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f79277a.writeToParcel(dest, i);
        dest.writeParcelable(this.f79278b, i);
        dest.writeSerializable(this.f79279c);
        dest.writeSerializable(this.d);
    }
}
