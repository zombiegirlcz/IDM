package com.revolut.feature.apm.bills.core.api.model.form;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/form/DropdownField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/BillFormFieldV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DropdownField extends BillFormFieldV2 {

    @NotNull
    public static final Parcelable.Creator<DropdownField> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f61381c;
    public final BillFormField.BillFormFieldAttributes d;
    public final List e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f61382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f61383h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BillFormField.Tooltip f61384j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iA = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            BillFormField.BillFormFieldAttributes billFormFieldAttributesCreateFromParcel = parcel.readInt() == 0 ? null : BillFormField.BillFormFieldAttributes.CREATOR.createFromParcel(parcel);
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ChoiceV2.CREATOR, parcel, arrayList, iA, i);
            }
            return new DropdownField(string, string2, z, billFormFieldAttributesCreateFromParcel, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BillFormField.Tooltip.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DropdownField[i];
        }
    }

    public DropdownField(String name, String label, boolean z, BillFormField.BillFormFieldAttributes billFormFieldAttributes, List choices, String str, String str2, String str3, String str4, BillFormField.Tooltip tooltip) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(choices, "choices");
        this.f61379a = name;
        this.f61380b = label;
        this.f61381c = z;
        this.d = billFormFieldAttributes;
        this.e = choices;
        this.f = str;
        this.f61382g = str2;
        this.f61383h = str3;
        this.i = str4;
        this.f61384j = tooltip;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BillFormField.BillFormFieldAttributes getD() {
        return this.d;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF61381c() {
        return this.f61381c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DropdownField)) {
            return false;
        }
        DropdownField dropdownField = (DropdownField) obj2;
        return Intrinsics.f(this.f61379a, dropdownField.f61379a) && Intrinsics.f(this.f61380b, dropdownField.f61380b) && this.f61381c == dropdownField.f61381c && Intrinsics.f(this.d, dropdownField.d) && Intrinsics.f(this.e, dropdownField.e) && Intrinsics.f(this.f, dropdownField.f) && Intrinsics.f(this.f61382g, dropdownField.f61382g) && Intrinsics.f(this.f61383h, dropdownField.f61383h) && Intrinsics.f(this.i, dropdownField.i) && Intrinsics.f(this.f61384j, dropdownField.f61384j);
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: getLabel, reason: from getter */
    public final String getF61380b() {
        return this.f61380b;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF61379a() {
        return this.f61379a;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.f61379a.hashCode() * 31, 31, this.f61380b), 31, this.f61381c);
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = this.d;
        int iD = p.a.d((iC + (billFormFieldAttributes == null ? 0 : billFormFieldAttributes.hashCode())) * 31, 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f61382g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61383h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BillFormField.Tooltip tooltip = this.f61384j;
        return iHashCode4 + (tooltip != null ? tooltip.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61379a);
        dest.writeString(this.f61380b);
        dest.writeInt(this.f61381c ? 1 : 0);
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = this.d;
        if (billFormFieldAttributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billFormFieldAttributes.writeToParcel(dest, i);
        }
        Iterator itV = p.a.v(this.e, dest);
        while (itV.hasNext()) {
            ((ChoiceV2) itV.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.f);
        dest.writeString(this.f61382g);
        dest.writeString(this.f61383h);
        dest.writeString(this.i);
        BillFormField.Tooltip tooltip = this.f61384j;
        if (tooltip == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            tooltip.writeToParcel(dest, i);
        }
    }
}
