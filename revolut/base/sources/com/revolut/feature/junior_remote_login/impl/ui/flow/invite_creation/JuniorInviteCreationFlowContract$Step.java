package com.revolut.feature.junior_remote_login.impl.ui.flow.invite_creation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/junior_remote_login/impl/ui/flow/invite_creation/JuniorInviteCreationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "InviteCreation", "CreatePhoneNumber", "QrCodeScanner", "Lcom/revolut/feature/junior_remote_login/impl/ui/flow/invite_creation/JuniorInviteCreationFlowContract$Step$CreatePhoneNumber;", "Lcom/revolut/feature/junior_remote_login/impl/ui/flow/invite_creation/JuniorInviteCreationFlowContract$Step$InviteCreation;", "Lcom/revolut/feature/junior_remote_login/impl/ui/flow/invite_creation/JuniorInviteCreationFlowContract$Step$QrCodeScanner;", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JuniorInviteCreationFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_remote_login/impl/ui/flow/invite_creation/JuniorInviteCreationFlowContract$Step$CreatePhoneNumber;", "Lcom/revolut/feature/junior_remote_login/impl/ui/flow/invite_creation/JuniorInviteCreationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreatePhoneNumber extends JuniorInviteCreationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CreatePhoneNumber> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JuniorBankingProfile f77187a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreatePhoneNumber((JuniorBankingProfile) parcel.readParcelable(CreatePhoneNumber.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreatePhoneNumber[i];
            }
        }

        public CreatePhoneNumber(JuniorBankingProfile juniorProfile) {
            Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
            this.f77187a = juniorProfile;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CreatePhoneNumber) && Intrinsics.f(this.f77187a, ((CreatePhoneNumber) obj2).f77187a);
        }

        public final int hashCode() {
            return this.f77187a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77187a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_remote_login/impl/ui/flow/invite_creation/JuniorInviteCreationFlowContract$Step$InviteCreation;", "Lcom/revolut/feature/junior_remote_login/impl/ui/flow/invite_creation/JuniorInviteCreationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InviteCreation extends JuniorInviteCreationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InviteCreation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f77189b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InviteCreation(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InviteCreation[i];
            }
        }

        public InviteCreation(String juniorId, String firstName) {
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            this.f77188a = juniorId;
            this.f77189b = firstName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InviteCreation)) {
                return false;
            }
            InviteCreation inviteCreation = (InviteCreation) obj2;
            return Intrinsics.f(this.f77188a, inviteCreation.f77188a) && Intrinsics.f(this.f77189b, inviteCreation.f77189b);
        }

        public final int hashCode() {
            return this.f77189b.hashCode() + (this.f77188a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77188a);
            dest.writeString(this.f77189b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_remote_login/impl/ui/flow/invite_creation/JuniorInviteCreationFlowContract$Step$QrCodeScanner;", "Lcom/revolut/feature/junior_remote_login/impl/ui/flow/invite_creation/JuniorInviteCreationFlowContract$Step;", "<init>", "()V", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class QrCodeScanner extends JuniorInviteCreationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final QrCodeScanner f77190a = new QrCodeScanner();

        @NotNull
        public static final Parcelable.Creator<QrCodeScanner> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return QrCodeScanner.f77190a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QrCodeScanner[i];
            }
        }

        private QrCodeScanner() {
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

    private JuniorInviteCreationFlowContract$Step() {
    }
}
