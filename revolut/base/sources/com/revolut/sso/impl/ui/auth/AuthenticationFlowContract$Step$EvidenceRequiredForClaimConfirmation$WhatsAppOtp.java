package com.revolut.sso.impl.ui.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.Claim;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$WhatsAppOtp", "", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AuthenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$WhatsAppOtp implements AuthenticationFlowContract$Step {

    @NotNull
    public static final Parcelable.Creator<AuthenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$WhatsAppOtp> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Challenge f106338b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AuthenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$WhatsAppOtp(Claim.Phone.CREATOR.createFromParcel(parcel).f106131a, Challenge.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AuthenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$WhatsAppOtp[i];
        }
    }

    public AuthenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$WhatsAppOtp(String claim, Challenge challenge) {
        Intrinsics.checkNotNullParameter(claim, "claim");
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        this.f106337a = claim;
        this.f106338b = challenge;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AuthenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$WhatsAppOtp)) {
            return false;
        }
        AuthenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$WhatsAppOtp authenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$WhatsAppOtp = (AuthenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$WhatsAppOtp) obj2;
        return Intrinsics.f(this.f106337a, authenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$WhatsAppOtp.f106337a) && Intrinsics.f(this.f106338b, authenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$WhatsAppOtp.f106338b);
    }

    public final int hashCode() {
        return this.f106338b.hashCode() + (this.f106337a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Claim.Phone.a(this.f106337a, dest);
        this.f106338b.writeToParcel(dest, i);
    }
}
