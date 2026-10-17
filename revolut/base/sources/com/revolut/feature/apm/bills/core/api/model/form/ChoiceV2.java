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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/form/ChoiceV2;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChoiceV2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChoiceV2> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f61368c;
    public final List d;
    public final BillFormV2 e;
    public final BillFormField.BillFormFieldAttributes f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f61369g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(ChoiceV2.class, parcel, arrayList, iE, 1);
            }
            return new ChoiceV2(string, string2, string3, arrayList, parcel.readInt() == 0 ? null : BillFormV2.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BillFormField.BillFormFieldAttributes.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChoiceV2[i];
        }
    }

    public ChoiceV2(String value, String label, String str, List childInputs, BillFormV2 billFormV2, BillFormField.BillFormFieldAttributes billFormFieldAttributes, String str2) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(childInputs, "childInputs");
        this.f61366a = value;
        this.f61367b = label;
        this.f61368c = str;
        this.d = childInputs;
        this.e = billFormV2;
        this.f = billFormFieldAttributes;
        this.f61369g = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChoiceV2)) {
            return false;
        }
        ChoiceV2 choiceV2 = (ChoiceV2) obj2;
        return Intrinsics.f(this.f61366a, choiceV2.f61366a) && Intrinsics.f(this.f61367b, choiceV2.f61367b) && Intrinsics.f(this.f61368c, choiceV2.f61368c) && Intrinsics.f(this.d, choiceV2.d) && Intrinsics.f(this.e, choiceV2.e) && Intrinsics.f(this.f, choiceV2.f) && Intrinsics.f(this.f61369g, choiceV2.f61369g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f61366a.hashCode() * 31, 31, this.f61367b);
        String str = this.f61368c;
        int iD = p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        BillFormV2 billFormV2 = this.e;
        int iHashCode = (iD + (billFormV2 == null ? 0 : billFormV2.hashCode())) * 31;
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = this.f;
        int iHashCode2 = (iHashCode + (billFormFieldAttributes == null ? 0 : billFormFieldAttributes.hashCode())) * 31;
        String str2 = this.f61369g;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61366a);
        dest.writeString(this.f61367b);
        dest.writeString(this.f61368c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        BillFormV2 billFormV2 = this.e;
        if (billFormV2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billFormV2.writeToParcel(dest, i);
        }
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = this.f;
        if (billFormFieldAttributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billFormFieldAttributes.writeToParcel(dest, i);
        }
        dest.writeString(this.f61369g);
    }
}
