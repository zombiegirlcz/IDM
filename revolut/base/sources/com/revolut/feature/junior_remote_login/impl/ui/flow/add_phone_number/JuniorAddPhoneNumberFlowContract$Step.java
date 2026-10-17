package com.revolut.feature.junior_remote_login.impl.ui.flow.add_phone_number;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/junior_remote_login/impl/ui/flow/add_phone_number/JuniorAddPhoneNumberFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ContactPicker", "AddPhoneNumber", "Lcom/revolut/feature/junior_remote_login/impl/ui/flow/add_phone_number/JuniorAddPhoneNumberFlowContract$Step$AddPhoneNumber;", "Lcom/revolut/feature/junior_remote_login/impl/ui/flow/add_phone_number/JuniorAddPhoneNumberFlowContract$Step$ContactPicker;", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JuniorAddPhoneNumberFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_remote_login/impl/ui/flow/add_phone_number/JuniorAddPhoneNumberFlowContract$Step$AddPhoneNumber;", "Lcom/revolut/feature/junior_remote_login/impl/ui/flow/add_phone_number/JuniorAddPhoneNumberFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddPhoneNumber extends JuniorAddPhoneNumberFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddPhoneNumber> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f77175b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddPhoneNumber(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddPhoneNumber[i];
            }
        }

        public AddPhoneNumber(String firstName, String country) {
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            Intrinsics.checkNotNullParameter(country, "country");
            this.f77174a = firstName;
            this.f77175b = country;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddPhoneNumber)) {
                return false;
            }
            AddPhoneNumber addPhoneNumber = (AddPhoneNumber) obj2;
            return Intrinsics.f(this.f77174a, addPhoneNumber.f77174a) && Intrinsics.f(this.f77175b, addPhoneNumber.f77175b);
        }

        public final int hashCode() {
            return this.f77175b.hashCode() + (this.f77174a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77174a);
            dest.writeString(this.f77175b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_remote_login/impl/ui/flow/add_phone_number/JuniorAddPhoneNumberFlowContract$Step$ContactPicker;", "Lcom/revolut/feature/junior_remote_login/impl/ui/flow/add_phone_number/JuniorAddPhoneNumberFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ContactPicker extends JuniorAddPhoneNumberFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ContactPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f77177b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ContactPicker(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ContactPicker[i];
            }
        }

        public ContactPicker(String firstName, String lastName) {
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            Intrinsics.checkNotNullParameter(lastName, "lastName");
            this.f77176a = firstName;
            this.f77177b = lastName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ContactPicker)) {
                return false;
            }
            ContactPicker contactPicker = (ContactPicker) obj2;
            return Intrinsics.f(this.f77176a, contactPicker.f77176a) && Intrinsics.f(this.f77177b, contactPicker.f77177b);
        }

        public final int hashCode() {
            return this.f77177b.hashCode() + (this.f77176a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77176a);
            dest.writeString(this.f77177b);
        }
    }

    private JuniorAddPhoneNumberFlowContract$Step() {
    }
}
