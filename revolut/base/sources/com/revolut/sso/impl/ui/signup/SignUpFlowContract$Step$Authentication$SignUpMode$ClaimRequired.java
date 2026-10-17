package com.revolut.sso.impl.ui.signup;

import android.os.Parcel;
import android.os.Parcelable;
import gkl.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/impl/ui/signup/SignUpFlowContract$Step$Authentication$SignUpMode$ClaimRequired", "", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SignUpFlowContract$Step$Authentication$SignUpMode$ClaimRequired implements SignUpFlowContract$Step {

    @NotNull
    public static final Parcelable.Creator<SignUpFlowContract$Step$Authentication$SignUpMode$ClaimRequired> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f106760a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SignUpFlowContract$Step$Authentication$SignUpMode$ClaimRequired(m.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SignUpFlowContract$Step$Authentication$SignUpMode$ClaimRequired[i];
        }
    }

    public SignUpFlowContract$Step$Authentication$SignUpMode$ClaimRequired(m claimName) {
        Intrinsics.checkNotNullParameter(claimName, "claimName");
        this.f106760a = claimName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SignUpFlowContract$Step$Authentication$SignUpMode$ClaimRequired) && this.f106760a == ((SignUpFlowContract$Step$Authentication$SignUpMode$ClaimRequired) obj2).f106760a;
    }

    public final int hashCode() {
        return this.f106760a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106760a.name());
    }
}
