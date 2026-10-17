package com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import h30.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DetailsInputForm;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "DetailsInputField", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DetailsInputForm implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DetailsInputForm> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f67474a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readParcelable(DetailsInputForm.class.getClassLoader()));
            }
            return new DetailsInputForm(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DetailsInputForm[i];
        }
    }

    public DetailsInputForm(Map inputFields) {
        Intrinsics.checkNotNullParameter(inputFields, "inputFields");
        this.f67474a = inputFields;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final DetailsInputField a(String fieldId) {
        Intrinsics.checkNotNullParameter(fieldId, "fieldId");
        return (DetailsInputField) this.f67474a.get(fieldId);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final boolean b() {
        Collection collectionValues = this.f67474a.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            return false;
        }
        Iterator it8 = collectionValues.iterator();
        while (it8.hasNext()) {
            if (((DetailsInputField) it8.next()).c()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof DetailsInputForm) && this.f67474a.equals(((DetailsInputForm) obj2).f67474a);
    }

    public final int hashCode() {
        return this.f67474a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itT = o.t(this.f67474a, dest);
        while (itT.hasNext()) {
            Map.Entry entry = (Map.Entry) itT.next();
            dest.writeString((String) entry.getKey());
            dest.writeParcelable((Parcelable) entry.getValue(), i);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DetailsInputForm$DetailsInputField;", "T", "Landroid/os/Parcelable;", "<init>", "()V", "TextField", "MoneyField", "DropdownField", "CheckboxField", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DetailsInputForm$DetailsInputField$CheckboxField;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DetailsInputForm$DetailsInputField$DropdownField;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DetailsInputForm$DetailsInputField$MoneyField;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DetailsInputForm$DetailsInputField$TextField;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class DetailsInputField<T> implements Parcelable {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DetailsInputForm$DetailsInputField$CheckboxField;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DetailsInputForm$DetailsInputField;", "", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CheckboxField extends DetailsInputField<Boolean> {

            @NotNull
            public static final Parcelable.Creator<CheckboxField> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f67475a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Clause f67476b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f67477c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CheckboxField((Clause) parcel.readParcelable(CheckboxField.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CheckboxField[i];
                }
            }

            public CheckboxField(Clause label, String id10, boolean z) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(label, "label");
                this.f67475a = id10;
                this.f67476b = label;
                this.f67477c = z;
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm.DetailsInputField
            /* JADX INFO: renamed from: a */
            public final boolean getF() {
                return true;
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm.DetailsInputField
            /* JADX INFO: renamed from: b */
            public final boolean getF67489g() {
                return false;
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
                return Intrinsics.f(this.f67475a, checkboxField.f67475a) && Intrinsics.f(this.f67476b, checkboxField.f67476b) && this.f67477c == checkboxField.f67477c;
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm.DetailsInputField
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF67486a() {
                return this.f67475a;
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm.DetailsInputField
            public final Object getValue() {
                return Boolean.valueOf(this.f67477c);
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f67477c) + p.a.a(this.f67475a.hashCode() * 31, 31, this.f67476b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f67475a);
                dest.writeParcelable(this.f67476b, i);
                dest.writeInt(this.f67477c ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DetailsInputForm$DetailsInputField$DropdownField;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DetailsInputForm$DetailsInputField;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DropdownField extends DetailsInputField<String> {

            @NotNull
            public static final Parcelable.Creator<DropdownField> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f67478a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Clause f67479b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f67480c;
            public final List d;
            public final boolean e;
            public final boolean f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    Clause clause = (Clause) parcel.readParcelable(DropdownField.class.getClassLoader());
                    String string2 = parcel.readString();
                    ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                    boolean z3 = false;
                    if (parcel.readInt() != 0) {
                        z = false;
                        z3 = true;
                    } else {
                        z = false;
                    }
                    return new DropdownField(string, clause, string2, arrayListCreateStringArrayList, z3, parcel.readInt() == 0 ? z : true);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DropdownField[i];
                }
            }

            public DropdownField(String id10, Clause label, String str, List values, boolean z, boolean z3) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(values, "values");
                this.f67478a = id10;
                this.f67479b = label;
                this.f67480c = str;
                this.d = values;
                this.e = z;
                this.f = z3;
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm.DetailsInputField
            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getF() {
                return this.e;
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm.DetailsInputField
            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getF67489g() {
                return this.f;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof DropdownField)) {
                    return false;
                }
                DropdownField dropdownField = (DropdownField) obj2;
                return Intrinsics.f(this.f67478a, dropdownField.f67478a) && Intrinsics.f(this.f67479b, dropdownField.f67479b) && Intrinsics.f(this.f67480c, dropdownField.f67480c) && Intrinsics.f(this.d, dropdownField.d) && this.e == dropdownField.e && this.f == dropdownField.f;
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm.DetailsInputField
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF67486a() {
                return this.f67478a;
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm.DetailsInputField
            public final Object getValue() {
                return this.f67480c;
            }

            public final int hashCode() {
                int iA = p.a.a(this.f67478a.hashCode() * 31, 31, this.f67479b);
                String str = this.f67480c;
                return Boolean.hashCode(this.f) + j6.a.c(p.a.d((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f67478a);
                dest.writeParcelable(this.f67479b, i);
                dest.writeString(this.f67480c);
                dest.writeStringList(this.d);
                dest.writeInt(this.e ? 1 : 0);
                dest.writeInt(this.f ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DetailsInputForm$DetailsInputField$MoneyField;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DetailsInputForm$DetailsInputField;", "", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MoneyField extends DetailsInputField<Long> {

            @NotNull
            public static final Parcelable.Creator<MoneyField> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f67481a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Clause f67482b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Clause f67483c;
            public final Clause d;
            public final Long e;
            public final xi0.b f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f67484g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final boolean f67485h;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    Clause clause = (Clause) parcel.readParcelable(MoneyField.class.getClassLoader());
                    Clause clause2 = (Clause) parcel.readParcelable(MoneyField.class.getClassLoader());
                    Clause clause3 = (Clause) parcel.readParcelable(MoneyField.class.getClassLoader());
                    Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                    xi0.b bVar = (xi0.b) parcel.readSerializable();
                    boolean z3 = false;
                    if (parcel.readInt() != 0) {
                        z = false;
                        z3 = true;
                    } else {
                        z = false;
                    }
                    return new MoneyField(string, clause, clause2, clause3, lValueOf, bVar, z3, parcel.readInt() == 0 ? z : true);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MoneyField[i];
                }
            }

            public MoneyField(String id10, Clause label, Clause clause, Clause clause2, Long l2, xi0.b currency, boolean z, boolean z3) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(currency, "currency");
                this.f67481a = id10;
                this.f67482b = label;
                this.f67483c = clause;
                this.d = clause2;
                this.e = l2;
                this.f = currency;
                this.f67484g = z;
                this.f67485h = z3;
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm.DetailsInputField
            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getF() {
                return this.f67484g;
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm.DetailsInputField
            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getF67489g() {
                return this.f67485h;
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
                return Intrinsics.f(this.f67481a, moneyField.f67481a) && Intrinsics.f(this.f67482b, moneyField.f67482b) && Intrinsics.f(this.f67483c, moneyField.f67483c) && Intrinsics.f(this.d, moneyField.d) && Intrinsics.f(this.e, moneyField.e) && Intrinsics.f(this.f, moneyField.f) && this.f67484g == moneyField.f67484g && this.f67485h == moneyField.f67485h;
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm.DetailsInputField
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF67486a() {
                return this.f67481a;
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm.DetailsInputField
            public final Object getValue() {
                return this.e;
            }

            public final int hashCode() {
                int iA = p.a.a(this.f67481a.hashCode() * 31, 31, this.f67482b);
                Clause clause = this.f67483c;
                int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
                Clause clause2 = this.d;
                int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
                Long l2 = this.e;
                return Boolean.hashCode(this.f67485h) + j6.a.c(l.j(this.f, (iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31, 31), 31, this.f67484g);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f67481a);
                dest.writeParcelable(this.f67482b, i);
                dest.writeParcelable(this.f67483c, i);
                dest.writeParcelable(this.d, i);
                Long l2 = this.e;
                if (l2 == null) {
                    dest.writeInt(0);
                } else {
                    m72.b.A(dest, 1, l2);
                }
                dest.writeSerializable(this.f);
                dest.writeInt(this.f67484g ? 1 : 0);
                dest.writeInt(this.f67485h ? 1 : 0);
            }
        }

        private DetailsInputField() {
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean getF();

        /* JADX INFO: renamed from: b */
        public abstract boolean getF67489g();

        public final boolean c() {
            return (!getF67489g() || getF() || getValue() == null) ? false : true;
        }

        /* JADX INFO: renamed from: getId */
        public abstract String getF67486a();

        public abstract Object getValue();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DetailsInputForm$DetailsInputField$TextField;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DetailsInputForm$DetailsInputField;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TextField extends DetailsInputField<String> {

            @NotNull
            public static final Parcelable.Creator<TextField> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f67486a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Clause f67487b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Clause f67488c;
            public final Clause d;
            public final String e;
            public final boolean f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f67489g;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    Clause clause = (Clause) parcel.readParcelable(TextField.class.getClassLoader());
                    Clause clause2 = (Clause) parcel.readParcelable(TextField.class.getClassLoader());
                    Clause clause3 = (Clause) parcel.readParcelable(TextField.class.getClassLoader());
                    String string2 = parcel.readString();
                    boolean z3 = false;
                    if (parcel.readInt() != 0) {
                        z = false;
                        z3 = true;
                    } else {
                        z = false;
                    }
                    return new TextField(string, clause, clause2, clause3, string2, z3, parcel.readInt() == 0 ? z : true);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TextField[i];
                }
            }

            public TextField(String id10, Clause label, Clause clause, Clause clause2, String str, boolean z, boolean z3) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(label, "label");
                this.f67486a = id10;
                this.f67487b = label;
                this.f67488c = clause;
                this.d = clause2;
                this.e = str;
                this.f = z;
                this.f67489g = z3;
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm.DetailsInputField
            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getF() {
                return this.f;
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm.DetailsInputField
            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getF67489g() {
                return this.f67489g;
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
                return Intrinsics.f(this.f67486a, textField.f67486a) && Intrinsics.f(this.f67487b, textField.f67487b) && Intrinsics.f(this.f67488c, textField.f67488c) && Intrinsics.f(this.d, textField.d) && Intrinsics.f(this.e, textField.e) && this.f == textField.f && this.f67489g == textField.f67489g;
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm.DetailsInputField
            /* JADX INFO: renamed from: getId, reason: from getter */
            public final String getF67486a() {
                return this.f67486a;
            }

            @Override // com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm.DetailsInputField
            public final Object getValue() {
                return this.e;
            }

            public final int hashCode() {
                int iA = p.a.a(this.f67486a.hashCode() * 31, 31, this.f67487b);
                Clause clause = this.f67488c;
                int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
                Clause clause2 = this.d;
                int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
                String str = this.e;
                return Boolean.hashCode(this.f67489g) + j6.a.c((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f67486a);
                dest.writeParcelable(this.f67487b, i);
                dest.writeParcelable(this.f67488c, i);
                dest.writeParcelable(this.d, i);
                dest.writeString(this.e);
                dest.writeInt(this.f ? 1 : 0);
                dest.writeInt(this.f67489g ? 1 : 0);
            }

            public /* synthetic */ TextField(Clause clause, Clause clause2) {
                this("FIELD_ID_CREDIT_PROVIDER", clause, null, clause2, null, true, true);
            }
        }
    }
}
