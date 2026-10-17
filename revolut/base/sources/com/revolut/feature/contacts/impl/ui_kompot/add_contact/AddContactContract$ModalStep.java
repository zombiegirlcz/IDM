package com.revolut.feature.contacts.impl.ui_kompot.add_contact;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/contacts/impl/ui_kompot/add_contact/AddContactContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ShowCountryCodePicker", "ContactsPermissions", "Lcom/revolut/feature/contacts/impl/ui_kompot/add_contact/AddContactContract$ModalStep$ContactsPermissions;", "Lcom/revolut/feature/contacts/impl/ui_kompot/add_contact/AddContactContract$ModalStep$ShowCountryCodePicker;", "retail_feature_contacts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AddContactContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/contacts/impl/ui_kompot/add_contact/AddContactContract$ModalStep$ContactsPermissions;", "Lcom/revolut/feature/contacts/impl/ui_kompot/add_contact/AddContactContract$ModalStep;", "<init>", "()V", "retail_feature_contacts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ContactsPermissions implements AddContactContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ContactsPermissions f66017a = new ContactsPermissions();

        @NotNull
        public static final Parcelable.Creator<ContactsPermissions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ContactsPermissions.f66017a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ContactsPermissions[i];
            }
        }

        private ContactsPermissions() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/contacts/impl/ui_kompot/add_contact/AddContactContract$ModalStep$ShowCountryCodePicker;", "Lcom/revolut/feature/contacts/impl/ui_kompot/add_contact/AddContactContract$ModalStep;", "<init>", "()V", "retail_feature_contacts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowCountryCodePicker implements AddContactContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowCountryCodePicker f66018a = new ShowCountryCodePicker();

        @NotNull
        public static final Parcelable.Creator<ShowCountryCodePicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowCountryCodePicker.f66018a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowCountryCodePicker[i];
            }
        }

        private ShowCountryCodePicker() {
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
}
