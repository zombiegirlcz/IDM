package com.revolut.sso.api.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/api/login/RevolutSsoApi$SignUpInputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutSsoApi$SignUpInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevolutSsoApi$SignUpInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutSsoApi$DefaultIdentifier f105871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f105872b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutSsoApi$SignUpInputData((RevolutSsoApi$DefaultIdentifier) parcel.readParcelable(RevolutSsoApi$SignUpInputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutSsoApi$SignUpInputData[i];
        }
    }

    public RevolutSsoApi$SignUpInputData() {
        this((RevolutSsoApi$DefaultIdentifier) null, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutSsoApi$SignUpInputData)) {
            return false;
        }
        RevolutSsoApi$SignUpInputData revolutSsoApi$SignUpInputData = (RevolutSsoApi$SignUpInputData) obj2;
        return Intrinsics.f(this.f105871a, revolutSsoApi$SignUpInputData.f105871a) && this.f105872b == revolutSsoApi$SignUpInputData.f105872b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f105872b) + (this.f105871a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f105871a, i);
        dest.writeInt(this.f105872b ? 1 : 0);
    }

    public RevolutSsoApi$SignUpInputData(RevolutSsoApi$DefaultIdentifier defaultIdentifier, boolean z) {
        Intrinsics.checkNotNullParameter(defaultIdentifier, "defaultIdentifier");
        this.f105871a = defaultIdentifier;
        this.f105872b = z;
    }

    public /* synthetic */ RevolutSsoApi$SignUpInputData(RevolutSsoApi$DefaultIdentifier revolutSsoApi$DefaultIdentifier, int i) {
        this((i & 1) != 0 ? RevolutSsoApi$DefaultIdentifier.Preferred.Phone : revolutSsoApi$DefaultIdentifier, false);
    }
}
