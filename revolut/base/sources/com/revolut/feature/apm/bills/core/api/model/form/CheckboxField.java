package com.revolut.feature.apm.bills.core.api.model.form;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/form/CheckboxField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/BillFormFieldV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CheckboxField extends BillFormFieldV2 {

    @NotNull
    public static final Parcelable.Creator<CheckboxField> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BillFormField.BillFormFieldAttributes f61365c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckboxField(parcel.readInt() == 0 ? null : BillFormField.BillFormFieldAttributes.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CheckboxField[i];
        }
    }

    public CheckboxField(BillFormField.BillFormFieldAttributes billFormFieldAttributes, String name, String label, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f61363a = name;
        this.f61364b = label;
        this.f61365c = billFormFieldAttributes;
        this.d = z;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BillFormField.BillFormFieldAttributes getF61365c() {
        return this.f61365c;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CheckboxField)) {
            return false;
        }
        CheckboxField checkboxField = (CheckboxField) obj2;
        return Intrinsics.f(this.f61363a, checkboxField.f61363a) && Intrinsics.f(this.f61364b, checkboxField.f61364b) && Intrinsics.f(this.f61365c, checkboxField.f61365c) && this.d == checkboxField.d;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: getLabel, reason: from getter */
    public final String getF61364b() {
        return this.f61364b;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF61363a() {
        return this.f61363a;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f61363a.hashCode() * 31, 31, this.f61364b);
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = this.f61365c;
        return Boolean.hashCode(this.d) + ((iC + (billFormFieldAttributes == null ? 0 : billFormFieldAttributes.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61363a);
        dest.writeString(this.f61364b);
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = this.f61365c;
        if (billFormFieldAttributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billFormFieldAttributes.writeToParcel(dest, i);
        }
        dest.writeInt(this.d ? 1 : 0);
    }
}
