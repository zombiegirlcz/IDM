package com.revolut.feature.apm.bills.core.api.model.form;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/form/NestedItemField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/BillFormFieldV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NestedItemField extends BillFormFieldV2 {

    @NotNull
    public static final Parcelable.Creator<NestedItemField> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f61396c;
    public final BillFormField.BillFormFieldAttributes d;
    public final BillFormV2 e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NestedItemField(parcel.readString(), parcel.readString(), parcel.readInt() != 0, BillFormField.BillFormFieldAttributes.CREATOR.createFromParcel(parcel), BillFormV2.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NestedItemField[i];
        }
    }

    public NestedItemField(String name, String label, boolean z, BillFormField.BillFormFieldAttributes attributes, BillFormV2 subform) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(subform, "subform");
        this.f61394a = name;
        this.f61395b = label;
        this.f61396c = z;
        this.d = attributes;
        this.e = subform;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BillFormField.BillFormFieldAttributes getD() {
        return this.d;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF61396c() {
        return this.f61396c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NestedItemField)) {
            return false;
        }
        NestedItemField nestedItemField = (NestedItemField) obj2;
        return Intrinsics.f(this.f61394a, nestedItemField.f61394a) && Intrinsics.f(this.f61395b, nestedItemField.f61395b) && this.f61396c == nestedItemField.f61396c && Intrinsics.f(this.d, nestedItemField.d) && Intrinsics.f(this.e, nestedItemField.e);
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: getLabel, reason: from getter */
    public final String getF61413b() {
        return this.f61395b;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF61412a() {
        return this.f61394a;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + j6.a.c(p.a.c(this.f61394a.hashCode() * 31, 31, this.f61395b), 31, this.f61396c)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61394a);
        dest.writeString(this.f61395b);
        dest.writeInt(this.f61396c ? 1 : 0);
        this.d.writeToParcel(dest, i);
        this.e.writeToParcel(dest, i);
    }
}
