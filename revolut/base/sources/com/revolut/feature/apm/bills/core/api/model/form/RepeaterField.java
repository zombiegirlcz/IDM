package com.revolut.feature.apm.bills.core.api.model.form;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/form/RepeaterField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/BillFormFieldV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RepeaterField extends BillFormFieldV2 {

    @NotNull
    public static final Parcelable.Creator<RepeaterField> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f61414c;
    public final BillFormField.BillFormFieldAttributes d;
    public final String e;
    public final BillFormV2 f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RepeaterField(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : BillFormField.BillFormFieldAttributes.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? BillFormV2.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RepeaterField[i];
        }
    }

    public RepeaterField(String name, String label, boolean z, BillFormField.BillFormFieldAttributes billFormFieldAttributes, String placeholder, BillFormV2 billFormV2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        this.f61412a = name;
        this.f61413b = label;
        this.f61414c = z;
        this.d = billFormFieldAttributes;
        this.e = placeholder;
        this.f = billFormV2;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BillFormField.BillFormFieldAttributes getD() {
        return this.d;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF61414c() {
        return this.f61414c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RepeaterField)) {
            return false;
        }
        RepeaterField repeaterField = (RepeaterField) obj2;
        return Intrinsics.f(this.f61412a, repeaterField.f61412a) && Intrinsics.f(this.f61413b, repeaterField.f61413b) && this.f61414c == repeaterField.f61414c && Intrinsics.f(this.d, repeaterField.d) && Intrinsics.f(this.e, repeaterField.e) && Intrinsics.f(this.f, repeaterField.f);
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: getLabel, reason: from getter */
    public final String getF61413b() {
        return this.f61413b;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF61412a() {
        return this.f61412a;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.f61412a.hashCode() * 31, 31, this.f61413b), 31, this.f61414c);
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = this.d;
        int iC2 = p.a.c((iC + (billFormFieldAttributes == null ? 0 : billFormFieldAttributes.hashCode())) * 31, 31, this.e);
        BillFormV2 billFormV2 = this.f;
        return iC2 + (billFormV2 != null ? billFormV2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61412a);
        dest.writeString(this.f61413b);
        dest.writeInt(this.f61414c ? 1 : 0);
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = this.d;
        if (billFormFieldAttributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billFormFieldAttributes.writeToParcel(dest, i);
        }
        dest.writeString(this.e);
        BillFormV2 billFormV2 = this.f;
        if (billFormV2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billFormV2.writeToParcel(dest, i);
        }
    }
}
