package com.revolut.feature.apm.bills.core.api.model.form;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import h30.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/form/TextField;", "Lcom/revolut/feature/apm/bills/core/api/model/form/BillFormFieldV2;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TextField extends BillFormFieldV2 {

    @NotNull
    public static final Parcelable.Creator<TextField> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f61420c;
    public final BillFormField.BillFormFieldAttributes d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f61421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f61422h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BillFormField.Tooltip f61423j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f61424l;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            BillFormField.BillFormFieldAttributes billFormFieldAttributesCreateFromParcel = parcel.readInt() == 0 ? null : BillFormField.BillFormFieldAttributes.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            BillFormField.Tooltip tooltipCreateFromParcel = parcel.readInt() == 0 ? null : BillFormField.Tooltip.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(TextField.class, parcel, arrayList, iE, 1);
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i2);
                int i3 = 0;
                while (i3 != i2) {
                    linkedHashMap2.put(parcel.readString(), BillFormFieldControl.CREATOR.createFromParcel(parcel));
                    i3++;
                    z = z;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new TextField(string, string2, z, billFormFieldAttributesCreateFromParcel, string3, string4, string5, string6, string7, tooltipCreateFromParcel, arrayList, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TextField[i];
        }
    }

    public TextField(String name, String label, boolean z, BillFormField.BillFormFieldAttributes billFormFieldAttributes, String str, String str2, String str3, String str4, String str5, BillFormField.Tooltip tooltip, ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f61418a = name;
        this.f61419b = label;
        this.f61420c = z;
        this.d = billFormFieldAttributes;
        this.e = str;
        this.f = str2;
        this.f61421g = str3;
        this.f61422h = str4;
        this.i = str5;
        this.f61423j = tooltip;
        this.k = arrayList;
        this.f61424l = linkedHashMap;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BillFormField.BillFormFieldAttributes getD() {
        return this.d;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF61417c() {
        return this.f61420c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TextField)) {
            return false;
        }
        TextField textField = (TextField) obj2;
        return Intrinsics.f(this.f61418a, textField.f61418a) && Intrinsics.f(this.f61419b, textField.f61419b) && this.f61420c == textField.f61420c && Intrinsics.f(this.d, textField.d) && Intrinsics.f(this.e, textField.e) && Intrinsics.f(this.f, textField.f) && Intrinsics.f(this.f61421g, textField.f61421g) && Intrinsics.f(this.f61422h, textField.f61422h) && Intrinsics.f(this.i, textField.i) && Intrinsics.f(this.f61423j, textField.f61423j) && Intrinsics.f(this.k, textField.k) && Intrinsics.f(this.f61424l, textField.f61424l);
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: getLabel, reason: from getter */
    public final String getF61416b() {
        return this.f61419b;
    }

    @Override // com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF61415a() {
        return this.f61418a;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.f61418a.hashCode() * 31, 31, this.f61419b), 31, this.f61420c);
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = this.d;
        int iHashCode = (iC + (billFormFieldAttributes == null ? 0 : billFormFieldAttributes.hashCode())) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f61421g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f61422h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BillFormField.Tooltip tooltip = this.f61423j;
        int iHashCode7 = (iHashCode6 + (tooltip == null ? 0 : tooltip.hashCode())) * 31;
        List list = this.k;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.f61424l;
        return iHashCode8 + (map != null ? map.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61418a);
        dest.writeString(this.f61419b);
        dest.writeInt(this.f61420c ? 1 : 0);
        BillFormField.BillFormFieldAttributes billFormFieldAttributes = this.d;
        if (billFormFieldAttributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billFormFieldAttributes.writeToParcel(dest, i);
        }
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f61421g);
        dest.writeString(this.f61422h);
        dest.writeString(this.i);
        BillFormField.Tooltip tooltip = this.f61423j;
        if (tooltip == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            tooltip.writeToParcel(dest, i);
        }
        List list = this.k;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
        Map map = this.f61424l;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itV = l.v(dest, 1, map);
        while (itV.hasNext()) {
            Map.Entry entry = (Map.Entry) itV.next();
            dest.writeString((String) entry.getKey());
            ((BillFormFieldControl) entry.getValue()).writeToParcel(dest, i);
        }
    }
}
