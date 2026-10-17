package com.revolut.feature.junior_remote_login.impl.ui.flow.create_phone_number;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/junior_remote_login/impl/ui/flow/create_phone_number/JuniorCreatePhoneNumberFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AddPhoneNumber", "InvitationSuccessPrompt", "Lcom/revolut/feature/junior_remote_login/impl/ui/flow/create_phone_number/JuniorCreatePhoneNumberFlowContract$Step$AddPhoneNumber;", "Lcom/revolut/feature/junior_remote_login/impl/ui/flow/create_phone_number/JuniorCreatePhoneNumberFlowContract$Step$InvitationSuccessPrompt;", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JuniorCreatePhoneNumberFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_remote_login/impl/ui/flow/create_phone_number/JuniorCreatePhoneNumberFlowContract$Step$AddPhoneNumber;", "Lcom/revolut/feature/junior_remote_login/impl/ui/flow/create_phone_number/JuniorCreatePhoneNumberFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddPhoneNumber extends JuniorCreatePhoneNumberFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddPhoneNumber> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JuniorBankingProfile f77178a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddPhoneNumber((JuniorBankingProfile) parcel.readParcelable(AddPhoneNumber.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddPhoneNumber[i];
            }
        }

        public AddPhoneNumber(JuniorBankingProfile juniorProfile) {
            Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
            this.f77178a = juniorProfile;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddPhoneNumber) && Intrinsics.f(this.f77178a, ((AddPhoneNumber) obj2).f77178a);
        }

        public final int hashCode() {
            return this.f77178a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77178a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_remote_login/impl/ui/flow/create_phone_number/JuniorCreatePhoneNumberFlowContract$Step$InvitationSuccessPrompt;", "Lcom/revolut/feature/junior_remote_login/impl/ui/flow/create_phone_number/JuniorCreatePhoneNumberFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvitationSuccessPrompt extends JuniorCreatePhoneNumberFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InvitationSuccessPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f77180b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvitationSuccessPrompt(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvitationSuccessPrompt[i];
            }
        }

        public InvitationSuccessPrompt(String firstName, String phoneNumber) {
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            this.f77179a = firstName;
            this.f77180b = phoneNumber;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InvitationSuccessPrompt)) {
                return false;
            }
            InvitationSuccessPrompt invitationSuccessPrompt = (InvitationSuccessPrompt) obj2;
            return Intrinsics.f(this.f77179a, invitationSuccessPrompt.f77179a) && Intrinsics.f(this.f77180b, invitationSuccessPrompt.f77180b);
        }

        public final int hashCode() {
            return this.f77180b.hashCode() + (this.f77179a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77179a);
            dest.writeString(this.f77180b);
        }
    }

    private JuniorCreatePhoneNumberFlowContract$Step() {
    }
}
