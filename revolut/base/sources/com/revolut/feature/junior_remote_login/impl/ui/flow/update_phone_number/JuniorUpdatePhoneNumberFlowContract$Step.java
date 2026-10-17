package com.revolut.feature.junior_remote_login.impl.ui.flow.update_phone_number;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/junior_remote_login/impl/ui/flow/update_phone_number/JuniorUpdatePhoneNumberFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AddPhoneNumber", "InvitationSuccessPrompt", "Lcom/revolut/feature/junior_remote_login/impl/ui/flow/update_phone_number/JuniorUpdatePhoneNumberFlowContract$Step$AddPhoneNumber;", "Lcom/revolut/feature/junior_remote_login/impl/ui/flow/update_phone_number/JuniorUpdatePhoneNumberFlowContract$Step$InvitationSuccessPrompt;", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JuniorUpdatePhoneNumberFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_remote_login/impl/ui/flow/update_phone_number/JuniorUpdatePhoneNumberFlowContract$Step$AddPhoneNumber;", "Lcom/revolut/feature/junior_remote_login/impl/ui/flow/update_phone_number/JuniorUpdatePhoneNumberFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddPhoneNumber extends JuniorUpdatePhoneNumberFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddPhoneNumber> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JuniorBankingProfile f77192a;

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
            this.f77192a = juniorProfile;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddPhoneNumber) && Intrinsics.f(this.f77192a, ((AddPhoneNumber) obj2).f77192a);
        }

        public final int hashCode() {
            return this.f77192a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77192a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_remote_login/impl/ui/flow/update_phone_number/JuniorUpdatePhoneNumberFlowContract$Step$InvitationSuccessPrompt;", "Lcom/revolut/feature/junior_remote_login/impl/ui/flow/update_phone_number/JuniorUpdatePhoneNumberFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvitationSuccessPrompt extends JuniorUpdatePhoneNumberFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InvitationSuccessPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f77194b;

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
            this.f77193a = firstName;
            this.f77194b = phoneNumber;
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
            return Intrinsics.f(this.f77193a, invitationSuccessPrompt.f77193a) && Intrinsics.f(this.f77194b, invitationSuccessPrompt.f77194b);
        }

        public final int hashCode() {
            return this.f77194b.hashCode() + (this.f77193a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77193a);
            dest.writeString(this.f77194b);
        }
    }

    private JuniorUpdatePhoneNumberFlowContract$Step() {
    }
}
