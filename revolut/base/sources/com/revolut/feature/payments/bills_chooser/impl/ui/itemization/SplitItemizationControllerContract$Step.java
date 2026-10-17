package com.revolut.feature.payments.bills_chooser.impl.ui.itemization;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.bills_chooser.impl.domain.SplitBillItem;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/payments/bills_chooser/impl/ui/itemization/SplitItemizationControllerContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AddItem", "ViewItems", "Lcom/revolut/feature/payments/bills_chooser/impl/ui/itemization/SplitItemizationControllerContract$Step$AddItem;", "Lcom/revolut/feature/payments/bills_chooser/impl/ui/itemization/SplitItemizationControllerContract$Step$ViewItems;", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SplitItemizationControllerContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/impl/ui/itemization/SplitItemizationControllerContract$Step$AddItem;", "Lcom/revolut/feature/payments/bills_chooser/impl/ui/itemization/SplitItemizationControllerContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddItem extends SplitItemizationControllerContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f79268a;

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
                return new AddItem(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddItem[i];
            }
        }

        public AddItem(List items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f79268a = items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddItem) && Intrinsics.f(this.f79268a, ((AddItem) obj2).f79268a);
        }

        public final int hashCode() {
            return this.f79268a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f79268a, dest);
            while (itV.hasNext()) {
                ((SplitBillItem) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/impl/ui/itemization/SplitItemizationControllerContract$Step$ViewItems;", "Lcom/revolut/feature/payments/bills_chooser/impl/ui/itemization/SplitItemizationControllerContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ViewItems extends SplitItemizationControllerContract$Step {

        @NotNull
        public static final Parcelable.Creator<ViewItems> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f79269a;

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
                return new ViewItems(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ViewItems[i];
            }
        }

        public ViewItems(List items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.f79269a = items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ViewItems) && Intrinsics.f(this.f79269a, ((ViewItems) obj2).f79269a);
        }

        public final int hashCode() {
            return this.f79269a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f79269a, dest);
            while (itV.hasNext()) {
                ((SplitBillItem) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    private SplitItemizationControllerContract$Step() {
    }
}
