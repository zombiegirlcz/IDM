package com.revolut.sso.impl.ui.combined_authentication.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier;
import com.revolut.sso.api.models.RevolutAccountSession;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.Claim;
import ehe.n;
import gkl.m;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jkl.a3;
import jkl.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"com/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "UnifiedAuthentication", "ExistingAccountsChooser", "SingleVideoTwoButtons", "OpenSignUp", "LostAccount", "OpenSignIn", "EvidenceRequired", "ClaimRequired", "CollectClaimBeforeChat", "AuthRejected", "UaePass", "Social", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$AuthRejected;", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$ClaimRequired;", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$CollectClaimBeforeChat;", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$EvidenceRequired;", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$ExistingAccountsChooser;", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$LostAccount;", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$OpenSignIn;", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$OpenSignUp;", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$SingleVideoTwoButtons;", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$Social;", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$UaePass;", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$UnifiedAuthentication;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CombinedAuthenticationFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$AuthRejected;", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AuthRejected implements CombinedAuthenticationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AuthRejected> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Claim f106408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ZonedDateTime f106409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f106410c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Claim claim = (Claim) j6.a.f(parcel, "parcel", AuthRejected.class);
                ZonedDateTime zonedDateTime = (ZonedDateTime) parcel.readSerializable();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(a3.valueOf(parcel.readString()));
                }
                return new AuthRejected(claim, zonedDateTime, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AuthRejected[i];
            }
        }

        public AuthRejected(Claim claim, ZonedDateTime zonedDateTime, Set actions) {
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.f106408a = claim;
            this.f106409b = zonedDateTime;
            this.f106410c = actions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AuthRejected)) {
                return false;
            }
            AuthRejected authRejected = (AuthRejected) obj2;
            return Intrinsics.f(this.f106408a, authRejected.f106408a) && Intrinsics.f(this.f106409b, authRejected.f106409b) && Intrinsics.f(this.f106410c, authRejected.f106410c);
        }

        public final int hashCode() {
            Claim claim = this.f106408a;
            int iHashCode = (claim == null ? 0 : claim.hashCode()) * 31;
            ZonedDateTime zonedDateTime = this.f106409b;
            return this.f106410c.hashCode() + ((iHashCode + (zonedDateTime != null ? zonedDateTime.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106408a, i);
            dest.writeSerializable(this.f106409b);
            Iterator itV = n.v(this.f106410c, dest);
            while (itV.hasNext()) {
                dest.writeString(((a3) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$ClaimRequired;", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ClaimRequired implements CombinedAuthenticationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ClaimRequired> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f106411a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ClaimRequired(m.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClaimRequired[i];
            }
        }

        public ClaimRequired(m claimName) {
            Intrinsics.checkNotNullParameter(claimName, "claimName");
            this.f106411a = claimName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ClaimRequired) && this.f106411a == ((ClaimRequired) obj2).f106411a;
        }

        public final int hashCode() {
            return this.f106411a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106411a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$CollectClaimBeforeChat;", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CollectClaimBeforeChat implements CombinedAuthenticationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CollectClaimBeforeChat f106412a = new CollectClaimBeforeChat();

        @NotNull
        public static final Parcelable.Creator<CollectClaimBeforeChat> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CollectClaimBeforeChat.f106412a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CollectClaimBeforeChat[i];
            }
        }

        private CollectClaimBeforeChat() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$EvidenceRequired;", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EvidenceRequired implements CombinedAuthenticationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EvidenceRequired> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Claim f106413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Challenge f106414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f106415c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Claim claim = (Claim) j6.a.f(parcel, "parcel", EvidenceRequired.class);
                Challenge challengeCreateFromParcel = Challenge.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(i.valueOf(parcel.readString()));
                }
                return new EvidenceRequired(claim, challengeCreateFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EvidenceRequired[i];
            }
        }

        public EvidenceRequired(Claim claim, Challenge challenge, List availableMethods) {
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            Intrinsics.checkNotNullParameter(availableMethods, "availableMethods");
            this.f106413a = claim;
            this.f106414b = challenge;
            this.f106415c = availableMethods;
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
            return Intrinsics.f(this.f106413a, evidenceRequired.f106413a) && Intrinsics.f(this.f106414b, evidenceRequired.f106414b) && Intrinsics.f(this.f106415c, evidenceRequired.f106415c);
        }

        public final int hashCode() {
            Claim claim = this.f106413a;
            return this.f106415c.hashCode() + ((this.f106414b.hashCode() + ((claim == null ? 0 : claim.hashCode()) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106413a, i);
            this.f106414b.writeToParcel(dest, i);
            Iterator itV = p.a.v(this.f106415c, dest);
            while (itV.hasNext()) {
                dest.writeString(((i) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$ExistingAccountsChooser;", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ExistingAccountsChooser implements CombinedAuthenticationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExistingAccountsChooser f106416a = new ExistingAccountsChooser();

        @NotNull
        public static final Parcelable.Creator<ExistingAccountsChooser> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ExistingAccountsChooser.f106416a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExistingAccountsChooser[i];
            }
        }

        private ExistingAccountsChooser() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$LostAccount;", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LostAccount implements CombinedAuthenticationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LostAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevolutSsoApi$DefaultIdentifier f106417a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LostAccount((RevolutSsoApi$DefaultIdentifier) parcel.readParcelable(LostAccount.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LostAccount[i];
            }
        }

        public LostAccount(RevolutSsoApi$DefaultIdentifier identifier) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.f106417a = identifier;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LostAccount) && Intrinsics.f(this.f106417a, ((LostAccount) obj2).f106417a);
        }

        public final int hashCode() {
            return this.f106417a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106417a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$OpenSignIn;", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenSignIn implements CombinedAuthenticationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OpenSignIn> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevolutAccountSession f106418a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenSignIn((RevolutAccountSession) parcel.readParcelable(OpenSignIn.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenSignIn[i];
            }
        }

        public OpenSignIn(RevolutAccountSession revolutAccountSession) {
            this.f106418a = revolutAccountSession;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenSignIn) && Intrinsics.f(this.f106418a, ((OpenSignIn) obj2).f106418a);
        }

        public final int hashCode() {
            RevolutAccountSession revolutAccountSession = this.f106418a;
            if (revolutAccountSession == null) {
                return 0;
            }
            return revolutAccountSession.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106418a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$OpenSignUp;", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OpenSignUp implements CombinedAuthenticationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OpenSignUp f106419a = new OpenSignUp();

        @NotNull
        public static final Parcelable.Creator<OpenSignUp> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OpenSignUp.f106419a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenSignUp[i];
            }
        }

        private OpenSignUp() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$SingleVideoTwoButtons;", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SingleVideoTwoButtons implements CombinedAuthenticationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SingleVideoTwoButtons f106420a = new SingleVideoTwoButtons();

        @NotNull
        public static final Parcelable.Creator<SingleVideoTwoButtons> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SingleVideoTwoButtons.f106420a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SingleVideoTwoButtons[i];
            }
        }

        private SingleVideoTwoButtons() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$Social;", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Social implements CombinedAuthenticationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Social f106421a = new Social();

        @NotNull
        public static final Parcelable.Creator<Social> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Social.f106421a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Social[i];
            }
        }

        private Social() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$UaePass;", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UaePass implements CombinedAuthenticationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UaePass> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f106423b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UaePass(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UaePass[i];
            }
        }

        public UaePass(String authorizationUrl, String callbackUrl) {
            Intrinsics.checkNotNullParameter(authorizationUrl, "authorizationUrl");
            Intrinsics.checkNotNullParameter(callbackUrl, "callbackUrl");
            this.f106422a = authorizationUrl;
            this.f106423b = callbackUrl;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UaePass)) {
                return false;
            }
            UaePass uaePass = (UaePass) obj2;
            return Intrinsics.f(this.f106422a, uaePass.f106422a) && Intrinsics.f(this.f106423b, uaePass.f106423b);
        }

        public final int hashCode() {
            return this.f106423b.hashCode() + (this.f106422a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f106422a);
            dest.writeString(this.f106423b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step$UnifiedAuthentication;", "Lcom/revolut/sso/impl/ui/combined_authentication/flow/CombinedAuthenticationFlowContract$Step;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnifiedAuthentication implements CombinedAuthenticationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnifiedAuthentication f106424a = new UnifiedAuthentication();

        @NotNull
        public static final Parcelable.Creator<UnifiedAuthentication> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UnifiedAuthentication.f106424a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnifiedAuthentication[i];
            }
        }

        private UnifiedAuthentication() {
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
