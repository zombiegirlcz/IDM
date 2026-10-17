package com.revolut.feature.bank_account_switching.impl.ui.form.domain;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/form/domain/FormFieldValue;", "Landroid/os/Parcelable;", "TextField", "DateField", "PhoneNumberField", "DropdownField", "Lcom/revolut/feature/bank_account_switching/impl/ui/form/domain/FormFieldValue$DateField;", "Lcom/revolut/feature/bank_account_switching/impl/ui/form/domain/FormFieldValue$DropdownField;", "Lcom/revolut/feature/bank_account_switching/impl/ui/form/domain/FormFieldValue$PhoneNumberField;", "Lcom/revolut/feature/bank_account_switching/impl/ui/form/domain/FormFieldValue$TextField;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FormFieldValue extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/form/domain/FormFieldValue$DateField;", "Lcom/revolut/feature/bank_account_switching/impl/ui/form/domain/FormFieldValue;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DateField implements FormFieldValue {

        @NotNull
        public static final Parcelable.Creator<DateField> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f63913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ZoneId f63914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f63915c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DateField((LocalDate) parcel.readSerializable(), (ZoneId) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DateField[i];
            }
        }

        public DateField(LocalDate selectedDate, ZoneId zoneId) {
            Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
            Intrinsics.checkNotNullParameter(zoneId, "zoneId");
            this.f63913a = selectedDate;
            this.f63914b = zoneId;
            String string = selectedDate.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            this.f63915c = string;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DateField)) {
                return false;
            }
            DateField dateField = (DateField) obj2;
            return Intrinsics.f(this.f63913a, dateField.f63913a) && Intrinsics.f(this.f63914b, dateField.f63914b);
        }

        @Override // com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormFieldValue
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF63921a() {
            return this.f63915c;
        }

        public final int hashCode() {
            return this.f63914b.hashCode() + (this.f63913a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f63913a);
            dest.writeSerializable(this.f63914b);
        }

        @Override // com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormFieldValue
        public final Clause z0() {
            return new TimeClause(oc.c.E(this.f63913a, this.f63914b), TimeClause.Format.DateLong.f57962b, null, null, 12);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/form/domain/FormFieldValue$DropdownField;", "Lcom/revolut/feature/bank_account_switching/impl/ui/form/domain/FormFieldValue;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DropdownField implements FormFieldValue {

        @NotNull
        public static final Parcelable.Creator<DropdownField> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DropdownFormField$Choice f63916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63917b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DropdownField(DropdownFormField$Choice.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DropdownField[i];
            }
        }

        public DropdownField(DropdownFormField$Choice choice) {
            Intrinsics.checkNotNullParameter(choice, "choice");
            this.f63916a = choice;
            this.f63917b = choice.f63908a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DropdownField) && Intrinsics.f(this.f63916a, ((DropdownField) obj2).f63916a);
        }

        @Override // com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormFieldValue
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF63921a() {
            return this.f63917b;
        }

        public final int hashCode() {
            return this.f63916a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f63916a.writeToParcel(dest, i);
        }

        @Override // com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormFieldValue
        public final Clause z0() {
            return new TextClause(this.f63916a.f63909b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/form/domain/FormFieldValue$PhoneNumberField;", "Lcom/revolut/feature/bank_account_switching/impl/ui/form/domain/FormFieldValue;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PhoneNumberField implements FormFieldValue {

        @NotNull
        public static final Parcelable.Creator<PhoneNumberField> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f63918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f63920c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PhoneNumberField(parcel.readString(), parcel.readString(), (wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PhoneNumberField[i];
            }
        }

        public PhoneNumberField(String prefix, String phoneNumber, wi0.b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            this.f63918a = countryCode;
            this.f63919b = prefix;
            this.f63920c = phoneNumber;
            this.d = a0.d.s("+", prefix, " ", phoneNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PhoneNumberField)) {
                return false;
            }
            PhoneNumberField phoneNumberField = (PhoneNumberField) obj2;
            return Intrinsics.f(this.f63918a, phoneNumberField.f63918a) && Intrinsics.f(this.f63919b, phoneNumberField.f63919b) && Intrinsics.f(this.f63920c, phoneNumberField.f63920c);
        }

        @Override // com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormFieldValue
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF63921a() {
            return this.d;
        }

        public final int hashCode() {
            return this.f63920c.hashCode() + p.a.c(this.f63918a.f297794a.hashCode() * 31, 31, this.f63919b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f63918a);
            dest.writeString(this.f63919b);
            dest.writeString(this.f63920c);
        }

        @Override // com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormFieldValue
        public final Clause z0() {
            return new TextClause(this.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/form/domain/FormFieldValue$TextField;", "Lcom/revolut/feature/bank_account_switching/impl/ui/form/domain/FormFieldValue;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TextField implements FormFieldValue {

        @NotNull
        public static final Parcelable.Creator<TextField> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63922b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TextField(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TextField[i];
            }
        }

        public TextField(String value, String formattedValue) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
            this.f63921a = value;
            this.f63922b = formattedValue;
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
            return Intrinsics.f(this.f63921a, textField.f63921a) && Intrinsics.f(this.f63922b, textField.f63922b);
        }

        @Override // com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormFieldValue
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF63921a() {
            return this.f63921a;
        }

        public final int hashCode() {
            return this.f63922b.hashCode() + (this.f63921a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63921a);
            dest.writeString(this.f63922b);
        }

        @Override // com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormFieldValue
        public final Clause z0() {
            return new TextClause(this.f63921a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
    }

    /* JADX INFO: renamed from: getValue */
    String getF63921a();

    Clause z0();
}
