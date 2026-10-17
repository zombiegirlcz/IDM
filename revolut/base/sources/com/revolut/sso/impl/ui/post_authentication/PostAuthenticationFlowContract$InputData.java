package com.revolut.sso.impl.ui.post_authentication;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.sso.impl.domain.models.AuthResult;
import com.revolut.sso.impl.domain.models.Claim;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/impl/ui/post_authentication/PostAuthenticationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PostAuthenticationFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PostAuthenticationFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Claim f106678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AuthResult.Success f106679b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PostAuthenticationFlowContract$InputData((Claim) parcel.readParcelable(PostAuthenticationFlowContract$InputData.class.getClassLoader()), AuthResult.Success.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PostAuthenticationFlowContract$InputData[i];
        }
    }

    public PostAuthenticationFlowContract$InputData(Claim claim, AuthResult.Success authResult) {
        Intrinsics.checkNotNullParameter(authResult, "authResult");
        this.f106678a = claim;
        this.f106679b = authResult;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PostAuthenticationFlowContract$InputData)) {
            return false;
        }
        PostAuthenticationFlowContract$InputData postAuthenticationFlowContract$InputData = (PostAuthenticationFlowContract$InputData) obj2;
        return Intrinsics.f(this.f106678a, postAuthenticationFlowContract$InputData.f106678a) && Intrinsics.f(this.f106679b, postAuthenticationFlowContract$InputData.f106679b);
    }

    public final int hashCode() {
        Claim claim = this.f106678a;
        return this.f106679b.hashCode() + ((claim == null ? 0 : claim.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f106678a, i);
        this.f106679b.writeToParcel(dest, i);
    }
}
