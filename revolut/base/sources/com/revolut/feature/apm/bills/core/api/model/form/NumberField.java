package com.revolut.feature.apm.bills.core.api.model.form;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/form/NumberField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/BillFormFieldV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NumberField extends BillFormFieldV2 {

    @NotNull
    public static final Parcelable.Creator<NumberField> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f61399c;
    public final BillFormField.BillFormFieldAttributes d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f61400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f61401h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BillFormField.Tooltip f61402j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NumberField(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : BillFormField.BillFormFieldAttributes.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? BillFormField.Tooltip.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NumberField[i];
        }
    }

    public NumberField(String name, String label, boolean z, BillFormField.BillFormFieldAttributes billFormFieldAttributes, String str, String str2, String str3, String str4, String str5, BillFormField.Tooltip tooltip) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f61397a = name;
        this.f61398b = label;
        this.f61399c = z;
        this.d = billFormFieldAttributes;
        this.e = str;
        this.f = str2;
        this.f61400g = str3;
        this.f61401h = str4;
        this.i = str5;
        this.f61402j = tooltip;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BillFormField.BillFormFieldAttributes getD() {
        return this.d;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF61408c() {
        return this.f61399c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NumberField)) {
            return false;
        }
        NumberField numberField = (NumberField) obj2;
        return Intrinsics.f(this.f61397a, numberField.f61397a) && Intrinsics.f(this.f61398b, numberField.f61398b) && this.f61399c == numberField.f61399c && Intrinsics.f(this.d, numberField.d) && Intrinsics.f(this.e, numberField.e) && Intrinsics.f(this.f, numberField.f) && Intrinsics.f(this.f61400g, numberField.f61400g) && Intrinsics.f(this.f61401h, numberField.f61401h) && Intrinsics.f(this.i, numberField.i) && Intrinsics.f(this.f61402j, numberField.f61402j);
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: getLabel, reason: from getter */
    public final String getF61416b() {
        return this.f61398b;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF61415a() {
        return this.f61397a;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.f61397a.hashCode() * 31, 31, this.f61398b), 31, this.f61399c);
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = this.d;
        int iHashCode = (iC + (billFormFieldAttributes == null ? 0 : billFormFieldAttributes.hashCode())) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61400g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f61401h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BillFormField.Tooltip tooltip = this.f61402j;
        return iHashCode6 + (tooltip != null ? tooltip.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61397a);
        dest.writeString(this.f61398b);
        dest.writeInt(this.f61399c ? 1 : 0);
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = this.d;
        if (billFormFieldAttributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billFormFieldAttributes.writeToParcel(dest, i);
        }
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f61400g);
        dest.writeString(this.f61401h);
        dest.writeString(this.i);
        BillFormField.Tooltip tooltip = this.f61402j;
        if (tooltip == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            tooltip.writeToParcel(dest, i);
        }
    }
}
