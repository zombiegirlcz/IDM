package com.revolut.feature.apm.bills.core.api.model.form;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/form/MoneyField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/BillFormFieldV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoneyField extends BillFormFieldV2 {

    @NotNull
    public static final Parcelable.Creator<MoneyField> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f61393c;
    public final BillFormField.BillFormFieldAttributes d;
    public final b e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoneyField(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : BillFormField.BillFormFieldAttributes.CREATOR.createFromParcel(parcel), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneyField[i];
        }
    }

    public MoneyField(String name, String label, boolean z, BillFormField.BillFormFieldAttributes billFormFieldAttributes, b currency) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f61391a = name;
        this.f61392b = label;
        this.f61393c = z;
        this.d = billFormFieldAttributes;
        this.e = currency;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BillFormField.BillFormFieldAttributes getD() {
        return this.d;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF61393c() {
        return this.f61393c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoneyField)) {
            return false;
        }
        MoneyField moneyField = (MoneyField) obj2;
        return Intrinsics.f(this.f61391a, moneyField.f61391a) && Intrinsics.f(this.f61392b, moneyField.f61392b) && this.f61393c == moneyField.f61393c && Intrinsics.f(this.d, moneyField.d) && Intrinsics.f(this.e, moneyField.e);
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: getLabel, reason: from getter */
    public final String getF61392b() {
        return this.f61392b;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF61391a() {
        return this.f61391a;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.f61391a.hashCode() * 31, 31, this.f61392b), 31, this.f61393c);
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = this.d;
        return this.e.hashCode() + ((iC + (billFormFieldAttributes == null ? 0 : billFormFieldAttributes.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61391a);
        dest.writeString(this.f61392b);
        dest.writeInt(this.f61393c ? 1 : 0);
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = this.d;
        if (billFormFieldAttributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billFormFieldAttributes.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.e);
    }
}
