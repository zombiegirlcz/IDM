package com.revolut.feature.contacts.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import el3.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/contacts/api/navigation/AddContactInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "el3/b", "InputMode", "Prefill", "retail_feature_contacts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddContactInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AddContactInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputMode f65972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f65973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f65974c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/contacts/api/navigation/AddContactInputData$InputMode;", "Landroid/os/Parcelable;", "Phone", "Full", "Lcom/revolut/feature/contacts/api/navigation/AddContactInputData$InputMode$Full;", "Lcom/revolut/feature/contacts/api/navigation/AddContactInputData$InputMode$Phone;", "retail_feature_contacts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InputMode extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts/api/navigation/AddContactInputData$InputMode$Full;", "Lcom/revolut/feature/contacts/api/navigation/AddContactInputData$InputMode;", "", "toString", "()Ljava/lang/String;", "retail_feature_contacts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Full implements InputMode {

            @NotNull
            public static final Parcelable.Creator<Full> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Prefill f65975a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Full((Prefill) parcel.readParcelable(Full.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Full[i];
                }
            }

            public Full() {
                this(0);
            }

            @Override // com.revolut.feature.contacts.api.navigation.AddContactInputData.InputMode
            /* JADX INFO: renamed from: a4, reason: from getter */
            public final Prefill getF65975a() {
                return this.f65975a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Full) && Intrinsics.f(this.f65975a, ((Full) obj2).f65975a);
            }

            public final int hashCode() {
                return this.f65975a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f65975a, i);
            }

            public Full(Prefill prefill) {
                Intrinsics.checkNotNullParameter(prefill, "prefill");
                this.f65975a = prefill;
            }

            public /* synthetic */ Full(int i) {
                this(Prefill.None.f65978a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts/api/navigation/AddContactInputData$InputMode$Phone;", "Lcom/revolut/feature/contacts/api/navigation/AddContactInputData$InputMode;", "", "toString", "()Ljava/lang/String;", "retail_feature_contacts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Phone implements InputMode {

            @NotNull
            public static final Parcelable.Creator<Phone> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Prefill.PhoneOrNone f65976a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Phone((Prefill.PhoneOrNone) parcel.readParcelable(Phone.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Phone[i];
                }
            }

            public Phone() {
                this(0);
            }

            @Override // com.revolut.feature.contacts.api.navigation.AddContactInputData.InputMode
            /* JADX INFO: renamed from: a4 */
            public final Prefill getF65975a() {
                return this.f65976a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Phone) && Intrinsics.f(this.f65976a, ((Phone) obj2).f65976a);
            }

            public final int hashCode() {
                return this.f65976a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f65976a, i);
            }

            public Phone(Prefill.PhoneOrNone prefill) {
                Intrinsics.checkNotNullParameter(prefill, "prefill");
                this.f65976a = prefill;
            }

            public /* synthetic */ Phone(int i) {
                this(Prefill.None.f65978a);
            }
        }

        /* JADX INFO: renamed from: a4 */
        Prefill getF65975a();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/contacts/api/navigation/AddContactInputData$Prefill;", "Landroid/os/Parcelable;", "PhoneOrNone", "None", "Phone", "Email", "Lcom/revolut/feature/contacts/api/navigation/AddContactInputData$Prefill$Email;", "Lcom/revolut/feature/contacts/api/navigation/AddContactInputData$Prefill$PhoneOrNone;", "retail_feature_contacts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Prefill extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts/api/navigation/AddContactInputData$Prefill$Email;", "Lcom/revolut/feature/contacts/api/navigation/AddContactInputData$Prefill;", "", "toString", "()Ljava/lang/String;", "retail_feature_contacts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Email implements Prefill {

            @NotNull
            public static final Parcelable.Creator<Email> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f65977a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Email(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Email[i];
                }
            }

            public Email(String email) {
                Intrinsics.checkNotNullParameter(email, "email");
                this.f65977a = email;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Email) && Intrinsics.f(this.f65977a, ((Email) obj2).f65977a);
            }

            public final int hashCode() {
                return this.f65977a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f65977a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/contacts/api/navigation/AddContactInputData$Prefill$None;", "Lcom/revolut/feature/contacts/api/navigation/AddContactInputData$Prefill$PhoneOrNone;", "<init>", "()V", "retail_feature_contacts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class None implements PhoneOrNone {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final None f65978a = new None();

            @NotNull
            public static final Parcelable.Creator<None> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return None.f65978a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new None[i];
                }
            }

            private None() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts/api/navigation/AddContactInputData$Prefill$Phone;", "Lcom/revolut/feature/contacts/api/navigation/AddContactInputData$Prefill$PhoneOrNone;", "", "toString", "()Ljava/lang/String;", "retail_feature_contacts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Phone implements PhoneOrNone {

            @NotNull
            public static final Parcelable.Creator<Phone> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f65979a;

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
                this.f65979a = phone;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Phone) && Intrinsics.f(this.f65979a, ((Phone) obj2).f65979a);
            }

            public final int hashCode() {
                return this.f65979a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f65979a);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/contacts/api/navigation/AddContactInputData$Prefill$PhoneOrNone;", "Lcom/revolut/feature/contacts/api/navigation/AddContactInputData$Prefill;", "Lcom/revolut/feature/contacts/api/navigation/AddContactInputData$Prefill$None;", "Lcom/revolut/feature/contacts/api/navigation/AddContactInputData$Prefill$Phone;", "retail_feature_contacts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface PhoneOrNone extends Prefill {
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AddContactInputData((InputMode) parcel.readParcelable(AddContactInputData.class.getClassLoader()), b.valueOf(parcel.readString()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddContactInputData[i];
        }
    }

    public AddContactInputData(InputMode inputMode, b finishMode, int i) {
        Intrinsics.checkNotNullParameter(inputMode, "inputMode");
        Intrinsics.checkNotNullParameter(finishMode, "finishMode");
        this.f65972a = inputMode;
        this.f65973b = finishMode;
        this.f65974c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddContactInputData)) {
            return false;
        }
        AddContactInputData addContactInputData = (AddContactInputData) obj2;
        return Intrinsics.f(this.f65972a, addContactInputData.f65972a) && this.f65973b == addContactInputData.f65973b && this.f65974c == addContactInputData.f65974c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f65974c) + ((this.f65973b.hashCode() + (this.f65972a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f65972a, i);
        dest.writeString(this.f65973b.name());
        dest.writeInt(this.f65974c);
    }
}
