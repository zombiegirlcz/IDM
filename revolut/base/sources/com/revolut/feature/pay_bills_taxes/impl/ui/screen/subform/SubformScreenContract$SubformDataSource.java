package com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.Bill;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/pay_bills_taxes/impl/ui/screen/subform/SubformScreenContract$SubformDataSource", "Landroid/os/Parcelable;", "ExistingBill", "NewInputs", "Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/subform/SubformScreenContract$SubformDataSource$ExistingBill;", "Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/subform/SubformScreenContract$SubformDataSource$NewInputs;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SubformScreenContract$SubformDataSource extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/subform/SubformScreenContract$SubformDataSource$ExistingBill;", "Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/subform/SubformScreenContract$SubformDataSource;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExistingBill implements SubformScreenContract$SubformDataSource {

        @NotNull
        public static final Parcelable.Creator<ExistingBill> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bill f78731a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExistingBill((Bill) parcel.readParcelable(ExistingBill.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExistingBill[i];
            }
        }

        public ExistingBill(Bill bill) {
            Intrinsics.checkNotNullParameter(bill, "bill");
            this.f78731a = bill;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExistingBill) && Intrinsics.f(this.f78731a, ((ExistingBill) obj2).f78731a);
        }

        public final int hashCode() {
            return this.f78731a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f78731a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/subform/SubformScreenContract$SubformDataSource$NewInputs;", "Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/subform/SubformScreenContract$SubformDataSource;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewInputs implements SubformScreenContract$SubformDataSource {

        @NotNull
        public static final Parcelable.Creator<NewInputs> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f78732a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(NewInputs.class, parcel, arrayList, iE, 1);
                }
                return new NewInputs(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewInputs[i];
            }
        }

        public NewInputs(List inputs) {
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            this.f78732a = inputs;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NewInputs) && Intrinsics.f(this.f78732a, ((NewInputs) obj2).f78732a);
        }

        public final int hashCode() {
            return this.f78732a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f78732a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }
}
