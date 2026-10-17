package com.revolut.feature.contacts.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/contacts/api/navigation/ContactsFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "AddContact", "Lcom/revolut/feature/contacts/api/navigation/ContactsFeatureConfig$AddContact;", "retail_feature_contacts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ContactsFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/contacts/api/navigation/ContactsFeatureConfig$AddContact;", "Lcom/revolut/feature/contacts/api/navigation/ContactsFeatureConfig;", "<init>", "()V", "ByPhone", "ByPhoneOrEmail", "com/revolut/feature/contacts/api/navigation/a", "Lcom/revolut/feature/contacts/api/navigation/ContactsFeatureConfig$AddContact$ByPhone;", "Lcom/revolut/feature/contacts/api/navigation/ContactsFeatureConfig$AddContact$ByPhoneOrEmail;", "retail_feature_contacts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class AddContact extends ContactsFeatureConfig {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts/api/navigation/ContactsFeatureConfig$AddContact$ByPhone;", "Lcom/revolut/feature/contacts/api/navigation/ContactsFeatureConfig$AddContact;", "", "toString", "()Ljava/lang/String;", "retail_feature_contacts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ByPhone extends AddContact {

            @NotNull
            public static final Parcelable.Creator<ByPhone> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.revolut.feature.contacts.api.navigation.a f65986a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f65987b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ByPhone(com.revolut.feature.contacts.api.navigation.a.valueOf(parcel.readString()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ByPhone[i];
                }
            }

            public ByPhone(com.revolut.feature.contacts.api.navigation.a finishMode, String str) {
                Intrinsics.checkNotNullParameter(finishMode, "finishMode");
                this.f65986a = finishMode;
                this.f65987b = str;
            }

            @Override // com.revolut.feature.contacts.api.navigation.ContactsFeatureConfig.AddContact
            /* JADX INFO: renamed from: a, reason: from getter */
            public final com.revolut.feature.contacts.api.navigation.a getF65988a() {
                return this.f65986a;
            }

            @Override // com.revolut.feature.contacts.api.navigation.ContactsFeatureConfig.AddContact
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF65989b() {
                return this.f65987b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ByPhone)) {
                    return false;
                }
                ByPhone byPhone = (ByPhone) obj2;
                return this.f65986a == byPhone.f65986a && Intrinsics.f(this.f65987b, byPhone.f65987b);
            }

            public final int hashCode() {
                int iHashCode = this.f65986a.hashCode() * 31;
                String str = this.f65987b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f65986a.name());
                dest.writeString(this.f65987b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/contacts/api/navigation/ContactsFeatureConfig$AddContact$ByPhoneOrEmail;", "Lcom/revolut/feature/contacts/api/navigation/ContactsFeatureConfig$AddContact;", "", "toString", "()Ljava/lang/String;", "retail_feature_contacts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ByPhoneOrEmail extends AddContact {

            @NotNull
            public static final Parcelable.Creator<ByPhoneOrEmail> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.revolut.feature.contacts.api.navigation.a f65988a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f65989b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ByPhoneOrEmail(com.revolut.feature.contacts.api.navigation.a.valueOf(parcel.readString()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ByPhoneOrEmail[i];
                }
            }

            public ByPhoneOrEmail(com.revolut.feature.contacts.api.navigation.a finishMode, String str) {
                Intrinsics.checkNotNullParameter(finishMode, "finishMode");
                this.f65988a = finishMode;
                this.f65989b = str;
            }

            @Override // com.revolut.feature.contacts.api.navigation.ContactsFeatureConfig.AddContact
            /* JADX INFO: renamed from: a, reason: from getter */
            public final com.revolut.feature.contacts.api.navigation.a getF65988a() {
                return this.f65988a;
            }

            @Override // com.revolut.feature.contacts.api.navigation.ContactsFeatureConfig.AddContact
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF65989b() {
                return this.f65989b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ByPhoneOrEmail)) {
                    return false;
                }
                ByPhoneOrEmail byPhoneOrEmail = (ByPhoneOrEmail) obj2;
                return this.f65988a == byPhoneOrEmail.f65988a && Intrinsics.f(this.f65989b, byPhoneOrEmail.f65989b);
            }

            public final int hashCode() {
                int iHashCode = this.f65988a.hashCode() * 31;
                String str = this.f65989b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f65988a.name());
                dest.writeString(this.f65989b);
            }
        }

        private AddContact() {
        }

        /* JADX INFO: renamed from: a */
        public abstract a getF65988a();

        /* JADX INFO: renamed from: b */
        public abstract String getF65989b();
    }

    private ContactsFeatureConfig() {
    }
}
