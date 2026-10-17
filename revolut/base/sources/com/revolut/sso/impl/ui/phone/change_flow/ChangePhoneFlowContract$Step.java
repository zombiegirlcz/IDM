package com.revolut.sso.impl.ui.phone.change_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.domain.models.UserInfoAccount;
import com.revolut.sso.impl.ui.phone.enter_phone.EnterPhoneScreenContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/sso/impl/ui/phone/change_flow/ChangePhoneFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CreateNewPhone", "ChooseAccountsToApplyChange", "EvidenceRequired", "Lcom/revolut/sso/impl/ui/phone/change_flow/ChangePhoneFlowContract$Step$ChooseAccountsToApplyChange;", "Lcom/revolut/sso/impl/ui/phone/change_flow/ChangePhoneFlowContract$Step$CreateNewPhone;", "Lcom/revolut/sso/impl/ui/phone/change_flow/ChangePhoneFlowContract$Step$EvidenceRequired;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ChangePhoneFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/phone/change_flow/ChangePhoneFlowContract$Step$ChooseAccountsToApplyChange;", "Lcom/revolut/sso/impl/ui/phone/change_flow/ChangePhoneFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChooseAccountsToApplyChange implements ChangePhoneFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ChooseAccountsToApplyChange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f106646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f106647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f106648c;

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
                return new ChooseAccountsToApplyChange(Claim.Phone.CREATOR.createFromParcel(parcel).f106131a, ((RegisteredIdentityId) parcel.readParcelable(ChooseAccountsToApplyChange.class.getClassLoader())).f74764a, arrayList);
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
            this.f106646a = accounts;
            this.f106647b = claim;
            this.f106648c = currentAccountId;
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
            return Intrinsics.f(this.f106646a, chooseAccountsToApplyChange.f106646a) && Intrinsics.f(this.f106647b, chooseAccountsToApplyChange.f106647b) && Intrinsics.f(this.f106648c, chooseAccountsToApplyChange.f106648c);
        }

        public final int hashCode() {
            return this.f106648c.hashCode() + p.a.c(this.f106646a.hashCode() * 31, 31, this.f106647b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f106646a, dest);
            while (itV.hasNext()) {
                ((UserInfoAccount) itV.next()).writeToParcel(dest, i);
            }
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106647b);
            e.x(this.f106648c, dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/phone/change_flow/ChangePhoneFlowContract$Step$CreateNewPhone;", "Lcom/revolut/sso/impl/ui/phone/change_flow/ChangePhoneFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateNewPhone implements ChangePhoneFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CreateNewPhone> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f106649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EnterPhoneScreenContract$InputData.Mode.Create.PhoneData f106650b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateNewPhone(parcel.readInt() != 0, (EnterPhoneScreenContract$InputData.Mode.Create.PhoneData) parcel.readParcelable(CreateNewPhone.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateNewPhone[i];
            }
        }

        public CreateNewPhone(boolean z, EnterPhoneScreenContract$InputData.Mode.Create.PhoneData phoneData) {
            this.f106649a = z;
            this.f106650b = phoneData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreateNewPhone)) {
                return false;
            }
            CreateNewPhone createNewPhone = (CreateNewPhone) obj2;
            return this.f106649a == createNewPhone.f106649a && Intrinsics.f(this.f106650b, createNewPhone.f106650b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f106649a) * 31;
            EnterPhoneScreenContract$InputData.Mode.Create.PhoneData phoneData = this.f106650b;
            return iHashCode + (phoneData == null ? 0 : phoneData.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f106649a ? 1 : 0);
            dest.writeParcelable(this.f106650b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/phone/change_flow/ChangePhoneFlowContract$Step$EvidenceRequired;", "Lcom/revolut/sso/impl/ui/phone/change_flow/ChangePhoneFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EvidenceRequired implements ChangePhoneFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EvidenceRequired> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Challenge f106652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f106653c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String str = Claim.Phone.CREATOR.createFromParcel(parcel).f106131a;
                Challenge challengeCreateFromParcel = Challenge.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(mni.b.valueOf(parcel.readString()));
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
            this.f106651a = claim;
            this.f106652b = challenge;
            this.f106653c = availableMethods;
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
            return Intrinsics.f(this.f106651a, evidenceRequired.f106651a) && Intrinsics.f(this.f106652b, evidenceRequired.f106652b) && this.f106653c.equals(evidenceRequired.f106653c);
        }

        public final int hashCode() {
            return this.f106653c.hashCode() + ((this.f106652b.hashCode() + (this.f106651a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Claim.Phone.a(this.f106651a, dest);
            this.f106652b.writeToParcel(dest, i);
            Iterator itY = j6.a.y(this.f106653c, dest);
            while (itY.hasNext()) {
                dest.writeString(((mni.b) itY.next()).name());
            }
        }
    }
}
