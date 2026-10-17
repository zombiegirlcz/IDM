package com.revolut.sso.impl.ui.signin_with_revolut_id;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/impl/ui/signin_with_revolut_id/SignInWithRevolutIdFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SignInWithRevolutIdFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SignInWithRevolutIdFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f106751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f106752c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SignInWithRevolutIdFlowContract$InputData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SignInWithRevolutIdFlowContract$InputData[i];
        }
    }

    public SignInWithRevolutIdFlowContract$InputData(String clientId, String scope, String codeChallenge, String redirectUri, String state) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f106750a = clientId;
        this.f106751b = scope;
        this.f106752c = codeChallenge;
        this.d = redirectUri;
        this.e = state;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SignInWithRevolutIdFlowContract$InputData)) {
            return false;
        }
        SignInWithRevolutIdFlowContract$InputData signInWithRevolutIdFlowContract$InputData = (SignInWithRevolutIdFlowContract$InputData) obj2;
        return Intrinsics.f(this.f106750a, signInWithRevolutIdFlowContract$InputData.f106750a) && Intrinsics.f(this.f106751b, signInWithRevolutIdFlowContract$InputData.f106751b) && Intrinsics.f(this.f106752c, signInWithRevolutIdFlowContract$InputData.f106752c) && Intrinsics.f(this.d, signInWithRevolutIdFlowContract$InputData.d) && Intrinsics.f(this.e, signInWithRevolutIdFlowContract$InputData.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f106750a.hashCode() * 31, 31, this.f106751b), 31, this.f106752c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106750a);
        dest.writeString(this.f106751b);
        dest.writeString(this.f106752c);
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
