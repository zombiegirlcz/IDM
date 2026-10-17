package com.revolut.sso.impl.ui.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.sso.impl.domain.models.Challenge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$BiometricVerificationPreparedChallenge", "", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$BiometricVerificationPreparedChallenge implements AuthenticationFlowContract$Step {

    @NotNull
    public static final Parcelable.Creator<AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$BiometricVerificationPreparedChallenge> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Challenge f106319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pu.a f106320b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$BiometricVerificationPreparedChallenge(Challenge.CREATOR.createFromParcel(parcel), (pu.a) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$BiometricVerificationPreparedChallenge[i];
        }
    }

    public AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$BiometricVerificationPreparedChallenge(Challenge challenge, pu.a aVar) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        this.f106319a = challenge;
        this.f106320b = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$BiometricVerificationPreparedChallenge)) {
            return false;
        }
        AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$BiometricVerificationPreparedChallenge authenticationFlowContract$Step$EvidenceRequiredForAuthentication$BiometricVerificationPreparedChallenge = (AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$BiometricVerificationPreparedChallenge) obj2;
        return Intrinsics.f(this.f106319a, authenticationFlowContract$Step$EvidenceRequiredForAuthentication$BiometricVerificationPreparedChallenge.f106319a) && Intrinsics.f(this.f106320b, authenticationFlowContract$Step$EvidenceRequiredForAuthentication$BiometricVerificationPreparedChallenge.f106320b);
    }

    public final int hashCode() {
        int iHashCode = this.f106319a.hashCode() * 31;
        pu.a aVar = this.f106320b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f106319a.writeToParcel(dest, i);
        dest.writeSerializable(this.f106320b);
    }
}
