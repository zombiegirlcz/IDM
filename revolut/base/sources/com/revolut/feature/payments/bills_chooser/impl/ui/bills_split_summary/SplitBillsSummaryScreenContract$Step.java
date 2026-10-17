package com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.bills_chooser.api.model.ItemizedBillData;
import com.revolut.feature.payments.bills_chooser.impl.domain.SplitBillItem;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.SplitItemizationControllerContract$InputData;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.members.ItemizationMembersControllerContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/payments/bills_chooser/impl/ui/bills_split_summary/SplitBillsSummaryScreenContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Itemization", "ItemizationMembers", "UnassignedItemsConfirmation", "Lcom/revolut/feature/payments/bills_chooser/impl/ui/bills_split_summary/SplitBillsSummaryScreenContract$Step$Itemization;", "Lcom/revolut/feature/payments/bills_chooser/impl/ui/bills_split_summary/SplitBillsSummaryScreenContract$Step$ItemizationMembers;", "Lcom/revolut/feature/payments/bills_chooser/impl/ui/bills_split_summary/SplitBillsSummaryScreenContract$Step$UnassignedItemsConfirmation;", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SplitBillsSummaryScreenContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/impl/ui/bills_split_summary/SplitBillsSummaryScreenContract$Step$Itemization;", "Lcom/revolut/feature/payments/bills_chooser/impl/ui/bills_split_summary/SplitBillsSummaryScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Itemization implements SplitBillsSummaryScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<Itemization> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SplitItemizationControllerContract$InputData f79244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ItemizedBillData.ScanData f79245b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Itemization(SplitItemizationControllerContract$InputData.CREATOR.createFromParcel(parcel), (ItemizedBillData.ScanData) parcel.readParcelable(Itemization.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Itemization[i];
            }
        }

        public Itemization(SplitItemizationControllerContract$InputData itemizationInputData, ItemizedBillData.ScanData scanData) {
            Intrinsics.checkNotNullParameter(itemizationInputData, "itemizationInputData");
            this.f79244a = itemizationInputData;
            this.f79245b = scanData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Itemization)) {
                return false;
            }
            Itemization itemization = (Itemization) obj2;
            return Intrinsics.f(this.f79244a, itemization.f79244a) && Intrinsics.f(this.f79245b, itemization.f79245b);
        }

        public final int hashCode() {
            int iHashCode = this.f79244a.hashCode() * 31;
            ItemizedBillData.ScanData scanData = this.f79245b;
            return iHashCode + (scanData == null ? 0 : scanData.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f79244a.writeToParcel(dest, i);
            dest.writeParcelable(this.f79245b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/impl/ui/bills_split_summary/SplitBillsSummaryScreenContract$Step$ItemizationMembers;", "Lcom/revolut/feature/payments/bills_chooser/impl/ui/bills_split_summary/SplitBillsSummaryScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ItemizationMembers implements SplitBillsSummaryScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<ItemizationMembers> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ItemizationMembersControllerContract$InputData f79246a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ItemizationMembers(ItemizationMembersControllerContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ItemizationMembers[i];
            }
        }

        public ItemizationMembers(ItemizationMembersControllerContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f79246a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ItemizationMembers) && Intrinsics.f(this.f79246a, ((ItemizationMembers) obj2).f79246a);
        }

        public final int hashCode() {
            return this.f79246a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f79246a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/impl/ui/bills_split_summary/SplitBillsSummaryScreenContract$Step$UnassignedItemsConfirmation;", "Lcom/revolut/feature/payments/bills_chooser/impl/ui/bills_split_summary/SplitBillsSummaryScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnassignedItemsConfirmation implements SplitBillsSummaryScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<UnassignedItemsConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f79247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi0.b f79248b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(SplitBillItem.CREATOR, parcel, arrayList, iA, 1);
                }
                return new UnassignedItemsConfirmation(arrayList, (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnassignedItemsConfirmation[i];
            }
        }

        public UnassignedItemsConfirmation(ArrayList unassignedItems, xi0.b currency) {
            Intrinsics.checkNotNullParameter(unassignedItems, "unassignedItems");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f79247a = unassignedItems;
            this.f79248b = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UnassignedItemsConfirmation)) {
                return false;
            }
            UnassignedItemsConfirmation unassignedItemsConfirmation = (UnassignedItemsConfirmation) obj2;
            return this.f79247a.equals(unassignedItemsConfirmation.f79247a) && Intrinsics.f(this.f79248b, unassignedItemsConfirmation.f79248b);
        }

        public final int hashCode() {
            return this.f79248b.hashCode() + (this.f79247a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f79247a, dest);
            while (itY.hasNext()) {
                ((SplitBillItem) itY.next()).writeToParcel(dest, i);
            }
            dest.writeSerializable(this.f79248b);
        }
    }
}
