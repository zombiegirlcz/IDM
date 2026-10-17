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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/form/RepeaterDropdownField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/BillFormFieldV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RepeaterDropdownField extends BillFormFieldV2 {

    @NotNull
    public static final Parcelable.Creator<RepeaterDropdownField> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f61411c;
    public final BillFormField.BillFormFieldAttributes d;
    public final String e;
    public final List f;

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
            String string3 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ChoiceV2.CREATOR, parcel, arrayList, iA, i);
            }
            return new RepeaterDropdownField(string, string2, z, billFormFieldAttributesCreateFromParcel, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RepeaterDropdownField[i];
        }
    }

    public RepeaterDropdownField(String name, String label, boolean z, BillFormField.BillFormFieldAttributes billFormFieldAttributes, String placeholder, List choices) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(choices, "choices");
        this.f61409a = name;
        this.f61410b = label;
        this.f61411c = z;
        this.d = billFormFieldAttributes;
        this.e = placeholder;
        this.f = choices;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BillFormField.BillFormFieldAttributes getD() {
        return this.d;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF61411c() {
        return this.f61411c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RepeaterDropdownField)) {
            return false;
        }
        RepeaterDropdownField repeaterDropdownField = (RepeaterDropdownField) obj2;
        return Intrinsics.f(this.f61409a, repeaterDropdownField.f61409a) && Intrinsics.f(this.f61410b, repeaterDropdownField.f61410b) && this.f61411c == repeaterDropdownField.f61411c && Intrinsics.f(this.d, repeaterDropdownField.d) && Intrinsics.f(this.e, repeaterDropdownField.e) && Intrinsics.f(this.f, repeaterDropdownField.f);
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: getLabel, reason: from getter */
    public final String getF61410b() {
        return this.f61410b;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF61409a() {
        return this.f61409a;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.f61409a.hashCode() * 31, 31, this.f61410b), 31, this.f61411c);
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = this.d;
        return this.f.hashCode() + p.a.c((iC + (billFormFieldAttributes == null ? 0 : billFormFieldAttributes.hashCode())) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61409a);
        dest.writeString(this.f61410b);
        dest.writeInt(this.f61411c ? 1 : 0);
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = this.d;
        if (billFormFieldAttributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billFormFieldAttributes.writeToParcel(dest, i);
        }
        dest.writeString(this.e);
        Iterator itV = p.a.v(this.f, dest);
        while (itV.hasNext()) {
            ((ChoiceV2) itV.next()).writeToParcel(dest, i);
        }
    }
}
