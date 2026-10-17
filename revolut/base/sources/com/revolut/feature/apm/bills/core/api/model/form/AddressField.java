package com.revolut.feature.apm.bills.core.api.model.form;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/form/AddressField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/BillFormFieldV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddressField extends BillFormFieldV2 {

    @NotNull
    public static final Parcelable.Creator<AddressField> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f61354c;
    public final BillFormField.BillFormFieldAttributes d;
    public final Address e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AddressField(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : BillFormField.BillFormFieldAttributes.CREATOR.createFromParcel(parcel), (Address) parcel.readParcelable(AddressField.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddressField[i];
        }
    }

    public AddressField(String name, String label, boolean z, BillFormField.BillFormFieldAttributes billFormFieldAttributes, Address address) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f61352a = name;
        this.f61353b = label;
        this.f61354c = z;
        this.d = billFormFieldAttributes;
        this.e = address;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BillFormField.BillFormFieldAttributes getD() {
        return this.d;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF61354c() {
        return this.f61354c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddressField)) {
            return false;
        }
        AddressField addressField = (AddressField) obj2;
        return Intrinsics.f(this.f61352a, addressField.f61352a) && Intrinsics.f(this.f61353b, addressField.f61353b) && this.f61354c == addressField.f61354c && Intrinsics.f(this.d, addressField.d) && Intrinsics.f(this.e, addressField.e);
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: getLabel, reason: from getter */
    public final String getF61353b() {
        return this.f61353b;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF61352a() {
        return this.f61352a;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.f61352a.hashCode() * 31, 31, this.f61353b), 31, this.f61354c);
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = this.d;
        int iHashCode = (iC + (billFormFieldAttributes == null ? 0 : billFormFieldAttributes.hashCode())) * 31;
        Address address = this.e;
        return iHashCode + (address != null ? address.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61352a);
        dest.writeString(this.f61353b);
        dest.writeInt(this.f61354c ? 1 : 0);
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = this.d;
        if (billFormFieldAttributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billFormFieldAttributes.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.e, i);
    }
}
