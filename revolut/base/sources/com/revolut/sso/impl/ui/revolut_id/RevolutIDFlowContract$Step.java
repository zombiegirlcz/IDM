package com.revolut.sso.impl.ui.revolut_id;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.sso.impl.domain.models.UserInfoAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/sso/impl/ui/revolut_id/RevolutIDFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AccountDetails", "RevolutIDMain", "SignInAndPasscode", "DocumentsPrompt", "Documents", "Lcom/revolut/sso/impl/ui/revolut_id/RevolutIDFlowContract$Step$AccountDetails;", "Lcom/revolut/sso/impl/ui/revolut_id/RevolutIDFlowContract$Step$Documents;", "Lcom/revolut/sso/impl/ui/revolut_id/RevolutIDFlowContract$Step$DocumentsPrompt;", "Lcom/revolut/sso/impl/ui/revolut_id/RevolutIDFlowContract$Step$RevolutIDMain;", "Lcom/revolut/sso/impl/ui/revolut_id/RevolutIDFlowContract$Step$SignInAndPasscode;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevolutIDFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/revolut_id/RevolutIDFlowContract$Step$AccountDetails;", "Lcom/revolut/sso/impl/ui/revolut_id/RevolutIDFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountDetails extends RevolutIDFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AccountDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserInfoAccount f106700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f106701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f106702c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountDetails(UserInfoAccount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountDetails[i];
            }
        }

        public AccountDetails(UserInfoAccount account, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.f106700a = account;
            this.f106701b = z;
            this.f106702c = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccountDetails)) {
                return false;
            }
            AccountDetails accountDetails = (AccountDetails) obj2;
            return Intrinsics.f(this.f106700a, accountDetails.f106700a) && this.f106701b == accountDetails.f106701b && this.f106702c == accountDetails.f106702c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f106702c) + j6.a.c(this.f106700a.hashCode() * 31, 31, this.f106701b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f106700a.writeToParcel(dest, i);
            dest.writeInt(this.f106701b ? 1 : 0);
            dest.writeInt(this.f106702c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/revolut_id/RevolutIDFlowContract$Step$Documents;", "Lcom/revolut/sso/impl/ui/revolut_id/RevolutIDFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Documents extends RevolutIDFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Documents f106703a = new Documents();

        @NotNull
        public static final Parcelable.Creator<Documents> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Documents.f106703a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Documents[i];
            }
        }

        private Documents() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/revolut_id/RevolutIDFlowContract$Step$DocumentsPrompt;", "Lcom/revolut/sso/impl/ui/revolut_id/RevolutIDFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DocumentsPrompt extends RevolutIDFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DocumentsPrompt f106704a = new DocumentsPrompt();

        @NotNull
        public static final Parcelable.Creator<DocumentsPrompt> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DocumentsPrompt.f106704a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentsPrompt[i];
            }
        }

        private DocumentsPrompt() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/revolut_id/RevolutIDFlowContract$Step$RevolutIDMain;", "Lcom/revolut/sso/impl/ui/revolut_id/RevolutIDFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevolutIDMain extends RevolutIDFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevolutIDMain f106705a = new RevolutIDMain();

        @NotNull
        public static final Parcelable.Creator<RevolutIDMain> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevolutIDMain.f106705a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevolutIDMain[i];
            }
        }

        private RevolutIDMain() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/revolut_id/RevolutIDFlowContract$Step$SignInAndPasscode;", "Lcom/revolut/sso/impl/ui/revolut_id/RevolutIDFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SignInAndPasscode extends RevolutIDFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SignInAndPasscode f106706a = new SignInAndPasscode();

        @NotNull
        public static final Parcelable.Creator<SignInAndPasscode> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SignInAndPasscode.f106706a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SignInAndPasscode[i];
            }
        }

        private SignInAndPasscode() {
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

    private RevolutIDFlowContract$Step() {
    }
}
