package com.revolut.sso.impl.ui.auth;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/sso/impl/ui/auth/AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$CardPIN", "", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$CardPIN implements AuthenticationFlowContract$Step {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$CardPIN f106322a = new AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$CardPIN();

    @NotNull
    public static final Parcelable.Creator<AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$CardPIN> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$CardPIN.f106322a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$CardPIN[i];
        }
    }

    private AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$CardPIN() {
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
