package com.revolut.feature.apm.bills.core.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;
import xo1.c;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillFormField;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "xo1/c", "Tooltip", "Choice", "BillFormFieldAttributes", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BillFormField implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BillFormField> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f61276c;
    public final boolean d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Tooltip f61277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f61278h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f61279j;
    public final BillFormCondition k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f61280l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final BillForm f61281m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final BillFormFieldAttributes f61282n;
    public final boolean o;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillFormField$Choice;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Choice implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Choice> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f61287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f61288c;
        public final List d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(BillFormField.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Choice(string, string2, string3, parcel.readString(), arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Choice[i];
            }
        }

        public Choice(String value, String label, String str, String str2, List childInputs) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(childInputs, "childInputs");
            this.f61286a = value;
            this.f61287b = label;
            this.f61288c = str;
            this.d = childInputs;
            this.e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Choice)) {
                return false;
            }
            Choice choice = (Choice) obj2;
            return Intrinsics.f(this.f61286a, choice.f61286a) && Intrinsics.f(this.f61287b, choice.f61287b) && Intrinsics.f(this.f61288c, choice.f61288c) && Intrinsics.f(this.d, choice.d) && Intrinsics.f(this.e, choice.e);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f61286a.hashCode() * 31, 31, this.f61287b);
            String str = this.f61288c;
            int iD = p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
            String str2 = this.e;
            return iD + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61286a);
            dest.writeString(this.f61287b);
            dest.writeString(this.f61288c);
            Iterator itV = p.a.v(this.d, dest);
            while (itV.hasNext()) {
                ((BillFormField) itV.next()).writeToParcel(dest, i);
            }
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillFormField$Tooltip;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Tooltip implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Tooltip> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f61290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f61291c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Tooltip(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tooltip[i];
            }
        }

        public Tooltip(String str, String str2, String str3, String str4) {
            this.f61289a = str;
            this.f61290b = str2;
            this.f61291c = str3;
            this.d = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Tooltip)) {
                return false;
            }
            Tooltip tooltip = (Tooltip) obj2;
            return Intrinsics.f(this.f61289a, tooltip.f61289a) && Intrinsics.f(this.f61290b, tooltip.f61290b) && Intrinsics.f(this.f61291c, tooltip.f61291c) && Intrinsics.f(this.d, tooltip.d);
        }

        public final int hashCode() {
            String str = this.f61289a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f61290b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f61291c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61289a);
            dest.writeString(this.f61290b);
            dest.writeString(this.f61291c);
            dest.writeString(this.d);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            c cVarValueOf = c.valueOf(parcel.readString());
            boolean z3 = parcel.readInt() != 0;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Tooltip tooltipCreateFromParcel = parcel.readInt() == 0 ? null : Tooltip.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Choice.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            BillFormCondition billFormConditionCreateFromParcel = BillFormCondition.CREATOR.createFromParcel(parcel);
            int i2 = parcel.readInt();
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(i2);
            int iA2 = 0;
            while (true) {
                z = z3;
                if (iA2 == i2) {
                    break;
                }
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(BillFormField.CREATOR, parcel, arrayList3, iA2, 1);
                z3 = z;
            }
            return new BillFormField(string, string2, cVarValueOf, z, string3, string4, tooltipCreateFromParcel, string5, string6, arrayList2, billFormConditionCreateFromParcel, arrayList3, parcel.readInt() == 0 ? null : BillForm.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BillFormFieldAttributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BillFormField[i];
        }
    }

    public BillFormField(String name, String label, c type, boolean z, String str, String str2, Tooltip tooltip, String str3, String str4, ArrayList arrayList, BillFormCondition condition, List childInputs, BillForm billForm, BillFormFieldAttributes billFormFieldAttributes, boolean z3) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(childInputs, "childInputs");
        this.f61274a = name;
        this.f61275b = label;
        this.f61276c = type;
        this.d = z;
        this.e = str;
        this.f = str2;
        this.f61277g = tooltip;
        this.f61278h = str3;
        this.i = str4;
        this.f61279j = arrayList;
        this.k = condition;
        this.f61280l = childInputs;
        this.f61281m = billForm;
        this.f61282n = billFormFieldAttributes;
        this.o = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BillFormField)) {
            return false;
        }
        BillFormField billFormField = (BillFormField) obj2;
        return Intrinsics.f(this.f61274a, billFormField.f61274a) && Intrinsics.f(this.f61275b, billFormField.f61275b) && this.f61276c == billFormField.f61276c && this.d == billFormField.d && Intrinsics.f(this.e, billFormField.e) && Intrinsics.f(this.f, billFormField.f) && Intrinsics.f(this.f61277g, billFormField.f61277g) && Intrinsics.f(this.f61278h, billFormField.f61278h) && Intrinsics.f(this.i, billFormField.i) && Intrinsics.f(this.f61279j, billFormField.f61279j) && Intrinsics.f(this.k, billFormField.k) && Intrinsics.f(this.f61280l, billFormField.f61280l) && Intrinsics.f(this.f61281m, billFormField.f61281m) && Intrinsics.f(this.f61282n, billFormField.f61282n) && this.o == billFormField.o;
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f61276c.hashCode() + p.a.c(this.f61274a.hashCode() * 31, 31, this.f61275b)) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Tooltip tooltip = this.f61277g;
        int iHashCode3 = (iHashCode2 + (tooltip == null ? 0 : tooltip.hashCode())) * 31;
        String str3 = this.f61278h;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f61279j;
        int iD = p.a.d(p.a.e((iHashCode5 + (list == null ? 0 : list.hashCode())) * 31, 31, this.k.f61273a), 31, this.f61280l);
        BillForm billForm = this.f61281m;
        int iHashCode6 = (iD + (billForm == null ? 0 : billForm.hashCode())) * 31;
        BillFormFieldAttributes billFormFieldAttributes = this.f61282n;
        return Boolean.hashCode(this.o) + ((iHashCode6 + (billFormFieldAttributes != null ? billFormFieldAttributes.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61274a);
        dest.writeString(this.f61275b);
        dest.writeString(this.f61276c.name());
        dest.writeInt(this.d ? 1 : 0);
        dest.writeString(this.e);
        dest.writeString(this.f);
        Tooltip tooltip = this.f61277g;
        if (tooltip == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            tooltip.writeToParcel(dest, i);
        }
        dest.writeString(this.f61278h);
        dest.writeString(this.i);
        List list = this.f61279j;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((Choice) itQ.next()).writeToParcel(dest, i);
            }
        }
        this.k.writeToParcel(dest, i);
        Iterator itV = p.a.v(this.f61280l, dest);
        while (itV.hasNext()) {
            ((BillFormField) itV.next()).writeToParcel(dest, i);
        }
        BillForm billForm = this.f61281m;
        if (billForm == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billForm.writeToParcel(dest, i);
        }
        BillFormFieldAttributes billFormFieldAttributes = this.f61282n;
        if (billFormFieldAttributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            billFormFieldAttributes.writeToParcel(dest, i);
        }
        dest.writeInt(this.o ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/core/api/model/BillFormField$BillFormFieldAttributes;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillFormFieldAttributes implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<BillFormFieldAttributes> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f61284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f61285c;
        public final Integer d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillFormFieldAttributes(parcel.readString(), parcel.readString(), (b) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillFormFieldAttributes[i];
            }
        }

        public BillFormFieldAttributes(String str, String str2, b bVar, Integer num, String str3) {
            this.f61283a = str;
            this.f61284b = str2;
            this.f61285c = bVar;
            this.d = num;
            this.e = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BillFormFieldAttributes)) {
                return false;
            }
            BillFormFieldAttributes billFormFieldAttributes = (BillFormFieldAttributes) obj2;
            return Intrinsics.f(this.f61283a, billFormFieldAttributes.f61283a) && Intrinsics.f(this.f61284b, billFormFieldAttributes.f61284b) && Intrinsics.f(this.f61285c, billFormFieldAttributes.f61285c) && Intrinsics.f(this.d, billFormFieldAttributes.d) && Intrinsics.f(this.e, billFormFieldAttributes.e);
        }

        public final int hashCode() {
            String str = this.f61283a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f61284b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            b bVar = this.f61285c;
            int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Integer num = this.d;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.e;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f61283a);
            dest.writeString(this.f61284b);
            dest.writeSerializable(this.f61285c);
            Integer num = this.d;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            dest.writeString(this.e);
        }

        public BillFormFieldAttributes() {
            this(null, null, null, null, null);
        }
    }
}
