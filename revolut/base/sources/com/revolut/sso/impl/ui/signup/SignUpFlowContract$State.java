package com.revolut.sso.impl.ui.signup;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.sso.api.login.RevolutSsoApi$SignUpOutputData$Authenticated$Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/impl/ui/signup/SignUpFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SignUpFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<SignUpFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevolutSsoApi$SignUpOutputData$Authenticated$Method f106755b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SignUpFlowContract$State(parcel.readString(), (RevolutSsoApi$SignUpOutputData$Authenticated$Method) parcel.readParcelable(SignUpFlowContract$State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SignUpFlowContract$State[i];
        }
    }

    public SignUpFlowContract$State(String codeChallenge, RevolutSsoApi$SignUpOutputData$Authenticated$Method revolutSsoApi$SignUpOutputData$Authenticated$Method) {
        Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
        this.f106754a = codeChallenge;
        this.f106755b = revolutSsoApi$SignUpOutputData$Authenticated$Method;
    }

    public static SignUpFlowContract$State a(SignUpFlowContract$State signUpFlowContract$State, String codeChallenge, RevolutSsoApi$SignUpOutputData$Authenticated$Method revolutSsoApi$SignUpOutputData$Authenticated$Method, int i) {
        if ((i & 1) != 0) {
            codeChallenge = signUpFlowContract$State.f106754a;
        }
        if ((i & 2) != 0) {
            revolutSsoApi$SignUpOutputData$Authenticated$Method = signUpFlowContract$State.f106755b;
        }
        signUpFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
        return new SignUpFlowContract$State(codeChallenge, revolutSsoApi$SignUpOutputData$Authenticated$Method);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SignUpFlowContract$State)) {
            return false;
        }
        SignUpFlowContract$State signUpFlowContract$State = (SignUpFlowContract$State) obj2;
        return Intrinsics.f(this.f106754a, signUpFlowContract$State.f106754a) && Intrinsics.f(this.f106755b, signUpFlowContract$State.f106755b);
    }

    public final int hashCode() {
        int iHashCode = this.f106754a.hashCode() * 31;
        RevolutSsoApi$SignUpOutputData$Authenticated$Method revolutSsoApi$SignUpOutputData$Authenticated$Method = this.f106755b;
        return iHashCode + (revolutSsoApi$SignUpOutputData$Authenticated$Method == null ? 0 : revolutSsoApi$SignUpOutputData$Authenticated$Method.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106754a);
        dest.writeParcelable(this.f106755b, i);
    }
}
