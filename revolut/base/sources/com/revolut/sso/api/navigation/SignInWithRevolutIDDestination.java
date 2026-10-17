package com.revolut.sso.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/sso/api/navigation/SignInWithRevolutIDDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "", "toString", "()Ljava/lang/String;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SignInWithRevolutIDDestination extends InternalDestination<IOData$EmptyInput> {

    @NotNull
    public static final Parcelable.Creator<SignInWithRevolutIDDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f106012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f106013c;
    public final String d;
    public final String e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SignInWithRevolutIDDestination(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SignInWithRevolutIDDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignInWithRevolutIDDestination(String clientId, String scope, String codeChallenge, String redirectUri, String state) {
        super(IOData$EmptyInput.f98299a);
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f106012b = clientId;
        this.f106013c = scope;
        this.d = codeChallenge;
        this.e = redirectUri;
        this.f = state;
    }

    /* JADX INFO: renamed from: D8, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF106012b() {
        return this.f106012b;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getE() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getF106013c() {
        return this.f106013c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SignInWithRevolutIDDestination)) {
            return false;
        }
        SignInWithRevolutIDDestination signInWithRevolutIDDestination = (SignInWithRevolutIDDestination) obj2;
        return Intrinsics.f(this.f106012b, signInWithRevolutIDDestination.f106012b) && Intrinsics.f(this.f106013c, signInWithRevolutIDDestination.f106013c) && Intrinsics.f(this.d, signInWithRevolutIDDestination.d) && Intrinsics.f(this.e, signInWithRevolutIDDestination.e) && Intrinsics.f(this.f, signInWithRevolutIDDestination.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(this.f106012b.hashCode() * 31, 31, this.f106013c), 31, this.d), 31, this.e);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getF() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106012b);
        dest.writeString(this.f106013c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
    }
}
