package com.revolut.sso.impl.ui.email.change_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.domain.models.UserInfoAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mni.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/sso/impl/ui/email/change_flow/ChangeEmailFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CreateNewEmail", "ChooseAccountsToApplyChange", "VerifyEmail", "EvidenceRequired", "Lcom/revolut/sso/impl/ui/email/change_flow/ChangeEmailFlowContract$Step$ChooseAccountsToApplyChange;", "Lcom/revolut/sso/impl/ui/email/change_flow/ChangeEmailFlowContract$Step$CreateNewEmail;", "Lcom/revolut/sso/impl/ui/email/change_flow/ChangeEmailFlowContract$Step$EvidenceRequired;", "Lcom/revolut/sso/impl/ui/email/change_flow/ChangeEmailFlowContract$Step$VerifyEmail;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ChangeEmailFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/email/change_flow/ChangeEmailFlowContract$Step$ChooseAccountsToApplyChange;", "Lcom/revolut/sso/impl/ui/email/change_flow/ChangeEmailFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChooseAccountsToApplyChange implements ChangeEmailFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ChooseAccountsToApplyChange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f106512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f106513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f106514c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(UserInfoAccount.CREATOR, parcel, arrayList, iA, 1);
                }
                return new ChooseAccountsToApplyChange(Claim.Email.CREATOR.createFromParcel(parcel).f106127a, ((RegisteredIdentityId) parcel.readParcelable(ChooseAccountsToApplyChange.class.getClassLoader())).f74764a, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChooseAccountsToApplyChange[i];
            }
        }

        public ChooseAccountsToApplyChange(String claim, String currentAccountId, List accounts) {
            Intrinsics.checkNotNullParameter(accounts, "accounts");
            Intrinsics.checkNotNullParameter(claim, "claim");
            Intrinsics.checkNotNullParameter(currentAccountId, "currentAccountId");
            this.f106512a = accounts;
            this.f106513b = claim;
            this.f106514c = currentAccountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ChooseAccountsToApplyChange)) {
                return false;
            }
            ChooseAccountsToApplyChange chooseAccountsToApplyChange = (ChooseAccountsToApplyChange) obj2;
            return Intrinsics.f(this.f106512a, chooseAccountsToApplyChange.f106512a) && Intrinsics.f(this.f106513b, chooseAccountsToApplyChange.f106513b) && Intrinsics.f(this.f106514c, chooseAccountsToApplyChange.f106514c);
        }

        public final int hashCode() {
            return this.f106514c.hashCode() + p.a.c(this.f106512a.hashCode() * 31, 31, this.f106513b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f106512a, dest);
            while (itV.hasNext()) {
                ((UserInfoAccount) itV.next()).writeToParcel(dest, i);
            }
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106513b);
            e.x(this.f106514c, dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/email/change_flow/ChangeEmailFlowContract$Step$CreateNewEmail;", "Lcom/revolut/sso/impl/ui/email/change_flow/ChangeEmailFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateNewEmail implements ChangeEmailFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CreateNewEmail> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f106515a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateNewEmail(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateNewEmail[i];
            }
        }

        public CreateNewEmail(boolean z) {
            this.f106515a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CreateNewEmail) && this.f106515a == ((CreateNewEmail) obj2).f106515a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f106515a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f106515a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/email/change_flow/ChangeEmailFlowContract$Step$EvidenceRequired;", "Lcom/revolut/sso/impl/ui/email/change_flow/ChangeEmailFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EvidenceRequired implements ChangeEmailFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EvidenceRequired> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Challenge f106517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f106518c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String str = Claim.Email.CREATOR.createFromParcel(parcel).f106127a;
                Challenge challengeCreateFromParcel = Challenge.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(b.valueOf(parcel.readString()));
                }
                return new EvidenceRequired(str, challengeCreateFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EvidenceRequired[i];
            }
        }

        public EvidenceRequired(String claim, Challenge challenge, ArrayList availableMethods) {
            Intrinsics.checkNotNullParameter(claim, "claim");
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            Intrinsics.checkNotNullParameter(availableMethods, "availableMethods");
            this.f106516a = claim;
            this.f106517b = challenge;
            this.f106518c = availableMethods;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EvidenceRequired)) {
                return false;
            }
            EvidenceRequired evidenceRequired = (EvidenceRequired) obj2;
            return Intrinsics.f(this.f106516a, evidenceRequired.f106516a) && Intrinsics.f(this.f106517b, evidenceRequired.f106517b) && this.f106518c.equals(evidenceRequired.f106518c);
        }

        public final int hashCode() {
            return this.f106518c.hashCode() + ((this.f106517b.hashCode() + (this.f106516a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106516a);
            this.f106517b.writeToParcel(dest, i);
            Iterator itY = j6.a.y(this.f106518c, dest);
            while (itY.hasNext()) {
                dest.writeString(((b) itY.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/email/change_flow/ChangeEmailFlowContract$Step$VerifyEmail;", "Lcom/revolut/sso/impl/ui/email/change_flow/ChangeEmailFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VerifyEmail implements ChangeEmailFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<VerifyEmail> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106519a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VerifyEmail(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VerifyEmail[i];
            }
        }

        public VerifyEmail(String currentEmail) {
            Intrinsics.checkNotNullParameter(currentEmail, "currentEmail");
            this.f106519a = currentEmail;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof VerifyEmail) && Intrinsics.f(this.f106519a, ((VerifyEmail) obj2).f106519a);
        }

        public final int hashCode() {
            return this.f106519a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106519a);
        }
    }
}
