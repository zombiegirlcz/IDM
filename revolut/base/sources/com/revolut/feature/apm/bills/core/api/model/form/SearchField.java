package com.revolut.feature.apm.bills.core.api.model.form;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/form/SearchField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/BillFormFieldV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SearchField extends BillFormFieldV2 {

    @NotNull
    public static final Parcelable.Creator<SearchField> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f61417c;
    public final BillFormField.BillFormFieldAttributes d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SearchField(parcel.readInt() == 0 ? null : BillFormField.BillFormFieldAttributes.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SearchField[i];
        }
    }

    public SearchField(BillFormField.BillFormFieldAttributes billFormFieldAttributes, String name, String label, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f61415a = name;
        this.f61416b = label;
        this.f61417c = z;
        this.d = billFormFieldAttributes;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BillFormField.BillFormFieldAttributes getD() {
        return this.d;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF61417c() {
        return this.f61417c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SearchField)) {
            return false;
        }
        SearchField searchField = (SearchField) obj2;
        return Intrinsics.f(this.f61415a, searchField.f61415a) && Intrinsics.f(this.f61416b, searchField.f61416b) && this.f61417c == searchField.f61417c && Intrinsics.f(this.d, searchField.d);
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: getLabel, reason: from getter */
    public final String getF61416b() {
        return this.f61416b;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF61415a() {
        return this.f61415a;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.f61415a.hashCode() * 31, 31, this.f61416b), 31, this.f61417c);
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = this.d;
        return iC + (billFormFieldAttributes == null ? 0 : billFormFieldAttributes.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61415a);
        dest.writeString(this.f61416b);
        dest.writeInt(this.f61417c ? 1 : 0);
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = this.d;
        if (billFormFieldAttributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billFormFieldAttributes.writeToParcel(dest, i);
        }
    }
}
