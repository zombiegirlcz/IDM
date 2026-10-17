package com.revolut.feature.contacts_chooser.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/models/ContactsFilter;", "Landroid/os/Parcelable;", "Companion", "a", "Phone", "Country", "Code", "Contact", "And", "Or", "Not", "Lcom/revolut/feature/contacts_chooser/api/models/ContactsFilter$And;", "Lcom/revolut/feature/contacts_chooser/api/models/ContactsFilter$Code;", "Lcom/revolut/feature/contacts_chooser/api/models/ContactsFilter$Contact;", "Lcom/revolut/feature/contacts_chooser/api/models/ContactsFilter$Country;", "Lcom/revolut/feature/contacts_chooser/api/models/ContactsFilter$Not;", "Lcom/revolut/feature/contacts_chooser/api/models/ContactsFilter$Or;", "Lcom/revolut/feature/contacts_chooser/api/models/ContactsFilter$Phone;", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ContactsFilter extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f66034a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/models/ContactsFilter$And;", "Lcom/revolut/feature/contacts_chooser/api/models/ContactsFilter;", "", "toString", "()Ljava/lang/String;", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class And implements ContactsFilter {

        @NotNull
        public static final Parcelable.Creator<And> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f66027a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(And.class, parcel, arrayList, iE, 1);
                }
                return new And(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new And[i];
            }
        }

        public And(List filters) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            this.f66027a = filters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof And) && Intrinsics.f(this.f66027a, ((And) obj2).f66027a);
        }

        public final int hashCode() {
            return this.f66027a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f66027a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/models/ContactsFilter$Code;", "Lcom/revolut/feature/contacts_chooser/api/models/ContactsFilter;", "", "toString", "()Ljava/lang/String;", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Code implements ContactsFilter {

        @NotNull
        public static final Parcelable.Creator<Code> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66028a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Code(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Code[i];
            }
        }

        public Code(String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.f66028a = code;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Code) && Intrinsics.f(this.f66028a, ((Code) obj2).f66028a);
        }

        public final int hashCode() {
            return this.f66028a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66028a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/models/ContactsFilter$Contact;", "Lcom/revolut/feature/contacts_chooser/api/models/ContactsFilter;", "", "toString", "()Ljava/lang/String;", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Contact implements ContactsFilter {

        @NotNull
        public static final Parcelable.Creator<Contact> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zm3.a f66029a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Contact((zm3.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Contact[i];
            }
        }

        public Contact(zm3.a contact) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            this.f66029a = contact;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Contact) && Intrinsics.f(this.f66029a, ((Contact) obj2).f66029a);
        }

        public final int hashCode() {
            return this.f66029a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f66029a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/models/ContactsFilter$Country;", "Lcom/revolut/feature/contacts_chooser/api/models/ContactsFilter;", "", "toString", "()Ljava/lang/String;", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Country implements ContactsFilter {

        @NotNull
        public static final Parcelable.Creator<Country> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f66030a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Country((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Country[i];
            }
        }

        public Country(b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f66030a = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Country) && Intrinsics.f(this.f66030a, ((Country) obj2).f66030a);
        }

        public final int hashCode() {
            return this.f66030a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f66030a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/models/ContactsFilter$Not;", "Lcom/revolut/feature/contacts_chooser/api/models/ContactsFilter;", "", "toString", "()Ljava/lang/String;", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Not implements ContactsFilter {

        @NotNull
        public static final Parcelable.Creator<Not> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContactsFilter f66031a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Not((ContactsFilter) parcel.readParcelable(Not.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Not[i];
            }
        }

        public Not(ContactsFilter filter) {
            Intrinsics.checkNotNullParameter(filter, "filter");
            this.f66031a = filter;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Not) && Intrinsics.f(this.f66031a, ((Not) obj2).f66031a);
        }

        public final int hashCode() {
            return this.f66031a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66031a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/models/ContactsFilter$Or;", "Lcom/revolut/feature/contacts_chooser/api/models/ContactsFilter;", "", "toString", "()Ljava/lang/String;", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Or implements ContactsFilter {

        @NotNull
        public static final Parcelable.Creator<Or> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f66032a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Or.class, parcel, arrayList, iE, 1);
                }
                return new Or(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Or[i];
            }
        }

        public Or(List filters) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            this.f66032a = filters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Or) && Intrinsics.f(this.f66032a, ((Or) obj2).f66032a);
        }

        public final int hashCode() {
            return this.f66032a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f66032a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts_chooser/api/models/ContactsFilter$Phone;", "Lcom/revolut/feature/contacts_chooser/api/models/ContactsFilter;", "", "toString", "()Ljava/lang/String;", "feature_contacts_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Phone implements ContactsFilter {

        @NotNull
        public static final Parcelable.Creator<Phone> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66033a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Phone(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Phone[i];
            }
        }

        public Phone(String phone) {
            Intrinsics.checkNotNullParameter(phone, "phone");
            this.f66033a = phone;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Phone) && Intrinsics.f(this.f66033a, ((Phone) obj2).f66033a);
        }

        public final int hashCode() {
            return this.f66033a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f66033a);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.contacts_chooser.api.models.ContactsFilter$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f66034a = new Companion();

        private Companion() {
        }

        public static Not a(ContactsFilter... filters) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            ContactsFilter[] filters2 = (ContactsFilter[]) Arrays.copyOf(filters, filters.length);
            Intrinsics.checkNotNullParameter(filters2, "filters");
            Or or10 = new Or(v.k(Arrays.copyOf(filters2, filters2.length)));
            Intrinsics.checkNotNullParameter(or10, "<this>");
            return new Not(or10);
        }
    }
}
