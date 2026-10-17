package com.revolut.sso.impl.ui.signup;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.Claim;
import java.util.ArrayList;
import java.util.Iterator;
import jkl.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/impl/ui/signup/SignUpFlowContract$Step$Authentication$SignUpMode$EvidenceRequired", "", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SignUpFlowContract$Step$Authentication$SignUpMode$EvidenceRequired implements SignUpFlowContract$Step {

    @NotNull
    public static final Parcelable.Creator<SignUpFlowContract$Step$Authentication$SignUpMode$EvidenceRequired> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Claim f106761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Challenge f106762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f106763c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Claim claim = (Claim) j6.a.f(parcel, "parcel", SignUpFlowContract$Step$Authentication$SignUpMode$EvidenceRequired.class);
            Challenge challengeCreateFromParcel = Challenge.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(i.valueOf(parcel.readString()));
            }
            return new SignUpFlowContract$Step$Authentication$SignUpMode$EvidenceRequired(claim, challengeCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SignUpFlowContract$Step$Authentication$SignUpMode$EvidenceRequired[i];
        }
    }

    public SignUpFlowContract$Step$Authentication$SignUpMode$EvidenceRequired(Claim claim, Challenge challenge, ArrayList availableMethods) {
        Intrinsics.checkNotNullParameter(claim, "claim");
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        Intrinsics.checkNotNullParameter(availableMethods, "availableMethods");
        this.f106761a = claim;
        this.f106762b = challenge;
        this.f106763c = availableMethods;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SignUpFlowContract$Step$Authentication$SignUpMode$EvidenceRequired)) {
            return false;
        }
        SignUpFlowContract$Step$Authentication$SignUpMode$EvidenceRequired signUpFlowContract$Step$Authentication$SignUpMode$EvidenceRequired = (SignUpFlowContract$Step$Authentication$SignUpMode$EvidenceRequired) obj2;
        return Intrinsics.f(this.f106761a, signUpFlowContract$Step$Authentication$SignUpMode$EvidenceRequired.f106761a) && Intrinsics.f(this.f106762b, signUpFlowContract$Step$Authentication$SignUpMode$EvidenceRequired.f106762b) && this.f106763c.equals(signUpFlowContract$Step$Authentication$SignUpMode$EvidenceRequired.f106763c);
    }

    public final int hashCode() {
        return this.f106763c.hashCode() + ((this.f106762b.hashCode() + (this.f106761a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f106761a, i);
        this.f106762b.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.f106763c, dest);
        while (itY.hasNext()) {
            dest.writeString(((i) itY.next()).name());
        }
    }
}
