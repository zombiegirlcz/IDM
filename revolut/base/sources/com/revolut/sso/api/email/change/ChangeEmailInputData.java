package com.revolut.sso.api.email.change;

import android.os.Parcel;
import android.os.Parcelable;
import cjl.o;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.sso.api.models.SsoChangeClaimMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/api/email/change/ChangeEmailInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChangeEmailInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ChangeEmailInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f105828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevolutSsoChangeEmailDeeplinkData f105830c;
    public final SsoChangeClaimMode d;
    public final boolean e;
    public final o f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z4 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
                z3 = true;
            } else {
                z = false;
                z3 = true;
            }
            String string = parcel.readString();
            RevolutSsoChangeEmailDeeplinkData revolutSsoChangeEmailDeeplinkDataCreateFromParcel = parcel.readInt() == 0 ? null : RevolutSsoChangeEmailDeeplinkData.CREATOR.createFromParcel(parcel);
            SsoChangeClaimMode ssoChangeClaimMode = (SsoChangeClaimMode) parcel.readParcelable(ChangeEmailInputData.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z = z3;
            }
            return new ChangeEmailInputData(z4, string, revolutSsoChangeEmailDeeplinkDataCreateFromParcel, ssoChangeClaimMode, z, o.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChangeEmailInputData[i];
        }
    }

    public ChangeEmailInputData() {
        this(null, null, null, null, 63);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF105828a() {
        return this.f105828a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final RevolutSsoChangeEmailDeeplinkData getF105830c() {
        return this.f105830c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final SsoChangeClaimMode getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final o getF() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChangeEmailInputData)) {
            return false;
        }
        ChangeEmailInputData changeEmailInputData = (ChangeEmailInputData) obj2;
        return this.f105828a == changeEmailInputData.f105828a && Intrinsics.f(this.f105829b, changeEmailInputData.f105829b) && Intrinsics.f(this.f105830c, changeEmailInputData.f105830c) && Intrinsics.f(this.d, changeEmailInputData.d) && this.e == changeEmailInputData.e && this.f == changeEmailInputData.f;
    }

    public final int hashCode() {
        int iC = p.a.c(Boolean.hashCode(this.f105828a) * 31, 31, this.f105829b);
        RevolutSsoChangeEmailDeeplinkData revolutSsoChangeEmailDeeplinkData = this.f105830c;
        return this.f.hashCode() + j6.a.c((this.d.hashCode() + ((iC + (revolutSsoChangeEmailDeeplinkData == null ? 0 : revolutSsoChangeEmailDeeplinkData.hashCode())) * 31)) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f105828a ? 1 : 0);
        dest.writeString(this.f105829b);
        RevolutSsoChangeEmailDeeplinkData revolutSsoChangeEmailDeeplinkData = this.f105830c;
        if (revolutSsoChangeEmailDeeplinkData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            revolutSsoChangeEmailDeeplinkData.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeString(this.f.name());
    }

    public ChangeEmailInputData(boolean z, String clientId, RevolutSsoChangeEmailDeeplinkData revolutSsoChangeEmailDeeplinkData, SsoChangeClaimMode mode, boolean z3, o successNotificationType) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(successNotificationType, "successNotificationType");
        this.f105828a = z;
        this.f105829b = clientId;
        this.f105830c = revolutSsoChangeEmailDeeplinkData;
        this.d = mode;
        this.e = z3;
        this.f = successNotificationType;
    }

    public /* synthetic */ ChangeEmailInputData(String str, RevolutSsoChangeEmailDeeplinkData revolutSsoChangeEmailDeeplinkData, SsoChangeClaimMode ssoChangeClaimMode, o oVar, int i) {
        this(false, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : revolutSsoChangeEmailDeeplinkData, (i & 8) != 0 ? SsoChangeClaimMode.Current.f105982a : ssoChangeClaimMode, false, (i & 32) != 0 ? o.SHOT : oVar);
    }
}
